package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.utils.MResponseDashboard
import it.newvision.nvp.xadmin.services.model.request.MDashboardchangeContentsOwnerReq
import it.newvision.nvp.xadmin.services.model.request.MDashboardmigrateUserStuffReq

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

}