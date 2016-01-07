package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.adminconsole.MResponsePreviewContents
import it.newvision.nvp.xadmin.services.model.request.MAdminConsolegetPreviewListReq
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseTouchFile
import it.newvision.nvp.xadmin.services.model.request.MAdminConsoletouchFileInRepositoryReq
import it.newvision.nvp.xadmin.services.model.adminconsole.MResponseFilesLinkedToMediaContent
import it.newvision.nvp.xadmin.services.model.request.MAdminConsolemediaContentsLinkedToFileReq
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseMediaContent
import it.newvision.nvp.xadmin.services.model.request.MAdminConsoleupdateFileInRepositoryReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Handle all service necessary to the admin console and to handle the publication
 * process.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>WADL REST service: http://clientId-view.4me.
 * it/api/adxadmin/resources/application.wadl</li>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/adxadmin/resources/adminconsole/</li>
 * </ul>
 */
@Path("/adminconsole")
//#SWG#@Api(value = "/adminconsole", description = """Handle all service necessary to the admin console and to handle the publication process.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>WADL REST service: http://clientId-view.4me.it/api/adxadmin/resources/application.wadl</li>
//#SWGNL#	<li>REST service: http://clientId-view.4me.it/api/adxadmin/resources/adminconsole/</li>
//#SWGNL#</ul>""")
trait JAdminConsole extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Get le list of files available for preview and moderation.
	 * The user have to specify the mediaContentId used during the publishing process.
	 * The list of contents is based on the packaging folder
	 * @param tokenId : String
	 * @param param : MAdminConsolegetPreviewListReq
	 * @return MResponsePreviewContents
	*/
	@POST
	@Path("/getPreviewList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getPreviewList", notes = """Get le list of files available for preview and moderation.
	//#SWGNL#The user have to specify the mediaContentId used during the publishing process.
	//#SWGNL#The list of contents is based on the packaging folder""", response = classOf[MResponsePreviewContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getPreviewList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAdminConsolegetPreviewListReq):Response /*returnType = MResponsePreviewContents*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getPreviewList(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getPreviewList)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getPreviewList)
	    }
	} 

	@GET
	@Path("/getPreviewList")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getPreviewList_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePreviewContents*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getPreviewList(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAdminConsolegetPreviewListReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getPreviewList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getPreviewList)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getPreviewList(tokenId: String, param: MAdminConsolegetPreviewListReq) :MResponsePreviewContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getPreviewList: String

	/**
	 * DO NOT USE.
	 * this service is used to create a new empty file in the working area of the specified clientId with
	 * the right privileges. Used by the web upload service of the administration console with zk.
	 * @param tokenId : String
	 * @param param : MAdminConsoletouchFileInRepositoryReq
	 * @return MResponseTouchFile
	*/
	@POST
	@Path("/touchFileInRepository")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/touchFileInRepository", notes = """DO NOT USE.
	//#SWGNL#this service is used to create a new empty file in the working area of the specified clientId with the right privileges. Used by the web upload service of the administration console with zk.""", response = classOf[MResponseTouchFile])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def touchFileInRepository(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAdminConsoletouchFileInRepositoryReq):Response /*returnType = MResponseTouchFile*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__touchFileInRepository(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_touchFileInRepository)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_touchFileInRepository)
	    }
	} 

	@GET
	@Path("/touchFileInRepository")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def touchFileInRepository_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseTouchFile*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__touchFileInRepository(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAdminConsoletouchFileInRepositoryReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_touchFileInRepository)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_touchFileInRepository)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __touchFileInRepository(tokenId: String, param: MAdminConsoletouchFileInRepositoryReq) :MResponseTouchFile
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_touchFileInRepository: String

	/**
	 * the service (given a files from the working area) return a list of mediaContents that use the file.
	 * 
	 * This service is useful to know which files in the working area have been published or are in
	 * progress, and which files are not.
	 * @param tokenId : String
	 * @param param : MAdminConsolemediaContentsLinkedToFileReq
	 * @return MResponseFilesLinkedToMediaContent
	*/
	@POST
	@Path("/mediaContentsLinkedToFile")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/mediaContentsLinkedToFile", notes = """the service (given a files from the working area) return a list of mediaContents that use the file.
	//#SWGNL#This service is useful to know which files in the working area have been published or are in progress, and which files are not.""", response = classOf[MResponseFilesLinkedToMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def mediaContentsLinkedToFile(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAdminConsolemediaContentsLinkedToFileReq):Response /*returnType = MResponseFilesLinkedToMediaContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__mediaContentsLinkedToFile(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_mediaContentsLinkedToFile)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_mediaContentsLinkedToFile)
	    }
	} 

	@GET
	@Path("/mediaContentsLinkedToFile")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def mediaContentsLinkedToFile_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFilesLinkedToMediaContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__mediaContentsLinkedToFile(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAdminConsolemediaContentsLinkedToFileReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_mediaContentsLinkedToFile)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_mediaContentsLinkedToFile)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __mediaContentsLinkedToFile(tokenId: String, param: MAdminConsolemediaContentsLinkedToFileReq) :MResponseFilesLinkedToMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_mediaContentsLinkedToFile: String

	/**
	 * used to update the MFile information in repository.
	 * @param tokenId : String
	 * @param param : MAdminConsoleupdateFileInRepositoryReq
	 * @return MResponseMediaContent
	*/
	@POST
	@Path("/updateFileInRepository")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateFileInRepository", notes = """used to update the MFile information in repository.""", response = classOf[MResponseMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateFileInRepository(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAdminConsoleupdateFileInRepositoryReq):Response /*returnType = MResponseMediaContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateFileInRepository(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateFileInRepository)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateFileInRepository)
	    }
	} 

	@GET
	@Path("/updateFileInRepository")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateFileInRepository_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMediaContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateFileInRepository(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAdminConsoleupdateFileInRepositoryReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateFileInRepository)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateFileInRepository)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateFileInRepository(tokenId: String, param: MAdminConsoleupdateFileInRepositoryReq) :MResponseMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateFileInRepository: String

}