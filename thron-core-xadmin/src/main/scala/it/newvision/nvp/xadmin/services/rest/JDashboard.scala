package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.utils.MResponseGetQuotaUsage
import it.newvision.nvp.xadmin.services.model.request.MDashboardgetQuotaUsageByUsersReq
import it.newvision.nvp.xadmin.services.model.utils.MResponseDashboard
import it.newvision.nvp.xadmin.services.model.request.MDashboardchangeContentsOwnerReq
import it.newvision.nvp.xadmin.services.model.request.MDashboardmigrateUserStuffReq
import it.newvision.nvp.xadmin.services.model.request.MDashboardreplaceSourceFilesReq
import it.newvision.nvp.xadmin.services.model.request.MDashboardresetUserPreferencesReq
import it.newvision.nvp.xadmin.services.model.request.MDashboardpropagateAclToSubCategoriesReq
import it.newvision.nvp.xadmin.services.model.utils.MResponseContentRemoved
import it.newvision.nvp.xadmin.services.model.request.MDashboardtrashContentReq
import it.newvision.nvp.xadmin.services.model.request.MDashboarduntrashContentReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Utility service for the Platform Dashboard.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xadmin/resources/dashboard  </li>
 * </ul>
 */
@Path("/dashboard")
//#SWG#@Api(value = "/dashboard", description = """Utility service for the Platform Dashboard.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xadmin/resources/dashboard  </li>
//#SWGNL#</ul>""")
trait JDashboard extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * The service:
	 * <ul>
	 * 	<li>download the last source file linked to the MediaContent (MMediaContent.sourceFiles)</li>
	 * </ul>
	 * <ul>
	 * 	<li>return an error if the there are no source files or the file is not ready.</li>
	 * </ul>
	 * 
	 * The operation can be invoked only by the users with full permission on the content.
	 * @param tokenId_q : String
	 * @param tokenId_h : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional. Only for audit
	 * @param saveAs : String
	 * Optional.A query string parameter that allows content-disposition to be overridden
	 * @return javax.ws.rs.core.Response
	*/
	@GET
	                @Path("downloadSourceFile")
	                @Produces(Array("*/*"))
	def downloadSourceFile(tokenId_q: String, 
			tokenId_h: String, 
			clientId: String, 
			xcontentId: String, 
			saveAs: String):javax.ws.rs.core.Response 

	 


	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 

	protected def capability_downloadSourceFile: String

	/**
	 * Deprecated.
	 * @param tokenId : String
	 * @param param : MDashboardgetQuotaUsageByUsersReq
	 * @return MResponseGetQuotaUsage
	*/
	@POST
	@Path("/getQuotaUsageByUsers")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getQuotaUsageByUsers", notes = """Deprecated.""", response = classOf[MResponseGetQuotaUsage])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getQuotaUsageByUsers(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboardgetQuotaUsageByUsersReq):Response /*returnType = MResponseGetQuotaUsage*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getQuotaUsageByUsers(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getQuotaUsageByUsers)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getQuotaUsageByUsers)
	    }
	} 

	@GET
	@Path("/getQuotaUsageByUsers")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getQuotaUsageByUsers_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetQuotaUsage*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getQuotaUsageByUsers(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboardgetQuotaUsageByUsersReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getQuotaUsageByUsers)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getQuotaUsageByUsers)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getQuotaUsageByUsers(tokenId: String, param: MDashboardgetQuotaUsageByUsersReq) :MResponseGetQuotaUsage
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getQuotaUsageByUsers: String

	/**
	 * The service change the owner for a given list of contents.
	 * @param tokenId : String
	 * @param param : MDashboardchangeContentsOwnerReq
	 * @return MResponseDashboard
	*/
	@POST
	@Path("/changeContentsOwner")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/changeContentsOwner", notes = """The service change the owner for a given list of contents.""", response = classOf[MResponseDashboard])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def changeContentsOwner(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboardchangeContentsOwnerReq):Response /*returnType = MResponseDashboard*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__changeContentsOwner(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_changeContentsOwner)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_changeContentsOwner)
	    }
	} 

	@GET
	@Path("/changeContentsOwner")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def changeContentsOwner_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDashboard*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__changeContentsOwner(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboardchangeContentsOwnerReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_changeContentsOwner)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_changeContentsOwner)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __changeContentsOwner(tokenId: String, param: MDashboardchangeContentsOwnerReq) :MResponseDashboard
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_changeContentsOwner: String

	/**
	 * This service is used to migrate:
	 * <ul>
	 * 	<li>owned contents </li>
	 * 	<li>owned public categories</li>
	 * 	<li>owned repository files</li>
	 * </ul>
	 * Should be used when a user is removed and the contents should be assigned to another user.
	 * 
	 * The service also remove
	 * <ul>
	 * 	<li>all links to the userId1 private folders </li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MDashboardmigrateUserStuffReq
	 * @return MResponseDashboard
	*/
	@POST
	@Path("/migrateUserStuff")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/migrateUserStuff", notes = """This service is used to migrate:
	//#SWGNL#<ul>
	//#SWGNL#	<li>owned contents </li>
	//#SWGNL#	<li>owned public categories</li>
	//#SWGNL#	<li>owned repository files</li>
	//#SWGNL#</ul>
	//#SWGNL#Should be used when a user is removed and the contents should be assigned to another user. 
	//#SWGNL#
	//#SWGNL#The service also remove 
	//#SWGNL#<ul>
	//#SWGNL#	<li>all links to the userId1 private folders </li>
	//#SWGNL#</ul>""", response = classOf[MResponseDashboard])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def migrateUserStuff(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboardmigrateUserStuffReq):Response /*returnType = MResponseDashboard*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__migrateUserStuff(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_migrateUserStuff)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_migrateUserStuff)
	    }
	} 

	@GET
	@Path("/migrateUserStuff")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def migrateUserStuff_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDashboard*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__migrateUserStuff(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboardmigrateUserStuffReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_migrateUserStuff)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_migrateUserStuff)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __migrateUserStuff(tokenId: String, param: MDashboardmigrateUserStuffReq) :MResponseDashboard
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_migrateUserStuff: String

	/**
	 * The service:
	 * <ul>
	 * 	<li>replace the source file linked to the MediaContent (MMediaContent.sourceFiles)</li>
	 * </ul>
	 * <ul>
	 * 	<li>republish the content in all channels with status PUBLISHED or ERROR.</li>
	 * </ul>
	 * <ul>
	 * 	<li>remove the old files (all sourceFiles versions) from repository if removeOriginalFiles
	 * parameter is TRUE</li>
	 * </ul>
	 * <ul>
	 * 	<li>keep a version of the original source file (saved as link in MMediaContent.
	 * sourceFilesOldVersion) if removeOriginalFiles parameter is set to FALSE</li>
	 * </ul>
	 * <ul>
	 * 	<li>reset the user preferences of the content (the content becomes new for all users)</li>
	 * </ul>
	 * <ul>
	 * 	<li>return and error if the content has some channel in progress.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MDashboardreplaceSourceFilesReq
	 * @return MResponseDashboard
	*/
	@POST
	@Path("/replaceSourceFiles")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/replaceSourceFiles", notes = """The service:
	//#SWGNL#<ul>
	//#SWGNL#	<li>replace the source file linked to the MediaContent (MMediaContent.sourceFiles)</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>republish the content in all channels with status PUBLISHED or ERROR.</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>remove the old files (all sourceFiles versions) from repository if removeOriginalFiles  parameter is TRUE</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>keep a version of the original source file (saved as link in MMediaContent.sourceFilesOldVersion) if removeOriginalFiles parameter is set to FALSE</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>reset the user preferences of the content (the content becomes new for all users)</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>return and error if the content has some channel in progress.</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDashboard])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def replaceSourceFiles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboardreplaceSourceFilesReq):Response /*returnType = MResponseDashboard*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__replaceSourceFiles(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_replaceSourceFiles)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_replaceSourceFiles)
	    }
	} 

	@GET
	@Path("/replaceSourceFiles")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def replaceSourceFiles_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDashboard*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__replaceSourceFiles(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboardreplaceSourceFilesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_replaceSourceFiles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_replaceSourceFiles)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __replaceSourceFiles(tokenId: String, param: MDashboardreplaceSourceFilesReq) :MResponseDashboard
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_replaceSourceFiles: String

	/**
	 * The service remove all user preferences from the specific content
	 * @param tokenId : String
	 * @param param : MDashboardresetUserPreferencesReq
	 * @return MResponseDashboard
	*/
	@POST
	@Path("/resetUserPreferences")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/resetUserPreferences", notes = """The service remove all user preferences from the specific content""", response = classOf[MResponseDashboard])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def resetUserPreferences(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboardresetUserPreferencesReq):Response /*returnType = MResponseDashboard*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__resetUserPreferences(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_resetUserPreferences)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_resetUserPreferences)
	    }
	} 

	@GET
	@Path("/resetUserPreferences")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def resetUserPreferences_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDashboard*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__resetUserPreferences(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboardresetUserPreferencesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_resetUserPreferences)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_resetUserPreferences)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __resetUserPreferences(tokenId: String, param: MDashboardresetUserPreferencesReq) :MResponseDashboard
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_resetUserPreferences: String

	/**
	 * Deprecated by applyAcl service
	 * @param tokenId : String
	 * @param param : MDashboardpropagateAclToSubCategoriesReq
	 * @return MResponseDashboard
	*/
	@POST
	@Path("/propagateAclToSubCategories")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/propagateAclToSubCategories", notes = """Deprecated by applyAcl service""", response = classOf[MResponseDashboard])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def propagateAclToSubCategories(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboardpropagateAclToSubCategoriesReq):Response /*returnType = MResponseDashboard*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__propagateAclToSubCategories(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_propagateAclToSubCategories)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_propagateAclToSubCategories)
	    }
	} 

	@GET
	@Path("/propagateAclToSubCategories")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def propagateAclToSubCategories_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDashboard*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__propagateAclToSubCategories(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboardpropagateAclToSubCategoriesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_propagateAclToSubCategories)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_propagateAclToSubCategories)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __propagateAclToSubCategories(tokenId: String, param: MDashboardpropagateAclToSubCategoriesReq) :MResponseDashboard
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_propagateAclToSubCategories: String

	/**
	 * move a content in TRASH category. The content is still published in CDN and can be recovered using
	 * the service untrashContent.
	 * 
	 * The service remove also:
	 * <ul>
	 * 	<li>the contents from the linked categories</li>
	 * 	<li>cleanup the ACL specific of the content</li>
	 * 	<li>all linked embed codes.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MDashboardtrashContentReq
	 * @return MResponseContentRemoved
	*/
	@POST
	@Path("/trashContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/trashContent", notes = """move a content in TRASH category. The content is still published in CDN and can be recovered using the service untrashContent.
	//#SWGNL#
	//#SWGNL#The service remove also:
	//#SWGNL#<ul>
	//#SWGNL#	<li>the contents from the linked categories</li>
	//#SWGNL#	<li>cleanup the ACL specific of the content</li>
	//#SWGNL#	<li>all linked embed codes.</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentRemoved])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def trashContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboardtrashContentReq):Response /*returnType = MResponseContentRemoved*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__trashContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_trashContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_trashContent)
	    }
	} 

	@GET
	@Path("/trashContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def trashContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentRemoved*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__trashContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboardtrashContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_trashContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_trashContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __trashContent(tokenId: String, param: MDashboardtrashContentReq) :MResponseContentRemoved
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_trashContent: String

	/**
	 * Used to recover a trashContent operation.
	 * The service restore the content in the owner's INBOX. 
	 * @param tokenId : String
	 * @param param : MDashboarduntrashContentReq
	 * @return MResponseContentRemoved
	*/
	@POST
	@Path("/untrashContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/untrashContent", notes = """Used to recover a trashContent operation. 
	//#SWGNL#The service restore the content in the owner's INBOX. """, response = classOf[MResponseContentRemoved])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def untrashContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboarduntrashContentReq):Response /*returnType = MResponseContentRemoved*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__untrashContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_untrashContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_untrashContent)
	    }
	} 

	@GET
	@Path("/untrashContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def untrashContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentRemoved*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__untrashContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboarduntrashContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_untrashContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_untrashContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __untrashContent(tokenId: String, param: MDashboarduntrashContentReq) :MResponseContentRemoved
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_untrashContent: String

}