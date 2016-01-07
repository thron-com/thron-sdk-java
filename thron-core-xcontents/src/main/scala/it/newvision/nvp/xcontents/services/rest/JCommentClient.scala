package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
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
object JCommentClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Services used by community user to comment published contents.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/comment/   </li>
 * </ul>
 */
class JCommentClient(val resourceEndpoint:String) {

	/**
	 * Used to add a new comment in the platform. Comment inserted by community users.
	 * @param tokenId : String
	 * @param param : MCommentinsertCommentReq
	 * @return MResponseInsertComment
	*/
	def insertComment(tokenId: String, 
			param: MCommentinsertCommentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseInsertComment ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentClient.client.resource(this.resourceEndpoint)
			val response : MResponseInsertComment = if(this.resourceEndpoint == ""){
			
				new MResponseInsertComment()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("comment/insertComment")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseInsertComment],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseInsertComment])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param commentId : String
	 * @param userId : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseComment
	*/
	def reportAbuse(tokenId: String, 
			clientId: String, 
			commentId: String, 
			userId: String, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseComment ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(commentId).foreach(s => params.add("commentId", s))
		Option(userId).foreach(s => params.add("userId", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))  
			val response : MResponseComment = if(this.resourceEndpoint == ""){
			
				new MResponseComment()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("comment/reportAbuse")
				
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
	 * The service return the comment detail information.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param commentId : String
	 * Optional parameter
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseDetailComment
	*/
	def detail(tokenId: String, 
			clientId: String, 
			commentId: String, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDetailComment ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(commentId).foreach(s => params.add("commentId", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))
			val response : MResponseDetailComment = if(this.resourceEndpoint == ""){
			
				new MResponseDetailComment()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("comment/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDetailComment])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailComment])
				}
				else {
					throw e
				}
			
		  }
	
	}

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
	def getComments(tokenId: String, 
			clientId: String, 
			contentId: String, 
			keyword: String, 
			locale: String, 
			status: String, 
			userId: String, 
			moderationStatus: MEModerationStatus, 
			orderBy: MECommentOrderBy, 
			categoryIdForAcl: String, 
			offset: Integer, 
			numberOfResults: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetComments ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCommentClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(keyword).foreach(s => params.add("keyword", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(status).foreach(s => params.add("status", s))
		Option(userId).foreach(s => params.add("userId", s))
		Option(moderationStatus).foreach(s => params.add("moderationStatus", s))
		Option(orderBy).foreach(s => params.add("orderBy", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResults).foreach(s => params.add("numberOfResults", s))
			val response : MResponseGetComments = if(this.resourceEndpoint == ""){
			
				new MResponseGetComments()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("comment/getComments")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetComments])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetComments])
				}
				else {
					throw e
				}
			
		  }
	
	}

}