package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.contentCategory.MResponseLinkCategoryToContent
import it.newvision.nvp.xcontents.services.model.contentCategory.MResponseLinkContentCategory
import it.newvision.nvp.xcontents.services.model.request.MContentCategorylinkReq
import it.newvision.nvp.xcontents.services.model.request.MContentCategoryunlinkReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JContentCategoryClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to add/remove content to/from categories.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/contentcategory</li>
 * </ul>
 */
class JContentCategoryClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Deprecated by link service
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * Id or prettyId
	 * @param contentId : String
	 * @param silentMode : Boolean
	 * Optional. Do not send any notification to the users
	 * @return MResponseLinkCategoryToContent
	*/
	def linkCategoryToContent(tokenId: String, 
			clientId: String, 
			categoryId: String, 
			contentId: String, 
			silentMode: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseLinkCategoryToContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentCategoryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(categoryId).foreach(s => params.add("categoryId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(silentMode).foreach(s => params.add("silentMode", s))  
			val response : MResponseLinkCategoryToContent = if(this.resourceEndpoint == ""){
			
				new MResponseLinkCategoryToContent()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("contentcategory/linkCategoryToContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseLinkCategoryToContent],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLinkCategoryToContent])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Deprecated by unlink service
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * Id or prettyId
	 * @param contentId : String
	 * @param silentModel : Boolean
	 * Optional. Do not send any notification to the users
	 * @return MResponseLinkCategoryToContent
	*/
	def removeCategoryToContent(tokenId: String, 
			clientId: String, 
			categoryId: String, 
			contentId: String, 
			silentModel: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseLinkCategoryToContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentCategoryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(categoryId).foreach(s => params.add("categoryId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(silentModel).foreach(s => params.add("silentModel", s))  
			val response : MResponseLinkCategoryToContent = if(this.resourceEndpoint == ""){
			
				new MResponseLinkCategoryToContent()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("contentcategory/removeCategoryToContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseLinkCategoryToContent],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLinkCategoryToContent])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Link a content to a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>Role: 4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES</li>
	 * 	<li>SHARE ACL on the contents</li>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * 
	 * The user can not link share ONLY contents on category where the user has permission of MODIFY on
	 * contents.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentCategorylinkReq
	 * @return MResponseLinkContentCategory
	*/
	def link(tokenId: String, 
			clientId: String, 
			param: MContentCategorylinkReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseLinkContentCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseLinkContentCategory = if(this.resourceEndpoint == ""){
			
				new MResponseLinkContentCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contentcategory/link")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLinkContentCategory],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLinkContentCategory])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes a content from a category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES role</li>
	 * 	<li>SHARE ACL on the content</li>
	 * </ul>
	 * <ul>
	 * 	<li>MODIFY ACL on the category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentCategoryunlinkReq
	 * @return MResponseLinkContentCategory
	*/
	def unlink(tokenId: String, 
			clientId: String, 
			param: MContentCategoryunlinkReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseLinkContentCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseLinkContentCategory = if(this.resourceEndpoint == ""){
			
				new MResponseLinkContentCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contentcategory/unlink")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseLinkContentCategory],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseLinkContentCategory])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}