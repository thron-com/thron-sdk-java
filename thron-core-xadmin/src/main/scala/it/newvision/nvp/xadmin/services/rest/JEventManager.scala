package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.eventmanager.MResponseEventManagerDetail
import it.newvision.nvp.xadmin.services.model.request.MEventManagerstartEventReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerforceRestartEventReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagergetLiveEventDetailReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerupdateLiveEventReq
import it.newvision.nvp.xadmin.services.model.request.MEventManageraddClientStreamWithPasswordReq
import it.newvision.nvp.xadmin.services.model.request.MEventManageraddClientStreamsReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerremoveClientStreamsReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerchangeClientStreamPreviewReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerchangeClientStreamInMuxingReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerstartRecordingReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerstopRecordingReq
import it.newvision.nvp.xadmin.services.model.eventmanager.MResponseEventManager
import it.newvision.nvp.xadmin.services.model.request.MEventManagerstopLiveEventReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service define all functions to manage a live event:
 * <ul>
 * 	<li>start and stop a live event </li>
 * 	<li>manage the preview stream on ON AIR Live events</li>
 * 	<li>manage the stream to show in live event</li>
 * 	<li>add and remove new input streams</li>
 * </ul>
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xadmin/resources/eventmanager</li>
 * </ul>
 */
@Path("/eventmanager")
//#SWG#@Api(value = "/eventmanager", description = """This service define all functions to manage a live event:
//#SWGNL#<ul>
//#SWGNL#	<li>start and stop a live event </li>
//#SWGNL#	<li>manage the preview stream on ON AIR Live events</li>
//#SWGNL#	<li>manage the stream to show in live event</li>
//#SWGNL#	<li>add and remove new input streams</li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xadmin/resources/eventmanager</li>
//#SWGNL#</ul>""")
trait JEventManager extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * the service starts the necessary resources for a new live event.
	 * The operation is asynchronous and the live event will be active when the media content is in status
	 * PUBLISHED.
	 * A Live Event is like the other 4ME Contents, and when the media content is in state PUBLISHED means
	 * that the live event is ready/on air, otherwise the live event is not active. 
	 * @param tokenId : String
	 * @param param : MEventManagerstartEventReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/startEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/startEvent", notes = """the service starts the necessary resources for a new live event.
	//#SWGNL#The operation is asynchronous and the live event will be active when the media content is in status PUBLISHED.
	//#SWGNL#A Live Event is like the other 4ME Contents, and when the media content is in state PUBLISHED means that the live event is ready/on air, otherwise the live event is not active. """, response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def startEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerstartEventReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__startEvent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_startEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_startEvent)
	    }
	} 

	@GET
	@Path("/startEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def startEvent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__startEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerstartEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_startEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_startEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __startEvent(tokenId: String, param: MEventManagerstartEventReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_startEvent: String

	/**
	 * The service try to stop and start a configured live event.
	 * With this operation the platform allocate new resources for the given live event.
	 * @param tokenId : String
	 * @param param : MEventManagerforceRestartEventReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/forceRestartEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/forceRestartEvent", notes = """The service try to stop and start a configured live event. 
	//#SWGNL#With this operation the platform allocate new resources for the given live event.""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def forceRestartEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerforceRestartEventReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__forceRestartEvent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_forceRestartEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_forceRestartEvent)
	    }
	} 

	@GET
	@Path("/forceRestartEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def forceRestartEvent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__forceRestartEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerforceRestartEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_forceRestartEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_forceRestartEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __forceRestartEvent(tokenId: String, param: MEventManagerforceRestartEventReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_forceRestartEvent: String

	/**
	 * Return the live event detail for an active / on air live event.
	 * This service can be called only to ON AIR live events.
	 * @param tokenId : String
	 * @param param : MEventManagergetLiveEventDetailReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/getLiveEventDetail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getLiveEventDetail", notes = """Return the live event detail for an active / on air live event.
	//#SWGNL#This service can be called only to ON AIR live events.""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getLiveEventDetail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagergetLiveEventDetailReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getLiveEventDetail(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getLiveEventDetail)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getLiveEventDetail)
	    }
	} 

	@GET
	@Path("/getLiveEventDetail")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getLiveEventDetail_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getLiveEventDetail(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagergetLiveEventDetailReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getLiveEventDetail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getLiveEventDetail)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getLiveEventDetail(tokenId: String, param: MEventManagergetLiveEventDetailReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getLiveEventDetail: String

	/**
	 * This service is used to update the validTo live event attributes that is used to change the live
	 * event end time. This service can be called only to ON AIR live events.
	 * @param tokenId : String
	 * @param param : MEventManagerupdateLiveEventReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/updateLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateLiveEvent", notes = """This service is used to update the validTo live event attributes that is used to change the live event end time. This service can be called only to ON AIR live events.""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateLiveEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerupdateLiveEventReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateLiveEvent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateLiveEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateLiveEvent)
	    }
	} 

	@GET
	@Path("/updateLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateLiveEvent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateLiveEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerupdateLiveEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateLiveEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateLiveEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateLiveEvent(tokenId: String, param: MEventManagerupdateLiveEventReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateLiveEvent: String

	/**
	 * Used to add a new clientStream to an active live event and return the detail of the live event with
	 * the list of client streams and password.
	 * This service can be called only to ON AIR live events.
	 * ClientStreams can only contain [0-9a-zA-Z-_] characters
	 * @param tokenId : String
	 * @param param : MEventManageraddClientStreamWithPasswordReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/addClientStreamWithPassword")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addClientStreamWithPassword", notes = """Used to add a new clientStream to an active live event and return the detail of the live event with the list of client streams and password.
	//#SWGNL#This service can be called only to ON AIR live events.
	//#SWGNL#ClientStreams can only contain [0-9a-zA-Z-_] characters""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addClientStreamWithPassword(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManageraddClientStreamWithPasswordReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addClientStreamWithPassword(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addClientStreamWithPassword)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addClientStreamWithPassword)
	    }
	} 

	@GET
	@Path("/addClientStreamWithPassword")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addClientStreamWithPassword_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addClientStreamWithPassword(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManageraddClientStreamWithPasswordReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addClientStreamWithPassword)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addClientStreamWithPassword)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addClientStreamWithPassword(tokenId: String, param: MEventManageraddClientStreamWithPasswordReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addClientStreamWithPassword: String

	/**
	 * Used to add a new clientStream to an active live event and return the detail of the live event with
	 * the list of client streams and password.
	 * This service can be called only to ON AIR live events.
	 * ClientStreams can only contain [0-9a-zA-Z-_] characters
	 * @param tokenId : String
	 * @param param : MEventManageraddClientStreamsReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/addClientStreams")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addClientStreams", notes = """Used to add a new clientStream to an active live event and return the detail of the live event with the list of client streams and password.
	//#SWGNL#This service can be called only to ON AIR live events.
	//#SWGNL#ClientStreams can only contain [0-9a-zA-Z-_] characters""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addClientStreams(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManageraddClientStreamsReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addClientStreams(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addClientStreams)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addClientStreams)
	    }
	} 

	@GET
	@Path("/addClientStreams")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addClientStreams_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addClientStreams(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManageraddClientStreamsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addClientStreams)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addClientStreams)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addClientStreams(tokenId: String, param: MEventManageraddClientStreamsReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addClientStreams: String

	/**
	 * Used to remove a clientStream from an active live event.
	 * This service can be called only to ON AIR live events.
	 * ClientStreams can only contain [0-9a-zA-Z-_] characters
	 * @param tokenId : String
	 * @param param : MEventManagerremoveClientStreamsReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/removeClientStreams")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeClientStreams", notes = """Used to remove a clientStream from an active live event.
	//#SWGNL#This service can be called only to ON AIR live events.
	//#SWGNL#ClientStreams can only contain [0-9a-zA-Z-_] characters""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeClientStreams(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerremoveClientStreamsReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeClientStreams(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeClientStreams)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeClientStreams)
	    }
	} 

	@GET
	@Path("/removeClientStreams")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeClientStreams_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeClientStreams(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerremoveClientStreamsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeClientStreams)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeClientStreams)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeClientStreams(tokenId: String, param: MEventManagerremoveClientStreamsReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeClientStreams: String

	/**
	 * Used to switch the client stream in preview with another clientStream.
	 * This service can be called only to ON AIR live events.
	 * To remove from preview a clientStream, the "clientStreamInPreview" parameter must be blank.
	 * @param tokenId : String
	 * @param param : MEventManagerchangeClientStreamPreviewReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/changeClientStreamPreview")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/changeClientStreamPreview", notes = """Used to switch the client stream in preview with another clientStream. 
	//#SWGNL#This service can be called only to ON AIR live events.
	//#SWGNL#To remove from preview a clientStream, the "clientStreamInPreview" parameter must be blank.""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def changeClientStreamPreview(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerchangeClientStreamPreviewReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__changeClientStreamPreview(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_changeClientStreamPreview)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_changeClientStreamPreview)
	    }
	} 

	@GET
	@Path("/changeClientStreamPreview")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def changeClientStreamPreview_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__changeClientStreamPreview(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerchangeClientStreamPreviewReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_changeClientStreamPreview)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_changeClientStreamPreview)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __changeClientStreamPreview(tokenId: String, param: MEventManagerchangeClientStreamPreviewReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_changeClientStreamPreview: String

	/**
	 * Used to switch the client stream in muxing with another clientStream.
	 * This service can be called only to ON AIR live events.
	 * To remove from muxing a clientStream, the "clientStreamInMuxing" parameter must be blank.
	 * @param tokenId : String
	 * @param param : MEventManagerchangeClientStreamInMuxingReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/changeClientStreamInMuxing")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/changeClientStreamInMuxing", notes = """Used to switch the client stream in muxing with another clientStream. 
	//#SWGNL#This service can be called only to ON AIR live events.
	//#SWGNL#To remove from muxing a clientStream, the "clientStreamInMuxing" parameter must be blank.""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def changeClientStreamInMuxing(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerchangeClientStreamInMuxingReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__changeClientStreamInMuxing(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_changeClientStreamInMuxing)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_changeClientStreamInMuxing)
	    }
	} 

	@GET
	@Path("/changeClientStreamInMuxing")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def changeClientStreamInMuxing_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__changeClientStreamInMuxing(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerchangeClientStreamInMuxingReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_changeClientStreamInMuxing)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_changeClientStreamInMuxing)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __changeClientStreamInMuxing(tokenId: String, param: MEventManagerchangeClientStreamInMuxingReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_changeClientStreamInMuxing: String

	/**
	 * start to record the live event.
	 * @param tokenId : String
	 * @param param : MEventManagerstartRecordingReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/startRecording")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/startRecording", notes = """start to record the live event.""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def startRecording(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerstartRecordingReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__startRecording(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_startRecording)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_startRecording)
	    }
	} 

	@GET
	@Path("/startRecording")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def startRecording_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__startRecording(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerstartRecordingReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_startRecording)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_startRecording)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __startRecording(tokenId: String, param: MEventManagerstartRecordingReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_startRecording: String

	/**
	 * stop to record the live event
	 * @param tokenId : String
	 * @param param : MEventManagerstopRecordingReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/stopRecording")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/stopRecording", notes = """stop to record the live event""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def stopRecording(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerstopRecordingReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__stopRecording(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_stopRecording)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_stopRecording)
	    }
	} 

	@GET
	@Path("/stopRecording")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def stopRecording_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__stopRecording(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerstopRecordingReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_stopRecording)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_stopRecording)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __stopRecording(tokenId: String, param: MEventManagerstopRecordingReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_stopRecording: String

	/**
	 * The service stop the live event, stop the event recorded (if started), and decommission the
	 * resources.The service can publish a new Video Content using the recorded file of the live event.
	 * @param tokenId : String
	 * @param param : MEventManagerstopLiveEventReq
	 * @return MResponseEventManager
	*/
	@POST
	@Path("/stopLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/stopLiveEvent", notes = """The service stop the live event, stop the event recorded (if started), and decommission the resources.The service can publish a new Video Content using the recorded file of the live event.""", response = classOf[MResponseEventManager])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def stopLiveEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerstopLiveEventReq):Response /*returnType = MResponseEventManager*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__stopLiveEvent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_stopLiveEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_stopLiveEvent)
	    }
	} 

	@GET
	@Path("/stopLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def stopLiveEvent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManager*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__stopLiveEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerstopLiveEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_stopLiveEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_stopLiveEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __stopLiveEvent(tokenId: String, param: MEventManagerstopLiveEventReq) :MResponseEventManager
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_stopLiveEvent: String

}