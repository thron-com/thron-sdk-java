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
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xintelligence/resources/itag  </li>
 * </ul>
 */
class JITagClient(val resourceEndpoint:String) {

	/**
	 * Links an itag to an entity.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max number of user-generated itags per entity: 50</li>
	 * 	<li>max number of engine-generated itags per entity : 50</li>
	 * </ul>
	 * <b>
	 * </b><b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER role
	 * 
	 * <b>Validation for content (only with Sales or Marketing App):</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS) role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * the tag definition id.
	 * TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId
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
	 * Unlinks an itagId from an entity.
	 * <b>
	 * </b><b>Removal of combined tags:</b>
	 * Let's suppose we have two tags: "A" and "B". "B" has been combined within "A"
	 * 
	 * <ul>
	 * 	<li>Case scenario 1: A content tagged with  tag "A" --> If remove is invoked for "B", the service
	 * will return exception.</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 2: A content tagged with tag "B" --> remove web service will return 200 both for
	 * tag "A" and tag "B" because "B" is combined in "A".</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 3: A content tagged with both "A" and "B" tags --> If remove is invoked on "A"
	 * the service will remove both "A" and "B" tags.</li>
	 * </ul>
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER role
	 * 
	 * <b>Validation for content (only with Sales or Marketing App):</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * THRON_EDIT_CONTACTS) role
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * the tag definition id.
	 * TagDefinition.id, ITagDefinition.prettyId or ITagDefinition.externalId
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
	 * Links a list of itags to an entity.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max number of user-generated itags per entity: 50</li>
	 * 	<li>max number of engine-generated itags per entity : 50</li>
	 * </ul>
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER role
	 * 
	 * <b>Validation for content (only with Sales or Marketing App):</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS) role
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
	 * Removes a list of itags from an entity.
	 * 
	 * <b>Removal of combined tags:</b>
	 * Let's suppose we have two tags: "A" and "B". "B" has been combined within "A"
	 * 
	 * <ul>
	 * 	<li>Case scenario 1: A content tagged with  tag "A" --> If remove is invoked for "B", the service
	 * will return exception.</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 2: A content tagged with tag "B" --> remove web service will return 200 both for
	 * tag "A" and tag "B" because "B" is combined in "A".</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 3: A content tagged with both "A" and "B" tags --> If remove is invoked on "A"
	 * the service will remove both "A" and "B" tags.</li>
	 * </ul>
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER role
	 * 
	 * <b>Validation for content (only with Sales or Marketing App):</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS) role
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
	 * Links an itag to multiple entity.
	 * <b>
	 * </b><b>Constraints:</b>
	 * <ul>
	 * 	<li>max number of user-generated itags per entity: 50</li>
	 * 	<li>max number of engine-generated itags per entity : 50</li>
	 * </ul>
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER role
	 * 
	 * <b>Validation for content (only with Sales or Marketing App):</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS) role
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
	 * Removes an itag from multiple entities.
	 * <b>
	 * </b><b>Removal of combined tags:</b>
	 * Let's suppose we have two tags: "A" and "B". "B" has been combined within "A"
	 * 
	 * <ul>
	 * 	<li>Case scenario 1: A content tagged with  tag "A" --> If remove is invoked for "B", the service
	 * will return exception.</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 2: A content tagged with tag "B" --> remove web service will return 200 both for
	 * tag "A" and tag "B" because "B" is combined in "A".</li>
	 * </ul>
	 * <ul>
	 * 	<li>Case scenario 3: A content tagged with both "A" and "B" tags --> If remove is invoked on "A"
	 * the service will remove both "A" and "B" tags.</li>
	 * </ul>
	 * 
	 * <b>Validation for user:</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and CORE_MANAGE_USERS) or (THRON_CLASS_[CLASSID]_TAGGER and
	 * CORE_MANAGE_USERS) role
	 * 
	 * <b>Validation for content:</b>
	 * MODIFY ACL on the content and (THRON_CLASS_[CLASSID]_MANAGER  or THRON_CLASS_[CLASSID]_TAGGER role
	 * 
	 * <b>Validation for content (only with Sales or Marketing App):</b>
	 * (THRON_CLASS_[CLASSID]_MANAGER and THRON_EDIT_CONTACTS) or
	 * (THRON_CLASS_[CLASSID]_TAGGER and THRON_EDIT_CONTACTS) role
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