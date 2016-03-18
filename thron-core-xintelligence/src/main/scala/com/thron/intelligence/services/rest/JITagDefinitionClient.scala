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
import com.thron.intelligence.services.model.tag.MResponseITagMetadataLink
import com.thron.intelligence.services.model.request.MITagDefinitionlinkMetadataDefinitionReq
import com.thron.intelligence.services.model.request.MITagDefinitionunlinkMetadataDefinitionReq
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
	 * Lists the client's Tags. This method return the tags matching the given search criteria.
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
	 * @return MResponseITagDefinitionDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String, 
			showLinkedMetadata: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseITagDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JITagDefinitionClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(showLinkedMetadata).foreach(s => params.add("showLinkedMetadata", s))
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
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
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
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
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
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>it's possible to link IMetadataDefinition only to an approved ITagDefinition  </li>
	 * 	<li>100: max number of IMetadataDefinition per ITagDefinition</li>
	 * 	<li>it's possible to link metadata only to categorized and approved ITagDefinition</li>
	 * 	<li>the IMetadataDefinition of type KEY can be linked to one single ITagDefinition.</li>
	 * </ul>
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
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
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * Tag definition id.
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
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
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