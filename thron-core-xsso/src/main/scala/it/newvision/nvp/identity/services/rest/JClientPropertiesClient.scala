package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.client.MResponseRoleList
import it.newvision.nvp.identity.services.model.client.MResponseDetailClientProperty

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JClientPropertiesClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Return the client properties used as default parameter for the operation in the
 * platform. This service is used to configure for example the different encoding
 * types, and bitrates, or to define the maximum number of thumbnail that a client
 * can store in the platform.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xsso/resources/clientproperties</li>
 * </ul>
 */
class JClientPropertiesClient(val resourceEndpoint:String) {

	/**
	 * The service return the role hierarchy list for the given role. This service is used when an admin
	 * console want to know the linked roles of a given role. Example: the role VIEW_PUBLISH_ANY_CONTENT
	 * is also a  VIEW_PUBLISH_OWN_CONTENT
	 * @param tokenId : String
	 * @param role : String
	 * @return MResponseRoleList
	*/
	def roleHierarchy(tokenId: String, 
			role: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRoleList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientPropertiesClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(role).foreach(s => params.add("role", s))
			val response : MResponseRoleList = if(this.resourceEndpoint == ""){
			
				new MResponseRoleList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("clientproperties/roleHierarchy")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseRoleList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRoleList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * The service return the full role list available in the platform.
	 * @param tokenId : String
	 * @return MResponseRoleList
	*/
	def roleList(tokenId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRoleList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientPropertiesClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		
			val response : MResponseRoleList = if(this.resourceEndpoint == ""){
			
				new MResponseRoleList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("clientproperties/roleList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseRoleList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRoleList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseDetailClientProperty
	*/
	def detail(tokenId: String, 
			clientId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDetailClientProperty ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JClientPropertiesClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
			val response : MResponseDetailClientProperty = if(this.resourceEndpoint == ""){
			
				new MResponseDetailClientProperty()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("clientproperties/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDetailClientProperty])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailClientProperty])
				}
				else {
					throw e
				}
			
		  }
	
	}

}