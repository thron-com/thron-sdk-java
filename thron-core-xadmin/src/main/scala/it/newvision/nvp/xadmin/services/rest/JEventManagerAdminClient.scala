package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.eventmanager.MResponseEventManagerDetail
import it.newvision.nvp.xadmin.services.model.request.MEventManagerAdminstartEventReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JEventManagerAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service define all functions to manage a live event:
 * <ul>
 * 	<li>start and stop a live event</li>
 * 	<li>manage the preview stream on ON AIR Live events</li>
 * 	<li>manage the stream to show in live event</li>
 * 	<li>add and remove new input streams</li>
 * </ul>
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>WADL REST service: http://clientId-view.4me.
 * it/api/xadmin/resources/application.wadl</li>
 * </ul>
 */
class JEventManagerAdminClient(val resourceEndpoint:String) {

	/**
	 * the service starts the necessary resources for a new live event.
	 * The operation is asynchronous and the live event will be active when the media content is in status
	 * PUBLISHED.
	 * A Live Event is like the other 4ME Contents, and when the media content is in state PUBLISHED means
	 * that the live event is ready/on air, otherwise the live event is not active.
	 * 
	 * Live Events, and AWS Account:
	 * The new live event instance is created in one of the configured AWS Account following this priority:
	 * 
	 * <ul>
	 * 	<li>dedicated account: specific aws account for the client</li>
	 * 	<li>shared aws account with the EC2 service enabled</li>
	 * </ul>
	 * 
	 * The AWS accounts are configured with the service xsso.JPlatform in the view-platform console.
	 * @param tokenId : String
	 * @param param : MEventManagerAdminstartEventReq
	 * @return MResponseEventManagerDetail
	*/
	def startEvent(tokenId: String, 
			param: MEventManagerAdminstartEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEventManagerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JEventManagerAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseEventManagerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEventManagerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("eventmanageradmin/startEvent")
				
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

}