package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseMediaContent
import it.newvision.nvp.xadmin.services.model.request.MAdminAdminremoveClientInComponentsReq
import it.newvision.nvp.xadmin.services.model.request.MAdminAdmincheckAndFixContentsReq
import it.newvision.nvp.xadmin.services.model.request.MAdminAdminmigrateDomainReq
import it.newvision.nvp.xadmin.services.model.request.MAdminAdminsetupClientReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JAdminAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used by the platform administration consol to handle the client service
 * id in all different components (xcontent, xpackager, xadmin, xpublisher...)
 */
class JAdminAdminClient(val resourceEndpoint:String) {

	/**
	 * remove the client object in all different components (xcontent, xadmin, xpublisher ...)
	 * remove all data in database about the specified clientId!!!
	 * @param tokenId : String
	 * @param param : MAdminAdminremoveClientInComponentsReq
	 * @return MResponseMediaContent
	*/
	def removeClientInComponents(tokenId: String, 
			param: MAdminAdminremoveClientInComponentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAdminAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseMediaContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("adminadmin/removeClientInComponents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMediaContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMediaContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * used to find the contents in issue (publishing in process for a long time or with an ingestion in
	 * queue because is waiting a download file that does not exists...).
	 * This service is called by the maintenance server, and is synchronous. Only one single call can work
	 * in a time.
	 * @param tokenId : String
	 * @param param : MAdminAdmincheckAndFixContentsReq
	 * @return MResponseMediaContent
	*/
	def checkAndFixContents(tokenId: String, 
			param: MAdminAdmincheckAndFixContentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAdminAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseMediaContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("adminadmin/checkAndFixContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMediaContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMediaContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Migrates a client to THRON domain
	 * @param tokenId : String
	 * @param param : MAdminAdminmigrateDomainReq
	 * @return MResponseMediaContent
	*/
	def migrateDomain(tokenId: String, 
			param: MAdminAdminmigrateDomainReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAdminAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseMediaContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("adminadmin/migrateDomain")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMediaContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMediaContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * used to initialise the environment for a new clientId:
	 * * ldap
	 * * cf distributions
	 * * dns
	 * * folders
	 * ...
	 * 
	 * The client should be in status DRAFT.
	 * @param tokenId : String
	 * @param param : MAdminAdminsetupClientReq
	 * @return MResponseMediaContent
	*/
	def setupClient(tokenId: String, 
			param: MAdminAdminsetupClientReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAdminAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseMediaContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("adminadmin/setupClient")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMediaContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMediaContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}