package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MResponseITag
import com.thron.intelligence.services.model.request.MITaginsertReq
import com.thron.intelligence.services.model.request.MITagremoveReq
import com.thron.intelligence.services.model.itag.MResponseITagBulk
import com.thron.intelligence.services.model.request.MITagbulkInsertReq
import com.thron.intelligence.services.model.request.MITagbulkRemoveReq
import com.thron.intelligence.services.model.itag.MResponseITagBulk2
import com.thron.intelligence.services.model.request.MITagbulkInsertMultiTargetsReq
import com.thron.intelligence.services.model.request.MITagbulkRemoveMultiTargetsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JITagClient {
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
 * com/api/xintelligence/resources/itag/      </li>
 * </ul>
 */
class JITagClient(val resourceEndpoint:String) {

	/**
	 * Link a given itagId to a specific entity  (Content, User, Contact).
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>50: max number of itags in each target (created by users)</li>
	 * 	<li>50: max number of itags in each target (created by engines)</li>
	 * </ul>
	 * <b>
	 * </b><b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contacts</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_MANAGE_CONTACTS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * THRON_MANAGE_CONTACTS)
	 * 
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * the tag definition id.
	 * TagDefinition.id or ITagDefinition.prettyId
	 * @param param : MITaginsertReq
	 * @return MResponseITag
	*/
	def insert(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			itagId: String, 
			param: MITaginsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITag ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagClient.client.resource(this.resourceEndpoint)
			val response : MResponseITag = if(this.resourceEndpoint == ""){
			
				new MResponseITag()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itag/insert")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(itagId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITag],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITag])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Unlink a given itagId from a specific entity (Content, User, Contact).
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contacts</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_MANAGE_CONTACTS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * THRON_MANAGE_CONTACTS)
	 * 
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * the tag definition id.
	 * TagDefinition.id or ITagDefinition.prettyId
	 * @param param : MITagremoveReq
	 * @return MResponseITag
	*/
	def remove(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			itagId: String, 
			param: MITagremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITag ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagClient.client.resource(this.resourceEndpoint)
			val response : MResponseITag = if(this.resourceEndpoint == ""){
			
				new MResponseITag()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itag/remove")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(itagId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITag],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITag])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Bulk insert service for itags
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>100: max number of itags for each target</li>
	 * </ul>
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contacts</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_MANAGE_CONTACTS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * THRON_MANAGE_CONTACTS)
	 * 
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagbulkInsertReq
	 * @return MResponseITagBulk
	*/
	def bulkInsert(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagbulkInsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagBulk ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagBulk = if(this.resourceEndpoint == ""){
			
				new MResponseITagBulk()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itag/bulkInsert")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagBulk],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagBulk])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Bulk remove service for itags
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contacts</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_MANAGE_CONTACTS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * THRON_MANAGE_CONTACTS)
	 * 
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagbulkRemoveReq
	 * @return MResponseITagBulk
	*/
	def bulkRemove(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagbulkRemoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagBulk ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagBulk = if(this.resourceEndpoint == ""){
			
				new MResponseITagBulk()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itag/bulkRemove")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagBulk],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagBulk])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Apply a single itag to multiple targets  (Content, User, Contact).
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>100: max number of itags for each target</li>
	 * </ul>
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contacts</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_MANAGE_CONTACTS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * THRON_MANAGE_CONTACTS)
	 * 
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagbulkInsertMultiTargetsReq
	 * @return MResponseITagBulk2
	*/
	def bulkInsertMultiTargets(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagbulkInsertMultiTargetsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagBulk2 ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagBulk2 = if(this.resourceEndpoint == ""){
			
				new MResponseITagBulk2()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itag/bulkInsertMultiTargets")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagBulk2],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagBulk2])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove a given itag from a list entities (Content, User, Contact).
	 * 
	 * <b>Role Validation for Tagging Users:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS)
	 * 
	 * <b>Role Validation for Tagging Contacts</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_MANAGE_CONTACTS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * THRON_MANAGE_CONTACTS)
	 * 
	 * 
	 * <b>Role Validation for Tagging Contents</b>
	 * MODIFY ACL on Contents and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagbulkRemoveMultiTargetsReq
	 * @return MResponseITagBulk2
	*/
	def bulkRemoveMultiTargets(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagbulkRemoveMultiTargetsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagBulk2 ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagBulk2 = if(this.resourceEndpoint == ""){
			
				new MResponseITagBulk2()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itag/bulkRemoveMultiTargets")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagBulk2],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagBulk2])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}