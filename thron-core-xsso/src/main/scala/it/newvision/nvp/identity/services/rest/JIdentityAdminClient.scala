package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MCredentialFull
import it.newvision.nvp.identity.services.model.request.MIdentityAdmingetClientOSInfoReq
import it.newvision.nvp.identity.services.model.identity.MResponseActiveSessions
import it.newvision.nvp.identity.services.model.request.MIdentityAdmingetActiveSessionsReq
import it.newvision.nvp.identity.services.model.request.MIdentityAdminwhoisReq
import it.newvision.nvp.identity.services.model.identity.MResponseIdentity
import it.newvision.nvp.identity.services.model.request.MIdentityAdmincleanupSessionsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JIdentityAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/adxsso/resources/identityadmin/</li>
 * </ul>
 */
class JIdentityAdminClient(val resourceEndpoint:String) {

	/**
	 * return the operating system user information (username and password).
	 * These information are used in the components like xpackager and xpublisher
	 * @param tokenId : String
	 * @param param : MIdentityAdmingetClientOSInfoReq
	 * @return MCredentialFull
	*/
	def getClientOSInfo(tokenId: String, 
			param: MIdentityAdmingetClientOSInfoReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MCredentialFull ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIdentityAdminClient.client.resource(this.resourceEndpoint)
			val response : MCredentialFull = if(this.resourceEndpoint == ""){
			
				new MCredentialFull()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("identityadmin/getClientOSInfo")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MCredentialFull],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MCredentialFull])
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
		                	val webResource = JIdentityAdminClient.client.resource(this.resourceEndpoint)
		                	val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		                		params.add("clientId", clientId)
		                	val response : String = webResource
		                		.path("identityadmin/login")
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
	 * create a new administration token (administration session with no restrictions).
	 * Use it carefully!!!
	 * @param tokenId : String
	 * @param username : String
	 * @return String
	*/
	def newSuperAdminToken(tokenId: String, 
			username: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIdentityAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(username).foreach(s => params.add("username", s))  
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("identityadmin/newSuperAdminToken")
				
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
	 * used to impersonate another user. The service can be invoked only by a superToken and return a new
	 * valid token for the specified user if exists.
	 * Specifing the adminSession parameter to true, it is possible to creare an administration session
	 * for the given user (Use it carefully!!!)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param adminSession : Boolean
	 * used to create a new administration session for the given user.
	 * If true the new user session is an administrator session with all permissions.
	 * Use it carefully!!!
	 * @return String
	*/
	def su(tokenId: String, 
			clientId: String, 
			username: String, 
			adminSession: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIdentityAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(username).foreach(s => params.add("username", s))
		Option(adminSession).foreach(s => params.add("adminSession", s))  
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("identityadmin/su")
				
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
	 * used to create an administrative session for the given token (user token). The service return a new
	 * token for the given user.
	 * @param tokenId : String
	 * @param clientId : String
	 * @return String
	*/
	def su2(tokenId: String, 
			clientId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIdentityAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))  
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("identityadmin/su2")
				
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
	 * return the hashed password of the given username.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @return String
	*/
	def getHashedPassword(tokenId: String, 
			clientId: String, 
			username: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIdentityAdminClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(username).foreach(s => params.add("username", s))
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("identityadmin/getHashedPassword")
				
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[String])
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
	 * Used to get the list of active session in 4me platform.
	 * No token is required.
	 * @param tokenId : String
	 * @param param : MIdentityAdmingetActiveSessionsReq
	 * @return MResponseActiveSessions
	*/
	def getActiveSessions(tokenId: String, 
			param: MIdentityAdmingetActiveSessionsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseActiveSessions ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIdentityAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseActiveSessions = if(this.resourceEndpoint == ""){
			
				new MResponseActiveSessions()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("identityadmin/getActiveSessions")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseActiveSessions],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseActiveSessions])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * return the username for the given tokenId.
	 * The service works only with user sessions (no secret sessions)
	 * @param tokenId : String
	 * @param param : MIdentityAdminwhoisReq
	 * @return String
	*/
	def whois(tokenId: String, 
			param: MIdentityAdminwhoisReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIdentityAdminClient.client.resource(this.resourceEndpoint)
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("identityadmin/whois")
				
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

	/**
	 * Cleans up all non-secret sessions.
	 * Can be invoked only by a superToken
	 * @param tokenId : String
	 * @param param : MIdentityAdmincleanupSessionsReq
	 * @return MResponseIdentity
	*/
	def cleanupSessions(tokenId: String, 
			param: MIdentityAdmincleanupSessionsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseIdentity ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIdentityAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseIdentity = if(this.resourceEndpoint == ""){
			
				new MResponseIdentity()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("identityadmin/cleanupSessions")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseIdentity],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseIdentity])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}