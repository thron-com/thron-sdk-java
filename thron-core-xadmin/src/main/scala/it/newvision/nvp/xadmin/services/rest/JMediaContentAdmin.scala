package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseCreateMediaContent
import it.newvision.nvp.xadmin.services.model.request.MMediaContentAdmincreateMediaContentReq
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseFindMediaContent
import it.newvision.nvp.xadmin.services.model.request.MMediaContentAdminfindMediaContentByPropertiesReq
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseUpdateMediaContent
import it.newvision.nvp.xadmin.services.model.request.MMediaContentAdminupdateMediaContentReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * DEPRECATED
 */
@Path("/mediacontentadmin")
//#SWG#@Api(value = "/mediacontentadmin", description = """DEPRECATED""")
trait JMediaContentAdmin extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * @param tokenId : String
	 * @param param : MMediaContentAdmincreateMediaContentReq
	 * @return MResponseCreateMediaContent
	*/
	@POST
	@Path("/createMediaContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/createMediaContent", notes = """""", response = classOf[MResponseCreateMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def createMediaContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MMediaContentAdmincreateMediaContentReq):Response /*returnType = MResponseCreateMediaContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__createMediaContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_createMediaContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_createMediaContent)
	    }
	} 

	@GET
	@Path("/createMediaContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def createMediaContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCreateMediaContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("createMediaContent",this._getCacheControl) 
		try{
			val resp = this.__createMediaContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MMediaContentAdmincreateMediaContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_createMediaContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_createMediaContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __createMediaContent(tokenId: String, param: MMediaContentAdmincreateMediaContentReq) :MResponseCreateMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_createMediaContent: String

	/**
	 * return the list of media contents: the list of published contents, or the contents are being
	 * ingested or packaged in the system.
	 * Attention!! the service is not filtered by ACL
	 * @param tokenId : String
	 * @param param : MMediaContentAdminfindMediaContentByPropertiesReq
	 * @return MResponseFindMediaContent
	*/
	@POST
	@Path("/findMediaContentByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findMediaContentByProperties", notes = """return the list of media contents: the list of published contents, or the contents are being ingested or packaged in the system.
	//#SWGNL#Attention!! the service is not filtered by ACL""", response = classOf[MResponseFindMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findMediaContentByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MMediaContentAdminfindMediaContentByPropertiesReq):Response /*returnType = MResponseFindMediaContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findMediaContentByProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findMediaContentByProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findMediaContentByProperties)
	    }
	} 

	@GET
	@Path("/findMediaContentByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def findMediaContentByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFindMediaContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("findMediaContentByProperties",this._getCacheControl) 
		try{
			val resp = this.__findMediaContentByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MMediaContentAdminfindMediaContentByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findMediaContentByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findMediaContentByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findMediaContentByProperties(tokenId: String, param: MMediaContentAdminfindMediaContentByPropertiesReq) :MResponseFindMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findMediaContentByProperties: String

	/**
	 * service used to update a mediaContent object. The service performa a punctual update only on
	 * MMediaContent.creationDate, MMediaContent.sourceFiles, MMediaContent.author
	 * @param tokenId : String
	 * @param param : MMediaContentAdminupdateMediaContentReq
	 * @return MResponseUpdateMediaContent
	*/
	@POST
	@Path("/updateMediaContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateMediaContent", notes = """service used to update a mediaContent object. The service performa a punctual update only on MMediaContent.creationDate, MMediaContent.sourceFiles, MMediaContent.author""", response = classOf[MResponseUpdateMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateMediaContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MMediaContentAdminupdateMediaContentReq):Response /*returnType = MResponseUpdateMediaContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateMediaContent(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateMediaContent)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateMediaContent)
	    }
	} 

	@GET
	@Path("/updateMediaContent")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateMediaContent_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdateMediaContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateMediaContent",this._getCacheControl) 
		try{
			val resp = this.__updateMediaContent(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MMediaContentAdminupdateMediaContentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateMediaContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateMediaContent)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateMediaContent(tokenId: String, param: MMediaContentAdminupdateMediaContentReq) :MResponseUpdateMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateMediaContent: String

}