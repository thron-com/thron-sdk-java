package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.category.MResponseNewCategory
import it.newvision.nvp.xcontents.services.model.request.MCategorycreateCategoryReq
import it.newvision.nvp.xcontents.services.model.category.MResponseUpdateCategory
import it.newvision.nvp.xcontents.services.model.request.MCategoryaddCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryremoveCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.category.MResponseRemoveCategory
import it.newvision.nvp.xcontents.services.model.category.MResponseFindCategory2
import it.newvision.nvp.xcontents.services.model.request.MCategoryfindByProperties2Req
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategoryReq
import it.newvision.nvp.xcontents.services.model.category.MResponseGetCategory
import it.newvision.nvp.xcontents.services.model.category.MResponseCategoryPrettyId
import it.newvision.nvp.xcontents.services.model.request.MCategoryaddCategoryPrettyIdReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategoryPrettyIdReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryremoveCategoryPrettyIdReq
import it.newvision.nvp.xcontents.services.model.category.MResponseCategoryVerifyPrettyId
import it.newvision.nvp.xcontents.services.model.request.MCategoryverifyCategoryPrettyIdReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to manage categories (Folders).
 * A Category is a container of contents, and can be organized in a tree structure.
 * 
 * Categories can have multilingual metadata, name and description.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/category</li>
 * </ul>
 */
@Path("/category")
//#SWG#@Api(value = "/category", description = """Service used to manage categories (Folders). 
//#SWGNL#A Category is a container of contents, and can be organized in a tree structure.
//#SWGNL#Categories can have multilingual metadata, name and description.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/category</li>
//#SWGNL#</ul>""")
trait JCategory extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Creates a category.
	 * Category owner and ACLs are inherited from parent category, if any.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_PUBLIC_CATEGORIES role</li>
	 * 	<li>Applications can not create root categories</li>
	 * 	<li>MODIFY ACL on parent category, if any.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategorycreateCategoryReq
	 * @return MResponseNewCategory
	*/
	@POST
	@Path("/createCategory")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/createCategory", notes = """Creates a category. 
	//#SWGNL#Category owner and ACLs are inherited from parent category, if any.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_PUBLIC_CATEGORIES role</li>
	//#SWGNL#	<li>Applications can not create root categories</li>
	//#SWGNL#	<li>MODIFY ACL on parent category, if any.</li>
	//#SWGNL#</ul>""", response = classOf[MResponseNewCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def createCategory(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategorycreateCategoryReq):Response /*returnType = MResponseNewCategory*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__createCategory(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_createCategory)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_createCategory)
	    }
	} 

	@GET
	@Path("/createCategory")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def createCategory_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseNewCategory*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("createCategory",this._getCacheControl) 
		try{
			val resp = this.__createCategory(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategorycreateCategoryReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_createCategory)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_createCategory)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __createCategory(tokenId: String, param: MCategorycreateCategoryReq) :MResponseNewCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_createCategory: String

	/**
	 * Adds localized name and description to a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryaddCategory4LocaleReq
	 * @return MResponseUpdateCategory
	*/
	@POST
	@Path("/addCategory4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addCategory4Locale", notes = """Adds localized name and description to a category.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseUpdateCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addCategory4Locale(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategoryaddCategory4LocaleReq):Response /*returnType = MResponseUpdateCategory*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addCategory4Locale(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addCategory4Locale)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addCategory4Locale)
	    }
	} 

	@GET
	@Path("/addCategory4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addCategory4Locale_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateCategory*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addCategory4Locale",this._getCacheControl) 
		try{
			val resp = this.__addCategory4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryaddCategory4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addCategory4Locale)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addCategory4Locale)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addCategory4Locale(tokenId: String, param: MCategoryaddCategory4LocaleReq) :MResponseUpdateCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addCategory4Locale: String

	/**
	 * Removes localized name and description from a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryremoveCategory4LocaleReq
	 * @return MResponseUpdateCategory
	*/
	@POST
	@Path("/removeCategory4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeCategory4Locale", notes = """Removes localized name and description from a category.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseUpdateCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeCategory4Locale(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategoryremoveCategory4LocaleReq):Response /*returnType = MResponseUpdateCategory*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeCategory4Locale(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeCategory4Locale)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeCategory4Locale)
	    }
	} 

	@GET
	@Path("/removeCategory4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeCategory4Locale_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateCategory*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeCategory4Locale",this._getCacheControl) 
		try{
			val resp = this.__removeCategory4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryremoveCategory4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeCategory4Locale)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeCategory4Locale)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeCategory4Locale(tokenId: String, param: MCategoryremoveCategory4LocaleReq) :MResponseUpdateCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeCategory4Locale: String

	/**
	 * Updates localized name and description of a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryupdateCategory4LocaleReq
	 * @return MResponseUpdateCategory
	*/
	@POST
	@Path("/updateCategory4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateCategory4Locale", notes = """Updates localized name and description of a category.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseUpdateCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateCategory4Locale(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategoryupdateCategory4LocaleReq):Response /*returnType = MResponseUpdateCategory*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateCategory4Locale(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateCategory4Locale)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateCategory4Locale)
	    }
	} 

	@GET
	@Path("/updateCategory4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateCategory4Locale_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateCategory*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateCategory4Locale",this._getCacheControl) 
		try{
			val resp = this.__updateCategory4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryupdateCategory4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateCategory4Locale)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateCategory4Locale)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateCategory4Locale(tokenId: String, param: MCategoryupdateCategory4LocaleReq) :MResponseUpdateCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateCategory4Locale: String

	/**
	 * The service remove the specified category only if there no linked contents and subcategories.
	 * With cascade = true the service unlink all contents and remove recursively all subcategories
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PUBLIC_CATEGORIES or CORE_MANAGE_PUBLIC_CATEGORIES role</li>
	 * </ul>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * 	<li>No Apps linked to the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param catId : String
	 * Category id or prettyId
	 * @param cascade : Boolean
	 * Used to force the remove also in the subcategories
	 * @return MResponseRemoveCategory
	*/
	@POST
	@Path("/removeCategory")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/removeCategory", notes = """The service remove the specified category only if there no linked contents and subcategories. 
	//#SWGNL#With cascade = true the service unlink all contents and remove recursively all subcategories
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PUBLIC_CATEGORIES or CORE_MANAGE_PUBLIC_CATEGORIES role</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#	<li>No Apps linked to the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseRemoveCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeCategory(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Category id or prettyId""")
	@FormParam("catId")
	catId: String, 
			//#SWG#@ApiParam(value = """Used to force the remove also in the subcategories""")
	@FormParam("cascade")
	cascade: Boolean):Response /*returnType = MResponseRemoveCategory*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeCategory(tokenId,clientId,catId,cascade)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeCategory)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeCategory)
	    }
	} 

	@GET
	@Path("/removeCategory")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeCategory_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("catId")catId_q: String, 
			@QueryParam("cascade")cascade_q: Boolean,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRemoveCategory*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeCategory",this._getCacheControl) 
		try{	
			val resp = this.__removeCategory(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,catId_q,cascade_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeCategory)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeCategory)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeCategory(tokenId: String, clientId: String, catId: String, cascade: Boolean) :MResponseRemoveCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeCategory: String

	/**
	 * Returns the list of categories matching provided criteria.
	 * 
	 * Categories linkedCategories property is not returned.
	 * @param tokenId : String
	 * @param param : MCategoryfindByProperties2Req
	 * @return MResponseFindCategory2
	*/
	@POST
	@Path("/findByProperties2")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findByProperties2", notes = """Returns the list of categories matching provided criteria.
	//#SWGNL#
	//#SWGNL#Categories linkedCategories property is not returned.""", response = classOf[MResponseFindCategory2])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findByProperties2(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategoryfindByProperties2Req):Response /*returnType = MResponseFindCategory2*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findByProperties2(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findByProperties2)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findByProperties2)
	    }
	} 

	@GET
	@Path("/findByProperties2")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def findByProperties2_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFindCategory2*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("findByProperties2",this._getCacheControl) 
		try{
			val resp = this.__findByProperties2(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryfindByProperties2Req](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findByProperties2)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findByProperties2)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findByProperties2(tokenId: String, param: MCategoryfindByProperties2Req) :MResponseFindCategory2
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findByProperties2: String

	/**
	 * Updates the detail of a category.
	 * 
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryupdateCategoryReq
	 * @return MResponseUpdateCategory
	*/
	@POST
	@Path("/updateCategory")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateCategory", notes = """Updates the detail of a category.
	//#SWGNL#
	//#SWGNL#The "update" field of this web service works in “patch" mode: it means that each and everyone of the "update" attributes you want to change must be included in the body of the request, those not included will not be updated.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseUpdateCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateCategory(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategoryupdateCategoryReq):Response /*returnType = MResponseUpdateCategory*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateCategory(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateCategory)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateCategory)
	    }
	} 

	@GET
	@Path("/updateCategory")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateCategory_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateCategory*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateCategory",this._getCacheControl) 
		try{
			val resp = this.__updateCategory(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryupdateCategoryReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateCategory)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateCategory)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateCategory(tokenId: String, param: MCategoryupdateCategoryReq) :MResponseUpdateCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateCategory: String

	/**
	 * Returns category detail; if cascade parameter is true, service returns the tree of children
	 * categories.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * Category id or prettyId
	 * @param cascade : Boolean
	 * Optional. With cascade equals true, the service return the children sub tree of the given category
	 * @param locale : String
	 * Optional.If the client desires to have the category description for a specific locale. The desired
	 * locale is return as first element of the array (if exists).
	 * The field is used in conjunction with orderBy field to sort the contents by categoryName (for a
	 * specific locale)
	 * The service always return all available locales for each category.
	 * @return MResponseGetCategory
	*/
	@GET
	@Path("/getCategory")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getCategory", notes = """Returns category detail; if cascade parameter is true, service returns the tree of children categories.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.""", response = classOf[MResponseGetCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getCategory(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Category id or prettyId""")
	@QueryParam("categoryId")
	categoryId: String, 
			//#SWG#@ApiParam(value = """Optional. With cascade equals true, the service return the children sub tree of the given category""")
	@QueryParam("cascade")
	cascade: Boolean, 
			//#SWG#@ApiParam(value = """Optional.If the client desires to have the category description for a specific locale. The desired locale is return as first element of the array (if exists).
	//#SWGNL#The field is used in conjunction with orderBy field to sort the contents by categoryName (for a specific locale)
	//#SWGNL#The service always return all available locales for each category.""")
	@QueryParam("locale")
	locale: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetCategory*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getCategory") 
		try{	
			val resp = this.__getCategory(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,categoryId,cascade,locale)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getCategory)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getCategory)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getCategory(tokenId: String, clientId: String, categoryId: String, cascade: Boolean, locale: String) :MResponseGetCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getCategory: String

	/**
	 * Adds a localized prettyId to a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryaddCategoryPrettyIdReq
	 * @return MResponseCategoryPrettyId
	*/
	@POST
	@Path("/addCategoryPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addCategoryPrettyId", notes = """Adds a localized prettyId to a category.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseCategoryPrettyId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addCategoryPrettyId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategoryaddCategoryPrettyIdReq):Response /*returnType = MResponseCategoryPrettyId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addCategoryPrettyId(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addCategoryPrettyId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addCategoryPrettyId)
	    }
	} 

	@GET
	@Path("/addCategoryPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addCategoryPrettyId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCategoryPrettyId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addCategoryPrettyId",this._getCacheControl) 
		try{
			val resp = this.__addCategoryPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryaddCategoryPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addCategoryPrettyId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addCategoryPrettyId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addCategoryPrettyId(tokenId: String, param: MCategoryaddCategoryPrettyIdReq) :MResponseCategoryPrettyId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addCategoryPrettyId: String

	/**
	 * Updates a localized prettyId of a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryupdateCategoryPrettyIdReq
	 * @return MResponseCategoryPrettyId
	*/
	@POST
	@Path("/updateCategoryPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateCategoryPrettyId", notes = """Updates a localized prettyId of a category.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseCategoryPrettyId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateCategoryPrettyId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategoryupdateCategoryPrettyIdReq):Response /*returnType = MResponseCategoryPrettyId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateCategoryPrettyId(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateCategoryPrettyId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateCategoryPrettyId)
	    }
	} 

	@GET
	@Path("/updateCategoryPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateCategoryPrettyId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCategoryPrettyId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateCategoryPrettyId",this._getCacheControl) 
		try{
			val resp = this.__updateCategoryPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryupdateCategoryPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateCategoryPrettyId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateCategoryPrettyId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateCategoryPrettyId(tokenId: String, param: MCategoryupdateCategoryPrettyIdReq) :MResponseCategoryPrettyId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateCategoryPrettyId: String

	/**
	 * Removes localized prettyId from a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryremoveCategoryPrettyIdReq
	 * @return MResponseCategoryPrettyId
	*/
	@POST
	@Path("/removeCategoryPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeCategoryPrettyId", notes = """Removes localized prettyId from a category.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the category</li>
	//#SWGNL#</ul>""", response = classOf[MResponseCategoryPrettyId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeCategoryPrettyId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategoryremoveCategoryPrettyIdReq):Response /*returnType = MResponseCategoryPrettyId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeCategoryPrettyId(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeCategoryPrettyId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeCategoryPrettyId)
	    }
	} 

	@GET
	@Path("/removeCategoryPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeCategoryPrettyId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCategoryPrettyId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeCategoryPrettyId",this._getCacheControl) 
		try{
			val resp = this.__removeCategoryPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryremoveCategoryPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeCategoryPrettyId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeCategoryPrettyId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeCategoryPrettyId(tokenId: String, param: MCategoryremoveCategoryPrettyIdReq) :MResponseCategoryPrettyId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeCategoryPrettyId: String

	/**
	 * Verify whether a category prettyId is valid for a specific locale or not, and eventually suggest an
	 * alternative.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MCategoryverifyCategoryPrettyIdReq
	 * @return MResponseCategoryVerifyPrettyId
	*/
	@POST
	@Path("/verifyCategoryPrettyId/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/verifyCategoryPrettyId", notes = """Verify whether a category prettyId is valid for a specific locale or not, and eventually suggest an alternative.""", response = classOf[MResponseCategoryVerifyPrettyId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def verifyCategoryPrettyId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MCategoryverifyCategoryPrettyIdReq):Response /*returnType = MResponseCategoryVerifyPrettyId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__verifyCategoryPrettyId(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_verifyCategoryPrettyId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_verifyCategoryPrettyId)
	    }
	} 

	@GET
	@Path("/verifyCategoryPrettyId/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def verifyCategoryPrettyId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCategoryVerifyPrettyId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("verifyCategoryPrettyId",this._getCacheControl) 
		try{
			val resp = this.__verifyCategoryPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MCategoryverifyCategoryPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_verifyCategoryPrettyId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_verifyCategoryPrettyId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __verifyCategoryPrettyId(tokenId: String, clientId: String, param: MCategoryverifyCategoryPrettyIdReq) :MResponseCategoryVerifyPrettyId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_verifyCategoryPrettyId: String

}