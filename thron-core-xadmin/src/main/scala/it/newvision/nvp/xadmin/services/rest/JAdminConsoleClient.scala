package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
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
object JAdminConsoleClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Handle all service necessary to the admin console and to handle the publication
 * process.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/adxadmin/resources/adminconsole/</li>
 * </ul>
 */
class JAdminConsoleClient(val resourceEndpoint:String) {

	/**
	 * Get le list of files available for preview and moderation.
	 * The user have to specify the mediaContentId used during the publishing process.
	 * The list of contents is based on the packaging folder
	 * @param tokenId : String
	 * @param param : MAdminConsolegetPreviewListReq
	 * @return MResponsePreviewContents
	*/
	def getPreviewList(tokenId: String, 
			param: MAdminConsolegetPreviewListReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePreviewContents ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAdminConsoleClient.client.resource(this.resourceEndpoint)
			val response : MResponsePreviewContents = if(this.resourceEndpoint == ""){
			
				new MResponsePreviewContents()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("adminconsole/getPreviewList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePreviewContents],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePreviewContents])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * DO NOT USE.
	 * this service is used to create a new empty file in the working area of the specified clientId with
	 * the right privileges. Used by the web upload service of the administration console with zk.
	 * @param tokenId : String
	 * @param param : MAdminConsoletouchFileInRepositoryReq
	 * @return MResponseTouchFile
	*/
	def touchFileInRepository(tokenId: String, 
			param: MAdminConsoletouchFileInRepositoryReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTouchFile ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAdminConsoleClient.client.resource(this.resourceEndpoint)
			val response : MResponseTouchFile = if(this.resourceEndpoint == ""){
			
				new MResponseTouchFile()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("adminconsole/touchFileInRepository")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseTouchFile],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTouchFile])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * the service (given a files from the working area) return a list of mediaContents that use the file.
	 * 
	 * This service is useful to know which files in the working area have been published or are in
	 * progress, and which files are not.
	 * @param tokenId : String
	 * @param param : MAdminConsolemediaContentsLinkedToFileReq
	 * @return MResponseFilesLinkedToMediaContent
	*/
	def mediaContentsLinkedToFile(tokenId: String, 
			param: MAdminConsolemediaContentsLinkedToFileReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseFilesLinkedToMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAdminConsoleClient.client.resource(this.resourceEndpoint)
			val response : MResponseFilesLinkedToMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseFilesLinkedToMediaContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("adminconsole/mediaContentsLinkedToFile")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFilesLinkedToMediaContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFilesLinkedToMediaContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * used to update the MFile information in repository.
	 * @param tokenId : String
	 * @param param : MAdminConsoleupdateFileInRepositoryReq
	 * @return MResponseMediaContent
	*/
	def updateFileInRepository(tokenId: String, 
			param: MAdminConsoleupdateFileInRepositoryReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAdminConsoleClient.client.resource(this.resourceEndpoint)
			val response : MResponseMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseMediaContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("adminconsole/updateFileInRepository")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMediaContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMediaContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}