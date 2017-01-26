package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import com.thron.intelligence.services.model.tag.MResponseITag
import com.thron.intelligence.services.model.request.MITaginsertReq
import com.thron.intelligence.services.model.request.MITagremoveReq
import com.thron.intelligence.services.model.itag.MResponseITagBulk
import com.thron.intelligence.services.model.request.MITagbulkInsertReq
import com.thron.intelligence.services.model.request.MITagbulkRemoveReq
import com.thron.intelligence.services.model.itag.MResponseITagBulk2
import com.thron.intelligence.services.model.request.MITagbulkInsertMultiTargetsReq
import com.thron.intelligence.services.model.request.MITagbulkRemoveMultiTargetsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xintelligence/resources/itag  </li>
 * </ul>
 */
@Path("/itag")
//#SWG#@Api(value = "/itag", description = """<b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xintelligence/resources/itag  </li>
//#SWGNL#</ul>""")
trait JITag extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Link a given itagId to a specific entity  (Content, User, Contact).
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>50: max number of itags in each target (created by users)</li>
	 * 	<li>50: max number of itags in each target (created by engines)</li>
	 * </ul>
	 * <b>
	 * </b><b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * 
	 * <b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * the tag definition id.
	 * TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId
	 * @param param : MITaginsertReq
	 * @return MResponseITag
	*/
	@POST
	@Path("/insert/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Link a given itagId to a specific entity  (Content, User, Contact).
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>50: max number of itags in each target (created by users)</li>
	//#SWGNL#	<li>50: max number of itags in each target (created by engines)</li>
	//#SWGNL#</ul>
	//#SWGNL#<b>
	//#SWGNL#</b><b>Role Validation for Tagging Users:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and CORE_MANAGE_USERS)
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents</b>
	//#SWGNL#MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or 
	//#SWGNL#(THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)""", response = classOf[MResponseITag])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insert(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """the tag definition id.
	//#SWGNL#TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId""")
	@PathParam("itagId")
	itagId: String, 
			param: MITaginsertReq):Response /*returnType = MResponseITag*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__insert(tokenId,clientId,classificationId,itagId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_insert)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_insert)
	    }
	} 

	@GET
	@Path("/insert/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def insert_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """the tag definition id.
	//#SWGNL#TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId""")
	@PathParam("itagId")
	itagId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITag*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("insert",this._getCacheControl) 
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,PRestHelper.bindRequest[MITaginsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, classificationId: String, itagId: String, param: MITaginsertReq) :MResponseITag
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * Unlink a given itagId from a specific entity (Content, User, Contact).
	 * <b>Removal of combined tags:</b>
	 * Let's suppose we have two tags: "A" and "B". "B" has been combined within "A"
	 * 
	 * <ul>
	 * 	<li>Case scenario 1: A content tagged with  tag "A" --> If remove is invoked for "B", the service
	 * will return exception.</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 2: A content tagged with tag "B" --> remove web service will return 200 both for
	 * tag "A" and tag "B" because "B" is combined in "A".</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 3: A content tagged with both "A" and "B" tags --> If remove is invoked on "A"
	 * the service will remove both "A" and "B" tags.</li>
	 * </ul>
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * 
	 * <b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * THRON_EDIT_CONTACTS)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * the tag definition id.
	 * TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId
	 * @param param : MITagremoveReq
	 * @return MResponseITag
	*/
	@POST
	@Path("/remove/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Unlink a given itagId from a specific entity (Content, User, Contact).
	//#SWGNL#<b>Removal of combined tags:</b> 
	//#SWGNL#Let's suppose we have two tags: "A" and "B". "B" has been combined within "A"
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>Case scenario 1: A content tagged with  tag "A" --> If remove is invoked for "B", the service will return exception.</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>Case scenario 2: A content tagged with tag "B" --> remove web service will return 200 both for tag "A" and tag "B" because "B" is combined in "A".</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>Case scenario 3: A content tagged with both "A" and "B" tags --> If remove is invoked on "A" the service will remove both "A" and "B" tags.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Users:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and CORE_MANAGE_USERS)
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents</b>
	//#SWGNL#MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)""", response = classOf[MResponseITag])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def remove(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """the tag definition id.
	//#SWGNL#TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId""")
	@PathParam("itagId")
	itagId: String, 
			param: MITagremoveReq):Response /*returnType = MResponseITag*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__remove(tokenId,clientId,classificationId,itagId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_remove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_remove)
	    }
	} 

	@GET
	@Path("/remove/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def remove_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """the tag definition id.
	//#SWGNL#TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId""")
	@PathParam("itagId")
	itagId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITag*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("remove",this._getCacheControl) 
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,PRestHelper.bindRequest[MITagremoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_remove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_remove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, clientId: String, classificationId: String, itagId: String, param: MITagremoveReq) :MResponseITag
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

	/**
	 * Bulk insert service for itags
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>100: max number of itags for each target</li>
	 * </ul>
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * 
	 * <b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagbulkInsertReq
	 * @return MResponseITagBulk
	*/
	@POST
	@Path("/bulkInsert/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/bulkInsert", notes = """Bulk insert service for itags
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>100: max number of itags for each target</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Users:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and CORE_MANAGE_USERS)
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents</b>
	//#SWGNL#MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or 
	//#SWGNL#(THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)""", response = classOf[MResponseITagBulk])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def bulkInsert(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagbulkInsertReq):Response /*returnType = MResponseITagBulk*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__bulkInsert(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_bulkInsert)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_bulkInsert)
	    }
	} 

	@GET
	@Path("/bulkInsert/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def bulkInsert_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagBulk*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("bulkInsert",this._getCacheControl) 
		try{
			val resp = this.__bulkInsert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagbulkInsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_bulkInsert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_bulkInsert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __bulkInsert(tokenId: String, clientId: String, classificationId: String, param: MITagbulkInsertReq) :MResponseITagBulk
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_bulkInsert: String

	/**
	 * Bulk remove service for itags.
	 * 
	 * <b>Removal of combined tags:</b>
	 * Let's suppose we have two tags: "A" and "B". "B" has been combined within "A"
	 * 
	 * <ul>
	 * 	<li>Case scenario 1: A content tagged with  tag "A" --> If remove is invoked for "B", the service
	 * will return exception.</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 2: A content tagged with tag "B" --> remove web service will return 200 both for
	 * tag "A" and tag "B" because "B" is combined in "A".</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 3: A content tagged with both "A" and "B" tags --> If remove is invoked on "A"
	 * the service will remove both "A" and "B" tags.</li>
	 * </ul>
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * 
	 * <b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagbulkRemoveReq
	 * @return MResponseITagBulk
	*/
	@POST
	@Path("/bulkRemove/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/bulkRemove", notes = """Bulk remove service for itags.
	//#SWGNL#
	//#SWGNL#<b>Removal of combined tags:</b> 
	//#SWGNL#Let's suppose we have two tags: "A" and "B". "B" has been combined within "A"
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>Case scenario 1: A content tagged with  tag "A" --> If remove is invoked for "B", the service will return exception.</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>Case scenario 2: A content tagged with tag "B" --> remove web service will return 200 both for tag "A" and tag "B" because "B" is combined in "A".</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>Case scenario 3: A content tagged with both "A" and "B" tags --> If remove is invoked on "A" the service will remove both "A" and "B" tags.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Users:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and CORE_MANAGE_USERS)
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents</b>
	//#SWGNL#MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or 
	//#SWGNL#(THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)""", response = classOf[MResponseITagBulk])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def bulkRemove(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagbulkRemoveReq):Response /*returnType = MResponseITagBulk*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__bulkRemove(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_bulkRemove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_bulkRemove)
	    }
	} 

	@GET
	@Path("/bulkRemove/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def bulkRemove_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagBulk*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("bulkRemove",this._getCacheControl) 
		try{
			val resp = this.__bulkRemove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagbulkRemoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_bulkRemove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_bulkRemove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __bulkRemove(tokenId: String, clientId: String, classificationId: String, param: MITagbulkRemoveReq) :MResponseITagBulk
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_bulkRemove: String

	/**
	 * Apply a single itag to multiple targets  (Content, User, Contact).
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>100: max number of itags for each target</li>
	 * </ul>
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * 
	 * <b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagbulkInsertMultiTargetsReq
	 * @return MResponseITagBulk2
	*/
	@POST
	@Path("/bulkInsertMultiTargets/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/bulkInsertMultiTargets", notes = """Apply a single itag to multiple targets  (Content, User, Contact).
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>100: max number of itags for each target</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Users:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and CORE_MANAGE_USERS)
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents</b>
	//#SWGNL#MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or 
	//#SWGNL#(THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)""", response = classOf[MResponseITagBulk2])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def bulkInsertMultiTargets(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagbulkInsertMultiTargetsReq):Response /*returnType = MResponseITagBulk2*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__bulkInsertMultiTargets(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_bulkInsertMultiTargets)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_bulkInsertMultiTargets)
	    }
	} 

	@GET
	@Path("/bulkInsertMultiTargets/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def bulkInsertMultiTargets_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagBulk2*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("bulkInsertMultiTargets",this._getCacheControl) 
		try{
			val resp = this.__bulkInsertMultiTargets(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagbulkInsertMultiTargetsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_bulkInsertMultiTargets)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_bulkInsertMultiTargets)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __bulkInsertMultiTargets(tokenId: String, clientId: String, classificationId: String, param: MITagbulkInsertMultiTargetsReq) :MResponseITagBulk2
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_bulkInsertMultiTargets: String

	/**
	 * Remove a given itag from a list entities (Content, User, Contact).
	 * <b>Removal of combined tags:</b>
	 * Let's suppose we have two tags: "A" and "B". "B" has been combined within "A"
	 * 
	 * <ul>
	 * 	<li>Case scenario 1: A content tagged with  tag "A" --> If remove is invoked for "B", the service
	 * will return exception.</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 2: A content tagged with tag "B" --> remove web service will return 200 both for
	 * tag "A" and tag "B" because "B" is combined in "A".</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 3: A content tagged with both "A" and "B" tags --> If remove is invoked on "A"
	 * the service will remove both "A" and "B" tags.</li>
	 * </ul>
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * 
	 * <b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagbulkRemoveMultiTargetsReq
	 * @return MResponseITagBulk2
	*/
	@POST
	@Path("/bulkRemoveMultiTargets/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/bulkRemoveMultiTargets", notes = """Remove a given itag from a list entities (Content, User, Contact).
	//#SWGNL#<b>Removal of combined tags:</b> 
	//#SWGNL#Let's suppose we have two tags: "A" and "B". "B" has been combined within "A"
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>Case scenario 1: A content tagged with  tag "A" --> If remove is invoked for "B", the service will return exception.</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>Case scenario 2: A content tagged with tag "B" --> remove web service will return 200 both for tag "A" and tag "B" because "B" is combined in "A".</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>Case scenario 3: A content tagged with both "A" and "B" tags --> If remove is invoked on "A" the service will remove both "A" and "B" tags.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Users:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and CORE_MANAGE_USERS)
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents</b>
	//#SWGNL#MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	//#SWGNL#
	//#SWGNL#<b>Role Validation for Tagging Contents (only with Sales or Marketing App)</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or 
	//#SWGNL#(THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS)""", response = classOf[MResponseITagBulk2])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def bulkRemoveMultiTargets(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagbulkRemoveMultiTargetsReq):Response /*returnType = MResponseITagBulk2*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__bulkRemoveMultiTargets(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_bulkRemoveMultiTargets)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_bulkRemoveMultiTargets)
	    }
	} 

	@GET
	@Path("/bulkRemoveMultiTargets/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def bulkRemoveMultiTargets_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagBulk2*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("bulkRemoveMultiTargets",this._getCacheControl) 
		try{
			val resp = this.__bulkRemoveMultiTargets(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagbulkRemoveMultiTargetsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_bulkRemoveMultiTargets)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_bulkRemoveMultiTargets)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __bulkRemoveMultiTargets(tokenId: String, clientId: String, classificationId: String, param: MITagbulkRemoveMultiTargetsReq) :MResponseITagBulk2
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_bulkRemoveMultiTargets: String

}