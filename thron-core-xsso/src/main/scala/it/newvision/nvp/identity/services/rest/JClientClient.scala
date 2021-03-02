package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.client.MResponseDetailClient
import it.newvision.nvp.identity.services.model.request.MClientregisterReq
import it.newvision.nvp.identity.services.model.request.MClientupdateReq
import it.newvision.nvp.identity.services.model.client.MResponseClient
import it.newvision.nvp.identity.services.model.request.MClientremoveReq
import it.newvision.nvp.identity.services.model.request.MClientdetailReq
import it.newvision.nvp.identity.services.model.client.MResponseClientFindByProperties
import it.newvision.nvp.identity.services.model.request.MClientfindByPropertiesReq
import it.newvision.nvp.identity.services.model.client.MResponseGetAllClientsId
import it.newvision.nvp.identity.services.model.request.MClientupdateClientStatusReq
import it.newvision.nvp.identity.services.model.client.MResponseSiteAccelerationList
import it.newvision.nvp.identity.services.model.client.MResponseGetPlayerInfo
import it.newvision.nvp.identity.services.model.client.MResponseDelivery
import it.newvision.nvp.identity.services.model.request.MClientupdateDeliveryReq
import it.newvision.nvp.identity.services.model.request.MClientinitializeDeliveryReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JClientClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to admin (create, update, delete ..) a client in the platform.
 * This service is available only for internal use
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.com/api/adxsso/resources/client-
 * sso/</li>
 * </ul>
 */
class JClientClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Create a new client (service code) in the platform.
	 * @param tokenId : String
	 * @param param : MClientregisterReq
	 * @return MResponseDetailClient
	*/
	def register(tokenId: String, 
			param: MClientregisterReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseDetailClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseDetailClient = if(this.resourceEndpoint == ""){
			
				new MResponseDetailClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/register")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDetailClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * update the client information and properties for an existing client.
	 * @param tokenId : String
	 * @param param : MClientupdateReq
	 * @return MResponseDetailClient
	*/
	def update(tokenId: String, 
			param: MClientupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseDetailClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseDetailClient = if(this.resourceEndpoint == ""){
			
				new MResponseDetailClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/update")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDetailClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MClientremoveReq
	 * @return MResponseClient
	*/
	def remove(tokenId: String, 
			param: MClientremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseClient = if(this.resourceEndpoint == ""){
			
				new MResponseClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/remove")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MClientdetailReq
	 * @return MResponseDetailClient
	*/
	def detail(tokenId: String, 
			param: MClientdetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseDetailClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseDetailClient = if(this.resourceEndpoint == ""){
			
				new MResponseDetailClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDetailClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service returns all customers that meet the search criteria. fromdate todate are used to
	 * indicate the temporal range in which it was created in the client platform. All parameters are
	 * optional
	 * @param tokenId : String
	 * @param param : MClientfindByPropertiesReq
	 * @return MResponseClientFindByProperties
	*/
	def findByProperties(tokenId: String, 
			param: MClientfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseClientFindByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseClientFindByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseClientFindByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClientFindByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClientFindByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @return MResponseGetAllClientsId
	*/
	def getAllClientsId(tokenId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseGetAllClientsId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetAllClientsId = if(this.resourceEndpoint == ""){
			
				new MResponseGetAllClientsId()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/getAllClientsId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetAllClientsId])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetAllClientsId])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * set the client status to active or inactive.
	 * @param tokenId : String
	 * @param param : MClientupdateClientStatusReq
	 * @return MResponseClient
	*/
	def updateClientStatus(tokenId: String, 
			param: MClientupdateClientStatusReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseClient = if(this.resourceEndpoint == ""){
			
				new MResponseClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/updateClientStatus")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Return le list of hostname that the client has paid as in site acceleration. (Weebo service)
	 * @param tokenId : String
	 * @return MResponseSiteAccelerationList
	*/
	def getSiteAccelerationList(tokenId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseSiteAccelerationList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseSiteAccelerationList = if(this.resourceEndpoint == ""){
			
				new MResponseSiteAccelerationList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/getSiteAccelerationList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseSiteAccelerationList])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseSiteAccelerationList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Return the list of clientIs and player info for customer with a specific fix version. Clients
	 * without fixedPlayerVersion are filtered by the service.
	 * @param tokenId : String
	 * @return MResponseGetPlayerInfo
	*/
	def getPlayerInfo(tokenId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseGetPlayerInfo ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetPlayerInfo = if(this.resourceEndpoint == ""){
			
				new MResponseGetPlayerInfo()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/getPlayerInfo")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetPlayerInfo])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetPlayerInfo])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MClientupdateDeliveryReq
	 * @return MResponseDelivery
	*/
	def updateDelivery(tokenId: String, 
			param: MClientupdateDeliveryReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseDelivery ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseDelivery = if(this.resourceEndpoint == ""){
			
				new MResponseDelivery()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/updateDelivery")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDelivery],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDelivery])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MClientinitializeDeliveryReq
	 * @return MResponseDelivery
	*/
	def initializeDelivery(tokenId: String, 
			param: MClientinitializeDeliveryReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseDelivery ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientClient.client.resource(this.resourceEndpoint)
			val response : MResponseDelivery = if(this.resourceEndpoint == ""){
			
				new MResponseDelivery()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("client-sso/initializeDelivery")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDelivery],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDelivery])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}