package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.content.MResponseContentAddLocale
import it.newvision.nvp.xcontents.services.model.request.MContentaddContent4LocaleReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentDetail
import it.newvision.nvp.xcontents.services.model.content.MResponseContentFindByProperties
import it.newvision.nvp.xcontents.services.model.request.MContentfindByPropertiesReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentRemoveLocale
import it.newvision.nvp.xcontents.services.model.content.MResponseContentUpdate
import it.newvision.nvp.xcontents.services.model.request.MContentupdateAvailableSolutionsReq
import it.newvision.nvp.xcontents.services.model.request.MContentupdateContentReq
import it.newvision.nvp.xcontents.services.model.request.MContentaddPlayerEmbedCodeReq
import it.newvision.nvp.xcontents.services.model.request.MContentremovePlayerEmbedCodeReq
import it.newvision.nvp.xcontents.services.model.request.MContentupdatePlayerEmbedCodeReq
import it.newvision.nvp.xcontents.services.model.request.MContentupdatePlayerEmbedCodesReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentUpdateLocale
import it.newvision.nvp.xcontents.services.model.request.MContentupdateContent4LocaleReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentPrettyId
import it.newvision.nvp.xcontents.services.model.request.MContentupdateContentPrettyIdReq
import it.newvision.nvp.xcontents.services.model.request.MContentremoveContentPrettyIdReq
import it.newvision.nvp.xcontents.services.model.request.MContentaddContentPrettyIdReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentVerifyPrettyId
import it.newvision.nvp.xcontents.services.model.request.MContentverifyContentPrettyIdReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContent
import it.newvision.nvp.xcontents.services.model.request.MContentaddLinkedContentReq
import it.newvision.nvp.xcontents.services.model.request.MContentaddLinkedContentsReq
import it.newvision.nvp.xcontents.services.model.request.MContentmoveLinkedContentReq
import it.newvision.nvp.xcontents.services.model.request.MContentremoveLinkedContentsReq
import it.newvision.nvp.xcontents.services.model.request.MContentupdateUserSpecificValuesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to manage a Content. A Content is a generic object within the
 * platform, may contain multiple descriptions in different languages, be linked
 * to one or more categories, have tags and  be linked to other contents. A
 * content can be created only throw the specific publishing process service in
 * xadmin component.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/content/   </li>
 * </ul>
 */
@Path("/content")
//#SWG#@Api(value = "/content", description = """Service used to manage a Content. A Content is a generic object within the platform, may contain multiple descriptions in different languages, be linked to one or more categories, have tags and  be linked to other contents. A content can be created only throw the specific publishing process service in xadmin component.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/content/   </li>
//#SWGNL#</ul>""")
trait JContent extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Used to add the content's name,except and description in a specific locale (lang)
	 * @param tokenId : String
	 * @param param : MContentaddContent4LocaleReq
	 * @return MResponseContentAddLocale
	*/
	@POST
	@Path("/addContent4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addContent4Locale", notes = """Used to add the content's name,except and description in a specific locale (lang)""", response = classOf[MResponseContentAddLocale])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addContent4Locale(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentaddContent4LocaleReq):Response /*returnType = MResponseContentAddLocale*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addContent4Locale(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addContent4Locale)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addContent4Locale)
	    }
	} 

	@GET
	@Path("/addContent4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addContent4Locale_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentAddLocale*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addContent4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentaddContent4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addContent4Locale)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addContent4Locale)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addContent4Locale(tokenId: String, param: MContentaddContent4LocaleReq) :MResponseContentAddLocale
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addContent4Locale: String

	/**
	 * return all content information:
	 * <ul>
	 * 	<li>all metadata </li>
	 * 	<li>the specified content4Locale </li>
	 * 	<li>the linkedcontent collection </li>
	 * 	<li>the list of tags </li>
	 * </ul>
	 * 
	 * if the value of locale is empty, the service returns the value for all locales added to the content.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param locale : String
	 * Optional.If the client desires to have the content description only for a specific locale. If empty
	 * the service return all available locales of the contents.
	 * @param returnLinkedContents : Boolean
	 * Optional. used to specify if the service should return the list of linked contents
	 * (MResponseContentDetail.content.linkedContents)
	 * @param returnLinkedCategories : Boolean
	 * Optional. used to specify if the service should return the list of linked Categories.
	 * (MResponseContentDetail.linkedCategories)
	 * @param returnThumbUrl : Boolean
	 * Optional. used to specify if the service should return the thumbnail Url of the content
	 * @param returnItags : Boolean
	 * Optional. For Acl validation
	 * @param returnImetadata : Boolean
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @return MResponseContentDetail
	*/
	@GET
	@Path("/detail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """return all content information:
	//#SWGNL#<ul>
	//#SWGNL#	<li>all metadata </li>
	//#SWGNL#	<li>the specified content4Locale </li>
	//#SWGNL#	<li>the linkedcontent collection </li>
	//#SWGNL#	<li>the list of tags </li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#if the value of locale is empty, the service returns the value for all locales added to the content.""", response = classOf[MResponseContentDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """for Acl validation""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """Optional.If the client desires to have the content description only for a specific locale. If empty the service return all available locales of the contents.""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional. used to specify if the service should return the list of linked contents (MResponseContentDetail.content.linkedContents)""")
	@QueryParam("returnLinkedContents")
	returnLinkedContents: Boolean, 
			//#SWG#@ApiParam(value = """Optional. used to specify if the service should return the list of linked Categories.
	//#SWGNL#(MResponseContentDetail.linkedCategories)""")
	@QueryParam("returnLinkedCategories")
	returnLinkedCategories: Boolean, 
			//#SWG#@ApiParam(value = """Optional. used to specify if the service should return the thumbnail Url of the content""")
	@QueryParam("returnThumbUrl")
	returnThumbUrl: Boolean, 
			//#SWG#@ApiParam(value = """Optional. For Acl validation""")
	@QueryParam("returnItags")
	returnItags: Boolean, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("returnImetadata")
	returnImetadata: Boolean, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. Can be the tokenId for a logged user or the access key for the content.
	//#SWGNL#It's not required for public contents""")
	@QueryParam("pkey")
	pkey: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseContentDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detail") 
		try{	
			val resp = this.__detail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,contentId,locale,returnLinkedContents,returnLinkedCategories,returnThumbUrl,returnItags,returnImetadata,pkey)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, clientId: String, contentId: String, locale: String, returnLinkedContents: Boolean, returnLinkedCategories: Boolean, returnThumbUrl: Boolean, returnItags: Boolean, returnImetadata: Boolean, pkey: String) :MResponseContentDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * The content find by properties return a list of Contents, all information about Contents, only one
	 * Channel, and with the detail in one single locale.
	 * @param tokenId : String
	 * @param param : MContentfindByPropertiesReq
	 * @return MResponseContentFindByProperties
	*/
	@POST
	@Path("/findByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findByProperties", notes = """The content find by properties return a list of Contents, all information about Contents, only one Channel, and with the detail in one single locale.""", response = classOf[MResponseContentFindByProperties])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentfindByPropertiesReq):Response /*returnType = MResponseContentFindByProperties*/ = {
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
	def findByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentFindByProperties*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__findByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentfindByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_findByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findByProperties(tokenId: String, param: MContentfindByPropertiesReq) :MResponseContentFindByProperties
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findByProperties: String

	/**
	 * Used to remove the content's name,except and description for a specific locale (lang)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param locale : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseContentRemoveLocale
	*/
	@POST
	@Path("/removeContent4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/removeContent4Locale", notes = """Used to remove the content's name,except and description for a specific locale (lang)""", response = classOf[MResponseContentRemoveLocale])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeContent4Locale(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional. For Acl validation""")
	@FormParam("categoryIdForAcl")
	categoryIdForAcl: String):Response /*returnType = MResponseContentRemoveLocale*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeContent4Locale(tokenId,clientId,contentId,locale,categoryIdForAcl)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeContent4Locale)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeContent4Locale)
	    }
	} 

	@GET
	@Path("/removeContent4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeContent4Locale_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("contentId")contentId_q: String, 
			@QueryParam("locale")locale_q: String, 
			@QueryParam("categoryIdForAcl")categoryIdForAcl_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentRemoveLocale*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__removeContent4Locale(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,contentId_q,locale_q,categoryIdForAcl_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeContent4Locale)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeContent4Locale)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeContent4Locale(tokenId: String, clientId: String, contentId: String, locale: String, categoryIdForAcl: String) :MResponseContentRemoveLocale
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeContent4Locale: String

	/**
	 * Deprecated.
	 * @param tokenId : String
	 * @param param : MContentupdateAvailableSolutionsReq
	 * @return MResponseContentUpdate
	*/
	@POST
	@Path("/updateAvailableSolutions")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateAvailableSolutions", notes = """Deprecated.""", response = classOf[MResponseContentUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateAvailableSolutions(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentupdateAvailableSolutionsReq):Response /*returnType = MResponseContentUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateAvailableSolutions(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateAvailableSolutions)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateAvailableSolutions)
	    }
	} 

	@GET
	@Path("/updateAvailableSolutions")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateAvailableSolutions_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateAvailableSolutions(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdateAvailableSolutionsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateAvailableSolutions)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateAvailableSolutions)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateAvailableSolutions(tokenId: String, param: MContentupdateAvailableSolutionsReq) :MResponseContentUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateAvailableSolutions: String

	/**
	 * Update content parameters.
	 * The " "contentValues" field of this web service works in “patch" mode: it means that each and
	 * everyone of the "contentValues" attributes you want to change must be included in the body of the
	 * request, those not included will not be updated.
	 * @param tokenId : String
	 * @param param : MContentupdateContentReq
	 * @return MResponseContentUpdate
	*/
	@POST
	@Path("/updateContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateContent", notes = """Update content parameters.
	//#SWGNL#The " "contentValues" field of this web service works in “patch" mode: it means that each and everyone of the "contentValues" attributes you want to change must be included in the body of the request, those not included will not be updated.""", response = classOf[MResponseContentUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentupdateContentReq):Response /*returnType = MResponseContentUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateContent)
	    }
	} 

	@GET
	@Path("/updateContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdateContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateContent(tokenId: String, param: MContentupdateContentReq) :MResponseContentUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateContent: String

	/**
	 * Used to add a custom Player Embed Code for a specific content.
	 * @param tokenId : String
	 * @param param : MContentaddPlayerEmbedCodeReq
	 * @return MResponseContentUpdate
	*/
	@POST
	@Path("/addPlayerEmbedCode")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addPlayerEmbedCode", notes = """Used to add a custom Player Embed Code for a specific content.""", response = classOf[MResponseContentUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addPlayerEmbedCode(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentaddPlayerEmbedCodeReq):Response /*returnType = MResponseContentUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addPlayerEmbedCode(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addPlayerEmbedCode)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addPlayerEmbedCode)
	    }
	} 

	@GET
	@Path("/addPlayerEmbedCode")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addPlayerEmbedCode_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addPlayerEmbedCode(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentaddPlayerEmbedCodeReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addPlayerEmbedCode)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addPlayerEmbedCode)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addPlayerEmbedCode(tokenId: String, param: MContentaddPlayerEmbedCodeReq) :MResponseContentUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addPlayerEmbedCode: String

	/**
	 * Used to remove the custom Player Embed Code for a specific content.
	 * @param tokenId : String
	 * @param param : MContentremovePlayerEmbedCodeReq
	 * @return MResponseContentUpdate
	*/
	@POST
	@Path("/removePlayerEmbedCode")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removePlayerEmbedCode", notes = """Used to remove the custom Player Embed Code for a specific content.""", response = classOf[MResponseContentUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removePlayerEmbedCode(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentremovePlayerEmbedCodeReq):Response /*returnType = MResponseContentUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removePlayerEmbedCode(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removePlayerEmbedCode)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removePlayerEmbedCode)
	    }
	} 

	@GET
	@Path("/removePlayerEmbedCode")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removePlayerEmbedCode_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removePlayerEmbedCode(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentremovePlayerEmbedCodeReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removePlayerEmbedCode)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removePlayerEmbedCode)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removePlayerEmbedCode(tokenId: String, param: MContentremovePlayerEmbedCodeReq) :MResponseContentUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removePlayerEmbedCode: String

	/**
	 * Used to update the custom Player Embed Code for a specific content. These information are used by
	 * the 4me Player for the content presentation.
	 * @param tokenId : String
	 * @param param : MContentupdatePlayerEmbedCodeReq
	 * @return MResponseContentUpdate
	*/
	@POST
	@Path("/updatePlayerEmbedCode")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updatePlayerEmbedCode", notes = """Used to update the custom Player Embed Code for a specific content. These information are used by the 4me Player for the content presentation.""", response = classOf[MResponseContentUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updatePlayerEmbedCode(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentupdatePlayerEmbedCodeReq):Response /*returnType = MResponseContentUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updatePlayerEmbedCode(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updatePlayerEmbedCode)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updatePlayerEmbedCode)
	    }
	} 

	@GET
	@Path("/updatePlayerEmbedCode")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updatePlayerEmbedCode_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updatePlayerEmbedCode(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdatePlayerEmbedCodeReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updatePlayerEmbedCode)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updatePlayerEmbedCode)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updatePlayerEmbedCode(tokenId: String, param: MContentupdatePlayerEmbedCodeReq) :MResponseContentUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updatePlayerEmbedCode: String

	/**
	 * DEPRECATED
	 * @param tokenId : String
	 * @param param : MContentupdatePlayerEmbedCodesReq
	 * @return MResponseContentUpdate
	*/
	@POST
	@Path("/updatePlayerEmbedCodes")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updatePlayerEmbedCodes", notes = """DEPRECATED""", response = classOf[MResponseContentUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updatePlayerEmbedCodes(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentupdatePlayerEmbedCodesReq):Response /*returnType = MResponseContentUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updatePlayerEmbedCodes(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updatePlayerEmbedCodes)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updatePlayerEmbedCodes)
	    }
	} 

	@GET
	@Path("/updatePlayerEmbedCodes")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updatePlayerEmbedCodes_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updatePlayerEmbedCodes(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdatePlayerEmbedCodesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updatePlayerEmbedCodes)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updatePlayerEmbedCodes)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updatePlayerEmbedCodes(tokenId: String, param: MContentupdatePlayerEmbedCodesReq) :MResponseContentUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updatePlayerEmbedCodes: String

	/**
	 * Used to update the content's name,except and description for a specific locale (lang)
	 * @param tokenId : String
	 * @param param : MContentupdateContent4LocaleReq
	 * @return MResponseContentUpdateLocale
	*/
	@POST
	@Path("/updateContent4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateContent4Locale", notes = """Used to update the content's name,except and description for a specific locale (lang)""", response = classOf[MResponseContentUpdateLocale])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateContent4Locale(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentupdateContent4LocaleReq):Response /*returnType = MResponseContentUpdateLocale*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateContent4Locale(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateContent4Locale)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateContent4Locale)
	    }
	} 

	@GET
	@Path("/updateContent4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateContent4Locale_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentUpdateLocale*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateContent4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdateContent4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateContent4Locale)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateContent4Locale)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateContent4Locale(tokenId: String, param: MContentupdateContent4LocaleReq) :MResponseContentUpdateLocale
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateContent4Locale: String

	/**
	 * @param tokenId : String
	 * @param param : MContentupdateContentPrettyIdReq
	 * @return MResponseContentPrettyId
	*/
	@POST
	@Path("/updateContentPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateContentPrettyId", notes = """""", response = classOf[MResponseContentPrettyId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateContentPrettyId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentupdateContentPrettyIdReq):Response /*returnType = MResponseContentPrettyId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateContentPrettyId(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateContentPrettyId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateContentPrettyId)
	    }
	} 

	@GET
	@Path("/updateContentPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateContentPrettyId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentPrettyId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateContentPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdateContentPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateContentPrettyId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateContentPrettyId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateContentPrettyId(tokenId: String, param: MContentupdateContentPrettyIdReq) :MResponseContentPrettyId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateContentPrettyId: String

	/**
	 * remove the prettyId for the given locale
	 * @param tokenId : String
	 * @param param : MContentremoveContentPrettyIdReq
	 * @return MResponseContentPrettyId
	*/
	@POST
	@Path("/removeContentPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeContentPrettyId", notes = """remove the prettyId for the given locale""", response = classOf[MResponseContentPrettyId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeContentPrettyId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentremoveContentPrettyIdReq):Response /*returnType = MResponseContentPrettyId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeContentPrettyId(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeContentPrettyId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeContentPrettyId)
	    }
	} 

	@GET
	@Path("/removeContentPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeContentPrettyId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentPrettyId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeContentPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentremoveContentPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeContentPrettyId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeContentPrettyId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeContentPrettyId(tokenId: String, param: MContentremoveContentPrettyIdReq) :MResponseContentPrettyId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeContentPrettyId: String

	/**
	 * add a new prettyId to the content for the given locale.
	 * @param tokenId : String
	 * @param param : MContentaddContentPrettyIdReq
	 * @return MResponseContentPrettyId
	*/
	@POST
	@Path("/addContentPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addContentPrettyId", notes = """add a new prettyId to the content for the given locale.""", response = classOf[MResponseContentPrettyId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addContentPrettyId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentaddContentPrettyIdReq):Response /*returnType = MResponseContentPrettyId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addContentPrettyId(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addContentPrettyId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addContentPrettyId)
	    }
	} 

	@GET
	@Path("/addContentPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addContentPrettyId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentPrettyId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addContentPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentaddContentPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addContentPrettyId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addContentPrettyId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addContentPrettyId(tokenId: String, param: MContentaddContentPrettyIdReq) :MResponseContentPrettyId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addContentPrettyId: String

	/**
	 * Verify whether a content prettyId is valid for a specific locale or not, and eventually suggest an
	 * alternative.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentverifyContentPrettyIdReq
	 * @return MResponseContentVerifyPrettyId
	*/
	@POST
	@Path("/verifyContentPrettyId/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/verifyContentPrettyId", notes = """Verify whether a content prettyId is valid for a specific locale or not, and eventually suggest an alternative.""", response = classOf[MResponseContentVerifyPrettyId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def verifyContentPrettyId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MContentverifyContentPrettyIdReq):Response /*returnType = MResponseContentVerifyPrettyId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__verifyContentPrettyId(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_verifyContentPrettyId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_verifyContentPrettyId)
	    }
	} 

	@GET
	@Path("/verifyContentPrettyId/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def verifyContentPrettyId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentVerifyPrettyId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__verifyContentPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MContentverifyContentPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_verifyContentPrettyId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_verifyContentPrettyId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __verifyContentPrettyId(tokenId: String, clientId: String, param: MContentverifyContentPrettyIdReq) :MResponseContentVerifyPrettyId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_verifyContentPrettyId: String

	/**
	 * Add a new element to the list of linkedContents.
	 * The linkedContens list is used to store the full list of links between contents (like playlist
	 * items, recommended contents or downloadable contents). For this reason it is necessary to specify
	 * the relation linkType.
	 * Constraints on linkType and ContentType.
	 * 
	 * * RECOMMENDED link is available only for VIDEO/AUDIO/IMAGE/OTHER/PLAYLIST contents
	 * * DOWNLOADABLE link is available only for VIDEO/AUDIO/IMAGE/OTHER contents
	 * * Only linkable contents can be added to another content (contens without property UNLINKABLE)
	 * 
	 * 
	 * 
	 * 
	 * @param tokenId : String
	 * @param param : MContentaddLinkedContentReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/addLinkedContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addLinkedContent", notes = """Add a new element to the list of linkedContents. 
	//#SWGNL#The linkedContens list is used to store the full list of links between contents (like playlist items, recommended contents or downloadable contents). For this reason it is necessary to specify the relation linkType.
	//#SWGNL#Constraints on linkType and ContentType.
	//#SWGNL#
	//#SWGNL#* RECOMMENDED link is available only for VIDEO/AUDIO/IMAGE/OTHER/PLAYLIST contents
	//#SWGNL#* DOWNLOADABLE link is available only for VIDEO/AUDIO/IMAGE/OTHER contents
	//#SWGNL#* Only linkable contents can be added to another content (contens without property UNLINKABLE)
	//#SWGNL#
	//#SWGNL#
	//#SWGNL#
	//#SWGNL#	""", response = classOf[MResponseContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addLinkedContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentaddLinkedContentReq):Response /*returnType = MResponseContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addLinkedContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addLinkedContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addLinkedContent)
	    }
	} 

	@GET
	@Path("/addLinkedContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addLinkedContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addLinkedContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentaddLinkedContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addLinkedContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addLinkedContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addLinkedContent(tokenId: String, param: MContentaddLinkedContentReq) :MResponseContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addLinkedContent: String

	/**
	 * Add a list of new element to the list of linkedContents.
	 * The linkedContens list is used to store the full list of links between contents (like playlist
	 * items, recommended contents or downloadable contents). For this reason it is necessary to specify
	 * the relation linkType.
	 * Only linkable contents can be added to another content (contens without property UNLINKABLE)
	 * @param tokenId : String
	 * @param param : MContentaddLinkedContentsReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/addLinkedContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addLinkedContents", notes = """Add a list of new element to the list of linkedContents. 
	//#SWGNL#The linkedContens list is used to store the full list of links between contents (like playlist items, recommended contents or downloadable contents). For this reason it is necessary to specify the relation linkType.
	//#SWGNL#Only linkable contents can be added to another content (contens without property UNLINKABLE)""", response = classOf[MResponseContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addLinkedContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentaddLinkedContentsReq):Response /*returnType = MResponseContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addLinkedContents(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addLinkedContents)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addLinkedContents)
	    }
	} 

	@GET
	@Path("/addLinkedContents")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addLinkedContents_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addLinkedContents(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentaddLinkedContentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addLinkedContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addLinkedContents)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addLinkedContents(tokenId: String, param: MContentaddLinkedContentsReq) :MResponseContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addLinkedContents: String

	/**
	 * this service move a content in the linkedContents list from position "oldPosition" to "newPosition".
	 * @param tokenId : String
	 * @param param : MContentmoveLinkedContentReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/moveLinkedContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/moveLinkedContent", notes = """this service move a content in the linkedContents list from position "oldPosition" to "newPosition".""", response = classOf[MResponseContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def moveLinkedContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentmoveLinkedContentReq):Response /*returnType = MResponseContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__moveLinkedContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_moveLinkedContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_moveLinkedContent)
	    }
	} 

	@GET
	@Path("/moveLinkedContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def moveLinkedContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__moveLinkedContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentmoveLinkedContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_moveLinkedContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_moveLinkedContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __moveLinkedContent(tokenId: String, param: MContentmoveLinkedContentReq) :MResponseContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_moveLinkedContent: String

	/**
	 * the function removes from the list of linked Contents the elements matching the criteria
	 * @param tokenId : String
	 * @param param : MContentremoveLinkedContentsReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/removeLinkedContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeLinkedContents", notes = """the function removes from the list of linked Contents the elements matching the criteria""", response = classOf[MResponseContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeLinkedContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentremoveLinkedContentsReq):Response /*returnType = MResponseContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeLinkedContents(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeLinkedContents)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeLinkedContents)
	    }
	} 

	@GET
	@Path("/removeLinkedContents")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeLinkedContents_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeLinkedContents(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentremoveLinkedContentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeLinkedContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeLinkedContents)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeLinkedContents(tokenId: String, param: MContentremoveLinkedContentsReq) :MResponseContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeLinkedContents: String

	/**
	 * used to mark if a content has been read or not by a user (the user who call the service)
	 * @param tokenId : String
	 * @param param : MContentupdateUserSpecificValuesReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/updateUserSpecificValues")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateUserSpecificValues", notes = """used to mark if a content has been read or not by a user (the user who call the service)""", response = classOf[MResponseContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateUserSpecificValues(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentupdateUserSpecificValuesReq):Response /*returnType = MResponseContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateUserSpecificValues(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateUserSpecificValues)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateUserSpecificValues)
	    }
	} 

	@GET
	@Path("/updateUserSpecificValues")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateUserSpecificValues_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateUserSpecificValues(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdateUserSpecificValuesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateUserSpecificValues)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateUserSpecificValues)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateUserSpecificValues(tokenId: String, param: MContentupdateUserSpecificValuesReq) :MResponseContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateUserSpecificValues: String

}