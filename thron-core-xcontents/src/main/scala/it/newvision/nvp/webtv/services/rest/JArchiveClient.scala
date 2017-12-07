package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.archive.MResponsePrepareArchive
import it.newvision.nvp.webtv.services.model.request.MArchiveprepareReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JArchiveClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is used to download content.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-extra.thron.
 * com/api/xcontents/resources/archive</li>
 * </ul>
 */
class JArchiveClient(val resourceEndpoint:String) {

	/**
	 * Returns a zip file with the content matching the prepare request.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * 
	 * <b>WARNING</b>: invoking this service via the Developer portal provides a result that your browser
	 * may not be able to evaluate. For this reason it is recommended to test this service using an
	 * external API testing software.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param downloadId : String
	 * The value recieved as response of prepare service
	 * @param saveAs : String
	 * Optional. The desired name of the file with no extension
	 * @param contactId : String
	 * Optional. Used for download analytics. The value comes from the tracking library.
	 * @return java.io.File
	*/
	def download(tokenId: String, 
			clientId: String, 
			downloadId: String, 
			saveAs: String, 
			contactId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JArchiveClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(downloadId).foreach(s => params.add("downloadId", s))
		Option(saveAs).foreach(s => params.add("saveAs", s))
		Option(contactId).foreach(s => params.add("contactId", s))  
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("archive/download")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.WILDCARD)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[java.io.File],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[java.io.File])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Returns a zip file with the published resources of the playlist's elements.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * 
	 * <b>WARNING</b>: invoking this service via the Developer portal provides a result that your browser
	 * may not be able to evaluate. For this reason it is recommended to test this service using an
	 * external API testing software.
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId of the content.
	 * 

	 * @param saveAs : String
	 * Optional. The desired name of the file with no extension
	 * @param pkey : String
	 * Optional. The access key for the content. It's not required when session token is provided.
	 * @param elements : String
	 * Optional. List of xcontentIds as comma separated value. This allow the use to select the playlist
	 * items to download, if empty, all items are downloaded.
	 * @param locale : String
	 * Optional. Locale of content prettyId used as file name.
	 * @return java.io.File
	*/
	def downloadPlaylist(tokenId: String, 
			clientId: String, 
			id: String, 
			saveAs: String, 
			pkey: String, 
			elements: String, 
			locale: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JArchiveClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(saveAs).foreach(s => params.add("saveAs", s))
		Option(pkey).foreach(s => params.add("pkey", s))
		Option(elements).foreach(s => params.add("elements", s))
		Option(locale).foreach(s => params.add("locale", s))  
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("archive/downloadPlaylist")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.WILDCARD)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[java.io.File],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[java.io.File])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Returns an id used by download service to zip and download a set of content.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MArchiveprepareReq
	 * @return MResponsePrepareArchive
	*/
	def prepare(tokenId: String, 
			clientId: String, 
			param: MArchiveprepareReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePrepareArchive ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JArchiveClient.client.resource(this.resourceEndpoint)
			val response : MResponsePrepareArchive = if(this.resourceEndpoint == ""){
			
				new MResponsePrepareArchive()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("archive/prepare")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePrepareArchive],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePrepareArchive])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns a zip file with the resources of a player embed template.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * 
	 * <b>WARNING</b>: invoking this service via the Developer portal provides a result that your browser
	 * may not be able to evaluate. For this reason it is recommended to test this service using an
	 * external API testing software.
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param templateId : String
	 * @param templateVersion : Integer
	 * @return java.io.File
	*/
	def downloadPlayerEmbedTemplate(tokenId: String, 
			clientId: String, 
			templateId: String, 
			templateVersion: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JArchiveClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			  
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("archive/downloadPlayerEmbedTemplate")
					.path(clientId.toString)
		.path(templateId.toString)
		.path(templateVersion.toString)
					.accept(javax.ws.rs.core.MediaType.WILDCARD)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[java.io.File],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[java.io.File])
				}
				else {
				  throw e
				}
		  }
	
	}

}