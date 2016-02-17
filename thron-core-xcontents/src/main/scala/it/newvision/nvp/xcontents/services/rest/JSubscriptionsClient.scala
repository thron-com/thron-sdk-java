package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.uservalues.MResponseSubscription
import it.newvision.nvp.xcontents.services.model.request.MSubscriptionscategorySubscriptionReq
import it.newvision.nvp.xcontents.services.model.uservalues.MResponseCategoriesSubscription
import it.newvision.nvp.xcontents.services.model.request.MSubscriptionscategoriesSubscriptionReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JSubscriptionsClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Services used by subscribe a user to contents or categories changes.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/subscriptions/</li>
 * </ul>
 */
class JSubscriptionsClient(val resourceEndpoint:String) {

	/**
	 * the user that invoke the service will subscribe or unsubscribe to category notifications
	 * @param tokenId : String
	 * @param param : MSubscriptionscategorySubscriptionReq
	 * @return MResponseSubscription
	*/
	def categorySubscription(tokenId: String, 
			param: MSubscriptionscategorySubscriptionReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseSubscription ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSubscriptionsClient.client.resource(this.resourceEndpoint)
			val response : MResponseSubscription = if(this.resourceEndpoint == ""){
			
				new MResponseSubscription()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("subscriptions/categorySubscription")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseSubscription],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseSubscription])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * the user that invoke the service will subscribe or unsubscribe to categories notifications. It is
	 * also possible to subscribe or unsubscribe users you have the rights to modify
	 * @param tokenId : String
	 * @param param : MSubscriptionscategoriesSubscriptionReq
	 * @return MResponseCategoriesSubscription
	*/
	def categoriesSubscription(tokenId: String, 
			param: MSubscriptionscategoriesSubscriptionReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCategoriesSubscription ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSubscriptionsClient.client.resource(this.resourceEndpoint)
			val response : MResponseCategoriesSubscription = if(this.resourceEndpoint == ""){
			
				new MResponseCategoriesSubscription()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("subscriptions/categoriesSubscription")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCategoriesSubscription],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCategoriesSubscription])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}