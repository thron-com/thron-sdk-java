package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MResponseContentReport
import it.newvision.nvp.xcontents.services.model.request.MContentAdminreportReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JContentAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * DEPRECATED.
 * Private Service used to create a Content. A Content is a generic object within
 * the platform, may contain multiple descriptions in different languages, be
 * linked to one or more categories, have tags and  be linked to other contents.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/adxcontents/resources/contentadmin/</li>
 * </ul>
 */
class JContentAdminClient(val resourceEndpoint:String) {

	/**
	 * the cascade parameter is used to indicate that the "linked" contents should be updated after the
	 * deletion of the given content. This could be used with basic element that are inside playlist.
	 * @param tokenId : String
	 * @param param : MContentAdminreportReq
	 * @return MResponseContentReport
	*/
	def report(tokenId: String, 
			param: MContentAdminreportReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentReport ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentReport = if(this.resourceEndpoint == ""){
			
				new MResponseContentReport()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contentadmin/report")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentReport],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentReport])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}