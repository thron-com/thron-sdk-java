package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import com.thron.intelligence.services.model.classification.MResponseClassificationDetail
import com.thron.intelligence.services.model.request.MClassificationinsertReq
import com.thron.intelligence.services.model.classification.MResponseClassificationList
import com.thron.intelligence.services.model.request.MClassificationlistReq
import com.thron.intelligence.services.model.classification.MEClassificationOrderBy
import com.thron.intelligence.services.model.request.MClassificationupdateReq
import com.thron.intelligence.services.model.classification.MResponseClassification

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to handle classification
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xintelligence/resources/classification/     </li>
 * </ul>
 */
@Path("/classification")
//#SWG#@Api(value = "/classification", description = """Service used to handle classification
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xintelligence/resources/classification/     </li>
//#SWGNL#</ul>""")
trait JClassification extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Insert a new Classification.
	 * Max number of clientId's classification is 5 (1 TOPIC, 1 TARGET and 3 CUSTOM classifications)
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASSIFICATIONS_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MClassificationinsertReq
	 * @return MResponseClassificationDetail
	*/
	@POST
	@Path("/insert/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Insert a new Classification. 
	//#SWGNL#Max number of clientId's classification is 5 (1 TOPIC, 1 TARGET and 3 CUSTOM classifications)
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASSIFICATIONS_MANAGER""", response = classOf[MResponseClassificationDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insert(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MClassificationinsertReq):Response /*returnType = MResponseClassificationDetail*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseClassificationDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MClassificationinsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, param: MClassificationinsertReq) :MResponseClassificationDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * Lists the client's Classification. This method return the classifications matching the given search
	 * criteria.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MClassificationlistReq
	 * @return MResponseClassificationList
	*/
	@POST
	@Path("/list/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/list", notes = """Lists the client's Classification. This method return the classifications matching the given search criteria.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER""", response = classOf[MResponseClassificationList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def list(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MClassificationlistReq):Response /*returnType = MResponseClassificationList*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseClassificationList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__list(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MClassificationlistReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_list)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_list)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __list(tokenId: String, clientId: String, param: MClassificationlistReq) :MResponseClassificationList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_list: String

	/**
	 * Lists the client's Classification. This method return all classification by default.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASSIFICATIONS_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param text : String
	 * Optional. Search text in label or description fields

	 * @param lang : String
	 * Optional. Used to search the classification having title like "name" for the defined language.
	 * Example: the user would like to find the Classification with label "house" for lang "EN". If the
	 * "label" is empty the service return all classification defined for the specified lang.

	 * @param orderBy : MEClassificationOrderBy
	 * Optional
	 * @param offset : Integer
	 * Optional.
	 * Default value is 0
	 * @param limit : Integer
	 * Optional. Default value is 50
	 * @return MResponseClassificationList
	*/
	@GET
	@Path("/listGet/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/listGet", notes = """Lists the client's Classification. This method return all classification by default.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASSIFICATIONS_VIEWER""", response = classOf[MResponseClassificationList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listGet(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional. Search text in label or description fields
	//#SWGNL#""")
	@QueryParam("text")
	text: String, 
			//#SWG#@ApiParam(value = """Optional. Used to search the classification having title like "name" for the defined language.
	//#SWGNL#Example: the user would like to find the Classification with label "house" for lang "EN". If the "label" is empty the service return all classification defined for the specified lang.
	//#SWGNL#""")
	@QueryParam("lang")
	lang: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("orderBy")
	orderBy: MEClassificationOrderBy, 
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
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseClassificationList*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("listGet") 
		try{	
			val resp = this.__listGet(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,text,lang,orderBy,offset,limit)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listGet)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listGet)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listGet(tokenId: String, clientId: String, text: String, lang: String, orderBy: MEClassificationOrderBy, offset: Integer, limit: Integer) :MResponseClassificationList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listGet: String

	/**
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASSIFICATIONS_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * classification Id
	 * @return MResponseClassificationDetail
	*/
	@GET
	@Path("/detail/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASSIFICATIONS_VIEWER""", response = classOf[MResponseClassificationDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """classification Id""")
	@PathParam("id")
	id: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseClassificationDetail*/= { 
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
	 protected def __detail(tokenId: String, clientId: String, id: String) :MResponseClassificationDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * Update a given classification in patch mode.
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASSIFICATIONS_MANAGER or
	 * THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * classification id
	 * @param param : MClassificationupdateReq
	 * @return MResponseClassificationDetail
	*/
	@POST
	@Path("/update/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """Update a given classification in patch mode.
	//#SWGNL#The "update" field of this web service works in “patch" mode: it means that each and everyone of the "update" attributes you want to change must be included in the body of the request, those not included will not be updated.
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASSIFICATIONS_MANAGER or THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseClassificationDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def update(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """classification id""")
	@PathParam("id")
	id: String, 
			param: MClassificationupdateReq):Response /*returnType = MResponseClassificationDetail*/ = {
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
			//#SWG#@ApiParam(value = """classification id""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseClassificationDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id,PRestHelper.bindRequest[MClassificationupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, clientId: String, id: String, param: MClassificationupdateReq) :MResponseClassificationDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

	/**
	 * Remove a given classification.
	 * Only inactive classification can be removed (Classification.active= false)
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASSIFICATIONS_MANAGER or
	 * THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * classification id
	 * @return MResponseClassification
	*/
	@POST
	@Path("/remove/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Remove a given classification.
	//#SWGNL#Only inactive classification can be removed (Classification.active= false)
	//#SWGNL#
	//#SWGNL#<b>Role Validation:</b>
	//#SWGNL#Can be invoked only by users with role  THRON_CLASSIFICATIONS_MANAGER or THRON_CLASS_[CLASSID]_MANAGER""", response = classOf[MResponseClassification])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def remove(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """classification id""")
	@PathParam("id")
	id: String):Response /*returnType = MResponseClassification*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__remove(tokenId,clientId,id)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_remove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_remove)
	    }
	} 

	@GET
	@Path("/remove/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def remove_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """classification id""")
	@PathParam("id")
	id: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseClassification*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_remove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_remove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, clientId: String, id: String) :MResponseClassification
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

}