package it.newvision.nvp.xreports.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.services.model.reportweebo.MResponseReportsWeeboCreate
import it.newvision.nvp.xreports.services.model.request.MReportsWeebocreateReq
import it.newvision.nvp.xreports.services.model.reportweebo.MResponseReportsWeeboDetail
import it.newvision.nvp.xreports.services.model.request.MReportsWeebodetailReq
import it.newvision.nvp.xreports.services.model.reportweebo.MResponseReportsWeeboFindByProperties
import it.newvision.nvp.xreports.services.model.request.MReportsWeebofindByPropertiesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JReportsWeeboClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Used for CDN Reports
 */
class JReportsWeeboClient(val resourceEndpoint:String) {

	/**
	 * @param tokenId : String
	 * @param param : MReportsWeebocreateReq
	 * @return MResponseReportsWeeboCreate
	*/
	def create(tokenId: String, 
			param: MReportsWeebocreateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReportsWeeboCreate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReportsWeeboClient.client.resource(this.resourceEndpoint)
			val response : MResponseReportsWeeboCreate = if(this.resourceEndpoint == ""){
			
				new MResponseReportsWeeboCreate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reportsweebo/create")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReportsWeeboCreate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReportsWeeboCreate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MReportsWeebodetailReq
	 * @return MResponseReportsWeeboDetail
	*/
	def detail(tokenId: String, 
			param: MReportsWeebodetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReportsWeeboDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReportsWeeboClient.client.resource(this.resourceEndpoint)
			val response : MResponseReportsWeeboDetail = if(this.resourceEndpoint == ""){
			
				new MResponseReportsWeeboDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reportsweebo/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReportsWeeboDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReportsWeeboDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MReportsWeebofindByPropertiesReq
	 * @return MResponseReportsWeeboFindByProperties
	*/
	def findByProperties(tokenId: String, 
			param: MReportsWeebofindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReportsWeeboFindByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReportsWeeboClient.client.resource(this.resourceEndpoint)
			val response : MResponseReportsWeeboFindByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseReportsWeeboFindByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reportsweebo/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReportsWeeboFindByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReportsWeeboFindByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}