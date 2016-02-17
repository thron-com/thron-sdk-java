package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.content.MResponseContentReport
import it.newvision.nvp.xcontents.services.model.request.MContentAdminreportReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
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
@Path("/contentadmin")
//#SWG#@Api(value = "/contentadmin", description = """DEPRECATED.
//#SWGNL#Private Service used to create a Content. A Content is a generic object within the platform, may contain multiple descriptions in different languages, be linked to one or more categories, have tags and  be linked to other contents.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/adxcontents/resources/contentadmin/</li>
//#SWGNL#</ul>""")
trait JContentAdmin extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * the cascade parameter is used to indicate that the "linked" contents should be updated after the
	 * deletion of the given content. This could be used with basic element that are inside playlist.
	 * @param tokenId : String
	 * @param param : MContentAdminreportReq
	 * @return MResponseContentReport
	*/
	@POST
	@Path("/report")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/report", notes = """the cascade parameter is used to indicate that the "linked" contents should be updated after the deletion of the given content. This could be used with basic element that are inside playlist.""", response = classOf[MResponseContentReport])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def report(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentAdminreportReq):Response /*returnType = MResponseContentReport*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__report(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_report)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_report)
	    }
	} 

	@GET
	@Path("/report")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def report_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentReport*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__report(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentAdminreportReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_report)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_report)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __report(tokenId: String, param: MContentAdminreportReq) :MResponseContentReport
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_report: String

}