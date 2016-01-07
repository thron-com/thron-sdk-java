package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.identity.MResponseExternalIM

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JExternalIMClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * External Identity Manager Login Service
 */
class JExternalIMClient(val resourceEndpoint:String) {

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param password : String
	 * @return MResponseExternalIM
	*/
	def login(tokenId: String, 
			clientId: String, 
			username: String, 
			password: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseExternalIM ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JExternalIMClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(username).foreach(s => params.add("username", s))
		Option(password).foreach(s => params.add("password", s))  
			val response : MResponseExternalIM = if(this.resourceEndpoint == ""){
			
				new MResponseExternalIM()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("externalim/login")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseExternalIM],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseExternalIM])
				}
				else {
				  throw e
				}
		  }
	
	}

}