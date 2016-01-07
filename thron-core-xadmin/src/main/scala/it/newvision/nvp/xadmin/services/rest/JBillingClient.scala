package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.billing.MResponseBilling
import it.newvision.nvp.xadmin.services.model.request.MBillingnewSnapshotReq
import it.newvision.nvp.xadmin.services.model.billing.MResponseBillingReport
import it.newvision.nvp.xadmin.services.model.request.MBillinggetReportsReq
import it.newvision.nvp.xadmin.services.model.request.MBillingdeleteReportReq
import it.newvision.nvp.xadmin.services.model.request.MBillingupdateReportNoteReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JBillingClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is called from the Cloud Scheduler, every x days.
 * The goal is to define a timed snapshot of the platform usage.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>WADL REST service: http://clientId-view.4me.
 * it/api/xadmin/resources/application.wadl</li>
 * </ul>
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/xadmin/resources/billing/</li>
 * </ul>
 * <ul>
 * 	<li>WSDL: http://clientId-view.4me.it/api/xadmin/services/FBilling?wsdl</li>
 * </ul>
 */
class JBillingClient(val resourceEndpoint:String) {

	/**
	 * Used to create a new billing snapshot of the platform clients.
	 * @param tokenId : String
	 * @param param : MBillingnewSnapshotReq
	 * @return MResponseBilling
	*/
	def newSnapshot(tokenId: String, 
			param: MBillingnewSnapshotReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseBilling ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JBillingClient.client.resource(this.resourceEndpoint)
			val response : MResponseBilling = if(this.resourceEndpoint == ""){
			
				new MResponseBilling()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("billing/newSnapshot")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseBilling],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseBilling])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * create a new csv billing report.
	 * Can be invoked only by superusers
	 * @param tokenId : String
	 * @param param : MBillinggetReportsReq
	 * @return MResponseBillingReport
	*/
	def getReports(tokenId: String, 
			param: MBillinggetReportsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseBillingReport ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JBillingClient.client.resource(this.resourceEndpoint)
			val response : MResponseBillingReport = if(this.resourceEndpoint == ""){
			
				new MResponseBillingReport()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("billing/getReports")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseBillingReport],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseBillingReport])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * return the given report in csv format
	 * Can be invoked only by superusers
	 * @param tokenId : String
	 * @param reportId : String
	 * @return String
	*/
	def getCsvReport(tokenId: String, 
			reportId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JBillingClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(reportId).foreach(s => params.add("reportId", s))
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("billing/getCsvReport")
				
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[String])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[String])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Remove the report
	 * @param tokenId : String
	 * @param param : MBillingdeleteReportReq
	 * @return MResponseBilling
	*/
	def deleteReport(tokenId: String, 
			param: MBillingdeleteReportReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseBilling ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JBillingClient.client.resource(this.resourceEndpoint)
			val response : MResponseBilling = if(this.resourceEndpoint == ""){
			
				new MResponseBilling()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("billing/deleteReport")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseBilling],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseBilling])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Update the MReport.note field
	 * @param tokenId : String
	 * @param param : MBillingupdateReportNoteReq
	 * @return MResponseBilling
	*/
	def updateReportNote(tokenId: String, 
			param: MBillingupdateReportNoteReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseBilling ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JBillingClient.client.resource(this.resourceEndpoint)
			val response : MResponseBilling = if(this.resourceEndpoint == ""){
			
				new MResponseBilling()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("billing/updateReportNote")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseBilling],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseBilling])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * create all "missing" reports in the specified tiem range.
	 * Can be invoked only by superusers
	 * @param tokenId : String
	 * @param fromDate : Date
	 * Optional. recreate the reports from this date.
	 * minimum value and default is TODAY - 1 Year
	 * @param toDate : Date
	 * Optional. recreate the reports until this date
	 * @return String
	*/
	def makeReport(tokenId: String, 
			fromDate: it.newvision.nvp.core.libraries.rs.DateType, 
			toDate: it.newvision.nvp.core.libraries.rs.DateType)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JBillingClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(fromDate).foreach(s => params.add("fromDate", s))
		Option(toDate).foreach(s => params.add("toDate", s))
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("billing/makeReport")
				
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[String])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[String])
				}
				else {
					throw e
				}
			
		  }
	
	}

}