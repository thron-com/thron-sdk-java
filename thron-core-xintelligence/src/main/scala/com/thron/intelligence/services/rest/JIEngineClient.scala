package com.thron.intelligence.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.engine.MResponseEngineDetail
import com.thron.intelligence.services.model.request.MIEngineupdateReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JIEngineClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to handle engine configurations
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xintelligence/resources/iengine</li>
 * </ul>
 */
class JIEngineClient(val resourceEndpoint:String) {

	/**
	 * Get the engine configuration for a specific classification
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @return MResponseEngineDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			classificationId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEngineDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIEngineClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		
			val response : MResponseEngineDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEngineDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("iengine/detail")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseEngineDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEngineDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Used to update the engine configuration of a given classification in patch mode.
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>Role Validation:</b>
	 * Can be invoked only by users with role  THRON_CLASS_[CLASSID]_MANAGER
	 * @param tokenId : String
	 * @param clientId : String
	 * @param classificationId : String
	 * @param param : MIEngineupdateReq
	 * @return MResponseEngineDetail
	*/
	def update(tokenId: String, 
			clientId: String, 
			classificationId: String, 
			param: MIEngineupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseEngineDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JIEngineClient.client.resource(this.resourceEndpoint)
			val response : MResponseEngineDetail = if(this.resourceEndpoint == ""){
			
				new MResponseEngineDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("iengine/update")
					.path(clientId.toString)
		.path(classificationId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseEngineDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseEngineDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}