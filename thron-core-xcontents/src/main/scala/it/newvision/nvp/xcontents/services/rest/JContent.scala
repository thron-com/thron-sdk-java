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
import it.newvision.nvp.xcontents.services.model.request.MContentupdateContentReq
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
import it.newvision.nvp.xcontents.services.model.request.MContentaddExternalIdReq
import it.newvision.nvp.xcontents.services.model.request.MContentremoveExternalIdReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentVerifyExternalId
import it.newvision.nvp.xcontents.services.model.request.MContentverifyExternalIdReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to manage a Content. A Content is a generic object within the
 * platform, may contain multiple descriptions in different languages, be linked
 * to one or more categories, have tags and  be linked to other contents. A
 * content can be created only through the specific publishing process service in
 * xadmin component.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/content</li>
 * </ul>
 */
@Path("/content")
//#SWG#@Api(value = "/content", description = """Service used to manage a Content. A Content is a generic object within the platform, may contain multiple descriptions in different languages, be linked to one or more categories, have tags and  be linked to other contents. A content can be created only through the specific publishing process service in xadmin component.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/content</li>
//#SWGNL#</ul>""")
trait JContent extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Add localized name and description to a content.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentaddContent4LocaleReq
	 * @return MResponseContentAddLocale
	*/
	@POST
	@Path("/addContent4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addContent4Locale", notes = """Add localized name and description to a content.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentAddLocale])
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
		val cc = this.cachemap.getOrElse("addContent4Locale",this._getCacheControl) 
		try{
			val resp = this.__addContent4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentaddContent4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addContent4Locale)
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
	 * Returns content information:
	 * <ul>
	 * 	<li>metadata</li>
	 * 	<li>localized information</li>
	 * 	<li>linkedContents list</li>
	 * 	<li>tags</li>
	 * </ul>
	 * 
	 * if locale parameter is missing, the service returns all locales.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
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
	 * Optional. used to specify if the service should return the itags of the content
	 * @param returnImetadata : Boolean
	 * Optional. used to specify if the service should return the imetadata of the content
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @return MResponseContentDetail
	*/
	@GET
	@Path("/detail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """Returns content information:
	//#SWGNL#<ul>
	//#SWGNL#	<li>metadata</li>
	//#SWGNL#	<li>localized information</li>
	//#SWGNL#	<li>linkedContents list</li>
	//#SWGNL#	<li>tags</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#if locale parameter is missing, the service returns all locales.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.""", response = classOf[MResponseContentDetail])
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
			//#SWG#@ApiParam(value = """Optional. used to specify if the service should return the itags of the content""")
	@QueryParam("returnItags")
	returnItags: Boolean, 
			//#SWG#@ApiParam(value = """Optional. used to specify if the service should return the imetadata of the content""")
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
	 * Returns a list of contents matching provided criteria.
	 * @param tokenId : String
	 * @param param : MContentfindByPropertiesReq
	 * @return MResponseContentFindByProperties
	*/
	@POST
	@Path("/findByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findByProperties", notes = """Returns a list of contents matching provided criteria.""", response = classOf[MResponseContentFindByProperties])
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
		val cc = this.cachemap.getOrElse("findByProperties",this._getCacheControl) 
		try{
			val resp = this.__findByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentfindByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findByProperties)
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
	 * Removes localized name and description from a content.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * xcontentId or prettyId
	 * @param locale : String
	 * @return MResponseContentRemoveLocale
	*/
	@POST
	@Path("/removeContent4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/removeContent4Locale", notes = """Removes localized name and description from a content.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentRemoveLocale])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeContent4Locale(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """xcontentId or prettyId""")
	@FormParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("locale")
	locale: String):Response /*returnType = MResponseContentRemoveLocale*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeContent4Locale(tokenId,clientId,contentId,locale)
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
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentRemoveLocale*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeContent4Locale",this._getCacheControl) 
		try{	
			val resp = this.__removeContent4Locale(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,contentId_q,locale_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeContent4Locale)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeContent4Locale)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeContent4Locale(tokenId: String, clientId: String, contentId: String, locale: String) :MResponseContentRemoveLocale
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeContent4Locale: String

	/**
	 * Updates a content.
	 * The  "contentValues" field of this web service works in “patch" mode: it means that each and
	 * everyone of the "contentValues" attributes you want to change must be included in the body of the
	 * request, those not included will not be updated.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentupdateContentReq
	 * @return MResponseContentUpdate
	*/
	@POST
	@Path("/updateContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateContent", notes = """Updates a content.
	//#SWGNL#The  "contentValues" field of this web service works in “patch" mode: it means that each and everyone of the "contentValues" attributes you want to change must be included in the body of the request, those not included will not be updated.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentUpdate])
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
		val cc = this.cachemap.getOrElse("updateContent",this._getCacheControl) 
		try{
			val resp = this.__updateContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdateContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateContent)
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
	 * Updates localized name and description of a content.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentupdateContent4LocaleReq
	 * @return MResponseContentUpdateLocale
	*/
	@POST
	@Path("/updateContent4Locale")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateContent4Locale", notes = """Updates localized name and description of a content.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentUpdateLocale])
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
		val cc = this.cachemap.getOrElse("updateContent4Locale",this._getCacheControl) 
		try{
			val resp = this.__updateContent4Locale(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdateContent4LocaleReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateContent4Locale)
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
	 * Updates a localized prettyId of a content.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentupdateContentPrettyIdReq
	 * @return MResponseContentPrettyId
	*/
	@POST
	@Path("/updateContentPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateContentPrettyId", notes = """Updates a localized prettyId of a content.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentPrettyId])
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
		val cc = this.cachemap.getOrElse("updateContentPrettyId",this._getCacheControl) 
		try{
			val resp = this.__updateContentPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdateContentPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateContentPrettyId)
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
	 * Removes a localized prettyId from a content.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentremoveContentPrettyIdReq
	 * @return MResponseContentPrettyId
	*/
	@POST
	@Path("/removeContentPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeContentPrettyId", notes = """Removes a localized prettyId from a content.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentPrettyId])
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
		val cc = this.cachemap.getOrElse("removeContentPrettyId",this._getCacheControl) 
		try{
			val resp = this.__removeContentPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentremoveContentPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeContentPrettyId)
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
	 * Adds a localized prettyId to a content.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentaddContentPrettyIdReq
	 * @return MResponseContentPrettyId
	*/
	@POST
	@Path("/addContentPrettyId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addContentPrettyId", notes = """Adds a localized prettyId to a content.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentPrettyId])
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
		val cc = this.cachemap.getOrElse("addContentPrettyId",this._getCacheControl) 
		try{
			val resp = this.__addContentPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentaddContentPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addContentPrettyId)
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
		val cc = this.cachemap.getOrElse("verifyContentPrettyId",this._getCacheControl) 
		try{
			val resp = this.__verifyContentPrettyId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MContentverifyContentPrettyIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_verifyContentPrettyId)
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
	 * Adds a content to the linkedContents list of a content.
	 * The linkedContens list is used to store the full list of links between content (like playlist items,
	 * recommended content or downloadable content). For this reason it is necessary to specify the
	 * relation linkType.
	 * Constraints on linkType and contentType.
	 * 
	 * <ul>
	 * 	<li>RECOMMENDED link is available only for AUDIO, IMAGE, OTHER, PAGELET, PLAYLIST, URL, or VIDEO
	 * content.</li>
	 * 	<li>DOWNLOADABLE link is available only for AUDIO, IMAGE, OTHER, PAGELET, PLAYLIST, URL, or VIDEO
	 * contents</li>
	 * 	<li>Only linkable content can be added to another content (i.e., content without UNLINKABLE
	 * property)</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentaddLinkedContentReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/addLinkedContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addLinkedContent", notes = """Adds a content to the linkedContents list of a content.
	//#SWGNL#The linkedContens list is used to store the full list of links between content (like playlist items, recommended content or downloadable content). For this reason it is necessary to specify the relation linkType.
	//#SWGNL#Constraints on linkType and contentType.
	//#SWGNL#
	//#SWGNL#<ul>
	//#SWGNL#	<li>RECOMMENDED link is available only for AUDIO, IMAGE, OTHER, PAGELET, PLAYLIST, URL, or VIDEO content.</li>
	//#SWGNL#	<li>DOWNLOADABLE link is available only for AUDIO, IMAGE, OTHER, PAGELET, PLAYLIST, URL, or VIDEO contents</li>
	//#SWGNL#	<li>Only linkable content can be added to another content (i.e., content without UNLINKABLE property)</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContent])
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
		val cc = this.cachemap.getOrElse("addLinkedContent",this._getCacheControl) 
		try{
			val resp = this.__addLinkedContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentaddLinkedContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addLinkedContent)
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
	 * Adds a set of content to the linkedContents list of a content.
	 * The linkedContens list is used to store the full list of links between content (like playlist items,
	 * recommended content or downloadable content). For this reason it is necessary to specify the
	 * relation linkType.
	 * Only linkable content can be added to another content (i.e., content without UNLINKABLE property)
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentaddLinkedContentsReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/addLinkedContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addLinkedContents", notes = """Adds a set of content to the linkedContents list of a content.
	//#SWGNL#The linkedContens list is used to store the full list of links between content (like playlist items, recommended content or downloadable content). For this reason it is necessary to specify the relation linkType.
	//#SWGNL#Only linkable content can be added to another content (i.e., content without UNLINKABLE property)
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContent])
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
		val cc = this.cachemap.getOrElse("addLinkedContents",this._getCacheControl) 
		try{
			val resp = this.__addLinkedContents(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentaddLinkedContentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addLinkedContents)
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
	 * Moves a content among the linkedContents list of a content.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentmoveLinkedContentReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/moveLinkedContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/moveLinkedContent", notes = """Moves a content among the linkedContents list of a content.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContent])
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
		val cc = this.cachemap.getOrElse("moveLinkedContent",this._getCacheControl) 
		try{
			val resp = this.__moveLinkedContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentmoveLinkedContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_moveLinkedContent)
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
	 * Removes content matching provided criteria from the list linkedContents of a content.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentremoveLinkedContentsReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/removeLinkedContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeLinkedContents", notes = """Removes content matching provided criteria from the list linkedContents of a content.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContent])
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
		val cc = this.cachemap.getOrElse("removeLinkedContents",this._getCacheControl) 
		try{
			val resp = this.__removeLinkedContents(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentremoveLinkedContentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeLinkedContents)
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
	 * Marks whether or not a content has been read by a user (the service invoker)
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>SEE ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MContentupdateUserSpecificValuesReq
	 * @return MResponseContent
	*/
	@POST
	@Path("/updateUserSpecificValues")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateUserSpecificValues", notes = """Marks whether or not a content has been read by a user (the service invoker)
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>SEE ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContent])
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
		val cc = this.cachemap.getOrElse("updateUserSpecificValues",this._getCacheControl) 
		try{
			val resp = this.__updateUserSpecificValues(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentupdateUserSpecificValuesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateUserSpecificValues)
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

	/**
	 * Adds an externalId to a content.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max number of externalIds on a content: 100</li>
	 * </ul>
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param param : MContentaddExternalIdReq
	 * @return MResponseContentUpdate
	*/
	@POST
	@Path("/addExternalId/{clientId}/{contentId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addExternalId", notes = """Adds an externalId to a content.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max number of externalIds on a content: 100</li>
	//#SWGNL#</ul>
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addExternalId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("contentId")
	contentId: String, 
			param: MContentaddExternalIdReq):Response /*returnType = MResponseContentUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addExternalId(tokenId,clientId,contentId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addExternalId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addExternalId)
	    }
	} 

	@GET
	@Path("/addExternalId/{clientId}/{contentId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addExternalId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("contentId")
	contentId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addExternalId",this._getCacheControl) 
		try{
			val resp = this.__addExternalId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,contentId,PRestHelper.bindRequest[MContentaddExternalIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addExternalId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addExternalId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addExternalId(tokenId: String, clientId: String, contentId: String, param: MContentaddExternalIdReq) :MResponseContentUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addExternalId: String

	/**
	 * Removes an externalId from a content.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param param : MContentremoveExternalIdReq
	 * @return MResponseContentUpdate
	*/
	@POST
	@Path("/removeExternalId/{clientId}/{contentId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeExternalId", notes = """Removes an externalId from a content.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentUpdate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeExternalId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("contentId")
	contentId: String, 
			param: MContentremoveExternalIdReq):Response /*returnType = MResponseContentUpdate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeExternalId(tokenId,clientId,contentId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeExternalId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeExternalId)
	    }
	} 

	@GET
	@Path("/removeExternalId/{clientId}/{contentId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeExternalId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("contentId")
	contentId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentUpdate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeExternalId",this._getCacheControl) 
		try{
			val resp = this.__removeExternalId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,contentId,PRestHelper.bindRequest[MContentremoveExternalIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeExternalId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeExternalId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeExternalId(tokenId: String, clientId: String, contentId: String, param: MContentremoveExternalIdReq) :MResponseContentUpdate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeExternalId: String

	/**
	 * Verifies whether or not a content externalId is used in the platform.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentverifyExternalIdReq
	 * @return MResponseContentVerifyExternalId
	*/
	@POST
	@Path("/verifyExternalId/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/verifyExternalId", notes = """Verifies whether or not a content externalId is used in the platform.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentVerifyExternalId])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def verifyExternalId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MContentverifyExternalIdReq):Response /*returnType = MResponseContentVerifyExternalId*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__verifyExternalId(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_verifyExternalId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_verifyExternalId)
	    }
	} 

	@GET
	@Path("/verifyExternalId/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def verifyExternalId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentVerifyExternalId*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("verifyExternalId",this._getCacheControl) 
		try{
			val resp = this.__verifyExternalId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MContentverifyExternalIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_verifyExternalId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_verifyExternalId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __verifyExternalId(tokenId: String, clientId: String, param: MContentverifyExternalIdReq) :MResponseContentVerifyExternalId
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_verifyExternalId: String

}