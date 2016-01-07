package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.liveEvents.MResponseEventDetail
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventAdmincreateNewLiveEventReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventAdminupdateLiveEventReq
import it.newvision.nvp.xpublisher.services.model.response.MResponsePublisher
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventAdminremoveLiveEventReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JWeeboLiveEventAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * the WeeboPublish service handle the publishing functions for the different
 * channels. It is possible to publish the content for STREAM (VOD) or WEB (HTTP).
 * 
 * The publisher keep the same file name as saved by the packager, but it can
 * change the destination filename if it find another file with the same name in
 * the target  directory.
 * The publisher never overwrite an existing published content.
 * The "update" function is handled by the publisher once the user is publishing a
 * content for an existing contentID.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST: http://<clientId>-view.4me.it/api/adxpublisher/resources/application.
 * wadl</li>
 * 	<li>WSDL:http://<clientId>-view.4me.
 * it/api/adxpublisher/services/FWeeboPublisher?wsdl</li>
 * </ul>
 */
class JWeeboLiveEventAdminClient(val resourceEndpoint:String) {

	/**
	 * default function to create a new live event content in Weebo. The content is published in the
	 * WEB(Http) channel. 
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventAdmincreateNewLiveEventReq
	 * @return MResponseEventDetail
	*/
	def createNewLiveEvent(tokenId: String, 
			param: MWeeboLiveEventAdmincreateNewLiveEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboLiveEventAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weeboliveeventadmin/createNewLiveEvent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventAdminupdateLiveEventReq
	 * @return MResponseEventDetail
	*/
	def updateLiveEvent(tokenId: String, 
			param: MWeeboLiveEventAdminupdateLiveEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboLiveEventAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weeboliveeventadmin/updateLiveEvent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEventDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEventDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventAdminremoveLiveEventReq
	 * @return MResponsePublisher
	*/
	def removeLiveEvent(tokenId: String, 
			param: MWeeboLiveEventAdminremoveLiveEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublisher ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboLiveEventAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublisher = if(this.resourceEndpoint == ""){
			
				new MResponsePublisher()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weeboliveeventadmin/removeLiveEvent")
				
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