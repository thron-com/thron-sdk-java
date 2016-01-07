package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xpackager.services.model.packager.MResponseRestartPackagingTask
import it.newvision.nvp.xpackager.services.model.request.MPackagerrestartPackagingTaskReq
import it.newvision.nvp.xpackager.services.model.packager.MResponseUpdateIngestionToPackage
import it.newvision.nvp.xpackager.services.model.request.MPackageraddIngestionToPackageReq
import it.newvision.nvp.xpackager.services.model.request.MPackagerremoveIngestionToPackageReq
import it.newvision.nvp.xpackager.services.model.packager.MResponseStartPackagingTask
import it.newvision.nvp.xpackager.services.model.request.MPackagerstartPackagingTaskReq
import it.newvision.nvp.xpackager.services.model.packager.MResponseStopPackagingTask
import it.newvision.nvp.xpackager.services.model.request.MPackagerstopPackagingTaskReq
import it.newvision.nvp.xpackager.services.model.packager.MResponseDeletePackagedFiles
import it.newvision.nvp.xpackager.services.model.request.MPackagerdeletePackagedFilesReq
import it.newvision.nvp.xpackager.services.model.packager.MResponsePackager
import it.newvision.nvp.xpackager.services.model.request.MPackagerremovePackagedThumbnailsReq
import it.newvision.nvp.xpackager.services.model.packager.MResponseGetPackagedFile
import it.newvision.nvp.xpackager.services.model.packager.MResponseGetPackagedFileList
import it.newvision.nvp.xpackager.services.model.packager.MResponseGetPackagedFilesForPreview
import it.newvision.nvp.xpackager.services.model.request.MPackagerinitPackagerReq
import it.newvision.nvp.xpackager.services.model.packager.MResponseCleanupOrphansPackagedFolders
import it.newvision.nvp.xpackager.services.model.request.MPackagercleanupOrphansPackagedFoldersReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Packager service through its functions manages the process of packaging content
 * to be sent to the publisher. Across the use of specific descriptors (defined in
 * the xsd schema) can be accurately defined the types of working task to do. The
 * Packager manage the process and save the worked contents in a special folder
 * storage, ready for the publisher.
 */
@Path("/packager")
//#SWG#@Api(value = "/packager", description = """Packager service through its functions manages the process of packaging content to be sent to the publisher. Across the use of specific descriptors (defined in the xsd schema) can be accurately defined the types of working task to do. The Packager manage the process and save the worked contents in a special folder storage, ready for the publisher.""")
trait JPackager extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Restart the packaging task, and if desired also the ingestion activity.
	 * @param tokenId : String
	 * @param param : MPackagerrestartPackagingTaskReq
	 * @return MResponseRestartPackagingTask
	*/
	@POST
	@Path("/restartPackagingTask")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/restartPackagingTask", notes = """Restart the packaging task, and if desired also the ingestion activity.""", response = classOf[MResponseRestartPackagingTask])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def restartPackagingTask(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPackagerrestartPackagingTaskReq):Response /*returnType = MResponseRestartPackagingTask*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__restartPackagingTask(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_restartPackagingTask)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_restartPackagingTask)
	    }
	} 

	@GET
	@Path("/restartPackagingTask")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def restartPackagingTask_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRestartPackagingTask*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__restartPackagingTask(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPackagerrestartPackagingTaskReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_restartPackagingTask)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_restartPackagingTask)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __restartPackagingTask(tokenId: String, param: MPackagerrestartPackagingTaskReq) :MResponseRestartPackagingTask
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_restartPackagingTask: String

	/**
	 * Add a new ingestion task to an already existing packaging task. This function allow to change the
	 * packaging activity and to add new ingestion to the packager. Particulary useful for vod packaging
	 * task where the user want to add new video ingestion with different bitrate.
	 * This service is also used to add a new thumbnail ingestion to an existing package, when the used
	 * desire to change the ingested thumbnail.
	 * @param tokenId : String
	 * @param param : MPackageraddIngestionToPackageReq
	 * @return MResponseUpdateIngestionToPackage
	*/
	@POST
	@Path("/addIngestionToPackage")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addIngestionToPackage", notes = """Add a new ingestion task to an already existing packaging task. This function allow to change the packaging activity and to add new ingestion to the packager. Particulary useful for vod packaging task where the user want to add new video ingestion with different bitrate.
	//#SWGNL#This service is also used to add a new thumbnail ingestion to an existing package, when the used desire to change the ingested thumbnail.""", response = classOf[MResponseUpdateIngestionToPackage])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addIngestionToPackage(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPackageraddIngestionToPackageReq):Response /*returnType = MResponseUpdateIngestionToPackage*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addIngestionToPackage(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addIngestionToPackage)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addIngestionToPackage)
	    }
	} 

	@GET
	@Path("/addIngestionToPackage")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addIngestionToPackage_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateIngestionToPackage*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addIngestionToPackage(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPackageraddIngestionToPackageReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addIngestionToPackage)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addIngestionToPackage)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addIngestionToPackage(tokenId: String, param: MPackageraddIngestionToPackageReq) :MResponseUpdateIngestionToPackage
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addIngestionToPackage: String

	/**
	 * Remove the ingestion descriptor record in Db and delete the file from FileSystem
	 * Allow to remove an ingestion activity from a packaging task, and to update the packaging content in
	 * the FS. This function can be used only with packaging descriptor with ingestion.
	 * @param tokenId : String
	 * @param param : MPackagerremoveIngestionToPackageReq
	 * @return MResponseUpdateIngestionToPackage
	*/
	@POST
	@Path("/removeIngestionToPackage")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeIngestionToPackage", notes = """Remove the ingestion descriptor record in Db and delete the file from FileSystem
	//#SWGNL#Allow to remove an ingestion activity from a packaging task, and to update the packaging content in the FS. This function can be used only with packaging descriptor with ingestion.""", response = classOf[MResponseUpdateIngestionToPackage])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeIngestionToPackage(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPackagerremoveIngestionToPackageReq):Response /*returnType = MResponseUpdateIngestionToPackage*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeIngestionToPackage(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeIngestionToPackage)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeIngestionToPackage)
	    }
	} 

	@GET
	@Path("/removeIngestionToPackage")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeIngestionToPackage_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateIngestionToPackage*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeIngestionToPackage(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPackagerremoveIngestionToPackageReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeIngestionToPackage)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeIngestionToPackage)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeIngestionToPackage(tokenId: String, param: MPackagerremoveIngestionToPackageReq) :MResponseUpdateIngestionToPackage
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeIngestionToPackage: String

	/**
	 * @param tokenId : String
	 * @param param : MPackagerstartPackagingTaskReq
	 * @return MResponseStartPackagingTask
	*/
	@POST
	@Path("/startPackagingTask")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/startPackagingTask", notes = """""", response = classOf[MResponseStartPackagingTask])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def startPackagingTask(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPackagerstartPackagingTaskReq):Response /*returnType = MResponseStartPackagingTask*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__startPackagingTask(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_startPackagingTask)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_startPackagingTask)
	    }
	} 

	@GET
	@Path("/startPackagingTask")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def startPackagingTask_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseStartPackagingTask*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__startPackagingTask(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPackagerstartPackagingTaskReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_startPackagingTask)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_startPackagingTask)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __startPackagingTask(tokenId: String, param: MPackagerstartPackagingTaskReq) :MResponseStartPackagingTask
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_startPackagingTask: String

	/**
	 * @param tokenId : String
	 * @param param : MPackagerstopPackagingTaskReq
	 * @return MResponseStopPackagingTask
	*/
	@POST
	@Path("/stopPackagingTask")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/stopPackagingTask", notes = """""", response = classOf[MResponseStopPackagingTask])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def stopPackagingTask(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPackagerstopPackagingTaskReq):Response /*returnType = MResponseStopPackagingTask*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__stopPackagingTask(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_stopPackagingTask)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_stopPackagingTask)
	    }
	} 

	@GET
	@Path("/stopPackagingTask")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def stopPackagingTask_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseStopPackagingTask*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__stopPackagingTask(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPackagerstopPackagingTaskReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_stopPackagingTask)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_stopPackagingTask)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __stopPackagingTask(tokenId: String, param: MPackagerstopPackagingTaskReq) :MResponseStopPackagingTask
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_stopPackagingTask: String

	/**
	 * @param tokenId : String
	 * @param param : MPackagerdeletePackagedFilesReq
	 * @return MResponseDeletePackagedFiles
	*/
	@POST
	@Path("/deletePackagedFiles")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/deletePackagedFiles", notes = """""", response = classOf[MResponseDeletePackagedFiles])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def deletePackagedFiles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPackagerdeletePackagedFilesReq):Response /*returnType = MResponseDeletePackagedFiles*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__deletePackagedFiles(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_deletePackagedFiles)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_deletePackagedFiles)
	    }
	} 

	@GET
	@Path("/deletePackagedFiles")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def deletePackagedFiles_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDeletePackagedFiles*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__deletePackagedFiles(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPackagerdeletePackagedFilesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_deletePackagedFiles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_deletePackagedFiles)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __deletePackagedFiles(tokenId: String, param: MPackagerdeletePackagedFilesReq) :MResponseDeletePackagedFiles
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_deletePackagedFiles: String

	/**
	 * Remove all packaged thumbnais. All ingested and not ingested files.
	 * The service return an ERROR when the package status is not COMPLETE.
	 * @param tokenId : String
	 * @param param : MPackagerremovePackagedThumbnailsReq
	 * @return MResponsePackager
	*/
	@POST
	@Path("/removePackagedThumbnails")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removePackagedThumbnails", notes = """Remove all packaged thumbnais. All ingested and not ingested files.
	//#SWGNL#The service return an ERROR when the package status is not COMPLETE.""", response = classOf[MResponsePackager])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removePackagedThumbnails(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPackagerremovePackagedThumbnailsReq):Response /*returnType = MResponsePackager*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removePackagedThumbnails(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removePackagedThumbnails)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removePackagedThumbnails)
	    }
	} 

	@GET
	@Path("/removePackagedThumbnails")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removePackagedThumbnails_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePackager*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removePackagedThumbnails(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPackagerremovePackagedThumbnailsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removePackagedThumbnails)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removePackagedThumbnails)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removePackagedThumbnails(tokenId: String, param: MPackagerremovePackagedThumbnailsReq) :MResponsePackager
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removePackagedThumbnails: String

	/**
	 * return the package descriptor for the selected clientId and packageId
	 * @param tokenId : String
	 * @param clientId : String
	 * @param packagedId : String
	 * @return MResponseGetPackagedFile
	*/
	@GET
	@Path("/getPackagedFiles")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getPackagedFiles", notes = """return the package descriptor for the selected clientId and packageId""", response = classOf[MResponseGetPackagedFile])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getPackagedFiles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("packagedId")
	packagedId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetPackagedFile*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getPackagedFiles") 
		try{	
			val resp = this.__getPackagedFiles(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,packagedId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getPackagedFiles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getPackagedFiles)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getPackagedFiles(tokenId: String, clientId: String, packagedId: String) :MResponseGetPackagedFile
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getPackagedFiles: String

	/**
	 * return le list of package descriptors for the selected clientId
	 * @param tokenId : String
	 * @param clientId : String
	 * @param offset : Integer
	 * @param numberOfResult : Integer
	 * @return MResponseGetPackagedFileList
	*/
	@GET
	@Path("/getPackageList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getPackageList", notes = """return le list of package descriptors for the selected clientId""", response = classOf[MResponseGetPackagedFileList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getPackageList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetPackagedFileList*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getPackageList") 
		try{	
			val resp = this.__getPackageList(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getPackageList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getPackageList)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getPackageList(tokenId: String, clientId: String, offset: Integer, numberOfResult: Integer) :MResponseGetPackagedFileList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getPackageList: String

	/**
	 * return le list of files created in the package folder
	 * @param tokenId : String
	 * @param clientId : String
	 * @param packagedId : String
	 * @return MResponseGetPackagedFilesForPreview
	*/
	@GET
	@Path("/getPackagedFilesForPreview")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getPackagedFilesForPreview", notes = """return le list of files created in the package folder""", response = classOf[MResponseGetPackagedFilesForPreview])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getPackagedFilesForPreview(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("packagedId")
	packagedId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetPackagedFilesForPreview*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getPackagedFilesForPreview") 
		try{	
			val resp = this.__getPackagedFilesForPreview(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,packagedId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getPackagedFilesForPreview)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getPackagedFilesForPreview)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getPackagedFilesForPreview(tokenId: String, clientId: String, packagedId: String) :MResponseGetPackagedFilesForPreview
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getPackagedFilesForPreview: String

	/**
	 * initialize the component for a new clientId. (DAL structure)
	 * @param tokenId : String
	 * @param param : MPackagerinitPackagerReq
	 * @return MResponsePackager
	*/
	@POST
	@Path("/initPackager")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/initPackager", notes = """initialize the component for a new clientId. (DAL structure)""", response = classOf[MResponsePackager])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def initPackager(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPackagerinitPackagerReq):Response /*returnType = MResponsePackager*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__initPackager(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_initPackager)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_initPackager)
	    }
	} 

	@GET
	@Path("/initPackager")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def initPackager_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePackager*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__initPackager(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPackagerinitPackagerReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_initPackager)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_initPackager)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __initPackager(tokenId: String, param: MPackagerinitPackagerReq) :MResponsePackager
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_initPackager: String

	/**
	 * used to find the packaged folders that are in the FileSystem and should be removed.
	 * @param tokenId : String
	 * @param param : MPackagercleanupOrphansPackagedFoldersReq
	 * @return MResponseCleanupOrphansPackagedFolders
	*/
	@POST
	@Path("/cleanupOrphansPackagedFolders")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/cleanupOrphansPackagedFolders", notes = """used to find the packaged folders that are in the FileSystem and should be removed.""", response = classOf[MResponseCleanupOrphansPackagedFolders])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def cleanupOrphansPackagedFolders(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPackagercleanupOrphansPackagedFoldersReq):Response /*returnType = MResponseCleanupOrphansPackagedFolders*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__cleanupOrphansPackagedFolders(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_cleanupOrphansPackagedFolders)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_cleanupOrphansPackagedFolders)
	    }
	} 

	@GET
	@Path("/cleanupOrphansPackagedFolders")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def cleanupOrphansPackagedFolders_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCleanupOrphansPackagedFolders*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__cleanupOrphansPackagedFolders(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPackagercleanupOrphansPackagedFoldersReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_cleanupOrphansPackagedFolders)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_cleanupOrphansPackagedFolders)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __cleanupOrphansPackagedFolders(tokenId: String, param: MPackagercleanupOrphansPackagedFoldersReq) :MResponseCleanupOrphansPackagedFolders
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_cleanupOrphansPackagedFolders: String

}