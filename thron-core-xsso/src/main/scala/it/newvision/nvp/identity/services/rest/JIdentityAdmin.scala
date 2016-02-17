package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.identity.model.MCredentialFull
import it.newvision.nvp.identity.services.model.request.MIdentityAdmingetClientOSInfoReq
import it.newvision.nvp.identity.services.model.identity.MResponseActiveSessions
import it.newvision.nvp.identity.services.model.request.MIdentityAdmingetActiveSessionsReq
import it.newvision.nvp.identity.services.model.request.MIdentityAdminwhoisReq
import it.newvision.nvp.identity.services.model.identity.MResponseIdentity
import it.newvision.nvp.identity.services.model.request.MIdentityAdmincleanupSessionsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/adxsso/resources/identityadmin/</li>
 * </ul>
 */
@Path("/identityadmin")
//#SWG#@Api(value = "/identityadmin", description = """<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/adxsso/resources/identityadmin/</li>
//#SWGNL#</ul>""")
trait JIdentityAdmin extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * return the operating system user information (username and password).
	 * These information are used in the components like xpackager and xpublisher
	 * @param tokenId : String
	 * @param param : MIdentityAdmingetClientOSInfoReq
	 * @return MCredentialFull
	*/
	@POST
	@Path("/getClientOSInfo")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getClientOSInfo", notes = """return the operating system user information (username and password).
	//#SWGNL#These information are used in the components like xpackager and xpublisher""", response = classOf[MCredentialFull])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getClientOSInfo(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MIdentityAdmingetClientOSInfoReq):Response /*returnType = MCredentialFull*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getClientOSInfo(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getClientOSInfo)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getClientOSInfo)
	    }
	} 

	@GET
	@Path("/getClientOSInfo")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getClientOSInfo_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MCredentialFull*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getClientOSInfo(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MIdentityAdmingetClientOSInfoReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getClientOSInfo)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getClientOSInfo)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getClientOSInfo(tokenId: String, param: MIdentityAdmingetClientOSInfoReq) :MCredentialFull
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getClientOSInfo: String

	/**
	 * login without Audit, for internal use.
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
			@HeaderParam("X-USERNAME")
	username: String, 
			@HeaderParam("X-PASSWORD")
	password: String, 
			@FormParam("groupId")
	groupId: String):Response /*returnType = String*/  

	@GET
	@Path("login")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
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
	 * create a new administration token (administration session with no restrictions).
	 * Use it carefully!!!
	 * @param tokenId : String
	 * @param username : String
	 * @return String
	*/
	@POST
	@Path("/newSuperAdminToken")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/newSuperAdminToken", notes = """create a new administration token (administration session with no restrictions).
	//#SWGNL#Use it carefully!!!""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def newSuperAdminToken(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("username")
	username: String):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__newSuperAdminToken(tokenId,username)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_newSuperAdminToken)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_newSuperAdminToken)
	    }
	} 

	@GET
	@Path("/newSuperAdminToken")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	def newSuperAdminToken_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("username")username_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__newSuperAdminToken(PRestHelper.getTokenId(tokenId_q, tokenId_h),username_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_newSuperAdminToken)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_newSuperAdminToken)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __newSuperAdminToken(tokenId: String, username: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_newSuperAdminToken: String

	/**
	 * used to impersonate another user. The service can be invoked only by a superToken and return a new
	 * valid token for the specified user if exists.
	 * Specifing the adminSession parameter to true, it is possible to creare an administration session
	 * for the given user (Use it carefully!!!)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param adminSession : Boolean
	 * used to create a new administration session for the given user.
	 * If true the new user session is an administrator session with all permissions.
	 * Use it carefully!!!
	 * @return String
	*/
	@POST
	@Path("/su")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/su", notes = """used to impersonate another user. The service can be invoked only by a superToken and return a new valid token for the specified user if exists.
	//#SWGNL#Specifing the adminSession parameter to true, it is possible to creare an administration session for the given user (Use it carefully!!!)""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def su(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("username")
	username: String, 
			//#SWG#@ApiParam(value = """used to create a new administration session for the given user.
	//#SWGNL#If true the new user session is an administrator session with all permissions.
	//#SWGNL#Use it carefully!!!""")
	@FormParam("adminSession")
	adminSession: Boolean):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__su(tokenId,clientId,username,adminSession)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_su)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_su)
	    }
	} 

	@GET
	@Path("/su")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	def su_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("username")username_q: String, 
			@QueryParam("adminSession")adminSession_q: Boolean,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__su(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,username_q,adminSession_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_su)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_su)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __su(tokenId: String, clientId: String, username: String, adminSession: Boolean) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_su: String

	/**
	 * used to create an administrative session for the given token (user token). The service return a new
	 * token for the given user.
	 * @param tokenId : String
	 * @param clientId : String
	 * @return String
	*/
	@POST
	@Path("/su2")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/su2", notes = """used to create an administrative session for the given token (user token). The service return a new token for the given user.""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def su2(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__su2(tokenId,clientId)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_su2)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_su2)
	    }
	} 

	@GET
	@Path("/su2")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	def su2_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__su2(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_su2)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_su2)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __su2(tokenId: String, clientId: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_su2: String

	/**
	 * return the hashed password of the given username.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @return String
	*/
	@GET
	@Path("/getHashedPassword")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getHashedPassword", notes = """return the hashed password of the given username.""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getHashedPassword(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("username")
	username: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = String*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getHashedPassword") 
		try{	
			val resp = this.__getHashedPassword(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,username)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getHashedPassword)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getHashedPassword)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getHashedPassword(tokenId: String, clientId: String, username: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getHashedPassword: String

	/**
	 * Used to get the list of active session in 4me platform.
	 * No token is required.
	 * @param tokenId : String
	 * @param param : MIdentityAdmingetActiveSessionsReq
	 * @return MResponseActiveSessions
	*/
	@POST
	@Path("/getActiveSessions")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getActiveSessions", notes = """Used to get the list of active session in 4me platform. 
	//#SWGNL#No token is required.""", response = classOf[MResponseActiveSessions])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getActiveSessions(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MIdentityAdmingetActiveSessionsReq):Response /*returnType = MResponseActiveSessions*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getActiveSessions(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getActiveSessions)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getActiveSessions)
	    }
	} 

	@GET
	@Path("/getActiveSessions")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getActiveSessions_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseActiveSessions*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getActiveSessions(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MIdentityAdmingetActiveSessionsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getActiveSessions)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getActiveSessions)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getActiveSessions(tokenId: String, param: MIdentityAdmingetActiveSessionsReq) :MResponseActiveSessions
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getActiveSessions: String

	/**
	 * return the username for the given tokenId.
	 * The service works only with user sessions (no secret sessions)
	 * @param tokenId : String
	 * @param param : MIdentityAdminwhoisReq
	 * @return String
	*/
	@POST
	@Path("/whois")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/whois", notes = """return the username for the given tokenId.
	//#SWGNL#The service works only with user sessions (no secret sessions)""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def whois(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MIdentityAdminwhoisReq):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__whois(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_whois)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_whois)
	    }
	} 

	@GET
	@Path("/whois")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	def whois_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__whois(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MIdentityAdminwhoisReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_whois)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_whois)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __whois(tokenId: String, param: MIdentityAdminwhoisReq) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_whois: String

	/**
	 * Cleans up all non-secret sessions.
	 * Can be invoked only by a superToken
	 * @param tokenId : String
	 * @param param : MIdentityAdmincleanupSessionsReq
	 * @return MResponseIdentity
	*/
	@POST
	@Path("/cleanupSessions")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/cleanupSessions", notes = """Cleans up all non-secret sessions.
	//#SWGNL#Can be invoked only by a superToken""", response = classOf[MResponseIdentity])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def cleanupSessions(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MIdentityAdmincleanupSessionsReq):Response /*returnType = MResponseIdentity*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__cleanupSessions(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_cleanupSessions)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_cleanupSessions)
	    }
	} 

	@GET
	@Path("/cleanupSessions")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def cleanupSessions_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseIdentity*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__cleanupSessions(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MIdentityAdmincleanupSessionsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_cleanupSessions)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_cleanupSessions)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __cleanupSessions(tokenId: String, param: MIdentityAdmincleanupSessionsReq) :MResponseIdentity
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_cleanupSessions: String

}