package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xpublisher.services.model.liveEvents.MResponseEventDetail
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventAdmincreateNewLiveEventReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventAdminupdateLiveEventReq
import it.newvision.nvp.xpublisher.services.model.response.MResponsePublisher
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventAdminremoveLiveEventReq

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
 * 	<li>REST: http://<clientId>-view.4me.it/api/adxpublisher/resources/application.
 * wadl</li>
 * 	<li>WSDL:http://<clientId>-view.4me.
 * it/api/adxpublisher/services/FWeeboPublisher?wsdl</li>
 * </ul>
 */
@Path("/weeboliveeventadmin")
//#SWG#@Api(value = "/weeboliveeventadmin", description = """""")
trait JWeeboLiveEventAdmin extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * default function to create a new live event content in Weebo. The content is published in the
	 * WEB(Http) channel. 
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventAdmincreateNewLiveEventReq
	 * @return MResponseEventDetail
	*/
	@POST
	@Path("/createNewLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/createNewLiveEvent", notes = """default function to create a new live event content in Weebo. The content is published in the WEB(Http) channel. """, response = classOf[MResponseEventDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def createNewLiveEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboLiveEventAdmincreateNewLiveEventReq):Response /*returnType = MResponseEventDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__createNewLiveEvent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_createNewLiveEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_createNewLiveEvent)
	    }
	} 

	@GET
	@Path("/createNewLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def createNewLiveEvent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__createNewLiveEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboLiveEventAdmincreateNewLiveEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_createNewLiveEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_createNewLiveEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __createNewLiveEvent(tokenId: String, param: MWeeboLiveEventAdmincreateNewLiveEventReq) :MResponseEventDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_createNewLiveEvent: String

	/**
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventAdminupdateLiveEventReq
	 * @return MResponseEventDetail
	*/
	@POST
	@Path("/updateLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateLiveEvent", notes = """""", response = classOf[MResponseEventDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateLiveEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboLiveEventAdminupdateLiveEventReq):Response /*returnType = MResponseEventDetail*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateLiveEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboLiveEventAdminupdateLiveEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateLiveEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateLiveEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateLiveEvent(tokenId: String, param: MWeeboLiveEventAdminupdateLiveEventReq) :MResponseEventDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateLiveEvent: String

	/**
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventAdminremoveLiveEventReq
	 * @return MResponsePublisher
	*/
	@POST
	@Path("/removeLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeLiveEvent", notes = """""", response = classOf[MResponsePublisher])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeLiveEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboLiveEventAdminremoveLiveEventReq):Response /*returnType = MResponsePublisher*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeLiveEvent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeLiveEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeLiveEvent)
	    }
	} 

	@GET
	@Path("/removeLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeLiveEvent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublisher*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeLiveEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboLiveEventAdminremoveLiveEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeLiveEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeLiveEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeLiveEvent(tokenId: String, param: MWeeboLiveEventAdminremoveLiveEventReq) :MResponsePublisher
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeLiveEvent: String

}