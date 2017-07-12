package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.client.MResponseUpdateClient
import it.newvision.nvp.xcontents.services.model.request.MClientupdateAuditDurationDaysReq
import it.newvision.nvp.xcontents.services.model.request.MClientupdateSecureConnectionEnabledReq
import it.newvision.nvp.xcontents.services.model.request.MClientupdateTrashPropertiesReq
import it.newvision.nvp.xcontents.services.model.client.MResponseDetailClient

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JClientClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is used to update the client properties of xcontents.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/client   </li>
 * </ul>
 */
class JClientClient(val resourceEndpoint:String) {

	/**
	 * Updates audit duration value.
	 * @param tokenId : String
	 * @param param : MClientupdateAuditDurationDaysReq
	 * @return MResponseUpdateClient
	*/
	def updateAuditDurationDays(tokenId: String, 
			param: MClientupdateAuditDurationDaysReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdateClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateClient = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client/updateAuditDurationDays")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates secure connection enabled value.
	 * @param tokenId : String
	 * @param param : MClientupdateSecureConnectionEnabledReq
	 * @return MResponseUpdateClient
	*/
	def updateSecureConnectionEnabled(tokenId: String, 
			param: MClientupdateSecureConnectionEnabledReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdateClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateClient = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client/updateSecureConnectionEnabled")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates trash properties value.
	 * @param tokenId : String
	 * @param param : MClientupdateTrashPropertiesReq
	 * @return MResponseUpdateClient
	*/
	def updateTrashProperties(tokenId: String, 
			param: MClientupdateTrashPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdateClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateClient = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client/updateTrashProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns client properties.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseDetailClient
	*/
	def detailClient(tokenId: String, 
			clientId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDetailClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
			val response : MResponseDetailClient = if(this.resourceEndpoint == ""){
			
				new MResponseDetailClient()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("client/detailClient")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDetailClient])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailClient])
				}
				else {
					throw e
				}
			
		  }
	
	}

}