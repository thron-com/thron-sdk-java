package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.client.MResponseUpdateClient
import it.newvision.nvp.xcontents.services.model.request.MClientupdateAuditDurationDaysReq
import it.newvision.nvp.xcontents.services.model.request.MClientupdateSecureConnectionEnabledReq
import it.newvision.nvp.xcontents.services.model.request.MClientupdateTrashPropertiesReq
import it.newvision.nvp.xcontents.services.model.client.MResponseDetailClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service is used to update the client properties of xcontent.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/client    </li>
 * </ul>
 */
@Path("/client")
//#SWG#@Api(value = "/client", description = """This service is used to update the client properties of xcontent. 
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>   
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/client    </li>
//#SWGNL#</ul>""")
trait JClient extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * update audit duration days
	 * @param tokenId : String
	 * @param param : MClientupdateAuditDurationDaysReq
	 * @return MResponseUpdateClient
	*/
	@POST
	@Path("/updateAuditDurationDays")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateAuditDurationDays", notes = """update audit duration days""", response = classOf[MResponseUpdateClient])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateAuditDurationDays(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MClientupdateAuditDurationDaysReq):Response /*returnType = MResponseUpdateClient*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateAuditDurationDays(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateAuditDurationDays)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateAuditDurationDays)
	    }
	} 

	@GET
	@Path("/updateAuditDurationDays")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateAuditDurationDays_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateClient*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateAuditDurationDays",this._getCacheControl) 
		try{
			val resp = this.__updateAuditDurationDays(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MClientupdateAuditDurationDaysReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateAuditDurationDays)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateAuditDurationDays)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateAuditDurationDays(tokenId: String, param: MClientupdateAuditDurationDaysReq) :MResponseUpdateClient
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateAuditDurationDays: String

	/**
	 * update secure connection enabled
	 * @param tokenId : String
	 * @param param : MClientupdateSecureConnectionEnabledReq
	 * @return MResponseUpdateClient
	*/
	@POST
	@Path("/updateSecureConnectionEnabled")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateSecureConnectionEnabled", notes = """update secure connection enabled""", response = classOf[MResponseUpdateClient])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateSecureConnectionEnabled(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MClientupdateSecureConnectionEnabledReq):Response /*returnType = MResponseUpdateClient*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateSecureConnectionEnabled(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateSecureConnectionEnabled)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateSecureConnectionEnabled)
	    }
	} 

	@GET
	@Path("/updateSecureConnectionEnabled")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateSecureConnectionEnabled_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateClient*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateSecureConnectionEnabled",this._getCacheControl) 
		try{
			val resp = this.__updateSecureConnectionEnabled(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MClientupdateSecureConnectionEnabledReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateSecureConnectionEnabled)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateSecureConnectionEnabled)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateSecureConnectionEnabled(tokenId: String, param: MClientupdateSecureConnectionEnabledReq) :MResponseUpdateClient
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateSecureConnectionEnabled: String

	/**
	 * update trash properties
	 * @param tokenId : String
	 * @param param : MClientupdateTrashPropertiesReq
	 * @return MResponseUpdateClient
	*/
	@POST
	@Path("/updateTrashProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateTrashProperties", notes = """update trash properties""", response = classOf[MResponseUpdateClient])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateTrashProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MClientupdateTrashPropertiesReq):Response /*returnType = MResponseUpdateClient*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateTrashProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateTrashProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateTrashProperties)
	    }
	} 

	@GET
	@Path("/updateTrashProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateTrashProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateClient*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateTrashProperties",this._getCacheControl) 
		try{
			val resp = this.__updateTrashProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MClientupdateTrashPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateTrashProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateTrashProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateTrashProperties(tokenId: String, param: MClientupdateTrashPropertiesReq) :MResponseUpdateClient
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateTrashProperties: String

	/**
	 * Return all client properties information
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseDetailClient
	*/
	@GET
	@Path("/detailClient")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detailClient", notes = """Return all client properties information""", response = classOf[MResponseDetailClient])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detailClient(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDetailClient*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detailClient") 
		try{	
			val resp = this.__detailClient(PRestHelper.getTokenId(tokenId_q, tokenId),clientId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detailClient)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detailClient)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detailClient(tokenId: String, clientId: String) :MResponseDetailClient
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detailClient: String

}