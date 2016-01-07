package it.newvision.nvp.xreports.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.services.model.report.MResponseReports
import it.newvision.nvp.xreports.services.model.request.MReportsremoveReq
import it.newvision.nvp.xreports.services.model.report.MResponseReportsFindByProperties
import it.newvision.nvp.xreports.services.model.request.MReportsfindByPropertiesReq
import it.newvision.nvp.xreports.services.model.report.MResponseReportsUpdate
import it.newvision.nvp.xreports.services.model.request.MReportsupdateReq
import it.newvision.nvp.xreports.services.model.report.MResponseReportsCheckStatus
import it.newvision.nvp.xreports.services.model.request.MReportscheckStatusReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JReportsClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
class JReportsClient(val resourceEndpoint:String) {

	/**
	 * @param tokenId : String
	 * @param param : MReportsremoveReq
	 * @return MResponseReports
	*/
	def remove(tokenId: String, 
			param: MReportsremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReports ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReportsClient.client.resource(this.resourceEndpoint)
			val response : MResponseReports = if(this.resourceEndpoint == ""){
			
				new MResponseReports()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reports/remove")
				
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

	/**
	 * @param tokenId : String
	 * @param param : MReportsfindByPropertiesReq
	 * @return MResponseReportsFindByProperties
	*/
	def findByProperties(tokenId: String, 
			param: MReportsfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReportsFindByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReportsClient.client.resource(this.resourceEndpoint)
			val response : MResponseReportsFindByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseReportsFindByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reports/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReportsFindByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReportsFindByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MReportsupdateReq
	 * @return MResponseReportsUpdate
	*/
	def update(tokenId: String, 
			param: MReportsupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReportsUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReportsClient.client.resource(this.resourceEndpoint)
			val response : MResponseReportsUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseReportsUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reports/update")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReportsUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReportsUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MReportscheckStatusReq
	 * @return MResponseReportsCheckStatus
	*/
	def checkStatus(tokenId: String, 
			param: MReportscheckStatusReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseReportsCheckStatus ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JReportsClient.client.resource(this.resourceEndpoint)
			val response : MResponseReportsCheckStatus = if(this.resourceEndpoint == ""){
			
				new MResponseReportsCheckStatus()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("reports/checkStatus")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseReportsCheckStatus],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseReportsCheckStatus])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}