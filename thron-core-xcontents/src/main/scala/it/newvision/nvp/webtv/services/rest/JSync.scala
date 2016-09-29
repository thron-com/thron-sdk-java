package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.webtv.services.model.sync.MResponseContentLastUpdated
import it.newvision.nvp.webtv.services.model.request.MSynclastUpdatedContentsReq
import it.newvision.nvp.webtv.services.model.request.MSynccontentsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used for integration with external systems.
 * The purpose of the service is to provide a list of changes that have been
 * occurred in the platform in such a way to maintain synchronized an external
 * system. The Service avoid ACL restrictions.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/sync/
 * </li>
 * </ul>
 */
@Path("/sync")
//#SWG#@Api(value = "/sync", description = """Service used for integration with external systems.
//#SWGNL#The purpose of the service is to provide a list of changes that have been occurred in the platform in such a way to maintain synchronized an external system. The Service avoid ACL restrictions.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/sync/  </li>
//#SWGNL#</ul>""")
trait JSync extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Deprecated by JSync.contents!
	 * 
	 * The service returns the list of contents modified inside a specified date range (only for IMAGE,
	 * NDOC, OTHER, DOCUMENT, PLAYLIST, AUDIO, VIDEO content Type).
	 * The response provides all metadata information and the list of ids (contentsRemoved) of the
	 * contents removed after that date. The service return also the deliveryInformation with the content
	 * url and the list of thumbnails.
	 * The service does not return the list of comments linked to the content.
	 * @param tokenId : String
	 * @param param : MSynclastUpdatedContentsReq
	 * @return MResponseContentLastUpdated
	*/
	@POST
	@Path("/lastUpdatedContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/lastUpdatedContents", notes = """Deprecated by JSync.contents!
	//#SWGNL#
	//#SWGNL#The service returns the list of contents modified inside a specified date range (only for IMAGE, NDOC, OTHER, DOCUMENT, PLAYLIST, AUDIO, VIDEO content Type).
	//#SWGNL#The response provides all metadata information and the list of ids (contentsRemoved) of the contents removed after that date. The service return also the deliveryInformation with the content url and the list of thumbnails.
	//#SWGNL#The service does not return the list of comments linked to the content.""", response = classOf[MResponseContentLastUpdated])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def lastUpdatedContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MSynclastUpdatedContentsReq):Response /*returnType = MResponseContentLastUpdated*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__lastUpdatedContents(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_lastUpdatedContents)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_lastUpdatedContents)
	    }
	} 

	@GET
	@Path("/lastUpdatedContents")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Deprecated
	def lastUpdatedContents_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentLastUpdated*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("lastUpdatedContents",this._getCacheControl) 
		try{
			val resp = this.__lastUpdatedContents(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MSynclastUpdatedContentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_lastUpdatedContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_lastUpdatedContents)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __lastUpdatedContents(tokenId: String, param: MSynclastUpdatedContentsReq) :MResponseContentLastUpdated
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_lastUpdatedContents: String

	/**
	 * The service returns the list of contents modified inside a specified date range (only for IMAGE,
	 * NDOC, OTHER, DOCUMENT, PLAYLIST, AUDIO, VIDEO content Type).
	 * The response provides all metadata information and the list of ids (contentsRemoved) of the
	 * contents removed after that date. The service return also the deliveryInformation with the content
	 * url and the list of thumbnails.
	 * The service does not return the list of comments linked to the content.
	 * The service provide all contents without ACL restrictions.
	 * 
	 * Suggested parametes:
	 * <ul>
	 * 	<li>fromDate = "now" -1 minute</li>
	 * 	<li>toDate = fromDate - 10minutes</li>
	 * </ul>
	 * Service call frequency: the service should be called every 2 minutes.
	 * @param tokenId : String
	 * @param param : MSynccontentsReq
	 * @return MResponseContentLastUpdated
	*/
	@POST
	@Path("/contents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/contents", notes = """The service returns the list of contents modified inside a specified date range (only for IMAGE, NDOC, OTHER, DOCUMENT, PLAYLIST, AUDIO, VIDEO content Type).
	//#SWGNL#The response provides all metadata information and the list of ids (contentsRemoved) of the contents removed after that date. The service return also the deliveryInformation with the content url and the list of thumbnails.
	//#SWGNL#The service does not return the list of comments linked to the content.
	//#SWGNL#The service provide all contents without ACL restrictions. 
	//#SWGNL#
	//#SWGNL#Suggested parametes: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>fromDate = "now" -1 minute</li>
	//#SWGNL#	<li>toDate = fromDate - 10minutes</li>
	//#SWGNL#</ul>
	//#SWGNL#Service call frequency: the service should be called every 2 minutes.""", response = classOf[MResponseContentLastUpdated])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def contents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MSynccontentsReq):Response /*returnType = MResponseContentLastUpdated*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__contents(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_contents)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_contents)
	    }
	} 

	@GET
	@Path("/contents")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def contents_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentLastUpdated*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("contents",this._getCacheControl) 
		try{
			val resp = this.__contents(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MSynccontentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_contents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_contents)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __contents(tokenId: String, param: MSynccontentsReq) :MResponseContentLastUpdated
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_contents: String

}