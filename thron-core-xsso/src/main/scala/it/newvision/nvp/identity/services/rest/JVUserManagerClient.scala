package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserCreate
import it.newvision.nvp.identity.services.model.request.MVUserManagercreateReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUser
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateExternalIdReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateUserReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupgradeUserReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateSettingsReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserResetPassword
import it.newvision.nvp.identity.services.model.request.MVUserManagerresetPasswordReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerchangeUserStatusReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateCapabilitiesAndRolesReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserDetail
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserFindByProperties
import it.newvision.nvp.identity.services.model.request.MVUserManagerfindByPropertiesReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateImageReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserVerifyUsername
import it.newvision.nvp.identity.services.model.request.MVUserManagerlinkGroupsReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerunlinkGroupsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JVUserManagerClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service provides the low level function to create new user in platform
 * (MVUser instance) , and store the username and password necessary for the
 * authentication services.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xsso/resources/vusermanager    </li>
 * </ul>
 */
class JVUserManagerClient(val resourceEndpoint:String) {

	/**
	 * Creates a user.
	 * 
	 * <b>Username, password and email</b> (of MVUserNotificationProperties) <b>are mandatory</b>.
	 * Username must be unique and it will be automatically converted to lowercase.
	 * 
	 * Constraints for the username attribute:
	 * <ul>
	 * 	<li>can not contain §/$&#<>"?*:\|</li>
	 * 	<li>can not contain spaces</li>
	 * 	<li>can not start with _</li>
	 * 	<li>can not start with !</li>
	 * 	<li>max length: 50</li>
	 * </ul>
	 * 
	 * Constraints for the password attribute:
	 * <ul>
	 * 	<li>max length: 100</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagercreateReq
	 * @return MResponseVUserCreate
	*/
	def create(tokenId: String, 
			param: MVUserManagercreateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUserCreate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUserCreate = if(this.resourceEndpoint == ""){
			
				new MResponseVUserCreate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/create")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUserCreate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUserCreate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates the externalId of a user.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param param : MVUserManagerupdateExternalIdReq
	 * @return MResponseVUser
	*/
	def updateExternalId(tokenId: String, 
			clientId: String, 
			username: String, 
			param: MVUserManagerupdateExternalIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/updateExternalId")
					.path(clientId.toString)
		.path(username.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUser],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUser])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Update the detail of a user.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * <ul>
	 * 	<li>MODIFY ACL on user</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param param : MVUserManagerupdateUserReq
	 * @return MResponseVUser
	*/
	def updateUser(tokenId: String, 
			clientId: String, 
			username: String, 
			param: MVUserManagerupdateUserReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/updateUser")
					.path(clientId.toString)
		.path(username.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUser],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUser])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Upgrades a PLATFORM_USER_GUEST type user to PLATFORM_USER type.
	 * Username cannot be changed.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagerupgradeUserReq
	 * @return MResponseVUserCreate
	*/
	def upgradeUser(tokenId: String, 
			param: MVUserManagerupgradeUserReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUserCreate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUserCreate = if(this.resourceEndpoint == ""){
			
				new MResponseVUserCreate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/upgradeUser")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUserCreate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUserCreate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates restricted params of a user (userQuota and userLockTemplate).
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagerupdateSettingsReq
	 * @return MResponseVUser
	*/
	def updateSettings(tokenId: String, 
			param: MVUserManagerupdateSettingsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/updateSettings")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUser],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUser])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Changes the password of a user.
	 * Users can change only their own password, while user administrators can change the password of any
	 * user.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * Optional. the username
	 * @param newpassword : String
	 * @return MResponseVUser
	*/
	def changePassword(tokenId: String, 
			clientId: String, 
			username: String, 
			newpassword: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(username).foreach(s => params.add("username", s))
		Option(newpassword).foreach(s => params.add("newpassword", s))  
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("vusermanager/changePassword")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseVUser],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUser])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Resets user password, eventually sending him an email with the link to insert the new one.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * 	<li>MODIFY ACL on user</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagerresetPasswordReq
	 * @return MResponseVUserResetPassword
	*/
	def resetPassword(tokenId: String, 
			param: MVUserManagerresetPasswordReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUserResetPassword ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUserResetPassword = if(this.resourceEndpoint == ""){
			
				new MResponseVUserResetPassword()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/resetPassword")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUserResetPassword],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUserResetPassword])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Modifies the active status of a user.
	 * 
	 * An inactive user cannot login or use any service of the platform.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * 	<li>MODIFY ACL on user</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagerchangeUserStatusReq
	 * @return MResponseVUser
	*/
	def changeUserStatus(tokenId: String, 
			param: MVUserManagerchangeUserStatusReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/changeUserStatus")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUser],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUser])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates the capabilities and roles of a user.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MVUserManagerupdateCapabilitiesAndRolesReq
	 * @return MResponseVUser
	*/
	def updateCapabilitiesAndRoles(tokenId: String, 
			param: MVUserManagerupdateCapabilitiesAndRolesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/updateCapabilitiesAndRoles")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUser],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUser])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the detail and capabilities of a user.
	 * The service return only the first 50 groups linked to the user and no own ACLs.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * The userId
	 * @param returnItags : Boolean
	 * Optional. Default is false
	 * @param returnImetadata : Boolean
	 * Optional. Default is false
	 * @param offset : Integer
	 * Optional. For the linkedGroups list
	 * @param numberOfResults : Integer
	 * Optional. For the linkedGroups list
	 * Default and maximum value is 50 items
	 * @return MResponseVUserDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			username: String, 
			returnItags: Boolean, 
			returnImetadata: Boolean, 
			offset: Integer, 
			numberOfResults: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUserDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(username).foreach(s => params.add("username", s))
		Option(returnItags).foreach(s => params.add("returnItags", s))
		Option(returnImetadata).foreach(s => params.add("returnImetadata", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResults).foreach(s => params.add("numberOfResults", s))
			val response : MResponseVUserDetail = if(this.resourceEndpoint == ""){
			
				new MResponseVUserDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("vusermanager/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseVUserDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUserDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Returns the list of users matching provided criteria.
	 * @param tokenId : String
	 * @param param : MVUserManagerfindByPropertiesReq
	 * @return MResponseVUserFindByProperties
	*/
	def findByProperties(tokenId: String, 
			param: MVUserManagerfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUserFindByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUserFindByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseVUserFindByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUserFindByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUserFindByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates the profile picture of a user.
	 * Supported file formats: JPEG, PNG.
	 * @param tokenId : String
	 * @param param : MVUserManagerupdateImageReq
	 * @return MResponseVUser
	*/
	def updateImage(tokenId: String, 
			param: MVUserManagerupdateImageReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/updateImage")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUser],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUser])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Verifies whether or not a username is valid, and eventually suggest an alternative.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @return MResponseVUserVerifyUsername
	*/
	def verifyUsername(tokenId: String, 
			clientId: String, 
			username: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUserVerifyUsername ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(username).foreach(s => params.add("username", s))  
			val response : MResponseVUserVerifyUsername = if(this.resourceEndpoint == ""){
			
				new MResponseVUserVerifyUsername()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("vusermanager/verifyUsername")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseVUserVerifyUsername],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUserVerifyUsername])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Links a user to a group.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * 	<li>MODIFY ACL on user</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param param : MVUserManagerlinkGroupsReq
	 * @return MResponseVUser
	*/
	def linkGroups(tokenId: String, 
			clientId: String, 
			username: String, 
			param: MVUserManagerlinkGroupsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/linkGroups")
					.path(clientId.toString)
		.path(username.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUser],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUser])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Unlinks a user from a group.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_USERS role</li>
	 * </ul>
	 * <ul>
	 * 	<li>MODIFY ACL on user</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param param : MVUserManagerunlinkGroupsReq
	 * @return MResponseVUser
	*/
	def unlinkGroups(tokenId: String, 
			clientId: String, 
			username: String, 
			param: MVUserManagerunlinkGroupsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/unlinkGroups")
					.path(clientId.toString)
		.path(username.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUser],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUser])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}