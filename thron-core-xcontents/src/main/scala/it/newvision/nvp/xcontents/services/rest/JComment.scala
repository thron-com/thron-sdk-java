package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.comment.MResponseInsertComment
import it.newvision.nvp.xcontents.services.model.request.MCommentinsertCommentReq
import it.newvision.nvp.xcontents.services.model.comment.MResponseComment
import it.newvision.nvp.xcontents.services.model.comment.MResponseDetailComment
import it.newvision.nvp.xcontents.services.model.comment.MResponseGetComments
import it.newvision.nvp.xcontents.services.model.msg.MECommentOrderBy
import it.newvision.nvp.xcontents.model.MEModerationStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Services used by community user to comment published contents.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/comment/   </li>
 * </ul>
 */
@Path("/comment")
//#SWG#@Api(value = "/comment", description = """Services used by community user to comment published contents.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/comment/   </li>
//#SWGNL#</ul>""")
trait JComment extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Used to add a new comment in the platform. Comment inserted by community users.
	 * @param tokenId : String
	 * @param param : MCommentinsertCommentReq
	 * @return MResponseInsertComment
	*/
	@POST
	@Path("/insertComment")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insertComment", notes = """Used to add a new comment in the platform. Comment inserted by community users.""", response = classOf[MResponseInsertComment])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insertComment(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCommentinsertCommentReq):Response /*returnType = MResponseInsertComment*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__insertComment(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_insertComment)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_insertComment)
	    }
	} 

	@GET
	@Path("/insertComment")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def insertComment_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseInsertComment*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__insertComment(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCommentinsertCommentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_insertComment)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insertComment)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insertComment(tokenId: String, param: MCommentinsertCommentReq) :MResponseInsertComment
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insertComment: String

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param commentId : String
	 * @param userId : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseComment
	*/
	@POST
	@Path("/reportAbuse")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/reportAbuse", notes = """""", response = classOf[MResponseComment])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def reportAbuse(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("commentId")
	commentId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("userId")
	userId: String, 
			//#SWG#@ApiParam(value = """Optional. For Acl validation""")
	@FormParam("categoryIdForAcl")
	categoryIdForAcl: String):Response /*returnType = MResponseComment*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__reportAbuse(tokenId,clientId,commentId,userId,categoryIdForAcl)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_reportAbuse)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_reportAbuse)
	    }
	} 

	@GET
	@Path("/reportAbuse")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def reportAbuse_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("commentId")commentId_q: String, 
			@QueryParam("userId")userId_q: String, 
			@QueryParam("categoryIdForAcl")categoryIdForAcl_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseComment*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__reportAbuse(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,commentId_q,userId_q,categoryIdForAcl_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_reportAbuse)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_reportAbuse)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __reportAbuse(tokenId: String, clientId: String, commentId: String, userId: String, categoryIdForAcl: String) :MResponseComment
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_reportAbuse: String

	/**
	 * The service return the comment detail information.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param commentId : String
	 * Optional parameter
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseDetailComment
	*/
	@GET
	@Path("/detail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/detail", notes = """The service return the comment detail information.""", response = classOf[MResponseDetailComment])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def detail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional parameter""")
	@QueryParam("commentId")
	commentId: String, 
			//#SWG#@ApiParam(value = """Optional. For Acl validation""")
	@QueryParam("categoryIdForAcl")
	categoryIdForAcl: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDetailComment*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("detail") 
		try{	
			val resp = this.__detail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,commentId,categoryIdForAcl)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_detail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_detail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __detail(tokenId: String, clientId: String, commentId: String, categoryIdForAcl: String) :MResponseDetailComment
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_detail: String

	/**
	 * The service return the content description and the list of linked comments filtered using the
	 * search criteria. This is a GET service optimised for the webtv.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * Optional
	 * @param keyword : String
	 * Optional
	 * @param locale : String
	 * The content Metadata is returned in the specified locale.
	 * @param status : String
	 * Optional
	 * @param userId : String
	 * Optional
	 * @param moderationStatus : MEModerationStatus
	 * Optional
	 * @param orderBy : MECommentOrderBy
	 * Optional
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResults : Integer
	 * Optional. Default and maximum value is 50 items
	 * @return MResponseGetComments
	*/
	@GET
	@Path("/getComments")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getComments", notes = """The service return the content description and the list of linked comments filtered using the search criteria. This is a GET service optimised for the webtv.""", response = classOf[MResponseGetComments])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getComments(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("keyword")
	keyword: String, 
			//#SWG#@ApiParam(value = """The content Metadata is returned in the specified locale.""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("status")
	status: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("userId")
	userId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("moderationStatus")
	moderationStatus: MEModerationStatus, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("orderBy")
	orderBy: MECommentOrderBy, 
			//#SWG#@ApiParam(value = """Optional. For Acl validation""")
	@QueryParam("categoryIdForAcl")
	categoryIdForAcl: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default and maximum value is 50 items""")
	@QueryParam("numberOfResults")
	numberOfResults: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetComments*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getComments") 
		try{	
			val resp = this.__getComments(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,contentId,keyword,locale,status,userId,moderationStatus,orderBy,categoryIdForAcl,offset,numberOfResults)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getComments)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getComments)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getComments(tokenId: String, clientId: String, contentId: String, keyword: String, locale: String, status: String, userId: String, moderationStatus: MEModerationStatus, orderBy: MECommentOrderBy, categoryIdForAcl: String, offset: Integer, numberOfResults: Integer) :MResponseGetComments
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getComments: String

}