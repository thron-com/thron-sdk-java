package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.category.MResponseNewCategory
import it.newvision.nvp.xcontents.services.model.request.MCategorycreateCategoryReq
import it.newvision.nvp.xcontents.services.model.request.MCategorycreateSystemCategoryReq
import it.newvision.nvp.xcontents.services.model.category.MResponseUpdateCategory
import it.newvision.nvp.xcontents.services.model.request.MCategoryaddCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryremoveCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.category.MResponseRemoveCategory
import it.newvision.nvp.xcontents.services.model.category.MResponseFindCategory
import it.newvision.nvp.xcontents.services.model.request.MCategoryfindByPropertiesReq
import it.newvision.nvp.xcontents.services.model.category.MResponseFindCategory2
import it.newvision.nvp.xcontents.services.model.request.MCategoryfindByProperties2Req
import it.newvision.nvp.xcontents.services.model.category.MResponseCategorySetParentId
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategoryReq
import it.newvision.nvp.xcontents.services.model.category.MResponseGetCategory
import it.newvision.nvp.xcontents.services.model.category.MResponseGetRootCategories
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
 * Service used to handle categories, useful for organize the logical contents
 * present on the platform. The service allows you to manage the metadata
 * associated with categories in multilingual.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/category/    </li>
 * </ul>
 */
@Path("/category")
//#SWG#@Api(value = "/category", description = """Service used to handle categories, useful for organize the logical contents present on the platform. The service allows you to manage the metadata associated with categories in multilingual.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/category/    </li>
//#SWGNL#</ul>""")
trait JCategory extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * create a new category and link to the parent category in the tree hierarchy. The service allows to
	 * create two different types of category (PUBLIC and PRIVATE). Private categories are used to
	 * organize the private contents of a user and are visible only by the user that create the category.
	 * 
	 * Category trees with mixed categories (public and private) is not allowed.
	 * @param tokenId : String
	 * @param param : MCategorycreateCategoryReq
	 * @return MResponseNewCategory
	*/
	@POST
	@Path("/createCategory")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/createCategory", notes = """create a new category and link to the parent category in the tree hierarchy. The service allows to create two different types of category (PUBLIC and PRIVATE). Private categories are used to organize the private contents of a user and are visible only by the user that create the category. 
	//#SWGNL#Category trees with mixed categories (public and private) is not allowed.""", response = classOf[MResponseNewCategory])
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
		try{
			val resp = this.__createCategory(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategorycreateCategoryReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_createCategory)
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
	 * create a new System category and link to the parent category in the tree hierarchy. Only super
	 * users have the permission to use this service.
	 * @param tokenId : String
	 * @param param : MCategorycreateSystemCategoryReq
	 * @return MResponseNewCategory
	*/
	@POST
	@Path("/createSystemCategory")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/createSystemCategory", notes = """create a new System category and link to the parent category in the tree hierarchy. Only super users have the permission to use this service.""", response = classOf[MResponseNewCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def createSystemCategory(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategorycreateSystemCategoryReq):Response /*returnType = MResponseNewCategory*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__createSystemCategory(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_createSystemCategory)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_createSystemCategory)
	    }
	} 

	@GET
	@Path("/createSystemCategory")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def createSystemCategory_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseNewCategory*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__createSystemCategory(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategorycreateSystemCategoryReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_createSystemCategory)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_createSystemCategory)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __createSystemCategory(tokenId: String, param: MCategorycreateSystemCategoryReq) :MResponseNewCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_createSystemCategory: String

	/**
	 * Used to add the category's name,except and description in a specific lang
	 * @param tokenId : String
	 * @param param : MCategoryaddCategory4LocaleReq
	 * @return MResponseUpdateCategory
	*/
	@POST
	@Path("/addCategory4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addCategory4Locale", notes = """Used to add the category's name,except and description in a specific lang""", response = classOf[MResponseUpdateCategory])
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
		try{
			val resp = this.__addCategory4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryaddCategory4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addCategory4Locale)
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
	 * Used to remove the category's name,except and description for a specific lang
	 * @param tokenId : String
	 * @param param : MCategoryremoveCategory4LocaleReq
	 * @return MResponseUpdateCategory
	*/
	@POST
	@Path("/removeCategory4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeCategory4Locale", notes = """Used to remove the category's name,except and description for a specific lang""", response = classOf[MResponseUpdateCategory])
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
		try{
			val resp = this.__removeCategory4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryremoveCategory4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeCategory4Locale)
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
	 * Used to update the category's name,except and description in a specific lang
	 * @param tokenId : String
	 * @param param : MCategoryupdateCategory4LocaleReq
	 * @return MResponseUpdateCategory
	*/
	@POST
	@Path("/updateCategory4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateCategory4Locale", notes = """Used to update the category's name,except and description in a specific lang""", response = classOf[MResponseUpdateCategory])
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
		try{
			val resp = this.__updateCategory4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryupdateCategory4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateCategory4Locale)
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
	 * With cascade = true the service unlink all linked contents and unlink the subcategories (the
	 * subcategories becomes root categories)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param catId : String
	 * @param cascade : Boolean
	 * Used to force the remove also in the subcategories
	 * @return MResponseRemoveCategory
	*/
	@POST
	@Path("/removeCategory")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/removeCategory", notes = """The service remove the specified category only if there no linked contents and subcategories. 
	//#SWGNL#With cascade = true the service unlink all linked contents and unlink the subcategories (the subcategories becomes root categories)""", response = classOf[MResponseRemoveCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeCategory(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
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
		try{	
			val resp = this.__removeCategory(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,catId_q,cascade_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeCategory)
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
	 * Deprecated by findByProperties2.
	 * 
	 * Returns a flat list of categories that meet the search criteria. Each single category in the result
	 * set doesn't show the proper "linkedCategory" information.
	 * @param tokenId : String
	 * @param param : MCategoryfindByPropertiesReq
	 * @return MResponseFindCategory
	*/
	@POST
	@Path("/findByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findByProperties", notes = """Deprecated by findByProperties2.
	//#SWGNL#
	//#SWGNL#Returns a flat list of categories that meet the search criteria. Each single category in the result set doesn't show the proper "linkedCategory" information.""", response = classOf[MResponseFindCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def findByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCategoryfindByPropertiesReq):Response /*returnType = MResponseFindCategory*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findByProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findByProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findByProperties)
	    }
	} 

	@GET
	@Path("/findByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Deprecated
	def findByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFindCategory*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__findByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryfindByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_findByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findByProperties(tokenId: String, param: MCategoryfindByPropertiesReq) :MResponseFindCategory
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findByProperties: String

	/**
	 * returns a flat list of categories that meet the search criteria. Each single category in the result
	 * set doesn't show the proper "linkedCategory" information.
	 * @param tokenId : String
	 * @param param : MCategoryfindByProperties2Req
	 * @return MResponseFindCategory2
	*/
	@POST
	@Path("/findByProperties2")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findByProperties2", notes = """returns a flat list of categories that meet the search criteria. Each single category in the result set doesn't show the proper "linkedCategory" information.""", response = classOf[MResponseFindCategory2])
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
		try{
			val resp = this.__findByProperties2(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryfindByProperties2Req](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_findByProperties2)
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
	 * Used to move a category (and its sub tree) to a different node in the category forest.
	 * 
	 * Example:
	 * given two category tree we move the category C2 inside C4
	 * <ul>
	 * 	<li>C1->C2->C3</li>
	 * </ul>
	 * <ul>
	 * 	<li>C4->C5->C6</li>
	 * </ul>
	 * result:
	 * <ul>
	 * 	<li>C1</li>
	 * </ul>
	 * <ul>
	 * 	<li>C4->C5->C6</li>
	 * </ul>
	 * <ul>
	 * 	<li>     ->C2->C3</li>
	 * </ul>
	 * After the operation the category C2 (and subcategories) becomes subcategory of C4.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * @param categoryParentId : String
	 * @return MResponseCategorySetParentId
	*/
	@POST
	@Path("/setParentId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/setParentId", notes = """Used to move a category (and its sub tree) to a different node in the category forest.
	//#SWGNL#
	//#SWGNL#Example:
	//#SWGNL#given two category tree we move the category C2 inside C4
	//#SWGNL#<ul>
	//#SWGNL#	<li>C1->C2->C3</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>C4->C5->C6</li>
	//#SWGNL#</ul>
	//#SWGNL#result:
	//#SWGNL#<ul>
	//#SWGNL#	<li>C1</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>C4->C5->C6</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>     ->C2->C3</li>
	//#SWGNL#</ul>
	//#SWGNL#After the operation the category C2 (and subcategories) becomes subcategory of C4.""", response = classOf[MResponseCategorySetParentId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def setParentId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("categoryId")
	categoryId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("categoryParentId")
	categoryParentId: String):Response /*returnType = MResponseCategorySetParentId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__setParentId(tokenId,clientId,categoryId,categoryParentId)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_setParentId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_setParentId)
	    }
	} 

	@GET
	@Path("/setParentId")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def setParentId_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("categoryId")categoryId_q: String, 
			@QueryParam("categoryParentId")categoryParentId_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCategorySetParentId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__setParentId(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,categoryId_q,categoryParentId_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_setParentId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_setParentId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __setParentId(tokenId: String, clientId: String, categoryId: String, categoryParentId: String) :MResponseCategorySetParentId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_setParentId: String

	/**
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * @param tokenId : String
	 * @param param : MCategoryupdateCategoryReq
	 * @return MResponseUpdateCategory
	*/
	@POST
	@Path("/updateCategory")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateCategory", notes = """The "update" field of this web service works in “patch" mode: it means that each and everyone of the "update" attributes you want to change must be included in the body of the request, those not included will not be updated.""", response = classOf[MResponseUpdateCategory])
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
		try{
			val resp = this.__updateCategory(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryupdateCategoryReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateCategory)
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
	 * Return the category object with the specified CategoryID; if cascade = true returns the tree of
	 * children categories.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * required.
	 * Can be used the Category Id or the Category PrettyId

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
	//#SWG#@ApiOperation(value = "/getCategory", notes = """Return the category object with the specified CategoryID; if cascade = true returns the tree of children categories.""", response = classOf[MResponseGetCategory])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getCategory(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """required.
	//#SWGNL#Can be used the Category Id or the Category PrettyId
	//#SWGNL#""")
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
	 * Deprecated by findByProperties2
	 * 
	 * Return the list of top level categories (only root PUBLIC categories) without the children category
	 * detail. can be used to filter only the root categories of a specific solution (VIEW,PLAY,MOVE...)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param locale : String
	 * the give locale used for the output description. Optional parameter.
	 * @param solution : String
	 * @param offset : Integer
	 * @param numberOfResult : Integer
	 * default value= 50
	 * value -1, return all result not paginated
	 * @return MResponseGetRootCategories
	*/
	@GET
	@Path("/getRootCategories")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getRootCategories", notes = """Deprecated by findByProperties2
	//#SWGNL#
	//#SWGNL#Return the list of top level categories (only root PUBLIC categories) without the children category detail. can be used to filter only the root categories of a specific solution (VIEW,PLAY,MOVE...)""", response = classOf[MResponseGetRootCategories])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def getRootCategories(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """the give locale used for the output description. Optional parameter.""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("solution")
	solution: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """default value= 50
	//#SWGNL#value -1, return all result not paginated""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetRootCategories*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getRootCategories") 
		try{	
			val resp = this.__getRootCategories(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,locale,solution,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getRootCategories)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getRootCategories)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getRootCategories(tokenId: String, clientId: String, locale: String, solution: String, offset: Integer, numberOfResult: Integer) :MResponseGetRootCategories
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getRootCategories: String

	/**
	 * add the category prettyId for a specific locale.
	 * @param tokenId : String
	 * @param param : MCategoryaddCategoryPrettyIdReq
	 * @return MResponseCategoryPrettyId
	*/
	@POST
	@Path("/addCategoryPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addCategoryPrettyId", notes = """add the category prettyId for a specific locale.""", response = classOf[MResponseCategoryPrettyId])
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
		try{
			val resp = this.__addCategoryPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryaddCategoryPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addCategoryPrettyId)
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
	 * update the category prettyId for a specific locale.
	 * @param tokenId : String
	 * @param param : MCategoryupdateCategoryPrettyIdReq
	 * @return MResponseCategoryPrettyId
	*/
	@POST
	@Path("/updateCategoryPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateCategoryPrettyId", notes = """update the category prettyId for a specific locale.""", response = classOf[MResponseCategoryPrettyId])
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
		try{
			val resp = this.__updateCategoryPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryupdateCategoryPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateCategoryPrettyId)
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
	 * remove the category prettyId for a specific locale.
	 * @param tokenId : String
	 * @param param : MCategoryremoveCategoryPrettyIdReq
	 * @return MResponseCategoryPrettyId
	*/
	@POST
	@Path("/removeCategoryPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeCategoryPrettyId", notes = """remove the category prettyId for a specific locale.""", response = classOf[MResponseCategoryPrettyId])
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
		try{
			val resp = this.__removeCategoryPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCategoryremoveCategoryPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeCategoryPrettyId)
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
		try{
			val resp = this.__verifyCategoryPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MCategoryverifyCategoryPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_verifyCategoryPrettyId)
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