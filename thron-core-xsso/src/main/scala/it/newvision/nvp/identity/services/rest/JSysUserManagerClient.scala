package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.user.MResponseUser
import it.newvision.nvp.identity.services.model.request.MSysUserManagercreateReq
import it.newvision.nvp.identity.services.model.request.MSysUserManagerupdateReq
import it.newvision.nvp.identity.services.model.request.MSysUserManagerchangeUserStatusReq
import it.newvision.nvp.identity.services.model.request.MSysUserManagerupdateCapabilitiesAndRolesReq
import it.newvision.nvp.identity.services.model.user.MResponseUserDetail
import it.newvision.nvp.identity.services.model.request.MSysUserManagerdetailReq
import it.newvision.nvp.identity.services.model.user.MResponseUserFindByProperties
import it.newvision.nvp.identity.services.model.request.MSysUserManagerfindByPropertiesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JSysUserManagerClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * User only for system Users
 * 
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/adxsso/resources/sysusermanager/</li>
 * </ul>
 */
class JSysUserManagerClient(val resourceEndpoint:String) {

	/**
	 * create a new user associated with the client (service code) to use in the platform with a set of
	 * defined capabilities
	 * @param tokenId : String
	 * @param param : MSysUserManagercreateReq
	 * @return MResponseUser
	*/
	def create(tokenId: String, 
			param: MSysUserManagercreateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSysUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUser = if(this.resourceEndpoint == ""){
			
				new MResponseUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sysusermanager/create")
				
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
	 * remove a client user.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @return MResponseUser
	*/
	def remove(tokenId: String, 
			clientId: String, 
			username: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSysUserManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(username).foreach(s => params.add("username", s))  
			val response : MResponseUser = if(this.resourceEndpoint == ""){
			
				new MResponseUser()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("sysusermanager/remove")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseUser],params)
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
	 * update the user detail.
	 * @param tokenId : String
	 * @param param : MSysUserManagerupdateReq
	 * @return MResponseUser
	*/
	def update(tokenId: String, 
			param: MSysUserManagerupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSysUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUser = if(this.resourceEndpoint == ""){
			
				new MResponseUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sysusermanager/update")
				
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
	 * Change the user password.
	 * Each user can change the owned password, or the user with the right capabilities (administrator)
	 * can change the password of other users.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param newpassword : String
	 * @return MResponseUser
	*/
	def changePassword(tokenId: String, 
			clientId: String, 
			username: String, 
			newpassword: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSysUserManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(username).foreach(s => params.add("username", s))
		Option(newpassword).foreach(s => params.add("newpassword", s))  
			val response : MResponseUser = if(this.resourceEndpoint == ""){
			
				new MResponseUser()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("sysusermanager/changePassword")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseUser],params)
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
	 * Used to activate/deactivate a user in the platform. When the user is not active he can not login
	 * and use the platform webservices
	 * @param tokenId : String
	 * @param param : MSysUserManagerchangeUserStatusReq
	 * @return MResponseUser
	*/
	def changeUserStatus(tokenId: String, 
			param: MSysUserManagerchangeUserStatusReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSysUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUser = if(this.resourceEndpoint == ""){
			
				new MResponseUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sysusermanager/changeUserStatus")
				
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
	 * The service UPDATE the give user capabilities and roles for the given user.
	 * @param tokenId : String
	 * @param param : MSysUserManagerupdateCapabilitiesAndRolesReq
	 * @return MResponseUser
	*/
	def updateCapabilitiesAndRoles(tokenId: String, 
			param: MSysUserManagerupdateCapabilitiesAndRolesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSysUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUser = if(this.resourceEndpoint == ""){
			
				new MResponseUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sysusermanager/updateCapabilitiesAndRoles")
				
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
	 * return the user detail information and the list of available Capabilities
	 * @param tokenId : String
	 * @param param : MSysUserManagerdetailReq
	 * @return MResponseUserDetail
	*/
	def detail(tokenId: String, 
			param: MSysUserManagerdetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUserDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSysUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUserDetail = if(this.resourceEndpoint == ""){
			
				new MResponseUserDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sysusermanager/detail")
				
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
	 * @param tokenId : String
	 * @param param : MSysUserManagerfindByPropertiesReq
	 * @return MResponseUserFindByProperties
	*/
	def findByProperties(tokenId: String, 
			param: MSysUserManagerfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUserFindByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSysUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUserFindByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseUserFindByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sysusermanager/findByProperties")
				
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

}