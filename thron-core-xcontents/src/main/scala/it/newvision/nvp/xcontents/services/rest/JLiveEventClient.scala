package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.liveEvent.MResponseLiveEventUpdate
import it.newvision.nvp.xcontents.services.model.request.MLiveEventupdateReq
import it.newvision.nvp.xcontents.services.model.liveEvent.MResponseLiveEventDetail
import it.newvision.nvp.xcontents.services.model.liveEvent.MResponseLiveEventFindByProperties
import it.newvision.nvp.xcontents.services.model.request.MLiveEventfindByPropertiesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JLiveEventClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Used to get information on live Event contents
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/liveevent/    </li>
 * </ul>
 */
class JLiveEventClient(val resourceEndpoint:String) {

	/**
	 * update a live event content
	 * @param tokenId : String
	 * @param param : MLiveEventupdateReq
	 * @return MResponseLiveEventUpdate
	*/
	def update(tokenId: String, 
			param: MLiveEventupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLiveEventUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JLiveEventClient.client.resource(this.resourceEndpoint)
			val response : MResponseLiveEventUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseLiveEventUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("liveevent/update")
				
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

	/**
	 * return all content information for the live event
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param locale : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseLiveEventDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			contentId: String, 
			locale: String, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLiveEventDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JLiveEventClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))
			val response : MResponseLiveEventDetail = if(this.resourceEndpoint == ""){
			
				new MResponseLiveEventDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("liveevent/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseLiveEventDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLiveEventDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * The liveEvent find by properties return a list of LiveEvents, all information about the events.
	 * @param tokenId : String
	 * @param param : MLiveEventfindByPropertiesReq
	 * @return MResponseLiveEventFindByProperties
	*/
	def findByProperties(tokenId: String, 
			param: MLiveEventfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLiveEventFindByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JLiveEventClient.client.resource(this.resourceEndpoint)
			val response : MResponseLiveEventFindByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseLiveEventFindByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("liveevent/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLiveEventFindByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLiveEventFindByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}