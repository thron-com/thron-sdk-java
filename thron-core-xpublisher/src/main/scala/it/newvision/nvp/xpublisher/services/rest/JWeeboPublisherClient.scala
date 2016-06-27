package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.response.MResponseGetContent
import it.newvision.nvp.xpublisher.services.model.response.MResponseGetQuota
import it.newvision.nvp.xpublisher.services.model.response.MResponseGetQuotaUsage
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublishergetQuotaUsageByUserIdReq
import it.newvision.nvp.xpublisher.services.model.response.MResponseFindContentsByMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JWeeboPublisherClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * The Weebo web service provide the functions to get the content descriptor and
 * public web urls. The contents published in Weebo can be delivered using
 * different channels (WEB, STREAM, IPHONE..)
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/xpublisher/resources/weebopublisher/ </li>
 * </ul>
 */
class JWeeboPublisherClient(val resourceEndpoint:String) {

	/**
	 * like getContent service but implemented as post http service. Use the optimised and cached
	 * getContent for better performance.
	 * Only for 3x version
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param channelType : String
	 * @param clientIPv4 : String
	 * ip address of the client, used for the geo blocking. Optional
	 * @param clientIPv6 : String
	 * @param userAgent : String
	 * @return MResponseGetContent
	*/
	def contentDetail(tokenId: String, 
			clientId: String, 
			contentId: String, 
			channelType: String, 
			clientIPv4: String, 
			clientIPv6: String, 
			userAgent: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(channelType).foreach(s => params.add("channelType", s))
		Option(clientIPv4).foreach(s => params.add("clientIPv4", s))
		Option(clientIPv6).foreach(s => params.add("clientIPv6", s))
		Option(userAgent).foreach(s => params.add("userAgent", s))  
			val response : MResponseGetContent = if(this.resourceEndpoint == ""){
			
				new MResponseGetContent()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("weebopublisher/contentDetail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseGetContent],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetContent])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * return the content information for the selected channel type., like published url or smil/m3u8 urls
	 * or other descriptors for the selected channel type.
	 * If the channelType is not defined, the service return the right descriptor for the giver useragent.
	 * 
	 * useragent = mobile/desktop
	 * 
	 * Only for 3x version
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param channelType : String
	 * @param userAgent : String
	 * Possible values are:
	 * iphone
	 * ipad
	 * phone7
	 * android (for mobile device using flash)
	 * silverlight
	 * generic (for web devices using flash)
	 * @param dt : String
	 * DeliveryToken.
	 * Used to validate the service invocation.
	 * @return MResponseGetContent
	*/
	def getContent(tokenId: String, 
			clientId: String, 
			contentId: String, 
			channelType: String, 
			userAgent: String, 
			dt: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(channelType).foreach(s => params.add("channelType", s))
		Option(userAgent).foreach(s => params.add("userAgent", s))
		Option(dt).foreach(s => params.add("dt", s))
			val response : MResponseGetContent = if(this.resourceEndpoint == ""){
			
				new MResponseGetContent()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("weebopublisher/getContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetContent])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetContent])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Return the specific descriptor for the content. (only the content descriptor to use with a player).
	 * The webservice has two endpoint. The http://<clientId>-view.4me.
	 * it/api/xpublisher/resources/weebopublisher/getContentDescriptor.m3u8 endpoint is used for the
	 * mobile devices (iphone/android)
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: has two endpoint. http://<clientId>-view.4me.
	 * it/api/xpublisher/resources/weebopublisher/getContentDescriptor http://<clientId>-view.4me.
	 * it/api/xpublisher/resources/weebopublisher/getContentDescriptor.m3u8</li>
	 * 	<li>WSDL: not available</li>
	 * </ul>
	 * 
	 * Specify the channelType parameter only when the user desire the specific descriptor of a channel,
	 * otherwise the player use the descriptor compliant with the proper userAgent.
	 * 
	 * userAgent="mobile" looks for the given channel types:
	 * 1. STREAMHTTPIOSHD
	 * 2. STREAMHTTPIOS
	 * 3. WEBIPHONEHD
	 * 4. WEBIPHONE
	 * 
	 * userAgent="other" used for old mobile devices like Blackberry and Android, looks for the given
	 * channel types:
	 * 1. WEBIPHONEHD
	 * 2. WEBIPHONE
	 * 
	 * userAgent="desktop" used with desktop device with flash player, looks for the given channel types:
	 * 1. STREAMHTTPFLASHHD
	 * 2. STREAMHTTPFLASH
	 * 3. WEBHD
	 * 4. WEB
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param channelType : String
	 * Option not required
	 * @param userAgent : String
	 * Optional .Possible values are:
	 * iphone
	 * ipad
	 * phone7
	 * android (for mobile device using flash)
	 * silverlight
	 * generic (for web devices using flash)
	 * @param dt : String
	 * DeliveryToken.
	 * Used to validate the service invocation.
	 * @return String
	*/
	def getContentDescriptor(tokenId: String, 
			clientId: String, 
			contentId: String, 
			channelType: String, 
			userAgent: String, 
			dt: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(channelType).foreach(s => params.add("channelType", s))
		Option(userAgent).foreach(s => params.add("userAgent", s))
		Option(dt).foreach(s => params.add("dt", s))
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("weebopublisher/getContentDescriptor")
				
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[String])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[String])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * returns the total space used in CDN. Each client has a quota of storage for the published content
	 * in CDN.
	 * Only for 3x version
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseGetQuota
	*/
	def getQuotaUsage(tokenId: String, 
			clientId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetQuota ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
			val response : MResponseGetQuota = if(this.resourceEndpoint == ""){
			
				new MResponseGetQuota()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("weebopublisher/getQuotaUsage")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetQuota])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetQuota])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * returns the total space used in CDN by each userId (the owner of the published content)
	 * Only for 3x version
	 * @param tokenId : String
	 * @param param : MWeeboPublishergetQuotaUsageByUserIdReq
	 * @return MResponseGetQuotaUsage
	*/
	def getQuotaUsageByUserId(tokenId: String, 
			param: MWeeboPublishergetQuotaUsageByUserIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetQuotaUsage ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetQuotaUsage = if(this.resourceEndpoint == ""){
			
				new MResponseGetQuotaUsage()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisher/getQuotaUsageByUserId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetQuotaUsage],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetQuotaUsage])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param channelType : String
	 * @param metadataKey : String
	 * @param metadataValue : String
	 * @param offset : Integer
	 * @param numResult : Integer
	 * @return MResponseFindContentsByMetadata
	*/
	def findContentsByMetadata(tokenId: String, 
			clientId: String, 
			channelType: String, 
			metadataKey: String, 
			metadataValue: String, 
			offset: Integer, 
			numResult: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseFindContentsByMetadata ={
	
		                  try{
		                	val webResource = JWeeboPublisherClient.client.resource(this.resourceEndpoint)
		                	val params = new com.sun.jersey.core.util.MultivaluedMapImpl
								Option(clientId).foreach(s => params.add("clientId", s))
								Option(channelType).foreach(s => params.add("channelType", s))
								Option(metadataKey).foreach(s => params.add("metadataKey", s))
								Option(metadataValue).foreach(s => params.add("metadataValue", s))
								Option(offset).foreach(s => params.add("offset", s))
								Option(numResult).foreach(s => params.add("numResult", s))
		                	val response : MResponseFindContentsByMetadata = webResource.queryParams(params)
		                		.path("weebopublisher/findContentsByMetadata")
		                		.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
		                		.header("X-TOKENID",tokenId)
		                		.get(classOf[MResponseFindContentsByMetadata])
		                	response
		                  }catch{
		                	case e : com.sun.jersey.api.client.UniformInterfaceException =>
		                		val response = e.getResponse
		                		if(response.getStatus == 418) {
		                		  response.getEntity(classOf[MResponseFindContentsByMetadata])
		                		}
		                		else {
		                		  throw e
		                		}
		                  }
		                
	}

}