package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MResponseITagDefinitionDetail
import com.thron.intelligence.services.model.request.MITagDefinitioninsertReq
import com.thron.intelligence.services.model.tag.MResponseITagDefinitionList
import com.thron.intelligence.services.model.request.MITagDefinitionlistReq
import com.thron.intelligence.services.model.tag.MEITagDefinitionOrderBy
import com.thron.intelligence.services.model.request.MITagDefinitionupdateReq
import com.thron.intelligence.services.model.itag.MResponseITagRemove
import com.thron.intelligence.services.model.request.MITagDefinitionremoveReq
import com.thron.intelligence.services.model.request.MITagDefinitioncombineReq
import com.thron.intelligence.services.model.itag.MResponseITagDefinitionDisjoined
import com.thron.intelligence.services.model.request.MITagDefinitiondivideReq
import com.thron.intelligence.services.model.request.MITagDefinitionmergeReq
import com.thron.intelligence.services.model.request.MITagDefinitionextractReq
import com.thron.intelligence.services.model.itag.MResponseITagDefinitionJoinedList
import com.thron.intelligence.services.model.request.MITagDefinitionlistJoinedReq
import com.thron.intelligence.services.model.tag.MResponseITagMetadataLink
import com.thron.intelligence.services.model.request.MITagDefinitionlinkMetadataDefinitionReq
import com.thron.intelligence.services.model.request.MITagDefinitionunlinkMetadataDefinitionReq
import com.thron.intelligence.services.model.request.MITagDefinitionupdateTagMetadataReq
import com.thron.intelligence.services.model.request.MITagDefinitionaddExternalIdReq
import com.thron.intelligence.services.model.request.MITagDefinitionremoveExternalIdReq
import com.thron.intelligence.services.model.itag.MResponseITagDefinitionListKeys
import com.thron.intelligence.services.model.request.MITagDefinitionlistExternalIdKeysReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JITagDefinitionClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Services used to handle Tag Definition for a specific Classification
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xintelligence/resources/itagdefinition/</li>
 * </ul>
 */
class JITagDefinitionClient(val resourceEndpoint:String) {

	/**
	 * Insert a new ITagDefinition inside a given classification.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>it's not possible to create itagdefinition with a parentId uncategorized or unapproved.</li>
	 * 	<li>it's not possible to create tree structure with more than 1000 nodes.</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER or
	 * THRON_CLASS_[CLASSID]_TAG_SUGGESTER (only for not categorized tags)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitioninsertReq
	 * @return MResponseITagDefinitionDetail
	*/
	def insert(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagDefinitioninsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/insert")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Lists the client's ITagDefinitions. This method return the itags matching the given search criteria.
	 * 
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionlistReq
	 * @return MResponseITagDefinitionList
	*/
	def list(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagDefinitionlistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionList = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/list")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Lists the client's Tags. This method return the ITagDefinition matching the given search criteria.
	 * <b>
	 * </b><b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * Required
	 * @param text : String
	 * Optional. search criteria
	 * @param lang : String
	 * Optional
	 * @param ids : String
	 * Optional. As csv list of ITagDefinition.id or ITagDefinition.prettyId
	 * @param showLinkedMetadata : Boolean
	 * Optional. default is false
	 * Fill the list of linked metadata definition in items.linkedMetadataDefinition
	 * @param showSubNodeIds : Boolean
	 * Optional. default is false
	 * Fill the list of subnodes ids in the response.
	 * @param orderBy : MEITagDefinitionOrderBy
	 * Optional
	 * @param offset : Integer
	 * Optional.
	 * Default value is 0
	 * @param limit : Integer
	 * Optional. Default value is 50
	 * @return MResponseITagDefinitionList
	*/
	def listGet(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			text: String, 
			lang: String, 
			ids: String, 
			showLinkedMetadata: Boolean, 
			showSubNodeIds: Boolean, 
			orderBy: MEITagDefinitionOrderBy, 
			offset: Integer, 
			limit: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(text).foreach(s => params.add("text", s))
		Option(lang).foreach(s => params.add("lang", s))
		Option(ids).foreach(s => params.add("ids", s))
		Option(showLinkedMetadata).foreach(s => params.add("showLinkedMetadata", s))
		Option(showSubNodeIds).foreach(s => params.add("showSubNodeIds", s))
		Option(orderBy).foreach(s => params.add("orderBy", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(limit).foreach(s => params.add("limit", s))
			val response : MResponseITagDefinitionList = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("itagdefinition/listGet")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseITagDefinitionList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Return the detail information for a given ITagDefinition.
	 * <b>
	 * </b><b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param showLinkedMetadata : Boolean
	 * Optional. Default value is false
	 * @param showSubNodeIds : Boolean
	 * Optional. default is false
	 * Fill the list of subnodes ids in the response.
	 * @return MResponseITagDefinitionDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String, 
			showLinkedMetadata: Boolean, 
			showSubNodeIds: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(showLinkedMetadata).foreach(s => params.add("showLinkedMetadata", s))
		Option(showSubNodeIds).foreach(s => params.add("showSubNodeIds", s))
			val response : MResponseITagDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("itagdefinition/detail")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseITagDefinitionDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Update in "patch" mode the ITagDefinition.
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Constraints:</b>
	 * the ITagDefinition must be in state "APPROVED"
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * ITagdefinition id, prettyId or externalId
	 * @param param : MITagDefinitionupdateReq
	 * @return MResponseITagDefinitionDetail
	*/
	def update(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String, 
			param: MITagDefinitionupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/update")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Definitely remove  an ITagDefinition from the classification.
	 * It's only possible to remove ITagDefinition without children.
	 * The operation remove also the link with metadata definition
	 * 
	 * <b>Constraints:</b>
	 * the ITagDefinition must be in state "APPROVED"
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * ITagdefinition id, prettyId or externalId
	 * @param param : MITagDefinitionremoveReq
	 * @return MResponseITagRemove
	*/
	def remove(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String, 
			param: MITagDefinitionremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagRemove ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagRemove = if(this.resourceEndpoint == ""){
			
				new MResponseITagRemove()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/remove")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagRemove],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagRemove])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Combine a source ITagDefinition into a target ITagDefinition.
	 * ExternalIds, linked metadata, and id are combined in the target ITagDefinition. If the user search
	 * the Itag by externalId/id/prettyId have as response the target ITagDefinition.
	 * After a combine operation the user can not update/remove the target ITagDefinition
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>source tag status = APPROVED</li>
	 * 	<li>source tag should be a leaf</li>
	 * </ul>
	 * <ul>
	 * 	<li>categorized source.tag within a NOT categorized tag is not allowed</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * ITagDefinition id
	 * @param param : MITagDefinitioncombineReq
	 * @return MResponseITagDefinitionDetail
	*/
	def combine(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagDefinitioncombineReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/combine")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Divide a combined ITagDefinition from a target ITagDefinition.
	 * 
	 * <ul>
	 * 	<li>recover id and prettyId of combined ITagDefinition</li>
	 * 	<li>recover externalIds</li>
	 * </ul>
	 * <ul>
	 * 	<li>recover linked metadata</li>
	 * </ul>
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>source must be in state "combined"</li>
	 * </ul>
	 * <ul>
	 * 	<li>the combined ITagDefinition after the divide operation have the same parent of the target.
	 * </li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitiondivideReq
	 * @return MResponseITagDefinitionDisjoined
	*/
	def divide(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagDefinitiondivideReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDisjoined ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionDisjoined = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionDisjoined()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/divide")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionDisjoined],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionDisjoined])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Merge a (combined) ITagDefinition within the target ITagDefinition.
	 * The service moves linkedMetadata, externalIds from the combined ITagDefinition to the target. After
	 * the merge process, the user can only extract the ITagDefinition.
	 * The prettyId and names of the combined ITagDefinition are not merged into the target.
	 * <b>
	 * </b><b>Constraints</b>:
	 * <ul>
	 * 	<li>source must be in state "combined"</li>
	 * 	<li>All references to combined ITagDefinition (on Contents/Contacts/Users) are replaced by target
	 * ITagDefinition</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionmergeReq
	 * @return MResponseITagDefinitionDetail
	*/
	def merge(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagDefinitionmergeReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/merge")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Extract a merged ITagDefinition from a target ITagDefinition.
	 * 
	 * <ul>
	 * 	<li>try to restore prettyId (if still available)</li>
	 * 	<li>restore the linked metadata</li>
	 * 	<li>restore names</li>
	 * </ul>
	 * <ul>
	 * 	<li>transfer the selected externalIds from source to the restored ITagDefinition</li>
	 * 	<li>restore the merged ITagDefinition with the same parent ITagDefinition of the target (if the
	 * tag tree is not full), otherwise move the tag at the root level.</li>
	 * </ul>
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>source must be in state "merged"</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionextractReq
	 * @return MResponseITagDefinitionDisjoined
	*/
	def extract(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagDefinitionextractReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDisjoined ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionDisjoined = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionDisjoined()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/extract")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionDisjoined],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionDisjoined])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Lists the ITagDefinitions joined (combined or merged) in a given tag target. This method return the
	 * itags matching the given search criteria
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionlistJoinedReq
	 * @return MResponseITagDefinitionJoinedList
	*/
	def listJoined(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagDefinitionlistJoinedReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionJoinedList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionJoinedList = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionJoinedList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/listJoined")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionJoinedList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionJoinedList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>it's possible to link IMetadataDefinition only to an approved ITagDefinition</li>
	 * 	<li>100: max number of IMetadataDefinition per ITagDefinition</li>
	 * 	<li>it's possible to link metadata only to categorized and approved ITagDefinition</li>
	 * 	<li>the IMetadataDefinition of type KEY can be linked to one single ITagDefinition.</li>
	 * </ul>
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the ITagDefinition must be in state "APPROVED"</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * ITagdefinition id, prettyId or externalId
	 * @param param : MITagDefinitionlinkMetadataDefinitionReq
	 * @return MResponseITagMetadataLink
	*/
	def linkMetadataDefinition(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			itagId: String, 
			param: MITagDefinitionlinkMetadataDefinitionReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagMetadataLink ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagMetadataLink = if(this.resourceEndpoint == ""){
			
				new MResponseITagMetadataLink()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/linkMetadataDefinition")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(itagId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagMetadataLink],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagMetadataLink])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * <b>Constraints:</b>
	 * the ITagDefinition must be in state "APPROVED"
	 * <b>
	 * </b><b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * ITagdefinition id, prettyId or externalId
	 * @param param : MITagDefinitionunlinkMetadataDefinitionReq
	 * @return MResponseITagMetadataLink
	*/
	def unlinkMetadataDefinition(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			itagId: String, 
			param: MITagDefinitionunlinkMetadataDefinitionReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagMetadataLink ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagMetadataLink = if(this.resourceEndpoint == ""){
			
				new MResponseITagMetadataLink()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/unlinkMetadataDefinition")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(itagId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagMetadataLink],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagMetadataLink])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Update in "patch" mode  the specific values defined in the link between ITagDefinition and
	 * IMetadataDefinition.
	 * Actually used to change the position of the imetadatadefinition inside an itagdefinition
	 * 
	 * <b>Constraints:</b>
	 * the ITagDefinition must be in state "APPROVED"
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * ITagdefinition id, prettyId or externalId
	 * @param param : MITagDefinitionupdateTagMetadataReq
	 * @return MResponseITagMetadataLink
	*/
	def updateTagMetadata(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			itagId: String, 
			param: MITagDefinitionupdateTagMetadataReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagMetadataLink ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagMetadataLink = if(this.resourceEndpoint == ""){
			
				new MResponseITagMetadataLink()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/updateTagMetadata")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(itagId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagMetadataLink],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagMetadataLink])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Add an externalId to the ITagDefinition
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>it's not possible to add more than 200 external Ids on the same itagDefinition</li>
	 * </ul>
	 * <b>
	 * </b><b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * ITagDefinition.id
	 * @param param : MITagDefinitionaddExternalIdReq
	 * @return MResponseITagDefinitionDetail
	*/
	def addExternalId(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String, 
			param: MITagDefinitionaddExternalIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/addExternalId")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove an externalId from the ITagDefinition
	 * <b>
	 * </b><b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * ITagdefinition id.
	 * @param param : MITagDefinitionremoveExternalIdReq
	 * @return MResponseITagDefinitionDetail
	*/
	def removeExternalId(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String, 
			param: MITagDefinitionremoveExternalIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/removeExternalId")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * List of distinct keys (ExternalId.key) ordered by name
	 * <b>
	 * </b><b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MITagDefinitionlistExternalIdKeysReq
	 * @return MResponseITagDefinitionListKeys
	*/
	def listExternalIdKeys(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MITagDefinitionlistExternalIdKeysReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionListKeys ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseITagDefinitionListKeys = if(this.resourceEndpoint == ""){
			
				new MResponseITagDefinitionListKeys()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("itagdefinition/listExternalIdKeys")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseITagDefinitionListKeys],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseITagDefinitionListKeys])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}