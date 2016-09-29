package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MResponsePublishContent
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessnewContentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessnewPageletContentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessupdatePageletContentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessnewLiveEventContentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessnewPlayListContentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcesscreateContentForChannelReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcesspublishChannelReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcesschangeChannelStatusReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessremoveChannelReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessunpublishContentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessreplaceThumbnailInPublishedContentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessupdatePublishingPropertiesReq
import it.newvision.nvp.xadmin.services.model.weebo.MResponseGetContentTypes
import it.newvision.nvp.xadmin.services.model.request.MPublishingProcessgetContentTypesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPublishingProcessClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service define all functions used to publish different type of contents in
 * the platform. You can use this interface to publish Images, audio, video and
 * other kind of contents. Most of these functions are asynchronous.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xadmin/resources/publishingprocess</li>
 * </ul>
 */
class JPublishingProcessClient(val resourceEndpoint:String) {

	/**
	 * First step of a publishing process. The service create a new empty content in platform linked to a
	 * specific source file.
	 * To easily create and publish a content in the platform use the services of JPublishInWeeboExpress.
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishingProcessnewContentReq
	 * @return MResponsePublishContent
	*/
	def newContent(tokenId: String, 
			param: MPublishingProcessnewContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
		//Rest request:
		//
		//POST http://nvp-test:8083/nvp-
		//web/resources/publishingprocess/newConte
		//nt
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MPublishingProcessnewContentReq>
		//	<clientId>test</clientId>
		//	<param>
		//		<contentType>OTHER</contentType>
		//		<sourcefiles>
		//			<fileName>OReilly.Essential.
		//ActionScript.3.0.Jun.2007_2.
		//pdf</fileName>
		//			<mimeType>application</mimeType>
		//			<modifiedDate>1294669591322</modified
		//Date>
		//			<removed>false</removed>
		//			<siteName>site_1</siteName>
		//			<totalSpace>5083469</totalSpace>
		//		</sourcefiles>
		//	</param>
		//</MPublishingProcessnewContentReq>
		//
		//Rest response:
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MResponsePublishContent>
		//	<errorDescription></errorDescription>
		//	<resultCode>OK</resultCode>
		//	<ssoCode>OK</ssoCode>
		//	<content>
		//		<contentType>OTHER</contentType>
		//		<creationDate>2011-02-14T10:11:03.
		//693+01:00</creationDate>
		//		<id>fea64023-419c-451c-a80e-
		//4bddb1f6cc10</id>
		//		<sourceFiles>
		//			<fileName>OReilly.Essential.
		//ActionScript.3.0.Jun.2007_2.
		//pdf</fileName>
		//			<mimeType>application</mimeType>
		//			<modifiedDate>1294669591322</modified
		//Date>
		//			<removed>false</removed>
		//			<siteName>site_1</siteName>
		//			<totalSpace>5083469</totalSpace>
		//		</sourceFiles>
		//		<xcontentId>7b159612-6e0f-46dd-8946-
		//99be9de85416</xcontentId>
		//		<xpublishedId>54aacdb4-9c8a-46e0-80a4-
		//dfdb689d405c</xpublishedId>
		//	</content>
		//</MResponsePublishContent>

	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/newContent")
				
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
	 * First step of a publishing process, used to create a new content of type PAGELET (contents without
	 * source file, but with a body in html or other formats, readable by the player).
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishingProcessnewPageletContentReq
	 * @return MResponsePublishContent
	*/
	def newPageletContent(tokenId: String, 
			param: MPublishingProcessnewPageletContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/newPageletContent")
				
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
	 * Used to update the content body of a PAGELET document.
	 * @param tokenId : String
	 * @param param : MPublishingProcessupdatePageletContentReq
	 * @return MResponsePublishContent
	*/
	def updatePageletContent(tokenId: String, 
			param: MPublishingProcessupdatePageletContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/updatePageletContent")
				
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
	 * First step of a publishing process for a LIVE EVENT content. The User create a new Live Event
	 * Content. The service create a content in xcontents (MContent), a new content in xpublisher
	 * (MContent) and prepare the environment for the publishing process.
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishingProcessnewLiveEventContentReq
	 * @return MResponsePublishContent
	*/
	def newLiveEventContent(tokenId: String, 
			param: MPublishingProcessnewLiveEventContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
		//Rest request:
		//
		//POST http://nvp-test:8083/nvp-
		//web/resources/publishingprocess/newConte
		//nt
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MPublishingProcessnewContentReq>
		//	<clientId>test</clientId>
		//	<param>
		//		<contentType>OTHER</contentType>
		//		<sourcefiles>
		//			<fileName>OReilly.Essential.
		//ActionScript.3.0.Jun.2007_2.
		//pdf</fileName>
		//			<mimeType>application</mimeType>
		//			<modifiedDate>1294669591322</modified
		//Date>
		//			<removed>false</removed>
		//			<siteName>site_1</siteName>
		//			<totalSpace>5083469</totalSpace>
		//		</sourcefiles>
		//	</param>
		//</MPublishingProcessnewContentReq>
		//
		//Rest response:
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MResponsePublishContent>
		//	<errorDescription></errorDescription>
		//	<resultCode>OK</resultCode>
		//	<ssoCode>OK</ssoCode>
		//	<content>
		//		<contentType>OTHER</contentType>
		//		<creationDate>2011-02-14T10:11:03.
		//693+01:00</creationDate>
		//		<id>fea64023-419c-451c-a80e-
		//4bddb1f6cc10</id>
		//		<sourceFiles>
		//			<fileName>OReilly.Essential.
		//ActionScript.3.0.Jun.2007_2.
		//pdf</fileName>
		//			<mimeType>application</mimeType>
		//			<modifiedDate>1294669591322</modified
		//Date>
		//			<removed>false</removed>
		//			<siteName>site_1</siteName>
		//			<totalSpace>5083469</totalSpace>
		//		</sourceFiles>
		//		<xcontentId>7b159612-6e0f-46dd-8946-
		//99be9de85416</xcontentId>
		//		<xpublishedId>54aacdb4-9c8a-46e0-80a4-
		//dfdb689d405c</xpublishedId>
		//	</content>
		//</MResponsePublishContent>

	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/newLiveEventContent")
				
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
	 * First step of the publishing process for a PLAYLIST content. The User create a new PlayList Content,
	 * linked to a set of source files. The service create a content and prepare the environment for the
	 * publishing process.
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishingProcessnewPlayListContentReq
	 * @return MResponsePublishContent
	*/
	def newPlayListContent(tokenId: String, 
			param: MPublishingProcessnewPlayListContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
		//Rest request:
		//
		//POST http://nvp-test:8083/nvp-
		//web/resources/publishingprocess/newConte
		//nt
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MPublishingProcessnewContentReq>
		//	<clientId>test</clientId>
		//	<param>
		//		<contentType>OTHER</contentType>
		//		<sourcefiles>
		//			<fileName>OReilly.Essential.
		//ActionScript.3.0.Jun.2007_2.
		//pdf</fileName>
		//			<mimeType>application</mimeType>
		//			<modifiedDate>1294669591322</modified
		//Date>
		//			<removed>false</removed>
		//			<siteName>site_1</siteName>
		//			<totalSpace>5083469</totalSpace>
		//		</sourcefiles>
		//	</param>
		//</MPublishingProcessnewContentReq>
		//
		//Rest response:
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MResponsePublishContent>
		//	<errorDescription></errorDescription>
		//	<resultCode>OK</resultCode>
		//	<ssoCode>OK</ssoCode>
		//	<content>
		//		<contentType>OTHER</contentType>
		//		<creationDate>2011-02-14T10:11:03.
		//693+01:00</creationDate>
		//		<id>fea64023-419c-451c-a80e-
		//4bddb1f6cc10</id>
		//		<sourceFiles>
		//			<fileName>OReilly.Essential.
		//ActionScript.3.0.Jun.2007_2.
		//pdf</fileName>
		//			<mimeType>application</mimeType>
		//			<modifiedDate>1294669591322</modified
		//Date>
		//			<removed>false</removed>
		//			<siteName>site_1</siteName>
		//			<totalSpace>5083469</totalSpace>
		//		</sourceFiles>
		//		<xcontentId>7b159612-6e0f-46dd-8946-
		//99be9de85416</xcontentId>
		//		<xpublishedId>54aacdb4-9c8a-46e0-80a4-
		//dfdb689d405c</xpublishedId>
		//	</content>
		//</MResponsePublishContent>

	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/newPlayListContent")
				
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
	 * This service activate the ingestion process of the content for a specific channel. Once the content
	 * is ready (converted in right format),the content can be published using the service
	 * "publishChannel". This service is <b>ASYNCHRONOUS</b>!
	 * @param tokenId : String
	 * @param param : MPublishingProcesscreateContentForChannelReq
	 * @return MResponsePublishContent
	*/
	def createContentForChannel(tokenId: String, 
			param: MPublishingProcesscreateContentForChannelReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
		//REST Request example:
		//
		//POST http://nvp-test:8083/nvp-
		//web/resources/publishingprocess/createCo
		//ntentForChannel
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MPublishingProcesscreateContentForChann
		//elReq>
		//	<clientId>test</clientId>
		//	<param>
		//		<channel>WEB</channel>
		//		<file>
		//			<fileName>OReilly.Essential.
		//ActionScript.3.0.Jun.2007_2.
		//pdf</fileName>
		//			<mimeType>application</mimeType>
		//			<modifiedDate>1294669591322</modified
		//Date>
		//			<removed>false</removed>
		//			<siteName>site_1</siteName>
		//			<totalSpace>5083469</totalSpace>
		//		</file>
		//		<mediaContentId>fea64023-419c-451c-
		//a80e-4bddb1f6cc10</mediaContentId>
		//	</param>
		//</MPublishingProcesscreateContentForChan
		//nelReq>
		//
		//REST Response example:
		//
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MResponsePublishContent>
		//	<errorDescription></errorDescription>
		//	<resultCode>OK</resultCode>
		//	<ssoCode>OK</ssoCode>
		//	<content>
		//		<channels>
		//			<channelType>WEB</channelType>
		//			<packagedId>b237a822-0e69-43ae-a4ba-
		//3d1a7d79b17b</packagedId>
		//			<startTime>2011-02-14T10:11:03.
		//780+01:00</startTime>
		//			<status>PACKAGING_INPROGRESS</status>
		//
		//		</channels>
		//		<contentType>OTHER</contentType>
		//		<creationDate>2011-02-14T10:11:03.
		//693+01:00</creationDate>
		//		<id>fea64023-419c-451c-a80e-
		//4bddb1f6cc10</id>
		//		<owner></owner>
		//		<sourceFiles>
		//			<fileName>OReilly.Essential.
		//ActionScript.3.0.Jun.2007_2.
		//pdf</fileName>
		//			<mimeType>application</mimeType>
		//			<modifiedDate>1294669591322</modified
		//Date>
		//			<removed>false</removed>
		//			<siteName>site_1</siteName>
		//			<totalSpace>5083469</totalSpace>
		//		</sourceFiles>
		//		<xcontentId>7b159612-6e0f-46dd-8946-
		//99be9de85416</xcontentId>
		//		<xpublishedId>54aacdb4-9c8a-46e0-80a4-
		//dfdb689d405c</xpublishedId>
		//	</content>
		//</MResponsePublishContent>

	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/createContentForChannel")
				
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
	 * Publish a content created for a specific channel. Once the content is ready (packaged), it can be
	 * published in CDN. This function is ASYNCHRONOUS!
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishingProcesspublishChannelReq
	 * @return MResponsePublishContent
	*/
	def publishChannel(tokenId: String, 
			param: MPublishingProcesspublishChannelReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
		//REST Request example:
		//
		//POST http://nvp-test:8083/nvp-
		//web/resources/publishingprocess/publishC
		//hannel
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MPublishingProcesspublishChannelReq>
		//	<channel>WEB</channel>
		//	<clientId>test</clientId>
		//	<mediaContentId>fea64023-419c-451c-
		//a80e-4bddb1f6cc10</mediaContentId>
		//</MPublishingProcesspublishChannelReq>
		//
		//REST Response example:
		//
		//<?xml version="1.0" encoding="UTF-8"
		//standalone="yes"?>
		//<MResponsePublishContent>
		//	<errorDescription></errorDescription>
		//	<resultCode>OK</resultCode>
		//	<ssoCode>OK</ssoCode>
		//	<content>
		//		<channels>
		//			<channelType>WEB</channelType>
		//			<packagedId>b237a822-0e69-43ae-a4ba-
		//3d1a7d79b17b</packagedId>
		//			<startTime>2011-02-14T10:11:03.
		//780+01:00</startTime>
		//			<status>PUBLISHING_INPROGRESS</status
		//>
		//		</channels>
		//		<contentType>OTHER</contentType>
		//		<creationDate>2011-02-14T10:11:03.
		//693+01:00</creationDate>
		//		<id>fea64023-419c-451c-a80e-
		//4bddb1f6cc10</id>
		//		<owner></owner>
		//		<sourceFiles>
		//			<fileName>OReilly.Essential.
		//ActionScript.3.0.Jun.2007_2.
		//pdf</fileName>
		//			<mimeType>application</mimeType>
		//			<modifiedDate>1294669591322</modified
		//Date>
		//			<removed>false</removed>
		//			<siteName>site_1</siteName>
		//			<totalSpace>5083469</totalSpace>
		//		</sourceFiles>
		//		<xcontentId>7b159612-6e0f-46dd-8946-
		//99be9de85416</xcontentId>
		//		<xpublishedId>54aacdb4-9c8a-46e0-80a4-
		//dfdb689d405c</xpublishedId>
		//	</content>
		//</MResponsePublishContent>

	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/publishChannel")
				
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
	 * Activate/deactivate a published channel. Works only for published channels
	 * @param tokenId : String
	 * @param param : MPublishingProcesschangeChannelStatusReq
	 * @return MResponsePublishContent
	*/
	def changeChannelStatus(tokenId: String, 
			param: MPublishingProcesschangeChannelStatusReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/changeChannelStatus")
				
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
	 * Remove a specific channel. remove all files and resources published in CDN (only for the specified
	 * channel). The content is not removed from the platform
	 * @param tokenId : String
	 * @param param : MPublishingProcessremoveChannelReq
	 * @return MResponsePublishContent
	*/
	def removeChannel(tokenId: String, 
			param: MPublishingProcessremoveChannelReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/removeChannel")
				
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
	 * Unpublish (Remove) a content from the Platform. Remove the content metadata in xcontent and
	 * unpublish all resources (files) in CDN.
	 * @param tokenId : String
	 * @param param : MPublishingProcessunpublishContentReq
	 * @return MResponsePublishContent
	*/
	def unpublishContent(tokenId: String, 
			param: MPublishingProcessunpublishContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/unpublishContent")
				
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
	 * change the thumbnail for a published content, replacing the thumbnail files in the published folder.
	 * @param tokenId : String
	 * @param param : MPublishingProcessreplaceThumbnailInPublishedContentReq
	 * @return MResponsePublishContent
	*/
	def replaceThumbnailInPublishedContent(tokenId: String, 
			param: MPublishingProcessreplaceThumbnailInPublishedContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/replaceThumbnailInPublishedContent")
				
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
	 * Update the restriction properties for the published content.
	 * @param tokenId : String
	 * @param param : MPublishingProcessupdatePublishingPropertiesReq
	 * @return MResponsePublishContent
	*/
	def updatePublishingProperties(tokenId: String, 
			param: MPublishingProcessupdatePublishingPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/updatePublishingProperties")
				
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
	 * This service is used to know the possible platform content type available for a given filename. The
	 * service map the mime type of filename to the corresponding list of content types.
	 * For example the file with name "myvideo.mp4" can be published as VIDEO or OTHER content.
	 * @param tokenId : String
	 * @param param : MPublishingProcessgetContentTypesReq
	 * @return MResponseGetContentTypes
	*/
	def getContentTypes(tokenId: String, 
			param: MPublishingProcessgetContentTypesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetContentTypes ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProcessClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetContentTypes = if(this.resourceEndpoint == ""){
			
				new MResponseGetContentTypes()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishingprocess/getContentTypes")
				
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