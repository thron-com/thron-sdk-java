package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xpublisher.services.model.hosting.MResponseFileList
import it.newvision.nvp.xpublisher.services.model.hosting.MResponseHostingFile
import it.newvision.nvp.xpublisher.services.model.request.MWeeboHostingaddFileFromFTPReq
import it.newvision.nvp.xpublisher.services.model.hosting.MResponseHosting
import it.newvision.nvp.xpublisher.services.model.request.MWeeboHostingdeleteFileReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboHostingrenameFileReq

import com.sun.jersey.multipart._
/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The WeeboHosting web service provide the services to upload static files in CDN.
 * This service is used to upload or removes files, get the list of published
 * files.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>WADL REST service: http://clientId-view.4me.
 * it/api/adxpublisher/resources/application.wadl</li>
 * </ul>
 */
@Path("/weebohosting")
//#SWG#@Api(value = "/weebohosting", description = """The WeeboHosting web service provide the services to upload static files in CDN. This service is used to upload or removes files, get the list of published files.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>WADL REST service: http://clientId-view.4me.it/api/adxpublisher/resources/application.wadl</li>
//#SWGNL#</ul>""")
trait JWeeboHosting extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * The service return the list of files published in the specified folder
	 * @param tokenId : String
	 * @param clientId : String
	 * @param path : String
	 * relative path in CDN, like "root/folder1/folder2/"
	 * @return MResponseFileList
	*/
	@GET
	@Path("/getFileList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getFileList", notes = """The service return the list of files published in the specified folder""", response = classOf[MResponseFileList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getFileList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """relative path in CDN, like "root/folder1/folder2/"""")
	@QueryParam("path")
	path: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseFileList*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getFileList") 
		try{	
			val resp = this.__getFileList(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,path)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getFileList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getFileList)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getFileList(tokenId: String, clientId: String, path: String) :MResponseFileList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getFileList: String

	/**
	 * @param tokenId : String
	 * @param param : MWeeboHostingaddFileFromFTPReq
	 * @return MResponseHostingFile
	*/
	@POST
	@Path("/addFileFromFTP")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addFileFromFTP", notes = """""", response = classOf[MResponseHostingFile])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addFileFromFTP(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboHostingaddFileFromFTPReq):Response /*returnType = MResponseHostingFile*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addFileFromFTP(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addFileFromFTP)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addFileFromFTP)
	    }
	} 

	@GET
	@Path("/addFileFromFTP")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addFileFromFTP_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseHostingFile*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addFileFromFTP(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboHostingaddFileFromFTPReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addFileFromFTP)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addFileFromFTP)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addFileFromFTP(tokenId: String, param: MWeeboHostingaddFileFromFTPReq) :MResponseHostingFile
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addFileFromFTP: String

	/**
	 * Allow the client to remove a file from the host. If filename is a folder, the user can remove only
	 * if the folder is empty
	 * @param tokenId : String
	 * @param param : MWeeboHostingdeleteFileReq
	 * @return MResponseHosting
	*/
	@POST
	@Path("/deleteFile")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/deleteFile", notes = """Allow the client to remove a file from the host. If filename is a folder, the user can remove only if the folder is empty""", response = classOf[MResponseHosting])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def deleteFile(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboHostingdeleteFileReq):Response /*returnType = MResponseHosting*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__deleteFile(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_deleteFile)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_deleteFile)
	    }
	} 

	@GET
	@Path("/deleteFile")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def deleteFile_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseHosting*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__deleteFile(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboHostingdeleteFileReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_deleteFile)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_deleteFile)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __deleteFile(tokenId: String, param: MWeeboHostingdeleteFileReq) :MResponseHosting
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_deleteFile: String

	/**
	 * Allow the client to rename a file from the host. The user can also rename a folder
	 * @param tokenId : String
	 * @param param : MWeeboHostingrenameFileReq
	 * @return MResponseHostingFile
	*/
	@POST
	@Path("/renameFile")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/renameFile", notes = """Allow the client to rename a file from the host. The user can also rename a folder""", response = classOf[MResponseHostingFile])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def renameFile(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboHostingrenameFileReq):Response /*returnType = MResponseHostingFile*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__renameFile(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_renameFile)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_renameFile)
	    }
	} 

	@GET
	@Path("/renameFile")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def renameFile_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseHostingFile*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__renameFile(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboHostingrenameFileReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_renameFile)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_renameFile)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __renameFile(tokenId: String, param: MWeeboHostingrenameFileReq) :MResponseHostingFile
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_renameFile: String

	/**
	 * @param clientId : String
	 * @param tokenId : String
	 * @param fileName : String
	 * Limeted to 64 characters
	 * @param destinationFolder : String
	 * The complete relative path where the file should be saved.
	 * The destinationfolder path is limeted to 64 characters
	 * @param fileSource : java.io.InputStream
	 * @param cd : com.sun.jersey.core.header.FormDataContentDisposition
	 * @return MResponseHostingFile
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
			@FormDataParam("destinationFolder")
	destinationFolder: String, 
			@FormDataParam("fileSource")
	fileSource: java.io.InputStream, 
			@FormDataParam("fileSource")
	cd: com.sun.jersey.core.header.FormDataContentDisposition):Response /*returnType = MResponseHostingFile*/  

	@GET
	@Path("uploadFile")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Consumes(Array(MediaType.APPLICATION_JSON))
	def uploadFile_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseHostingFile*/ = { throw new it.newvision.core.dictionary.exceptions.WebApplicationException("service not implemented") }


	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 

	protected def capability_uploadFile: String

}