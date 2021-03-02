package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.visits.MResponseVisits
import it.newvision.nvp.webtv.services.model.request.MVisitsresetVisitCounterReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JVisitsClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is used to push a new visit for a content.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/visits</li>
 * </ul>
 */
class JVisitsClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * reset the visit counter for a specific content
	 * @param tokenId : String
	 * @param param : MVisitsresetVisitCounterReq
	 * @return MResponseVisits
	*/
	def resetVisitCounter(tokenId: String, 
			param: MVisitsresetVisitCounterReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseVisits ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVisitsClient.client.resource(this.resourceEndpoint)
			val response : MResponseVisits = if(this.resourceEndpoint == ""){
			
				new MResponseVisits()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("visits/resetVisitCounter")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVisits],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVisits])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * This function increment the Content View counter, and is used to register the number of visits for
	 * of a content.
	 * Authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @param pkey : String
	 * Optional.
	 * @return MResponseVisits
	*/
	def incrementVisits(tokenId: String, 
			clientId: String, 
			contentId: String, 
			categoryIdForAcl: String, 
			pkey: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseVisits ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVisitsClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))
		Option(pkey).foreach(s => params.add("pkey", s))  
			val response : MResponseVisits = if(this.resourceEndpoint == ""){
			
				new MResponseVisits()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("visits/incrementVisits")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseVisits],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVisits])
				}
				else {
				  throw e
				}
		  }
	
	}

}