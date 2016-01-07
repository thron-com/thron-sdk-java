package com.thron.contacts.service.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import com.thron.contacts.service.model.contact.MResponseDeviceConnect
import com.thron.contacts.service.model.request.MDeviceconnectReq
import com.thron.contacts.service.model.request.MDevicedisconnectReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to connect the user (device) to a contact and get the deviceId.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-device.thron.
 * com/api/xdevice/resources/device</li>
 * </ul>
 */
@Path("/device")
//#SWG#@Api(value = "/device", description = """Service used to connect the user (device) to a contact and get the deviceId.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-device.thron.com/api/xdevice/resources/device</li>
//#SWGNL#</ul>""")
trait JDevice extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Connect a Device to a Contact with the given identityKey.
	 * If there are no contacts matching the identityKey, a new contact is created.
	 * @param tokenId : String
	 * @param param : MDeviceconnectReq
	 * @return MResponseDeviceConnect
	*/
	@POST
	@Path("/connect")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/connect", notes = """Connect a Device to a Contact with the given identityKey. 
	//#SWGNL#If there are no contacts matching the identityKey, a new contact is created.""", response = classOf[MResponseDeviceConnect])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def connect(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDeviceconnectReq):Response /*returnType = MResponseDeviceConnect*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__connect(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_connect)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_connect)
	    }
	} 

	@GET
	@Path("/connect")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def connect_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDeviceConnect*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__connect(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDeviceconnectReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_connect)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_connect)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __connect(tokenId: String, param: MDeviceconnectReq) :MResponseDeviceConnect
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_connect: String

	/**
	 * Called by a client to disconnect a device from a given contact. The service return the Contact
	 * information identified in the platform.
	 * If the device was connected to an IDENTIFIED Contact, an ANONYMOUS Contact will be created.
	 * @param tokenId : String
	 * @param param : MDevicedisconnectReq
	 * @return MResponseDeviceConnect
	*/
	@POST
	@Path("/disconnect")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/disconnect", notes = """Called by a client to disconnect a device from a given contact. The service return the Contact information identified in the platform.
	//#SWGNL#If the device was connected to an IDENTIFIED Contact, an ANONYMOUS Contact will be created.""", response = classOf[MResponseDeviceConnect])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def disconnect(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDevicedisconnectReq):Response /*returnType = MResponseDeviceConnect*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__disconnect(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_disconnect)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_disconnect)
	    }
	} 

	@GET
	@Path("/disconnect")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def disconnect_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDeviceConnect*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__disconnect(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDevicedisconnectReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_disconnect)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_disconnect)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __disconnect(tokenId: String, param: MDevicedisconnectReq) :MResponseDeviceConnect
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_disconnect: String

	/**
	 * Called by a client to get a unique contact Id. The service returns the deviceId and the contactId
	 * used by tracker.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param deviceId : String
	 * Optional
	 * @return MResponseDeviceConnect
	*/
	@GET
	@Path("/get/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/get", notes = """Called by a client to get a unique contact Id. The service returns the deviceId and the contactId used by tracker.""", response = classOf[MResponseDeviceConnect])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def get(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("deviceId")
	deviceId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeviceConnect*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("get") 
		try{	
			val resp = this.__get(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,deviceId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_get)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_get)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __get(tokenId: String, clientId: String, deviceId: String) :MResponseDeviceConnect
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_get: String

}