package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinitionDetail
import com.thron.intelligence.services.model.request.MMetadataDefinitioninsertReq
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinitionList
import com.thron.intelligence.services.model.request.MMetadataDefinitionlistReq
import com.thron.intelligence.services.model.metadata.MEMetadataDefinitionOrderBy
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinition
import com.thron.intelligence.services.model.request.MMetadataDefinitionupdateReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Services used to add new custom generic Metadata Definition linked to entities
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xintelligence/resources/metadatadefinition/            </li>
 * </ul>
 */
@Path("/metadatadefinition")
//#SWG#@Api(value = "/metadatadefinition", description = """Services used to add new custom generic Metadata Definition linked to entities
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xintelligence/resources/metadatadefinition/            </li>
//#SWGNL#</ul>""")
trait JMetadataDefinition extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @return MResponseMetadataDefinitionDetail
	*/
	@GET
	@Path("/detail/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """""", response = classOf[MResponseMetadataDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseMetadataDefinitionDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detail") 
		try{	
			val resp = this.__detail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,id)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, clientId: String, id: String) :MResponseMetadataDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * Create a new generic Metadata definition. Generic Metadata definition can not be used with Tags
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MMetadataDefinitioninsertReq
	 * @return MResponseMetadataDefinitionDetail
	*/
	@POST
	@Path("/insert/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Create a new generic Metadata definition. Generic Metadata definition can not be used with Tags""", response = classOf[MResponseMetadataDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insert(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MMetadataDefinitioninsertReq):Response /*returnType = MResponseMetadataDefinitionDetail*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("insert",this._getCacheControl) 
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MMetadataDefinitioninsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, param: MMetadataDefinitioninsertReq) :MResponseMetadataDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * Lists the client's Metadata definition. This method return the metadata definition matching the
	 * given search criteria.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MMetadataDefinitionlistReq
	 * @return MResponseMetadataDefinitionList
	*/
	@POST
	@Path("/list/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/list", notes = """Lists the client's Metadata definition. This method return the metadata definition matching the given search criteria.""", response = classOf[MResponseMetadataDefinitionList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def list(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MMetadataDefinitionlistReq):Response /*returnType = MResponseMetadataDefinitionList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__list(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_list)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_list)
	    }
	} 

	@GET
	@Path("/list/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def list_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinitionList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("list",this._getCacheControl) 
		try{
			val resp = this.__list(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MMetadataDefinitionlistReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_list)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_list)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __list(tokenId: String, clientId: String, param: MMetadataDefinitionlistReq) :MResponseMetadataDefinitionList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_list: String

	/**
	 * Lists the client's MetadataDefinition.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param searchText : String
	 * Optional
	 * Search criteria
	 * @param searchIds : String
	 * Optional. csv list of MetadataDefinition.id
	 * Search criteria
	 * @param searchLang : String
	 * Optional.

	 * @param orderBy : MEMetadataDefinitionOrderBy
	 * Optional
	 * @param offset : Integer
	 * Optional.
	 * Default value is 0
	 * @param limit : Integer
	 * Optional. Default value is 50
	 * @return MResponseMetadataDefinitionList
	*/
	@GET
	@Path("/listGet/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/listGet", notes = """Lists the client's MetadataDefinition.""", response = classOf[MResponseMetadataDefinitionList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listGet(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional
	//#SWGNL#Search criteria""")
	@QueryParam("searchText")
	searchText: String, 
			//#SWG#@ApiParam(value = """Optional. csv list of MetadataDefinition.id
	//#SWGNL#Search criteria""")
	@QueryParam("searchIds")
	searchIds: String, 
			//#SWG#@ApiParam(value = """Optional.
	//#SWGNL#""")
	@QueryParam("searchLang")
	searchLang: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("orderBy")
	orderBy: MEMetadataDefinitionOrderBy, 
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
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseMetadataDefinitionList*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("listGet") 
		try{	
			val resp = this.__listGet(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,searchText,searchIds,searchLang,orderBy,offset,limit)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listGet)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listGet)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listGet(tokenId: String, clientId: String, searchText: String, searchIds: String, searchLang: String, orderBy: MEMetadataDefinitionOrderBy, offset: Integer, limit: Integer) :MResponseMetadataDefinitionList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listGet: String

	/**
	 * move a metadata definition to the trash.
	 * This operation does not remove the instances of metadata linked to a specific entity
	 * (content/user/category...), so it's possible to restore the metadata using the untrash service.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @return MResponseMetadataDefinition
	*/
	@POST
	@Path("/trash/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/trash", notes = """move a metadata definition to the trash. 
	//#SWGNL#This operation does not remove the instances of metadata linked to a specific entity (content/user/category...), so it's possible to restore the metadata using the untrash service.""", response = classOf[MResponseMetadataDefinition])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def trash(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String):Response /*returnType = MResponseMetadataDefinition*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__trash(tokenId,clientId,id)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_trash)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_trash)
	    }
	} 

	@GET
	@Path("/trash/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def trash_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinition*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("trash",this._getCacheControl) 
		try{
			val resp = this.__trash(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_trash)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_trash)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __trash(tokenId: String, clientId: String, id: String) :MResponseMetadataDefinition
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_trash: String

	/**
	 * Restore a metadata definition from the trash
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @return MResponseMetadataDefinition
	*/
	@POST
	@Path("/untrash/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/untrash", notes = """Restore a metadata definition from the trash""", response = classOf[MResponseMetadataDefinition])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def untrash(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String):Response /*returnType = MResponseMetadataDefinition*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__untrash(tokenId,clientId,id)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_untrash)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_untrash)
	    }
	} 

	@GET
	@Path("/untrash/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def untrash_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinition*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("untrash",this._getCacheControl) 
		try{
			val resp = this.__untrash(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_untrash)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_untrash)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __untrash(tokenId: String, clientId: String, id: String) :MResponseMetadataDefinition
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_untrash: String

	/**
	 * The service is used to change:
	 * <ul>
	 * 	<li>names definition</li>
	 * 	<li>visibility option</li>
	 * 	<li>constraints, and options</li>
	 * 	<li>metadataType</li>
	 * 	<li>metadata key</li>
	 * </ul>
	 * 
	 * Changing the properties of a metadata Definition like options, metadataType and key, does not imply
	 * any changes on metada added to entities (contents, users or categories). This means that the
	 * inserted value should be updated by the client.
	 * 
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MMetadataDefinitionupdateReq
	 * @return MResponseMetadataDefinitionDetail
	*/
	@POST
	@Path("/update/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """The service is used to change:
	//#SWGNL#<ul>
	//#SWGNL#	<li>names definition</li>
	//#SWGNL#	<li>visibility option</li>
	//#SWGNL#	<li>constraints, and options</li>
	//#SWGNL#	<li>metadataType</li>
	//#SWGNL#	<li>metadata key</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Changing the properties of a metadata Definition like options, metadataType and key, does not imply any changes on metada added to entities (contents, users or categories). This means that the inserted value should be updated by the client.
	//#SWGNL#
	//#SWGNL#The "update" field of this web service works in “patch" mode: it means that each and everyone of the "update" attributes you want to change must be included in the body of the request, those not included will not be updated.""", response = classOf[MResponseMetadataDefinitionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def update(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String, 
			param: MMetadataDefinitionupdateReq):Response /*returnType = MResponseMetadataDefinitionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__update(tokenId,clientId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_update)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_update)
	    }
	} 

	@GET
	@Path("/update/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def update_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadataDefinitionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("update",this._getCacheControl) 
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id,PRestHelper.bindRequest[MMetadataDefinitionupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, clientId: String, id: String, param: MMetadataDefinitionupdateReq) :MResponseMetadataDefinitionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

}