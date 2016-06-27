package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
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
/**
 * This service define all functions used to publish different type of contents in
 * the platform. You can use this interface to publish Images, audio, video and
 * other kind of contents. Most of these functions are asynchronous.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xadmin/resources/publishingprocess </li>
 * </ul>
 */
@Path("/publishingprocess")
//#SWG#@Api(value = "/publishingprocess", description = """This service define all functions used to publish different type of contents in the platform. You can use this interface to publish Images, audio, video and other kind of contents. Most of these functions are asynchronous.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xadmin/resources/publishingprocess </li>
//#SWGNL#</ul>""")
trait JPublishingProcess extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

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
	@POST
	@Path("/newContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/newContent", notes = """First step of a publishing process. The service create a new empty content in platform linked to a specific source file.
	//#SWGNL#To easily create and publish a content in the platform use the services of JPublishInWeeboExpress.
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def newContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessnewContentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__newContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_newContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_newContent)
	    }
	} 

	@GET
	@Path("/newContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def newContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__newContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessnewContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_newContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_newContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __newContent(tokenId: String, param: MPublishingProcessnewContentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_newContent: String

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
	@POST
	@Path("/newPageletContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/newPageletContent", notes = """First step of a publishing process, used to create a new content of type PAGELET (contents without source file, but with a body in html or other formats, readable by the player).
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def newPageletContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessnewPageletContentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__newPageletContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_newPageletContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_newPageletContent)
	    }
	} 

	@GET
	@Path("/newPageletContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def newPageletContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__newPageletContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessnewPageletContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_newPageletContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_newPageletContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __newPageletContent(tokenId: String, param: MPublishingProcessnewPageletContentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_newPageletContent: String

	/**
	 * Used to update the content body of a PAGELET document.
	 * @param tokenId : String
	 * @param param : MPublishingProcessupdatePageletContentReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/updatePageletContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updatePageletContent", notes = """Used to update the content body of a PAGELET document.""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updatePageletContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessupdatePageletContentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updatePageletContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updatePageletContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updatePageletContent)
	    }
	} 

	@GET
	@Path("/updatePageletContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updatePageletContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updatePageletContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessupdatePageletContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updatePageletContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updatePageletContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updatePageletContent(tokenId: String, param: MPublishingProcessupdatePageletContentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updatePageletContent: String

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
	@POST
	@Path("/newLiveEventContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/newLiveEventContent", notes = """First step of a publishing process for a LIVE EVENT content. The User create a new Live Event Content. The service create a content in xcontents (MContent), a new content in xpublisher (MContent) and prepare the environment for the publishing process.
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def newLiveEventContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessnewLiveEventContentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__newLiveEventContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_newLiveEventContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_newLiveEventContent)
	    }
	} 

	@GET
	@Path("/newLiveEventContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def newLiveEventContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__newLiveEventContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessnewLiveEventContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_newLiveEventContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_newLiveEventContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __newLiveEventContent(tokenId: String, param: MPublishingProcessnewLiveEventContentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_newLiveEventContent: String

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
	@POST
	@Path("/newPlayListContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/newPlayListContent", notes = """First step of the publishing process for a PLAYLIST content. The User create a new PlayList Content, linked to a set of source files. The service create a content and prepare the environment for the publishing process.
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def newPlayListContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessnewPlayListContentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__newPlayListContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_newPlayListContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_newPlayListContent)
	    }
	} 

	@GET
	@Path("/newPlayListContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def newPlayListContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__newPlayListContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessnewPlayListContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_newPlayListContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_newPlayListContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __newPlayListContent(tokenId: String, param: MPublishingProcessnewPlayListContentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_newPlayListContent: String

	/**
	 * This service activate the ingestion process of the content for a specific channel. Once the content
	 * is ready (converted in right format),the content can be published using the service
	 * "publishChannel". This service is <b>ASYNCHRONOUS</b>!
	 * @param tokenId : String
	 * @param param : MPublishingProcesscreateContentForChannelReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/createContentForChannel")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/createContentForChannel", notes = """This service activate the ingestion process of the content for a specific channel. Once the content is ready (converted in right format),the content can be published using the service "publishChannel". This service is <b>ASYNCHRONOUS</b>!""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def createContentForChannel(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcesscreateContentForChannelReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__createContentForChannel(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_createContentForChannel)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_createContentForChannel)
	    }
	} 

	@GET
	@Path("/createContentForChannel")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def createContentForChannel_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__createContentForChannel(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcesscreateContentForChannelReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_createContentForChannel)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_createContentForChannel)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __createContentForChannel(tokenId: String, param: MPublishingProcesscreateContentForChannelReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_createContentForChannel: String

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
	@POST
	@Path("/publishChannel")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishChannel", notes = """Publish a content created for a specific channel. Once the content is ready (packaged), it can be published in CDN. This function is ASYNCHRONOUS!
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishChannel(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcesspublishChannelReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishChannel(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishChannel)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishChannel)
	    }
	} 

	@GET
	@Path("/publishChannel")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishChannel_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishChannel(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcesspublishChannelReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishChannel)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishChannel)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishChannel(tokenId: String, param: MPublishingProcesspublishChannelReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishChannel: String

	/**
	 * Activate/deactivate a published channel. Works only for published channels
	 * @param tokenId : String
	 * @param param : MPublishingProcesschangeChannelStatusReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/changeChannelStatus")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/changeChannelStatus", notes = """Activate/deactivate a published channel. Works only for published channels""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def changeChannelStatus(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcesschangeChannelStatusReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__changeChannelStatus(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_changeChannelStatus)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_changeChannelStatus)
	    }
	} 

	@GET
	@Path("/changeChannelStatus")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def changeChannelStatus_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__changeChannelStatus(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcesschangeChannelStatusReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_changeChannelStatus)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_changeChannelStatus)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __changeChannelStatus(tokenId: String, param: MPublishingProcesschangeChannelStatusReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_changeChannelStatus: String

	/**
	 * Remove a specific channel. remove all files and resources published in CDN (only for the specified
	 * channel). The content is not removed from the platform
	 * @param tokenId : String
	 * @param param : MPublishingProcessremoveChannelReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/removeChannel")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeChannel", notes = """Remove a specific channel. remove all files and resources published in CDN (only for the specified channel). The content is not removed from the platform""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeChannel(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessremoveChannelReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeChannel(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeChannel)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeChannel)
	    }
	} 

	@GET
	@Path("/removeChannel")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeChannel_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeChannel(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessremoveChannelReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeChannel)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeChannel)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeChannel(tokenId: String, param: MPublishingProcessremoveChannelReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeChannel: String

	/**
	 * Unpublish (Remove) a content from the Platform. Remove the content metadata in xcontent and
	 * unpublish all resources (files) in CDN.
	 * @param tokenId : String
	 * @param param : MPublishingProcessunpublishContentReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/unpublishContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/unpublishContent", notes = """Unpublish (Remove) a content from the Platform. Remove the content metadata in xcontent and unpublish all resources (files) in CDN.""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def unpublishContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessunpublishContentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__unpublishContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_unpublishContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_unpublishContent)
	    }
	} 

	@GET
	@Path("/unpublishContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def unpublishContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__unpublishContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessunpublishContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_unpublishContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_unpublishContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __unpublishContent(tokenId: String, param: MPublishingProcessunpublishContentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_unpublishContent: String

	/**
	 * change the thumbnail for a published content, replacing the thumbnail files in the published folder.
	 * @param tokenId : String
	 * @param param : MPublishingProcessreplaceThumbnailInPublishedContentReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/replaceThumbnailInPublishedContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/replaceThumbnailInPublishedContent", notes = """change the thumbnail for a published content, replacing the thumbnail files in the published folder.""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def replaceThumbnailInPublishedContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessreplaceThumbnailInPublishedContentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__replaceThumbnailInPublishedContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_replaceThumbnailInPublishedContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_replaceThumbnailInPublishedContent)
	    }
	} 

	@GET
	@Path("/replaceThumbnailInPublishedContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def replaceThumbnailInPublishedContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__replaceThumbnailInPublishedContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessreplaceThumbnailInPublishedContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_replaceThumbnailInPublishedContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_replaceThumbnailInPublishedContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __replaceThumbnailInPublishedContent(tokenId: String, param: MPublishingProcessreplaceThumbnailInPublishedContentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_replaceThumbnailInPublishedContent: String

	/**
	 * Update the restriction properties for the published content.
	 * @param tokenId : String
	 * @param param : MPublishingProcessupdatePublishingPropertiesReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/updatePublishingProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updatePublishingProperties", notes = """Update the restriction properties for the published content.""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updatePublishingProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessupdatePublishingPropertiesReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updatePublishingProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updatePublishingProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updatePublishingProperties)
	    }
	} 

	@GET
	@Path("/updatePublishingProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updatePublishingProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updatePublishingProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessupdatePublishingPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updatePublishingProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updatePublishingProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updatePublishingProperties(tokenId: String, param: MPublishingProcessupdatePublishingPropertiesReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updatePublishingProperties: String

	/**
	 * This service is used to know the possible platform content type available for a given filename. The
	 * service map the mime type of filename to the corresponding list of content types.
	 * For example the file with name "myvideo.mp4" can be published as VIDEO or OTHER content.
	 * @param tokenId : String
	 * @param param : MPublishingProcessgetContentTypesReq
	 * @return MResponseGetContentTypes
	*/
	@POST
	@Path("/getContentTypes")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getContentTypes", notes = """This service is used to know the possible platform content type available for a given filename. The service map the mime type of filename to the corresponding list of content types.
	//#SWGNL#For example the file with name "myvideo.mp4" can be published as VIDEO or OTHER content.""", response = classOf[MResponseGetContentTypes])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getContentTypes(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishingProcessgetContentTypesReq):Response /*returnType = MResponseGetContentTypes*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getContentTypes(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getContentTypes)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getContentTypes)
	    }
	} 

	@GET
	@Path("/getContentTypes")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getContentTypes_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetContentTypes*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getContentTypes(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishingProcessgetContentTypesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getContentTypes)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentTypes)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentTypes(tokenId: String, param: MPublishingProcessgetContentTypesReq) :MResponseGetContentTypes
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentTypes: String

}