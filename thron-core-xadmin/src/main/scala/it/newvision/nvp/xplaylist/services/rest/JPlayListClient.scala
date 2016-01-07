package it.newvision.nvp.xplaylist.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xplaylist.services.model.playlist.MResponsePlayListDescriptor

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPlayListClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * The Playlist service is used to deliver the content descriptor to a client
 * enabled to play the contents returned by the service. This service has no SOAP
 * web service interface, and the content result is cached.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/xadmin/resources/playlist/</li>
 * </ul>
 * <ul>
 * 	<li>WADL REST service: http://clientId-view.4me.
 * it/api/xadmin/resources/application.wadl</li>
 * </ul>
 */
class JPlayListClient(val resourceEndpoint:String) {

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xpublisherId : String
	 * @param locale : String
	 * @param offset : Integer
	 * @param numberOfResult : Integer
	 * @param channelType : String
	 * @param clientIPv4 : String
	 * @param clientIPv6 : String
	 * @param userAgent : String
	 * @param authServiceForCallback : String
	 * @return MResponsePlayListDescriptor
	*/
	def getContentDescriptor(tokenId: String, 
			clientId: String, 
			xpublisherId: String, 
			locale: String, 
			offset: Integer, 
			numberOfResult: Integer, 
			channelType: String, 
			clientIPv4: String, 
			clientIPv6: String, 
			userAgent: String, 
			authServiceForCallback: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayListDescriptor ={
		try{
					val webResource = JPlayListClient.client.resource(this.resourceEndpoint)
					val params = new com.sun.jersey.core.util.MultivaluedMapImpl
					Option(clientId).foreach(s => params.add("clientId", s))
					Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
					Option(locale).foreach(s => params.add("locale", s))
					Option(offset).foreach(s => params.add("offset", s))
					Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
					Option(channelType).foreach(s => params.add("channelType", s))
					Option(channelType).foreach(s => params.add("channelType", s))
					val response : MResponsePlayListDescriptor = webResource.queryParams(params)
						.path("playlist/getContentDescriptor")
						.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
						.header("X-TOKENID",tokenId)
						.header("X-CLIENTIPV4",clientIPv4)
						.header("X-CLIENTIPV6",clientIPv6)
						.header("X-USERAGENT",userAgent)
						.header("X-AUTHSERVICEFORCALLBACK",authServiceForCallback)
						.get(classOf[MResponsePlayListDescriptor])
					response
				  }catch{
					case e : com.sun.jersey.api.client.UniformInterfaceException =>
						val response = e.getResponse
						if(response.getStatus >= 418) {
						  response.getEntity(classOf[MResponsePlayListDescriptor])
						}
						else {
						  throw e
						}
				  }
	}

}