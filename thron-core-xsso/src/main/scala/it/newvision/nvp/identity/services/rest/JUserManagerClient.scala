package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.user.MResponseUser
import it.newvision.nvp.identity.services.model.request.MUserManagercreateReq
import it.newvision.nvp.identity.services.model.user.MResponseUserDetail
import it.newvision.nvp.identity.services.model.request.MUserManagerdetailReq
import it.newvision.nvp.identity.services.model.user.MResponseUserFindByProperties
import it.newvision.nvp.identity.services.model.request.MUserManagerfindByPropertiesReq
import it.newvision.nvp.identity.services.model.user.MResponseUserNumberOfUsers
import it.newvision.nvp.identity.services.model.user.MResponseUserAllUsername

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JUserManagerClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service provides the low level function to create new user , and store the
 * username and password necessary for the authentication services.
 * 
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xsso/resources/usermanager</li>
 * </ul>
 */
class JUserManagerClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * DEPRECATED
	 * @param tokenId : String
	 * @param param : MUserManagercreateReq
	 * @return MResponseUser
	*/
	@Deprecated
	def create(tokenId: String, 
			param: MUserManagercreateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUser = if(this.resourceEndpoint == ""){
			
				new MResponseUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usermanager/create")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUser],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUser])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Deprecated -> Use JVuserManager.detail service
	 * 
	 * return the user detail information and the list of available Capabilities
	 * @param tokenId : String
	 * @param param : MUserManagerdetailReq
	 * @return MResponseUserDetail
	*/
	@Deprecated
	def detail(tokenId: String, 
			param: MUserManagerdetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUserDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUserDetail = if(this.resourceEndpoint == ""){
			
				new MResponseUserDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usermanager/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUserDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUserDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Deprecated -> Use JVuserManager.findByProperties
	 * @param tokenId : String
	 * @param param : MUserManagerfindByPropertiesReq
	 * @return MResponseUserFindByProperties
	*/
	@Deprecated
	def findByProperties(tokenId: String, 
			param: MUserManagerfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUserFindByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUserFindByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseUserFindByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usermanager/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUserFindByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUserFindByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Return the total number of users registered in the platform
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseUserNumberOfUsers
	*/
	def numberOfUsers(tokenId: String, 
			clientId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUserNumberOfUsers ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUserManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
			val response : MResponseUserNumberOfUsers = if(this.resourceEndpoint == ""){
			
				new MResponseUserNumberOfUsers()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("usermanager/numberOfUsers")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseUserNumberOfUsers])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUserNumberOfUsers])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Return the complete list of all users (username only) registered in the platform
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseUserAllUsername
	*/
	def getAllUsername(tokenId: String, 
			clientId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUserAllUsername ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUserManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
			val response : MResponseUserAllUsername = if(this.resourceEndpoint == ""){
			
				new MResponseUserAllUsername()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("usermanager/getAllUsername")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseUserAllUsername])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUserAllUsername])
				}
				else {
					throw e
				}
			
		  }
	
	}

}