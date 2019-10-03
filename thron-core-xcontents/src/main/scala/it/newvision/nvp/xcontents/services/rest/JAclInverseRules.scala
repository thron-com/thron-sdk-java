package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclInverseUpdate
import it.newvision.nvp.xcontents.services.model.request.MAclInverseRulesinsertReq
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclInverseList
import it.newvision.nvp.xcontents.services.model.request.MAclInverseRuleslistReq
import it.newvision.nvp.xcontents.services.model.request.MAclInverseRulesremoveReq
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclInverseVerify
import it.newvision.nvp.xcontents.services.model.request.MAclInverseRulesverifyReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to manage Content/Category Acl.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/aclinverserules</li>
 * </ul>
 */
@Path("/aclinverserules")
//#SWG#@Api(value = "/aclinverserules", description = """Service used to manage Content/Category Acl.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/aclinverserules</li>
//#SWGNL#</ul>""")
trait JAclInverseRules extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Used to add new acl rules (enabled or disabled).
	 * If the user add an existing rule, the service doesn't return an error, but simply override the
	 * existing one.
	 * To disable an existing acl simply add the rule to MAclRuleInverse.disabledRulesinverse list.
	 * This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target
	 * object.
	 * For example:
	 * * users with SHARED_BY acl on the content, can add other acls to the content
	 * * users with MODIFIED_BY acl on the category, can add other acls to the category
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAclInverseRulesinsertReq
	 * @return MResponseAclInverseUpdate
	*/
	@POST
	@Path("/insert/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Used to add new acl rules (enabled or disabled). 
	//#SWGNL#If the user add an existing rule, the service doesn't return an error, but simply override the existing one.
	//#SWGNL#To disable an existing acl simply add the rule to MAclRuleInverse.disabledRulesinverse list.
	//#SWGNL#This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target object. 
	//#SWGNL#For example:
	//#SWGNL#* users with SHARED_BY acl on the content, can add other acls to the content
	//#SWGNL#* users with MODIFIED_BY acl on the category, can add other acls to the category""", response = classOf[MResponseAclInverseUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insert(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MAclInverseRulesinsertReq):Response /*returnType = MResponseAclInverseUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__insert(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_insert)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_insert)
	    }
	} 

	@GET
	@Path("/insert/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def insert_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAclInverseUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("insert",this._getCacheControl) 
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MAclInverseRulesinsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, param: MAclInverseRulesinsertReq) :MResponseAclInverseUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * return the acl information for a given target object and class.
	 * The service return a list of AclRuleInfo where is present the displayName of the target Object to
	 * avoid any lookup.
	 * 
	 * The service can be invoked by users with SHARED_BY/MODIFIED_BY acl on the target object.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param targetObjId : String
	 * @param param : MAclInverseRuleslistReq
	 * @return MResponseAclInverseList
	*/
	@POST
	@Path("/list/{clientId}/{targetObjId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/list", notes = """return the acl information for a given target object and class.
	//#SWGNL#The service return a list of AclRuleInfo where is present the displayName of the target Object to avoid any lookup.
	//#SWGNL#
	//#SWGNL#The service can be invoked by users with SHARED_BY/MODIFIED_BY acl on the target object.""", response = classOf[MResponseAclInverseList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def list(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("targetObjId")
	targetObjId: String, 
			param: MAclInverseRuleslistReq):Response /*returnType = MResponseAclInverseList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__list(tokenId,clientId,targetObjId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_list)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_list)
	    }
	} 

	@GET
	@Path("/list/{clientId}/{targetObjId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def list_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("targetObjId")
	targetObjId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAclInverseList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("list",this._getCacheControl) 
		try{
			val resp = this.__list(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,targetObjId,PRestHelper.bindRequest[MAclInverseRuleslistReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_list)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_list)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __list(tokenId: String, clientId: String, targetObjId: String, param: MAclInverseRuleslistReq) :MResponseAclInverseList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_list: String

	/**
	 * Used to remove acl rules from the target object.
	 * This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target
	 * object.
	 * For example:
	 * * users with SHARED_BY acl on the content, can remove other acls to the content
	 * * users with MODIFIED_BY acl on the category, can remove other acls to the category
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAclInverseRulesremoveReq
	 * @return MResponseAclInverseUpdate
	*/
	@POST
	@Path("/remove/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Used to remove acl rules from the target object. 
	//#SWGNL#This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target object. 
	//#SWGNL#For example:
	//#SWGNL#* users with SHARED_BY acl on the content, can remove other acls to the content
	//#SWGNL#* users with MODIFIED_BY acl on the category, can remove other acls to the category""", response = classOf[MResponseAclInverseUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def remove(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MAclInverseRulesremoveReq):Response /*returnType = MResponseAclInverseUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__remove(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_remove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_remove)
	    }
	} 

	@GET
	@Path("/remove/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def remove_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAclInverseUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("remove",this._getCacheControl) 
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MAclInverseRulesremoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_remove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_remove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, clientId: String, param: MAclInverseRulesremoveReq) :MResponseAclInverseUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

	/**
	 * Used to verify a specific acl rule in the target Object.
	 * The service can be invoked by users with SHARED_BY/MODIFIED_BY acl on the target object.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAclInverseRulesverifyReq
	 * @return MResponseAclInverseVerify
	*/
	@POST
	@Path("/verify/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/verify", notes = """Used to verify a specific acl rule in the target Object.
	//#SWGNL#The service can be invoked by users with SHARED_BY/MODIFIED_BY acl on the target object.""", response = classOf[MResponseAclInverseVerify])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def verify(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MAclInverseRulesverifyReq):Response /*returnType = MResponseAclInverseVerify*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__verify(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_verify)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_verify)
	    }
	} 

	@GET
	@Path("/verify/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def verify_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAclInverseVerify*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("verify",this._getCacheControl) 
		try{
			val resp = this.__verify(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MAclInverseRulesverifyReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_verify)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_verify)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __verify(tokenId: String, clientId: String, param: MAclInverseRulesverifyReq) :MResponseAclInverseVerify
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_verify: String

}