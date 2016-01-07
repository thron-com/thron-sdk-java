package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
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
object JCommentModerationClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
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
class JCommentModerationClient(val resourceEndpoint:String) {

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param commentId : String
	 * @param categoryIdForAcl : String
	 * Optional. For ACL Validation
	 * @return MResponseComment
	*/
	def deleteComment(tokenId: String, 
			clientId: String, 
			commentId: String, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseComment ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentModerationClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(commentId).foreach(s => params.add("commentId", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))  
			val response : MResponseComment = if(this.resourceEndpoint == ""){
			
				new MResponseComment()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("commentmoderation/deleteComment")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseComment],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseComment])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Used by community user to change their comments. This service remove the Moderation details, so if
	 * a comment were moderated, it result as draft. 
	 * @param tokenId : String
	 * @param param : MCommentModerationupdateCommentReq
	 * @return MResponseComment
	*/
	def updateComment(tokenId: String, 
			param: MCommentModerationupdateCommentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseComment ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentModerationClient.client.resource(this.resourceEndpoint)
			val response : MResponseComment = if(this.resourceEndpoint == ""){
			
				new MResponseComment()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("commentmoderation/updateComment")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseComment],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseComment])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used by moderators to change to approve or reject the comments in the platform.
	 * @param tokenId : String
	 * @param param : MCommentModerationmoderateCommentsReq
	 * @return MResponseComment
	*/
	def moderateComments(tokenId: String, 
			param: MCommentModerationmoderateCommentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseComment ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentModerationClient.client.resource(this.resourceEndpoint)
			val response : MResponseComment = if(this.resourceEndpoint == ""){
			
				new MResponseComment()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("commentmoderation/moderateComments")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseComment],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseComment])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service return the content description and the list of linked comments filtered based on the
	 * search criteria. If locale is empty the MContentDetail.contentName attribute is empty. The service
	 * is used essentially to retrieve the list of comments to moderate.
	 * @param tokenId : String
	 * @param param : MCommentModerationfindCommentsForModerationReq
	 * @return MResponseFindComments
	*/
	def findCommentsForModeration(tokenId: String, 
			param: MCommentModerationfindCommentsForModerationReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseFindComments ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentModerationClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindComments = if(this.resourceEndpoint == ""){
			
				new MResponseFindComments()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("commentmoderation/findCommentsForModeration")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindComments],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindComments])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

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
	def lockForModeration(tokenId: String, 
			clientId: String, 
			moderatorId: String, 
			numberOfComments: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseComment ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentModerationClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(moderatorId).foreach(s => params.add("moderatorId", s))
		Option(numberOfComments).foreach(s => params.add("numberOfComments", s))  
			val response : MResponseComment = if(this.resourceEndpoint == ""){
			
				new MResponseComment()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("commentmoderation/lockForModeration")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseComment],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseComment])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * This service is used to the moderatorId for a given comment
	 * @param tokenId : String
	 * @param param : MCommentModerationchangeModeratorIdReq
	 * @return MResponseComment
	*/
	def changeModeratorId(tokenId: String, 
			param: MCommentModerationchangeModeratorIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseComment ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentModerationClient.client.resource(this.resourceEndpoint)
			val response : MResponseComment = if(this.resourceEndpoint == ""){
			
				new MResponseComment()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("commentmoderation/changeModeratorId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseComment],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseComment])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * reset the totalnumbers of comments and approved comments for the given contentId.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param categoryIdForAcl : String
	 * optional. For Acl validation

	 * @return MResponseComment
	*/
	def resetContentCounters(tokenId: String, 
			clientId: String, 
			contentId: String, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseComment ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentModerationClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))  
			val response : MResponseComment = if(this.resourceEndpoint == ""){
			
				new MResponseComment()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("commentmoderation/resetContentCounters")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseComment],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseComment])
				}
				else {
				  throw e
				}
		  }
	
	}

}