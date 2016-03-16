package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.tag.MResponseTag
import it.newvision.nvp.xcontents.services.model.request.MTagaddTagReq
import it.newvision.nvp.xcontents.services.model.tag.MResponseTags

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JTagClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to handle the tags in platform, linked to the contents.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.com/api/xcontents/resources/tag/
 * </li>
 * </ul>
 */
class JTagClient(val resourceEndpoint:String) {

	/**
	 * Add a new tag to the specified content. If the tag is already present in the content, it will be
	 * ignored
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required on the specific content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MTagaddTagReq
	 * @return MResponseTag
	*/
	def addTag(tokenId: String, 
			param: MTagaddTagReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTag ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTagClient.client.resource(this.resourceEndpoint)
			val response : MResponseTag = if(this.resourceEndpoint == ""){
			
				new MResponseTag()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("tag/addTag")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseTag],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTag])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove a tag to the specified content.
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required on the specific content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param tagvalue : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseTag
	*/
	def removeTag(tokenId: String, 
			clientId: String, 
			contentId: String, 
			tagvalue: String, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTag ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTagClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(tagvalue).foreach(s => params.add("tagvalue", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))  
			val response : MResponseTag = if(this.resourceEndpoint == ""){
			
				new MResponseTag()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("tag/removeTag")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseTag],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTag])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Used to get the full list of different tags used in the platform.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param offset : Integer
	 * Optional, default value is 0
	 * @param numberOfResult : Integer
	 * Optional
	 * @return MResponseTags
	*/
	def showAllTags(tokenId: String, 
			clientId: String, 
			offset: Integer, 
			numberOfResult: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTags ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTagClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
			val response : MResponseTags = if(this.resourceEndpoint == ""){
			
				new MResponseTags()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("tag/showAllTags")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseTags])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTags])
				}
				else {
					throw e
				}
			
		  }
	
	}

}