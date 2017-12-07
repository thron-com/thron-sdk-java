package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.webtv.services.model.archive.MResponsePrepareArchive
import it.newvision.nvp.webtv.services.model.request.MArchiveprepareReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service is used to download content.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-extra.thron.
 * com/api/xcontents/resources/archive</li>
 * </ul>
 */
@Path("/archive")
//#SWG#@Api(value = "/archive", description = """This service is used to download content.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-extra.thron.com/api/xcontents/resources/archive</li>
//#SWGNL#</ul>""")
trait JArchive extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Returns a zip file with the content matching the prepare request.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * 
	 * <b>WARNING</b>: invoking this service via the Developer portal provides a result that your browser
	 * may not be able to evaluate. For this reason it is recommended to test this service using an
	 * external API testing software.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param downloadId : String
	 * The value recieved as response of prepare service
	 * @param saveAs : String
	 * Optional. The desired name of the file with no extension
	 * @param contactId : String
	 * Optional. Used for download analytics. The value comes from the tracking library.
	 * @return java.io.File
	*/
	@POST
	@Path("/download/{clientId}")
	@Produces(Array(MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/download", notes = """Returns a zip file with the content matching the prepare request.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>WARNING</b>: invoking this service via the Developer portal provides a result that your browser may not be able to evaluate. For this reason it is recommended to test this service using an external API testing software.""", response = classOf[java.io.File])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def download(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """The value recieved as response of prepare service""")
	@FormParam("downloadId")
	downloadId: String, 
			//#SWG#@ApiParam(value = """Optional. The desired name of the file with no extension""")
	@FormParam("saveAs")
	saveAs: String, 
			//#SWG#@ApiParam(value = """Optional. Used for download analytics. The value comes from the tracking library.""")
	@FormParam("contactId")
	contactId: String):Response /*returnType = java.io.File*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__download(tokenId,clientId,downloadId,saveAs,contactId)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_download)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_download)
	    }
	} 

	@GET
	@Path("/download/{clientId}")
	@Produces(Array(MediaType.WILDCARD,"application/x-javascript"))
	def download_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String, 
			@QueryParam("downloadId")downloadId_q: String, 
			@QueryParam("saveAs")saveAs_q: String, 
			@QueryParam("contactId")contactId_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = java.io.File*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("download",this._getCacheControl) 
		try{	
			val resp = this.__download(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,downloadId_q,saveAs_q,contactId_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_download)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_download)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __download(tokenId: String, clientId: String, downloadId: String, saveAs: String, contactId: String) :java.io.File
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_download: String

	/**
	 * Returns a zip file with the published resources of the playlist's elements.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * 
	 * <b>WARNING</b>: invoking this service via the Developer portal provides a result that your browser
	 * may not be able to evaluate. For this reason it is recommended to test this service using an
	 * external API testing software.
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId of the content.
	 * 

	 * @param saveAs : String
	 * Optional. The desired name of the file with no extension
	 * @param pkey : String
	 * Optional. The access key for the content. It's not required when session token is provided.
	 * @param elements : String
	 * Optional. List of xcontentIds as comma separated value. This allow the use to select the playlist
	 * items to download, if empty, all items are downloaded.
	 * @param locale : String
	 * Optional. Locale of content prettyId used as file name.
	 * @return java.io.File
	*/
	@POST
	@Path("/downloadPlaylist/{clientId}/{id}")
	@Produces(Array(MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/downloadPlaylist", notes = """Returns a zip file with the published resources of the playlist's elements.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>WARNING</b>: invoking this service via the Developer portal provides a result that your browser may not be able to evaluate. For this reason it is recommended to test this service using an external API testing software.""", response = classOf[java.io.File])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def downloadPlaylist(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """Domain name used to access THRON""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """The xcontentId of the content. 
	//#SWGNL#
	//#SWGNL#""")
	@PathParam("id")
	id: String, 
			//#SWG#@ApiParam(value = """Optional. The desired name of the file with no extension""")
	@FormParam("saveAs")
	saveAs: String, 
			//#SWG#@ApiParam(value = """Optional. The access key for the content. It's not required when session token is provided.""")
	@FormParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. List of xcontentIds as comma separated value. This allow the use to select the playlist items to download, if empty, all items are downloaded.""")
	@FormParam("elements")
	elements: String, 
			//#SWG#@ApiParam(value = """Optional. Locale of content prettyId used as file name.""")
	@FormParam("locale")
	locale: String):Response /*returnType = java.io.File*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__downloadPlaylist(tokenId,clientId,id,saveAs,pkey,elements,locale)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_downloadPlaylist)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_downloadPlaylist)
	    }
	} 

	@GET
	@Path("/downloadPlaylist/{clientId}/{id}")
	@Produces(Array(MediaType.WILDCARD,"application/x-javascript"))
	def downloadPlaylist_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String, 
			@PathParam("id")id_q: String, 
			@QueryParam("saveAs")saveAs_q: String, 
			@QueryParam("pkey")pkey_q: String, 
			@QueryParam("elements")elements_q: String, 
			@QueryParam("locale")locale_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = java.io.File*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("downloadPlaylist",this._getCacheControl) 
		try{	
			val resp = this.__downloadPlaylist(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,id_q,saveAs_q,pkey_q,elements_q,locale_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_downloadPlaylist)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_downloadPlaylist)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __downloadPlaylist(tokenId: String, clientId: String, id: String, saveAs: String, pkey: String, elements: String, locale: String) :java.io.File
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_downloadPlaylist: String

	/**
	 * Returns an id used by download service to zip and download a set of content.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MArchiveprepareReq
	 * @return MResponsePrepareArchive
	*/
	@POST
	@Path("/prepare/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/prepare", notes = """Returns an id used by download service to zip and download a set of content.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponsePrepareArchive])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def prepare(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MArchiveprepareReq):Response /*returnType = MResponsePrepareArchive*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__prepare(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_prepare)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_prepare)
	    }
	} 

	@GET
	@Path("/prepare/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def prepare_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponsePrepareArchive*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("prepare",this._getCacheControl) 
		try{
			val resp = this.__prepare(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MArchiveprepareReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_prepare)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_prepare)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __prepare(tokenId: String, clientId: String, param: MArchiveprepareReq) :MResponsePrepareArchive
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_prepare: String

	/**
	 * Returns a zip file with the resources of a player embed template.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * </ul>
	 * 
	 * <b>WARNING</b>: invoking this service via the Developer portal provides a result that your browser
	 * may not be able to evaluate. For this reason it is recommended to test this service using an
	 * external API testing software.
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param templateId : String
	 * @param templateVersion : Integer
	 * @return java.io.File
	*/
	@POST
	@Path("/downloadPlayerEmbedTemplate/{clientId}/{templateId}/{templateVersion}")
	@Produces(Array(MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/downloadPlayerEmbedTemplate", notes = """Returns a zip file with the resources of a player embed template.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>4ME_USE_CONTENTS role</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>WARNING</b>: invoking this service via the Developer portal provides a result that your browser may not be able to evaluate. For this reason it is recommended to test this service using an external API testing software.""", response = classOf[java.io.File])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def downloadPlayerEmbedTemplate(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """Domain name used to access THRON""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("templateId")
	templateId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("templateVersion")
	templateVersion: Integer):Response /*returnType = java.io.File*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__downloadPlayerEmbedTemplate(tokenId,clientId,templateId,templateVersion)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_downloadPlayerEmbedTemplate)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_downloadPlayerEmbedTemplate)
	    }
	} 

	@GET
	@Path("/downloadPlayerEmbedTemplate/{clientId}/{templateId}/{templateVersion}")
	@Produces(Array(MediaType.WILDCARD,"application/x-javascript"))
	def downloadPlayerEmbedTemplate_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String, 
			@PathParam("templateId")templateId_q: String, 
			@PathParam("templateVersion")templateVersion_q: Integer,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = java.io.File*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("downloadPlayerEmbedTemplate",this._getCacheControl) 
		try{	
			val resp = this.__downloadPlayerEmbedTemplate(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,templateId_q,templateVersion_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_downloadPlayerEmbedTemplate)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_downloadPlayerEmbedTemplate)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __downloadPlayerEmbedTemplate(tokenId: String, clientId: String, templateId: String, templateVersion: Integer) :java.io.File
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_downloadPlayerEmbedTemplate: String

}