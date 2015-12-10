package it.newvision.nvp.core.libraries.restserver

import java.util.regex.Pattern
import javax.ws.rs.core.{Response, CacheControl}
import org.apache.commons.io.FilenameUtils
import org.apache.commons.lang.StringUtils
import com.sun.jersey.api.json.JSONWithPadding
import org.codehaus.jackson.map.DeserializationConfig
import org.codehaus.jackson.map.ObjectMapper


object PRestHelper {
  val capabilityID = "X-SERVICE-CAPABILITY" // attenzione dovuto impostare valore hardcode anche in WebapplicationException.java
  val fuzzyHostnameID = "X-ORIGIN-HOST"
  var fuzzyHostname:String = "" //utilizzato e aggiornato dal booter solo per ritornare l'informazione indicativa della macchina che sta eseguendo il servizio.
  val contentDispositionQueryparam = "response-content-disposition"

  // validazioni su nomi funzioni per jsonp
  private def callbacknameIsValid(input:String):Boolean=
    Option(input).forall(x=> Pattern.compile("""^[$A-Z_.][0-9A-Z_$.]*$""",Pattern.CASE_INSENSITIVE).matcher(x).matches())

  private def jacksonRead[T <: AnyRef](jsonObj: String)(implicit mt: scala.reflect.ClassTag[T]): T = {
    val jacksonMapper = new ObjectMapper
    jacksonMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    jacksonMapper.readValue(jsonObj, mt.runtimeClass).asInstanceOf[T]
  }

  def responseForGET(resp: AnyRef, cacheControl: CacheControl, jsonp_callbak: String,capability:String=""): Response = {
    val rb = getResponseBuilder(resp, jsonp_callbak)
    .header("Vary","Accept-Encoding,Accept,X-TOKENID")  //FOR CACHING MECHANISM ON PROXY
    if(StringUtils.isNotBlank(capability))rb.header(capabilityID,capability)
    if(StringUtils.isNotBlank(fuzzyHostname))rb.header(fuzzyHostnameID,fuzzyHostname)
    if(StringUtils.isNotBlank(jsonp_callbak)){
      rb.`type`("application/x-javascript")
      rb.header("charset","utf-8")
    }
    rb.cacheControl(cacheControl).build

  }
  def responseAsException(resp: Response, cacheControl: CacheControl, jsonp_callbak: String,capability:String=""): Response = {
    val rb = getResponseBuilder(resp.getEntity, jsonp_callbak)
    rb.header("X-ERRORCODE",resp.getStatus)
    if(StringUtils.isNotBlank(capability))rb.header(capabilityID,capability)
    if(StringUtils.isNotBlank(fuzzyHostname))rb.header(fuzzyHostnameID,fuzzyHostname)
    if(StringUtils.isNotBlank(jsonp_callbak)){
      if(resp.getStatus == 502) rb.status(resp.getStatus)
      rb.`type`("application/x-javascript")
      rb.header("charset","utf-8")
    }
    rb.cacheControl(cacheControl).build

  }
  def responseAsExceptionFromObj(resp: AnyRef, xErrorCode: Int, cacheControl: CacheControl, jsonp_callbak: String,capability:String=""): Response = {
    val rb = getResponseBuilder(resp, jsonp_callbak)
    rb.header("X-ERRORCODE",xErrorCode)
    if(StringUtils.isNotBlank(capability))rb.header(capabilityID,capability)
    if(StringUtils.isNotBlank(fuzzyHostname))rb.header(fuzzyHostnameID,fuzzyHostname)
    if(StringUtils.isNotBlank(jsonp_callbak)){
      if(resp.isInstanceOf[Response]) {
        val respAsResponse = resp.asInstanceOf[Response]
        if (respAsResponse.getStatus == 502) rb.status(respAsResponse.getStatus)
      }
      rb.`type`("application/x-javascript")
      rb.header("charset","utf-8")
    }
    rb.cacheControl(cacheControl).build

  }
  def responseForPOST(resp: AnyRef, cacheControl: CacheControl,capability:String=""): Response = {
    val rb = getResponseBuilder(resp)
    if(StringUtils.isNotBlank(capability))rb.header(capabilityID,capability)
    if(StringUtils.isNotBlank(fuzzyHostname))rb.header(fuzzyHostnameID,fuzzyHostname)
    rb.cacheControl(cacheControl).build
  }

  def bindRequest[T <: AnyRef](jsonObj: String, defaultObjIfException: Option[T] = None)(implicit mt: scala.reflect.ClassTag[T]): T = {
    val req = StringUtils.defaultIfEmpty(jsonObj, "{}")
    try {
      jacksonRead[T](req)
    } catch {
      case e: Exception =>
        defaultObjIfException.getOrElse(mt.runtimeClass.newInstance().asInstanceOf[T])
    }
  }

  private def getResponseBuilder(resp: AnyRef, jsonp_callbak: String = ""): Response.ResponseBuilder = {
    if (StringUtils.isNotBlank(jsonp_callbak)) {
      // Build for JSONP
      val jsonSource = if (resp.isInstanceOf[String])
        // Wrap response in an additional pair of quotes or else JSONP callback will be in the form of callback(value of the response) instead of callback("value of the response")
        """"%s"""".format(resp)
      else
        resp
      if(callbacknameIsValid(jsonp_callbak)){
        Response.ok(new JSONWithPadding(jsonSource, jsonp_callbak))
      } else {
        Response.ok("callback name is NOT valid!")
      }
    } else {
      // Build normal response
      Response.ok(resp)
    }
  }

  def getTokenId(tokenId_q: String, tokenId_h: String): String = StringUtils.defaultIfEmpty(tokenId_h, tokenId_q)

  def getContentDisposition(fileName:String,saveAs:String)={
    if(StringUtils.isEmpty(saveAs)){
      String.format("attachment; filename=\"%s\"", fileName)
    }else{
      val ext = FilenameUtils.getExtension(fileName)
      val fn = "%s.%s".format(FilenameUtils.removeExtension(saveAs),ext)
      String.format("attachment; filename=\"%s\"", fn)
    }
  }

  def appendContentDispositionQueryparam(url: String): String = {
    {if(url.contains("?")) {url+"&%s"} else {url+"?%s"}}.format(s"$contentDispositionQueryparam=attachment")
  }

}
