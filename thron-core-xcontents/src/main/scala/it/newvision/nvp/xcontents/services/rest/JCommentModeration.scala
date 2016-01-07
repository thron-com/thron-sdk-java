package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.comment.MResponseComment
import it.newvision.nvp.xcontents.services.model.request.MCommentModerationupdateCommentReq
import it.newvision.nvp.xcontents.services.model.request.MCommentModerationmoderateCommentsReq
import it.newvision.nvp.xcontents.services.model.comment.MResponseFindComments
import it.newvision.nvp.xcontents.services.model.request.MCommentModerationfindCommentsForModerationReq
import it.newvision.nvp.xcontents.services.model.request.MCommentModerationchangeModeratorIdReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used to manage the comments and to handle the moderation process. The
 * moderation process requires that moderators self-assignee groups of pending
 * comments awaiting to avoid different moderators "working" on the same set of
 * comments, wasting time and causing conflicts. For this reason, the moderation
 * of a comment can only be performed by the moderator to which the comment was
 * attached. Steps to do:
 * 1) lockForModeration: to lock a set of pending comments to the me (as
 * moderator)
 * 2) findCommentsForMederation: to have the list of comments assigned to the
 * specified moderatorId.
 * 
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/adxcontents/resources/commentmoderation/</li>
 * </ul>
 */
@Path("/commentmoderation")
//#SWG#@Api(value = "/commentmoderation", description = """Service used to manage the comments and to handle the moderation process. The moderation process requires that moderators self-assignee groups of pending comments awaiting to avoid different moderators "working" on the same set of comments, wasting time and causing conflicts. For this reason, the moderation of a comment can only be performed by the moderator to which the comment was attached. Steps to do:
//#SWGNL#1) lockForModeration: to lock a set of pending comments to the me (as moderator)
//#SWGNL#2) findCommentsForMederation: to have the list of comments assigned to the specified moderatorId.
//#SWGNL#
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/adxcontents/resources/commentmoderation/</li>
//#SWGNL#</ul>""")
trait JCommentModeration extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param commentId : String
	 * @param categoryIdForAcl : String
	 * Optional. For ACL Validation
	 * @return MResponseComment
	*/
	@POST
	@Path("/deleteComment")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/deleteComment", notes = """""", response = classOf[MResponseComment])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def deleteComment(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("commentId")
	commentId: String, 
			//#SWG#@ApiParam(value = """Optional. For ACL Validation""")
	@FormParam("categoryIdForAcl")
	categoryIdForAcl: String):Response /*returnType = MResponseComment*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__deleteComment(tokenId,clientId,commentId,categoryIdForAcl)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_deleteComment)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_deleteComment)
	    }
	} 

	@GET
	@Path("/deleteComment")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def deleteComment_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("commentId")commentId_q: String, 
			@QueryParam("categoryIdForAcl")categoryIdForAcl_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseComment*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__deleteComment(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,commentId_q,categoryIdForAcl_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_deleteComment)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_deleteComment)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __deleteComment(tokenId: String, clientId: String, commentId: String, categoryIdForAcl: String) :MResponseComment
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_deleteComment: String

	/**
	 * Used by community user to change their comments. This service remove the Moderation details, so if
	 * a comment were moderated, it result as draft. 
	 * @param tokenId : String
	 * @param param : MCommentModerationupdateCommentReq
	 * @return MResponseComment
	*/
	@POST
	@Path("/updateComment")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateComment", notes = """Used by community user to change their comments. This service remove the Moderation details, so if a comment were moderated, it result as draft. """, response = classOf[MResponseComment])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateComment(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCommentModerationupdateCommentReq):Response /*returnType = MResponseComment*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateComment(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateComment)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateComment)
	    }
	} 

	@GET
	@Path("/updateComment")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateComment_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseComment*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateComment(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCommentModerationupdateCommentReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateComment)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateComment)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateComment(tokenId: String, param: MCommentModerationupdateCommentReq) :MResponseComment
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateComment: String

	/**
	 * Used by moderators to change to approve or reject the comments in the platform.
	 * @param tokenId : String
	 * @param param : MCommentModerationmoderateCommentsReq
	 * @return MResponseComment
	*/
	@POST
	@Path("/moderateComments")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/moderateComments", notes = """Used by moderators to change to approve or reject the comments in the platform.""", response = classOf[MResponseComment])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def moderateComments(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCommentModerationmoderateCommentsReq):Response /*returnType = MResponseComment*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__moderateComments(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_moderateComments)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_moderateComments)
	    }
	} 

	@GET
	@Path("/moderateComments")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def moderateComments_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseComment*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__moderateComments(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCommentModerationmoderateCommentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_moderateComments)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_moderateComments)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __moderateComments(tokenId: String, param: MCommentModerationmoderateCommentsReq) :MResponseComment
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_moderateComments: String

	/**
	 * The service return the content description and the list of linked comments filtered based on the
	 * search criteria. If locale is empty the MContentDetail.contentName attribute is empty. The service
	 * is used essentially to retrieve the list of comments to moderate.
	 * @param tokenId : String
	 * @param param : MCommentModerationfindCommentsForModerationReq
	 * @return MResponseFindComments
	*/
	@POST
	@Path("/findCommentsForModeration")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findCommentsForModeration", notes = """The service return the content description and the list of linked comments filtered based on the search criteria. If locale is empty the MContentDetail.contentName attribute is empty. The service is used essentially to retrieve the list of comments to moderate.""", response = classOf[MResponseFindComments])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findCommentsForModeration(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCommentModerationfindCommentsForModerationReq):Response /*returnType = MResponseFindComments*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findCommentsForModeration(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findCommentsForModeration)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findCommentsForModeration)
	    }
	} 

	@GET
	@Path("/findCommentsForModeration")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def findCommentsForModeration_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseFindComments*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__findCommentsForModeration(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCommentModerationfindCommentsForModerationReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_findCommentsForModeration)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findCommentsForModeration)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findCommentsForModeration(tokenId: String, param: MCommentModerationfindCommentsForModerationReq) :MResponseFindComments
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findCommentsForModeration: String

	/**
	 * This service is used to assign a block of "n" comments to the given moderatorId. So to prevent race
	 * condition during the moderation task.
	 * Usually the moderator request a slot of "n" comments to moderate and handle only those comments,
	 * when the list is empty it request another slot.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param moderatorId : String
	 * @param numberOfComments : Integer
	 * total number of new comments to assign to the given moderatorId
	 * @return MResponseComment
	*/
	@POST
	@Path("/lockForModeration")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/lockForModeration", notes = """This service is used to assign a block of "n" comments to the given moderatorId. So to prevent race condition during the moderation task.
	//#SWGNL#Usually the moderator request a slot of "n" comments to moderate and handle only those comments, when the list is empty it request another slot.""", response = classOf[MResponseComment])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def lockForModeration(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("moderatorId")
	moderatorId: String, 
			//#SWG#@ApiParam(value = """total number of new comments to assign to the given moderatorId""")
	@FormParam("numberOfComments")
	numberOfComments: Integer):Response /*returnType = MResponseComment*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__lockForModeration(tokenId,clientId,moderatorId,numberOfComments)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_lockForModeration)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_lockForModeration)
	    }
	} 

	@GET
	@Path("/lockForModeration")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def lockForModeration_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("moderatorId")moderatorId_q: String, 
			@QueryParam("numberOfComments")numberOfComments_q: Integer,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseComment*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__lockForModeration(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,moderatorId_q,numberOfComments_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_lockForModeration)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_lockForModeration)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __lockForModeration(tokenId: String, clientId: String, moderatorId: String, numberOfComments: Integer) :MResponseComment
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_lockForModeration: String

	/**
	 * This service is used to the moderatorId for a given comment
	 * @param tokenId : String
	 * @param param : MCommentModerationchangeModeratorIdReq
	 * @return MResponseComment
	*/
	@POST
	@Path("/changeModeratorId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/changeModeratorId", notes = """This service is used to the moderatorId for a given comment""", response = classOf[MResponseComment])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def changeModeratorId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MCommentModerationchangeModeratorIdReq):Response /*returnType = MResponseComment*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__changeModeratorId(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_changeModeratorId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_changeModeratorId)
	    }
	} 

	@GET
	@Path("/changeModeratorId")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def changeModeratorId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseComment*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__changeModeratorId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MCommentModerationchangeModeratorIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_changeModeratorId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_changeModeratorId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __changeModeratorId(tokenId: String, param: MCommentModerationchangeModeratorIdReq) :MResponseComment
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_changeModeratorId: String

	/**
	 * reset the totalnumbers of comments and approved comments for the given contentId.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param categoryIdForAcl : String
	 * optional. For Acl validation

	 * @return MResponseComment
	*/
	@POST
	@Path("/resetContentCounters")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/resetContentCounters", notes = """reset the totalnumbers of comments and approved comments for the given contentId.""", response = classOf[MResponseComment])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def resetContentCounters(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """optional. For Acl validation
	//#SWGNL#""")
	@FormParam("categoryIdForAcl")
	categoryIdForAcl: String):Response /*returnType = MResponseComment*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__resetContentCounters(tokenId,clientId,contentId,categoryIdForAcl)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_resetContentCounters)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_resetContentCounters)
	    }
	} 

	@GET
	@Path("/resetContentCounters")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def resetContentCounters_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("contentId")contentId_q: String, 
			@QueryParam("categoryIdForAcl")categoryIdForAcl_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseComment*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__resetContentCounters(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,contentId_q,categoryIdForAcl_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_resetContentCounters)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_resetContentCounters)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __resetContentCounters(tokenId: String, clientId: String, contentId: String, categoryIdForAcl: String) :MResponseComment
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_resetContentCounters: String

}