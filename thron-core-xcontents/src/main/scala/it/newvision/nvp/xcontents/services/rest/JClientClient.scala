package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.client.MResponseDetailClient
import it.newvision.nvp.xcontents.services.model.client.MResponseClient
import it.newvision.nvp.xcontents.services.model.request.MClientupdateSecuritySettingsReq

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

	/**
	 * @param tokenId : String
	 * @param param : MClientupdateSecuritySettingsReq
	 * @return MResponseClient
	*/
	def updateSecuritySettings(tokenId: String, 
			param: MClientupdateSecuritySettingsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseClient = if(this.resourceEndpoint == ""){
			
				new MResponseClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client/updateSecuritySettings")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}