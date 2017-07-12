package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.classification.MResponseClassificationPermission
import com.thron.intelligence.services.model.request.MPermissionsinsertReq
import com.thron.intelligence.services.model.classification.MResponseClassificationPermissionList
import com.thron.intelligence.services.model.request.MPermissionslistReq
import com.thron.intelligence.services.model.request.MPermissionsupdateReq
import com.thron.intelligence.services.model.classification.MResponseClassificationPermissionRemove
import com.thron.intelligence.services.model.request.MPermissionsremoveReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPermissionsClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xintelligence/resources/permissions</li>
 * </ul>
 */
class JPermissionsClient(val resourceEndpoint:String) {

	/**
	 * Adds classification permissions to a user, group or app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>(THRON_CLASSIFICATIONS_MANAGER or THRON_CLASS_[CLASSID]_MANAGER) and CORE_MANAGE_USERS
	 * role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MPermissionsinsertReq
	 * @return MResponseClassificationPermission
	*/
	def insert(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MPermissionsinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationPermission ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPermissionsClient.client.resource(this.resourceEndpoint)
			val response : MResponseClassificationPermission = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationPermission()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("permissions/insert")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClassificationPermission],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationPermission])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the classification permissions matching provided criteria.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MPermissionslistReq
	 * @return MResponseClassificationPermissionList
	*/
	def list(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MPermissionslistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationPermissionList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPermissionsClient.client.resource(this.resourceEndpoint)
			val response : MResponseClassificationPermissionList = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationPermissionList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("permissions/list")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClassificationPermissionList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationPermissionList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the classification permissions matching provided criteria.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param offset : Integer
	 * Optional.
	 * Default value is 0
	 * @param limit : Integer
	 * Optional. Default value is 50
	 * @return MResponseClassificationPermissionList
	*/
	def listGet(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			offset: Integer, 
			limit: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationPermissionList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPermissionsClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(offset).foreach(s => params.add("offset", s))
		Option(limit).foreach(s => params.add("limit", s))
			val response : MResponseClassificationPermissionList = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationPermissionList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("permissions/listGet")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseClassificationPermissionList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationPermissionList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Updates classification permissions of a user, group or app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>(THRON_CLASSIFICATIONS_MANAGER or THRON_CLASS_[CLASSID]_MANAGER) and CORE_MANAGE_USERS
	 * role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MPermissionsupdateReq
	 * @return MResponseClassificationPermission
	*/
	def update(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MPermissionsupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationPermission ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPermissionsClient.client.resource(this.resourceEndpoint)
			val response : MResponseClassificationPermission = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationPermission()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("permissions/update")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClassificationPermission],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationPermission])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes classification permissions from a user, group or app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>(THRON_CLASSIFICATIONS_MANAGER or THRON_CLASS_[CLASSID]_MANAGER) and CORE_MANAGE_USERS
	 * role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * Tag.id or Tag.namespace
	 * @param param : MPermissionsremoveReq
	 * @return MResponseClassificationPermissionRemove
	*/
	def remove(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MPermissionsremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationPermissionRemove ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPermissionsClient.client.resource(this.resourceEndpoint)
			val response : MResponseClassificationPermissionRemove = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationPermissionRemove()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("permissions/remove")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClassificationPermissionRemove],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationPermissionRemove])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}