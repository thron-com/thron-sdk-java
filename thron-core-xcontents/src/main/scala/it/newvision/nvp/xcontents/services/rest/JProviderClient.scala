package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float}  
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.provider.MResponseRemoveProvider
import it.newvision.nvp.xcontents.services.model.provider.MResponseAddProvider
import it.newvision.nvp.xcontents.services.model.request.MProvideraddProviderReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JProviderClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service are used to update the provider properties of a Content. A Content
 * can be published using different providers, so these functions allow the user
 * to specify the identifier of the content in Weebo CDN or in Other CDN.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>WADL REST service: http://<clientId>-view.4me.
 * it/api/xcontents/resources/application.wadl</li>
 * 	<li>REST service: http://<clientId>-view.4me.
 * it/api/xcontents/resources/provider/</li>
 * 	<li>WSDL:http://<clientId>-view.4me.
 * it/api/xcontents/services/FProvider?wsdl</li>
 * </ul>
 */
class JProviderClient(val resourceEndpoint:String) {

	/**
	 * remove Provider
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param providerName : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseRemoveProvider
	*/
	def removeProvider(tokenId: String, 
			clientId: String, 
			contentId: String, 
			providerName: String, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRemoveProvider ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JProviderClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(providerName).foreach(s => params.add("providerName", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))  
			val response : MResponseRemoveProvider = if(this.resourceEndpoint == ""){
			
				new MResponseRemoveProvider()
			
			}else{
			
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML
				
				var wbuilder = webResource
					.path("provider/removeProvider")
					.accept(mediaType)
					.`type`(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseRemoveProvider],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRemoveProvider])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * The function create a new Provider for a different CDN
	 * @param tokenId : String
	 * @param param : MProvideraddProviderReq
	 * @return MResponseAddProvider
	*/
	def addProvider(tokenId: String, 
			param: MProvideraddProviderReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAddProvider ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JProviderClient.client.resource(this.resourceEndpoint)
			val response : MResponseAddProvider = if(this.resourceEndpoint == ""){
			
				new MResponseAddProvider()
			
			}else{
			
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML
				
				var wbuilder = webResource
					.path("provider/addProvider")
					.accept(mediaType)
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseAddProvider],param)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAddProvider])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}