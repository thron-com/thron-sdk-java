package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import com.thron.intelligence.services.model.metadata.MResponseIMetadata
import com.thron.intelligence.services.model.request.MIMetadatainsertReq
import com.thron.intelligence.services.model.request.MIMetadataremoveReq
import com.thron.intelligence.services.model.request.MIMetadataupdateReq
import com.thron.intelligence.services.model.metadata.MResponseIMetadataBulk
import com.thron.intelligence.services.model.request.MIMetadatabulkInsertReq
import com.thron.intelligence.services.model.request.MIMetadatabulkRemoveReq
import com.thron.intelligence.services.model.metadata.MResponseIMetadataBulk2
import com.thron.intelligence.services.model.request.MIMetadatabulkInsertMultiTargetsReq
import com.thron.intelligence.services.model.request.MIMetadatabulkRemoveMultiTargetsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xintelligence/resources/imetadata</li>
 * </ul>
 */
@Path("/imetadata")
//#SWG#@Api(value = "/imetadata", description = """<b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xintelligence/resources/imetadata</li>
//#SWGNL#</ul>""")
trait JIMetadata extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Adds an imetadata to an entity.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatainsertReq
	 * @return MResponseIMetadata
	*/
	@POST
	@Path("/insert/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Adds an imetadata to an entity.
	//#SWGNL#
	//#SWGNL#<b>Validation for user:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and CORE_MANAGE_USERS) role
	//#SWGNL#
	//#SWGNL#<b>Validation for content:</b>
	//#SWGNL#MODIFY ACL on the contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role""", response = classOf[MResponseIMetadata])
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
			param: MIMetadatainsertReq):Response /*returnType = MResponseIMetadata*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__insert(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_insert)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_insert)
	    }
	} 

	@GET
	@Path("/insert/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def insert_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseIMetadata*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("insert",this._getCacheControl) 
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MIMetadatainsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, classificationId: String, param: MIMetadatainsertReq) :MResponseIMetadata
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * Removes a given imetadata from an entity.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param key : String
	 * An existing targetId for a specific classification
	 * @param param : MIMetadataremoveReq
	 * @return MResponseIMetadata
	*/
	@POST
	@Path("/remove/{clientId}/{classificationId}/{key}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Removes a given imetadata from an entity.
	//#SWGNL#
	//#SWGNL#<b>Validation for user:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and CORE_MANAGE_USERS) role
	//#SWGNL#
	//#SWGNL#<b>Validation for content:</b>
	//#SWGNL#MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role""", response = classOf[MResponseIMetadata])
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
			//#SWG#@ApiParam(value = """An existing targetId for a specific classification""")
	@PathParam("key")
	key: String, 
			param: MIMetadataremoveReq):Response /*returnType = MResponseIMetadata*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__remove(tokenId,clientId,classificationId,key,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_remove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_remove)
	    }
	} 

	@GET
	@Path("/remove/{clientId}/{classificationId}/{key}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def remove_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """An existing targetId for a specific classification""")
	@PathParam("key")
	key: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseIMetadata*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("remove",this._getCacheControl) 
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,key,PRestHelper.bindRequest[MIMetadataremoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_remove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_remove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, clientId: String, classificationId: String, key: String, param: MIMetadataremoveReq) :MResponseIMetadata
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

	/**
	 * Updates an imetadata value on an entity.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadataupdateReq
	 * @return MResponseIMetadata
	*/
	@POST
	@Path("/update/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """Updates an imetadata value on an entity.
	//#SWGNL#
	//#SWGNL#<b>Validation for user:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and CORE_MANAGE_USERS) role
	//#SWGNL#
	//#SWGNL#<b>Validation for content:</b>
	//#SWGNL#MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role""", response = classOf[MResponseIMetadata])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def update(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MIMetadataupdateReq):Response /*returnType = MResponseIMetadata*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__update(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_update)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_update)
	    }
	} 

	@GET
	@Path("/update/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def update_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseIMetadata*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("update",this._getCacheControl) 
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MIMetadataupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, clientId: String, classificationId: String, param: MIMetadataupdateReq) :MResponseIMetadata
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

	/**
	 * Adds a list of imetadata to an entity,
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatabulkInsertReq
	 * @return MResponseIMetadataBulk
	*/
	@POST
	@Path("/bulkInsert/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/bulkInsert", notes = """Adds a list of imetadata to an entity,
	//#SWGNL#
	//#SWGNL#<b>Validation for user:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and CORE_MANAGE_USERS) role
	//#SWGNL#
	//#SWGNL#<b>Validation for content:</b>
	//#SWGNL#MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role""", response = classOf[MResponseIMetadataBulk])
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
			param: MIMetadatabulkInsertReq):Response /*returnType = MResponseIMetadataBulk*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseIMetadataBulk*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("bulkInsert",this._getCacheControl) 
		try{
			val resp = this.__bulkInsert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MIMetadatabulkInsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_bulkInsert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_bulkInsert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __bulkInsert(tokenId: String, clientId: String, classificationId: String, param: MIMetadatabulkInsertReq) :MResponseIMetadataBulk
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_bulkInsert: String

	/**
	 * Removes a list of imetadata from an entity.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatabulkRemoveReq
	 * @return MResponseIMetadataBulk
	*/
	@POST
	@Path("/bulkRemove/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/bulkRemove", notes = """Removes a list of imetadata from an entity.
	//#SWGNL#
	//#SWGNL#<b>Validation for user:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and CORE_MANAGE_USERS) role
	//#SWGNL#
	//#SWGNL#<b>Validation for content:</b>
	//#SWGNL#MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role""", response = classOf[MResponseIMetadataBulk])
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
			param: MIMetadatabulkRemoveReq):Response /*returnType = MResponseIMetadataBulk*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseIMetadataBulk*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("bulkRemove",this._getCacheControl) 
		try{
			val resp = this.__bulkRemove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MIMetadatabulkRemoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_bulkRemove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_bulkRemove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __bulkRemove(tokenId: String, clientId: String, classificationId: String, param: MIMetadatabulkRemoveReq) :MResponseIMetadataBulk
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_bulkRemove: String

	/**
	 * Adds an imetadata to multiple entities.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatabulkInsertMultiTargetsReq
	 * @return MResponseIMetadataBulk2
	*/
	@POST
	@Path("/bulkInsertMultiTargets/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/bulkInsertMultiTargets", notes = """Adds an imetadata to multiple entities.
	//#SWGNL#
	//#SWGNL#<b>Validation for user:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and CORE_MANAGE_USERS) role
	//#SWGNL#
	//#SWGNL#<b>Validation for content:</b>
	//#SWGNL#MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role""", response = classOf[MResponseIMetadataBulk2])
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
			param: MIMetadatabulkInsertMultiTargetsReq):Response /*returnType = MResponseIMetadataBulk2*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseIMetadataBulk2*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("bulkInsertMultiTargets",this._getCacheControl) 
		try{
			val resp = this.__bulkInsertMultiTargets(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MIMetadatabulkInsertMultiTargetsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_bulkInsertMultiTargets)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_bulkInsertMultiTargets)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __bulkInsertMultiTargets(tokenId: String, clientId: String, classificationId: String, param: MIMetadatabulkInsertMultiTargetsReq) :MResponseIMetadataBulk2
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_bulkInsertMultiTargets: String

	/**
	 * Removes an imetadata value from multiple entities.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatabulkRemoveMultiTargetsReq
	 * @return MResponseIMetadataBulk2
	*/
	@POST
	@Path("/bulkRemoveMultiTargets/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/bulkRemoveMultiTargets", notes = """Removes an imetadata value from multiple entities.
	//#SWGNL#
	//#SWGNL#<b>Validation for user:</b>
	//#SWGNL#(THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and CORE_MANAGE_USERS) role
	//#SWGNL#
	//#SWGNL#<b>Validation for content:</b>
	//#SWGNL#MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role""", response = classOf[MResponseIMetadataBulk2])
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
			param: MIMetadatabulkRemoveMultiTargetsReq):Response /*returnType = MResponseIMetadataBulk2*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseIMetadataBulk2*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("bulkRemoveMultiTargets",this._getCacheControl) 
		try{
			val resp = this.__bulkRemoveMultiTargets(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MIMetadatabulkRemoveMultiTargetsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_bulkRemoveMultiTargets)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_bulkRemoveMultiTargets)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __bulkRemoveMultiTargets(tokenId: String, clientId: String, classificationId: String, param: MIMetadatabulkRemoveMultiTargetsReq) :MResponseIMetadataBulk2
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_bulkRemoveMultiTargets: String

}