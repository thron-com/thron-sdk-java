package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseDetailMediaContent
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseFindContents
import it.newvision.nvp.xadmin.services.model.request.MMediaContentfindContentsByPropertiesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * DEPRECATED by xcontents JContent
 */
@Path("/mediacontent")
//#SWG#@Api(value = "/mediacontent", description = """DEPRECATED by xcontents JContent""")
trait JMediaContent extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Deprecated by <b>[xcontents] JContent.detail</b>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param mediaContentId : String
	 * Optional. Is required one of mediaContenId,xcontentId or xpublisherId
	 * @param xcontentId : String
	 * Optional. Is required one of mediaContenId,xcontentId or xpublisherId
	 * @param xpublisherId : String
	 * Optional. Is required one of mediaContenId,xcontentId or xpublisherId
	 * @return MResponseDetailMediaContent
	*/
	@GET
	@Path("/detailMediaContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detailMediaContent", notes = """Deprecated by <b>[xcontents] JContent.detail</b>""", response = classOf[MResponseDetailMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detailMediaContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional. Is required one of mediaContenId,xcontentId or xpublisherId""")
	@QueryParam("mediaContentId")
	mediaContentId: String, 
			//#SWG#@ApiParam(value = """Optional. Is required one of mediaContenId,xcontentId or xpublisherId""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional. Is required one of mediaContenId,xcontentId or xpublisherId""")
	@QueryParam("xpublisherId")
	xpublisherId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDetailMediaContent*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detailMediaContent") 
		try{	
			val resp = this.__detailMediaContent(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,mediaContentId,xcontentId,xpublisherId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detailMediaContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detailMediaContent)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detailMediaContent(tokenId: String, clientId: String, mediaContentId: String, xcontentId: String, xpublisherId: String) :MResponseDetailMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detailMediaContent: String

	/**
	 * Deprecated by <b>[xcontents] JContent.findByProperties</b>
	 * @param tokenId : String
	 * @param param : MMediaContentfindContentsByPropertiesReq
	 * @return MResponseFindContents
	*/
	@POST
	@Path("/findContentsByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findContentsByProperties", notes = """Deprecated by <b>[xcontents] JContent.findByProperties</b>""", response = classOf[MResponseFindContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findContentsByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MMediaContentfindContentsByPropertiesReq):Response /*returnType = MResponseFindContents*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findContentsByProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findContentsByProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findContentsByProperties)
	    }
	} 

	@GET
	@Path("/findContentsByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def findContentsByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFindContents*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("findContentsByProperties",this._getCacheControl) 
		try{
			val resp = this.__findContentsByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MMediaContentfindContentsByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findContentsByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findContentsByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findContentsByProperties(tokenId: String, param: MMediaContentfindContentsByPropertiesReq) :MResponseFindContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findContentsByProperties: String

}