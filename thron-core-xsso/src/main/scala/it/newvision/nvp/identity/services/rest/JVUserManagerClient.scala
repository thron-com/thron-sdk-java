package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserCreate
import it.newvision.nvp.identity.services.model.request.MVUserManagercreateReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserDetail
import it.newvision.nvp.identity.services.model.vusers.MResponseVUser
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateExternalIdReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateUserReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupgradeUserReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateSettingsReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserRemove
import it.newvision.nvp.identity.services.model.request.MVUserManagerremoveReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserResetPassword
import it.newvision.nvp.identity.services.model.request.MVUserManagerresetPasswordReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerchangeUserStatusReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateCapabilitiesAndRolesReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserFindByProperties
import it.newvision.nvp.identity.services.model.request.MVUserManagerfindByPropertiesReq
import it.newvision.nvp.identity.services.model.request.MVUserManagerupdateImageReq
import it.newvision.nvp.identity.services.model.vusers.MResponseVUserVerifyUsername

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
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xsso/resources/vusermanager/     </li>
 * </ul>
 */
class JVUserManagerClient(val resourceEndpoint:String) {

	/**
	 * This service is used to create users in the platform. The are four different type of users:
	 * <ul>
	 * 	<li>PLATFORM_USER: allowed to login in platform and use the services</li>
	 * </ul>
	 * <ul>
	 * 	<li>PLATFORM_USER_GUEST: allowed to login in platform and use the services</li>
	 * </ul>
	 * <ul>
	 * 	<li>EXTERNAL_USER: used to store external users used by apps.</li>
	 * </ul>
	 * <ul>
	 * 	<li>GENERIC_CONTACT: used for personal address book.</li>
	 * </ul>
	 * 
	 * Username and password are required for platform users (PLATFORM_USER, PLATFORM_USER_GUEST), and
	 * username must be unique.
	 * The service convert the given username to lower case.
	 * 
	 * Constraints for the username attribute:
	 * <ol>
	 * 	<li>can not contain §/$&#<>"?*:\|</li>
	 * 	<li>can not contain spaces</li>
	 * 	<li> can not start with _</li>
	 * 	<li>can not start with !</li>
	 * 	<li>max length = 50</li>
	 * </ol>
	 * 
	 * Constraints for the password attribute:
	 * <ol>
	 * 	<li>max length = 100</li>
	 * </ol>
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
	 * This webservice is used with external Apps to verify if the given username and password are valid
	 * or not.
	 * Check the authentication for a given clientId, using the username and password of a registered user.
	 * 
	 * The function return the user details. The platform does not keep the user session. The user session
	 * is handled by the proper apps.The service verifies the credentials also for the platform users. The
	 * service return only the first 50 groups linked to the user.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param password : String
	 * @return MResponseVUserDetail
	*/
	def login(tokenId: String, 
			clientId: String, 
			username: String, 
			password: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUserDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(username).foreach(s => params.add("username", s))
		Option(password).foreach(s => params.add("password", s))  
			val response : MResponseVUserDetail = if(this.resourceEndpoint == ""){
			
				new MResponseVUserDetail()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("vusermanager/login")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseVUserDetail],params)
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
	 * update the user detail.
	 * @param tokenId : String
	 * @param param : MVUserManagerupdateReq
	 * @return MResponseVUser
	*/
	@Deprecated
	def update(tokenId: String, 
			param: MVUserManagerupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUser ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUser = if(this.resourceEndpoint == ""){
			
				new MResponseVUser()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/update")
				
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
	 * update the user detail.
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
	 * update the user detail.
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
	 * Used to upgrade a user PLATFORM_USER_GUEST to PLATFORM_USER.
	 * It's not allowed to change the original username.
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
	 * update restricted params of the user (userQuota and userLockTemplate). The service is available
	 * only for User Administrators.
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
	 * DEPRECATED. Available only with 3.x release.
	 * Use the service JDashBoard.migrateUserStuff (in xadmin) to correctly remove a user from the
	 * platform.
	 * @param tokenId : String
	 * @param param : MVUserManagerremoveReq
	 * @return MResponseVUserRemove
	*/
	@Deprecated
	def remove(tokenId: String, 
			param: MVUserManagerremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseVUserRemove ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JVUserManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseVUserRemove = if(this.resourceEndpoint == ""){
			
				new MResponseVUserRemove()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("vusermanager/remove")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseVUserRemove],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseVUserRemove])
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
	 * Used to create a new temporary token for users (only PLATFORM_USER and PLATFORM_USER_GUEST). This
	 * token can be used with the service Jidentitymanager.loginWithDetail.
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
	 * Used to activate/deactivate a user in the platform. When the user is not active he can not login
	 * and use the platform's application and services.
	 * Can be invoked only by users with role CORE_MANAGE_USERS
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
	 * The service UPDATE the user capabilities and roles for the given user.
	 * Can be invoked only by users with role CORE_MANAGE_USERS
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
	 * return the user detail information and the list of available Capabilities.
	 * The service return only the first 50 groups linked to the user and no own Acl.
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
	 * Upload a new File for the user profile picture. JPG/PNG file format are suggested.
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
	 * Verify whether a username is valid or not, and eventually suggest an alternative.
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

}