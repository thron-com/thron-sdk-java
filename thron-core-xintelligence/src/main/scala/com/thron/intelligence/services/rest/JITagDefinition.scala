package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import com.thron.intelligence.services.model.tag.MResponseITagDefinitionDetail
import com.thron.intelligence.services.model.request.MITagDefinitioninsertReq
import com.thron.intelligence.services.model.request.MITagDefinitionsuggestReq
import com.thron.intelligence.services.model.tag.MResponseITagDefinitionList
import com.thron.intelligence.services.model.request.MITagDefinitionlistReq
import com.thron.intelligence.services.model.tag.MEITagDefinitionOrderBy
import com.thron.intelligence.services.model.request.MITagDefinitionmergeReq
import com.thron.intelligence.services.model.request.MITagDefinitionupdateReq
import com.thron.intelligence.services.model.itag.MResponseITagRemove
import com.thron.intelligence.services.model.request.MITagDefinitionremoveReq
import com.thron.intelligence.services.model.request.MITagDefinitionapproveReq
import com.thron.intelligence.services.model.tag.MResponseITagMetadataLink
import com.thron.intelligence.services.model.request.MITagDefinitionlinkMetadataDefinitionReq
import com.thron.intelligence.services.model.request.MITagDefinitionunlinkMetadataDefinitionReq
import com.thron.intelligence.services.model.request.MITagDefinitionupdateTagMetadataReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Services used to handle Tag Definition for a specific Classification
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xintelligence/resources/itagdefinition/</li>
 * </ul>
 */
@Path("/itagdefinition")
//#SWG#@Api(value = "/itagdefinition", description = """Services used to handle Tag Definition for a specific Classification
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xintelligence/resources/itagdefinition/</li>
//#SWGNL#</ul>""")
trait JITagDefinition extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Insert a new ITagDefinition inside a given classification.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>it's not possible to create itagdefinition with a parentId uncategorized or unapproved.</li>
	 * 	<li>it's not possible to create tree structure with more than 1000 nodes.</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER or
	 * THRON_CLASS_[CLASSID]_TAG_SUGGESTER (only for not categorized tags)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitioninsertReq
	 * @return MResponseITagDefinitionDetail
	*/
	@POST
	@Path("/insert/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Insert a new ITagDefinition inside a given classification.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>it's not possible to create itagdefinition with a parentId uncategorized or unapproved.</li>
	//#SWGNL#	<li>it's not possible to create tree structure with more than 1000 nodes.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER or THRON_CLASS_[CLASSID]_TAG_SUGGESTER (only for not categorized tags)""", response = classOf[MResponseITagDefinitionDetail])
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
			param: MITagDefinitioninsertReq):Response /*returnType = MResponseITagDefinitionDetail*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitioninsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, classificationId: String, param: MITagDefinitioninsertReq) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * <b>Not yet available!</b>
	 * Suggest a new ITagDefinition for the given classification.
	 * Used by users or engines to suggest new tags for a given classification.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>it's not possible to suggest itagdefinition with a parentId in unapproved status (only
	 * approved tag can have children) or uncategorized.</li>
	 * 	<li>it's not possible to linkMetadataDefinition to unapprovedTags</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER or
	 * THRON_CLASS_[CLASSID]_TAG_SUGGESTER 
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionsuggestReq
	 * @return MResponseITagDefinitionDetail
	*/
	@POST
	@Path("/suggest/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/suggest", notes = """<b>Not yet available!</b>
	//#SWGNL#Suggest a new ITagDefinition for the given classification.
	//#SWGNL#Used by users or engines to suggest new tags for a given classification.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>it's not possible to suggest itagdefinition with a parentId in unapproved status (only approved tag can have children) or uncategorized.</li>
	//#SWGNL#	<li>it's not possible to linkMetadataDefinition to unapprovedTags</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER or THRON_CLASS_[CLASSID]_TAG_SUGGESTER """, response = classOf[MResponseITagDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def suggest(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagDefinitionsuggestReq):Response /*returnType = MResponseITagDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__suggest(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_suggest)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_suggest)
	    }
	} 

	@GET
	@Path("/suggest/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def suggest_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__suggest(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitionsuggestReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_suggest)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_suggest)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __suggest(tokenId: String, clientId: String, classificationId: String, param: MITagDefinitionsuggestReq) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_suggest: String

	/**
	 * Lists the client's Tags. This method return the tags matching the given search criteria.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionlistReq
	 * @return MResponseITagDefinitionList
	*/
	@POST
	@Path("/list/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/list", notes = """Lists the client's Tags. This method return the tags matching the given search criteria.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER""", response = classOf[MResponseITagDefinitionList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def list(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagDefinitionlistReq):Response /*returnType = MResponseITagDefinitionList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__list(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_list)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_list)
	    }
	} 

	@GET
	@Path("/list/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def list_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__list(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitionlistReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_list)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_list)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __list(tokenId: String, clientId: String, classificationId: String, param: MITagDefinitionlistReq) :MResponseITagDefinitionList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_list: String

	/**
	 * Lists the client's Tags. This method return the ITagDefinition matching the given search criteria.
	 * <b>
	 * </b><b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * Required
	 * @param text : String
	 * Optional. search criteria
	 * @param lang : String
	 * Optional
	 * @param ids : String
	 * Optional. As csv list of ITagDefinition.id or ITagDefinition.prettyId
	 * @param showLinkedMetadata : Boolean
	 * Optional. default is false
	 * Fill the list of linked metadata definition in items.linkedMetadataDefinition
	 * @param orderBy : MEITagDefinitionOrderBy
	 * Optional
	 * @param offset : Integer
	 * Optional.
	 * Default value is 0
	 * @param limit : Integer
	 * Optional. Default value is 50
	 * @return MResponseITagDefinitionList
	*/
	@GET
	@Path("/listGet/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/listGet", notes = """Lists the client's Tags. This method return the ITagDefinition matching the given search criteria.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER""", response = classOf[MResponseITagDefinitionList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listGet(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Required""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Optional. search criteria""")
	@QueryParam("text")
	text: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("lang")
	lang: String, 
			//#SWG#@ApiParam(value = """Optional. As csv list of ITagDefinition.id or ITagDefinition.prettyId""")
	@QueryParam("ids")
	ids: String, 
			//#SWG#@ApiParam(value = """Optional. default is false
	//#SWGNL#Fill the list of linked metadata definition in items.linkedMetadataDefinition""")
	@QueryParam("showLinkedMetadata")
	showLinkedMetadata: Boolean, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("orderBy")
	orderBy: MEITagDefinitionOrderBy, 
			//#SWG#@ApiParam(value = """Optional.
	//#SWGNL#Default value is 0""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default value is 50""")
	@QueryParam("limit")
	limit: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseITagDefinitionList*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("listGet") 
		try{	
			val resp = this.__listGet(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,classificationId,text,lang,ids,showLinkedMetadata,orderBy,offset,limit)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listGet)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listGet)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listGet(tokenId: String, clientId: String, classificationId: String, text: String, lang: String, ids: String, showLinkedMetadata: Boolean, orderBy: MEITagDefinitionOrderBy, offset: Integer, limit: Integer) :MResponseITagDefinitionList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listGet: String

	/**
	 * Return the detail information for a given ITagDefinition.
	 * <b>
	 * </b><b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param showLinkedMetadata : Boolean
	 * Optional. Default value is false
	 * @return MResponseITagDefinitionDetail
	*/
	@GET
	@Path("/detail/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """Return the detail information for a given ITagDefinition.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER""", response = classOf[MResponseITagDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("id")
	id: String, 
			//#SWG#@ApiParam(value = """Optional. Default value is false""")
	@QueryParam("showLinkedMetadata")
	showLinkedMetadata: Boolean,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseITagDefinitionDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detail") 
		try{	
			val resp = this.__detail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,classificationId,id,showLinkedMetadata)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, clientId: String, classificationId: String, id: String, showLinkedMetadata: Boolean) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * <b>Not yet available.</b>
	 * Merge a source ITagDefinition into a target ITagDefinition.
	 * Constraints:
	 * <ul>
	 * 	<li>source and target should have the same categorized value</li>
	 * 	<li>source.status = suggested</li>
	 * 	<li>target.status = [suggested or approved]</li>
	 * 	<li>source should be a leaf</li>
	 * </ul>
	 * <ul>
	 * 	<li>source.categorized = true and target.categorized = false is not allowed</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionmergeReq
	 * @return MResponseITagDefinitionDetail
	*/
	@POST
	@Path("/merge/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/merge", notes = """<b>Not yet available.</b>
	//#SWGNL#Merge a source ITagDefinition into a target ITagDefinition. 
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>source and target should have the same categorized value</li>
	//#SWGNL#	<li>source.status = suggested</li>
	//#SWGNL#	<li>target.status = [suggested or approved]</li>
	//#SWGNL#	<li>source should be a leaf</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>source.categorized = true and target.categorized = false is not allowed</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def merge(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagDefinitionmergeReq):Response /*returnType = MResponseITagDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__merge(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_merge)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_merge)
	    }
	} 

	@GET
	@Path("/merge/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def merge_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__merge(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitionmergeReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_merge)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_merge)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __merge(tokenId: String, clientId: String, classificationId: String, param: MITagDefinitionmergeReq) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_merge: String

	/**
	 * Update in "patch" mode the ITagDefinition.
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param param : MITagDefinitionupdateReq
	 * @return MResponseITagDefinitionDetail
	*/
	@POST
	@Path("/update/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """Update in "patch" mode the ITagDefinition.
	//#SWGNL#The "update" field of this web service works in “patch" mode: it means that each and everyone of the "update" attributes you want to change must be included in the body of the request, those not included will not be updated.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseITagDefinitionDetail])
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
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("id")
	id: String, 
			param: MITagDefinitionupdateReq):Response /*returnType = MResponseITagDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__update(tokenId,clientId,classificationId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_update)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_update)
	    }
	} 

	@GET
	@Path("/update/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def update_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id,PRestHelper.bindRequest[MITagDefinitionupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, clientId: String, classificationId: String, id: String, param: MITagDefinitionupdateReq) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

	/**
	 * Definitely remove  an ITagDefinition from the classification.
	 * It's only possible to remove ITagDefinition without children.
	 * The operation remove also the link with metadata definition
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param param : MITagDefinitionremoveReq
	 * @return MResponseITagRemove
	*/
	@POST
	@Path("/remove/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Definitely remove  an ITagDefinition from the classification.
	//#SWGNL#It's only possible to remove ITagDefinition without children. 
	//#SWGNL#The operation remove also the link with metadata definition
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseITagRemove])
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
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("id")
	id: String, 
			param: MITagDefinitionremoveReq):Response /*returnType = MResponseITagRemove*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__remove(tokenId,clientId,classificationId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_remove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_remove)
	    }
	} 

	@GET
	@Path("/remove/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def remove_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagRemove*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id,PRestHelper.bindRequest[MITagDefinitionremoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_remove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_remove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, clientId: String, classificationId: String, id: String, param: MITagDefinitionremoveReq) :MResponseITagRemove
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

	/**
	 * <b>Not yet available!</b>
	 * Approve and update a suggested ITagDefinition.
	 * Re-approve "rejected" Tags is not allowed.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param param : MITagDefinitionapproveReq
	 * @return MResponseITagDefinitionDetail
	*/
	@POST
	@Path("/approve/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/approve", notes = """<b>Not yet available!</b>
	//#SWGNL#Approve and update a suggested ITagDefinition.  
	//#SWGNL#Re-approve "rejected" Tags is not allowed.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseITagDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def approve(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("id")
	id: String, 
			param: MITagDefinitionapproveReq):Response /*returnType = MResponseITagDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__approve(tokenId,clientId,classificationId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_approve)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_approve)
	    }
	} 

	@GET
	@Path("/approve/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def approve_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__approve(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id,PRestHelper.bindRequest[MITagDefinitionapproveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_approve)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_approve)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __approve(tokenId: String, clientId: String, classificationId: String, id: String, param: MITagDefinitionapproveReq) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_approve: String

	/**
	 * <b>Not yet available!</b>
	 * Reject the ITagDefinition and remove all links to contents/users/categories....
	 * Can be rejected only "suggested" ITagDefinitions (not approved)
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @return MResponseITagDefinitionDetail
	*/
	@POST
	@Path("/reject/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/reject", notes = """<b>Not yet available!</b>
	//#SWGNL#Reject the ITagDefinition and remove all links to contents/users/categories....
	//#SWGNL#Can be rejected only "suggested" ITagDefinitions (not approved)
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseITagDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def reject(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("id")
	id: String):Response /*returnType = MResponseITagDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__reject(tokenId,clientId,classificationId,id)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_reject)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_reject)
	    }
	} 

	@GET
	@Path("/reject/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def reject_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("id")
	id: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__reject(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_reject)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_reject)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __reject(tokenId: String, clientId: String, classificationId: String, id: String) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_reject: String

	/**
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>it's possible to link IMetadataDefinition only to an approved ITagDefinition  </li>
	 * 	<li>100: max number of IMetadataDefinition per ITagDefinition</li>
	 * 	<li>it's possible to link metadata only to categorized and approved ITagDefinition</li>
	 * 	<li>the IMetadataDefinition of type KEY can be linked to one single ITagDefinition.</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param param : MITagDefinitionlinkMetadataDefinitionReq
	 * @return MResponseITagMetadataLink
	*/
	@POST
	@Path("/linkMetadataDefinition/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/linkMetadataDefinition", notes = """<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>it's possible to link IMetadataDefinition only to an approved ITagDefinition  </li>
	//#SWGNL#	<li>100: max number of IMetadataDefinition per ITagDefinition</li>
	//#SWGNL#	<li>it's possible to link metadata only to categorized and approved ITagDefinition</li>
	//#SWGNL#	<li>the IMetadataDefinition of type KEY can be linked to one single ITagDefinition.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseITagMetadataLink])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def linkMetadataDefinition(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("itagId")
	itagId: String, 
			param: MITagDefinitionlinkMetadataDefinitionReq):Response /*returnType = MResponseITagMetadataLink*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__linkMetadataDefinition(tokenId,clientId,classificationId,itagId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_linkMetadataDefinition)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_linkMetadataDefinition)
	    }
	} 

	@GET
	@Path("/linkMetadataDefinition/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def linkMetadataDefinition_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("itagId")
	itagId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagMetadataLink*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__linkMetadataDefinition(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,PRestHelper.bindRequest[MITagDefinitionlinkMetadataDefinitionReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_linkMetadataDefinition)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_linkMetadataDefinition)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __linkMetadataDefinition(tokenId: String, clientId: String, classificationId: String, itagId: String, param: MITagDefinitionlinkMetadataDefinitionReq) :MResponseITagMetadataLink
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_linkMetadataDefinition: String

	/**
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * Tag definition id.
	 * @param param : MITagDefinitionunlinkMetadataDefinitionReq
	 * @return MResponseITagMetadataLink
	*/
	@POST
	@Path("/unlinkMetadataDefinition/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/unlinkMetadataDefinition", notes = """<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseITagMetadataLink])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def unlinkMetadataDefinition(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Tag definition id.""")
	@PathParam("itagId")
	itagId: String, 
			param: MITagDefinitionunlinkMetadataDefinitionReq):Response /*returnType = MResponseITagMetadataLink*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__unlinkMetadataDefinition(tokenId,clientId,classificationId,itagId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_unlinkMetadataDefinition)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_unlinkMetadataDefinition)
	    }
	} 

	@GET
	@Path("/unlinkMetadataDefinition/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def unlinkMetadataDefinition_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Tag definition id.""")
	@PathParam("itagId")
	itagId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagMetadataLink*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__unlinkMetadataDefinition(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,PRestHelper.bindRequest[MITagDefinitionunlinkMetadataDefinitionReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_unlinkMetadataDefinition)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_unlinkMetadataDefinition)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __unlinkMetadataDefinition(tokenId: String, clientId: String, classificationId: String, itagId: String, param: MITagDefinitionunlinkMetadataDefinitionReq) :MResponseITagMetadataLink
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_unlinkMetadataDefinition: String

	/**
	 * Update in "patch" mode  the specific values defined in the link between ITagDefinition and
	 * IMetadataDefinition.
	 * Actually used to change the position of the imetadatadefinition inside an itagdefinition
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param param : MITagDefinitionupdateTagMetadataReq
	 * @return MResponseITagMetadataLink
	*/
	@POST
	@Path("/updateTagMetadata/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateTagMetadata", notes = """Update in "patch" mode  the specific values defined in the link between ITagDefinition and IMetadataDefinition.
	//#SWGNL#Actually used to change the position of the imetadatadefinition inside an itagdefinition
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseITagMetadataLink])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateTagMetadata(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("itagId")
	itagId: String, 
			param: MITagDefinitionupdateTagMetadataReq):Response /*returnType = MResponseITagMetadataLink*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateTagMetadata(tokenId,clientId,classificationId,itagId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateTagMetadata)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateTagMetadata)
	    }
	} 

	@GET
	@Path("/updateTagMetadata/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateTagMetadata_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """Tag definition id.
	//#SWGNL#ITagDefinition.id or ITagDefinition.prettyId""")
	@PathParam("itagId")
	itagId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagMetadataLink*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateTagMetadata(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,PRestHelper.bindRequest[MITagDefinitionupdateTagMetadataReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateTagMetadata)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateTagMetadata)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateTagMetadata(tokenId: String, clientId: String, classificationId: String, itagId: String, param: MITagDefinitionupdateTagMetadataReq) :MResponseITagMetadataLink
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateTagMetadata: String

}