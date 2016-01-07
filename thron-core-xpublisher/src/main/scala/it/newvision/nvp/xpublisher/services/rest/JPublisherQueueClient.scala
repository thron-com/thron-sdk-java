package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.queue.MResponsePublisherQueue
import it.newvision.nvp.xpublisher.services.model.request.MPublisherQueueshowQueueReq
import it.newvision.nvp.xpublisher.services.model.response.MResponsePublisher
import it.newvision.nvp.xpublisher.services.model.request.MPublisherQueueremoveTaskReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPublisherQueueClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST: http://clientId-view.4me.it/api/adxpublisher/resources/application.
 * wadl</li>
 * </ul>
 */
class JPublisherQueueClient(val resourceEndpoint:String) {

	/**
	 * Show all publisher tasks in queue
	 * @param tokenId : String
	 * @param param : MPublisherQueueshowQueueReq
	 * @return MResponsePublisherQueue
	*/
	def showQueue(tokenId: String, 
			param: MPublisherQueueshowQueueReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublisherQueue ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublisherQueueClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublisherQueue = if(this.resourceEndpoint == ""){
			
				new MResponsePublisherQueue()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publisherqueue/showQueue")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublisherQueue],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublisherQueue])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove a task from the queue
	 * @param tokenId : String
	 * @param param : MPublisherQueueremoveTaskReq
	 * @return MResponsePublisher
	*/
	def removeTask(tokenId: String, 
			param: MPublisherQueueremoveTaskReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublisher ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublisherQueueClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublisher = if(this.resourceEndpoint == ""){
			
				new MResponsePublisher()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publisherqueue/removeTask")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublisher],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublisher])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}