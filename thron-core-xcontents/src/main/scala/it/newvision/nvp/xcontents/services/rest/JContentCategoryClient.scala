package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.contentCategory.MResponseLinkCategoryToContent
import it.newvision.nvp.xcontents.services.model.contentCategory.MResponseShowContentByCategory
import it.newvision.nvp.xcontents.services.model.request.MContentCategoryshowContentsByCategoryReq
import it.newvision.nvp.xcontents.services.model.contentCategory.MResponseShowCategoriesByContent
import it.newvision.nvp.xcontents.services.model.request.MContentCategoryshowCategoriesByContentReq

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
 * Service used to organize the contents inside the categories, especially to
 * add/remove a content to a specific category.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/contentcategory/  </li>
 * </ul>
 */
class JContentCategoryClient(val resourceEndpoint:String) {

	/**
	 * Used to add a content to a specific category.
	 * Roles restrictions: 4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * @param contentId : String
	 * @param applyAcl : Boolean
	 * Optional. Default = false
	 * Automatically Apply the right ACL between Content and Category
	 * @return MResponseLinkCategoryToContent
	*/
	def linkCategoryToContent(tokenId: String, 
			clientId: String, 
			categoryId: String, 
			contentId: String, 
			applyAcl: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLinkCategoryToContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentCategoryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(categoryId).foreach(s => params.add("categoryId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(applyAcl).foreach(s => params.add("applyAcl", s))  
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
	 * Used to remove a content from a specific category.
	 * Roles restrictions: 4ME_SHARE_CONTENTS_IN_PUBLIC_CATEGORIES
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * @param contentId : String
	 * @param applyAcl : Boolean
	 * Optional. Default = false
	 * Automatically Apply the right ACL between Content and Category
	 * @return MResponseLinkCategoryToContent
	*/
	def removeCategoryToContent(tokenId: String, 
			clientId: String, 
			categoryId: String, 
			contentId: String, 
			applyAcl: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseLinkCategoryToContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentCategoryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(categoryId).foreach(s => params.add("categoryId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(applyAcl).foreach(s => params.add("applyAcl", s))  
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
	 * Deprecated with Use JContent.findByProperties
	 * 
	 * Return the list contents linked to a category.
	 * if categoryId is empty find all contents without categories
	 * @param tokenId : String
	 * @param param : MContentCategoryshowContentsByCategoryReq
	 * @return MResponseShowContentByCategory
	*/
	@Deprecated
	def showContentsByCategory(tokenId: String, 
			param: MContentCategoryshowContentsByCategoryReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseShowContentByCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseShowContentByCategory = if(this.resourceEndpoint == ""){
			
				new MResponseShowContentByCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contentcategory/showContentsByCategory")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseShowContentByCategory],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseShowContentByCategory])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Deprecated by JContent.detail
	 * Return the list of categories where the content is linked.
	 * @param tokenId : String
	 * @param param : MContentCategoryshowCategoriesByContentReq
	 * @return MResponseShowCategoriesByContent
	*/
	@Deprecated
	def showCategoriesByContent(tokenId: String, 
			param: MContentCategoryshowCategoriesByContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseShowCategoriesByContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseShowCategoriesByContent = if(this.resourceEndpoint == ""){
			
				new MResponseShowCategoriesByContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contentcategory/showCategoriesByContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseShowCategoriesByContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseShowCategoriesByContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}