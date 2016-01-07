package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.eventmanager.MResponseEventManagerDetail
import it.newvision.nvp.xadmin.services.model.request.MEventManagerAdminstartEventReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service define all functions to manage a live event:
 * <ul>
 * 	<li>start and stop a live event</li>
 * 	<li>manage the preview stream on ON AIR Live events</li>
 * 	<li>manage the stream to show in live event</li>
 * 	<li>add and remove new input streams</li>
 * </ul>
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>WADL REST service: http://clientId-view.4me.
 * it/api/xadmin/resources/application.wadl</li>
 * </ul>
 */
@Path("/eventmanageradmin")
//#SWG#@Api(value = "/eventmanageradmin", description = """This service define all functions to manage a live event:
//#SWGNL#<ul>
//#SWGNL#	<li>start and stop a live event</li>
//#SWGNL#	<li>manage the preview stream on ON AIR Live events</li>
//#SWGNL#	<li>manage the stream to show in live event</li>
//#SWGNL#	<li>add and remove new input streams</li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>WADL REST service: http://clientId-view.4me.it/api/xadmin/resources/application.wadl</li>
//#SWGNL#</ul>""")
trait JEventManagerAdmin extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * the service starts the necessary resources for a new live event.
	 * The operation is asynchronous and the live event will be active when the media content is in status
	 * PUBLISHED.
	 * A Live Event is like the other 4ME Contents, and when the media content is in state PUBLISHED means
	 * that the live event is ready/on air, otherwise the live event is not active.
	 * 
	 * Live Events, and AWS Account:
	 * The new live event instance is created in one of the configured AWS Account following this priority:
	 * 
	 * <ul>
	 * 	<li>dedicated account: specific aws account for the client</li>
	 * 	<li>shared aws account with the EC2 service enabled</li>
	 * </ul>
	 * 
	 * The AWS accounts are configured with the service xsso.JPlatform in the view-platform console.
	 * @param tokenId : String
	 * @param param : MEventManagerAdminstartEventReq
	 * @return MResponseEventManagerDetail
	*/
	@POST
	@Path("/startEvent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/startEvent", notes = """the service starts the necessary resources for a new live event.
	//#SWGNL#The operation is asynchronous and the live event will be active when the media content is in status PUBLISHED.
	//#SWGNL#A Live Event is like the other 4ME Contents, and when the media content is in state PUBLISHED means that the live event is ready/on air, otherwise the live event is not active. 
	//#SWGNL#
	//#SWGNL#Live Events, and AWS Account:
	//#SWGNL#The new live event instance is created in one of the configured AWS Account following this priority:
	//#SWGNL#<ul>
	//#SWGNL#	<li>dedicated account: specific aws account for the client</li>
	//#SWGNL#	<li>shared aws account with the EC2 service enabled</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#The AWS accounts are configured with the service xsso.JPlatform in the view-platform console.""", response = classOf[MResponseEventManagerDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def startEvent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MEventManagerAdminstartEventReq):Response /*returnType = MResponseEventManagerDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__startEvent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_startEvent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_startEvent)
	    }
	} 

	@GET
	@Path("/startEvent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def startEvent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseEventManagerDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__startEvent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MEventManagerAdminstartEventReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_startEvent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_startEvent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __startEvent(tokenId: String, param: MEventManagerAdminstartEventReq) :MResponseEventManagerDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_startEvent: String

}