package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MResponseIMetadata
import com.thron.intelligence.services.model.request.MIMetadatainsertReq
import com.thron.intelligence.services.model.request.MIMetadataremoveReq
import com.thron.intelligence.services.model.request.MIMetadataupdateReq
import com.thron.intelligence.services.model.metadata.MResponseIMetadataBulk
import com.thron.intelligence.services.model.request.MIMetadatabulkInsertReq
import com.thron.intelligence.services.model.request.MIMetadatabulkRemoveReq
import com.thron.intelligence.services.model.metadata.MResponseIMetadataBulk2
import com.thron.intelligence.services.model.request.MIMetadatabulkInsertMultiTargetsReq
import com.thron.intelligence.services.model.request.MIMetadatabulkRemoveMultiTargetsReq

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
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xintelligence/resources/imetadata/       </li>
 * </ul>
 */
class JIMetadataClient(val resourceEndpoint:String) {

	/**
	 * Add an imetadata to an entity.
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
	 * Remove a given imetadata to an entity.
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
	 * Update a given metadata to a user or content or category....
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

	/**
	 * Add a given list of metadata to a user or content
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
	 * Remove a given list of imetadata to a user or content
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
	 * Apply a single metadata to multiple targets (users or contents)
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
	 * Remove a given metadata from a list of users or contents
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

}