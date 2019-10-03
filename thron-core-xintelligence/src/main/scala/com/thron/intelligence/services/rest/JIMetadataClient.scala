package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MResponseIMetadataBulk
import com.thron.intelligence.services.model.request.MIMetadatabulkInsertReq
import com.thron.intelligence.services.model.metadata.MResponseIMetadataBulk2
import com.thron.intelligence.services.model.request.MIMetadatabulkInsertMultiTargetsReq
import com.thron.intelligence.services.model.request.MIMetadatabulkRemoveReq
import com.thron.intelligence.services.model.request.MIMetadatabulkRemoveMultiTargetsReq
import com.thron.intelligence.services.model.metadata.MResponseIMetadata
import com.thron.intelligence.services.model.request.MIMetadatainsertReq
import com.thron.intelligence.services.model.request.MIMetadataremoveReq
import com.thron.intelligence.services.model.request.MIMetadataupdateReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JIMetadataClient {
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
 * com/api/xintelligence/resources/imetadata</li>
 * </ul>
 */
class JIMetadataClient(val resourceEndpoint:String) {

	/**
	 * Adds a list of imetadata to an entity,
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatabulkInsertReq
	 * @return MResponseIMetadataBulk
	*/
	def bulkInsert(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MIMetadatabulkInsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseIMetadataBulk ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseIMetadataBulk = if(this.resourceEndpoint == ""){
			
				new MResponseIMetadataBulk()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadata/bulkInsert")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseIMetadataBulk],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseIMetadataBulk])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Adds an imetadata to multiple entities.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatabulkInsertMultiTargetsReq
	 * @return MResponseIMetadataBulk2
	*/
	def bulkInsertMultiTargets(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MIMetadatabulkInsertMultiTargetsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseIMetadataBulk2 ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseIMetadataBulk2 = if(this.resourceEndpoint == ""){
			
				new MResponseIMetadataBulk2()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadata/bulkInsertMultiTargets")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseIMetadataBulk2],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseIMetadataBulk2])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes a list of imetadata from an entity.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatabulkRemoveReq
	 * @return MResponseIMetadataBulk
	*/
	def bulkRemove(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MIMetadatabulkRemoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseIMetadataBulk ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseIMetadataBulk = if(this.resourceEndpoint == ""){
			
				new MResponseIMetadataBulk()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadata/bulkRemove")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseIMetadataBulk],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseIMetadataBulk])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes an imetadata value from multiple entities.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatabulkRemoveMultiTargetsReq
	 * @return MResponseIMetadataBulk2
	*/
	def bulkRemoveMultiTargets(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MIMetadatabulkRemoveMultiTargetsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseIMetadataBulk2 ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseIMetadataBulk2 = if(this.resourceEndpoint == ""){
			
				new MResponseIMetadataBulk2()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadata/bulkRemoveMultiTargets")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseIMetadataBulk2],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseIMetadataBulk2])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Adds an imetadata to an entity.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadatainsertReq
	 * @return MResponseIMetadata
	*/
	def insert(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MIMetadatainsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseIMetadata ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseIMetadata = if(this.resourceEndpoint == ""){
			
				new MResponseIMetadata()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadata/insert")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseIMetadata],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseIMetadata])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes a given imetadata from an entity.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param key : String
	 * An existing targetId for a specific classification
	 * @param param : MIMetadataremoveReq
	 * @return MResponseIMetadata
	*/
	def remove(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			key: String, 
			param: MIMetadataremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseIMetadata ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseIMetadata = if(this.resourceEndpoint == ""){
			
				new MResponseIMetadata()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadata/remove")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(key.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseIMetadata],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseIMetadata])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates an imetadata value on an entity.
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_VIEWER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_VIEWER role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadataupdateReq
	 * @return MResponseIMetadata
	*/
	def update(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MIMetadataupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseIMetadata ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseIMetadata = if(this.resourceEndpoint == ""){
			
				new MResponseIMetadata()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadata/update")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseIMetadata],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseIMetadata])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}