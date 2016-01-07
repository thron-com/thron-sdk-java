package it.newvision.nvp.xreports.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.services.model.report.MResponseReports
import it.newvision.nvp.xreports.services.model.request.MReportsCallbackcallbackReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JReportsCallbackClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
class JReportsCallbackClient(val resourceEndpoint:String) {

	/**
	 * callback
	 * @param tokenId : String
	 * @param param : MReportsCallbackcallbackReq
	 * @return MResponseReports
	*/
	def callback(tokenId: String, 
			param: MReportsCallbackcallbackReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReports ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReportsCallbackClient.client.resource(this.resourceEndpoint)
			val response : MResponseReports = if(this.resourceEndpoint == ""){
			
				new MResponseReports()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reportscallback/callback")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReports],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReports])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}