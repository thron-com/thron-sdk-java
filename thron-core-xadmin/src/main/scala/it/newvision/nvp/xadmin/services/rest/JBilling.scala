package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
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
@Path("/billing")
//#SWG#@Api(value = "/billing", description = """This service is called from the Cloud Scheduler, every x days.
//#SWGNL#The goal is to define a timed snapshot of the platform usage.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>WADL REST service: http://clientId-view.4me.it/api/xadmin/resources/application.wadl</li>
//#SWGNL#</ul>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.4me.it/api/xadmin/resources/billing/</li>
//#SWGNL#</ul>
//#SWGNL#<ul>
//#SWGNL#	<li>WSDL: http://clientId-view.4me.it/api/xadmin/services/FBilling?wsdl</li>
//#SWGNL#</ul>""")
trait JBilling extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Used to create a new billing snapshot of the platform clients.
	 * @param tokenId : String
	 * @param param : MBillingnewSnapshotReq
	 * @return MResponseBilling
	*/
	@POST
	@Path("/newSnapshot")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/newSnapshot", notes = """Used to create a new billing snapshot of the platform clients.""", response = classOf[MResponseBilling])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def newSnapshot(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MBillingnewSnapshotReq):Response /*returnType = MResponseBilling*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__newSnapshot(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_newSnapshot)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_newSnapshot)
	    }
	} 

	@GET
	@Path("/newSnapshot")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def newSnapshot_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseBilling*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__newSnapshot(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MBillingnewSnapshotReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_newSnapshot)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_newSnapshot)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __newSnapshot(tokenId: String, param: MBillingnewSnapshotReq) :MResponseBilling
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_newSnapshot: String

	/**
	 * create a new csv billing report.
	 * Can be invoked only by superusers
	 * @param tokenId : String
	 * @param param : MBillinggetReportsReq
	 * @return MResponseBillingReport
	*/
	@POST
	@Path("/getReports")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getReports", notes = """create a new csv billing report.
	//#SWGNL#Can be invoked only by superusers""", response = classOf[MResponseBillingReport])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getReports(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MBillinggetReportsReq):Response /*returnType = MResponseBillingReport*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getReports(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getReports)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getReports)
	    }
	} 

	@GET
	@Path("/getReports")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getReports_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseBillingReport*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getReports(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MBillinggetReportsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getReports)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getReports)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getReports(tokenId: String, param: MBillinggetReportsReq) :MResponseBillingReport
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getReports: String

	/**
	 * return the given report in csv format
	 * Can be invoked only by superusers
	 * @param tokenId : String
	 * @param reportId : String
	 * @return String
	*/
	@GET
	@Path("/getCsvReport")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getCsvReport", notes = """return the given report in csv format
	//#SWGNL#Can be invoked only by superusers""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getCsvReport(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("reportId")
	reportId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = String*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getCsvReport") 
		try{	
			val resp = this.__getCsvReport(PRestHelper.getTokenId(tokenId_q, tokenId),reportId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getCsvReport)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getCsvReport)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getCsvReport(tokenId: String, reportId: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getCsvReport: String

	/**
	 * Remove the report
	 * @param tokenId : String
	 * @param param : MBillingdeleteReportReq
	 * @return MResponseBilling
	*/
	@POST
	@Path("/deleteReport")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/deleteReport", notes = """Remove the report""", response = classOf[MResponseBilling])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def deleteReport(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MBillingdeleteReportReq):Response /*returnType = MResponseBilling*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__deleteReport(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_deleteReport)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_deleteReport)
	    }
	} 

	@GET
	@Path("/deleteReport")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def deleteReport_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseBilling*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__deleteReport(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MBillingdeleteReportReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_deleteReport)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_deleteReport)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __deleteReport(tokenId: String, param: MBillingdeleteReportReq) :MResponseBilling
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_deleteReport: String

	/**
	 * Update the MReport.note field
	 * @param tokenId : String
	 * @param param : MBillingupdateReportNoteReq
	 * @return MResponseBilling
	*/
	@POST
	@Path("/updateReportNote")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateReportNote", notes = """Update the MReport.note field""", response = classOf[MResponseBilling])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateReportNote(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MBillingupdateReportNoteReq):Response /*returnType = MResponseBilling*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateReportNote(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateReportNote)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateReportNote)
	    }
	} 

	@GET
	@Path("/updateReportNote")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateReportNote_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseBilling*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateReportNote(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MBillingupdateReportNoteReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateReportNote)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateReportNote)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateReportNote(tokenId: String, param: MBillingupdateReportNoteReq) :MResponseBilling
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateReportNote: String

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
	@GET
	@Path("/makeReport")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/makeReport", notes = """create all "missing" reports in the specified tiem range.
	//#SWGNL#Can be invoked only by superusers""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def makeReport(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """Optional. recreate the reports from this date.
	//#SWGNL#minimum value and default is TODAY - 1 Year""")
	@QueryParam("fromDate")
	fromDate: it.newvision.nvp.core.libraries.rs.DateType, 
			//#SWG#@ApiParam(value = """Optional. recreate the reports until this date""")
	@QueryParam("toDate")
	toDate: it.newvision.nvp.core.libraries.rs.DateType,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = String*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("makeReport") 
		try{	
			val resp = this.__makeReport(PRestHelper.getTokenId(tokenId_q, tokenId),fromDate,toDate)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_makeReport)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_makeReport)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __makeReport(tokenId: String, fromDate: it.newvision.nvp.core.libraries.rs.DateType, toDate: it.newvision.nvp.core.libraries.rs.DateType) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_makeReport: String

}