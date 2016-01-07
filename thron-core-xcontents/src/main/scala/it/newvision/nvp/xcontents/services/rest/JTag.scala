package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.tag.MResponseTag
import it.newvision.nvp.xcontents.services.model.request.MTagaddTagReq
import it.newvision.nvp.xcontents.services.model.tag.MResponseTags

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to handle the tags in platform, linked to the contents.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/tag/
 * </li>
 * </ul>
 */
@Path("/tag")
//#SWG#@Api(value = "/tag", description = """Service used to handle the tags in platform, linked to the contents.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/tag/   </li>
//#SWGNL#</ul>""")
trait JTag extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Add a new tag to the specified content. If the tag is already present in the content, it will be
	 * ignored
	 * @param tokenId : String
	 * @param param : MTagaddTagReq
	 * @return MResponseTag
	*/
	@POST
	@Path("/addTag")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addTag", notes = """Add a new tag to the specified content. If the tag is already present in the content, it will be ignored""", response = classOf[MResponseTag])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addTag(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MTagaddTagReq):Response /*returnType = MResponseTag*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addTag(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addTag)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addTag)
	    }
	} 

	@GET
	@Path("/addTag")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addTag_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseTag*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addTag(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MTagaddTagReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addTag)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addTag)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addTag(tokenId: String, param: MTagaddTagReq) :MResponseTag
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addTag: String

	/**
	 * Remove a tag to the specified content.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param tagvalue : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseTag
	*/
	@POST
	@Path("/removeTag")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/removeTag", notes = """Remove a tag to the specified content.""", response = classOf[MResponseTag])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeTag(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("tagvalue")
	tagvalue: String, 
			//#SWG#@ApiParam(value = """Optional. For Acl validation""")
	@FormParam("categoryIdForAcl")
	categoryIdForAcl: String):Response /*returnType = MResponseTag*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeTag(tokenId,clientId,contentId,tagvalue,categoryIdForAcl)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeTag)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeTag)
	    }
	} 

	@GET
	@Path("/removeTag")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeTag_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("contentId")contentId_q: String, 
			@QueryParam("tagvalue")tagvalue_q: String, 
			@QueryParam("categoryIdForAcl")categoryIdForAcl_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseTag*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__removeTag(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,contentId_q,tagvalue_q,categoryIdForAcl_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeTag)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeTag)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeTag(tokenId: String, clientId: String, contentId: String, tagvalue: String, categoryIdForAcl: String) :MResponseTag
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeTag: String

	/**
	 * Used to get the full list of different tags used in the platform.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param offset : Integer
	 * Optional, default value is 0
	 * @param numberOfResult : Integer
	 * Optional
	 * @return MResponseTags
	*/
	@GET
	@Path("/showAllTags")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/showAllTags", notes = """Used to get the full list of different tags used in the platform.""", response = classOf[MResponseTags])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def showAllTags(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional, default value is 0""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseTags*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("showAllTags") 
		try{	
			val resp = this.__showAllTags(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_showAllTags)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_showAllTags)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __showAllTags(tokenId: String, clientId: String, offset: Integer, numberOfResult: Integer) :MResponseTags
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_showAllTags: String

}