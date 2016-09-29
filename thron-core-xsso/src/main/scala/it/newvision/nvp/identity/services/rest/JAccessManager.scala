package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.identity.services.model.identity.MResponseAccessLogin

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service allow the user to login and logout in the platform.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xsso/resources/accessmanager/  </li>
 * </ul>
 */
@Path("/accessmanager")
//#SWG#@Api(value = "/accessmanager", description = """This service allow the user to login and logout in the platform.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xsso/resources/accessmanager/  </li>
//#SWGNL#</ul>""")
trait JAccessManager extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Get a tokenId (access token) that authorize the user to make calls against API.
	 * Each <b>tokenId </b>is valid for a specific session time (1 hour), after that it's necessary to
	 * invoke the service to get a new key.
	 * <b>The service is protected by  account lockout policy.</b>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param password : String
	 * @return MResponseAccessLogin
	*/
	@POST
	@Path("/login/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/login", notes = """Get a tokenId (access token) that authorize the user to make calls against API.
	//#SWGNL#Each <b>tokenId </b>is valid for a specific session time (1 hour), after that it's necessary to invoke the service to get a new key.
	//#SWGNL#<b>The service is protected by  account lockout policy.</b>""", response = classOf[MResponseAccessLogin])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def login(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("username")
	username: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("password")
	password: String):Response /*returnType = MResponseAccessLogin*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__login(tokenId,clientId,username,password)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_login)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_login)
	    }
	} 

	@GET
	@Path("/login/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def login_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String, 
			@QueryParam("username")username_q: String, 
			@QueryParam("password")password_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAccessLogin*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("login",this._getCacheControl) 
		try{	
			val resp = this.__login(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,username_q,password_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_login)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_login)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __login(tokenId: String, clientId: String, username: String, password: String) :MResponseAccessLogin
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_login: String

	/**
	 * The user can close the user session and invalidate the given tokenId.
	 * To make other calls, it's necessary to invoke the login service and get a new tokenId.
	 * @param tokenId : String
	 * @param clientId : String
	 * @return String
	*/
	@POST
	@Path("/logout/{clientId}")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/logout", notes = """The user can close the user session and invalidate the given tokenId.
	//#SWGNL#To make other calls, it's necessary to invoke the login service and get a new tokenId.""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def logout(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__logout(tokenId,clientId)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_logout)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_logout)
	    }
	} 

	@GET
	@Path("/logout/{clientId}")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	def logout_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("logout",this._getCacheControl) 
		try{	
			val resp = this.__logout(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_logout)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_logout)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __logout(tokenId: String, clientId: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_logout: String

	/**
	 * verify the session tokenId, if it is valid or expired.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * optional parameter. The service can validate the token and verify that the session token belongs to
	 * the given username
	 * @return MResponseAccessLogin
	*/
	@POST
	@Path("/validateToken/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/validateToken", notes = """verify the session tokenId, if it is valid or expired.""", response = classOf[MResponseAccessLogin])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def validateToken(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """optional parameter. The service can validate the token and verify that the session token belongs to the given username""")
	@FormParam("username")
	username: String):Response /*returnType = MResponseAccessLogin*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__validateToken(tokenId,clientId,username)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_validateToken)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_validateToken)
	    }
	} 

	@GET
	@Path("/validateToken/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def validateToken_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String, 
			@QueryParam("username")username_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAccessLogin*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("validateToken",this._getCacheControl) 
		try{	
			val resp = this.__validateToken(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,username_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_validateToken)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_validateToken)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __validateToken(tokenId: String, clientId: String, username: String) :MResponseAccessLogin
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_validateToken: String

	/**
	 * HTTP status 200 if the given capability (or list of capabilities) is active for the user (given
	 * tokenId) otherwise HTTP status 403.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param capabilities : String
	 * list of capabilities as comma separated values. If the list of capabilities has more that one value,
	 * all values should satisfies the validation.
	 * @return String
	*/
	@POST
	@Path("/validateCapability/{clientId}")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/validateCapability", notes = """HTTP status 200 if the given capability (or list of capabilities) is active for the user (given tokenId) otherwise HTTP status 403.""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def validateCapability(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """list of capabilities as comma separated values. If the list of capabilities has more that one value, all values should satisfies the validation.""")
	@FormParam("capabilities")
	capabilities: String):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__validateCapability(tokenId,clientId,capabilities)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_validateCapability)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_validateCapability)
	    }
	} 

	@GET
	@Path("/validateCapability/{clientId}")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	def validateCapability_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String, 
			@QueryParam("capabilities")capabilities_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("validateCapability",this._getCacheControl) 
		try{	
			val resp = this.__validateCapability(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,capabilities_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_validateCapability)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_validateCapability)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __validateCapability(tokenId: String, clientId: String, capabilities: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_validateCapability: String

	/**
	 * return HTTP status 200  if the given role is active for the user in session (given tokenId)
	 * otherwise HTTP status 403.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param role : String
	 * list of roles (case insensitive) as comma separated values. If the list of roles has more that one
	 * value, all values should satisfies the validation.
	 * list of role delimited by pipes |.If the list of roles has more that one value, the validation
	 * should satisfy at least one value.
	 * 
	 * Example:
	 * [validate all]: CORE_CREATE_NEW_CONTENT,CORE_MANAGE_APPS
	 * [validate one]: CORE_CREATE_NEW_CONTENT|CORE_MANAGE_APPS

	 * @return String
	*/
	@POST
	@Path("/validateRole/{clientId}")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/validateRole", notes = """return HTTP status 200  if the given role is active for the user in session (given tokenId) otherwise HTTP status 403.""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def validateRole(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """list of roles (case insensitive) as comma separated values. If the list of roles has more that one value, all values should satisfies the validation.
	//#SWGNL#list of role delimited by pipes |.If the list of roles has more that one value, the validation should satisfy at least one value.
	//#SWGNL#
	//#SWGNL#Example:
	//#SWGNL#[validate all]: CORE_CREATE_NEW_CONTENT,CORE_MANAGE_APPS
	//#SWGNL#[validate one]: CORE_CREATE_NEW_CONTENT|CORE_MANAGE_APPS
	//#SWGNL#""")
	@FormParam("role")
	role: String):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__validateRole(tokenId,clientId,role)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_validateRole)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_validateRole)
	    }
	} 

	@GET
	@Path("/validateRole/{clientId}")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	def validateRole_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String, 
			@QueryParam("role")role_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("validateRole",this._getCacheControl) 
		try{	
			val resp = this.__validateRole(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,role_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_validateRole)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_validateRole)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __validateRole(tokenId: String, clientId: String, role: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_validateRole: String

}