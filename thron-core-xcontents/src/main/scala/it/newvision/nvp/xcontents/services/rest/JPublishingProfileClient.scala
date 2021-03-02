package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.publishingProfile.MPublishingProfileListResponse
import it.newvision.nvp.xcontents.services.model.publishingProfile.MEPublishingProfileStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPublishingProfileClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to manage Publishing Profile settings.
 * A Publishing profile is an aggregate of channel used for the process of
 * ingestion. The active profile is used for ingestion actually.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/publishingprofile/
 */
class JPublishingProfileClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * Required. The id of client.
	 * @param status : MEPublishingProfileStatus
	 * Optional. Filter channel by state. Only one can be active.
	 * @return MPublishingProfileListResponse
	*/
	def list(tokenId: String, 
			clientId: String, 
			status: MEPublishingProfileStatus)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MPublishingProfileListResponse ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishingProfileClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(status).foreach(s => params.add("status", s))
			val response : MPublishingProfileListResponse = if(this.resourceEndpoint == ""){
			
				new MPublishingProfileListResponse()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("publishingprofile/list")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MPublishingProfileListResponse])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MPublishingProfileListResponse])
				}
				else {
					throw e
				}
			
		  }
	
	}

}