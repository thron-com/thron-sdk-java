package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedTemplateDetail
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateaddRolesReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedTemplateVersionDetail
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplatecreateVersionReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateinsertReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedTemplateList
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplatelistReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedTemplateListVersion
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplatelistVersionsReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbed
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateremoveReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateremoveRolesReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateupdateReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to manage Player Embed Templates.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/playerembedtemplate</li>
 * </ul>
 */
@Path("/playerembedtemplate")
//#SWG#@Api(value = "/playerembedtemplate", description = """Service used to manage Player Embed Templates.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/playerembedtemplate</li>
//#SWGNL#</ul>""")
trait JPlayerEmbedTemplate extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Adds a role to a user or group for a Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * </ul>
	 * <ul>
	 * 	<li>can be invoked only by template managers</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplateaddRolesReq
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	@POST
	@Path("/addRoles/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addRoles", notes = """Adds a role to a user or group for a Player Embed Template.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>can be invoked only by template managers</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedTemplateDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addRoles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String, 
			param: MPlayerEmbedTemplateaddRolesReq):Response /*returnType = MResponsePlayerEmbedTemplateDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addRoles(tokenId,clientId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addRoles)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addRoles)
	    }
	} 

	@GET
	@Path("/addRoles/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addRoles_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedTemplateDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addRoles",this._getCacheControl) 
		try{
			val resp = this.__addRoles(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id,PRestHelper.bindRequest[MPlayerEmbedTemplateaddRolesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addRoles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addRoles)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addRoles(tokenId: String, clientId: String, id: String, param: MPlayerEmbedTemplateaddRolesReq) :MResponsePlayerEmbedTemplateDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addRoles: String

	/**
	 * Creates a version of a Player Embed Template.
	 * The service increments the last version of the template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * 	<li>can be invoked only by template managers or editors</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplatecreateVersionReq
	 * @return MResponsePlayerEmbedTemplateVersionDetail
	*/
	@POST
	@Path("/createVersion/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/createVersion", notes = """Creates a version of a Player Embed Template.
	//#SWGNL#The service increments the last version of the template.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	//#SWGNL#	<li>can be invoked only by template managers or editors</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedTemplateVersionDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def createVersion(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String, 
			param: MPlayerEmbedTemplatecreateVersionReq):Response /*returnType = MResponsePlayerEmbedTemplateVersionDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__createVersion(tokenId,clientId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_createVersion)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_createVersion)
	    }
	} 

	@GET
	@Path("/createVersion/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def createVersion_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedTemplateVersionDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("createVersion",this._getCacheControl) 
		try{
			val resp = this.__createVersion(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id,PRestHelper.bindRequest[MPlayerEmbedTemplatecreateVersionReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_createVersion)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_createVersion)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __createVersion(tokenId: String, clientId: String, id: String, param: MPlayerEmbedTemplatecreateVersionReq) :MResponsePlayerEmbedTemplateVersionDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_createVersion: String

	/**
	 * Returns the detail of a Player Embed Template.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_SHARE_CONTENTS_BY_EMAIL or 4ME_SHARE_CONTENTS_BY_EMBED or 4ME_SHARE_CONTENTS_BY_SOCIAL or
	 * 4ME_SHARE_CONTENTS_BY_LINK or 4ME_SHARE_CONTENTS_TO_USERS or 4ME_MANAGE_PLAYER_EMBED_VERSIONS or
	 * 4ME_MANAGE_PLAYER_EMBED_TEMPLATES role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param version : Integer
	 * Optional. If empty the service return the last version
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	@GET
	@Path("/detail/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """Returns the detail of a Player Embed Template.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_SHARE_CONTENTS_BY_EMAIL or 4ME_SHARE_CONTENTS_BY_EMBED or 4ME_SHARE_CONTENTS_BY_SOCIAL or 4ME_SHARE_CONTENTS_BY_LINK or 4ME_SHARE_CONTENTS_TO_USERS or 4ME_MANAGE_PLAYER_EMBED_VERSIONS or 4ME_MANAGE_PLAYER_EMBED_TEMPLATES role</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedTemplateDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String, 
			//#SWG#@ApiParam(value = """Optional. If empty the service return the last version""")
	@QueryParam("version")
	version: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponsePlayerEmbedTemplateDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detail") 
		try{	
			val resp = this.__detail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,id,version)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, clientId: String, id: String, version: Integer) :MResponsePlayerEmbedTemplateDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * Creates a custom Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedTemplateinsertReq
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	@POST
	@Path("/insert/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insert", notes = """Creates a custom Player Embed Template.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedTemplateDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insert(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MPlayerEmbedTemplateinsertReq):Response /*returnType = MResponsePlayerEmbedTemplateDetail*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedTemplateDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("insert",this._getCacheControl) 
		try{
			val resp = this.__insert(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MPlayerEmbedTemplateinsertReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insert)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insert)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insert(tokenId: String, clientId: String, param: MPlayerEmbedTemplateinsertReq) :MResponsePlayerEmbedTemplateDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insert: String

	/**
	 * Returns a list of Player Embed Templates matching provided criteria.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_PLAYER_EMBED_VERSIONS or
	 * 4ME_SHARE_CONTENTS_BY_EMAIL or 4ME_SHARE_CONTENTS_BY_EMBED or 4ME_SHARE_CONTENTS_BY_SOCIAL or
	 * 4ME_SHARE_CONTENTS_BY_LINK or 4ME_SHARE_CONTENTS_TO_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedTemplatelistReq
	 * @return MResponsePlayerEmbedTemplateList
	*/
	@POST
	@Path("/list/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/list", notes = """Returns a list of Player Embed Templates matching provided criteria.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_PLAYER_EMBED_VERSIONS or 4ME_SHARE_CONTENTS_BY_EMAIL or 4ME_SHARE_CONTENTS_BY_EMBED or 4ME_SHARE_CONTENTS_BY_SOCIAL or 4ME_SHARE_CONTENTS_BY_LINK or 4ME_SHARE_CONTENTS_TO_USERS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedTemplateList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def list(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MPlayerEmbedTemplatelistReq):Response /*returnType = MResponsePlayerEmbedTemplateList*/ = {
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
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedTemplateList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("list",this._getCacheControl) 
		try{
			val resp = this.__list(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MPlayerEmbedTemplatelistReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_list)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_list)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __list(tokenId: String, clientId: String, param: MPlayerEmbedTemplatelistReq) :MResponsePlayerEmbedTemplateList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_list: String

	/**
	 * Returns the list of versions for a Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY  or
	 * 4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplatelistVersionsReq
	 * @return MResponsePlayerEmbedTemplateListVersion
	*/
	@POST
	@Path("/listVersions/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/listVersions", notes = """Returns the list of versions for a Player Embed Template.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY  or 4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedTemplateListVersion])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listVersions(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String, 
			param: MPlayerEmbedTemplatelistVersionsReq):Response /*returnType = MResponsePlayerEmbedTemplateListVersion*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__listVersions(tokenId,clientId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_listVersions)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_listVersions)
	    }
	} 

	@GET
	@Path("/listVersions/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def listVersions_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedTemplateListVersion*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("listVersions",this._getCacheControl) 
		try{
			val resp = this.__listVersions(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id,PRestHelper.bindRequest[MPlayerEmbedTemplatelistVersionsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listVersions)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listVersions)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listVersions(tokenId: String, clientId: String, id: String, param: MPlayerEmbedTemplatelistVersionsReq) :MResponsePlayerEmbedTemplateListVersion
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listVersions: String

	/**
	 * Removes a custom Player Embed Template .
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * </ul>
	 * <ul>
	 * 	<li>Can be invoked only by template managers</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param templateId : String
	 * The Player Embed Template Id
	 * @param param : MPlayerEmbedTemplateremoveReq
	 * @return MResponsePlayerEmbed
	*/
	@POST
	@Path("/remove/{clientId}/{templateId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Removes a custom Player Embed Template .
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>Can be invoked only by template managers</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbed])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def remove(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """The Player Embed Template Id""")
	@PathParam("templateId")
	templateId: String, 
			param: MPlayerEmbedTemplateremoveReq):Response /*returnType = MResponsePlayerEmbed*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__remove(tokenId,clientId,templateId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_remove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_remove)
	    }
	} 

	@GET
	@Path("/remove/{clientId}/{templateId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def remove_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """The Player Embed Template Id""")
	@PathParam("templateId")
	templateId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbed*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("remove",this._getCacheControl) 
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,templateId,PRestHelper.bindRequest[MPlayerEmbedTemplateremoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_remove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_remove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, clientId: String, templateId: String, param: MPlayerEmbedTemplateremoveReq) :MResponsePlayerEmbed
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

	/**
	 * Removes a role from a user or group for a Player Embed  Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * </ul>
	 * <ul>
	 * 	<li>can be invoked only by template managers</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplateremoveRolesReq
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	@POST
	@Path("/removeRoles/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeRoles", notes = """Removes a role from a user or group for a Player Embed  Template.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>can be invoked only by template managers</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedTemplateDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeRoles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String, 
			param: MPlayerEmbedTemplateremoveRolesReq):Response /*returnType = MResponsePlayerEmbedTemplateDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeRoles(tokenId,clientId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeRoles)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeRoles)
	    }
	} 

	@GET
	@Path("/removeRoles/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeRoles_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedTemplateDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeRoles",this._getCacheControl) 
		try{
			val resp = this.__removeRoles(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id,PRestHelper.bindRequest[MPlayerEmbedTemplateremoveRolesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeRoles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeRoles)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeRoles(tokenId: String, clientId: String, id: String, param: MPlayerEmbedTemplateremoveRolesReq) :MResponsePlayerEmbedTemplateDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeRoles: String

	/**
	 * Updates a Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * 	<li>can be invoked only by template managers or editors</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplateupdateReq
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	@POST
	@Path("/update/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """Updates a Player Embed Template.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	//#SWGNL#	<li>can be invoked only by template managers or editors</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePlayerEmbedTemplateDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def update(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String, 
			param: MPlayerEmbedTemplateupdateReq):Response /*returnType = MResponsePlayerEmbedTemplateDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__update(tokenId,clientId,id,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_update)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_update)
	    }
	} 

	@GET
	@Path("/update/{clientId}/{id}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def update_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("id")
	id: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePlayerEmbedTemplateDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("update",this._getCacheControl) 
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,id,PRestHelper.bindRequest[MPlayerEmbedTemplateupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, clientId: String, id: String, param: MPlayerEmbedTemplateupdateReq) :MResponsePlayerEmbedTemplateDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

}