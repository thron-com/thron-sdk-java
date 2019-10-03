package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MResponseITagDefinitionDetail
import com.thron.intelligence.services.model.request.MITagDefinitionaddExternalIdReq
import com.thron.intelligence.services.model.request.MITagDefinitioncombineReq
import com.thron.intelligence.services.model.itag.MResponseITagDefinitionDisjoined
import com.thron.intelligence.services.model.request.MITagDefinitiondivideReq
import com.thron.intelligence.services.model.request.MITagDefinitionextractReq
import com.thron.intelligence.services.model.request.MITagDefinitioninsertReq
import com.thron.intelligence.services.model.tag.MResponseITagMetadataLink
import com.thron.intelligence.services.model.request.MITagDefinitionlinkMetadataDefinitionReq
import com.thron.intelligence.services.model.tag.MResponseITagDefinitionList
import com.thron.intelligence.services.model.request.MITagDefinitionlistReq
import com.thron.intelligence.services.model.itag.MResponseITagDefinitionListKeys
import com.thron.intelligence.services.model.request.MITagDefinitionlistExternalIdKeysReq
import com.thron.intelligence.services.model.tag.MEITagDefinitionOrderBy
import com.thron.intelligence.services.model.itag.MResponseITagDefinitionJoinedList
import com.thron.intelligence.services.model.request.MITagDefinitionlistJoinedReq
import com.thron.intelligence.services.model.request.MITagDefinitionmergeReq
import com.thron.intelligence.services.model.itag.MResponseITagRemove
import com.thron.intelligence.services.model.request.MITagDefinitionremoveReq
import com.thron.intelligence.services.model.request.MITagDefinitionremoveExternalIdReq
import com.thron.intelligence.services.model.request.MITagDefinitionunlinkMetadataDefinitionReq
import com.thron.intelligence.services.model.request.MITagDefinitionupdateReq
import com.thron.intelligence.services.model.request.MITagDefinitionupdateTagMetadataReq

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
 * com/api/xintelligence/resources/itagdefinition</li>
 * </ul>
 */
class JITagDefinitionClient(val resourceEndpoint:String) {

	/**
	 * Adds an externalId to an itagDefinition.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max number of externalIds on an itagDefinition: 200</li>
	 * </ul>
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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
	 * Combines a source itagDefinition into a target itagDefinition.
	 * ExternalIds and linked imetadataDefinitions are combined into the target itagDefinition.
	 * After a combine operation any itagDefinition search by source ids will return target itagDefinition.
	 * 
	 * After a combine operation target itagDefinition cannot be updated or removed.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>source itagDefinition must be APPROVED</li>
	 * 	<li>source itagDefinition  must not have child nodes</li>
	 * </ul>
	 * <ul>
	 * 	<li>cannot combine a categorized itagDefinition into a non-categorized itagDefinition.</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
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
	 * Returns the detail of an itagDefinition.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li> THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
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
	 * Divides a combined itagDefinition from a target itagDefinition.
	 * Restores combined itagDefinition ids.and linked imetadataDefinitions.
	 * After the divide operation divided itagDefinition will have the same parent of the target.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>source itagDefinition must be COMBINED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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
	 * Extracts a merged itagDefinition from a target itagDefinition.
	 * Restores prettyId (if still available), externalIds, linked imetadataDefinitions, and localized
	 * names.
	 * After extract operation merged itagDefinition will have the same parent itagDefinition of the
	 * target (if the tag tree is not full), otherwise the tag is added as a new root.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>merged itagDefinition must be MERGED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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
	 * Inserts an itagDefinition to a classification.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>parentId, if any, must refer to a categorized itagDefinition.</li>
	 * 	<li>it's not possible to create tree structure with more than 1000 nodes.</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER or THRON_CLASS_[CLASSID]_TAG_SUGGESTER (only for not categorized
	 * tags) role</li>
	 * </ul>
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
	 * Links an imetadataDefinition to an itagDefinition.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED and CATEGORIZED</li>
	 * 	<li>max number of imetadataDefinition linked to an itagDefinition: 100</li>
	 * 	<li>KEY type imetadataDefinitions can only be linked to a single itagDefinition.</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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
	 * Returns the list of itagDefinition matching provided criteria.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
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
	 * Returns the list of distinct keys (i.e., externalId.key) sorted by name.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
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

	/**
	 * Returns the list of itagDefinition matching provided criteria.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * Required
	 * @param text : String
	 * Optional. search criteria
	 * @param lang : String
	 * Optional. Used to filter itagDefinitions
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
	 * Lists the itagDefinitions joined (i.e., combined or merged) into a target itagDefinition matching
	 * provided criteria.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
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
	 * Merges a list of combined itagDefinitions into a target itagDefinition.
	 * ExternalIds and linked imetadataDefinitions are moved from combined itagDefinitions to the target;
	 * combined itagDefinitions prettyId and localized names are not merged into the target.
	 * Any reference to combined itagDefinitions on any entity is replaced by target itagDefinition.
	 * <b>
	 * </b><b>Constraints</b>:
	 * <ul>
	 * 	<li>combined itagDefinitions must be COMBINED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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
	 * Remove s an itagDefinition from a classification.
	 * It also removes any linked imetadataDefinition.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED</li>
	 * 	<li>Cannot remove itagDefinition with any child node</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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
	 * Removes an externalId from an itagDefinition.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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
	 * Unlinks an imetadataDefinition from an itagDefinition.
	 * <b>
	 * </b><b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED</li>
	 * </ul>
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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
	 * Update in "patch" mode the ITagDefinition.
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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
	 * Update in "patch" mode  the specific values defined in the link between itagDefinition and
	 * imetadataDefinition.
	 * Can be used to change the position of an imetadataDefinition among the list of
	 * linkedMetadataDefinition of an itagDefinition.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>itagDefinition must be APPROVED</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
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

}