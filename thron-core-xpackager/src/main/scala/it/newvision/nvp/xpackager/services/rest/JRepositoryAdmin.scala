package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xpackager.services.model.repository.MResponseRepository
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdminupdateFileStatusReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseFilesToBackup
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdmingetFilesToBackupReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseFilesToCleanUp
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdmingetFilesToCleanUpReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseFindFilesByProperties
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdmingetFilesToFixReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseFilesToPurge
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdmingetFilesToPurgeReq
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdmincleanupFilesOnSiteReq
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdminpurgeFilesReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseFilesRestored
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdminrestoreFilesReq
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdminfindFilesByPropertiesReq
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdminmigrateClientRepositoryReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Private service used to update the repository.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/adxpackager/resources/repositoryadmin/  </li>
 * </ul>
 */
@Path("/repositoryadmin")
//#SWG#@Api(value = "/repositoryadmin", description = """Private service used to update the repository.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.4me.it/api/adxpackager/resources/repositoryadmin/  </li>
//#SWGNL#</ul>""")
trait JRepositoryAdmin extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Used by bakupscript to update the file status once the backup has been completed. update the status
	 * of the file in database.
	 * The backupscript upload the new files stored in a main site with the backup sites (S3...)
	 * @param tokenId : String
	 * @param param : MRepositoryAdminupdateFileStatusReq
	 * @return MResponseRepository
	*/
	@POST
	@Path("/updateFileStatus")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateFileStatus", notes = """Used by bakupscript to update the file status once the backup has been completed. update the status of the file in database.
	//#SWGNL#The backupscript upload the new files stored in a main site with the backup sites (S3...)""", response = classOf[MResponseRepository])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateFileStatus(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdminupdateFileStatusReq):Response /*returnType = MResponseRepository*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateFileStatus(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateFileStatus)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateFileStatus)
	    }
	} 

	@GET
	@Path("/updateFileStatus")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateFileStatus_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRepository*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateFileStatus",this._getCacheControl) 
		try{
			val resp = this.__updateFileStatus(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdminupdateFileStatusReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateFileStatus)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateFileStatus)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateFileStatus(tokenId: String, param: MRepositoryAdminupdateFileStatusReq) :MResponseRepository
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateFileStatus: String

	/**
	 * This service is used by backup script. return the list of files to upload in the backup sites.
	 * @param tokenId : String
	 * @param param : MRepositoryAdmingetFilesToBackupReq
	 * @return MResponseFilesToBackup
	*/
	@POST
	@Path("/getFilesToBackup")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getFilesToBackup", notes = """This service is used by backup script. return the list of files to upload in the backup sites.""", response = classOf[MResponseFilesToBackup])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getFilesToBackup(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdmingetFilesToBackupReq):Response /*returnType = MResponseFilesToBackup*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getFilesToBackup(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getFilesToBackup)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getFilesToBackup)
	    }
	} 

	@GET
	@Path("/getFilesToBackup")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getFilesToBackup_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFilesToBackup*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("getFilesToBackup",this._getCacheControl) 
		try{
			val resp = this.__getFilesToBackup(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdmingetFilesToBackupReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getFilesToBackup)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getFilesToBackup)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getFilesToBackup(tokenId: String, param: MRepositoryAdmingetFilesToBackupReq) :MResponseFilesToBackup
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getFilesToBackup: String

	/**
	 * This service is used by backup script. return the list of files present in the site working area
	 * that could be clean up. The master sites use the working repository area as temporary cache storage.
	 * @param tokenId : String
	 * @param param : MRepositoryAdmingetFilesToCleanUpReq
	 * @return MResponseFilesToCleanUp
	*/
	@POST
	@Path("/getFilesToCleanUp")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getFilesToCleanUp", notes = """This service is used by backup script. return the list of files present in the site working area that could be clean up. The master sites use the working repository area as temporary cache storage.""", response = classOf[MResponseFilesToCleanUp])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getFilesToCleanUp(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdmingetFilesToCleanUpReq):Response /*returnType = MResponseFilesToCleanUp*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getFilesToCleanUp(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getFilesToCleanUp)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getFilesToCleanUp)
	    }
	} 

	@GET
	@Path("/getFilesToCleanUp")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getFilesToCleanUp_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFilesToCleanUp*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("getFilesToCleanUp",this._getCacheControl) 
		try{
			val resp = this.__getFilesToCleanUp(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdmingetFilesToCleanUpReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getFilesToCleanUp)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getFilesToCleanUp)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getFilesToCleanUp(tokenId: String, param: MRepositoryAdmingetFilesToCleanUpReq) :MResponseFilesToCleanUp
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getFilesToCleanUp: String

	/**
	 * This service is used by backup script. return the list of files present in the site working area
	 * that could be fixed (pending in download for a long time).
	 * @param tokenId : String
	 * @param param : MRepositoryAdmingetFilesToFixReq
	 * @return MResponseFindFilesByProperties
	*/
	@POST
	@Path("/getFilesToFix")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getFilesToFix", notes = """This service is used by backup script. return the list of files present in the site working area that could be fixed (pending in download for a long time).""", response = classOf[MResponseFindFilesByProperties])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getFilesToFix(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdmingetFilesToFixReq):Response /*returnType = MResponseFindFilesByProperties*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getFilesToFix(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getFilesToFix)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getFilesToFix)
	    }
	} 

	@GET
	@Path("/getFilesToFix")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getFilesToFix_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFindFilesByProperties*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("getFilesToFix",this._getCacheControl) 
		try{
			val resp = this.__getFilesToFix(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdmingetFilesToFixReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getFilesToFix)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getFilesToFix)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getFilesToFix(tokenId: String, param: MRepositoryAdmingetFilesToFixReq) :MResponseFindFilesByProperties
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getFilesToFix: String

	/**
	 * This service is used by purge script. return the list of files removed but in "safeArea" that
	 * should be definitely removed from the platform. Return only the removed files with removeDate older
	 * than retention time.
	 * @param tokenId : String
	 * @param param : MRepositoryAdmingetFilesToPurgeReq
	 * @return MResponseFilesToPurge
	*/
	@POST
	@Path("/getFilesToPurge")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getFilesToPurge", notes = """This service is used by purge script. return the list of files removed but in "safeArea" that should be definitely removed from the platform. Return only the removed files with removeDate older than retention time.""", response = classOf[MResponseFilesToPurge])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getFilesToPurge(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdmingetFilesToPurgeReq):Response /*returnType = MResponseFilesToPurge*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getFilesToPurge(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getFilesToPurge)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getFilesToPurge)
	    }
	} 

	@GET
	@Path("/getFilesToPurge")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getFilesToPurge_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFilesToPurge*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("getFilesToPurge",this._getCacheControl) 
		try{
			val resp = this.__getFilesToPurge(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdmingetFilesToPurgeReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getFilesToPurge)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getFilesToPurge)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getFilesToPurge(tokenId: String, param: MRepositoryAdmingetFilesToPurgeReq) :MResponseFilesToPurge
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getFilesToPurge: String

	/**
	 * @param tokenId : String
	 * @param param : MRepositoryAdmincleanupFilesOnSiteReq
	 * @return MResponseRepository
	*/
	@POST
	@Path("/cleanupFilesOnSite")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/cleanupFilesOnSite", notes = """""", response = classOf[MResponseRepository])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def cleanupFilesOnSite(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdmincleanupFilesOnSiteReq):Response /*returnType = MResponseRepository*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__cleanupFilesOnSite(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_cleanupFilesOnSite)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_cleanupFilesOnSite)
	    }
	} 

	@GET
	@Path("/cleanupFilesOnSite")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def cleanupFilesOnSite_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRepository*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("cleanupFilesOnSite",this._getCacheControl) 
		try{
			val resp = this.__cleanupFilesOnSite(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdmincleanupFilesOnSiteReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_cleanupFilesOnSite)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_cleanupFilesOnSite)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __cleanupFilesOnSite(tokenId: String, param: MRepositoryAdmincleanupFilesOnSiteReq) :MResponseRepository
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_cleanupFilesOnSite: String

	/**
	 * remove definitively from the platform the given list of files.
	 * Remove only the file if the file is marked as removed and removedDate later that the retention time.
	 * 
	 * The service doesn't log in Audit each single remove operation.
	 * @param tokenId : String
	 * @param param : MRepositoryAdminpurgeFilesReq
	 * @return MResponseRepository
	*/
	@POST
	@Path("/purgeFiles")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/purgeFiles", notes = """remove definitively from the platform the given list of files.
	//#SWGNL#Remove only the file if the file is marked as removed and removedDate later that the retention time.
	//#SWGNL#The service doesn't log in Audit each single remove operation.""", response = classOf[MResponseRepository])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def purgeFiles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdminpurgeFilesReq):Response /*returnType = MResponseRepository*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__purgeFiles(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_purgeFiles)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_purgeFiles)
	    }
	} 

	@GET
	@Path("/purgeFiles")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def purgeFiles_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRepository*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("purgeFiles",this._getCacheControl) 
		try{
			val resp = this.__purgeFiles(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdminpurgeFilesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_purgeFiles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_purgeFiles)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __purgeFiles(tokenId: String, param: MRepositoryAdminpurgeFilesReq) :MResponseRepository
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_purgeFiles: String

	/**
	 * try to recover the give list of files in repository.
	 * A file can be recovered if:
	 * * the file is stored in a safe repository (sites type BACKUP_REPO)
	 * * the file has not been purged (by maintenance services)
	 * @param tokenId : String
	 * @param param : MRepositoryAdminrestoreFilesReq
	 * @return MResponseFilesRestored
	*/
	@POST
	@Path("/restoreFiles")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/restoreFiles", notes = """try to recover the give list of files in repository. 
	//#SWGNL#A file can be recovered if:
	//#SWGNL#* the file is stored in a safe repository (sites type BACKUP_REPO)
	//#SWGNL#* the file has not been purged (by maintenance services)""", response = classOf[MResponseFilesRestored])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def restoreFiles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdminrestoreFilesReq):Response /*returnType = MResponseFilesRestored*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__restoreFiles(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_restoreFiles)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_restoreFiles)
	    }
	} 

	@GET
	@Path("/restoreFiles")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def restoreFiles_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFilesRestored*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("restoreFiles",this._getCacheControl) 
		try{
			val resp = this.__restoreFiles(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdminrestoreFilesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_restoreFiles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_restoreFiles)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __restoreFiles(tokenId: String, param: MRepositoryAdminrestoreFilesReq) :MResponseFilesRestored
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_restoreFiles: String

	/**
	 * return the list of all uploaded Files from the Working Area, using specific search criteria.
	 * The service use a specific orderBy parameter schema: <b>[orderbyFileds]_[A|D]</b>
	 * Available orderbyFileds are: fileName, siteName,totalSpace,modifiedDate,mimetype
	 * _A suffix means -> ascendant order
	 * _D suffix means -> descendant order
	 * @param tokenId : String
	 * @param param : MRepositoryAdminfindFilesByPropertiesReq
	 * @return MResponseFindFilesByProperties
	*/
	@POST
	@Path("/findFilesByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findFilesByProperties", notes = """return the list of all uploaded Files from the Working Area, using specific search criteria.
	//#SWGNL#The service use a specific orderBy parameter schema: <b>[orderbyFileds]_[A|D]</b>
	//#SWGNL#Available orderbyFileds are: fileName, siteName,totalSpace,modifiedDate,mimetype
	//#SWGNL#_A suffix means -> ascendant order
	//#SWGNL#_D suffix means -> descendant order""", response = classOf[MResponseFindFilesByProperties])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findFilesByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdminfindFilesByPropertiesReq):Response /*returnType = MResponseFindFilesByProperties*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findFilesByProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findFilesByProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findFilesByProperties)
	    }
	} 

	@GET
	@Path("/findFilesByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def findFilesByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFindFilesByProperties*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("findFilesByProperties",this._getCacheControl) 
		try{
			val resp = this.__findFilesByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdminfindFilesByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findFilesByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findFilesByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findFilesByProperties(tokenId: String, param: MRepositoryAdminfindFilesByPropertiesReq) :MResponseFindFilesByProperties
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findFilesByProperties: String

	/**
	 * migrate the source file in the right backup repository.
	 * Used to move all files from site_a to site_b and vice versa.
	 * @param tokenId : String
	 * @param param : MRepositoryAdminmigrateClientRepositoryReq
	 * @return MResponseRepository
	*/
	@POST
	@Path("/migrateClientRepository")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/migrateClientRepository", notes = """migrate the source file in the right backup repository. 
	//#SWGNL#Used to move all files from site_a to site_b and vice versa.""", response = classOf[MResponseRepository])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def migrateClientRepository(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryAdminmigrateClientRepositoryReq):Response /*returnType = MResponseRepository*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__migrateClientRepository(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_migrateClientRepository)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_migrateClientRepository)
	    }
	} 

	@GET
	@Path("/migrateClientRepository")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def migrateClientRepository_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRepository*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("migrateClientRepository",this._getCacheControl) 
		try{
			val resp = this.__migrateClientRepository(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryAdminmigrateClientRepositoryReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_migrateClientRepository)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_migrateClientRepository)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __migrateClientRepository(tokenId: String, param: MRepositoryAdminmigrateClientRepositoryReq) :MResponseRepository
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_migrateClientRepository: String

}