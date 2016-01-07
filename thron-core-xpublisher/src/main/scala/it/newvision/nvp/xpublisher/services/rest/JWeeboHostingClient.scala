package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.hosting.MResponseFileList
import it.newvision.nvp.xpublisher.services.model.hosting.MResponseHostingFile
import it.newvision.nvp.xpublisher.services.model.request.MWeeboHostingaddFileFromFTPReq
import it.newvision.nvp.xpublisher.services.model.hosting.MResponseHosting
import it.newvision.nvp.xpublisher.services.model.request.MWeeboHostingdeleteFileReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboHostingrenameFileReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JWeeboHostingClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
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
class JWeeboHostingClient(val resourceEndpoint:String) {

	/**
	 * The service return the list of files published in the specified folder
	 * @param tokenId : String
	 * @param clientId : String
	 * @param path : String
	 * relative path in CDN, like "root/folder1/folder2/"
	 * @return MResponseFileList
	*/
	def getFileList(tokenId: String, 
			clientId: String, 
			path: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseFileList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboHostingClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(path).foreach(s => params.add("path", s))
			val response : MResponseFileList = if(this.resourceEndpoint == ""){
			
				new MResponseFileList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("weebohosting/getFileList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseFileList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFileList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MWeeboHostingaddFileFromFTPReq
	 * @return MResponseHostingFile
	*/
	def addFileFromFTP(tokenId: String, 
			param: MWeeboHostingaddFileFromFTPReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseHostingFile ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboHostingClient.client.resource(this.resourceEndpoint)
			val response : MResponseHostingFile = if(this.resourceEndpoint == ""){
			
				new MResponseHostingFile()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebohosting/addFileFromFTP")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseHostingFile],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseHostingFile])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Allow the client to remove a file from the host. If filename is a folder, the user can remove only
	 * if the folder is empty
	 * @param tokenId : String
	 * @param param : MWeeboHostingdeleteFileReq
	 * @return MResponseHosting
	*/
	def deleteFile(tokenId: String, 
			param: MWeeboHostingdeleteFileReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseHosting ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboHostingClient.client.resource(this.resourceEndpoint)
			val response : MResponseHosting = if(this.resourceEndpoint == ""){
			
				new MResponseHosting()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebohosting/deleteFile")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseHosting],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseHosting])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Allow the client to rename a file from the host. The user can also rename a folder
	 * @param tokenId : String
	 * @param param : MWeeboHostingrenameFileReq
	 * @return MResponseHostingFile
	*/
	def renameFile(tokenId: String, 
			param: MWeeboHostingrenameFileReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseHostingFile ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboHostingClient.client.resource(this.resourceEndpoint)
			val response : MResponseHostingFile = if(this.resourceEndpoint == ""){
			
				new MResponseHostingFile()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weebohosting/renameFile")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseHostingFile],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseHostingFile])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}