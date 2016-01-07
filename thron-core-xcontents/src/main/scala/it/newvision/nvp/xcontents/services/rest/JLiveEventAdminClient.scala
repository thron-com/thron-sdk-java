package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.liveEvent.MResponseLiveEventCreate
import it.newvision.nvp.xcontents.services.model.request.MLiveEventAdmincreateReq
import it.newvision.nvp.xcontents.services.model.liveEvent.MResponseLiveEventUpdate
import it.newvision.nvp.xcontents.services.model.request.MLiveEventAdminupdateReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JLiveEventAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Used to create specific live Events contents.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/adxcontents/resources/liveevent/ </li>
 * </ul>
 */
class JLiveEventAdminClient(val resourceEndpoint:String) {

	/**
	 * create a new live event
	 * @param tokenId : String
	 * @param param : MLiveEventAdmincreateReq
	 * @return MResponseLiveEventCreate
	*/
	def create(tokenId: String, 
			param: MLiveEventAdmincreateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLiveEventCreate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JLiveEventAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseLiveEventCreate = if(this.resourceEndpoint == ""){
			
				new MResponseLiveEventCreate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("liveeventadmin/create")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLiveEventCreate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLiveEventCreate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * update a live event 
	 * @param tokenId : String
	 * @param param : MLiveEventAdminupdateReq
	 * @return MResponseLiveEventUpdate
	*/
	def update(tokenId: String, 
			param: MLiveEventAdminupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLiveEventUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JLiveEventAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseLiveEventUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseLiveEventUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("liveeventadmin/update")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLiveEventUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLiveEventUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}