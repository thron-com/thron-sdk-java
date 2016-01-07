package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.identity.services.model.acl.MResponseAclDetail
import it.newvision.nvp.identity.services.model.request.MAclgetAclDetailReq
import it.newvision.nvp.identity.services.model.acl.MResponseAclUpdate
import it.newvision.nvp.identity.services.model.request.MAcladdAclRulesReq
import it.newvision.nvp.identity.services.model.acl.MResponseAclVerify
import it.newvision.nvp.identity.services.model.request.MAclverifyAclRuleReq
import it.newvision.nvp.identity.services.model.request.MAcldeleteAclRulesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to manage Users and Groups Access Control List.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.com/api/xsso/resources/acl/</li>
 * </ul>
 */
@Path("/acl")
//#SWG#@Api(value = "/acl", description = """Service used to manage Users and Groups Access Control List. 
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xsso/resources/acl/</li>
//#SWGNL#</ul>""")
trait JAcl extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * return the acl information for a given target object and class.
	 * The service return a list of AclRuleInfo where is present the displayName of the target Object
	 * (user fullname or goup name) to avoid any lookup.
	 * The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS
	 * @param tokenId : String
	 * @param param : MAclgetAclDetailReq
	 * @return MResponseAclDetail
	*/
	@POST
	@Path("/getAclDetail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getAclDetail", notes = """return the acl information for a given target object and class.
	//#SWGNL#The service return a list of AclRuleInfo where is present the displayName of the target Object (user fullname or goup name) to avoid any lookup.
	//#SWGNL#The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS""", response = classOf[MResponseAclDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getAclDetail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAclgetAclDetailReq):Response /*returnType = MResponseAclDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getAclDetail(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getAclDetail)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getAclDetail)
	    }
	} 

	@GET
	@Path("/getAclDetail")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getAclDetail_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAclDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getAclDetail(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAclgetAclDetailReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getAclDetail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getAclDetail)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getAclDetail(tokenId: String, param: MAclgetAclDetailReq) :MResponseAclDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getAclDetail: String

	/**
	 * The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS
	 * 
	 * <b>Constraints: </b>
	 * <ul>
	 * 	<li>A user can have Acl rules for a maximum of 100 distinct target</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAcladdAclRulesReq
	 * @return MResponseAclUpdate
	*/
	@POST
	@Path("/addAclRules")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addAclRules", notes = """The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS
	//#SWGNL#
	//#SWGNL#<b>Constraints: </b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>A user can have Acl rules for a maximum of 100 distinct target</li>
	//#SWGNL#</ul>""", response = classOf[MResponseAclUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addAclRules(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAcladdAclRulesReq):Response /*returnType = MResponseAclUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addAclRules(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addAclRules)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addAclRules)
	    }
	} 

	@GET
	@Path("/addAclRules")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addAclRules_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAclUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addAclRules(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAcladdAclRulesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addAclRules)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addAclRules)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addAclRules(tokenId: String, param: MAcladdAclRulesReq) :MResponseAclUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addAclRules: String

	/**
	 * The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS
	 * @param tokenId : String
	 * @param param : MAclverifyAclRuleReq
	 * @return MResponseAclVerify
	*/
	@POST
	@Path("/verifyAclRule")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/verifyAclRule", notes = """The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS""", response = classOf[MResponseAclVerify])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def verifyAclRule(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAclverifyAclRuleReq):Response /*returnType = MResponseAclVerify*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__verifyAclRule(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_verifyAclRule)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_verifyAclRule)
	    }
	} 

	@GET
	@Path("/verifyAclRule")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def verifyAclRule_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAclVerify*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__verifyAclRule(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAclverifyAclRuleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_verifyAclRule)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_verifyAclRule)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __verifyAclRule(tokenId: String, param: MAclverifyAclRuleReq) :MResponseAclVerify
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_verifyAclRule: String

	/**
	 * The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS
	 * @param tokenId : String
	 * @param param : MAcldeleteAclRulesReq
	 * @return MResponseAclUpdate
	*/
	@POST
	@Path("/deleteAclRules")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/deleteAclRules", notes = """The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS""", response = classOf[MResponseAclUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def deleteAclRules(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAcldeleteAclRulesReq):Response /*returnType = MResponseAclUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__deleteAclRules(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_deleteAclRules)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_deleteAclRules)
	    }
	} 

	@GET
	@Path("/deleteAclRules")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def deleteAclRules_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAclUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__deleteAclRules(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAcldeleteAclRulesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_deleteAclRules)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_deleteAclRules)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __deleteAclRules(tokenId: String, param: MAcldeleteAclRulesReq) :MResponseAclUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_deleteAclRules: String

}