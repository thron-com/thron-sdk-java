package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.repository.MResponseRepository
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdminupdateFileStatusReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseFilesToBackup
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdmingetFilesToBackupReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseFilesToCleanUp
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdmingetFilesToCleanUpReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseFindFilesByProperties
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdmingetFilesToFixReq
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdmincleanupFilesOnSiteReq
import it.newvision.nvp.xpackager.services.model.repository.MResponseFilesRestored
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdminrestoreFilesReq
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdminfindFilesByPropertiesReq
import it.newvision.nvp.xpackager.services.model.request.MRepositoryAdminmigrateClientRepositoryReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JRepositoryAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Private service used to update the repository.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/adxpackager/resources/repositoryadmin</li>
 * </ul>
 */
class JRepositoryAdminClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Used by bakupscript to update the file status once the backup has been completed. update the status
	 * of the file in database.
	 * The backupscript upload the new files stored in a main site with the backup sites (S3...)
	 * @param tokenId : String
	 * @param param : MRepositoryAdminupdateFileStatusReq
	 * @return MResponseRepository
	*/
	def updateFileStatus(tokenId: String, 
			param: MRepositoryAdminupdateFileStatusReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseRepository ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseRepository = if(this.resourceEndpoint == ""){
			
				new MResponseRepository()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repositoryadmin/updateFileStatus")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseRepository],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRepository])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * This service is used by backup script. return the list of files to upload in the backup sites.
	 * @param tokenId : String
	 * @param param : MRepositoryAdmingetFilesToBackupReq
	 * @return MResponseFilesToBackup
	*/
	def getFilesToBackup(tokenId: String, 
			param: MRepositoryAdmingetFilesToBackupReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseFilesToBackup ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseFilesToBackup = if(this.resourceEndpoint == ""){
			
				new MResponseFilesToBackup()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repositoryadmin/getFilesToBackup")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFilesToBackup],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFilesToBackup])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * This service is used by backup script. return the list of files present in the site working area
	 * that could be clean up. The master sites use the working repository area as temporary cache storage.
	 * @param tokenId : String
	 * @param param : MRepositoryAdmingetFilesToCleanUpReq
	 * @return MResponseFilesToCleanUp
	*/
	def getFilesToCleanUp(tokenId: String, 
			param: MRepositoryAdmingetFilesToCleanUpReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseFilesToCleanUp ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseFilesToCleanUp = if(this.resourceEndpoint == ""){
			
				new MResponseFilesToCleanUp()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repositoryadmin/getFilesToCleanUp")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFilesToCleanUp],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFilesToCleanUp])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * This service is used by backup script. return the list of files present in the site working area
	 * that could be fixed (pending in download for a long time).
	 * @param tokenId : String
	 * @param param : MRepositoryAdmingetFilesToFixReq
	 * @return MResponseFindFilesByProperties
	*/
	def getFilesToFix(tokenId: String, 
			param: MRepositoryAdmingetFilesToFixReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseFindFilesByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindFilesByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseFindFilesByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repositoryadmin/getFilesToFix")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindFilesByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindFilesByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MRepositoryAdmincleanupFilesOnSiteReq
	 * @return MResponseRepository
	*/
	def cleanupFilesOnSite(tokenId: String, 
			param: MRepositoryAdmincleanupFilesOnSiteReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseRepository ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseRepository = if(this.resourceEndpoint == ""){
			
				new MResponseRepository()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repositoryadmin/cleanupFilesOnSite")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseRepository],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRepository])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * try to recover the give list of files in repository.
	 * A file can be recovered if:
	 * * the file is stored in a safe repository (sites type BACKUP_REPO)
	 * * the file has not been purged (by maintenance services)
	 * @param tokenId : String
	 * @param param : MRepositoryAdminrestoreFilesReq
	 * @return MResponseFilesRestored
	*/
	def restoreFiles(tokenId: String, 
			param: MRepositoryAdminrestoreFilesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseFilesRestored ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseFilesRestored = if(this.resourceEndpoint == ""){
			
				new MResponseFilesRestored()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repositoryadmin/restoreFiles")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFilesRestored],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFilesRestored])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

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
	def findFilesByProperties(tokenId: String, 
			param: MRepositoryAdminfindFilesByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseFindFilesByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindFilesByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseFindFilesByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repositoryadmin/findFilesByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindFilesByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindFilesByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * migrate the source file in the right backup repository.
	 * Used to move all files from site_a to site_b and vice versa.
	 * @param tokenId : String
	 * @param param : MRepositoryAdminmigrateClientRepositoryReq
	 * @return MResponseRepository
	*/
	def migrateClientRepository(tokenId: String, 
			param: MRepositoryAdminmigrateClientRepositoryReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseRepository ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRepositoryAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseRepository = if(this.resourceEndpoint == ""){
			
				new MResponseRepository()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("repositoryadmin/migrateClientRepository")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseRepository],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRepository])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}