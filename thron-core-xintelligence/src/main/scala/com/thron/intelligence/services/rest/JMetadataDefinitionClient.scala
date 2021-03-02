package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinitionDetail
import com.thron.intelligence.services.model.request.MMetadataDefinitioninsertReq
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinitionList
import com.thron.intelligence.services.model.request.MMetadataDefinitionlistReq
import com.thron.intelligence.services.model.metadata.MEMetadataDefinitionOrderBy
import com.thron.intelligence.services.model.metadata.MResponseMetadataDefinition
import com.thron.intelligence.services.model.request.MMetadataDefinitionupdateReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JMetadataDefinitionClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Services used to add new custom generic Metadata Definition linked to entities
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xintelligence/resources/metadatadefinition</li>
 * </ul>
 */
class JMetadataDefinitionClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Attention: this service makes use of cache control to ensure best performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @return MResponseMetadataDefinitionDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		
			val response : MResponseMetadataDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("metadatadefinition/detail")
					.path(clientId.toString)
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
	 * Create a new generic Metadata definition. Generic Metadata definition can not be used with Tags
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MMetadataDefinitioninsertReq
	 * @return MResponseMetadataDefinitionDetail
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MMetadataDefinitioninsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadatadefinition/insert")
					.path(clientId.toString)
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
	 * Lists the client's Metadata definition. This method return the metadata definition matching the
	 * given search criteria.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MMetadataDefinitionlistReq
	 * @return MResponseMetadataDefinitionList
	*/
	def list(tokenId: String, 
			clientId: String, 
			param: MMetadataDefinitionlistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinitionList = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadatadefinition/list")
					.path(clientId.toString)
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
	 * Lists the client's MetadataDefinition.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param searchText : String
	 * Optional
	 * Search criteria
	 * @param searchIds : String
	 * Optional. csv list of MetadataDefinition.id
	 * Search criteria
	 * @param searchLang : String
	 * Optional.

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
			searchText: String, 
			searchIds: String, 
			searchLang: String, 
			orderBy: MEMetadataDefinitionOrderBy, 
			offset: Integer, 
			limit: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(searchText).foreach(s => params.add("searchText", s))
		Option(searchIds).foreach(s => params.add("searchIds", s))
		Option(searchLang).foreach(s => params.add("searchLang", s))
		Option(orderBy).foreach(s => params.add("orderBy", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(limit).foreach(s => params.add("limit", s))
			val response : MResponseMetadataDefinitionList = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("metadatadefinition/listGet")
					.path(clientId.toString)
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
	 * move a metadata definition to the trash.
	 * This operation does not remove the instances of metadata linked to a specific entity
	 * (content/user/category...), so it's possible to restore the metadata using the untrash service.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @return MResponseMetadataDefinition
	*/
	def trash(tokenId: String, 
			clientId: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinition ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinition = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinition()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadatadefinition/trash")
					.path(clientId.toString)
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
	 * Restore a metadata definition from the trash
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @return MResponseMetadataDefinition
	*/
	def untrash(tokenId: String, 
			clientId: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinition ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinition = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinition()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadatadefinition/untrash")
					.path(clientId.toString)
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
	 * 	<li>metadataType</li>
	 * 	<li>metadata key</li>
	 * </ul>
	 * 
	 * Changing the properties of a metadata Definition like options, metadataType and key, does not imply
	 * any changes on metada added to entities (contents, users or categories). This means that the
	 * inserted value should be updated by the client.
	 * 
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MMetadataDefinitionupdateReq
	 * @return MResponseMetadataDefinitionDetail
	*/
	def update(tokenId: String, 
			clientId: String, 
			id: String, 
			param: MMetadataDefinitionupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseMetadataDefinitionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataDefinitionClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadataDefinitionDetail = if(this.resourceEndpoint == ""){
			
				new MResponseMetadataDefinitionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadatadefinition/update")
					.path(clientId.toString)
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

}