package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.identity.services.model.user.MResponseUser
import it.newvision.nvp.identity.services.model.request.MUserManagercreateReq
import it.newvision.nvp.identity.services.model.user.MResponseUserDetail
import it.newvision.nvp.identity.services.model.request.MUserManagerdetailReq
import it.newvision.nvp.identity.services.model.user.MResponseUserFindByProperties
import it.newvision.nvp.identity.services.model.request.MUserManagerfindByPropertiesReq
import it.newvision.nvp.identity.services.model.user.MResponseUserNumberOfUsers
import it.newvision.nvp.identity.services.model.user.MResponseUserAllUsername

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service provides the low level function to create new user , and store the
 * username and password necessary for the authentication services.
 * 
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xsso/resources/usermanager</li>
 * </ul>
 */
@Path("/usermanager")
//#SWG#@Api(value = "/usermanager", description = """This service provides the low level function to create new user , and store the username and password necessary for the authentication services.
//#SWGNL#
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xsso/resources/usermanager</li>
//#SWGNL#</ul>""")
trait JUserManager extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * DEPRECATED
	 * @param tokenId : String
	 * @param param : MUserManagercreateReq
	 * @return MResponseUser
	*/
	@POST
	@Path("/create")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/create", notes = """DEPRECATED""", response = classOf[MResponseUser])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def create(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MUserManagercreateReq):Response /*returnType = MResponseUser*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__create(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_create)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_create)
	    }
	} 

	@GET
	@Path("/create")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Deprecated
	def create_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUser*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("create",this._getCacheControl) 
		try{
			val resp = this.__create(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MUserManagercreateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_create)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_create)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __create(tokenId: String, param: MUserManagercreateReq) :MResponseUser
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_create: String

	/**
	 * Deprecated -> Use JVuserManager.detail service
	 * 
	 * return the user detail information and the list of available Capabilities
	 * @param tokenId : String
	 * @param param : MUserManagerdetailReq
	 * @return MResponseUserDetail
	*/
	@POST
	@Path("/detail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/detail", notes = """Deprecated -> Use JVuserManager.detail service
	//#SWGNL#
	//#SWGNL#return the user detail information and the list of available Capabilities""", response = classOf[MResponseUserDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MUserManagerdetailReq):Response /*returnType = MResponseUserDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__detail(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_detail)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_detail)
	    }
	} 

	@GET
	@Path("/detail")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Deprecated
	def detail_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUserDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("detail",this._getCacheControl) 
		try{
			val resp = this.__detail(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MUserManagerdetailReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, param: MUserManagerdetailReq) :MResponseUserDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * Deprecated -> Use JVuserManager.findByProperties
	 * @param tokenId : String
	 * @param param : MUserManagerfindByPropertiesReq
	 * @return MResponseUserFindByProperties
	*/
	@POST
	@Path("/findByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findByProperties", notes = """Deprecated -> Use JVuserManager.findByProperties""", response = classOf[MResponseUserFindByProperties])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def findByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MUserManagerfindByPropertiesReq):Response /*returnType = MResponseUserFindByProperties*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findByProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findByProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findByProperties)
	    }
	} 

	@GET
	@Path("/findByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Deprecated
	def findByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUserFindByProperties*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("findByProperties",this._getCacheControl) 
		try{
			val resp = this.__findByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MUserManagerfindByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findByProperties(tokenId: String, param: MUserManagerfindByPropertiesReq) :MResponseUserFindByProperties
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findByProperties: String

	/**
	 * Return the total number of users registered in the platform
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseUserNumberOfUsers
	*/
	@GET
	@Path("/numberOfUsers")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/numberOfUsers", notes = """Return the total number of users registered in the platform""", response = classOf[MResponseUserNumberOfUsers])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def numberOfUsers(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseUserNumberOfUsers*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("numberOfUsers") 
		try{	
			val resp = this.__numberOfUsers(PRestHelper.getTokenId(tokenId_q, tokenId),clientId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_numberOfUsers)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_numberOfUsers)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __numberOfUsers(tokenId: String, clientId: String) :MResponseUserNumberOfUsers
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_numberOfUsers: String

	/**
	 * Return the complete list of all users (username only) registered in the platform
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseUserAllUsername
	*/
	@GET
	@Path("/getAllUsername")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getAllUsername", notes = """Return the complete list of all users (username only) registered in the platform""", response = classOf[MResponseUserAllUsername])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getAllUsername(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseUserAllUsername*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getAllUsername") 
		try{	
			val resp = this.__getAllUsername(PRestHelper.getTokenId(tokenId_q, tokenId),clientId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getAllUsername)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getAllUsername)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getAllUsername(tokenId: String, clientId: String) :MResponseUserAllUsername
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getAllUsername: String

}