package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.identity.services.model.identity.MResponseLogin
import it.newvision.nvp.identity.services.model.request.MIdentityManagerloginWithDetailReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Deprecated by AccessManager services.
 * 
 * This service allow the user to login and logout in to the platform, as
 * necessary step.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xsso/resources/identitymanager/</li>
 * </ul>
 */
@Path("/identitymanager")
//#SWG#@Api(value = "/identitymanager", description = """Deprecated by AccessManager services.
//#SWGNL#
//#SWGNL#This service allow the user to login and logout in to the platform, as necessary step.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xsso/resources/identitymanager/</li>
//#SWGNL#</ul>""")
trait JIdentityManager extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Verify the authentication for a given clientId, using the username and password of a registered
	 * user (only for PLATFORM_USER and PLATFORM_USER_GUEST).
	 * The function create a new user session in platform and return a <b>tokenId </b>key to use as
	 * authentication in all different WEB Services.
	 * Each <b>tokenId </b>is valid for a specific session time (1 hour), after that it's necessary to
	 * invoke the service to get a new key.
	 * 
	 * The service accepts the username and password either in body (using the post-form params) or as
	 * header params (using the specific X-USERNAME and X-PASSWORD parameters).
	 * @param clientId : String
	 * @param username : String
	 * @param password : String
	 * @param groupId : String
	 * @return String
	*/
	@POST
	                @Path("login")
	                @Produces(Array(MediaType.TEXT_PLAIN))
	                @Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	def login(@FormParam("clientId")
	clientId: String, 
			@FormParam("username")
	username: String, 
			@FormParam("password")
	password: String, 
			@FormParam("groupId")
	groupId: String):Response /*returnType = String*/  

	@GET
	@Path("login")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	@Consumes(Array(MediaType.APPLICATION_JSON))
	def login_2(@QueryParam("clientId")clientId_q: String, 
			@QueryParam("username")username_q: String, 
			@QueryParam("password")password_q: String, 
			@QueryParam("groupId")groupId_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { throw new it.newvision.core.dictionary.exceptions.WebApplicationException("service not implemented") }


	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 

	protected def capability_login: String

	/**
	 * Deprecated by <b>AccessManager.login</b>
	 * 
	 * Check the authentication for a given clientId, using the username and password of a registered user
	 * (only for PLATFORM_USER and PLATFORM_USER_GUEST).
	 * The function return a <b>tokenId </b>key to use as header param in all different WEB Services.
	 * Each <b>tokenId </b>is valid for a specific session time, after that it's necessary to call the
	 * login service that provide a new tokenId.
	 * <b>The service is protected by  account lockout policy.</b>
	 * @param tokenId : String
	 * @param param : MIdentityManagerloginWithDetailReq
	 * @return MResponseLogin
	*/
	@POST
	@Path("/loginWithDetail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/loginWithDetail", notes = """Deprecated by <b>AccessManager.login</b>
	//#SWGNL#
	//#SWGNL#Check the authentication for a given clientId, using the username and password of a registered user (only for PLATFORM_USER and PLATFORM_USER_GUEST). 
	//#SWGNL#The function return a <b>tokenId </b>key to use as header param in all different WEB Services.
	//#SWGNL#Each <b>tokenId </b>is valid for a specific session time, after that it's necessary to call the login service that provide a new tokenId.
	//#SWGNL#<b>The service is protected by  account lockout policy.</b>""", response = classOf[MResponseLogin])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def loginWithDetail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MIdentityManagerloginWithDetailReq):Response /*returnType = MResponseLogin*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__loginWithDetail(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_loginWithDetail)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_loginWithDetail)
	    }
	} 

	@GET
	@Path("/loginWithDetail")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def loginWithDetail_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseLogin*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("loginWithDetail",this._getCacheControl) 
		try{
			val resp = this.__loginWithDetail(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MIdentityManagerloginWithDetailReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_loginWithDetail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_loginWithDetail)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __loginWithDetail(tokenId: String, param: MIdentityManagerloginWithDetailReq) :MResponseLogin
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_loginWithDetail: String

	/**
	 * logout service. With this service the user can close the open user session and invalidate the given
	 * tokenId. After this call, a new login call is required to use the web services
	 * @param tokenId : String
	 * @param clientId : String
	 * @return String
	*/
	@POST
	                @Path("logout")
	                @Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	                @Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	def logout(@HeaderParam("X-TOKENID")
	tokenId: String, 
			@FormParam("clientId")
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
	@Path("logout")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	@Consumes(Array(MediaType.APPLICATION_JSON))
	def logout_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String,
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
	 * the service return an exception if the token is expired otherwise no data
	 * @param tokenId : String
	 * @param clientId : String
	 * @return String
	*/
	@POST
	                @Path("validateToken")
	                @Produces(Array(MediaType.TEXT_PLAIN))
	                @Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	def validateToken(@FormParam("tokenId")
	tokenId: String, 
			@FormParam("clientId")
	clientId: String):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__validateToken(tokenId,clientId)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_validateToken)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_validateToken)
	    }
	} 

	@GET
	@Path("validateToken")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	@Consumes(Array(MediaType.APPLICATION_JSON))
	def validateToken_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("validateToken",this._getCacheControl) 
		try{	
			val resp = this.__validateToken(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_validateToken)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_validateToken)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __validateToken(tokenId: String, clientId: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_validateToken: String

	/**
	 * Validate a specific capability for the give username liked to the tokenId
	 * @param tokenId : String
	 * @param clientId : String
	 * @param capability : String
	 * @return String
	*/
	@POST
	                @Path("capabilitiesValidation")
	                @Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	                @Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	def capabilitiesValidation(@FormParam("tokenId")
	tokenId: String, 
			@FormParam("clientId")
	clientId: String, 
			@FormParam("capability")
	capability: String):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__capabilitiesValidation(tokenId,clientId,capability)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_capabilitiesValidation)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_capabilitiesValidation)
	    }
	} 

	@GET
	@Path("capabilitiesValidation")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	@Consumes(Array(MediaType.APPLICATION_JSON))
	def capabilitiesValidation_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("capability")capability_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("capabilitiesValidation",this._getCacheControl) 
		try{	
			val resp = this.__capabilitiesValidation(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,capability_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_capabilitiesValidation)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_capabilitiesValidation)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __capabilitiesValidation(tokenId: String, clientId: String, capability: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_capabilitiesValidation: String

	/**
	 * Validate a specific role for the give username linked to the tokenId
	 * @param tokenId : String
	 * @param clientId : String
	 * @param role : String
	 * @return String
	*/
	@POST
	                @Path("roleValidation")
	                @Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	                @Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	def roleValidation(@FormParam("tokenId")
	tokenId: String, 
			@FormParam("clientId")
	clientId: String, 
			@FormParam("role")
	role: String):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__roleValidation(tokenId,clientId,role)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_roleValidation)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_roleValidation)
	    }
	} 

	@GET
	@Path("roleValidation")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	@Consumes(Array(MediaType.APPLICATION_JSON))
	def roleValidation_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("role")role_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("roleValidation",this._getCacheControl) 
		try{	
			val resp = this.__roleValidation(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,role_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_roleValidation)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_roleValidation)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __roleValidation(tokenId: String, clientId: String, role: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_roleValidation: String

}