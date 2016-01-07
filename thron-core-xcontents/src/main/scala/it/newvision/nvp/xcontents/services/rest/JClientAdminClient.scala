package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.client.MResponseCreateClient
import it.newvision.nvp.xcontents.services.model.request.MClientAdmincreateClientReq
import it.newvision.nvp.xcontents.services.model.client.MResponseRemoveClient
import it.newvision.nvp.xcontents.services.model.request.MClientAdminremoveClientReq
import it.newvision.nvp.xcontents.services.model.client.MResponseDetailClientAdmin
import it.newvision.nvp.xcontents.services.model.request.MClientAdmindetailClientReq
import it.newvision.nvp.xcontents.services.model.client.MResponseFindClient
import it.newvision.nvp.xcontents.services.model.request.MClientAdminfindByPropertiesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JClientAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Used by administrator, not public 
 */
class JClientAdminClient(val resourceEndpoint:String) {

	/**
	 * @param tokenId : String
	 * @param param : MClientAdmincreateClientReq
	 * @return MResponseCreateClient
	*/
	def createClient(tokenId: String, 
			param: MClientAdmincreateClientReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCreateClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseCreateClient = if(this.resourceEndpoint == ""){
			
				new MResponseCreateClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("clientadmin/createClient")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCreateClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCreateClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MClientAdminremoveClientReq
	 * @return MResponseRemoveClient
	*/
	def removeClient(tokenId: String, 
			param: MClientAdminremoveClientReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRemoveClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseRemoveClient = if(this.resourceEndpoint == ""){
			
				new MResponseRemoveClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("clientadmin/removeClient")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseRemoveClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRemoveClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * all Client detail information with the attached collection populated
	 * @param tokenId : String
	 * @param param : MClientAdmindetailClientReq
	 * @return MResponseDetailClientAdmin
	*/
	def detailClient(tokenId: String, 
			param: MClientAdmindetailClientReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDetailClientAdmin ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseDetailClientAdmin = if(this.resourceEndpoint == ""){
			
				new MResponseDetailClientAdmin()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("clientadmin/detailClient")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDetailClientAdmin],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailClientAdmin])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * return the list of clients but with the attached collection empty (for performance problem)
	 * @param tokenId : String
	 * @param param : MClientAdminfindByPropertiesReq
	 * @return MResponseFindClient
	*/
	def findByProperties(tokenId: String, 
			param: MClientAdminfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseFindClient ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindClient = if(this.resourceEndpoint == ""){
			
				new MResponseFindClient()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("clientadmin/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindClient],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindClient])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}