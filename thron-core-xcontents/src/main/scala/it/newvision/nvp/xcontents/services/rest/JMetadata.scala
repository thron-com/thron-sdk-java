package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.metadata.MResponseInsertMetadata
import it.newvision.nvp.xcontents.services.model.request.MMetadatainsertMetadataReq
import it.newvision.nvp.xcontents.services.model.metadata.MResponseMetadata
import it.newvision.nvp.xcontents.services.model.request.MMetadataremoveMetadataReq
import it.newvision.nvp.xcontents.services.model.request.MMetadataupdateMetadataReq
import it.newvision.nvp.xcontents.services.model.request.MMetadataupdateSingleMetadataReq
import it.newvision.nvp.xcontents.services.model.metadata.MResponseRemoveAllMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used to handle custom generic metadata in Contents.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/metadata     </li>
 * </ul>
 */
@Path("/metadata")
//#SWG#@Api(value = "/metadata", description = """Used to handle custom generic metadata in Contents.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/metadata     </li>
//#SWGNL#</ul>""")
trait JMetadata extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * insert one single entry to list of metadata linked to the content
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required on the specific content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MMetadatainsertMetadataReq
	 * @return MResponseInsertMetadata
	*/
	@POST
	@Path("/insertMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insertMetadata", notes = """insert one single entry to list of metadata linked to the content
	//#SWGNL#
	//#SWGNL#<b>ACL validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY is required on the specific content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseInsertMetadata])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insertMetadata(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MMetadatainsertMetadataReq):Response /*returnType = MResponseInsertMetadata*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__insertMetadata(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_insertMetadata)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_insertMetadata)
	    }
	} 

	@GET
	@Path("/insertMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def insertMetadata_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseInsertMetadata*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__insertMetadata(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MMetadatainsertMetadataReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_insertMetadata)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insertMetadata)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insertMetadata(tokenId: String, param: MMetadatainsertMetadataReq) :MResponseInsertMetadata
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insertMetadata: String

	/**
	 * Remove one single metadata entry linked to a content
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required on the specific content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MMetadataremoveMetadataReq
	 * @return MResponseMetadata
	*/
	@POST
	@Path("/removeMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeMetadata", notes = """Remove one single metadata entry linked to a content
	//#SWGNL#
	//#SWGNL#<b>ACL validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY is required on the specific content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseMetadata])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeMetadata(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MMetadataremoveMetadataReq):Response /*returnType = MResponseMetadata*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeMetadata(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeMetadata)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeMetadata)
	    }
	} 

	@GET
	@Path("/removeMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeMetadata_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadata*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeMetadata(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MMetadataremoveMetadataReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeMetadata)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeMetadata)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeMetadata(tokenId: String, param: MMetadataremoveMetadataReq) :MResponseMetadata
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeMetadata: String

	/**
	 * Update all content metadata list with the new given list.
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required on the specific content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MMetadataupdateMetadataReq
	 * @return MResponseMetadata
	*/
	@POST
	@Path("/updateMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateMetadata", notes = """Update all content metadata list with the new given list.
	//#SWGNL#
	//#SWGNL#<b>ACL validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY is required on the specific content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseMetadata])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateMetadata(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MMetadataupdateMetadataReq):Response /*returnType = MResponseMetadata*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateMetadata(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateMetadata)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateMetadata)
	    }
	} 

	@GET
	@Path("/updateMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateMetadata_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadata*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateMetadata(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MMetadataupdateMetadataReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateMetadata)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateMetadata)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateMetadata(tokenId: String, param: MMetadataupdateMetadataReq) :MResponseMetadata
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateMetadata: String

	/**
	 * Update one single content metadata in the list.
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required on the specific content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MMetadataupdateSingleMetadataReq
	 * @return MResponseMetadata
	*/
	@POST
	@Path("/updateSingleMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateSingleMetadata", notes = """Update one single content metadata in the list.
	//#SWGNL#
	//#SWGNL#<b>ACL validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY is required on the specific content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseMetadata])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateSingleMetadata(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MMetadataupdateSingleMetadataReq):Response /*returnType = MResponseMetadata*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateSingleMetadata(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateSingleMetadata)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateSingleMetadata)
	    }
	} 

	@GET
	@Path("/updateSingleMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateSingleMetadata_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMetadata*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateSingleMetadata(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MMetadataupdateSingleMetadataReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateSingleMetadata)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateSingleMetadata)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateSingleMetadata(tokenId: String, param: MMetadataupdateSingleMetadataReq) :MResponseMetadata
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateSingleMetadata: String

	/**
	 * remove all Metadata entries linked to the content
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required on the specific content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseRemoveAllMetadata
	*/
	@POST
	@Path("/removeAllMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/removeAllMetadata", notes = """remove all Metadata entries linked to the content
	//#SWGNL#
	//#SWGNL#<b>ACL validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY is required on the specific content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseRemoveAllMetadata])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeAllMetadata(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """Optional. For Acl validation""")
	@FormParam("categoryIdForAcl")
	categoryIdForAcl: String):Response /*returnType = MResponseRemoveAllMetadata*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeAllMetadata(tokenId,clientId,contentId,categoryIdForAcl)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeAllMetadata)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeAllMetadata)
	    }
	} 

	@GET
	@Path("/removeAllMetadata")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeAllMetadata_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("contentId")contentId_q: String, 
			@QueryParam("categoryIdForAcl")categoryIdForAcl_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRemoveAllMetadata*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__removeAllMetadata(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,contentId_q,categoryIdForAcl_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeAllMetadata)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeAllMetadata)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeAllMetadata(tokenId: String, clientId: String, contentId: String, categoryIdForAcl: String) :MResponseRemoveAllMetadata
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeAllMetadata: String

}