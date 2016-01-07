package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
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
@Path("/weebopublisheradmin")
//#SWG#@Api(value = "/weebopublisheradmin", description = """the WeeboPublish service handle the publishing functions for the different channels. It is possible to publish the content for STREAM (VOD) or WEB (HTTP).
//#SWGNL#The publisher keep the same file name as saved by the packager, but it can change the destination filename if it find another file with the same name in the target  directory. 
//#SWGNL#The publisher never overwrite an existing published content.
//#SWGNL#The "update" function is handled by the publisher once the user is publishing a content for an existing contentID.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST: http://clientId-view.4me.it/api/adxpublisher/resources/application.wadl</li>
//#SWGNL#</ul>""")
trait JWeeboPublisherAdmin extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

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
	@POST
	@Path("/createNewContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/createNewContent", notes = """default function to publish a content in Weebo. The content is published in the WEB(Http) channel. 
	//#SWGNL#If pcontentId is empty a new content is created and published, otherwise the publishing method try to overwrite the contents for the specified pcontentId (update function).
	//#SWGNL#It is possible to publish the content in multiple channels (ex. STREAM + WEB) but the resource files are not duplicated, but only referenced and the WEB descriptor is automatically generated for the WEB channel.
	//#SWGNL#The contentType is updated in Content only the 1st time when the content is created and not during the publishing process for new channels.""", response = classOf[MResponseContentDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def createNewContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdmincreateNewContentReq):Response /*returnType = MResponseContentDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__createNewContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_createNewContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_createNewContent)
	    }
	} 

	@GET
	@Path("/createNewContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def createNewContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__createNewContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdmincreateNewContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_createNewContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_createNewContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __createNewContent(tokenId: String, param: MWeeboPublisherAdmincreateNewContentReq) :MResponseContentDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_createNewContent: String

	/**
	 * return the content information for the selected channel type and the given pcontentId. This service
	 * is used by the xadmin component.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdmingetContentsForPlayListReq
	 * @return MResponseGetContentsForPlayList
	*/
	@POST
	@Path("/getContentsForPlayList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getContentsForPlayList", notes = """return the content information for the selected channel type and the given pcontentId. This service is used by the xadmin component.""", response = classOf[MResponseGetContentsForPlayList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getContentsForPlayList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdmingetContentsForPlayListReq):Response /*returnType = MResponseGetContentsForPlayList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getContentsForPlayList(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getContentsForPlayList)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getContentsForPlayList)
	    }
	} 

	@GET
	@Path("/getContentsForPlayList")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getContentsForPlayList_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetContentsForPlayList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getContentsForPlayList(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdmingetContentsForPlayListReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getContentsForPlayList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentsForPlayList)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentsForPlayList(tokenId: String, param: MWeeboPublisherAdmingetContentsForPlayListReq) :MResponseGetContentsForPlayList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentsForPlayList: String

	/**
	 * completely remove a content from the published, with all published channels.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminremoveContentReq
	 * @return MResponsePublisher
	*/
	@POST
	@Path("/removeContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeContent", notes = """completely remove a content from the published, with all published channels.""", response = classOf[MResponsePublisher])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminremoveContentReq):Response /*returnType = MResponsePublisher*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeContent)
	    }
	} 

	@GET
	@Path("/removeContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublisher*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminremoveContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeContent(tokenId: String, param: MWeeboPublisherAdminremoveContentReq) :MResponsePublisher
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeContent: String

	/**
	 * update the geo location properties for the published content. If the pContentId is empty a new
	 * publishedContent is created.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminupdateContentPropertiesReq
	 * @return MResponseContentDetail
	*/
	@POST
	@Path("/updateContentProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateContentProperties", notes = """update the geo location properties for the published content. If the pContentId is empty a new publishedContent is created.""", response = classOf[MResponseContentDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateContentProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminupdateContentPropertiesReq):Response /*returnType = MResponseContentDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateContentProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateContentProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateContentProperties)
	    }
	} 

	@GET
	@Path("/updateContentProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateContentProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateContentProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminupdateContentPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateContentProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateContentProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateContentProperties(tokenId: String, param: MWeeboPublisherAdminupdateContentPropertiesReq) :MResponseContentDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateContentProperties: String

	/**
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminchangePlannedDateReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/changePlannedDate")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/changePlannedDate", notes = """""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def changePlannedDate(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminchangePlannedDateReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__changePlannedDate(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_changePlannedDate)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_changePlannedDate)
	    }
	} 

	@GET
	@Path("/changePlannedDate")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def changePlannedDate_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__changePlannedDate(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminchangePlannedDateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_changePlannedDate)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_changePlannedDate)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __changePlannedDate(tokenId: String, param: MWeeboPublisherAdminchangePlannedDateReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_changePlannedDate: String

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
	@POST
	@Path("/publish")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publish", notes = """default function to publish a content in Weebo. The content is published in the WEB(Http) channel. 
	//#SWGNL#It is possible to publish the content in multiple channels (ex. STREAM + WEB) but the resource files are not duplicated, but only referenced and the WEB descriptor is automatically generated for the WEB channel.""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publish(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminpublishReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publish(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publish)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publish)
	    }
	} 

	@GET
	@Path("/publish")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publish_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publish(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminpublishReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publish)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publish)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publish(tokenId: String, param: MWeeboPublisherAdminpublishReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publish: String

	/**
	 * This service create a new text files using the given fileContent, and the file is published in the
	 * WEB channel.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminpublishTextFileReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishTextFile")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishTextFile", notes = """This service create a new text files using the given fileContent, and the file is published in the WEB channel.""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishTextFile(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminpublishTextFileReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishTextFile(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishTextFile)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishTextFile)
	    }
	} 

	@GET
	@Path("/publishTextFile")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishTextFile_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishTextFile(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminpublishTextFileReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishTextFile)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishTextFile)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishTextFile(tokenId: String, param: MWeeboPublisherAdminpublishTextFileReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishTextFile: String

	/**
	 * Specific function to publish a live event in Weebo. The service instance the required ec2 machine,
	 * and startup the wowza server.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminpublishLiveEventReq
	 * @return MResponsePublisher
	*/
	@POST
	@Path("/publishLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishLiveEvent", notes = """Specific function to publish a live event in Weebo. The service instance the required ec2 machine, and startup the wowza server.""", response = classOf[MResponsePublisher])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishLiveEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminpublishLiveEventReq):Response /*returnType = MResponsePublisher*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishLiveEvent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishLiveEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishLiveEvent)
	    }
	} 

	@GET
	@Path("/publishLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishLiveEvent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublisher*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishLiveEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminpublishLiveEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishLiveEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishLiveEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishLiveEvent(tokenId: String, param: MWeeboPublisherAdminpublishLiveEventReq) :MResponsePublisher
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishLiveEvent: String

	/**
	 * Replace the given thumbnails for a published content.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminreplaceThumbnailsReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/replaceThumbnails")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/replaceThumbnails", notes = """Replace the given thumbnails for a published content.""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def replaceThumbnails(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminreplaceThumbnailsReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__replaceThumbnails(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_replaceThumbnails)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_replaceThumbnails)
	    }
	} 

	@GET
	@Path("/replaceThumbnails")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def replaceThumbnails_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__replaceThumbnails(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminreplaceThumbnailsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_replaceThumbnails)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_replaceThumbnails)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __replaceThumbnails(tokenId: String, param: MWeeboPublisherAdminreplaceThumbnailsReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_replaceThumbnails: String

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
	@POST
	@Path("/publishMetaDocument")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishMetaDocument", notes = """Specific function to publish playlists or pagelet contents in Weebo. The content is published in the WEB(Http) channel. 
	//#SWGNL#It is possible to publish the content in multiple channels (ex. STREAM + WEB) but the resource files are not duplicated, but only referenced and the WEB descriptor is automatically generated for the WEB channel.
	//#SWGNL#Playlist and slideshow contents are logical contents with only a special descriptor that detail the url of the elements linked by the playlist or slideshow. These kind of contents could have only thumbnail resources and no ingestion or packaging tasks are involved (only for the thumbnail generation)""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishMetaDocument(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminpublishMetaDocumentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishMetaDocument(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishMetaDocument)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishMetaDocument)
	    }
	} 

	@GET
	@Path("/publishMetaDocument")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishMetaDocument_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishMetaDocument(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminpublishMetaDocumentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishMetaDocument)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishMetaDocument)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishMetaDocument(tokenId: String, param: MWeeboPublisherAdminpublishMetaDocumentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishMetaDocument: String

	/**
	 * Un publish the content from a channel.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @param channelType : String
	 * @return MResponseUnpublishContent
	*/
	@POST
	@Path("/unpublish")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/unpublish", notes = """Un publish the content from a channel.""", response = classOf[MResponseUnpublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def unpublish(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("pContentId")
	pContentId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("channelType")
	channelType: String):Response /*returnType = MResponseUnpublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__unpublish(tokenId,clientId,pContentId,channelType)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_unpublish)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_unpublish)
	    }
	} 

	@GET
	@Path("/unpublish")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def unpublish_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("pContentId")pContentId_q: String, 
			@QueryParam("channelType")channelType_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUnpublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__unpublish(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,pContentId_q,channelType_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_unpublish)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_unpublish)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __unpublish(tokenId: String, clientId: String, pContentId: String, channelType: String) :MResponseUnpublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_unpublish: String

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
	@POST
	@Path("/unpublishLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/unpublishLiveEvent", notes = """Un publish the live event from all channel""", response = classOf[MResponsePublisher])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def unpublishLiveEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("pContentId")
	pContentId: String, 
			//#SWG#@ApiParam(value = """Default is FALSE""")
	@FormParam("discardRecordedFiles")
	discardRecordedFiles: Boolean, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("removeInstances")
	removeInstances: Boolean):Response /*returnType = MResponsePublisher*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__unpublishLiveEvent(tokenId,clientId,pContentId,discardRecordedFiles,removeInstances)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_unpublishLiveEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_unpublishLiveEvent)
	    }
	} 

	@GET
	@Path("/unpublishLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def unpublishLiveEvent_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("pContentId")pContentId_q: String, 
			@QueryParam("discardRecordedFiles")discardRecordedFiles_q: Boolean, 
			@QueryParam("removeInstances")removeInstances_q: Boolean,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublisher*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__unpublishLiveEvent(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,pContentId_q,discardRecordedFiles_q,removeInstances_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_unpublishLiveEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_unpublishLiveEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __unpublishLiveEvent(tokenId: String, clientId: String, pContentId: String, discardRecordedFiles: Boolean, removeInstances: Boolean) :MResponsePublisher
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_unpublishLiveEvent: String

	/**
	 * activate the channel
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @param channelType : String
	 * @return MResponseActivateChannel
	*/
	@POST
	@Path("/activateChannel")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/activateChannel", notes = """activate the channel""", response = classOf[MResponseActivateChannel])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def activateChannel(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("pContentId")
	pContentId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("channelType")
	channelType: String):Response /*returnType = MResponseActivateChannel*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__activateChannel(tokenId,clientId,pContentId,channelType)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_activateChannel)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_activateChannel)
	    }
	} 

	@GET
	@Path("/activateChannel")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def activateChannel_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("pContentId")pContentId_q: String, 
			@QueryParam("channelType")channelType_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseActivateChannel*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__activateChannel(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,pContentId_q,channelType_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_activateChannel)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_activateChannel)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __activateChannel(tokenId: String, clientId: String, pContentId: String, channelType: String) :MResponseActivateChannel
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_activateChannel: String

	/**
	 * deactivate the channel
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @param channelType : String
	 * @return MResponseUnpublishContent
	*/
	@POST
	@Path("/deactivateChannel")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/deactivateChannel", notes = """deactivate the channel""", response = classOf[MResponseUnpublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def deactivateChannel(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("pContentId")
	pContentId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("channelType")
	channelType: String):Response /*returnType = MResponseUnpublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__deactivateChannel(tokenId,clientId,pContentId,channelType)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_deactivateChannel)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_deactivateChannel)
	    }
	} 

	@GET
	@Path("/deactivateChannel")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def deactivateChannel_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("pContentId")pContentId_q: String, 
			@QueryParam("channelType")channelType_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUnpublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__deactivateChannel(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,pContentId_q,channelType_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_deactivateChannel)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_deactivateChannel)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __deactivateChannel(tokenId: String, clientId: String, pContentId: String, channelType: String) :MResponseUnpublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_deactivateChannel: String

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @param channelType : String
	 * @return MResponseGetPublishedContents
	*/
	@GET
	@Path("/getPublishedContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getPublishedContent", notes = """""", response = classOf[MResponseGetPublishedContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getPublishedContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("pContentId")
	pContentId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("channelType")
	channelType: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetPublishedContents*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getPublishedContent") 
		try{	
			val resp = this.__getPublishedContent(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,pContentId,channelType)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getPublishedContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getPublishedContent)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getPublishedContent(tokenId: String, clientId: String, pContentId: String, channelType: String) :MResponseGetPublishedContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getPublishedContent: String

	/**
	 * This service send a CheckTaskMessage to the Publisher actors, and it is used to reactivate the
	 * Publisher task queue.
	 * @param tokenId : String
	 * @return MResponsePublisher
	*/
	@GET
	@Path("/checkPendingtask")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/checkPendingtask", notes = """This service send a CheckTaskMessage to the Publisher actors, and it is used to reactivate the Publisher task queue.""", response = classOf[MResponsePublisher])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def checkPendingtask(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponsePublisher*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("checkPendingtask") 
		try{	
			val resp = this.__checkPendingtask(PRestHelper.getTokenId(tokenId_q, tokenId))
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_checkPendingtask)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_checkPendingtask)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __checkPendingtask(tokenId: String) :MResponsePublisher
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_checkPendingtask: String

	/**
	 * Upload a new SRT File in the CDN  area. SRT Files are stored in 4me/static/srt/pcontentId_<locale>.
	 * srt
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminuploadSrtFileReq
	 * @return MResponseUploadSrtFile
	*/
	@POST
	@Path("/uploadSrtFile")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/uploadSrtFile", notes = """Upload a new SRT File in the CDN  area. SRT Files are stored in 4me/static/srt/pcontentId_<locale>.srt""", response = classOf[MResponseUploadSrtFile])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def uploadSrtFile(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminuploadSrtFileReq):Response /*returnType = MResponseUploadSrtFile*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__uploadSrtFile(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_uploadSrtFile)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_uploadSrtFile)
	    }
	} 

	@GET
	@Path("/uploadSrtFile")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def uploadSrtFile_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUploadSrtFile*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__uploadSrtFile(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminuploadSrtFileReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_uploadSrtFile)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_uploadSrtFile)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __uploadSrtFile(tokenId: String, param: MWeeboPublisherAdminuploadSrtFileReq) :MResponseUploadSrtFile
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_uploadSrtFile: String

	/**
	 * Remove the srt file, specific for the given locale, from the CDN.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdminremoveSrtFileReq
	 * @return MResponsePublisher
	*/
	@POST
	@Path("/removeSrtFile")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeSrtFile", notes = """Remove the srt file, specific for the given locale, from the CDN.""", response = classOf[MResponsePublisher])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeSrtFile(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdminremoveSrtFileReq):Response /*returnType = MResponsePublisher*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeSrtFile(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeSrtFile)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeSrtFile)
	    }
	} 

	@GET
	@Path("/removeSrtFile")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeSrtFile_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublisher*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeSrtFile(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdminremoveSrtFileReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeSrtFile)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeSrtFile)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeSrtFile(tokenId: String, param: MWeeboPublisherAdminremoveSrtFileReq) :MResponsePublisher
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeSrtFile: String

	/**
	 * Get the srt file information for a given content.
	 * @param tokenId : String
	 * @param param : MWeeboPublisherAdmingetSrtFilesReq
	 * @return MResponseGetSrtFile
	*/
	@POST
	@Path("/getSrtFiles")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getSrtFiles", notes = """Get the srt file information for a given content.""", response = classOf[MResponseGetSrtFile])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getSrtFiles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublisherAdmingetSrtFilesReq):Response /*returnType = MResponseGetSrtFile*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getSrtFiles(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getSrtFiles)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getSrtFiles)
	    }
	} 

	@GET
	@Path("/getSrtFiles")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getSrtFiles_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetSrtFile*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getSrtFiles(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublisherAdmingetSrtFilesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getSrtFiles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getSrtFiles)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getSrtFiles(tokenId: String, param: MWeeboPublisherAdmingetSrtFilesReq) :MResponseGetSrtFile
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getSrtFiles: String

	/**
	 * Return the Mcontent object, with all channel information.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pContentId : String
	 * @return MResponseContentDetail
	*/
	@GET
	@Path("/getContentDetail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getContentDetail", notes = """Return the Mcontent object, with all channel information.""", response = classOf[MResponseContentDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getContentDetail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("pContentId")
	pContentId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseContentDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getContentDetail") 
		try{	
			val resp = this.__getContentDetail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,pContentId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContentDetail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentDetail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentDetail(tokenId: String, clientId: String, pContentId: String) :MResponseContentDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentDetail: String

}