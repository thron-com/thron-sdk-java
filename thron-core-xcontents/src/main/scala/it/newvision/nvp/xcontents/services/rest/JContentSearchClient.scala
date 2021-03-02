package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.contentsearch.MContentSearchInsertResult
import it.newvision.nvp.xcontents.services.model.request.MContentSearchinsertReq
import it.newvision.nvp.xcontents.services.model.content.contentsearch.MContentSearchListResult
import it.newvision.nvp.xcontents.services.model.content.contentsearch.MContentSearchDeleteResult
import it.newvision.nvp.xcontents.services.model.request.MContentSearchdeleteReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JContentSearchClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to manage a content search.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/contentsearch</li>
 * </ul>
 */
class JContentSearchClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentSearchinsertReq
	 * @return MContentSearchInsertResult
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MContentSearchinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MContentSearchInsertResult ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentSearchClient.client.resource(this.resourceEndpoint)
			val response : MContentSearchInsertResult = if(this.resourceEndpoint == ""){
			
				new MContentSearchInsertResult()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contentsearch/insert")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MContentSearchInsertResult],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MContentSearchInsertResult])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param limit : Integer
	 * @param cursor : String
	 * @return MContentSearchListResult
	*/
	def list(tokenId: String, 
			clientId: String, 
			limit: Integer, 
			cursor: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MContentSearchListResult ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentSearchClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(limit).foreach(s => params.add("limit", s))
		Option(cursor).foreach(s => params.add("cursor", s))
			val response : MContentSearchListResult = if(this.resourceEndpoint == ""){
			
				new MContentSearchListResult()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("contentsearch/list")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MContentSearchListResult])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MContentSearchListResult])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentSearchdeleteReq
	 * @return MContentSearchDeleteResult
	*/
	def delete(tokenId: String, 
			clientId: String, 
			param: MContentSearchdeleteReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MContentSearchDeleteResult ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentSearchClient.client.resource(this.resourceEndpoint)
			val response : MContentSearchDeleteResult = if(this.resourceEndpoint == ""){
			
				new MContentSearchDeleteResult()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contentsearch/delete")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MContentSearchDeleteResult],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MContentSearchDeleteResult])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}