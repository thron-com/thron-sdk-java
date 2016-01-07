package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.contentCategory.MResponseLinkCategoryToContent
import it.newvision.nvp.xcontents.services.model.contentCategory.MResponseShowContentByCategory
import it.newvision.nvp.xcontents.services.model.request.MContentCategoryshowContentsByCategoryReq
import it.newvision.nvp.xcontents.services.model.contentCategory.MResponseShowCategoriesByContent
import it.newvision.nvp.xcontents.services.model.request.MContentCategoryshowCategoriesByContentReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to organize the contents inside the categories, especially to
 * add/remove a content to a specific category.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/contentcategory/  </li>
 * </ul>
 */
@Path("/contentcategory")
//#SWG#@Api(value = "/contentcategory", description = """Service used to organize the contents inside the categories, especially to add/remove a content to a specific category.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/contentcategory/  </li>
//#SWGNL#</ul>""")
trait JContentCategory extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Used to add a content to a specific category.
	 * Roles restrictions: 4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * @param contentId : String
	 * @param applyAcl : Boolean
	 * Optional. Default = false
	 * Automatically Apply the right ACL between Content and Category
	 * @return MResponseLinkCategoryToContent
	*/
	@POST
	@Path("/linkCategoryToContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/linkCategoryToContent", notes = """Used to add a content to a specific category.
	//#SWGNL#Roles restrictions: 4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES""", response = classOf[MResponseLinkCategoryToContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def linkCategoryToContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("categoryId")
	categoryId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """Optional. Default = false
	//#SWGNL#Automatically Apply the right ACL between Content and Category""")
	@FormParam("applyAcl")
	applyAcl: Boolean):Response /*returnType = MResponseLinkCategoryToContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__linkCategoryToContent(tokenId,clientId,categoryId,contentId,applyAcl)
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
			@QueryParam("applyAcl")applyAcl_q: Boolean,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseLinkCategoryToContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__linkCategoryToContent(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,categoryId_q,contentId_q,applyAcl_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_linkCategoryToContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_linkCategoryToContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __linkCategoryToContent(tokenId: String, clientId: String, categoryId: String, contentId: String, applyAcl: Boolean) :MResponseLinkCategoryToContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_linkCategoryToContent: String

	/**
	 * Used to remove a content from a specific category.
	 * Roles restrictions: 4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * @param contentId : String
	 * @param applyAcl : Boolean
	 * Optional. Default = false
	 * Automatically Apply the right ACL between Content and Category
	 * @return MResponseLinkCategoryToContent
	*/
	@POST
	@Path("/removeCategoryToContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/removeCategoryToContent", notes = """Used to remove a content from a specific category.
	//#SWGNL#Roles restrictions: 4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES""", response = classOf[MResponseLinkCategoryToContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeCategoryToContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("categoryId")
	categoryId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """Optional. Default = false
	//#SWGNL#Automatically Apply the right ACL between Content and Category""")
	@FormParam("applyAcl")
	applyAcl: Boolean):Response /*returnType = MResponseLinkCategoryToContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeCategoryToContent(tokenId,clientId,categoryId,contentId,applyAcl)
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
			@QueryParam("applyAcl")applyAcl_q: Boolean,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseLinkCategoryToContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__removeCategoryToContent(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,categoryId_q,contentId_q,applyAcl_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeCategoryToContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeCategoryToContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeCategoryToContent(tokenId: String, clientId: String, categoryId: String, contentId: String, applyAcl: Boolean) :MResponseLinkCategoryToContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeCategoryToContent: String

	/**
	 * Deprecated with Use JContent.findByProperties
	 * 
	 * Return the list contents linked to a category.
	 * if categoryId is empty find all contents without categories
	 * @param tokenId : String
	 * @param param : MContentCategoryshowContentsByCategoryReq
	 * @return MResponseShowContentByCategory
	*/
	@POST
	@Path("/showContentsByCategory")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/showContentsByCategory", notes = """Deprecated with Use JContent.findByProperties
	//#SWGNL#
	//#SWGNL#Return the list contents linked to a category.
	//#SWGNL#if categoryId is empty find all contents without categories""", response = classOf[MResponseShowContentByCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def showContentsByCategory(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentCategoryshowContentsByCategoryReq):Response /*returnType = MResponseShowContentByCategory*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__showContentsByCategory(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_showContentsByCategory)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_showContentsByCategory)
	    }
	} 

	@GET
	@Path("/showContentsByCategory")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Deprecated
	def showContentsByCategory_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseShowContentByCategory*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__showContentsByCategory(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentCategoryshowContentsByCategoryReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_showContentsByCategory)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_showContentsByCategory)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __showContentsByCategory(tokenId: String, param: MContentCategoryshowContentsByCategoryReq) :MResponseShowContentByCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_showContentsByCategory: String

	/**
	 * Deprecated by JContent.detail
	 * Return the list of categories where the content is linked.
	 * @param tokenId : String
	 * @param param : MContentCategoryshowCategoriesByContentReq
	 * @return MResponseShowCategoriesByContent
	*/
	@POST
	@Path("/showCategoriesByContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/showCategoriesByContent", notes = """Deprecated by JContent.detail
	//#SWGNL#Return the list of categories where the content is linked.""", response = classOf[MResponseShowCategoriesByContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def showCategoriesByContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentCategoryshowCategoriesByContentReq):Response /*returnType = MResponseShowCategoriesByContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__showCategoriesByContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_showCategoriesByContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_showCategoriesByContent)
	    }
	} 

	@GET
	@Path("/showCategoriesByContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Deprecated
	def showCategoriesByContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseShowCategoriesByContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__showCategoriesByContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentCategoryshowCategoriesByContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_showCategoriesByContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_showCategoriesByContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __showCategoriesByContent(tokenId: String, param: MContentCategoryshowCategoriesByContentReq) :MResponseShowCategoriesByContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_showCategoriesByContent: String

}