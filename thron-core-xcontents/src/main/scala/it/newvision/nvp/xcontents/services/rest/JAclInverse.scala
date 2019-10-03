package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclUpdate
import it.newvision.nvp.xcontents.services.model.request.MAclInverseaddAclRulesReq
import it.newvision.nvp.xcontents.services.model.request.MAclInversedeleteAclRulesReq
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclDetailInverse
import it.newvision.nvp.xcontents.services.model.request.MAclInversegetAclDetailReq
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclVerify
import it.newvision.nvp.xcontents.services.model.request.MAclInverseverifyAclRuleReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Deprecated. Only for 4x version.
 * Service used to manage Content/Categories ACL
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/xcontents/resources/aclinverse/</li>
 * </ul>
 */
@Path("/aclinverse")
//#SWG#@Api(value = "/aclinverse", description = """Deprecated. Only for 4x version.
//#SWGNL#Service used to manage Content/Categories ACL
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.4me.it/api/xcontents/resources/aclinverse/</li>
//#SWGNL#</ul>""")
trait JAclInverse extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * used to add new acl rules (enabled or disabled).
	 * if the user add an existing rule, the service doesn't return an error, but simply override the
	 * existing one.
	 * To disable an existing acl simply add the rule to MAclRuleInverse.disabledRulesinverse list.
	 * This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target
	 * object.
	 * For example:
	 * * users with SHARED_BY acl on the content, can add other acls to the content
	 * * users with MODIFIED_BY acl on the category, can add other acls to the category
	 * @param tokenId : String
	 * @param param : MAclInverseaddAclRulesReq
	 * @return MResponseAclUpdate
	*/
	@POST
	@Path("/addAclRules")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addAclRules", notes = """used to add new acl rules (enabled or disabled). 
	//#SWGNL#if the user add an existing rule, the service doesn't return an error, but simply override the existing one.
	//#SWGNL#To disable an existing acl simply add the rule to MAclRuleInverse.disabledRulesinverse list.
	//#SWGNL#This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target object. 
	//#SWGNL#For example:
	//#SWGNL#* users with SHARED_BY acl on the content, can add other acls to the content
	//#SWGNL#* users with MODIFIED_BY acl on the category, can add other acls to the category""", response = classOf[MResponseAclUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addAclRules(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAclInverseaddAclRulesReq):Response /*returnType = MResponseAclUpdate*/ = {
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
		val cc = this.cachemap.getOrElse("addAclRules",this._getCacheControl) 
		try{
			val resp = this.__addAclRules(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAclInverseaddAclRulesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addAclRules)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addAclRules)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addAclRules(tokenId: String, param: MAclInverseaddAclRulesReq) :MResponseAclUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addAclRules: String

	/**
	 * Used to remove acl rules from the target object.
	 * This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target
	 * object.
	 * For example:
	 * * users with SHARED_BY acl on the content, can remove other acls to the content
	 * * users with MODIFIED_BY acl on the category, can remove other acls to the category
	 * @param tokenId : String
	 * @param param : MAclInversedeleteAclRulesReq
	 * @return MResponseAclUpdate
	*/
	@POST
	@Path("/deleteAclRules")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/deleteAclRules", notes = """Used to remove acl rules from the target object. 
	//#SWGNL#This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target object. 
	//#SWGNL#For example:
	//#SWGNL#* users with SHARED_BY acl on the content, can remove other acls to the content
	//#SWGNL#* users with MODIFIED_BY acl on the category, can remove other acls to the category""", response = classOf[MResponseAclUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def deleteAclRules(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAclInversedeleteAclRulesReq):Response /*returnType = MResponseAclUpdate*/ = {
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
		val cc = this.cachemap.getOrElse("deleteAclRules",this._getCacheControl) 
		try{
			val resp = this.__deleteAclRules(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAclInversedeleteAclRulesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_deleteAclRules)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_deleteAclRules)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __deleteAclRules(tokenId: String, param: MAclInversedeleteAclRulesReq) :MResponseAclUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_deleteAclRules: String

	/**
	 * return the acl information for a given target object and class.
	 * The service return a list of AclRuleInfo where is present the displayName of the target Object to
	 * avoid any lookup.
	 * 
	 * The service can be invoked by users with SHARED_BY/MODIFY_BY acl on the target object.
	 * @param tokenId : String
	 * @param param : MAclInversegetAclDetailReq
	 * @return MResponseAclDetailInverse
	*/
	@POST
	@Path("/getAclDetail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getAclDetail", notes = """return the acl information for a given target object and class.
	//#SWGNL#The service return a list of AclRuleInfo where is present the displayName of the target Object to avoid any lookup.
	//#SWGNL#
	//#SWGNL#The service can be invoked by users with SHARED_BY/MODIFY_BY acl on the target object.""", response = classOf[MResponseAclDetailInverse])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getAclDetail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAclInversegetAclDetailReq):Response /*returnType = MResponseAclDetailInverse*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAclDetailInverse*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("getAclDetail",this._getCacheControl) 
		try{
			val resp = this.__getAclDetail(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAclInversegetAclDetailReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getAclDetail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getAclDetail)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getAclDetail(tokenId: String, param: MAclInversegetAclDetailReq) :MResponseAclDetailInverse
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getAclDetail: String

	/**
	 * Used to verify a specific acl rule in the target Object.
	 * The service can be invoked by users with SHARED_BY/MODIFY_BY acl on the target object.
	 * @param tokenId : String
	 * @param param : MAclInverseverifyAclRuleReq
	 * @return MResponseAclVerify
	*/
	@POST
	@Path("/verifyAclRule")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/verifyAclRule", notes = """Used to verify a specific acl rule in the target Object.
	//#SWGNL#The service can be invoked by users with SHARED_BY/MODIFY_BY acl on the target object.""", response = classOf[MResponseAclVerify])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def verifyAclRule(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAclInverseverifyAclRuleReq):Response /*returnType = MResponseAclVerify*/ = {
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
		val cc = this.cachemap.getOrElse("verifyAclRule",this._getCacheControl) 
		try{
			val resp = this.__verifyAclRule(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAclInverseverifyAclRuleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_verifyAclRule)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_verifyAclRule)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __verifyAclRule(tokenId: String, param: MAclInverseverifyAclRuleReq) :MResponseAclVerify
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_verifyAclRule: String

}