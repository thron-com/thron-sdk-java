package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.identity.MResponseAccessLogin

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JAccessManagerClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service allow the user to login and logout in the platform.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xsso/resources/accessmanager</li>
 * </ul>
 */
class JAccessManagerClient(val resourceEndpoint:String) {

	/**
	 * Get a tokenId (access token) that authorize the user to make calls against API.
	 * Each <b>tokenId </b>is valid for a specific session time (1 hour), after that it's necessary to
	 * invoke the service to get a new key.
	 * <b>The service is protected by  account lockout policy.</b>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param password : String
	 * @return MResponseAccessLogin
	*/
	def login(tokenId: String, 
			clientId: String, 
			username: String, 
			password: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAccessLogin ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAccessManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(username).foreach(s => params.add("username", s))
		Option(password).foreach(s => params.add("password", s))  
			val response : MResponseAccessLogin = if(this.resourceEndpoint == ""){
			
				new MResponseAccessLogin()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("accessmanager/login")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseAccessLogin],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAccessLogin])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * The user can close the user session and invalidate the given tokenId.
	 * To make other calls, it's necessary to invoke the login service and get a new tokenId.
	 * @param tokenId : String
	 * @param clientId : String
	 * @return String
	*/
	def logout(tokenId: String, 
			clientId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAccessManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			  
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("accessmanager/logout")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[String],params)
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

	/**
	 * verify the session tokenId, if it is valid or expired.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * optional parameter. The service can validate the token and verify that the session token belongs to
	 * the given username
	 * @return MResponseAccessLogin
	*/
	def validateToken(tokenId: String, 
			clientId: String, 
			username: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAccessLogin ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAccessManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(username).foreach(s => params.add("username", s))  
			val response : MResponseAccessLogin = if(this.resourceEndpoint == ""){
			
				new MResponseAccessLogin()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("accessmanager/validateToken")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseAccessLogin],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAccessLogin])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * HTTP status 200 if the given capability (or list of capabilities) is active for the user (given
	 * tokenId) otherwise HTTP status 403.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param capabilities : String
	 * list of capabilities as comma separated values. If the list of capabilities has more that one value,
	 * all values should satisfies the validation.
	 * @return String
	*/
	def validateCapability(tokenId: String, 
			clientId: String, 
			capabilities: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAccessManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(capabilities).foreach(s => params.add("capabilities", s))  
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("accessmanager/validateCapability")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[String],params)
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

	/**
	 * return HTTP status 200  if the given role is active for the user in session (given tokenId)
	 * otherwise HTTP status 403.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param role : String
	 * list of roles (case insensitive) as comma separated values. If the list of roles has more that one
	 * value, all values should satisfies the validation.
	 * list of role delimited by pipes |.If the list of roles has more that one value, the validation
	 * should satisfy at least one value.
	 * 
	 * Example:
	 * [validate all]: CORE_CREATE_NEW_CONTENT,CORE_MANAGE_APPS
	 * [validate one]: CORE_CREATE_NEW_CONTENT|CORE_MANAGE_APPS

	 * @return String
	*/
	def validateRole(tokenId: String, 
			clientId: String, 
			role: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAccessManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(role).foreach(s => params.add("role", s))  
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("accessmanager/validateRole")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[String],params)
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