package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.playlist.MResponsePlayListDetail
import it.newvision.nvp.xcontents.services.model.request.MPlaylistdetailReq
import it.newvision.nvp.xcontents.services.model.playlist.MResponsePlayList
import it.newvision.nvp.xcontents.services.model.request.MPlaylistupdateReq
import it.newvision.nvp.xcontents.services.model.request.MPlaylistaddContentsInQueueReq
import it.newvision.nvp.xcontents.services.model.request.MPlaylistaddContentsReq
import it.newvision.nvp.xcontents.services.model.request.MPlaylistmoveContentInListReq
import it.newvision.nvp.xcontents.services.model.request.MPlaylistremoveContentFromListReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Playlist service provide a set of functions to handle the list of contents
 * used inside a Playlist or slideshow. These service are optimised to handle a
 * high number of elements linked to a playlist. The linked contents list return
 * only the xcontentId information, and to get the other content metadata like
 * name and description is necessary to query the Content.findbyproperties
 * function.
 * For performance reason the linkedcontents list is not verified so, if the
 * client create a playlist content with a list invalid xcontentsId, the platform
 * do not verify and the detail function return exactly the same list.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/playlist</li>
 * </ul>
 */
@Path("/playlist")
//#SWG#@Api(value = "/playlist", description = """The Playlist service provide a set of functions to handle the list of contents used inside a Playlist or slideshow. These service are optimised to handle a high number of elements linked to a playlist. The linked contents list return only the xcontentId information, and to get the other content metadata like name and description is necessary to query the Content.findbyproperties function.
//#SWGNL#For performance reason the linkedcontents list is not verified so, if the client create a playlist content with a list invalid xcontentsId, the platform do not verify and the detail function return exactly the same list.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/playlist</li>
//#SWGNL#</ul>""")
trait JPlaylist extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * The service return the playlist detail, with all linked items.
	 * @param tokenId : String
	 * @param param : MPlaylistdetailReq
	 * @return MResponsePlayListDetail
	*/
	@POST
	@Path("/detail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/detail", notes = """The service return the playlist detail, with all linked items.""", response = classOf[MResponsePlayListDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPlaylistdetailReq):Response /*returnType = MResponsePlayListDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__detail(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_detail)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_detail)
	    }
	} 

	@GET
	@Path("/detail")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def detail_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayListDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("detail",this._getCacheControl) 
		try{
			val resp = this.__detail(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPlaylistdetailReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, param: MPlaylistdetailReq) :MResponsePlayListDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * Replace the playlist's elements with the given list of contents.
	 * @param tokenId : String
	 * @param param : MPlaylistupdateReq
	 * @return MResponsePlayList
	*/
	@POST
	@Path("/update")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """Replace the playlist's elements with the given list of contents.""", response = classOf[MResponsePlayList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def update(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPlaylistupdateReq):Response /*returnType = MResponsePlayList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__update(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_update)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_update)
	    }
	} 

	@GET
	@Path("/update")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def update_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("update",this._getCacheControl) 
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPlaylistupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, param: MPlaylistupdateReq) :MResponsePlayList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

	/**
	 * Add new playlist items in the queue.
	 * @param tokenId : String
	 * @param param : MPlaylistaddContentsInQueueReq
	 * @return MResponsePlayList
	*/
	@POST
	@Path("/addContentsInQueue")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addContentsInQueue", notes = """Add new playlist items in the queue.""", response = classOf[MResponsePlayList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addContentsInQueue(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPlaylistaddContentsInQueueReq):Response /*returnType = MResponsePlayList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addContentsInQueue(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addContentsInQueue)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addContentsInQueue)
	    }
	} 

	@GET
	@Path("/addContentsInQueue")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addContentsInQueue_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addContentsInQueue",this._getCacheControl) 
		try{
			val resp = this.__addContentsInQueue(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPlaylistaddContentsInQueueReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addContentsInQueue)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addContentsInQueue)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addContentsInQueue(tokenId: String, param: MPlaylistaddContentsInQueueReq) :MResponsePlayList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addContentsInQueue: String

	/**
	 * Add new playlist items in the specific position
	 * @param tokenId : String
	 * @param param : MPlaylistaddContentsReq
	 * @return MResponsePlayList
	*/
	@POST
	@Path("/addContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addContents", notes = """Add new playlist items in the specific position""", response = classOf[MResponsePlayList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPlaylistaddContentsReq):Response /*returnType = MResponsePlayList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addContents(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addContents)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addContents)
	    }
	} 

	@GET
	@Path("/addContents")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addContents_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addContents",this._getCacheControl) 
		try{
			val resp = this.__addContents(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPlaylistaddContentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addContents)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addContents(tokenId: String, param: MPlaylistaddContentsReq) :MResponsePlayList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addContents: String

	/**
	 * Move a playlist element from position "oldContentPosition" to "newContentPosition"
	 * @param tokenId : String
	 * @param param : MPlaylistmoveContentInListReq
	 * @return MResponsePlayList
	*/
	@POST
	@Path("/moveContentInList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/moveContentInList", notes = """Move a playlist element from position "oldContentPosition" to "newContentPosition"""", response = classOf[MResponsePlayList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def moveContentInList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPlaylistmoveContentInListReq):Response /*returnType = MResponsePlayList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__moveContentInList(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_moveContentInList)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_moveContentInList)
	    }
	} 

	@GET
	@Path("/moveContentInList")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def moveContentInList_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("moveContentInList",this._getCacheControl) 
		try{
			val resp = this.__moveContentInList(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPlaylistmoveContentInListReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_moveContentInList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_moveContentInList)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __moveContentInList(tokenId: String, param: MPlaylistmoveContentInListReq) :MResponsePlayList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_moveContentInList: String

	/**
	 * Remove from the playlist the element in "contentPosition"
	 * @param tokenId : String
	 * @param param : MPlaylistremoveContentFromListReq
	 * @return MResponsePlayList
	*/
	@POST
	@Path("/removeContentFromList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeContentFromList", notes = """Remove from the playlist the element in "contentPosition"""", response = classOf[MResponsePlayList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeContentFromList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MPlaylistremoveContentFromListReq):Response /*returnType = MResponsePlayList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeContentFromList(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeContentFromList)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeContentFromList)
	    }
	} 

	@GET
	@Path("/removeContentFromList")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeContentFromList_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeContentFromList",this._getCacheControl) 
		try{
			val resp = this.__removeContentFromList(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MPlaylistremoveContentFromListReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeContentFromList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeContentFromList)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeContentFromList(tokenId: String, param: MPlaylistremoveContentFromListReq) :MResponsePlayList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeContentFromList: String

}