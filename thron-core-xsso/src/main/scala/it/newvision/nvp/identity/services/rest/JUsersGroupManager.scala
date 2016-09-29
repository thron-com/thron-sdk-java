package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.identity.services.model.usersgroup.MResponseCreateUsersGroup
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagercreateGroupReq
import it.newvision.nvp.identity.services.model.usersgroup.MResponseUsersGroup
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerupdateReq
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerupdateExternalIdReq
import it.newvision.nvp.identity.services.model.usersgroup.MResponseDetailUsersGroup
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerdetailGroupReq
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerremoveGroupReq
import it.newvision.nvp.identity.services.model.usersgroup.MResponseFindGroupsByProperties
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerfindGroupsByPropertiesReq
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerlinkUserToGroupReq
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerunlinkUserToGroupReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service handles all functions for the platform user groups. The
 * administrator can create different group of users. The groups are used in
 * combination with the access control of contents, and allows to restrict the
 * access to a content only to some users or groups of users.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xsso/resources/usersgroupmanager/  </li>
 * </ul>
 */
@Path("/usersgroupmanager")
//#SWG#@Api(value = "/usersgroupmanager", description = """This service handles all functions for the platform user groups. The administrator can create different group of users. The groups are used in combination with the access control of contents, and allows to restrict the access to a content only to some users or groups of users.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xsso/resources/usersgroupmanager/  </li>
//#SWGNL#</ul>""")
trait JUsersGroupManager extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * The service is used to create a new UserGroup in the platform.
	 * @param tokenId : String
	 * @param param : MUsersGroupManagercreateGroupReq
	 * @return MResponseCreateUsersGroup
	*/
	@POST
	@Path("/createGroup")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/createGroup", notes = """The service is used to create a new UserGroup in the platform.""", response = classOf[MResponseCreateUsersGroup])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def createGroup(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MUsersGroupManagercreateGroupReq):Response /*returnType = MResponseCreateUsersGroup*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__createGroup(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_createGroup)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_createGroup)
	    }
	} 

	@GET
	@Path("/createGroup")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def createGroup_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCreateUsersGroup*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("createGroup",this._getCacheControl) 
		try{
			val resp = this.__createGroup(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MUsersGroupManagercreateGroupReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_createGroup)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_createGroup)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __createGroup(tokenId: String, param: MUsersGroupManagercreateGroupReq) :MResponseCreateUsersGroup
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_createGroup: String

	/**
	 * Update the Group detail and capabilities
	 * @param tokenId : String
	 * @param clientId : String
	 * @param groupId : String
	 * @param param : MUsersGroupManagerupdateReq
	 * @return MResponseUsersGroup
	*/
	@POST
	@Path("/update/{clientId}/{groupId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """Update the Group detail and capabilities""", response = classOf[MResponseUsersGroup])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def update(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("groupId")
	groupId: String, 
			param: MUsersGroupManagerupdateReq):Response /*returnType = MResponseUsersGroup*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__update(tokenId,clientId,groupId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_update)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_update)
	    }
	} 

	@GET
	@Path("/update/{clientId}/{groupId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def update_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("groupId")
	groupId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUsersGroup*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("update",this._getCacheControl) 
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,groupId,PRestHelper.bindRequest[MUsersGroupManagerupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, clientId: String, groupId: String, param: MUsersGroupManagerupdateReq) :MResponseUsersGroup
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

	/**
	 * Update the Group external Id
	 * @param tokenId : String
	 * @param clientId : String
	 * @param groupId : String
	 * @param param : MUsersGroupManagerupdateExternalIdReq
	 * @return MResponseUsersGroup
	*/
	@POST
	@Path("/updateExternalId/{clientId}/{groupId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateExternalId", notes = """Update the Group external Id""", response = classOf[MResponseUsersGroup])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateExternalId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("groupId")
	groupId: String, 
			param: MUsersGroupManagerupdateExternalIdReq):Response /*returnType = MResponseUsersGroup*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateExternalId(tokenId,clientId,groupId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateExternalId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateExternalId)
	    }
	} 

	@GET
	@Path("/updateExternalId/{clientId}/{groupId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateExternalId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("groupId")
	groupId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUsersGroup*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateExternalId",this._getCacheControl) 
		try{
			val resp = this.__updateExternalId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,groupId,PRestHelper.bindRequest[MUsersGroupManagerupdateExternalIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateExternalId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateExternalId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateExternalId(tokenId: String, clientId: String, groupId: String, param: MUsersGroupManagerupdateExternalIdReq) :MResponseUsersGroup
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateExternalId: String

	/**
	 * Return the information about a group and the list of linked users
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerdetailGroupReq
	 * @return MResponseDetailUsersGroup
	*/
	@POST
	@Path("/detailGroup")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/detailGroup", notes = """Return the information about a group and the list of linked users""", response = classOf[MResponseDetailUsersGroup])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detailGroup(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MUsersGroupManagerdetailGroupReq):Response /*returnType = MResponseDetailUsersGroup*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__detailGroup(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_detailGroup)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_detailGroup)
	    }
	} 

	@GET
	@Path("/detailGroup")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def detailGroup_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDetailUsersGroup*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("detailGroup",this._getCacheControl) 
		try{
			val resp = this.__detailGroup(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MUsersGroupManagerdetailGroupReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detailGroup)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detailGroup)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detailGroup(tokenId: String, param: MUsersGroupManagerdetailGroupReq) :MResponseDetailUsersGroup
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detailGroup: String

	/**
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerremoveGroupReq
	 * @return MResponseUsersGroup
	*/
	@POST
	@Path("/removeGroup")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeGroup", notes = """""", response = classOf[MResponseUsersGroup])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeGroup(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MUsersGroupManagerremoveGroupReq):Response /*returnType = MResponseUsersGroup*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeGroup(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeGroup)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeGroup)
	    }
	} 

	@GET
	@Path("/removeGroup")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeGroup_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUsersGroup*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeGroup",this._getCacheControl) 
		try{
			val resp = this.__removeGroup(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MUsersGroupManagerremoveGroupReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeGroup)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeGroup)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeGroup(tokenId: String, param: MUsersGroupManagerremoveGroupReq) :MResponseUsersGroup
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeGroup: String

	/**
	 * Return the list of groups matching the given criteria.
	 * The service return the list of groups without the list of linked users
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerfindGroupsByPropertiesReq
	 * @return MResponseFindGroupsByProperties
	*/
	@POST
	@Path("/findGroupsByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findGroupsByProperties", notes = """Return the list of groups matching the given criteria. 
	//#SWGNL#The service return the list of groups without the list of linked users""", response = classOf[MResponseFindGroupsByProperties])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findGroupsByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MUsersGroupManagerfindGroupsByPropertiesReq):Response /*returnType = MResponseFindGroupsByProperties*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findGroupsByProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findGroupsByProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findGroupsByProperties)
	    }
	} 

	@GET
	@Path("/findGroupsByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def findGroupsByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFindGroupsByProperties*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("findGroupsByProperties",this._getCacheControl) 
		try{
			val resp = this.__findGroupsByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MUsersGroupManagerfindGroupsByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findGroupsByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findGroupsByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findGroupsByProperties(tokenId: String, param: MUsersGroupManagerfindGroupsByPropertiesReq) :MResponseFindGroupsByProperties
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findGroupsByProperties: String

	/**
	 * The service links a list of users to a specific usersGroup.
	 * Constraints about the relation between user and groups:
	 * 
	 * <b>[MEUserType] ->(link to) [MEUserGroupType]</b>
	 * 
	 * <ul>
	 * 	<li>PLATFORM_USER-> PLATFORM (group)</li>
	 * </ul>
	 * <ul>
	 * 	<li>PLATFORM_USER_GUEST-> PLATFORM_BLIND (group)</li>
	 * </ul>
	 * 
	 * <b>Deprecated Relations: [MEUserType] ->(link to) [MEUserGroupType]</b>
	 * 
	 * <ul>
	 * 	<li>GENERIC_CONTACT-> SHARED_CONTACTS (group)</li>
	 * </ul>
	 * <ul>
	 * 	<li>EXTERNAL_USER -> SHARED_CONTACTS (group)</li>
	 * </ul>
	 * <ul>
	 * 	<li>* -> PRIVATE (group)</li>
	 * </ul>
	 * 
	 * <b>Constraints: </b>
	 * <ul>
	 * 	<li>A user can be linked to a maximum of 500 groups.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerlinkUserToGroupReq
	 * @return MResponseUsersGroup
	*/
	@POST
	@Path("/linkUserToGroup")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/linkUserToGroup", notes = """The service links a list of users to a specific usersGroup.
	//#SWGNL#Constraints about the relation between user and groups:
	//#SWGNL#
	//#SWGNL#<b>[MEUserType] ->(link to) [MEUserGroupType]</b>
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>PLATFORM_USER-> PLATFORM (group)</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>PLATFORM_USER_GUEST-> PLATFORM_BLIND (group)</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Deprecated Relations: [MEUserType] ->(link to) [MEUserGroupType]</b>
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>GENERIC_CONTACT-> SHARED_CONTACTS (group)</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>EXTERNAL_USER -> SHARED_CONTACTS (group)</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>* -> PRIVATE (group)</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Constraints: </b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>A user can be linked to a maximum of 500 groups.</li>
	//#SWGNL#</ul>""", response = classOf[MResponseUsersGroup])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def linkUserToGroup(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MUsersGroupManagerlinkUserToGroupReq):Response /*returnType = MResponseUsersGroup*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__linkUserToGroup(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_linkUserToGroup)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_linkUserToGroup)
	    }
	} 

	@GET
	@Path("/linkUserToGroup")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def linkUserToGroup_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUsersGroup*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("linkUserToGroup",this._getCacheControl) 
		try{
			val resp = this.__linkUserToGroup(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MUsersGroupManagerlinkUserToGroupReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_linkUserToGroup)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_linkUserToGroup)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __linkUserToGroup(tokenId: String, param: MUsersGroupManagerlinkUserToGroupReq) :MResponseUsersGroup
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_linkUserToGroup: String

	/**
	 * the service unlinks a list of users from a specific group.
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerunlinkUserToGroupReq
	 * @return MResponseUsersGroup
	*/
	@POST
	@Path("/unlinkUserToGroup")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/unlinkUserToGroup", notes = """the service unlinks a list of users from a specific group.""", response = classOf[MResponseUsersGroup])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def unlinkUserToGroup(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MUsersGroupManagerunlinkUserToGroupReq):Response /*returnType = MResponseUsersGroup*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__unlinkUserToGroup(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_unlinkUserToGroup)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_unlinkUserToGroup)
	    }
	} 

	@GET
	@Path("/unlinkUserToGroup")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def unlinkUserToGroup_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUsersGroup*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("unlinkUserToGroup",this._getCacheControl) 
		try{
			val resp = this.__unlinkUserToGroup(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MUsersGroupManagerunlinkUserToGroupReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_unlinkUserToGroup)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_unlinkUserToGroup)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __unlinkUserToGroup(tokenId: String, param: MUsersGroupManagerunlinkUserToGroupReq) :MResponseUsersGroup
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_unlinkUserToGroup: String

}