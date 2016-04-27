package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.weebo.MResponsePublishContent
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishAudioReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishImageReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishPlayListReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishLiveEventReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishVideoReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishDocumentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishPageletReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishProgramReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublish4MEDocumentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishContentInChannelsReq
import it.newvision.nvp.xadmin.model.MEContentType

import com.sun.jersey.multipart._
/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service provides a set of function to publish a content in one single step
 * on the platform. All methods are asynchronous and specialized over the content
 * type (video, audio, image...). The service offers the ability to publish
 * content to the platform, passing in a single step the metadata, the source file
 * and the published channel. The source file must be added to the platform using
 * the JRepository services (xpackager).
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xadmin/resources/publishinweeboexpress/  </li>
 * </ul>
 */
@Path("/publishinweeboexpress")
//#SWG#@Api(value = "/publishinweeboexpress", description = """This service provides a set of function to publish a content in one single step on the platform. All methods are asynchronous and specialized over the content type (video, audio, image...). The service offers the ability to publish content to the platform, passing in a single step the metadata, the source file and the published channel. The source file must be added to the platform using the JRepository services (xpackager).
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xadmin/resources/publishinweeboexpress/  </li>
//#SWGNL#</ul>""")
trait JPublishInWeeboExpress extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Create a new audio content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishAudioReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishAudio")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishAudio", notes = """Create a new audio content
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishAudio(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublishAudioReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishAudio(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishAudio)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishAudio)
	    }
	} 

	@GET
	@Path("/publishAudio")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishAudio_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishAudio(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublishAudioReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishAudio)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishAudio)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishAudio(tokenId: String, param: MPublishInWeeboExpresspublishAudioReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishAudio: String

	/**
	 * Create a new image content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishImageReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishImage")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishImage", notes = """Create a new image content
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishImage(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublishImageReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishImage(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishImage)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishImage)
	    }
	} 

	@GET
	@Path("/publishImage")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishImage_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishImage(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublishImageReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishImage)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishImage)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishImage(tokenId: String, param: MPublishInWeeboExpresspublishImageReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishImage: String

	/**
	 * Create a new playlist content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishPlayListReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishPlayList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishPlayList", notes = """Create a new playlist content
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishPlayList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublishPlayListReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishPlayList(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishPlayList)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishPlayList)
	    }
	} 

	@GET
	@Path("/publishPlayList")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishPlayList_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishPlayList(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublishPlayListReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishPlayList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishPlayList)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishPlayList(tokenId: String, param: MPublishInWeeboExpresspublishPlayListReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishPlayList: String

	/**
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishLiveEventReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishLiveEvent", notes = """<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishLiveEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublishLiveEventReq):Response /*returnType = MResponsePublishContent*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishLiveEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublishLiveEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishLiveEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishLiveEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishLiveEvent(tokenId: String, param: MPublishInWeeboExpresspublishLiveEventReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishLiveEvent: String

	/**
	 * Create a new video content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishVideoReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishVideo")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishVideo", notes = """Create a new video content
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishVideo(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublishVideoReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishVideo(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishVideo)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishVideo)
	    }
	} 

	@GET
	@Path("/publishVideo")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishVideo_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishVideo(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublishVideoReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishVideo)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishVideo)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishVideo(tokenId: String, param: MPublishInWeeboExpresspublishVideoReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishVideo: String

	/**
	 * Create a new generic content (zip,docs,txt... files)
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishDocumentReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishDocument")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishDocument", notes = """Create a new generic content (zip,docs,txt... files)
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishDocument(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublishDocumentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishDocument(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishDocument)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishDocument)
	    }
	} 

	@GET
	@Path("/publishDocument")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishDocument_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishDocument(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublishDocumentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishDocument)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishDocument)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishDocument(tokenId: String, param: MPublishInWeeboExpresspublishDocumentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishDocument: String

	/**
	 * Create a new pagelet content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishPageletReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishPagelet")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishPagelet", notes = """Create a new pagelet content
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishPagelet(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublishPageletReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishPagelet(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishPagelet)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishPagelet)
	    }
	} 

	@GET
	@Path("/publishPagelet")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishPagelet_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishPagelet(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublishPageletReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishPagelet)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishPagelet)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishPagelet(tokenId: String, param: MPublishInWeeboExpresspublishPageletReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishPagelet: String

	/**
	 * Deprecated
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishProgramReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishProgram")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishProgram", notes = """Deprecated""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishProgram(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublishProgramReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishProgram(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishProgram)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishProgram)
	    }
	} 

	@GET
	@Path("/publishProgram")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishProgram_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishProgram(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublishProgramReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishProgram)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishProgram)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishProgram(tokenId: String, param: MPublishInWeeboExpresspublishProgramReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishProgram: String

	/**
	 * Deprecated.
	 * Publishing function specialized on 4ME Documents. This service is typically used to publish and
	 * convert PDF document to SWF format.
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublish4MEDocumentReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publish4MEDocument")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publish4MEDocument", notes = """Deprecated.
	//#SWGNL#Publishing function specialized on 4ME Documents. This service is typically used to publish and convert PDF document to SWF format.""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publish4MEDocument(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublish4MEDocumentReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publish4MEDocument(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publish4MEDocument)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publish4MEDocument)
	    }
	} 

	@GET
	@Path("/publish4MEDocument")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publish4MEDocument_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publish4MEDocument(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublish4MEDocumentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publish4MEDocument)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publish4MEDocument)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publish4MEDocument(tokenId: String, param: MPublishInWeeboExpresspublish4MEDocumentReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publish4MEDocument: String

	/**
	 * This service is used to publish a content in different channels or using a specific profile (The
	 * profile define a collection of channes for a given content type).
	 * The service return an error if the specified channels are not available for the selected content,
	 * but  can be used to adjust a content to a specific profile, publishing the content on the missing
	 * channels
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishContentInChannelsReq
	 * @return MResponsePublishContent
	*/
	@POST
	@Path("/publishContentInChannels")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/publishContentInChannels", notes = """This service is used to publish a content in different channels or using a specific profile (The profile define a collection of channes for a given content type).
	//#SWGNL#The service return an error if the specified channels are not available for the selected content, but  can be used to adjust a content to a specific profile, publishing the content on the missing channels
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>the service can be invoked only by platform users</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def publishContentInChannels(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPublishInWeeboExpresspublishContentInChannelsReq):Response /*returnType = MResponsePublishContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__publishContentInChannels(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_publishContentInChannels)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_publishContentInChannels)
	    }
	} 

	@GET
	@Path("/publishContentInChannels")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def publishContentInChannels_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__publishContentInChannels(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPublishInWeeboExpresspublishContentInChannelsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_publishContentInChannels)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_publishContentInChannels)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __publishContentInChannels(tokenId: String, param: MPublishInWeeboExpresspublishContentInChannelsReq) :MResponsePublishContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_publishContentInChannels: String

	/**
	 * Deprecated.
	 * Only for clients in old 3.x version.
	 * 
	 * Service used to upload UGC contents and directly call the express publishing service.
	 * Available only as Rest Service (no jsonp call)
	 * <b>Constraint: Max File size = 512MB</b>
	 * 
	 * Example of Form:
	 * <form action="target url" method="post" enctype="multipart/form-data">
	 * <fieldset>
	 * <legend>Upload and Publish a content</legend>
	 * clientId: <input type="text" name="clientId"><br />
	 *  <input type="file" name="fileSource" /><br />
	 * tokenId: <input type="text" name="tokenId"><br />
	 * UserId : <input type="text" name="userId"><br />
	 * Content Name: <input type="text" name="contentName"><br />
	 * Description(Optional): <input type="text" name="contentDescription"><br />
	 * Excerpt(Optional): <input type="text" name="contentExcerpt"><br />
	 * Locale: <input type="text" name="contentLocale"><br />
	 * categoryId: <input type="text" name="categoryId"><br />
	 * Content Type:<br /> <input type="radio" name="contentType" value="IMAGE"/> IMAGE<br />
	 * <input type="radio" name="contentType" value="VIDEO"/> VIDEO<br />
	 * <input type="radio" name="contentType" value="AUDIO"/> AUDIO<br />
	 * Channel Type:(WEB/STREAMHTTPFLASH...) <input type="text" name="channelType"><br />
	 * <input type="submit" value="Submit" /><br />
	 * </fieldset>
	 * </form>
	 * @param clientId : String
	 * @param tokenId : String
	 * @param fileSource : java.io.InputStream
	 * @param cd : com.sun.jersey.core.header.FormDataContentDisposition
	 * @param contentName : String
	 * @param contentDescription : String
	 * Optional
	 * @param contentExcerpt : String
	 * Optional
	 * @param contentLocale : String
	 * @param categoryId : String
	 * Optional. The category Id where the content should be linked.
	 * @param userId : String
	 * Optional
	 * @param contentType : MEContentType
	 * VIDEO/IMAGE/AUDIO...
	 * @param channelType : String
	 * Optional.If null use the profileId parameter
	 * @param profileId : String
	 * Optional. If empty and channelType not specified, will be used the default profile
	 * @return MResponsePublishContent
	*/
	@POST
	                @Path("uploadAndPublish")
	                @Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	                @Consumes(Array(MediaType.MULTIPART_FORM_DATA))
	def uploadAndPublish(@FormDataParam("clientId")
	clientId: String, 
			@FormDataParam("tokenId")
	tokenId: String, 
			@FormDataParam("fileSource")
	fileSource: java.io.InputStream, 
			@FormDataParam("fileSource")
	cd: com.sun.jersey.core.header.FormDataContentDisposition, 
			@FormDataParam("contentName")
	contentName: String, 
			@FormDataParam("contentDescription")
	contentDescription: String, 
			@FormDataParam("contentExcerpt")
	contentExcerpt: String, 
			@FormDataParam("contentLocale")
	contentLocale: String, 
			@FormDataParam("categoryId")
	categoryId: String, 
			@FormDataParam("userId")
	userId: String, 
			@FormDataParam("contentType")
	contentType: MEContentType, 
			@FormDataParam("channelType")
	channelType: String, 
			@FormDataParam("profileId")
	profileId: String):Response /*returnType = MResponsePublishContent*/ 

}