package it.newvision.nvp.xreports.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
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
@Path("/loganalyzer")
//#SWG#@Api(value = "/loganalyzer", description = """""")
trait JLogAnalyzer extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * @param clientId : String
	 * @param reportId : String
	 * @param fileName : String
	 * @param reportType : String
	 * @return javax.ws.rs.core.Response
	*/
	@GET
	                @Path("downloadReport/{fileName}")
	                @Produces(Array("*/*"))
	def downloadReport(@QueryParam("clientId")
	clientId: String, 
			@QueryParam("reportId")
	reportId: String, 
			@PathParam("fileName")
	fileName: String, 
			@QueryParam("reportType")
	reportType: String):javax.ws.rs.core.Response 

	 


	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 

	protected def capability_downloadReport: String

	/**
	 * @param tokenId : String
	 * @param param : MLogAnalyzernewReportWeeboForBillingReq
	 * @return MResponseLogAnalyzerBilling
	*/
	@POST
	@Path("/newReportWeeboForBilling")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/newReportWeeboForBilling", notes = """""", response = classOf[MResponseLogAnalyzerBilling])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def newReportWeeboForBilling(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MLogAnalyzernewReportWeeboForBillingReq):Response /*returnType = MResponseLogAnalyzerBilling*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__newReportWeeboForBilling(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_newReportWeeboForBilling)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_newReportWeeboForBilling)
	    }
	} 

	@GET
	@Path("/newReportWeeboForBilling")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def newReportWeeboForBilling_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseLogAnalyzerBilling*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__newReportWeeboForBilling(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MLogAnalyzernewReportWeeboForBillingReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_newReportWeeboForBilling)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_newReportWeeboForBilling)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __newReportWeeboForBilling(tokenId: String, param: MLogAnalyzernewReportWeeboForBillingReq) :MResponseLogAnalyzerBilling
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_newReportWeeboForBilling: String

	/**
	 * @param tokenId : String
	 * @param param : MLogAnalyzernewReportWeeboReq
	 * @return MResponseLogAnalyzer
	*/
	@POST
	@Path("/newReportWeebo")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/newReportWeebo", notes = """""", response = classOf[MResponseLogAnalyzer])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def newReportWeebo(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MLogAnalyzernewReportWeeboReq):Response /*returnType = MResponseLogAnalyzer*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__newReportWeebo(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_newReportWeebo)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_newReportWeebo)
	    }
	} 

	@GET
	@Path("/newReportWeebo")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def newReportWeebo_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseLogAnalyzer*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__newReportWeebo(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MLogAnalyzernewReportWeeboReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_newReportWeebo)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_newReportWeebo)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __newReportWeebo(tokenId: String, param: MLogAnalyzernewReportWeeboReq) :MResponseLogAnalyzer
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_newReportWeebo: String

	/**
	 * @return javax.ws.rs.core.Response
	*/
	@GET
	                @Path("getMaxDateForReportst}")
	                @Produces(Array("text/plain"))
	def getMaxDateForReports():javax.ws.rs.core.Response 

	 


	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 

	protected def capability_getMaxDateForReports: String

	/**
	 * @param tokenId : String
	 * @param param : MLogAnalyzergetReportStatusReq
	 * @return MResponseLogAnalyzerDetail
	*/
	@POST
	@Path("/getReportStatus")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getReportStatus", notes = """""", response = classOf[MResponseLogAnalyzerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getReportStatus(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MLogAnalyzergetReportStatusReq):Response /*returnType = MResponseLogAnalyzerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getReportStatus(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getReportStatus)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getReportStatus)
	    }
	} 

	@GET
	@Path("/getReportStatus")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getReportStatus_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseLogAnalyzerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getReportStatus(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MLogAnalyzergetReportStatusReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getReportStatus)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getReportStatus)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getReportStatus(tokenId: String, param: MLogAnalyzergetReportStatusReq) :MResponseLogAnalyzerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getReportStatus: String

	/**
	 * remove the temporary results. This service is called by nvp-core once the service saved the results
	 * in cdn storage.
	 * @param tokenId : String
	 * @param param : MLogAnalyzerdeleteReportResultsReq
	 * @return MResponseLogAnalyzer
	*/
	@POST
	@Path("/deleteReportResults")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/deleteReportResults", notes = """remove the temporary results. This service is called by nvp-core once the service saved the results in cdn storage.""", response = classOf[MResponseLogAnalyzer])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def deleteReportResults(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MLogAnalyzerdeleteReportResultsReq):Response /*returnType = MResponseLogAnalyzer*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__deleteReportResults(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_deleteReportResults)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_deleteReportResults)
	    }
	} 

	@GET
	@Path("/deleteReportResults")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def deleteReportResults_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseLogAnalyzer*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__deleteReportResults(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MLogAnalyzerdeleteReportResultsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_deleteReportResults)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_deleteReportResults)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __deleteReportResults(tokenId: String, param: MLogAnalyzerdeleteReportResultsReq) :MResponseLogAnalyzer
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_deleteReportResults: String

}