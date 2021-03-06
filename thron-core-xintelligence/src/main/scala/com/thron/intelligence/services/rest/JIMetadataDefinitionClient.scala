package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinitionDetail
import com.thron.intelligence.services.model.request.MIMetadataDefinitioninsertReq
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinition
import com.thron.intelligence.services.model.request.MIMetadataDefinitionlinkITagReq
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinitionList
import com.thron.intelligence.services.model.request.MIMetadataDefinitionlistReq
import com.thron.intelligence.services.model.metadata.MEMetadataDefinitionOrderBy
import com.thron.intelligence.services.model.request.MIMetadataDefinitionupdateReq
import com.thron.intelligence.services.model.metadata.MResponseMetadataVerifyIfUsed

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JIMetadataDefinitionClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Services used to handle custom Metadata Definition for a specific
 * classification
 * 
 * <b>Role Validation:</b>
 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xintelligence/resources/imetadatadefinition</li>
 * </ul>
 */
class JIMetadataDefinitionClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Returns the detail of an imetadataDefinition.
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
	 * @return MResponseMetadataDefinitionDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		
			val response : MResponseMetadataDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("imetadatadefinition/detail")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseMetadataDefinitionDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataDefinitionDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Creates an imetadataDefinition is a classification.
	 * The imetadataDefinition can be linked to an itagDefinition belonging to the same classification.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadataDefinitioninsertReq
	 * @return MResponseMetadataDefinitionDetail
	*/
	def insert(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MIMetadataDefinitioninsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadatadefinition/insert")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadataDefinitionDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataDefinitionDetail])
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
	 * Tag definition id.
	 * ITagDefinition.id, prettyId or externalKey
	 * @param metadataId : String
	 * Metadata Definition id
	 * @param param : MIMetadataDefinitionlinkITagReq
	 * @return MResponseMetadataDefinition
	*/
	def linkITag(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			itagId: String, 
			metadataId: String, 
			param: MIMetadataDefinitionlinkITagReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinition ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinition = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinition()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadatadefinition/linkITag")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(itagId.toString)
		.path(metadataId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadataDefinition],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataDefinition])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the list of imetadataDefinition of a classification matching provided criteria.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_VIEWER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIMetadataDefinitionlistReq
	 * @return MResponseMetadataDefinitionList
	*/
	def list(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MIMetadataDefinitionlistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinitionList = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadatadefinition/list")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadataDefinitionList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataDefinitionList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the list of imetadataDefinition of a classification matching provided criteria.
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
	 * @param text : String
	 * Optional
	 * Search criteria
	 * @param lang : String
	 * Optional. Used to filter imetadataDefinitions
	 * @param ids : String
	 * Optional. csv list of Attribute.id
	 * Search criteria
	 * @param itagIds : String
	 * Optional. csv list of Tag.id
	 * Search criteria
	 * @param orderBy : MEMetadataDefinitionOrderBy
	 * Optional
	 * @param offset : Integer
	 * Optional.
	 * Default value is 0
	 * @param limit : Integer
	 * Optional. Default value is 50
	 * @return MResponseMetadataDefinitionList
	*/
	def listGet(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			text: String, 
			lang: String, 
			ids: String, 
			itagIds: String, 
			orderBy: MEMetadataDefinitionOrderBy, 
			offset: Integer, 
			limit: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(text).foreach(s => params.add("text", s))
		Option(lang).foreach(s => params.add("lang", s))
		Option(ids).foreach(s => params.add("ids", s))
		Option(itagIds).foreach(s => params.add("itagIds", s))
		Option(orderBy).foreach(s => params.add("orderBy", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(limit).foreach(s => params.add("limit", s))
			val response : MResponseMetadataDefinitionList = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("imetadatadefinition/listGet")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseMetadataDefinitionList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataDefinitionList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Moves an imetadataDefinition to the trash, unlinking it from every linked itagDefinition.
	 * It doesn't remove the instances of imetadata linked to any entity.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Metadata definition id
	 * @return MResponseMetadataDefinition
	*/
	def trash(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinition ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinition = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinition()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadatadefinition/trash")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadataDefinition])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataDefinition])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Unlinks an imetadataDefinition from an itagDefinition.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param itagId : String
	 * Tag definition id.
	 * ITagDefinition.id or ITagDefinition.prettyId
	 * @param metadataId : String
	 * Metadata definition id
	 * @return MResponseMetadataDefinition
	*/
	def unlinkITag(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			itagId: String, 
			metadataId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinition ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinition = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinition()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadatadefinition/unlinkITag")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(itagId.toString)
		.path(metadataId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadataDefinition])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataDefinition])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Restores an imetadataDefinition from the trash.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Metadata Definition id
	 * @return MResponseMetadataDefinition
	*/
	def untrash(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinition ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinition = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinition()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadatadefinition/untrash")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadataDefinition])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataDefinition])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service is used to change:
	 * <ul>
	 * 	<li>names definition</li>
	 * 	<li>visibility option</li>
	 * 	<li>constraints, and options</li>
	 * 	<li>metadata key</li>
	 * </ul>
	 * 
	 * Changing the properties of a IMetadataDefinition like options and key, does not imply any changes
	 * on metada added to entities (contents, users or categories). This means that the inserted value
	 * should be updated by the client.
	 * 
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param id : String
	 * Metadata definition id
	 * @param param : MIMetadataDefinitionupdateReq
	 * @return MResponseMetadataDefinitionDetail
	*/
	def update(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			id: String, 
			param: MIMetadataDefinitionupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadatadefinition/update")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadataDefinitionDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataDefinitionDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Verifies whether or not the value of an imetadataDefinition is present on any entity.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_CLASS_[CLASSID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param key : String
	 * @return MResponseMetadataVerifyIfUsed
	*/
	def verifyIfUsed(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			key: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataVerifyIfUsed ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataVerifyIfUsed = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataVerifyIfUsed()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("imetadatadefinition/verifyIfUsed")
					.path(clientId.toString)
		.path(classificationId.toString)
		.path(key.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadataVerifyIfUsed])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadataVerifyIfUsed])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}