package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppDetail
import it.newvision.nvp.xadmin.services.model.request.MAppsUtilscloneReq
import it.newvision.nvp.xadmin.services.model.request.MAppsUtilsupdateReq
import it.newvision.nvp.xadmin.services.model.request.MAppsUtilsupdateSubscriptionDataReq
import it.newvision.nvp.xadmin.services.model.request.MAppsUtilswhoisReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JAppsUtilsClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is used to manage the APP (4ME Apps) properties.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/adxadmin/resources/appsutils/ </li>
 * </ul>
 */
class JAppsUtilsClient(val resourceEndpoint:String) {

	/**
	 * Used to authenticate an App throught the appId or prettyId and return all details.
	 * Can be called only by superUsers
	 * Provides:
	 * <ul>
	 * 	<li>all app detail (metadata) </li>
	 * 	<li>the tokenId for the application, to use in the inside service call of the snippet </li>
	 * 	<li>the rootCategory of the linked App. </li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param appId : String
	 * Optional
	 * @return MResponseAppDetail
	*/
	def loginApp(tokenId: String, 
			clientId: String, 
			appId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAppDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsUtilsClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(appId).foreach(s => params.add("appId", s))
			val response : MResponseAppDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("appsutils/loginApp")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseAppDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Create a clone from an existing App.
	 * To be used for internal use only!
	 * Can be invoked only by SUPER USERS
	 * @param tokenId : String
	 * @param param : MAppsUtilscloneReq
	 * @return MResponseAppDetail
	*/
	def clone(tokenId: String, 
			param: MAppsUtilscloneReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAppDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsUtilsClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsutils/clone")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * low level service to update an App.
	 * Can be invoked only by SUPER USERS
	 * @param tokenId : String
	 * @param param : MAppsUtilsupdateReq
	 * @return MResponseAppDetail
	*/
	def update(tokenId: String, 
			param: MAppsUtilsupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAppDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsUtilsClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsutils/update")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * update the App subscription data.
	 * Can be invoked only by SUPER USERS
	 * @param tokenId : String
	 * @param param : MAppsUtilsupdateSubscriptionDataReq
	 * @return MResponseAppDetail
	*/
	def updateSubscriptionData(tokenId: String, 
			param: MAppsUtilsupdateSubscriptionDataReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAppDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsUtilsClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsutils/updateSubscriptionData")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the appId of a given token, if it is an app token
	 * @param tokenId : String
	 * @param param : MAppsUtilswhoisReq
	 * @return String
	*/
	def whois(tokenId: String, 
			param: MAppsUtilswhoisReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsUtilsClient.client.resource(this.resourceEndpoint)
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsutils/whois")
				
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[String],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[String])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}