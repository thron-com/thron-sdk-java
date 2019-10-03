package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.context.MResponseContextDetail
import com.thron.intelligence.services.model.request.MContextinsertReq
import com.thron.intelligence.services.model.context.MResponseContextList
import com.thron.intelligence.services.model.request.MContextlistReq
import com.thron.intelligence.services.model.context.MResponseContext
import com.thron.intelligence.services.model.request.MContextupdateReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JContextClient {
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
 * com/api/xintelligence/resources/context</li>
 * </ul>
 */
class JContextClient(val resourceEndpoint:String) {

	/**
	 * Creates a context.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_MANAGE_CONTEXT role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContextinsertReq
	 * @return MResponseContextDetail
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MContextinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContextDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContextClient.client.resource(this.resourceEndpoint)
			val response : MResponseContextDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContextDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("context/insert")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContextDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContextDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the list of contexts matching provided criteria sorted by createdDate.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContextlistReq
	 * @return MResponseContextList
	*/
	def list(tokenId: String, 
			clientId: String, 
			param: MContextlistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContextList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContextClient.client.resource(this.resourceEndpoint)
			val response : MResponseContextList = if(this.resourceEndpoint == ""){
			
				new MResponseContextList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("context/list")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContextList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContextList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Marks a context as removed.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_MANAGE_CONTEXT role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @return MResponseContext
	*/
	def remove(tokenId: String, 
			clientId: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContext ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContextClient.client.resource(this.resourceEndpoint)
			val response : MResponseContext = if(this.resourceEndpoint == ""){
			
				new MResponseContext()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("context/remove")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContext])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContext])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates a context in patch mode.
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>THRON_MANAGE_CONTEXT role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MContextupdateReq
	 * @return MResponseContext
	*/
	def update(tokenId: String, 
			clientId: String, 
			id: String, 
			param: MContextupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContext ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContextClient.client.resource(this.resourceEndpoint)
			val response : MResponseContext = if(this.resourceEndpoint == ""){
			
				new MResponseContext()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("context/update")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContext],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContext])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}