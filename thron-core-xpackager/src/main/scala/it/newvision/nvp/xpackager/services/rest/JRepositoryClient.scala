package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
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

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JRepositoryClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
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
class JRepositoryClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Deprecated by xadmin.JContent.insert service.
	 * @param tokenId : String
	 * @param param : MRepositoryaddFilesToPlatformReq
	 * @return MResponseAddFilesToPlatform
	*/
	def addFilesToPlatform(tokenId: String, 
			param: MRepositoryaddFilesToPlatformReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseAddFilesToPlatform ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseAddFilesToPlatform = if(this.resourceEndpoint == ""){
			
				new MResponseAddFilesToPlatform()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repository/addFilesToPlatform")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAddFilesToPlatform],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAddFilesToPlatform])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Deprecated by xadmin.JContent.insert service.
	 * @param tokenId : String
	 * @param param : MRepositoryaddS3ResourceToPlatformReq
	 * @return MResponseAddFilesToPlatform
	*/
	def addS3ResourceToPlatform(tokenId: String, 
			param: MRepositoryaddS3ResourceToPlatformReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseAddFilesToPlatform ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseAddFilesToPlatform = if(this.resourceEndpoint == ""){
			
				new MResponseAddFilesToPlatform()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repository/addS3ResourceToPlatform")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAddFilesToPlatform],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAddFilesToPlatform])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Deprecated by xadmin.JContent.insert service.
	 * @param tokenId : String
	 * @param param : MRepositoryaddWebResourceToPlatformReq
	 * @return MResponseAddFilesToPlatform
	*/
	def addWebResourceToPlatform(tokenId: String, 
			param: MRepositoryaddWebResourceToPlatformReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseAddFilesToPlatform ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseAddFilesToPlatform = if(this.resourceEndpoint == ""){
			
				new MResponseAddFilesToPlatform()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repository/addWebResourceToPlatform")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAddFilesToPlatform],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAddFilesToPlatform])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to upload a file in repository area.
	 * This service doesn't support jsonp call.
	 * @param clientId : String
	 * @param tokenId : String
	 * @param fileName : String
	 * @param fileSource : java.io.InputStream
	 * @return MResponseUploadFile
	*/
	def uploadFile(clientId: String, 
			tokenId: String, 
			fileName: String, 
			fileSource: java.io.InputStream)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUploadFile ={
		try{
			import javax.ws.rs.core.MediaType
			import com.sun.jersey.multipart.{FormDataMultiPart, FormDataBodyPart}
		    
			val webResource = JRepositoryClient.client.resource(this.resourceEndpoint)
	
		        val optBpFileSource: Option[FormDataBodyPart] = Option(fileSource).map({fs =>
		          new FormDataBodyPart("fileSource", fs, MediaType.APPLICATION_OCTET_STREAM_TYPE)
		        })
	
		        val multiPart = new FormDataMultiPart().field("tokenId", tokenId)
		        Option(clientId) foreach { multiPart.field("clientId", _)}
		        Option(fileName) foreach { multiPart.field("fileName", _)}
	
		        optBpFileSource foreach { multiPart.bodyPart(_) }
	
		        val response : MResponseUploadFile = if(this.resourceEndpoint == ""){
		          new MResponseUploadFile
		        } else {
		          var wbuilder = webResource
		            .path("repository/uploadFile")
		            .accept(MediaType.APPLICATION_XML)
		            .`type`(MediaType.MULTIPART_FORM_DATA)
		            .header("X-TOKENID",tokenId)
		          Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
		          wbuilder.post(classOf[MResponseUploadFile], multiPart)
		        }
		        response
		      } catch {
		        case e : com.sun.jersey.api.client.UniformInterfaceException =>
		          val response = e.getResponse
		          if(response.getStatus == 418) {
		            response.getEntity(classOf[MResponseUploadFile])
		          }
		          else {
		            throw e
		          }
		      }
	}

	/**
	 * Deprecated
	 * @param tokenId : String
	 * @param param : MRepositorydeleteFtpFileReq
	 * @return MResponseDeleteUploadedFiles
	*/
	def deleteFtpFile(tokenId: String, 
			param: MRepositorydeleteFtpFileReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseDeleteUploadedFiles ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseDeleteUploadedFiles = if(this.resourceEndpoint == ""){
			
				new MResponseDeleteUploadedFiles()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repository/deleteFtpFile")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDeleteUploadedFiles],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeleteUploadedFiles])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Deprecated by xadmin.JContent.listVersion
	 * @param tokenId : String
	 * @param param : MRepositorygetUploadedFileListReq
	 * @return MResponseGetUploadedFiles
	*/
	def getUploadedFileList(tokenId: String, 
			param: MRepositorygetUploadedFileListReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseGetUploadedFiles ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetUploadedFiles = if(this.resourceEndpoint == ""){
			
				new MResponseGetUploadedFiles()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repository/getUploadedFileList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetUploadedFiles],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetUploadedFiles])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

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
	def getFtpFileList(tokenId: String, 
			param: MRepositorygetFtpFileListReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseGetUploadedFiles ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetUploadedFiles = if(this.resourceEndpoint == ""){
			
				new MResponseGetUploadedFiles()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repository/getFtpFileList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetUploadedFiles],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetUploadedFiles])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

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
	def getS3UploadCredentials(tokenId: String, 
			clientId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseGetS3UploadCredentials ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
			val response : MResponseGetS3UploadCredentials = if(this.resourceEndpoint == ""){
			
				new MResponseGetS3UploadCredentials()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("repository/getS3UploadCredentials")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetS3UploadCredentials])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetS3UploadCredentials])
				}
				else {
					throw e
				}
			
		  }
	
	}

}