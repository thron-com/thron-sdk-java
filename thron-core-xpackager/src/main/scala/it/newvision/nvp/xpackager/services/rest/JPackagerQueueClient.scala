package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.packager.MResponsePackager
import it.newvision.nvp.xpackager.services.model.request.MPackagerQueueremoveTaskReq
import it.newvision.nvp.xpackager.services.model.queue.MResponsePackagerQueue
import it.newvision.nvp.xpackager.services.model.request.MPackagerQueueshowQueueReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPackagerQueueClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * 
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST: http://clientId-view.4me.it/api/adxpackager/resources/application.
 * wadl </li>
 * </ul>
 */
class JPackagerQueueClient(val resourceEndpoint:String) {

	/**
	 * Remove a task from the queue
	 * @param tokenId : String
	 * @param param : MPackagerQueueremoveTaskReq
	 * @return MResponsePackager
	*/
	def removeTask(tokenId: String, 
			param: MPackagerQueueremoveTaskReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePackager ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerQueueClient.client.resource(this.resourceEndpoint)
			val response : MResponsePackager = if(this.resourceEndpoint == ""){
			
				new MResponsePackager()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packagerqueue/removeTask")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePackager],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePackager])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Show all packager tasks in queue
	 * @param tokenId : String
	 * @param param : MPackagerQueueshowQueueReq
	 * @return MResponsePackagerQueue
	*/
	def showQueue(tokenId: String, 
			param: MPackagerQueueshowQueueReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePackagerQueue ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPackagerQueueClient.client.resource(this.resourceEndpoint)
			val response : MResponsePackagerQueue = if(this.resourceEndpoint == ""){
			
				new MResponsePackagerQueue()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("packagerqueue/showQueue")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePackagerQueue],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePackagerQueue])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}