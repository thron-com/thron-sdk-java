package com.thron.contacts.service.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.contact.MResponseDeviceConnect
import com.thron.contacts.service.model.request.MDeviceconnectReq
import com.thron.contacts.service.model.request.MDevicedisconnectReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JDeviceClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to connect the user (device) to a contact and get the deviceId.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-device.thron.
 * com/api/xdevice/resources/device</li>
 * </ul>
 */
class JDeviceClient(val resourceEndpoint:String) {

	/**
	 * Connect a Device to a Contact with the given identityKey.
	 * If there are no contacts matching the identityKey, a new contact is created.
	 * Authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param param : MDeviceconnectReq
	 * @return MResponseDeviceConnect
	*/
	def connect(tokenId: String, 
			param: MDeviceconnectReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeviceConnect ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeviceClient.client.resource(this.resourceEndpoint)
			val response : MResponseDeviceConnect = if(this.resourceEndpoint == ""){
			
				new MResponseDeviceConnect()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("device/connect")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDeviceConnect],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeviceConnect])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Called by a client to disconnect a device from a given contact. The service return the Contact
	 * information identified in the platform.
	 * If the device was connected to an IDENTIFIED Contact, an ANONYMOUS Contact will be created.
	 * Authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param param : MDevicedisconnectReq
	 * @return MResponseDeviceConnect
	*/
	def disconnect(tokenId: String, 
			param: MDevicedisconnectReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeviceConnect ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeviceClient.client.resource(this.resourceEndpoint)
			val response : MResponseDeviceConnect = if(this.resourceEndpoint == ""){
			
				new MResponseDeviceConnect()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("device/disconnect")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDeviceConnect],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeviceConnect])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Called by a client to get a unique contact Id. The service returns the deviceId and the contactId
	 * used by tracker.
	 * Authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * @param deviceId : String
	 * Optional
	 * @return MResponseDeviceConnect
	*/
	def get(tokenId: String, 
			clientId: String, 
			deviceId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeviceConnect ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeviceClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(deviceId).foreach(s => params.add("deviceId", s))
			val response : MResponseDeviceConnect = if(this.resourceEndpoint == ""){
			
				new MResponseDeviceConnect()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("device/get")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDeviceConnect])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeviceConnect])
				}
				else {
					throw e
				}
			
		  }
	
	}

}