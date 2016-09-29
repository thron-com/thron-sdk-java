package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.cuepoint.MResponseGetCuePoints
import it.newvision.nvp.xcontents.services.model.request.MCuePointgetCuePointsReq
import it.newvision.nvp.xcontents.services.model.cuepoint.MResponseAddCuePoints
import it.newvision.nvp.xcontents.services.model.request.MCuePointaddCuePointsReq
import it.newvision.nvp.xcontents.services.model.cuepoint.MResponseCuePoint
import it.newvision.nvp.xcontents.services.model.request.MCuePointupdateCuePointReq
import it.newvision.nvp.xcontents.services.model.request.MCuePointremoveCuePointsReq
import it.newvision.nvp.xcontents.services.model.request.MCuePointuploadSrtFileReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * <b>Using </b>
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.it/api/xcontents/resources/cuepoint
 *   </li>
 * </ul>
 */
@Path("/cuepoint")
//#SWG#@Api(value = "/cuepoint", description = """<b>Using </b>
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.4me.it/api/xcontents/resources/cuepoint    </li>
//#SWGNL#</ul>""")
trait JCuePoint extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Return all cue points for the given contents
	 * @param tokenId : String
	 * @param param : MCuePointgetCuePointsReq
	 * @return MResponseGetCuePoints
	*/
	@POST
	@Path("/getCuePoints")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getCuePoints", notes = """Return all cue points for the given contents""", response = classOf[MResponseGetCuePoints])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getCuePoints(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCuePointgetCuePointsReq):Response /*returnType = MResponseGetCuePoints*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getCuePoints(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getCuePoints)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getCuePoints)
	    }
	} 

	@GET
	@Path("/getCuePoints")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getCuePoints_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetCuePoints*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("getCuePoints",this._getCacheControl) 
		try{
			val resp = this.__getCuePoints(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCuePointgetCuePointsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getCuePoints)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getCuePoints)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getCuePoints(tokenId: String, param: MCuePointgetCuePointsReq) :MResponseGetCuePoints
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getCuePoints: String

	/**
	 * the service add the given list of cue points to the content
	 * @param tokenId : String
	 * @param param : MCuePointaddCuePointsReq
	 * @return MResponseAddCuePoints
	*/
	@POST
	@Path("/addCuePoints")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addCuePoints", notes = """the service add the given list of cue points to the content""", response = classOf[MResponseAddCuePoints])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addCuePoints(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCuePointaddCuePointsReq):Response /*returnType = MResponseAddCuePoints*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addCuePoints(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addCuePoints)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addCuePoints)
	    }
	} 

	@GET
	@Path("/addCuePoints")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addCuePoints_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAddCuePoints*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addCuePoints",this._getCacheControl) 
		try{
			val resp = this.__addCuePoints(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCuePointaddCuePointsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addCuePoints)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addCuePoints)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addCuePoints(tokenId: String, param: MCuePointaddCuePointsReq) :MResponseAddCuePoints
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addCuePoints: String

	/**
	 * Update a single Cue Point in the list.
	 * @param tokenId : String
	 * @param param : MCuePointupdateCuePointReq
	 * @return MResponseCuePoint
	*/
	@POST
	@Path("/updateCuePoint")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateCuePoint", notes = """Update a single Cue Point in the list.""", response = classOf[MResponseCuePoint])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateCuePoint(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCuePointupdateCuePointReq):Response /*returnType = MResponseCuePoint*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateCuePoint(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateCuePoint)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateCuePoint)
	    }
	} 

	@GET
	@Path("/updateCuePoint")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateCuePoint_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCuePoint*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateCuePoint",this._getCacheControl) 
		try{
			val resp = this.__updateCuePoint(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCuePointupdateCuePointReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateCuePoint)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateCuePoint)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateCuePoint(tokenId: String, param: MCuePointupdateCuePointReq) :MResponseCuePoint
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateCuePoint: String

	/**
	 * Remove All cue points from the content
	 * @param tokenId : String
	 * @param param : MCuePointremoveCuePointsReq
	 * @return MResponseCuePoint
	*/
	@POST
	@Path("/removeCuePoints")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeCuePoints", notes = """Remove All cue points from the content""", response = classOf[MResponseCuePoint])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeCuePoints(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCuePointremoveCuePointsReq):Response /*returnType = MResponseCuePoint*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeCuePoints(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeCuePoints)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeCuePoints)
	    }
	} 

	@GET
	@Path("/removeCuePoints")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeCuePoints_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCuePoint*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeCuePoints",this._getCacheControl) 
		try{
			val resp = this.__removeCuePoints(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCuePointremoveCuePointsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeCuePoints)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeCuePoints)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeCuePoints(tokenId: String, param: MCuePointremoveCuePointsReq) :MResponseCuePoint
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeCuePoints: String

	/**
	 * Upload a new SRT File to use as subtitles for a specific locale.
	 * The srt files is converted in the specific list of subtitles cue points and the existing subtitles
	 * will be replaced.
	 * @param tokenId : String
	 * @param param : MCuePointuploadSrtFileReq
	 * @return MResponseCuePoint
	*/
	@POST
	@Path("/uploadSrtFile")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/uploadSrtFile", notes = """Upload a new SRT File to use as subtitles for a specific locale.
	//#SWGNL#The srt files is converted in the specific list of subtitles cue points and the existing subtitles will be replaced.""", response = classOf[MResponseCuePoint])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def uploadSrtFile(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCuePointuploadSrtFileReq):Response /*returnType = MResponseCuePoint*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__uploadSrtFile(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_uploadSrtFile)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_uploadSrtFile)
	    }
	} 

	@GET
	@Path("/uploadSrtFile")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def uploadSrtFile_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCuePoint*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("uploadSrtFile",this._getCacheControl) 
		try{
			val resp = this.__uploadSrtFile(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCuePointuploadSrtFileReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_uploadSrtFile)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_uploadSrtFile)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __uploadSrtFile(tokenId: String, param: MCuePointuploadSrtFileReq) :MResponseCuePoint
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_uploadSrtFile: String

}