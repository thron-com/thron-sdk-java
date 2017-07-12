package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xpackager.services.model.repository.MResponseAddFilesToPlatform
import it.newvision.nvp.xpackager.services.model.request.MRepositoryaddFilesToPlatformReq
import it.newvision.nvp.xpackager.services.model.request.MRepositoryaddS3ResourceToPlatformReq
import it.newvision.nvp.xpackager.services.model.request.MRepositoryaddWebResourceToPlatformReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseUploadFile
import it.newvision.nvp.xpackager.services.model.repository.MResponseDeleteUploadedFiles
import it.newvision.nvp.xpackager.services.model.request.MRepositorydeleteFtpFileReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseGetUploadedFiles
import it.newvision.nvp.xpackager.services.model.request.MRepositorygetUploadedFileListReq
import it.newvision.nvp.xpackager.services.model.request.MRepositorygetFtpFileListReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseGetS3UploadCredentials

import com.sun.jersey.multipart._
/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Repository service provides different features to import files in the
 * platfom and manage the storage area. The platform has two main repositories:
 * <ul>
 * 	<li>ftp (used as temporary storage for files before the upload in the
 * platform)</li>
 * 	<li>repository area (use as main storage of the original files uploaded from
 * ftp, web, s3 or http)</li>
 * </ul>
 * 
 * It's possible to upload files to the platform from:
 * <ul>
 * 	<li>web upload</li>
 * 	<li>s3 bucket</li>
 * 	<li>web http resource</li>
 * </ul>
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xpackager/resources/repository</li>
 * </ul>
 */
@Path("/repository")
//#SWG#@Api(value = "/repository", description = """The Repository service provides different features to import files in the platfom and manage the storage area. The platform has two main repositories:
//#SWGNL#<ul>
//#SWGNL#	<li>ftp (used as temporary storage for files before the upload in the platform)</li>
//#SWGNL#	<li>repository area (use as main storage of the original files uploaded from ftp, web, s3 or http)</li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#It's possible to upload files to the platform from:
//#SWGNL#<ul>
//#SWGNL#	<li>web upload</li>
//#SWGNL#	<li>s3 bucket</li>
//#SWGNL#	<li>web http resource</li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xpackager/resources/repository</li>
//#SWGNL#</ul>""")
trait JRepository extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Adds a list of files from the FTP folder to platform working area.
	 * Imported files are then deleted from the FTP folder.
	 * @param tokenId : String
	 * 
	 * 
	 * 
	 * 
	 * G
	 * @param param : MRepositoryaddFilesToPlatformReq
	 * @return MResponseAddFilesToPlatform
	*/
	@POST
	@Path("/addFilesToPlatform")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addFilesToPlatform", notes = """Adds a list of files from the FTP folder to platform working area.
	//#SWGNL#Imported files are then deleted from the FTP folder.""", response = classOf[MResponseAddFilesToPlatform])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addFilesToPlatform(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryaddFilesToPlatformReq):Response /*returnType = MResponseAddFilesToPlatform*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addFilesToPlatform(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addFilesToPlatform)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addFilesToPlatform)
	    }
	} 

	@GET
	@Path("/addFilesToPlatform")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addFilesToPlatform_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAddFilesToPlatform*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addFilesToPlatform",this._getCacheControl) 
		try{
			val resp = this.__addFilesToPlatform(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryaddFilesToPlatformReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addFilesToPlatform)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addFilesToPlatform)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addFilesToPlatform(tokenId: String, param: MRepositoryaddFilesToPlatformReq) :MResponseAddFilesToPlatform
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addFilesToPlatform: String

	/**
	 * Adds a file from the Amazon S3 Bucket folder to platform working area.
	 * S3 bucket must be public or have no read restrictions.
	 * 
	 * Use JRepository.getS3UploadCredentials to get temporary credentials and the S3 bucket to upload
	 * files to.
	 * @param tokenId : String
	 * @param param : MRepositoryaddS3ResourceToPlatformReq
	 * @return MResponseAddFilesToPlatform
	*/
	@POST
	@Path("/addS3ResourceToPlatform")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addS3ResourceToPlatform", notes = """Adds a file from the Amazon S3 Bucket folder to platform working area.
	//#SWGNL#S3 bucket must be public or have no read restrictions.
	//#SWGNL#
	//#SWGNL#Use JRepository.getS3UploadCredentials to get temporary credentials and the S3 bucket to upload files to.""", response = classOf[MResponseAddFilesToPlatform])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addS3ResourceToPlatform(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryaddS3ResourceToPlatformReq):Response /*returnType = MResponseAddFilesToPlatform*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addS3ResourceToPlatform(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addS3ResourceToPlatform)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addS3ResourceToPlatform)
	    }
	} 

	@GET
	@Path("/addS3ResourceToPlatform")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addS3ResourceToPlatform_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAddFilesToPlatform*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addS3ResourceToPlatform",this._getCacheControl) 
		try{
			val resp = this.__addS3ResourceToPlatform(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryaddS3ResourceToPlatformReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addS3ResourceToPlatform)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addS3ResourceToPlatform)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addS3ResourceToPlatform(tokenId: String, param: MRepositoryaddS3ResourceToPlatformReq) :MResponseAddFilesToPlatform
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addS3ResourceToPlatform: String

	/**
	 * Add a web file to platform working area.
	 * @param tokenId : String
	 * @param param : MRepositoryaddWebResourceToPlatformReq
	 * @return MResponseAddFilesToPlatform
	*/
	@POST
	@Path("/addWebResourceToPlatform")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addWebResourceToPlatform", notes = """Add a web file to platform working area.""", response = classOf[MResponseAddFilesToPlatform])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addWebResourceToPlatform(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositoryaddWebResourceToPlatformReq):Response /*returnType = MResponseAddFilesToPlatform*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addWebResourceToPlatform(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addWebResourceToPlatform)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addWebResourceToPlatform)
	    }
	} 

	@GET
	@Path("/addWebResourceToPlatform")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addWebResourceToPlatform_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAddFilesToPlatform*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addWebResourceToPlatform",this._getCacheControl) 
		try{
			val resp = this.__addWebResourceToPlatform(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositoryaddWebResourceToPlatformReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addWebResourceToPlatform)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addWebResourceToPlatform)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addWebResourceToPlatform(tokenId: String, param: MRepositoryaddWebResourceToPlatformReq) :MResponseAddFilesToPlatform
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addWebResourceToPlatform: String

	/**
	 * Used to upload a file in repository area.
	 * This service doesn't support jsonp call.
	 * @param clientId : String
	 * @param tokenId : String
	 * @param fileName : String
	 * limited to 64 characters.
	 * filename with extension (example myimage.jpg)
	 * @param fileSource : java.io.InputStream
	 * @param cd : com.sun.jersey.core.header.FormDataContentDisposition
	 * @return MResponseUploadFile
	*/
	@POST
	                @Path("uploadFile")
	                @Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	                @Consumes(Array(MediaType.MULTIPART_FORM_DATA))
	def uploadFile(@FormDataParam("clientId")
	clientId: String, 
			@FormDataParam("tokenId")
	tokenId: String, 
			@FormDataParam("fileName")
	fileName: String, 
			@FormDataParam("fileSource")
	fileSource: java.io.InputStream, 
			@FormDataParam("fileSource")
	cd: com.sun.jersey.core.header.FormDataContentDisposition):Response /*returnType = MResponseUploadFile*/ 

	/**
	 * Deletes a file from the FTP folder.
	 * @param tokenId : String
	 * @param param : MRepositorydeleteFtpFileReq
	 * @return MResponseDeleteUploadedFiles
	*/
	@POST
	@Path("/deleteFtpFile")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/deleteFtpFile", notes = """Deletes a file from the FTP folder.""", response = classOf[MResponseDeleteUploadedFiles])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def deleteFtpFile(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositorydeleteFtpFileReq):Response /*returnType = MResponseDeleteUploadedFiles*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__deleteFtpFile(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_deleteFtpFile)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_deleteFtpFile)
	    }
	} 

	@GET
	@Path("/deleteFtpFile")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def deleteFtpFile_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDeleteUploadedFiles*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("deleteFtpFile",this._getCacheControl) 
		try{
			val resp = this.__deleteFtpFile(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositorydeleteFtpFileReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_deleteFtpFile)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_deleteFtpFile)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __deleteFtpFile(tokenId: String, param: MRepositorydeleteFtpFileReq) :MResponseDeleteUploadedFiles
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_deleteFtpFile: String

	/**
	 * Returns uploaded files in platform working area matching provide criteria.
	 * The service return only owned files.
	 * 
	 * OrderBy parameter schema: <b>[orderbyFileds]_[A|D]</b>
	 * Available orderbyFileds are: fileName, siteName,totalSpace,modifiedDate,mimetype
	 * _A suffix means -> ascendant order
	 * _D suffix means -> descendant order
	 * @param tokenId : String
	 * @param param : MRepositorygetUploadedFileListReq
	 * @return MResponseGetUploadedFiles
	*/
	@POST
	@Path("/getUploadedFileList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getUploadedFileList", notes = """Returns uploaded files in platform working area matching provide criteria.
	//#SWGNL#The service return only owned files.
	//#SWGNL#
	//#SWGNL#OrderBy parameter schema: <b>[orderbyFileds]_[A|D]</b>
	//#SWGNL#Available orderbyFileds are: fileName, siteName,totalSpace,modifiedDate,mimetype
	//#SWGNL#_A suffix means -> ascendant order
	//#SWGNL#_D suffix means -> descendant order""", response = classOf[MResponseGetUploadedFiles])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getUploadedFileList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositorygetUploadedFileListReq):Response /*returnType = MResponseGetUploadedFiles*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getUploadedFileList(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getUploadedFileList)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getUploadedFileList)
	    }
	} 

	@GET
	@Path("/getUploadedFileList")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getUploadedFileList_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetUploadedFiles*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("getUploadedFileList",this._getCacheControl) 
		try{
			val resp = this.__getUploadedFileList(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositorygetUploadedFileListReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getUploadedFileList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getUploadedFileList)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getUploadedFileList(tokenId: String, param: MRepositorygetUploadedFileListReq) :MResponseGetUploadedFiles
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getUploadedFileList: String

	/**
	 * Returns the uploaded files in the FTP folder matching provided criteria.
	 * 
	 * The service use a specific orderBy parameter schema: <b>[orderbyFileds]_[A|D]</b>
	 * Available orderbyFileds are: fileName, siteName,totalSpace,modifiedDate,mimetype
	 * _A suffix means -> ascendant order
	 * _D suffix means -> descendant order
	 * @param tokenId : String
	 * @param param : MRepositorygetFtpFileListReq
	 * @return MResponseGetUploadedFiles
	*/
	@POST
	@Path("/getFtpFileList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getFtpFileList", notes = """Returns the uploaded files in the FTP folder matching provided criteria.
	//#SWGNL#
	//#SWGNL#The service use a specific orderBy parameter schema: <b>[orderbyFileds]_[A|D]</b>
	//#SWGNL#Available orderbyFileds are: fileName, siteName,totalSpace,modifiedDate,mimetype
	//#SWGNL#_A suffix means -> ascendant order
	//#SWGNL#_D suffix means -> descendant order""", response = classOf[MResponseGetUploadedFiles])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getFtpFileList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRepositorygetFtpFileListReq):Response /*returnType = MResponseGetUploadedFiles*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getFtpFileList(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getFtpFileList)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getFtpFileList)
	    }
	} 

	@GET
	@Path("/getFtpFileList")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getFtpFileList_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetUploadedFiles*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("getFtpFileList",this._getCacheControl) 
		try{
			val resp = this.__getFtpFileList(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRepositorygetFtpFileListReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getFtpFileList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getFtpFileList)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getFtpFileList(tokenId: String, param: MRepositorygetFtpFileListReq) :MResponseGetUploadedFiles
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getFtpFileList: String

	/**
	 * Returns a set of temporary credentials (1h lifespan) for uploading files into an Amazon S3 Bucket.
	 * 
	 * Once the file is uploaded to the bucket (using the proper S3 services and specifying AES256 server-
	 * side encryption), users can upload it in platform working area via addS3ResourceToPlatform service.
	 * 
	 * 
	 * Note: S3 bucket is a temporary storage, uploaded files get cleaned up periodically.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseGetS3UploadCredentials
	*/
	@GET
	@Path("/getS3UploadCredentials")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getS3UploadCredentials", notes = """Returns a set of temporary credentials (1h lifespan) for uploading files into an Amazon S3 Bucket.
	//#SWGNL#
	//#SWGNL#Once the file is uploaded to the bucket (using the proper S3 services and specifying AES256 server-side encryption), users can upload it in platform working area via addS3ResourceToPlatform service.
	//#SWGNL#
	//#SWGNL#Note: S3 bucket is a temporary storage, uploaded files get cleaned up periodically.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.""", response = classOf[MResponseGetS3UploadCredentials])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getS3UploadCredentials(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetS3UploadCredentials*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getS3UploadCredentials") 
		try{	
			val resp = this.__getS3UploadCredentials(PRestHelper.getTokenId(tokenId_q, tokenId),clientId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getS3UploadCredentials)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getS3UploadCredentials)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getS3UploadCredentials(tokenId: String, clientId: String) :MResponseGetS3UploadCredentials
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getS3UploadCredentials: String

}