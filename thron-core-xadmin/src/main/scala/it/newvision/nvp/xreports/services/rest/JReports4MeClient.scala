package it.newvision.nvp.xreports.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.services.model.report4me.MResponseReports4meCreate
import it.newvision.nvp.xreports.services.model.request.MReports4MecreateReq
import it.newvision.nvp.xreports.services.model.report4me.MResponseReports4meDetail
import it.newvision.nvp.xreports.services.model.request.MReports4MedetailReq
import it.newvision.nvp.xreports.services.model.report4me.MResponseReports4MeFindByProperties
import it.newvision.nvp.xreports.services.model.request.MReports4MefindByPropertiesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JReports4MeClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * DEPRECATED
 */
class JReports4MeClient(val resourceEndpoint:String) {

	/**
	 * @param tokenId : String
	 * @param param : MReports4MecreateReq
	 * @return MResponseReports4meCreate
	*/
	def create(tokenId: String, 
			param: MReports4MecreateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReports4meCreate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReports4MeClient.client.resource(this.resourceEndpoint)
			val response : MResponseReports4meCreate = if(this.resourceEndpoint == ""){
			
				new MResponseReports4meCreate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reports4me/create")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReports4meCreate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReports4meCreate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MReports4MedetailReq
	 * @return MResponseReports4meDetail
	*/
	def detail(tokenId: String, 
			param: MReports4MedetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReports4meDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReports4MeClient.client.resource(this.resourceEndpoint)
			val response : MResponseReports4meDetail = if(this.resourceEndpoint == ""){
			
				new MResponseReports4meDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reports4me/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReports4meDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReports4meDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MReports4MefindByPropertiesReq
	 * @return MResponseReports4MeFindByProperties
	*/
	def findByProperties(tokenId: String, 
			param: MReports4MefindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReports4MeFindByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReports4MeClient.client.resource(this.resourceEndpoint)
			val response : MResponseReports4MeFindByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseReports4MeFindByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reports4me/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReports4MeFindByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReports4MeFindByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}