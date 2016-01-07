package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.packager.MResponsePackager
import it.newvision.nvp.xpackager.services.model.request.MDownloaderQueueremoveTaskReq
import it.newvision.nvp.xpackager.services.model.queue.MResponseDownloaderQueue
import it.newvision.nvp.xpackager.services.model.request.MDownloaderQueueshowQueueReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JDownloaderQueueClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * The DownloaderQueue service is used to show the list of download task in queue
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST: http://clientId-view.4me.it/api/adxpackager/resources/application.
 * wadl </li>
 * </ul>
 */
class JDownloaderQueueClient(val resourceEndpoint:String) {

	/**
	 * Remove a task from the queue
	 * @param tokenId : String
	 * @param param : MDownloaderQueueremoveTaskReq
	 * @return MResponsePackager
	*/
	def removeTask(tokenId: String, 
			param: MDownloaderQueueremoveTaskReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePackager ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDownloaderQueueClient.client.resource(this.resourceEndpoint)
			val response : MResponsePackager = if(this.resourceEndpoint == ""){
			
				new MResponsePackager()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("downloaderqueue/removeTask")
				
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
	 * Show all download tasks in queue
	 * @param tokenId : String
	 * @param param : MDownloaderQueueshowQueueReq
	 * @return MResponseDownloaderQueue
	*/
	def showQueue(tokenId: String, 
			param: MDownloaderQueueshowQueueReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDownloaderQueue ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDownloaderQueueClient.client.resource(this.resourceEndpoint)
			val response : MResponseDownloaderQueue = if(this.resourceEndpoint == ""){
			
				new MResponseDownloaderQueue()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("downloaderqueue/showQueue")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDownloaderQueue],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDownloaderQueue])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}