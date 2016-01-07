package it.newvision.nvp.xreports.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xreports.services.model.report.MResponseReports
import it.newvision.nvp.xreports.services.model.request.MReportsCallbackcallbackReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@Path("/reportscallback")
//#SWG#@Api(value = "/reportscallback", description = """""")
trait JReportsCallback extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * callback
	 * @param tokenId : String
	 * @param param : MReportsCallbackcallbackReq
	 * @return MResponseReports
	*/
	@POST
	@Path("/callback")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/callback", notes = """callback""", response = classOf[MResponseReports])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def callback(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MReportsCallbackcallbackReq):Response /*returnType = MResponseReports*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__callback(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_callback)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_callback)
	    }
	} 

	@GET
	@Path("/callback")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def callback_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseReports*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__callback(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MReportsCallbackcallbackReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_callback)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_callback)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __callback(tokenId: String, param: MReportsCallbackcallbackReq) :MResponseReports
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_callback: String

}