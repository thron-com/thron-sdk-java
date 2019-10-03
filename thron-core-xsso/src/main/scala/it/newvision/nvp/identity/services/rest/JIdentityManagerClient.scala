package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.identity.MResponseLogin
import it.newvision.nvp.identity.services.model.request.MIdentityManagerloginWithDetailReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JIdentityManagerClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Deprecated by AccessManager services.
 * 
 * This service allow the user to login and logout in to the platform, as
 * necessary step.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xsso/resources/identitymanager/</li>
 * </ul>
 */
class JIdentityManagerClient(val resourceEndpoint:String) {

	/**
	 * Validate a specific capability for the give username liked to the tokenId
	 * @param clientId : String
	 * @param tokenId : String
	 * @param capability : String
	 * @return String
	*/
	def capabilitiesValidation(clientId: String, 
			tokenId: String, 
			capability: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
						try{
							val webResource = JIdentityManagerClient.client.resource(this.resourceEndpoint)
							val params = new com.sun.jersey.core.util.MultivaluedMapImpl
							params.add("clientId", clientId)
							params.add("tokenId", tokenId)
							params.add("capability", capability)
							val response : String = webResource
							.path("identitymanager/capabilitiesValidation")
							.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
							.`type`(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
							.post(classOf[String],params)          
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

	/**
	 * @param clientId : String
	 * @param username : String
	 * @param password : String
	 * @return String
	*/
	def login(clientId: String, 
			username: String, 
			password: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		                  try{
		                	val webResource = JIdentityManagerClient.client.resource(this.resourceEndpoint)
		                	val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		                		params.add("clientId", clientId)
		                	val response : String = webResource
		                		.path("identitymanager/login")
		                		.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
		                		.`type`(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
								.header("X-USERNAME",username)
								.header("X-PASSWORD",password)
		                		.post(classOf[String],params)
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

	/**
	 * Deprecated by <b>AccessManager.login</b>
	 * 
	 * Check the authentication for a given clientId, using the username and password of a registered user
	 * (only for PLATFORM_USER and PLATFORM_USER_GUEST).
	 * The function return a <b>tokenId </b>key to use as header param in all different WEB Services.
	 * Each <b>tokenId </b>is valid for a specific session time, after that it's necessary to call the
	 * login service that provide a new tokenId.
	 * <b>The service is protected by  account lockout policy.</b>
	 * @param tokenId : String
	 * @param param : MIdentityManagerloginWithDetailReq
	 * @return MResponseLogin
	*/
	def loginWithDetail(tokenId: String, 
			param: MIdentityManagerloginWithDetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLogin ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIdentityManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseLogin = if(this.resourceEndpoint == ""){
			
				new MResponseLogin()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("identitymanager/loginWithDetail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLogin],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLogin])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * logout service. With this service the user can close the open user session and invalidate the given
	 * tokenId. After this call, a new login call is required to use the web services
	 * @param clientId : String
	 * @param tokenId : String
	 * @return String
	*/
	def logout(clientId: String, 
			tokenId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		                  try{
		                	val webResource = JIdentityManagerClient.client.resource(this.resourceEndpoint)
		                	val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		                		params.add("clientId", clientId)
		                	val response : String = webResource
		                		.path("identitymanager/logout")
		                		.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
		                		.`type`(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
								.header("X-TOKENID",tokenId)
		                		.post(classOf[String],params)
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

	/**
	 * Validate a specific role for the give username linked to the tokenId
	 * @param clientId : String
	 * @param tokenId : String
	 * @param role : String
	 * @return String
	*/
	def roleValidation(clientId: String, 
			tokenId: String, 
			role: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
						try{
		                	val webResource = JIdentityManagerClient.client.resource(this.resourceEndpoint)
		                	val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		                		params.add("clientId", clientId)
								params.add("tokenId", tokenId)
								params.add("role", role)
		                	val response : String = webResource
		                		.path("identitymanager/roleValidation")
		                		.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
		                		.`type`(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
		                		.post(classOf[String],params)
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

	/**
	 * the service return an exception if the token is expired otherwise no data
	 * @param clientId : String
	 * @param tokenId : String
	 * @return String
	*/
	def validateToken(clientId: String, 
			tokenId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
		        try{
		          val webResource = JIdentityManagerClient.client.resource(this.resourceEndpoint)
		          val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		          params.add("clientId", clientId)
		          params.add("tokenId", tokenId)
		          val response : String = webResource
		          .path("identitymanager/validateToken")
		          .accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
		          .`type`(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
		          .post(classOf[String],params)
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