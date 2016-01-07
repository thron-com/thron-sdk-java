package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.sync.MResponseContentLastUpdated
import it.newvision.nvp.webtv.services.model.request.MSynclastUpdatedContentsReq
import it.newvision.nvp.webtv.services.model.request.MSynccontentsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JSyncClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used for integration with external systems.
 * The purpose of the service is to provide a list of changes that have been
 * occurred in the platform in such a way to maintain synchronized an external
 * system. The Service avoid ACL restrictions.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/sync/
 * </li>
 * </ul>
 */
class JSyncClient(val resourceEndpoint:String) {

	/**
	 * Deprecated by JSync.contents!
	 * 
	 * The service returns the list of contents modified inside a specified date range (only for IMAGE,
	 * NDOC, OTHER, DOCUMENT, PLAYLIST, AUDIO, VIDEO content Type).
	 * The response provides all metadata information and the list of ids (contentsRemoved) of the
	 * contents removed after that date. The service return also the deliveryInformation with the content
	 * url and the list of thumbnails.
	 * The service does not return the list of comments linked to the content.
	 * @param tokenId : String
	 * @param param : MSynclastUpdatedContentsReq
	 * @return MResponseContentLastUpdated
	*/
	@Deprecated
	def lastUpdatedContents(tokenId: String, 
			param: MSynclastUpdatedContentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentLastUpdated ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSyncClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentLastUpdated = if(this.resourceEndpoint == ""){
			
				new MResponseContentLastUpdated()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sync/lastUpdatedContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentLastUpdated],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentLastUpdated])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service returns the list of contents modified inside a specified date range (only for IMAGE,
	 * NDOC, OTHER, DOCUMENT, PLAYLIST, AUDIO, VIDEO content Type).
	 * The response provides all metadata information and the list of ids (contentsRemoved) of the
	 * contents removed after that date. The service return also the deliveryInformation with the content
	 * url and the list of thumbnails.
	 * The service does not return the list of comments linked to the content.
	 * The service provide all contents without ACL restrictions.
	 * 
	 * Suggested parametes:
	 * <ul>
	 * 	<li>fromDate = "now" -1 minute</li>
	 * 	<li>toDate = fromDate - 10minutes</li>
	 * </ul>
	 * Service call frequency: the service should be called every 2 minutes.
	 * @param tokenId : String
	 * @param param : MSynccontentsReq
	 * @return MResponseContentLastUpdated
	*/
	def contents(tokenId: String, 
			param: MSynccontentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentLastUpdated ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSyncClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentLastUpdated = if(this.resourceEndpoint == ""){
			
				new MResponseContentLastUpdated()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sync/contents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentLastUpdated],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentLastUpdated])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}