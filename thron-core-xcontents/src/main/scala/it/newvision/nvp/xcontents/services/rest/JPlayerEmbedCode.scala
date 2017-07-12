package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedCodeDetail
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodeinsertReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbed
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCoderemoveReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedCodeList
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodelistReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodeupdateReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedCodeUpdateTemplate
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodeupdateTemplateReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodesyncReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to manage Player Embed Codes.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/playerembedcode</li>
 * </ul>
 */
@Path("/playerembedcode")
//#SWG#@Api(value = "/playerembedcode", description = """Service used to manage Player Embed Codes.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/playerembedcode</li>
//#SWGNL#</ul>""")
trait JPlayerEmbedCode extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Adds a custom Player Embed Code for a content or category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>SHARE ACL on the content or category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodeinsertReq
	 * @return MResponsePlayerEmbedCodeDetail
	*/
	@POST
	@Path("/insert/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Adds a custom Player Embed Code for a content or category.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#	<li>SHARE ACL on the content or category</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedCodeDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insert(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MPlayerEmbedCodeinsertReq):Response /*returnType = MResponsePlayerEmbedCodeDetail*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedCodeDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("insert",this._getCacheControl) 
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MPlayerEmbedCodeinsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, param: MPlayerEmbedCodeinsertReq) :MResponsePlayerEmbedCodeDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * Removes a custom Player Embed Code.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>SHARE ACL on the content or category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCoderemoveReq
	 * @return MResponsePlayerEmbed
	*/
	@POST
	@Path("/remove/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Removes a custom Player Embed Code.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#	<li>SHARE ACL on the content or category</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbed])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def remove(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MPlayerEmbedCoderemoveReq):Response /*returnType = MResponsePlayerEmbed*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbed*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("remove",this._getCacheControl) 
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MPlayerEmbedCoderemoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_remove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_remove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, clientId: String, param: MPlayerEmbedCoderemoveReq) :MResponsePlayerEmbed
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

	/**
	 * Returns a list of Player Embed Codes matching provided criteria, sorted by creation date.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>SHARE ACL on the content or category, if entity is defined</li>
	 * 	<li>4ME_USE_CONTENTS if entity is not defined or else 4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodelistReq
	 * @return MResponsePlayerEmbedCodeList
	*/
	@POST
	@Path("/list/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/list", notes = """Returns a list of Player Embed Codes matching provided criteria, sorted by creation date.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>SHARE ACL on the content or category, if entity is defined</li>
	//#SWGNL#	<li>4ME_USE_CONTENTS if entity is not defined or else 4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedCodeList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def list(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MPlayerEmbedCodelistReq):Response /*returnType = MResponsePlayerEmbedCodeList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__list(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_list)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_list)
	    }
	} 

	@GET
	@Path("/list/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def list_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedCodeList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("list",this._getCacheControl) 
		try{
			val resp = this.__list(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MPlayerEmbedCodelistReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_list)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_list)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __list(tokenId: String, clientId: String, param: MPlayerEmbedCodelistReq) :MResponsePlayerEmbedCodeList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_list: String

	/**
	 * Updates a custom Player Embed Code for a content or category. These information are used by the
	 * Player for content presentation.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>SHARE ACL on the content or category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodeupdateReq
	 * @return MResponsePlayerEmbedCodeDetail
	*/
	@POST
	@Path("/update/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """Updates a custom Player Embed Code for a content or category. These information are used by the Player for content presentation.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#	<li>SHARE ACL on the content or category</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedCodeDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def update(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MPlayerEmbedCodeupdateReq):Response /*returnType = MResponsePlayerEmbedCodeDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__update(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_update)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_update)
	    }
	} 

	@GET
	@Path("/update/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def update_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedCodeDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("update",this._getCacheControl) 
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MPlayerEmbedCodeupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, clientId: String, param: MPlayerEmbedCodeupdateReq) :MResponsePlayerEmbedCodeDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

	/**
	 * Updates a custom Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodeupdateTemplateReq
	 * @return MResponsePlayerEmbedCodeUpdateTemplate
	*/
	@POST
	@Path("/updateTemplate/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateTemplate", notes = """Updates a custom Player Embed Template.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedCodeUpdateTemplate])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateTemplate(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MPlayerEmbedCodeupdateTemplateReq):Response /*returnType = MResponsePlayerEmbedCodeUpdateTemplate*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateTemplate(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateTemplate)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateTemplate)
	    }
	} 

	@GET
	@Path("/updateTemplate/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateTemplate_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedCodeUpdateTemplate*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateTemplate",this._getCacheControl) 
		try{
			val resp = this.__updateTemplate(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MPlayerEmbedCodeupdateTemplateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateTemplate)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateTemplate)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateTemplate(tokenId: String, clientId: String, param: MPlayerEmbedCodeupdateTemplateReq) :MResponsePlayerEmbedCodeUpdateTemplate
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateTemplate: String

	/**
	 * Updates Player Embed Codes bumping template version to the latest value.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	 * 	<li>can be invoked only by template's managers or editors</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodesyncReq
	 * @return MResponsePlayerEmbed
	*/
	@POST
	@Path("/sync/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/sync", notes = """Updates Player Embed Codes bumping template version to the latest value.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	//#SWGNL#	<li>can be invoked only by template's managers or editors</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbed])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def sync(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MPlayerEmbedCodesyncReq):Response /*returnType = MResponsePlayerEmbed*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__sync(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_sync)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_sync)
	    }
	} 

	@GET
	@Path("/sync/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def sync_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbed*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("sync",this._getCacheControl) 
		try{
			val resp = this.__sync(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MPlayerEmbedCodesyncReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_sync)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_sync)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __sync(tokenId: String, clientId: String, param: MPlayerEmbedCodesyncReq) :MResponsePlayerEmbed
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_sync: String

}