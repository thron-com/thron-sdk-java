package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.liveEvents.MResponseEventDetail
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventdetailLiveEventReq
import it.newvision.nvp.xpublisher.services.model.request.MWeeboLiveEventupdatePublicHostnameEntriesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JWeeboLiveEventClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
class JWeeboLiveEventClient(val resourceEndpoint:String) {

	/**
	 * The service return all event details, about the event host.
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventdetailLiveEventReq
	 * @return MResponseEventDetail
	*/
	def detailLiveEvent(tokenId: String, 
			param: MWeeboLiveEventdetailLiveEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboLiveEventClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weeboliveevent/detailLiveEvent")
				
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
	 * the service update the public hostname entries. PublicHostname are used to provide the descriptor
	 * urls of the events.
	 * @param tokenId : String
	 * @param param : MWeeboLiveEventupdatePublicHostnameEntriesReq
	 * @return MResponseEventDetail
	*/
	def updatePublicHostnameEntries(tokenId: String, 
			param: MWeeboLiveEventupdatePublicHostnameEntriesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JWeeboLiveEventClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("weeboliveevent/updatePublicHostnameEntries")
				
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

}