package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.content.MResponseContentListVersions
import it.newvision.nvp.xadmin.services.model.request.MContentlistVersionsReq
import it.newvision.nvp.xadmin.services.model.content.MResponsePublishContents
import it.newvision.nvp.xadmin.services.model.request.MContentinsertReq
import it.newvision.nvp.xadmin.services.model.content.MResponseDetailSource
import it.newvision.nvp.xadmin.services.model.content.MResponsePublish
import it.newvision.nvp.xadmin.services.model.request.MContentupdateSourceReq
import it.newvision.nvp.xadmin.services.model.request.MContentupdateVersionNoteReq
import it.newvision.nvp.xadmin.services.model.request.MContentupdateThumbnailReq
import it.newvision.nvp.xadmin.services.model.content.MResponseContentsTrash
import it.newvision.nvp.xadmin.services.model.request.MContenttrashReq
import it.newvision.nvp.xadmin.services.model.request.MContentuntrashReq
import it.newvision.nvp.xadmin.services.model.request.MContentremoveReq
import it.newvision.nvp.xadmin.services.model.weebo.MResponseGetContentTypes
import it.newvision.nvp.xadmin.services.model.request.MContentgetContentTypesReq

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
class JContentClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Returns the list of versions of a content
	 * <b>
	 * </b><b>Validation</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * @param param : MContentlistVersionsReq
	 * @return MResponseContentListVersions
	*/
	def listVersions(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			param: MContentlistVersionsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseContentListVersions ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentListVersions = if(this.resourceEndpoint == ""){
			
				new MResponseContentListVersions()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/listVersions")
					.path(clientId.toString)
		.path(xcontentId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentListVersions],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentListVersions])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Creates a content.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>applications cannot create content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentinsertReq
	 * @return MResponsePublishContents
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MContentinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePublishContents ={
	
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
	 * Return the detail of a content source.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>READ ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * @return MResponseDetailSource
	*/
	def detailSource(tokenId: String, 
			clientId: String, 
			xcontentId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseDetailSource ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		
			val response : MResponseDetailSource = if(this.resourceEndpoint == ""){
			
				new MResponseDetailSource()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("content/detailSource")
					.path(clientId.toString)
		.path(xcontentId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDetailSource])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailSource])
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
	 * 	<li>reset the user preferences of the content (the content becomes new for all users)</li>
	 * </ul>
	 * <ul>
	 * 	<li>return an error if the content has some channel in progress.</li>
	 * </ul>
	 * 
	 * <b>Validation</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentupdateSourceReq
	 * @return MResponsePublish
	*/
	def updateSource(tokenId: String, 
			clientId: String, 
			param: MContentupdateSourceReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePublish ={
	
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
	 * Updates the version note for the active version of a content.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>can be invoked only by version creator</li>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * @param param : MContentupdateVersionNoteReq
	 * @return MResponsePublish
	*/
	def updateVersionNote(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			param: MContentupdateVersionNoteReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePublish ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublish = if(this.resourceEndpoint == ""){
			
				new MResponsePublish()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updateVersionNote")
					.path(clientId.toString)
		.path(xcontentId.toString)
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
	 * Replaces the thumbnail of a content.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>image content are not eligible for thumbnail substitution.</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentupdateThumbnailReq
	 * @return MResponsePublish
	*/
	def updateThumbnail(tokenId: String, 
			clientId: String, 
			param: MContentupdateThumbnailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePublish ={
	
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
	 * Moves a content to the Trash category.
	 * Content remains available for delivery and can be recovered via the untrash service.
	 * 
	 * The service:
	 * <ul>
	 * 	<li>unlinks the content from every linked categories</li>
	 * 	<li>removes linked embed codes</li>
	 * 	<li>removes any ACL but owner's</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContenttrashReq
	 * @return MResponseContentsTrash
	*/
	def trash(tokenId: String, 
			clientId: String, 
			param: MContenttrashReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseContentsTrash ={
	
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
	 * Restores a trashed content.
	 * Content is restored in owner's inbox.
	 * 
	 * <b>Validation:</b>
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
			param: MContentuntrashReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseContentsTrash ={
	
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
	 * Removes a content from the platform.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentremoveReq
	 * @return MResponsePublish
	*/
	def remove(tokenId: String, 
			clientId: String, 
			param: MContentremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePublish ={
	
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

	/**
	 * Returns the list of contentType available for a file based on its name.
	 * The service map the mime type of filename to the corresponding list of content types.
	 * For example the file with name "myvideo.mp4" can be published as VIDEO or OTHER content.
	 * @param tokenId : String
	 * @param param : MContentgetContentTypesReq
	 * @return MResponseGetContentTypes
	*/
	def getContentTypes(tokenId: String, 
			param: MContentgetContentTypesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseGetContentTypes ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetContentTypes = if(this.resourceEndpoint == ""){
			
				new MResponseGetContentTypes()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/getContentTypes")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetContentTypes],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetContentTypes])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}