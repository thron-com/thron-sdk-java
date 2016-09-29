package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.content.MResponsePublishContents
import it.newvision.nvp.xadmin.services.model.request.MContentinsertReq
import it.newvision.nvp.xadmin.services.model.content.MResponsePublish
import it.newvision.nvp.xadmin.services.model.request.MContentupdateThumbnailReq
import it.newvision.nvp.xadmin.services.model.request.MContentupdateSourceReq
import it.newvision.nvp.xadmin.services.model.content.MResponseContentsTrash
import it.newvision.nvp.xadmin.services.model.request.MContenttrashReq
import it.newvision.nvp.xadmin.services.model.request.MContentuntrashReq
import it.newvision.nvp.xadmin.services.model.request.MContentremoveReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JContentClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service define all functions used to publish different type of contents in
 * THRON platform. You can use this interface to publish Images, audio, video and
 * other kind of contents. Most of these functions are asynchronous.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xadmin/resources/content</li>
 * </ul>
 */
class JContentClient(val resourceEndpoint:String) {

	/**
	 * Create a new THRON content starting from a source file or resource.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentinsertReq
	 * @return MResponsePublishContents
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MContentinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContents ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContents = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContents()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/insert")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContents],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContents])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Replace the thumbnail for a published content.
	 * 
	 * <b>Role Validation</b>
	 * MODIFY ACL on Content and 4ME_USE_CONTENTS role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentupdateThumbnailReq
	 * @return MResponsePublish
	*/
	def updateThumbnail(tokenId: String, 
			clientId: String, 
			param: MContentupdateThumbnailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublish ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublish = if(this.resourceEndpoint == ""){
			
				new MResponsePublish()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updateThumbnail")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublish],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublish])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service:
	 * <ul>
	 * 	<li>replace the source file linked to a content</li>
	 * </ul>
	 * <ul>
	 * 	<li>republish the content in all channels with status PUBLISHED or ERROR.</li>
	 * </ul>
	 * <ul>
	 * 	<li>remove the old versioned files (all sourceFiles versions) from repository if
	 * removeOriginalFiles  parameter is TRUE</li>
	 * </ul>
	 * <ul>
	 * 	<li>keep a version of the original source file (saved as link in MMediaContent.
	 * sourceFilesOldVersion) if removeOriginalFiles parameter is set to FALSE</li>
	 * </ul>
	 * <ul>
	 * 	<li>reset the user preferences of the content (the content becomes new for all users)</li>
	 * </ul>
	 * <ul>
	 * 	<li>return an error if the content has some channel in progress.</li>
	 * </ul>
	 * 
	 * <b>Role Validation</b>
	 * <ul>
	 * 	<li>MODIFY ACL on Content and 4ME_USE_CONTENTS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentupdateSourceReq
	 * @return MResponsePublish
	*/
	def updateSource(tokenId: String, 
			clientId: String, 
			param: MContentupdateSourceReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublish ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublish = if(this.resourceEndpoint == ""){
			
				new MResponsePublish()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updateSource")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublish],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublish])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * move a content in TRASH category. The content is still published in CDN and can be recovered using
	 * the service untrashContent.
	 * 
	 * The service remove also:
	 * <ul>
	 * 	<li>the contents from the linked categories</li>
	 * 	<li>cleanup the ACL specific of the content</li>
	 * 	<li>all linked embed codes.</li>
	 * </ul>
	 * 
	 * <b>Role Validation</b>
	 * <ul>
	 * 	<li>MODIFY ACL on Content and 4ME_USE_CONTENTS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContenttrashReq
	 * @return MResponseContentsTrash
	*/
	def trash(tokenId: String, 
			clientId: String, 
			param: MContenttrashReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentsTrash ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentsTrash = if(this.resourceEndpoint == ""){
			
				new MResponseContentsTrash()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/trash")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentsTrash],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentsTrash])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to recover a trashContent operation.
	 * The service restore the content in the owner's INBOX.
	 * 
	 * <b>Role Validation</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentuntrashReq
	 * @return MResponseContentsTrash
	*/
	def untrash(tokenId: String, 
			clientId: String, 
			param: MContentuntrashReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentsTrash ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentsTrash = if(this.resourceEndpoint == ""){
			
				new MResponseContentsTrash()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/untrash")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentsTrash],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentsTrash])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Permanently remove a content from the Platform.
	 * 
	 * <b>Role Validation</b>
	 * <ul>
	 * 	<li>MODIFY ACL on Content and 4ME_USE_CONTENTS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentremoveReq
	 * @return MResponsePublish
	*/
	def remove(tokenId: String, 
			clientId: String, 
			param: MContentremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublish ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublish = if(this.resourceEndpoint == ""){
			
				new MResponsePublish()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/remove")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublish],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublish])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}