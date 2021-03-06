package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.usersgroup.MResponseCreateUsersGroup
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagercreateGroupReq
import it.newvision.nvp.identity.services.model.usersgroup.MResponseUsersGroup
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerupdateReq
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerupdateExternalIdReq
import it.newvision.nvp.identity.services.model.usersgroup.MResponseDetailUsersGroup
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerdetailGroupReq
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerremoveGroupReq
import it.newvision.nvp.identity.services.model.usersgroup.MResponseFindGroupsByProperties
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerfindGroupsByPropertiesReq
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerlinkUserToGroupReq
import it.newvision.nvp.identity.services.model.request.MUsersGroupManagerunlinkUserToGroupReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JUsersGroupManagerClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service handles all functions for the platform user groups. The
 * administrator can create different group of users. The groups are used in
 * combination with the access control of contents, and allows to restrict the
 * access to a content only to some users or groups of users.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xsso/resources/usersgroupmanager</li>
 * </ul>
 */
class JUsersGroupManagerClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Creates a group of users.
	 * @param tokenId : String
	 * @param param : MUsersGroupManagercreateGroupReq
	 * @return MResponseCreateUsersGroup
	*/
	def createGroup(tokenId: String, 
			param: MUsersGroupManagercreateGroupReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseCreateUsersGroup ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUsersGroupManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseCreateUsersGroup = if(this.resourceEndpoint == ""){
			
				new MResponseCreateUsersGroup()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usersgroupmanager/createGroup")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCreateUsersGroup],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCreateUsersGroup])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates the detail and capabilities of a group.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param groupId : String
	 * @param param : MUsersGroupManagerupdateReq
	 * @return MResponseUsersGroup
	*/
	def update(tokenId: String, 
			clientId: String, 
			groupId: String, 
			param: MUsersGroupManagerupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUsersGroup ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUsersGroupManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUsersGroup = if(this.resourceEndpoint == ""){
			
				new MResponseUsersGroup()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usersgroupmanager/update")
					.path(clientId.toString)
		.path(groupId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUsersGroup],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUsersGroup])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates an externalId of a group.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param groupId : String
	 * @param param : MUsersGroupManagerupdateExternalIdReq
	 * @return MResponseUsersGroup
	*/
	def updateExternalId(tokenId: String, 
			clientId: String, 
			groupId: String, 
			param: MUsersGroupManagerupdateExternalIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUsersGroup ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUsersGroupManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUsersGroup = if(this.resourceEndpoint == ""){
			
				new MResponseUsersGroup()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usersgroupmanager/updateExternalId")
					.path(clientId.toString)
		.path(groupId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUsersGroup],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUsersGroup])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the detail of a group and the list of users linked to it.
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerdetailGroupReq
	 * @return MResponseDetailUsersGroup
	*/
	def detailGroup(tokenId: String, 
			param: MUsersGroupManagerdetailGroupReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseDetailUsersGroup ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUsersGroupManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseDetailUsersGroup = if(this.resourceEndpoint == ""){
			
				new MResponseDetailUsersGroup()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usersgroupmanager/detailGroup")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseDetailUsersGroup],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailUsersGroup])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes a group.
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerremoveGroupReq
	 * @return MResponseUsersGroup
	*/
	def removeGroup(tokenId: String, 
			param: MUsersGroupManagerremoveGroupReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUsersGroup ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUsersGroupManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUsersGroup = if(this.resourceEndpoint == ""){
			
				new MResponseUsersGroup()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usersgroupmanager/removeGroup")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUsersGroup],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUsersGroup])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the list of groups matching provided criteria.
	 * The list of users linked to each group is not returned.
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerfindGroupsByPropertiesReq
	 * @return MResponseFindGroupsByProperties
	*/
	def findGroupsByProperties(tokenId: String, 
			param: MUsersGroupManagerfindGroupsByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseFindGroupsByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUsersGroupManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindGroupsByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseFindGroupsByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usersgroupmanager/findGroupsByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindGroupsByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindGroupsByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Links a set of users to a group.
	 * Constraints about the relation between user and groups:
	 * 
	 * <b>[MEUserType] ->(link to) [MEUserGroupType]</b>
	 * 
	 * <ul>
	 * 	<li>PLATFORM_USER-> PLATFORM (group)</li>
	 * 	<li>PLATFORM_USER-> PLATFORM_BLIND (group)</li>
	 * 	<li>PLATFORM_USER_GUEST-> PLATFORM_BLIND (group)</li>
	 * </ul>
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max number of groups a user can be linked to: 500</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerlinkUserToGroupReq
	 * @return MResponseUsersGroup
	*/
	def linkUserToGroup(tokenId: String, 
			param: MUsersGroupManagerlinkUserToGroupReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUsersGroup ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUsersGroupManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUsersGroup = if(this.resourceEndpoint == ""){
			
				new MResponseUsersGroup()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usersgroupmanager/linkUserToGroup")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUsersGroup],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUsersGroup])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Unlinks a set of users from a group.
	 * @param tokenId : String
	 * @param param : MUsersGroupManagerunlinkUserToGroupReq
	 * @return MResponseUsersGroup
	*/
	def unlinkUserToGroup(tokenId: String, 
			param: MUsersGroupManagerunlinkUserToGroupReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUsersGroup ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JUsersGroupManagerClient.client.resource(this.resourceEndpoint)
			val response : MResponseUsersGroup = if(this.resourceEndpoint == ""){
			
				new MResponseUsersGroup()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("usersgroupmanager/unlinkUserToGroup")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUsersGroup],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUsersGroup])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}