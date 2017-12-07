package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.contentCategory.MResponseLinkCategoryToContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to add/remove content to/from categories.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/contentcategory</li>
 * </ul>
 */
@Path("/contentcategory")
//#SWG#@Api(value = "/contentcategory", description = """Service used to add/remove content to/from categories.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/contentcategory</li>
//#SWGNL#</ul>""")
trait JContentCategory extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Adds a content to a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES role</li>
	 * 	<li>SHARE ACL on the content</li>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * Id or prettyId
	 * @param contentId : String
	 * @return MResponseLinkCategoryToContent
	*/
	@POST
	@Path("/linkCategoryToContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/linkCategoryToContent", notes = """Adds a content to a category.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES role</li>
	//#SWGNL#	<li>SHARE ACL on the content</li>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseLinkCategoryToContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def linkCategoryToContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Id or prettyId""")
	@FormParam("categoryId")
	categoryId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String):Response /*returnType = MResponseLinkCategoryToContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__linkCategoryToContent(tokenId,clientId,categoryId,contentId)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_linkCategoryToContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_linkCategoryToContent)
	    }
	} 

	@GET
	@Path("/linkCategoryToContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def linkCategoryToContent_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("categoryId")categoryId_q: String, 
			@QueryParam("contentId")contentId_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseLinkCategoryToContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("linkCategoryToContent",this._getCacheControl) 
		try{	
			val resp = this.__linkCategoryToContent(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,categoryId_q,contentId_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_linkCategoryToContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_linkCategoryToContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __linkCategoryToContent(tokenId: String, clientId: String, categoryId: String, contentId: String) :MResponseLinkCategoryToContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_linkCategoryToContent: String

	/**
	 * Removes a content from a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES role</li>
	 * 	<li>SHARE ACL on the content</li>
	 * </ul>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * Id or prettyId
	 * @param contentId : String
	 * @return MResponseLinkCategoryToContent
	*/
	@POST
	@Path("/removeCategoryToContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/removeCategoryToContent", notes = """Removes a content from a category.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES role</li>
	//#SWGNL#	<li>SHARE ACL on the content</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseLinkCategoryToContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeCategoryToContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Id or prettyId""")
	@FormParam("categoryId")
	categoryId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String):Response /*returnType = MResponseLinkCategoryToContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeCategoryToContent(tokenId,clientId,categoryId,contentId)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeCategoryToContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeCategoryToContent)
	    }
	} 

	@GET
	@Path("/removeCategoryToContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeCategoryToContent_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("categoryId")categoryId_q: String, 
			@QueryParam("contentId")contentId_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseLinkCategoryToContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeCategoryToContent",this._getCacheControl) 
		try{	
			val resp = this.__removeCategoryToContent(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,categoryId_q,contentId_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeCategoryToContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeCategoryToContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeCategoryToContent(tokenId: String, clientId: String, categoryId: String, contentId: String) :MResponseLinkCategoryToContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeCategoryToContent: String

}