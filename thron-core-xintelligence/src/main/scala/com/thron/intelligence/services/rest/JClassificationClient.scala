package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.classification.MResponseClassificationDetail
import com.thron.intelligence.services.model.request.MClassificationinsertReq
import com.thron.intelligence.services.model.classification.MResponseClassificationList
import com.thron.intelligence.services.model.request.MClassificationlistReq
import com.thron.intelligence.services.model.classification.MEClassificationOrderBy
import com.thron.intelligence.services.model.request.MClassificationupdateReq
import com.thron.intelligence.services.model.classification.MResponseClassification

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JClassificationClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to handle classification
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xintelligence/resources/classification/     </li>
 * </ul>
 */
class JClassificationClient(val resourceEndpoint:String) {

	/**
	 * Insert a new Classification.
	 * Max number of clientId's classification is 5 (1 TOPIC, 1 TARGET and 3 CUSTOM classifications)
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASSIFICATIONS_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MClassificationinsertReq
	 * @return MResponseClassificationDetail
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MClassificationinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClassificationClient.client.resource(this.resourceEndpoint)
			val response : MResponseClassificationDetail = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("classification/insert")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClassificationDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Lists the client's Classification. This method return the classifications matching the given search
	 * criteria.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MClassificationlistReq
	 * @return MResponseClassificationList
	*/
	def list(tokenId: String, 
			clientId: String, 
			param: MClassificationlistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClassificationClient.client.resource(this.resourceEndpoint)
			val response : MResponseClassificationList = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("classification/list")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClassificationList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Lists the client's Classification. This method return all classification by default.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param text : String
	 * Optional. Search text in label or description fields

	 * @param lang : String
	 * Optional. Used to search the classification having title like "name" for the defined language.
	 * Example: the user would like to find the Classification with label "house" for lang "EN". If the
	 * "label" is empty the service return all classification defined for the specified lang.

	 * @param orderBy : MEClassificationOrderBy
	 * Optional
	 * @param offset : Integer
	 * Optional.
	 * Default value is 0
	 * @param limit : Integer
	 * Optional. Default value is 50
	 * @return MResponseClassificationList
	*/
	def listGet(tokenId: String, 
			clientId: String, 
			text: String, 
			lang: String, 
			orderBy: MEClassificationOrderBy, 
			offset: Integer, 
			limit: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClassificationClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(text).foreach(s => params.add("text", s))
		Option(lang).foreach(s => params.add("lang", s))
		Option(orderBy).foreach(s => params.add("orderBy", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(limit).foreach(s => params.add("limit", s))
			val response : MResponseClassificationList = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("classification/listGet")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseClassificationList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASSIFICATIONS_VIEWER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * classification Id
	 * @return MResponseClassificationDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClassificationClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		
			val response : MResponseClassificationDetail = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("classification/detail")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseClassificationDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Update a given classification in patch mode.
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASSIFICATIONS_MANAGER or
	 * THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * classification id
	 * @param param : MClassificationupdateReq
	 * @return MResponseClassificationDetail
	*/
	def update(tokenId: String, 
			clientId: String, 
			id: String, 
			param: MClassificationupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassificationDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClassificationClient.client.resource(this.resourceEndpoint)
			val response : MResponseClassificationDetail = if(this.resourceEndpoint == ""){
			
				new MResponseClassificationDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("classification/update")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClassificationDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassificationDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove a given classification.
	 * Only inactive classification can be removed (Classification.active= false)
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASSIFICATIONS_MANAGER or
	 * THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * classification id
	 * @return MResponseClassification
	*/
	def remove(tokenId: String, 
			clientId: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseClassification ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClassificationClient.client.resource(this.resourceEndpoint)
			val response : MResponseClassification = if(this.resourceEndpoint == ""){
			
				new MResponseClassification()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("classification/remove")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseClassification])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseClassification])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}