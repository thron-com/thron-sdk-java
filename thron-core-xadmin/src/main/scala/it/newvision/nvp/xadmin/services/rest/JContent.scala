package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.content.MResponseDetailSource
import it.newvision.nvp.xadmin.services.model.weebo.MResponseGetContentTypes
import it.newvision.nvp.xadmin.services.model.request.MContentgetContentTypesReq
import it.newvision.nvp.xadmin.services.model.content.MResponsePublishContents
import it.newvision.nvp.xadmin.services.model.request.MContentinsertReq
import it.newvision.nvp.xadmin.services.model.content.MResponseContentListVersions
import it.newvision.nvp.xadmin.services.model.request.MContentlistVersionsReq
import it.newvision.nvp.xadmin.services.model.content.MResponsePublish
import it.newvision.nvp.xadmin.services.model.request.MContentremoveReq
import it.newvision.nvp.xadmin.services.model.content.MResponseContentsTrash
import it.newvision.nvp.xadmin.services.model.request.MContenttrashReq
import it.newvision.nvp.xadmin.services.model.request.MContentuntrashReq
import it.newvision.nvp.xadmin.services.model.request.MContentupdateSourceReq
import it.newvision.nvp.xadmin.services.model.request.MContentupdateThumbnailReq
import it.newvision.nvp.xadmin.services.model.request.MContentupdateVersionNoteReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service define all functions used to publish different type of contents in
 * THRON platform. You can use this interface to publish Images, audio, video and
 * other kind of contents. Most of these functions are asynchronous.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xadmin/resources/content</li>
 * </ul>
 */
@Path("/content")
//#SWG#@Api(value = "/content", description = """This service define all functions used to publish different type of contents in THRON platform. You can use this interface to publish Images, audio, video and other kind of contents. Most of these functions are asynchronous.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xadmin/resources/content</li>
//#SWGNL#</ul>""")
trait JContent extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Return the detail of a content source.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>READ ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * @return MResponseDetailSource
	*/
	@GET
	@Path("/detailSource/{clientId}/{xcontentId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detailSource", notes = """Return the detail of a content source.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>READ ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDetailSource])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detailSource(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("xcontentId")
	xcontentId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDetailSource*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detailSource") 
		try{	
			val resp = this.__detailSource(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detailSource)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detailSource)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detailSource(tokenId: String, clientId: String, xcontentId: String) :MResponseDetailSource
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detailSource: String

	/**
	 * Returns the list of contentType available for a file based on its name.
	 * The service map the mime type of filename to the corresponding list of content types.
	 * For example the file with name "myvideo.mp4" can be published as VIDEO or OTHER content.
	 * @param tokenId : String
	 * @param param : MContentgetContentTypesReq
	 * @return MResponseGetContentTypes
	*/
	@POST
	@Path("/getContentTypes")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getContentTypes", notes = """Returns the list of contentType available for a file based on its name.
	//#SWGNL#The service map the mime type of filename to the corresponding list of content types.
	//#SWGNL#For example the file with name "myvideo.mp4" can be published as VIDEO or OTHER content.""", response = classOf[MResponseGetContentTypes])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getContentTypes(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MContentgetContentTypesReq):Response /*returnType = MResponseGetContentTypes*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getContentTypes(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getContentTypes)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getContentTypes)
	    }
	} 

	@GET
	@Path("/getContentTypes")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getContentTypes_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetContentTypes*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("getContentTypes",this._getCacheControl) 
		try{
			val resp = this.__getContentTypes(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MContentgetContentTypesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContentTypes)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentTypes)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentTypes(tokenId: String, param: MContentgetContentTypesReq) :MResponseGetContentTypes
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentTypes: String

	/**
	 * Creates a content.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>applications cannot create content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentinsertReq
	 * @return MResponsePublishContents
	*/
	@POST
	@Path("/insert/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Creates a content.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>applications cannot create content</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublishContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insert(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MContentinsertReq):Response /*returnType = MResponsePublishContents*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__insert(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_insert)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_insert)
	    }
	} 

	@GET
	@Path("/insert/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def insert_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublishContents*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("insert",this._getCacheControl) 
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MContentinsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, param: MContentinsertReq) :MResponsePublishContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * Returns the list of versions of a content
	 * <b>
	 * </b><b>Validation</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * @param param : MContentlistVersionsReq
	 * @return MResponseContentListVersions
	*/
	@POST
	@Path("/listVersions/{clientId}/{xcontentId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/listVersions", notes = """Returns the list of versions of a content
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentListVersions])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listVersions(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("xcontentId")
	xcontentId: String, 
			param: MContentlistVersionsReq):Response /*returnType = MResponseContentListVersions*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__listVersions(tokenId,clientId,xcontentId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_listVersions)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_listVersions)
	    }
	} 

	@GET
	@Path("/listVersions/{clientId}/{xcontentId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def listVersions_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("xcontentId")
	xcontentId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentListVersions*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("listVersions",this._getCacheControl) 
		try{
			val resp = this.__listVersions(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,xcontentId,PRestHelper.bindRequest[MContentlistVersionsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listVersions)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listVersions)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listVersions(tokenId: String, clientId: String, xcontentId: String, param: MContentlistVersionsReq) :MResponseContentListVersions
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listVersions: String

	/**
	 * Removes a content from the platform.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentremoveReq
	 * @return MResponsePublish
	*/
	@POST
	@Path("/remove/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Removes a content from the platform.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublish])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def remove(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MContentremoveReq):Response /*returnType = MResponsePublish*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__remove(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_remove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_remove)
	    }
	} 

	@GET
	@Path("/remove/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def remove_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublish*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("remove",this._getCacheControl) 
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MContentremoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_remove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_remove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, clientId: String, param: MContentremoveReq) :MResponsePublish
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

	/**
	 * Moves a content to the Trash category.
	 * Content remains available for delivery and can be recovered via the untrash service.
	 * 
	 * The service:
	 * <ul>
	 * 	<li>unlinks the content from every linked categories</li>
	 * 	<li>removes linked embed codes</li>
	 * 	<li>removes any ACL but owner's</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContenttrashReq
	 * @return MResponseContentsTrash
	*/
	@POST
	@Path("/trash/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/trash", notes = """Moves a content to the Trash category.
	//#SWGNL#Content remains available for delivery and can be recovered via the untrash service.
	//#SWGNL#
	//#SWGNL#The service:
	//#SWGNL#<ul>
	//#SWGNL#	<li>unlinks the content from every linked categories</li>
	//#SWGNL#	<li>removes linked embed codes</li>
	//#SWGNL#	<li>removes any ACL but owner's</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentsTrash])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def trash(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MContenttrashReq):Response /*returnType = MResponseContentsTrash*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__trash(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_trash)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_trash)
	    }
	} 

	@GET
	@Path("/trash/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def trash_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentsTrash*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("trash",this._getCacheControl) 
		try{
			val resp = this.__trash(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MContenttrashReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_trash)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_trash)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __trash(tokenId: String, clientId: String, param: MContenttrashReq) :MResponseContentsTrash
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_trash: String

	/**
	 * Restores a trashed content.
	 * Content is restored in owner's inbox.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentuntrashReq
	 * @return MResponseContentsTrash
	*/
	@POST
	@Path("/untrash/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/untrash", notes = """Restores a trashed content. 
	//#SWGNL#Content is restored in owner's inbox.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseContentsTrash])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def untrash(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MContentuntrashReq):Response /*returnType = MResponseContentsTrash*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__untrash(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_untrash)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_untrash)
	    }
	} 

	@GET
	@Path("/untrash/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def untrash_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseContentsTrash*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("untrash",this._getCacheControl) 
		try{
			val resp = this.__untrash(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MContentuntrashReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_untrash)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_untrash)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __untrash(tokenId: String, clientId: String, param: MContentuntrashReq) :MResponseContentsTrash
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_untrash: String

	/**
	 * The service:
	 * <ul>
	 * 	<li>replace the source file linked to a content</li>
	 * </ul>
	 * <ul>
	 * 	<li>republish the content in all channels with status PUBLISHED or ERROR.</li>
	 * </ul>
	 * <ul>
	 * 	<li>reset the user preferences of the content (the content becomes new for all users)</li>
	 * </ul>
	 * <ul>
	 * 	<li>return an error if the content has some channel in progress.</li>
	 * </ul>
	 * 
	 * <b>Validation</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentupdateSourceReq
	 * @return MResponsePublish
	*/
	@POST
	@Path("/updateSource/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateSource", notes = """The service:
	//#SWGNL#<ul>
	//#SWGNL#	<li>replace the source file linked to a content</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>republish the content in all channels with status PUBLISHED or ERROR.</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>reset the user preferences of the content (the content becomes new for all users)</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>return an error if the content has some channel in progress.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublish])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateSource(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MContentupdateSourceReq):Response /*returnType = MResponsePublish*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateSource(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateSource)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateSource)
	    }
	} 

	@GET
	@Path("/updateSource/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateSource_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublish*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateSource",this._getCacheControl) 
		try{
			val resp = this.__updateSource(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MContentupdateSourceReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateSource)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateSource)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateSource(tokenId: String, clientId: String, param: MContentupdateSourceReq) :MResponsePublish
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateSource: String

	/**
	 * Replaces the thumbnail of a content.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>image content are not eligible for thumbnail substitution.</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentupdateThumbnailReq
	 * @return MResponsePublish
	*/
	@POST
	@Path("/updateThumbnail/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateThumbnail", notes = """Replaces the thumbnail of a content.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>image content are not eligible for thumbnail substitution.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublish])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateThumbnail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MContentupdateThumbnailReq):Response /*returnType = MResponsePublish*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateThumbnail(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateThumbnail)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateThumbnail)
	    }
	} 

	@GET
	@Path("/updateThumbnail/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateThumbnail_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublish*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateThumbnail",this._getCacheControl) 
		try{
			val resp = this.__updateThumbnail(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MContentupdateThumbnailReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateThumbnail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateThumbnail)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateThumbnail(tokenId: String, clientId: String, param: MContentupdateThumbnailReq) :MResponsePublish
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateThumbnail: String

	/**
	 * Updates the version note for the active version of a content.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>can be invoked only by version creator</li>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>MODIFY ACL on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * @param param : MContentupdateVersionNoteReq
	 * @return MResponsePublish
	*/
	@POST
	@Path("/updateVersionNote/{clientId}/{xcontentId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateVersionNote", notes = """Updates the version note for the active version of a content.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>can be invoked only by version creator</li>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#	<li>MODIFY ACL on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePublish])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateVersionNote(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("xcontentId")
	xcontentId: String, 
			param: MContentupdateVersionNoteReq):Response /*returnType = MResponsePublish*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateVersionNote(tokenId,clientId,xcontentId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateVersionNote)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateVersionNote)
	    }
	} 

	@GET
	@Path("/updateVersionNote/{clientId}/{xcontentId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateVersionNote_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("xcontentId")
	xcontentId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePublish*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateVersionNote",this._getCacheControl) 
		try{
			val resp = this.__updateVersionNote(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,xcontentId,PRestHelper.bindRequest[MContentupdateVersionNoteReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateVersionNote)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateVersionNote)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateVersionNote(tokenId: String, clientId: String, xcontentId: String, param: MContentupdateVersionNoteReq) :MResponsePublish
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateVersionNote: String

}