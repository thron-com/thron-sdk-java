package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.utils.MResponseDashboard
import it.newvision.nvp.xadmin.services.model.request.MDashboardchangeContentsOwnerReq
import it.newvision.nvp.xadmin.services.model.request.MDashboardmigrateUserStuffReq
import it.newvision.nvp.xadmin.services.model.request.MDashboardreplaceSourceFilesReq
import it.newvision.nvp.xadmin.services.model.request.MDashboardresetUserPreferencesReq
import it.newvision.nvp.xadmin.services.model.utils.MResponseContentRemoved
import it.newvision.nvp.xadmin.services.model.request.MDashboardtrashContentReq
import it.newvision.nvp.xadmin.services.model.request.MDashboarduntrashContentReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JDashboardClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Utility service for the Platform Dashboard.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xadmin/resources/dashboard  </li>
 * </ul>
 */
class JDashboardClient(val resourceEndpoint:String) {

	/**
	 * The service change the owner for a given list of contents.
	 * @param tokenId : String
	 * @param param : MDashboardchangeContentsOwnerReq
	 * @return MResponseDashboard
	*/
	def changeContentsOwner(tokenId: String, 
			param: MDashboardchangeContentsOwnerReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDashboard ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDashboardClient.client.resource(this.resourceEndpoint)
			val response : MResponseDashboard = if(this.resourceEndpoint == ""){
			
				new MResponseDashboard()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("dashboard/changeContentsOwner")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDashboard],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDashboard])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * This service is used to migrate:
	 * <ul>
	 * 	<li>owned contents </li>
	 * 	<li>owned public categories</li>
	 * 	<li>owned repository files</li>
	 * </ul>
	 * Should be used when a user is removed and the contents should be assigned to another user.
	 * 
	 * The service also remove
	 * <ul>
	 * 	<li>all links to the userId1 private folders </li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MDashboardmigrateUserStuffReq
	 * @return MResponseDashboard
	*/
	def migrateUserStuff(tokenId: String, 
			param: MDashboardmigrateUserStuffReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDashboard ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDashboardClient.client.resource(this.resourceEndpoint)
			val response : MResponseDashboard = if(this.resourceEndpoint == ""){
			
				new MResponseDashboard()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("dashboard/migrateUserStuff")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDashboard],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDashboard])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service:
	 * <ul>
	 * 	<li>replace the source file linked to the MediaContent (MMediaContent.sourceFiles)</li>
	 * </ul>
	 * <ul>
	 * 	<li>republish the content in all channels with status PUBLISHED or ERROR.</li>
	 * </ul>
	 * <ul>
	 * 	<li>remove the old files (all sourceFiles versions) from repository if removeOriginalFiles
	 * parameter is TRUE</li>
	 * </ul>
	 * <ul>
	 * 	<li>keep a version of the original source file (saved as link in MMediaContent.
	 * sourceFilesOldVersion) if removeOriginalFiles parameter is set to FALSE</li>
	 * </ul>
	 * <ul>
	 * 	<li>reset the user preferences of the content (the content becomes new for all users)</li>
	 * </ul>
	 * <ul>
	 * 	<li>return and error if the content has some channel in progress.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MDashboardreplaceSourceFilesReq
	 * @return MResponseDashboard
	*/
	def replaceSourceFiles(tokenId: String, 
			param: MDashboardreplaceSourceFilesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDashboard ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDashboardClient.client.resource(this.resourceEndpoint)
			val response : MResponseDashboard = if(this.resourceEndpoint == ""){
			
				new MResponseDashboard()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("dashboard/replaceSourceFiles")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDashboard],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDashboard])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service remove all user preferences from the specific content
	 * @param tokenId : String
	 * @param param : MDashboardresetUserPreferencesReq
	 * @return MResponseDashboard
	*/
	def resetUserPreferences(tokenId: String, 
			param: MDashboardresetUserPreferencesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDashboard ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDashboardClient.client.resource(this.resourceEndpoint)
			val response : MResponseDashboard = if(this.resourceEndpoint == ""){
			
				new MResponseDashboard()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("dashboard/resetUserPreferences")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDashboard],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDashboard])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * move a content in TRASH category. The content is still published in CDN and can be recovered using
	 * the service untrashContent.
	 * 
	 * The service remove also:
	 * <ul>
	 * 	<li>the contents from the linked categories</li>
	 * 	<li>cleanup the ACL specific of the content</li>
	 * 	<li>all linked embed codes.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MDashboardtrashContentReq
	 * @return MResponseContentRemoved
	*/
	def trashContent(tokenId: String, 
			param: MDashboardtrashContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentRemoved ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDashboardClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentRemoved = if(this.resourceEndpoint == ""){
			
				new MResponseContentRemoved()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("dashboard/trashContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentRemoved],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentRemoved])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to recover a trashContent operation.
	 * The service restore the content in the owner's INBOX. 
	 * @param tokenId : String
	 * @param param : MDashboarduntrashContentReq
	 * @return MResponseContentRemoved
	*/
	def untrashContent(tokenId: String, 
			param: MDashboarduntrashContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentRemoved ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDashboardClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentRemoved = if(this.resourceEndpoint == ""){
			
				new MResponseContentRemoved()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("dashboard/untrashContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentRemoved],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentRemoved])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}