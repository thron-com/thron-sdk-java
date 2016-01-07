package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xpackager.services.model.packager.MResponsePackager
import it.newvision.nvp.xpackager.services.model.request.MDownloaderQueueremoveTaskReq
import it.newvision.nvp.xpackager.services.model.queue.MResponseDownloaderQueue
import it.newvision.nvp.xpackager.services.model.request.MDownloaderQueueshowQueueReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The DownloaderQueue service is used to show the list of download task in queue
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST: http://clientId-view.4me.it/api/adxpackager/resources/application.
 * wadl </li>
 * </ul>
 */
@Path("/downloaderqueue")
//#SWG#@Api(value = "/downloaderqueue", description = """The DownloaderQueue service is used to show the list of download task in queue
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST: http://clientId-view.4me.it/api/adxpackager/resources/application.wadl </li>
//#SWGNL#</ul>""")
trait JDownloaderQueue extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Remove a task from the queue
	 * @param tokenId : String
	 * @param param : MDownloaderQueueremoveTaskReq
	 * @return MResponsePackager
	*/
	@POST
	@Path("/removeTask")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeTask", notes = """Remove a task from the queue""", response = classOf[MResponsePackager])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeTask(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDownloaderQueueremoveTaskReq):Response /*returnType = MResponsePackager*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeTask(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeTask)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeTask)
	    }
	} 

	@GET
	@Path("/removeTask")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeTask_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePackager*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeTask(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDownloaderQueueremoveTaskReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeTask)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeTask)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeTask(tokenId: String, param: MDownloaderQueueremoveTaskReq) :MResponsePackager
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeTask: String

	/**
	 * Show all download tasks in queue
	 * @param tokenId : String
	 * @param param : MDownloaderQueueshowQueueReq
	 * @return MResponseDownloaderQueue
	*/
	@POST
	@Path("/showQueue")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/showQueue", notes = """Show all download tasks in queue""", response = classOf[MResponseDownloaderQueue])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def showQueue(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDownloaderQueueshowQueueReq):Response /*returnType = MResponseDownloaderQueue*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__showQueue(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_showQueue)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_showQueue)
	    }
	} 

	@GET
	@Path("/showQueue")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def showQueue_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDownloaderQueue*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__showQueue(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDownloaderQueueshowQueueReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_showQueue)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_showQueue)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __showQueue(tokenId: String, param: MDownloaderQueueshowQueueReq) :MResponseDownloaderQueue
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_showQueue: String

}