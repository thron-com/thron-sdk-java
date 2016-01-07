package it.newvision.nvp.xreports.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.services.model.loganalyzer.MResponseLogAnalyzerBilling
import it.newvision.nvp.xreports.services.model.request.MLogAnalyzernewReportWeeboForBillingReq
import it.newvision.nvp.xreports.services.model.loganalyzer.MResponseLogAnalyzer
import it.newvision.nvp.xreports.services.model.request.MLogAnalyzernewReportWeeboReq
import it.newvision.nvp.xreports.services.model.loganalyzer.MResponseLogAnalyzerDetail
import it.newvision.nvp.xreports.services.model.request.MLogAnalyzergetReportStatusReq
import it.newvision.nvp.xreports.services.model.request.MLogAnalyzerdeleteReportResultsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JLogAnalyzerClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
class JLogAnalyzerClient(val resourceEndpoint:String) {

	/**
	 * @param tokenId : String
	 * @param param : MLogAnalyzernewReportWeeboForBillingReq
	 * @return MResponseLogAnalyzerBilling
	*/
	def newReportWeeboForBilling(tokenId: String, 
			param: MLogAnalyzernewReportWeeboForBillingReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLogAnalyzerBilling ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JLogAnalyzerClient.client.resource(this.resourceEndpoint)
			val response : MResponseLogAnalyzerBilling = if(this.resourceEndpoint == ""){
			
				new MResponseLogAnalyzerBilling()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("loganalyzer/newReportWeeboForBilling")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLogAnalyzerBilling],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLogAnalyzerBilling])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MLogAnalyzernewReportWeeboReq
	 * @return MResponseLogAnalyzer
	*/
	def newReportWeebo(tokenId: String, 
			param: MLogAnalyzernewReportWeeboReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLogAnalyzer ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JLogAnalyzerClient.client.resource(this.resourceEndpoint)
			val response : MResponseLogAnalyzer = if(this.resourceEndpoint == ""){
			
				new MResponseLogAnalyzer()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("loganalyzer/newReportWeebo")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLogAnalyzer],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLogAnalyzer])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MLogAnalyzergetReportStatusReq
	 * @return MResponseLogAnalyzerDetail
	*/
	def getReportStatus(tokenId: String, 
			param: MLogAnalyzergetReportStatusReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLogAnalyzerDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JLogAnalyzerClient.client.resource(this.resourceEndpoint)
			val response : MResponseLogAnalyzerDetail = if(this.resourceEndpoint == ""){
			
				new MResponseLogAnalyzerDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("loganalyzer/getReportStatus")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLogAnalyzerDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLogAnalyzerDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * remove the temporary results. This service is called by nvp-core once the service saved the results
	 * in cdn storage.
	 * @param tokenId : String
	 * @param param : MLogAnalyzerdeleteReportResultsReq
	 * @return MResponseLogAnalyzer
	*/
	def deleteReportResults(tokenId: String, 
			param: MLogAnalyzerdeleteReportResultsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLogAnalyzer ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JLogAnalyzerClient.client.resource(this.resourceEndpoint)
			val response : MResponseLogAnalyzer = if(this.resourceEndpoint == ""){
			
				new MResponseLogAnalyzer()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("loganalyzer/deleteReportResults")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLogAnalyzer],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLogAnalyzer])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}