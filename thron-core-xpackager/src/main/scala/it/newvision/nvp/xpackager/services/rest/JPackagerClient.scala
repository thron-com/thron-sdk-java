package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
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
object JPackagerClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Packager service through its functions manages the process of packaging content
 * to be sent to the publisher. Across the use of specific descriptors (defined in
 * the xsd schema) can be accurately defined the types of working task to do. The
 * Packager manage the process and save the worked contents in a special folder
 * storage, ready for the publisher.
 */
class JPackagerClient(val resourceEndpoint:String) {

	/**
	 * Restart the packaging task, and if desired also the ingestion activity.
	 * @param tokenId : String
	 * @param param : MPackagerrestartPackagingTaskReq
	 * @return MResponseRestartPackagingTask
	*/
	def restartPackagingTask(tokenId: String, 
			param: MPackagerrestartPackagingTaskReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRestartPackagingTask ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseRestartPackagingTask = if(this.resourceEndpoint == ""){
			
				new MResponseRestartPackagingTask()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packager/restartPackagingTask")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseRestartPackagingTask],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRestartPackagingTask])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

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
	def addIngestionToPackage(tokenId: String, 
			param: MPackageraddIngestionToPackageReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdateIngestionToPackage ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateIngestionToPackage = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateIngestionToPackage()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packager/addIngestionToPackage")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateIngestionToPackage],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateIngestionToPackage])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove the ingestion descriptor record in Db and delete the file from FileSystem
	 * Allow to remove an ingestion activity from a packaging task, and to update the packaging content in
	 * the FS. This function can be used only with packaging descriptor with ingestion.
	 * @param tokenId : String
	 * @param param : MPackagerremoveIngestionToPackageReq
	 * @return MResponseUpdateIngestionToPackage
	*/
	def removeIngestionToPackage(tokenId: String, 
			param: MPackagerremoveIngestionToPackageReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdateIngestionToPackage ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateIngestionToPackage = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateIngestionToPackage()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packager/removeIngestionToPackage")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateIngestionToPackage],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateIngestionToPackage])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MPackagerstartPackagingTaskReq
	 * @return MResponseStartPackagingTask
	*/
	def startPackagingTask(tokenId: String, 
			param: MPackagerstartPackagingTaskReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseStartPackagingTask ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseStartPackagingTask = if(this.resourceEndpoint == ""){
			
				new MResponseStartPackagingTask()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packager/startPackagingTask")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseStartPackagingTask],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseStartPackagingTask])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MPackagerstopPackagingTaskReq
	 * @return MResponseStopPackagingTask
	*/
	def stopPackagingTask(tokenId: String, 
			param: MPackagerstopPackagingTaskReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseStopPackagingTask ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseStopPackagingTask = if(this.resourceEndpoint == ""){
			
				new MResponseStopPackagingTask()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packager/stopPackagingTask")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseStopPackagingTask],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseStopPackagingTask])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MPackagerdeletePackagedFilesReq
	 * @return MResponseDeletePackagedFiles
	*/
	def deletePackagedFiles(tokenId: String, 
			param: MPackagerdeletePackagedFilesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeletePackagedFiles ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseDeletePackagedFiles = if(this.resourceEndpoint == ""){
			
				new MResponseDeletePackagedFiles()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packager/deletePackagedFiles")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDeletePackagedFiles],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeletePackagedFiles])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove all packaged thumbnais. All ingested and not ingested files.
	 * The service return an ERROR when the package status is not COMPLETE.
	 * @param tokenId : String
	 * @param param : MPackagerremovePackagedThumbnailsReq
	 * @return MResponsePackager
	*/
	def removePackagedThumbnails(tokenId: String, 
			param: MPackagerremovePackagedThumbnailsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePackager ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val response : MResponsePackager = if(this.resourceEndpoint == ""){
			
				new MResponsePackager()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packager/removePackagedThumbnails")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePackager],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePackager])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * return the package descriptor for the selected clientId and packageId
	 * @param tokenId : String
	 * @param clientId : String
	 * @param packagedId : String
	 * @return MResponseGetPackagedFile
	*/
	def getPackagedFiles(tokenId: String, 
			clientId: String, 
			packagedId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetPackagedFile ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(packagedId).foreach(s => params.add("packagedId", s))
			val response : MResponseGetPackagedFile = if(this.resourceEndpoint == ""){
			
				new MResponseGetPackagedFile()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("packager/getPackagedFiles")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetPackagedFile])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetPackagedFile])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * return le list of package descriptors for the selected clientId
	 * @param tokenId : String
	 * @param clientId : String
	 * @param offset : Integer
	 * @param numberOfResult : Integer
	 * @return MResponseGetPackagedFileList
	*/
	def getPackageList(tokenId: String, 
			clientId: String, 
			offset: Integer, 
			numberOfResult: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetPackagedFileList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
			val response : MResponseGetPackagedFileList = if(this.resourceEndpoint == ""){
			
				new MResponseGetPackagedFileList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("packager/getPackageList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetPackagedFileList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetPackagedFileList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * return le list of files created in the package folder
	 * @param tokenId : String
	 * @param clientId : String
	 * @param packagedId : String
	 * @return MResponseGetPackagedFilesForPreview
	*/
	def getPackagedFilesForPreview(tokenId: String, 
			clientId: String, 
			packagedId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetPackagedFilesForPreview ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(packagedId).foreach(s => params.add("packagedId", s))
			val response : MResponseGetPackagedFilesForPreview = if(this.resourceEndpoint == ""){
			
				new MResponseGetPackagedFilesForPreview()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("packager/getPackagedFilesForPreview")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetPackagedFilesForPreview])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetPackagedFilesForPreview])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * initialize the component for a new clientId. (DAL structure)
	 * @param tokenId : String
	 * @param param : MPackagerinitPackagerReq
	 * @return MResponsePackager
	*/
	def initPackager(tokenId: String, 
			param: MPackagerinitPackagerReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePackager ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val response : MResponsePackager = if(this.resourceEndpoint == ""){
			
				new MResponsePackager()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packager/initPackager")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePackager],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePackager])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * used to find the packaged folders that are in the FileSystem and should be removed.
	 * @param tokenId : String
	 * @param param : MPackagercleanupOrphansPackagedFoldersReq
	 * @return MResponseCleanupOrphansPackagedFolders
	*/
	def cleanupOrphansPackagedFolders(tokenId: String, 
			param: MPackagercleanupOrphansPackagedFoldersReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCleanupOrphansPackagedFolders ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseCleanupOrphansPackagedFolders = if(this.resourceEndpoint == ""){
			
				new MResponseCleanupOrphansPackagedFolders()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packager/cleanupOrphansPackagedFolders")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCleanupOrphansPackagedFolders],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCleanupOrphansPackagedFolders])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}