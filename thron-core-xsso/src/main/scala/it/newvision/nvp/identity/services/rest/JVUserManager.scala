package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.identity.services.model.vusers.MResponseVUser
import it.newvision.nvp.identity.services.model.request.MVUserManagerchangeUserStatusReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserCreate
import it.newvision.nvp.identity.services.model.request.MVUserManagercreateReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserDetail
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserFindByProperties
import it.newvision.nvp.identity.services.model.request.MVUserManagerfindByPropertiesReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerlinkGroupsReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerunlinkGroupsReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateCapabilitiesAndRolesReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateExternalIdReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateImageReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateSettingsReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateUserReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupgradeUserReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserVerifyUsername

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service provides the low level function to create new user in platform
 * (MVUser instance) , and store the username and password necessary for the
 * authentication services.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xsso/resources/vusermanager    </li>
 * </ul>
 */
@Path("/vusermanager")
//#SWG#@Api(value = "/vusermanager", description = """This service provides the low level function to create new user in platform (MVUser instance) , and store the username and password necessary for the authentication services.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xsso/resources/vusermanager    </li>
//#SWGNL#</ul>""")
trait JVUserManager extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Modifies the active status of a user.
	 * 
	 * An inactive user cannot login or use any service of the platform.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * 	<li>MODIFY ACL on user</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagerchangeUserStatusReq
	 * @return MResponseVUser
	*/
	@POST
	@Path("/changeUserStatus")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/changeUserStatus", notes = """Modifies the active status of a user.
	//#SWGNL#
	//#SWGNL#An inactive user cannot login or use any service of the platform.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_USERS role</li>
	//#SWGNL#	<li>MODIFY ACL on user</li>
	//#SWGNL#</ul>""", response = classOf[MResponseVUser])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def changeUserStatus(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MVUserManagerchangeUserStatusReq):Response /*returnType = MResponseVUser*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__changeUserStatus(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_changeUserStatus)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_changeUserStatus)
	    }
	} 

	@GET
	@Path("/changeUserStatus")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def changeUserStatus_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUser*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("changeUserStatus",this._getCacheControl) 
		try{
			val resp = this.__changeUserStatus(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MVUserManagerchangeUserStatusReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_changeUserStatus)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_changeUserStatus)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __changeUserStatus(tokenId: String, param: MVUserManagerchangeUserStatusReq) :MResponseVUser
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_changeUserStatus: String

	/**
	 * Creates a user.
	 * 
	 * <b>Username, password and email</b> (of MVUserNotificationProperties) <b>are mandatory</b>.
	 * Username must be unique and it will be automatically converted to lowercase.
	 * 
	 * Constraints for the username attribute:
	 * <ul>
	 * 	<li>can not contain §/$&#<>"?*:\|</li>
	 * 	<li>can not contain spaces</li>
	 * 	<li>can not start with _</li>
	 * 	<li>can not start with !</li>
	 * 	<li>max length: 50</li>
	 * </ul>
	 * 
	 * Constraints for the password attribute:
	 * <ul>
	 * 	<li>max length: 100</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagercreateReq
	 * @return MResponseVUserCreate
	*/
	@POST
	@Path("/create")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/create", notes = """Creates a user.
	//#SWGNL#
	//#SWGNL#<b>Username, password and email</b> (of MVUserNotificationProperties) <b>are mandatory</b>. Username must be unique and it will be automatically converted to lowercase.
	//#SWGNL#
	//#SWGNL#Constraints for the username attribute:
	//#SWGNL#<ul>
	//#SWGNL#	<li>can not contain §/$&#<>"?*:\|</li>
	//#SWGNL#	<li>can not contain spaces</li>
	//#SWGNL#	<li>can not start with _</li>
	//#SWGNL#	<li>can not start with !</li>
	//#SWGNL#	<li>max length: 50</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Constraints for the password attribute:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length: 100</li>
	//#SWGNL#</ul>""", response = classOf[MResponseVUserCreate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def create(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MVUserManagercreateReq):Response /*returnType = MResponseVUserCreate*/ = {
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
	def create_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUserCreate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("create",this._getCacheControl) 
		try{
			val resp = this.__create(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MVUserManagercreateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_create)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_create)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __create(tokenId: String, param: MVUserManagercreateReq) :MResponseVUserCreate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_create: String

	/**
	 * Returns the detail and capabilities of a user.
	 * The service return only the first 50 groups linked to the user and no own ACLs.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * The userId
	 * @param returnItags : Boolean
	 * Optional. Default is false
	 * @param returnImetadata : Boolean
	 * Optional. Default is false
	 * @param offset : Integer
	 * Optional. For the linkedGroups list
	 * @param numberOfResults : Integer
	 * Optional. For the linkedGroups list
	 * Default and maximum value is 50 items
	 * @return MResponseVUserDetail
	*/
	@GET
	@Path("/detail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """Returns the detail and capabilities of a user.
	//#SWGNL#The service return only the first 50 groups linked to the user and no own ACLs.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.""", response = classOf[MResponseVUserDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """The userId""")
	@QueryParam("username")
	username: String, 
			//#SWG#@ApiParam(value = """Optional. Default is false""")
	@QueryParam("returnItags")
	returnItags: Boolean, 
			//#SWG#@ApiParam(value = """Optional. Default is false""")
	@QueryParam("returnImetadata")
	returnImetadata: Boolean, 
			//#SWG#@ApiParam(value = """Optional. For the linkedGroups list""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. For the linkedGroups list
	//#SWGNL#Default and maximum value is 50 items""")
	@QueryParam("numberOfResults")
	numberOfResults: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseVUserDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detail") 
		try{	
			val resp = this.__detail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,username,returnItags,returnImetadata,offset,numberOfResults)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, clientId: String, username: String, returnItags: Boolean, returnImetadata: Boolean, offset: Integer, numberOfResults: Integer) :MResponseVUserDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * Returns the list of users matching provided criteria.
	 * @param tokenId : String
	 * @param param : MVUserManagerfindByPropertiesReq
	 * @return MResponseVUserFindByProperties
	*/
	@POST
	@Path("/findByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findByProperties", notes = """Returns the list of users matching provided criteria.""", response = classOf[MResponseVUserFindByProperties])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MVUserManagerfindByPropertiesReq):Response /*returnType = MResponseVUserFindByProperties*/ = {
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
	def findByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUserFindByProperties*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("findByProperties",this._getCacheControl) 
		try{
			val resp = this.__findByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MVUserManagerfindByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findByProperties(tokenId: String, param: MVUserManagerfindByPropertiesReq) :MResponseVUserFindByProperties
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findByProperties: String

	/**
	 * Links a user to a group.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * 	<li>MODIFY ACL on user</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param param : MVUserManagerlinkGroupsReq
	 * @return MResponseVUser
	*/
	@POST
	@Path("/linkGroups/{clientId}/{username}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/linkGroups", notes = """Links a user to a group.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_USERS role</li>
	//#SWGNL#	<li>MODIFY ACL on user</li>
	//#SWGNL#</ul>""", response = classOf[MResponseVUser])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def linkGroups(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("username")
	username: String, 
			param: MVUserManagerlinkGroupsReq):Response /*returnType = MResponseVUser*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__linkGroups(tokenId,clientId,username,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_linkGroups)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_linkGroups)
	    }
	} 

	@GET
	@Path("/linkGroups/{clientId}/{username}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def linkGroups_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("username")
	username: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUser*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("linkGroups",this._getCacheControl) 
		try{
			val resp = this.__linkGroups(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,username,PRestHelper.bindRequest[MVUserManagerlinkGroupsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_linkGroups)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_linkGroups)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __linkGroups(tokenId: String, clientId: String, username: String, param: MVUserManagerlinkGroupsReq) :MResponseVUser
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_linkGroups: String

	/**
	 * Unlinks a user from a group.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * <ul>
	 * 	<li>MODIFY ACL on user</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param param : MVUserManagerunlinkGroupsReq
	 * @return MResponseVUser
	*/
	@POST
	@Path("/unlinkGroups/{clientId}/{username}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/unlinkGroups", notes = """Unlinks a user from a group.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_USERS role</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on user</li>
	//#SWGNL#</ul>""", response = classOf[MResponseVUser])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def unlinkGroups(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("username")
	username: String, 
			param: MVUserManagerunlinkGroupsReq):Response /*returnType = MResponseVUser*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__unlinkGroups(tokenId,clientId,username,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_unlinkGroups)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_unlinkGroups)
	    }
	} 

	@GET
	@Path("/unlinkGroups/{clientId}/{username}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def unlinkGroups_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("username")
	username: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUser*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("unlinkGroups",this._getCacheControl) 
		try{
			val resp = this.__unlinkGroups(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,username,PRestHelper.bindRequest[MVUserManagerunlinkGroupsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_unlinkGroups)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_unlinkGroups)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __unlinkGroups(tokenId: String, clientId: String, username: String, param: MVUserManagerunlinkGroupsReq) :MResponseVUser
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_unlinkGroups: String

	/**
	 * Updates the capabilities and roles of a user.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagerupdateCapabilitiesAndRolesReq
	 * @return MResponseVUser
	*/
	@POST
	@Path("/updateCapabilitiesAndRoles")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateCapabilitiesAndRoles", notes = """Updates the capabilities and roles of a user.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_USERS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseVUser])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateCapabilitiesAndRoles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MVUserManagerupdateCapabilitiesAndRolesReq):Response /*returnType = MResponseVUser*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateCapabilitiesAndRoles(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateCapabilitiesAndRoles)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateCapabilitiesAndRoles)
	    }
	} 

	@GET
	@Path("/updateCapabilitiesAndRoles")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateCapabilitiesAndRoles_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUser*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateCapabilitiesAndRoles",this._getCacheControl) 
		try{
			val resp = this.__updateCapabilitiesAndRoles(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MVUserManagerupdateCapabilitiesAndRolesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateCapabilitiesAndRoles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateCapabilitiesAndRoles)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateCapabilitiesAndRoles(tokenId: String, param: MVUserManagerupdateCapabilitiesAndRolesReq) :MResponseVUser
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateCapabilitiesAndRoles: String

	/**
	 * Updates the externalId of a user.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param param : MVUserManagerupdateExternalIdReq
	 * @return MResponseVUser
	*/
	@POST
	@Path("/updateExternalId/{clientId}/{username}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateExternalId", notes = """Updates the externalId of a user.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_USERS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseVUser])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateExternalId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("username")
	username: String, 
			param: MVUserManagerupdateExternalIdReq):Response /*returnType = MResponseVUser*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateExternalId(tokenId,clientId,username,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateExternalId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateExternalId)
	    }
	} 

	@GET
	@Path("/updateExternalId/{clientId}/{username}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateExternalId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("username")
	username: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUser*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateExternalId",this._getCacheControl) 
		try{
			val resp = this.__updateExternalId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,username,PRestHelper.bindRequest[MVUserManagerupdateExternalIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateExternalId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateExternalId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateExternalId(tokenId: String, clientId: String, username: String, param: MVUserManagerupdateExternalIdReq) :MResponseVUser
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateExternalId: String

	/**
	 * Updates the profile picture of a user.
	 * Supported file formats: JPEG, PNG.
	 * @param tokenId : String
	 * @param param : MVUserManagerupdateImageReq
	 * @return MResponseVUser
	*/
	@POST
	@Path("/updateImage")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateImage", notes = """Updates the profile picture of a user.
	//#SWGNL#Supported file formats: JPEG, PNG.""", response = classOf[MResponseVUser])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateImage(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MVUserManagerupdateImageReq):Response /*returnType = MResponseVUser*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateImage(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateImage)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateImage)
	    }
	} 

	@GET
	@Path("/updateImage")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateImage_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUser*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateImage",this._getCacheControl) 
		try{
			val resp = this.__updateImage(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MVUserManagerupdateImageReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateImage)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateImage)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateImage(tokenId: String, param: MVUserManagerupdateImageReq) :MResponseVUser
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateImage: String

	/**
	 * Updates restricted params of a user (userQuota and userLockTemplate).
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagerupdateSettingsReq
	 * @return MResponseVUser
	*/
	@POST
	@Path("/updateSettings")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateSettings", notes = """Updates restricted params of a user (userQuota and userLockTemplate).
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_USERS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseVUser])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateSettings(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MVUserManagerupdateSettingsReq):Response /*returnType = MResponseVUser*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateSettings(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateSettings)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateSettings)
	    }
	} 

	@GET
	@Path("/updateSettings")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateSettings_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUser*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateSettings",this._getCacheControl) 
		try{
			val resp = this.__updateSettings(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MVUserManagerupdateSettingsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateSettings)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateSettings)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateSettings(tokenId: String, param: MVUserManagerupdateSettingsReq) :MResponseVUser
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateSettings: String

	/**
	 * Update the detail of a user.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * <ul>
	 * 	<li>MODIFY ACL on user</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param param : MVUserManagerupdateUserReq
	 * @return MResponseVUser
	*/
	@POST
	@Path("/updateUser/{clientId}/{username}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateUser", notes = """Update the detail of a user.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_USERS role</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on user</li>
	//#SWGNL#</ul>""", response = classOf[MResponseVUser])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateUser(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("username")
	username: String, 
			param: MVUserManagerupdateUserReq):Response /*returnType = MResponseVUser*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateUser(tokenId,clientId,username,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateUser)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateUser)
	    }
	} 

	@GET
	@Path("/updateUser/{clientId}/{username}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateUser_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("username")
	username: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUser*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateUser",this._getCacheControl) 
		try{
			val resp = this.__updateUser(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,username,PRestHelper.bindRequest[MVUserManagerupdateUserReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateUser)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateUser)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateUser(tokenId: String, clientId: String, username: String, param: MVUserManagerupdateUserReq) :MResponseVUser
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateUser: String

	/**
	 * Upgrades a PLATFORM_USER_GUEST type user to PLATFORM_USER type.
	 * Username cannot be changed.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagerupgradeUserReq
	 * @return MResponseVUserCreate
	*/
	@POST
	@Path("/upgradeUser")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/upgradeUser", notes = """Upgrades a PLATFORM_USER_GUEST type user to PLATFORM_USER type.
	//#SWGNL#Username cannot be changed.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_USERS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseVUserCreate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def upgradeUser(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MVUserManagerupgradeUserReq):Response /*returnType = MResponseVUserCreate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__upgradeUser(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_upgradeUser)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_upgradeUser)
	    }
	} 

	@GET
	@Path("/upgradeUser")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def upgradeUser_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUserCreate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("upgradeUser",this._getCacheControl) 
		try{
			val resp = this.__upgradeUser(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MVUserManagerupgradeUserReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_upgradeUser)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_upgradeUser)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __upgradeUser(tokenId: String, param: MVUserManagerupgradeUserReq) :MResponseVUserCreate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_upgradeUser: String

	/**
	 * Verifies whether or not a username is valid, and eventually suggest an alternative.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @return MResponseVUserVerifyUsername
	*/
	@POST
	@Path("/verifyUsername/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/verifyUsername", notes = """Verifies whether or not a username is valid, and eventually suggest an alternative.""", response = classOf[MResponseVUserVerifyUsername])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def verifyUsername(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("username")
	username: String):Response /*returnType = MResponseVUserVerifyUsername*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__verifyUsername(tokenId,clientId,username)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_verifyUsername)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_verifyUsername)
	    }
	} 

	@GET
	@Path("/verifyUsername/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def verifyUsername_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String, 
			@QueryParam("username")username_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVUserVerifyUsername*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("verifyUsername",this._getCacheControl) 
		try{	
			val resp = this.__verifyUsername(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,username_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_verifyUsername)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_verifyUsername)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __verifyUsername(tokenId: String, clientId: String, username: String) :MResponseVUserVerifyUsername
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_verifyUsername: String

}