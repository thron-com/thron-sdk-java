package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.eventmanager.MResponseEventManagerDetail
import it.newvision.nvp.xadmin.services.model.request.MEventManagerstartEventReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerforceRestartEventReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagergetLiveEventDetailReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerupdateLiveEventReq
import it.newvision.nvp.xadmin.services.model.request.MEventManageraddClientStreamWithPasswordReq
import it.newvision.nvp.xadmin.services.model.request.MEventManageraddClientStreamsReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerremoveClientStreamsReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerchangeClientStreamPreviewReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerchangeClientStreamInMuxingReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerstartRecordingReq
import it.newvision.nvp.xadmin.services.model.request.MEventManagerstopRecordingReq
import it.newvision.nvp.xadmin.services.model.eventmanager.MResponseEventManager
import it.newvision.nvp.xadmin.services.model.request.MEventManagerstopLiveEventReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JEventManagerClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service define all functions to manage a live event:
 * <ul>
 * 	<li>start and stop a live event </li>
 * 	<li>manage the preview stream on ON AIR Live events</li>
 * 	<li>manage the stream to show in live event</li>
 * 	<li>add and remove new input streams</li>
 * </ul>
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xadmin/resources/eventmanager</li>
 * </ul>
 */
class JEventManagerClient(val resourceEndpoint:String) {

	/**
	 * the service starts the necessary resources for a new live event.
	 * The operation is asynchronous and the live event will be active when the media content is in status
	 * PUBLISHED.
	 * A Live Event is like the other 4ME Contents, and when the media content is in state PUBLISHED means
	 * that the live event is ready/on air, otherwise the live event is not active. 
	 * @param tokenId : String
	 * @param param : MEventManagerstartEventReq
	 * @return MResponseEventManagerDetail
	*/
	def startEvent(tokenId: String, 
			param: MEventManagerstartEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/startEvent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service try to stop and start a configured live event.
	 * With this operation the platform allocate new resources for the given live event.
	 * @param tokenId : String
	 * @param param : MEventManagerforceRestartEventReq
	 * @return MResponseEventManagerDetail
	*/
	def forceRestartEvent(tokenId: String, 
			param: MEventManagerforceRestartEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/forceRestartEvent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Return the live event detail for an active / on air live event.
	 * This service can be called only to ON AIR live events.
	 * @param tokenId : String
	 * @param param : MEventManagergetLiveEventDetailReq
	 * @return MResponseEventManagerDetail
	*/
	def getLiveEventDetail(tokenId: String, 
			param: MEventManagergetLiveEventDetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/getLiveEventDetail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * This service is used to update the validTo live event attributes that is used to change the live
	 * event end time. This service can be called only to ON AIR live events.
	 * @param tokenId : String
	 * @param param : MEventManagerupdateLiveEventReq
	 * @return MResponseEventManagerDetail
	*/
	def updateLiveEvent(tokenId: String, 
			param: MEventManagerupdateLiveEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/updateLiveEvent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to add a new clientStream to an active live event and return the detail of the live event with
	 * the list of client streams and password.
	 * This service can be called only to ON AIR live events.
	 * ClientStreams can only contain [0-9a-zA-Z-_] characters
	 * @param tokenId : String
	 * @param param : MEventManageraddClientStreamWithPasswordReq
	 * @return MResponseEventManagerDetail
	*/
	def addClientStreamWithPassword(tokenId: String, 
			param: MEventManageraddClientStreamWithPasswordReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/addClientStreamWithPassword")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to add a new clientStream to an active live event and return the detail of the live event with
	 * the list of client streams and password.
	 * This service can be called only to ON AIR live events.
	 * ClientStreams can only contain [0-9a-zA-Z-_] characters
	 * @param tokenId : String
	 * @param param : MEventManageraddClientStreamsReq
	 * @return MResponseEventManagerDetail
	*/
	def addClientStreams(tokenId: String, 
			param: MEventManageraddClientStreamsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/addClientStreams")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to remove a clientStream from an active live event.
	 * This service can be called only to ON AIR live events.
	 * ClientStreams can only contain [0-9a-zA-Z-_] characters
	 * @param tokenId : String
	 * @param param : MEventManagerremoveClientStreamsReq
	 * @return MResponseEventManagerDetail
	*/
	def removeClientStreams(tokenId: String, 
			param: MEventManagerremoveClientStreamsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/removeClientStreams")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to switch the client stream in preview with another clientStream.
	 * This service can be called only to ON AIR live events.
	 * To remove from preview a clientStream, the "clientStreamInPreview" parameter must be blank.
	 * @param tokenId : String
	 * @param param : MEventManagerchangeClientStreamPreviewReq
	 * @return MResponseEventManagerDetail
	*/
	def changeClientStreamPreview(tokenId: String, 
			param: MEventManagerchangeClientStreamPreviewReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/changeClientStreamPreview")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to switch the client stream in muxing with another clientStream.
	 * This service can be called only to ON AIR live events.
	 * To remove from muxing a clientStream, the "clientStreamInMuxing" parameter must be blank.
	 * @param tokenId : String
	 * @param param : MEventManagerchangeClientStreamInMuxingReq
	 * @return MResponseEventManagerDetail
	*/
	def changeClientStreamInMuxing(tokenId: String, 
			param: MEventManagerchangeClientStreamInMuxingReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/changeClientStreamInMuxing")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * start to record the live event.
	 * @param tokenId : String
	 * @param param : MEventManagerstartRecordingReq
	 * @return MResponseEventManagerDetail
	*/
	def startRecording(tokenId: String, 
			param: MEventManagerstartRecordingReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/startRecording")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * stop to record the live event
	 * @param tokenId : String
	 * @param param : MEventManagerstopRecordingReq
	 * @return MResponseEventManagerDetail
	*/
	def stopRecording(tokenId: String, 
			param: MEventManagerstopRecordingReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/stopRecording")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManagerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManagerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service stop the live event, stop the event recorded (if started), and decommission the
	 * resources.The service can publish a new Video Content using the recorded file of the live event.
	 * @param tokenId : String
	 * @param param : MEventManagerstopLiveEventReq
	 * @return MResponseEventManager
	*/
	def stopLiveEvent(tokenId: String, 
			param: MEventManagerstopLiveEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManager ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManager = if(this.resourceEndpoint == ""){
			
				new MResponseEventManager()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanager/stopLiveEvent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventManager],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventManager])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}