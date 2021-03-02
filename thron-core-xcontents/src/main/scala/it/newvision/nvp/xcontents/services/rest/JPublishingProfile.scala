package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.publishingProfile.MPublishingProfileListResponse
import it.newvision.nvp.xcontents.services.model.publishingProfile.MEPublishingProfileStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to manage Publishing Profile settings.
 * A Publishing profile is an aggregate of channel used for the process of
 * ingestion. The active profile is used for ingestion actually.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/publishingProfile/
 */
@Path("/publishingprofile")
//#SWG#@Api(value = "/publishingprofile", description = """Service used to manage Publishing Profile settings. 
//#SWGNL#A Publishing profile is an aggregate of channel used for the process of ingestion. The active profile is used for ingestion actually.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b> 
//#SWGNL#REST service: https://clientId-view.thron.com/api/xcontents/resources/publishingProfile/""")
trait JPublishingProfile extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * Required. The id of client.
	 * @param status : MEPublishingProfileStatus
	 * Optional. Filter channel by state. Only one can be active.
	 * @return MPublishingProfileListResponse
	*/
	@GET
	@Path("/list")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/list", notes = """""", response = classOf[MPublishingProfileListResponse])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def list(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """Required. The id of client.""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional. Filter channel by state. Only one can be active.""")
	@QueryParam("status")
	status: MEPublishingProfileStatus,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MPublishingProfileListResponse*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("list") 
		try{	
			val resp = this.__list(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,status)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_list)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_list)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __list(tokenId: String, clientId: String, status: MEPublishingProfileStatus) :MPublishingProfileListResponse
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_list: String

}