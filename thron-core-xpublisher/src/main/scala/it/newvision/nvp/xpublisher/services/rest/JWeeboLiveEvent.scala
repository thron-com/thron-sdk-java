package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xpublisher.services.model.liveEvents.MResponseEventDetail
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventdetailLiveEventReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventupdatePublicHostnameEntriesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@Path("/weeboliveevent")
//#SWG#@Api(value = "/weeboliveevent", description = """""")
trait JWeeboLiveEvent extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * The service return all event details, about the event host.
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventdetailLiveEventReq
	 * @return MResponseEventDetail
	*/
	@POST
	@Path("/detailLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/detailLiveEvent", notes = """The service return all event details, about the event host.""", response = classOf[MResponseEventDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detailLiveEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboLiveEventdetailLiveEventReq):Response /*returnType = MResponseEventDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__detailLiveEvent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_detailLiveEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_detailLiveEvent)
	    }
	} 

	@GET
	@Path("/detailLiveEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def detailLiveEvent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__detailLiveEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboLiveEventdetailLiveEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_detailLiveEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detailLiveEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detailLiveEvent(tokenId: String, param: MWeeboLiveEventdetailLiveEventReq) :MResponseEventDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detailLiveEvent: String

	/**
	 * the service update the public hostname entries. PublicHostname are used to provide the descriptor
	 * urls of the events.
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventupdatePublicHostnameEntriesReq
	 * @return MResponseEventDetail
	*/
	@POST
	@Path("/updatePublicHostnameEntries")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updatePublicHostnameEntries", notes = """the service update the public hostname entries. PublicHostname are used to provide the descriptor urls of the events.""", response = classOf[MResponseEventDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updatePublicHostnameEntries(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboLiveEventupdatePublicHostnameEntriesReq):Response /*returnType = MResponseEventDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updatePublicHostnameEntries(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updatePublicHostnameEntries)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updatePublicHostnameEntries)
	    }
	} 

	@GET
	@Path("/updatePublicHostnameEntries")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updatePublicHostnameEntries_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updatePublicHostnameEntries(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboLiveEventupdatePublicHostnameEntriesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updatePublicHostnameEntries)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updatePublicHostnameEntries)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updatePublicHostnameEntries(tokenId: String, param: MWeeboLiveEventupdatePublicHostnameEntriesReq) :MResponseEventDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updatePublicHostnameEntries: String

}