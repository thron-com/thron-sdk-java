package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import com.thron.intelligence.services.model.tag.MResponseITagDefinitionDetail
import com.thron.intelligence.services.model.request.MITagDefinitioninsertReq
import com.thron.intelligence.services.model.tag.MResponseITagDefinitionList
import com.thron.intelligence.services.model.request.MITagDefinitionlistReq
import com.thron.intelligence.services.model.tag.MEITagDefinitionOrderBy
import com.thron.intelligence.services.model.request.MITagDefinitionupdateReq
import com.thron.intelligence.services.model.itag.MResponseITagRemove
import com.thron.intelligence.services.model.request.MITagDefinitionremoveReq
import com.thron.intelligence.services.model.request.MITagDefinitioncombineReq
import com.thron.intelligence.services.model.itag.MResponseITagDefinitionDisjoined
import com.thron.intelligence.services.model.request.MITagDefinitiondivideReq
import com.thron.intelligence.services.model.request.MITagDefinitionmergeReq
import com.thron.intelligence.services.model.request.MITagDefinitionextractReq
import com.thron.intelligence.services.model.itag.MResponseITagDefinitionJoinedList
import com.thron.intelligence.services.model.request.MITagDefinitionlistJoinedReq
import com.thron.intelligence.services.model.tag.MResponseITagMetadataLink
import com.thron.intelligence.services.model.request.MITagDefinitionlinkMetadataDefinitionReq
import com.thron.intelligence.services.model.request.MITagDefinitionunlinkMetadataDefinitionReq
import com.thron.intelligence.services.model.request.MITagDefinitionupdateTagMetadataReq
import com.thron.intelligence.services.model.request.MITagDefinitionaddExternalIdReq
import com.thron.intelligence.services.model.request.MITagDefinitionremoveExternalIdReq
import com.thron.intelligence.services.model.itag.MResponseITagDefinitionListKeys
import com.thron.intelligence.services.model.request.MITagDefinitionlistExternalIdKeysReq

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
 * com/api/xintelligence/resources/itagdefinition</li>
 * </ul>
 */
@Path("/itagdefinition")
//#SWG#@Api(value = "/itagdefinition", description = """Services used to handle Tag Definition for a specific Classification
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xintelligence/resources/itagdefinition</li>
//#SWGNL#</ul>""")
trait JITagDefinition extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Inserts an itagDefinition to a classification.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>parentId, if any, must refer to a categorized itagDefinition.</li>
	 * 	<li>it's not possible to create tree structure with more than 1000 nodes.</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER or THRON_CLASS_[CLASSID]_TAG_SUGGESTER (only for not categorized
	 * tags) role</li>
	 * </ul>
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
	//#SWG#@ApiOperation(value = "/insert", notes = """Inserts an itagDefinition to a classification.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>parentId, if any, must refer to a categorized itagDefinition.</li>
	//#SWGNL#	<li>it's not possible to create tree structure with more than 1000 nodes.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER or THRON_CLASS_[CLASSID]_TAG_SUGGESTER (only for not categorized tags) role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionDetail])
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
		val cc = this.cachemap.getOrElse("insert",this._getCacheControl) 
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitioninsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insert)
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
	 * Returns the list of itagDefinition matching provided criteria.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
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
	//#SWG#@ApiOperation(value = "/list", notes = """Returns the list of itagDefinition matching provided criteria.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionList])
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
		val cc = this.cachemap.getOrElse("list",this._getCacheControl) 
		try{
			val resp = this.__list(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitionlistReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_list)
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
	 * Returns the list of itagDefinition matching provided criteria.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * Required
	 * @param text : String
	 * Optional. search criteria
	 * @param lang : String
	 * Optional. Used to filter itagDefinitions
	 * @param ids : String
	 * Optional. As csv list of ITagDefinition.id or ITagDefinition.prettyId
	 * @param showLinkedMetadata : Boolean
	 * Optional. default is false
	 * Fill the list of linked metadata definition in items.linkedMetadataDefinition
	 * @param showSubNodeIds : Boolean
	 * Optional. default is false
	 * Fill the list of subnodes ids in the response.
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
	//#SWG#@ApiOperation(value = "/listGet", notes = """Returns the list of itagDefinition matching provided criteria.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionList])
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
			//#SWG#@ApiParam(value = """Optional. Used to filter itagDefinitions""")
	@QueryParam("lang")
	lang: String, 
			//#SWG#@ApiParam(value = """Optional. As csv list of ITagDefinition.id or ITagDefinition.prettyId""")
	@QueryParam("ids")
	ids: String, 
			//#SWG#@ApiParam(value = """Optional. default is false
	//#SWGNL#Fill the list of linked metadata definition in items.linkedMetadataDefinition""")
	@QueryParam("showLinkedMetadata")
	showLinkedMetadata: Boolean, 
			//#SWG#@ApiParam(value = """Optional. default is false
	//#SWGNL#Fill the list of subnodes ids in the response.""")
	@QueryParam("showSubNodeIds")
	showSubNodeIds: Boolean, 
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
			val resp = this.__listGet(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,classificationId,text,lang,ids,showLinkedMetadata,showSubNodeIds,orderBy,offset,limit)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listGet)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listGet)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listGet(tokenId: String, clientId: String, classificationId: String, text: String, lang: String, ids: String, showLinkedMetadata: Boolean, showSubNodeIds: Boolean, orderBy: MEITagDefinitionOrderBy, offset: Integer, limit: Integer) :MResponseITagDefinitionList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listGet: String

	/**
	 * Returns the detail of an itagDefinition.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li> THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param showLinkedMetadata : Boolean
	 * Optional. Default value is false
	 * @param showSubNodeIds : Boolean
	 * Optional. default is false
	 * Fill the list of subnodes ids in the response.
	 * @return MResponseITagDefinitionDetail
	*/
	@GET
	@Path("/detail/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """Returns the detail of an itagDefinition.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li> THRON_CLASS_[CLASSID]_VIEWER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionDetail])
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
			//#SWG#@ApiParam(value = """Optional. default is false
	//#SWGNL#Fill the list of subnodes ids in the response.""")
	@QueryParam("showSubNodeIds")
	showSubNodeIds: Boolean,
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
			val resp = this.__detail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,classificationId,id,showLinkedMetadata,showSubNodeIds)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, clientId: String, classificationId: String, id: String, showLinkedMetadata: Boolean, showSubNodeIds: Boolean) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * Update in "patch" mode the ITagDefinition.
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * ITagdefinition id, prettyId or externalId
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
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>itagDefinition must be APPROVED</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionDetail])
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("update",this._getCacheControl) 
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id,PRestHelper.bindRequest[MITagDefinitionupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_update)
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
	 * Remove s an itagDefinition from a classification.
	 * It also removes any linked imetadataDefinition.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED</li>
	 * 	<li>Cannot remove itagDefinition with any child node</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * ITagdefinition id, prettyId or externalId
	 * @param param : MITagDefinitionremoveReq
	 * @return MResponseITagRemove
	*/
	@POST
	@Path("/remove/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Remove s an itagDefinition from a classification.
	//#SWGNL#It also removes any linked imetadataDefinition.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>itagDefinition must be APPROVED</li>
	//#SWGNL#	<li>Cannot remove itagDefinition with any child node</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagRemove])
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagRemove*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("remove",this._getCacheControl) 
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id,PRestHelper.bindRequest[MITagDefinitionremoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_remove)
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
	 * Combines a source itagDefinition into a target itagDefinition.
	 * ExternalIds and linked imetadataDefinitions are combined into the target itagDefinition.
	 * After a combine operation any itagDefinition search by source ids will return target itagDefinition.
	 * 
	 * After a combine operation target itagDefinition cannot be updated or removed.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>source itagDefinition must be APPROVED</li>
	 * 	<li>source itagDefinition  must not have child nodes</li>
	 * </ul>
	 * <ul>
	 * 	<li>cannot combine a categorized itagDefinition into a non-categorized itagDefinition.</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * ITagDefinition id
	 * @param param : MITagDefinitioncombineReq
	 * @return MResponseITagDefinitionDetail
	*/
	@POST
	@Path("/combine/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/combine", notes = """Combines a source itagDefinition into a target itagDefinition. 
	//#SWGNL#ExternalIds and linked imetadataDefinitions are combined into the target itagDefinition.
	//#SWGNL#After a combine operation any itagDefinition search by source ids will return target itagDefinition.
	//#SWGNL#After a combine operation target itagDefinition cannot be updated or removed.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>source itagDefinition must be APPROVED</li>
	//#SWGNL#	<li>source itagDefinition  must not have child nodes</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>cannot combine a categorized itagDefinition into a non-categorized itagDefinition.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def combine(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """ITagDefinition id""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagDefinitioncombineReq):Response /*returnType = MResponseITagDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__combine(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_combine)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_combine)
	    }
	} 

	@GET
	@Path("/combine/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def combine_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """ITagDefinition id""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("combine",this._getCacheControl) 
		try{
			val resp = this.__combine(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitioncombineReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_combine)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_combine)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __combine(tokenId: String, clientId: String, classificationId: String, param: MITagDefinitioncombineReq) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_combine: String

	/**
	 * Divides a combined itagDefinition from a target itagDefinition.
	 * Restores combined itagDefinition ids.and linked imetadataDefinitions.
	 * After the divide operation divided itagDefinition will have the same parent of the target.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>source itagDefinition must be COMBINED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitiondivideReq
	 * @return MResponseITagDefinitionDisjoined
	*/
	@POST
	@Path("/divide/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/divide", notes = """Divides a combined itagDefinition from a target itagDefinition. 
	//#SWGNL#Restores combined itagDefinition ids.and linked imetadataDefinitions.
	//#SWGNL#After the divide operation divided itagDefinition will have the same parent of the target.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>source itagDefinition must be COMBINED</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionDisjoined])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def divide(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagDefinitiondivideReq):Response /*returnType = MResponseITagDefinitionDisjoined*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__divide(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_divide)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_divide)
	    }
	} 

	@GET
	@Path("/divide/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def divide_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDisjoined*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("divide",this._getCacheControl) 
		try{
			val resp = this.__divide(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitiondivideReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_divide)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_divide)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __divide(tokenId: String, clientId: String, classificationId: String, param: MITagDefinitiondivideReq) :MResponseITagDefinitionDisjoined
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_divide: String

	/**
	 * Merges a list of combined itagDefinitions into a target itagDefinition.
	 * ExternalIds and linked imetadataDefinitions are moved from combined itagDefinitions to the target;
	 * combined itagDefinitions prettyId and localized names are not merged into the target.
	 * Any reference to combined itagDefinitions on any entity is replaced by target itagDefinition.
	 * <b>
	 * </b><b>Constraints</b>:
	 * <ul>
	 * 	<li>combined itagDefinitions must be COMBINED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
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
	//#SWG#@ApiOperation(value = "/merge", notes = """Merges a list of combined itagDefinitions into a target itagDefinition. 
	//#SWGNL#ExternalIds and linked imetadataDefinitions are moved from combined itagDefinitions to the target; combined itagDefinitions prettyId and localized names are not merged into the target.
	//#SWGNL#Any reference to combined itagDefinitions on any entity is replaced by target itagDefinition.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Constraints</b>:
	//#SWGNL#<ul>
	//#SWGNL#	<li>combined itagDefinitions must be COMBINED</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
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
		val cc = this.cachemap.getOrElse("merge",this._getCacheControl) 
		try{
			val resp = this.__merge(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitionmergeReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_merge)
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
	 * Extracts a merged itagDefinition from a target itagDefinition.
	 * Restores prettyId (if still available), externalIds, linked imetadataDefinitions, and localized
	 * names.
	 * After extract operation merged itagDefinition will have the same parent itagDefinition of the
	 * target (if the tag tree is not full), otherwise the tag is added as a new root.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>merged itagDefinition must be MERGED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionextractReq
	 * @return MResponseITagDefinitionDisjoined
	*/
	@POST
	@Path("/extract/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/extract", notes = """Extracts a merged itagDefinition from a target itagDefinition.
	//#SWGNL#Restores prettyId (if still available), externalIds, linked imetadataDefinitions, and localized names.
	//#SWGNL#After extract operation merged itagDefinition will have the same parent itagDefinition of the target (if the tag tree is not full), otherwise the tag is added as a new root.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>merged itagDefinition must be MERGED</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionDisjoined])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def extract(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagDefinitionextractReq):Response /*returnType = MResponseITagDefinitionDisjoined*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__extract(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_extract)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_extract)
	    }
	} 

	@GET
	@Path("/extract/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def extract_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDisjoined*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("extract",this._getCacheControl) 
		try{
			val resp = this.__extract(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitionextractReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_extract)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_extract)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __extract(tokenId: String, clientId: String, classificationId: String, param: MITagDefinitionextractReq) :MResponseITagDefinitionDisjoined
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_extract: String

	/**
	 * Lists the itagDefinitions joined (i.e., combined or merged) into a target itagDefinition matching
	 * provided criteria.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionlistJoinedReq
	 * @return MResponseITagDefinitionJoinedList
	*/
	@POST
	@Path("/listJoined/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/listJoined", notes = """Lists the itagDefinitions joined (i.e., combined or merged) into a target itagDefinition matching provided criteria.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionJoinedList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listJoined(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagDefinitionlistJoinedReq):Response /*returnType = MResponseITagDefinitionJoinedList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__listJoined(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_listJoined)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_listJoined)
	    }
	} 

	@GET
	@Path("/listJoined/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def listJoined_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionJoinedList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("listJoined",this._getCacheControl) 
		try{
			val resp = this.__listJoined(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitionlistJoinedReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listJoined)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listJoined)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listJoined(tokenId: String, clientId: String, classificationId: String, param: MITagDefinitionlistJoinedReq) :MResponseITagDefinitionJoinedList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listJoined: String

	/**
	 * Links an imetadataDefinition to an itagDefinition.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED and CATEGORIZED</li>
	 * 	<li>max number of imetadataDefinition linked to an itagDefinition: 100</li>
	 * 	<li>KEY type imetadataDefinitions can only be linked to a single itagDefinition.</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * ITagdefinition id, prettyId or externalId
	 * @param param : MITagDefinitionlinkMetadataDefinitionReq
	 * @return MResponseITagMetadataLink
	*/
	@POST
	@Path("/linkMetadataDefinition/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/linkMetadataDefinition", notes = """Links an imetadataDefinition to an itagDefinition.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>itagDefinition must be APPROVED and CATEGORIZED</li>
	//#SWGNL#	<li>max number of imetadataDefinition linked to an itagDefinition: 100</li>
	//#SWGNL#	<li>KEY type imetadataDefinitions can only be linked to a single itagDefinition.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagMetadataLink])
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
	@PathParam("itagId")
	itagId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagMetadataLink*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("linkMetadataDefinition",this._getCacheControl) 
		try{
			val resp = this.__linkMetadataDefinition(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,PRestHelper.bindRequest[MITagDefinitionlinkMetadataDefinitionReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_linkMetadataDefinition)
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
	 * Unlinks an imetadataDefinition from an itagDefinition.
	 * <b>
	 * </b><b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED</li>
	 * </ul>
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * ITagdefinition id, prettyId or externalId
	 * @param param : MITagDefinitionunlinkMetadataDefinitionReq
	 * @return MResponseITagMetadataLink
	*/
	@POST
	@Path("/unlinkMetadataDefinition/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/unlinkMetadataDefinition", notes = """Unlinks an imetadataDefinition from an itagDefinition.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>itagDefinition must be APPROVED</li>
	//#SWGNL#</ul>
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagMetadataLink])
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
	@PathParam("itagId")
	itagId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagMetadataLink*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("unlinkMetadataDefinition",this._getCacheControl) 
		try{
			val resp = this.__unlinkMetadataDefinition(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,PRestHelper.bindRequest[MITagDefinitionunlinkMetadataDefinitionReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_unlinkMetadataDefinition)
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
	 * Update in "patch" mode  the specific values defined in the link between itagDefinition and
	 * imetadataDefinition.
	 * Can be used to change the position of an imetadataDefinition among the list of
	 * linkedMetadataDefinition of an itagDefinition.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * ITagdefinition id, prettyId or externalId
	 * @param param : MITagDefinitionupdateTagMetadataReq
	 * @return MResponseITagMetadataLink
	*/
	@POST
	@Path("/updateTagMetadata/{clientId}/{classificationId}/{itagId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateTagMetadata", notes = """Update in "patch" mode  the specific values defined in the link between itagDefinition and imetadataDefinition.
	//#SWGNL#Can be used to change the position of an imetadataDefinition among the list of linkedMetadataDefinition of an itagDefinition.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>itagDefinition must be APPROVED</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagMetadataLink])
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
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
			//#SWG#@ApiParam(value = """ITagdefinition id, prettyId or externalId""")
	@PathParam("itagId")
	itagId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagMetadataLink*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateTagMetadata",this._getCacheControl) 
		try{
			val resp = this.__updateTagMetadata(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,itagId,PRestHelper.bindRequest[MITagDefinitionupdateTagMetadataReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateTagMetadata)
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

	/**
	 * Adds an externalId to an itagDefinition.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max number of externalIds on an itagDefinition: 200</li>
	 * </ul>
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * ITagDefinition.id
	 * @param param : MITagDefinitionaddExternalIdReq
	 * @return MResponseITagDefinitionDetail
	*/
	@POST
	@Path("/addExternalId/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addExternalId", notes = """Adds an externalId to an itagDefinition.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max number of externalIds on an itagDefinition: 200</li>
	//#SWGNL#</ul>
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addExternalId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """ITagDefinition.id""")
	@PathParam("id")
	id: String, 
			param: MITagDefinitionaddExternalIdReq):Response /*returnType = MResponseITagDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addExternalId(tokenId,clientId,classificationId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addExternalId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addExternalId)
	    }
	} 

	@GET
	@Path("/addExternalId/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addExternalId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """ITagDefinition.id""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addExternalId",this._getCacheControl) 
		try{
			val resp = this.__addExternalId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id,PRestHelper.bindRequest[MITagDefinitionaddExternalIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addExternalId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addExternalId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addExternalId(tokenId: String, clientId: String, classificationId: String, id: String, param: MITagDefinitionaddExternalIdReq) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addExternalId: String

	/**
	 * Removes an externalId from an itagDefinition.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * ITagdefinition id.
	 * @param param : MITagDefinitionremoveExternalIdReq
	 * @return MResponseITagDefinitionDetail
	*/
	@POST
	@Path("/removeExternalId/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeExternalId", notes = """Removes an externalId from an itagDefinition.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeExternalId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			//#SWG#@ApiParam(value = """ITagdefinition id.""")
	@PathParam("id")
	id: String, 
			param: MITagDefinitionremoveExternalIdReq):Response /*returnType = MResponseITagDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeExternalId(tokenId,clientId,classificationId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeExternalId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeExternalId)
	    }
	} 

	@GET
	@Path("/removeExternalId/{clientId}/{classificationId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeExternalId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			//#SWG#@ApiParam(value = """ITagdefinition id.""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeExternalId",this._getCacheControl) 
		try{
			val resp = this.__removeExternalId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,id,PRestHelper.bindRequest[MITagDefinitionremoveExternalIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeExternalId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeExternalId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeExternalId(tokenId: String, clientId: String, classificationId: String, id: String, param: MITagDefinitionremoveExternalIdReq) :MResponseITagDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeExternalId: String

	/**
	 * Returns the list of distinct keys (i.e., externalId.key) sorted by name.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionlistExternalIdKeysReq
	 * @return MResponseITagDefinitionListKeys
	*/
	@POST
	@Path("/listExternalIdKeys/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/listExternalIdKeys", notes = """Returns the list of distinct keys (i.e., externalId.key) sorted by name.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseITagDefinitionListKeys])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listExternalIdKeys(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String, 
			param: MITagDefinitionlistExternalIdKeysReq):Response /*returnType = MResponseITagDefinitionListKeys*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__listExternalIdKeys(tokenId,clientId,classificationId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_listExternalIdKeys)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_listExternalIdKeys)
	    }
	} 

	@GET
	@Path("/listExternalIdKeys/{clientId}/{classificationId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def listExternalIdKeys_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("classificationId")
	classificationId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseITagDefinitionListKeys*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("listExternalIdKeys",this._getCacheControl) 
		try{
			val resp = this.__listExternalIdKeys(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,classificationId,PRestHelper.bindRequest[MITagDefinitionlistExternalIdKeysReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listExternalIdKeys)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listExternalIdKeys)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listExternalIdKeys(tokenId: String, clientId: String, classificationId: String, param: MITagDefinitionlistExternalIdKeysReq) :MResponseITagDefinitionListKeys
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listExternalIdKeys: String

}