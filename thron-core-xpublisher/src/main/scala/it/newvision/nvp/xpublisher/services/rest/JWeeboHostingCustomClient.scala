package it.newvision.nvp.xpublisher.services.rest

import javax.ws.rs.core.MediaType

import com.sun.jersey.multipart.{FormDataBodyPart, FormDataMultiPart}
import it.newvision.nvp.xpublisher.services.model.hosting.MResponseHostingFile

object JWeeboHostingCustomClient {
  import it.newvision.nvp.core.libraries.restclient.ClientJersey
  protected val client= ClientJersey.getClient

  def setConnectionTimeOut( n : Integer) {
    client.setConnectTimeout(n)
  }
}

class JWeeboHostingCustomClient(val resourceEndpoint:String) {
  /*
    @POST
    @Path("uploadFile")
    @Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
    @Consumes(Array(MediaType.MULTIPART_FORM_DATA))
    def uploadFile(@FormDataParam("clientId") clientId: String,
			@FormDataParam("tokenId") tokenId: String,
			@FormDataParam("fileName") fileName: String,
			@FormDataParam("destinationFolder") destinationFolder: String,
			@FormDataParam("fileSource") fileSource: java.io.InputStream,
			@FormDataParam("fileSource") cd: com.sun.jersey.core.header.FormDataContentDisposition):Response /*returnType = MResponseHostingFile*/

   */
  def uploadFile(clientId: String,
                 tokenId: String,
                 fileName: String,
                 destinationFolder: String,
                 fileSource: java.io.InputStream)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseHostingFile ={


    try{
      val webResource = JWeeboHostingCustomClient.client.resource(this.resourceEndpoint)

      val optBpFileSource: Option[FormDataBodyPart] = Option(fileSource).map({fs =>
        new FormDataBodyPart("fileSource", fs, MediaType.APPLICATION_OCTET_STREAM_TYPE)
      })

      val multiPart = new FormDataMultiPart().field("tokenId", tokenId)
      Option(clientId) foreach { multiPart.field("clientId", _)}
      Option(fileName) foreach { multiPart.field("fileName", _)}
      Option(destinationFolder) foreach { multiPart.field("destinationFolder", _)}

      optBpFileSource foreach { multiPart.bodyPart(_) }

      val response : MResponseHostingFile = if(this.resourceEndpoint == ""){
        new MResponseHostingFile
      } else {
        var wbuilder = webResource
          .path("weebohosting/uploadFile")
          .accept(MediaType.APPLICATION_XML)
          .`type`(MediaType.MULTIPART_FORM_DATA)
          .header("X-TOKENID",tokenId)
          _fwdHeaders.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)})
        wbuilder.post(classOf[MResponseHostingFile], multiPart)
      }
      response
    } catch {
      case e : com.sun.jersey.api.client.UniformInterfaceException =>
        val response = e.getResponse
        if(response.getStatus == 418) {
          response.getEntity(classOf[MResponseHostingFile])
        }
        else {
          throw e
        }
    }
  }
}
