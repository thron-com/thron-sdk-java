package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.response.MResponseContentDetail
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdmincreateNewContentReq
import it.newvision.nvp.xpublisher.services.model.response.MResponseGetContentsForPlayList
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdmingetContentsForPlayListReq
import it.newvision.nvp.xpublisher.services.model.response.MResponsePublisher
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminremoveContentReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminupdateContentPropertiesReq
import it.newvision.nvp.xpublisher.services.model.response.MResponsePublishContent
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminchangePlannedDateReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminpublishReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminpublishTextFileReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminpublishLiveEventReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminreplaceThumbnailsReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminpublishMetaDocumentReq
import it.newvision.nvp.xpublisher.services.model.response.MResponseUnpublishContent
import it.newvision.nvp.xpublisher.services.model.response.MResponseActivateChannel
import it.newvision.nvp.xpublisher.services.model.response.MResponseGetPublishedContents
import it.newvision.nvp.xpublisher.services.model.response.MResponseUploadSrtFile
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminuploadSrtFileReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdminremoveSrtFileReq
import it.newvision.nvp.xpublisher.services.model.response.MResponseGetSrtFile
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublisherAdmingetSrtFilesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JWeeboPublisherAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * the WeeboPublish service handle the publishing functions for the different
 * channels. It is possible to publish the content for STREAM (VOD) or WEB (HTTP).
 * 
 * The publisher keep the same file name as saved by the packager, but it can
 * change the destination filename if it find another file with the same name in
 * the target  directory.
 * The publisher never overwrite an existing published content.
 * The "update" function is handled by the publisher once the user is publishing a
 * content for an existing contentID.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST: http://clientId-view.4me.it/api/adxpublisher/resources/application.
 * wadl</li>
 * </ul>
 */
class JWeeboPublisherAdminClient(val resourceEndpoint:String) {

	/**
	 * default function to publish a content in Weebo. The content is published in the WEB(Http) channel.
	 * 
	 * If pcontentId is empty a new content is created and published, otherwise the publishing method try
	 * to overwrite the contents for the specified pcontentId (update function).
	 * It is possible to publish the content in multiple channels (ex. STREAM + WEB) but the resource
	 * files are not duplicated, but only referenced and the WEB descriptor is automatically generated for
	 * the WEB channel.
	 * The contentType is updated in Content only the 1st time when the content is created and not during
	 * the publishing process for new channels.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdmincreateNewContentReq
	 * @return MResponseContentDetail
	*/
	def createNewContent(tokenId: String, 
			param: MWeeboPublisherAdmincreateNewContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContentDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/createNewContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * return the content information for the selected channel type and the given pcontentId. This service
	 * is used by the xadmin component.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdmingetContentsForPlayListReq
	 * @return MResponseGetContentsForPlayList
	*/
	def getContentsForPlayList(tokenId: String, 
			param: MWeeboPublisherAdmingetContentsForPlayListReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetContentsForPlayList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetContentsForPlayList = if(this.resourceEndpoint == ""){
			
				new MResponseGetContentsForPlayList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/getContentsForPlayList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetContentsForPlayList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetContentsForPlayList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * completely remove a content from the published, with all published channels.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminremoveContentReq
	 * @return MResponsePublisher
	*/
	def removeContent(tokenId: String, 
			param: MWeeboPublisherAdminremoveContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublisher ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublisher = if(this.resourceEndpoint == ""){
			
				new MResponsePublisher()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/removeContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublisher],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublisher])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * update the geo location properties for the published content. If the pContentId is empty a new
	 * publishedContent is created.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminupdateContentPropertiesReq
	 * @return MResponseContentDetail
	*/
	def updateContentProperties(tokenId: String, 
			param: MWeeboPublisherAdminupdateContentPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContentDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/updateContentProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminchangePlannedDateReq
	 * @return MResponsePublishContent
	*/
	def changePlannedDate(tokenId: String, 
			param: MWeeboPublisherAdminchangePlannedDateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/changePlannedDate")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * default function to publish a content in Weebo. The content is published in the WEB(Http) channel.
	 * 
	 * It is possible to publish the content in multiple channels (ex. STREAM + WEB) but the resource
	 * files are not duplicated, but only referenced and the WEB descriptor is automatically generated for
	 * the WEB channel.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminpublishReq
	 * @return MResponsePublishContent
	*/
	def publish(tokenId: String, 
			param: MWeeboPublisherAdminpublishReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/publish")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * This service create a new text files using the given fileContent, and the file is published in the
	 * WEB channel.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminpublishTextFileReq
	 * @return MResponsePublishContent
	*/
	def publishTextFile(tokenId: String, 
			param: MWeeboPublisherAdminpublishTextFileReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/publishTextFile")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Specific function to publish a live event in Weebo. The service instance the required ec2 machine,
	 * and startup the wowza server.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminpublishLiveEventReq
	 * @return MResponsePublisher
	*/
	def publishLiveEvent(tokenId: String, 
			param: MWeeboPublisherAdminpublishLiveEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublisher ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublisher = if(this.resourceEndpoint == ""){
			
				new MResponsePublisher()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/publishLiveEvent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublisher],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublisher])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Replace the given thumbnails for a published content.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminreplaceThumbnailsReq
	 * @return MResponsePublishContent
	*/
	def replaceThumbnails(tokenId: String, 
			param: MWeeboPublisherAdminreplaceThumbnailsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/replaceThumbnails")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Specific function to publish playlists or pagelet contents in Weebo. The content is published in
	 * the WEB(Http) channel.
	 * It is possible to publish the content in multiple channels (ex. STREAM + WEB) but the resource
	 * files are not duplicated, but only referenced and the WEB descriptor is automatically generated for
	 * the WEB channel.
	 * Playlist and slideshow contents are logical contents with only a special descriptor that detail the
	 * url of the elements linked by the playlist or slideshow. These kind of contents could have only
	 * thumbnail resources and no ingestion or packaging tasks are involved (only for the thumbnail
	 * generation)
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminpublishMetaDocumentReq
	 * @return MResponsePublishContent
	*/
	def publishMetaDocument(tokenId: String, 
			param: MWeeboPublisherAdminpublishMetaDocumentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/publishMetaDocument")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Un publish the content from a channel.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @param channelType : String
	 * @return MResponseUnpublishContent
	*/
	def unpublish(tokenId: String, 
			clientId: String, 
			pContentId: String, 
			channelType: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUnpublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(pContentId).foreach(s => params.add("pContentId", s))
		Option(channelType).foreach(s => params.add("channelType", s))  
			val response : MResponseUnpublishContent = if(this.resourceEndpoint == ""){
			
				new MResponseUnpublishContent()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("weebopublisheradmin/unpublish")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseUnpublishContent],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUnpublishContent])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Un publish the live event from all channel
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @param discardRecordedFiles : Boolean
	 * Default is FALSE
	 * @param removeInstances : Boolean
	 * @return MResponsePublisher
	*/
	def unpublishLiveEvent(tokenId: String, 
			clientId: String, 
			pContentId: String, 
			discardRecordedFiles: Boolean, 
			removeInstances: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublisher ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(pContentId).foreach(s => params.add("pContentId", s))
		Option(discardRecordedFiles).foreach(s => params.add("discardRecordedFiles", s))
		Option(removeInstances).foreach(s => params.add("removeInstances", s))  
			val response : MResponsePublisher = if(this.resourceEndpoint == ""){
			
				new MResponsePublisher()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("weebopublisheradmin/unpublishLiveEvent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponsePublisher],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublisher])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * activate the channel
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @param channelType : String
	 * @return MResponseActivateChannel
	*/
	def activateChannel(tokenId: String, 
			clientId: String, 
			pContentId: String, 
			channelType: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseActivateChannel ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(pContentId).foreach(s => params.add("pContentId", s))
		Option(channelType).foreach(s => params.add("channelType", s))  
			val response : MResponseActivateChannel = if(this.resourceEndpoint == ""){
			
				new MResponseActivateChannel()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("weebopublisheradmin/activateChannel")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseActivateChannel],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseActivateChannel])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * deactivate the channel
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @param channelType : String
	 * @return MResponseUnpublishContent
	*/
	def deactivateChannel(tokenId: String, 
			clientId: String, 
			pContentId: String, 
			channelType: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUnpublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(pContentId).foreach(s => params.add("pContentId", s))
		Option(channelType).foreach(s => params.add("channelType", s))  
			val response : MResponseUnpublishContent = if(this.resourceEndpoint == ""){
			
				new MResponseUnpublishContent()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("weebopublisheradmin/deactivateChannel")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseUnpublishContent],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUnpublishContent])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @param channelType : String
	 * @return MResponseGetPublishedContents
	*/
	def getPublishedContent(tokenId: String, 
			clientId: String, 
			pContentId: String, 
			channelType: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetPublishedContents ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(pContentId).foreach(s => params.add("pContentId", s))
		Option(channelType).foreach(s => params.add("channelType", s))
			val response : MResponseGetPublishedContents = if(this.resourceEndpoint == ""){
			
				new MResponseGetPublishedContents()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("weebopublisheradmin/getPublishedContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetPublishedContents])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetPublishedContents])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * This service send a CheckTaskMessage to the Publisher actors, and it is used to reactivate the
	 * Publisher task queue.
	 * @param tokenId : String
	 * @return MResponsePublisher
	*/
	def checkPendingtask(tokenId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublisher ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		
			val response : MResponsePublisher = if(this.resourceEndpoint == ""){
			
				new MResponsePublisher()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("weebopublisheradmin/checkPendingtask")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponsePublisher])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublisher])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Upload a new SRT File in the CDN  area. SRT Files are stored in 4me/static/srt/pcontentId_<locale>.
	 * srt
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminuploadSrtFileReq
	 * @return MResponseUploadSrtFile
	*/
	def uploadSrtFile(tokenId: String, 
			param: MWeeboPublisherAdminuploadSrtFileReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUploadSrtFile ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseUploadSrtFile = if(this.resourceEndpoint == ""){
			
				new MResponseUploadSrtFile()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/uploadSrtFile")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUploadSrtFile],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUploadSrtFile])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove the srt file, specific for the given locale, from the CDN.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminremoveSrtFileReq
	 * @return MResponsePublisher
	*/
	def removeSrtFile(tokenId: String, 
			param: MWeeboPublisherAdminremoveSrtFileReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublisher ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublisher = if(this.resourceEndpoint == ""){
			
				new MResponsePublisher()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/removeSrtFile")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublisher],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublisher])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Get the srt file information for a given content.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdmingetSrtFilesReq
	 * @return MResponseGetSrtFile
	*/
	def getSrtFiles(tokenId: String, 
			param: MWeeboPublisherAdmingetSrtFilesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetSrtFile ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetSrtFile = if(this.resourceEndpoint == ""){
			
				new MResponseGetSrtFile()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebopublisheradmin/getSrtFiles")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetSrtFile],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetSrtFile])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Return the Mcontent object, with all channel information.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @return MResponseContentDetail
	*/
	def getContentDetail(tokenId: String, 
			clientId: String, 
			pContentId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboPublisherAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(pContentId).foreach(s => params.add("pContentId", s))
			val response : MResponseContentDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContentDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("weebopublisheradmin/getContentDetail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseContentDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

}