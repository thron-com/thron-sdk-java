package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.category.MResponseNewCategory
import it.newvision.nvp.xcontents.services.model.request.MCategorycreateCategoryReq
import it.newvision.nvp.xcontents.services.model.category.MResponseUpdateCategory
import it.newvision.nvp.xcontents.services.model.request.MCategoryaddCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryremoveCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.category.MResponseRemoveCategory
import it.newvision.nvp.xcontents.services.model.category.MResponseFindCategory2
import it.newvision.nvp.xcontents.services.model.request.MCategoryfindByProperties2Req
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategoryReq
import it.newvision.nvp.xcontents.services.model.category.MResponseGetCategory
import it.newvision.nvp.xcontents.services.model.category.MResponseCategoryPrettyId
import it.newvision.nvp.xcontents.services.model.request.MCategoryaddCategoryPrettyIdReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategoryPrettyIdReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryremoveCategoryPrettyIdReq
import it.newvision.nvp.xcontents.services.model.category.MResponseCategoryVerifyPrettyId
import it.newvision.nvp.xcontents.services.model.request.MCategoryverifyCategoryPrettyIdReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JCategoryClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to manage categories (Folders).
 * A Category is a container of contents, and ca be organized in a tree structure.
 * 
 * Categories can have multilingual metadata, name and description.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/category</li>
 * </ul>
 */
class JCategoryClient(val resourceEndpoint:String) {

	/**
	 * Used to create a new category.
	 * When creating a child category, all ACLs are inherited from the parent category (ownership
	 * included).
	 * 
	 * <b>Validations:</b>
	 * <ul>
	 * 	<li>Can be invoked only by users with role  4ME_MANAGE_PUBLIC_CATEGORIES or
	 * CORE_MANAGE_PUBLIC_CATEGORIES</li>
	 * 	<li>Applications can not create root categories</li>
	 * 	<li>MODIFY Acl is required  on the parent category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategorycreateCategoryReq
	 * @return MResponseNewCategory
	*/
	def createCategory(tokenId: String, 
			param: MCategorycreateCategoryReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseNewCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseNewCategory = if(this.resourceEndpoint == ""){
			
				new MResponseNewCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/createCategory")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseNewCategory],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseNewCategory])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to add the category's name,except and description in a specific lang
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required  on the specific category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryaddCategory4LocaleReq
	 * @return MResponseUpdateCategory
	*/
	def addCategory4Locale(tokenId: String, 
			param: MCategoryaddCategory4LocaleReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdateCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateCategory = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/addCategory4Locale")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateCategory],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateCategory])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to remove the category's name,except and description for a specific lang
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required  on the specific category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryremoveCategory4LocaleReq
	 * @return MResponseUpdateCategory
	*/
	def removeCategory4Locale(tokenId: String, 
			param: MCategoryremoveCategory4LocaleReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdateCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateCategory = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/removeCategory4Locale")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateCategory],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateCategory])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to update the category's name,except and description in a specific lang
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required  on the specific category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryupdateCategory4LocaleReq
	 * @return MResponseUpdateCategory
	*/
	def updateCategory4Locale(tokenId: String, 
			param: MCategoryupdateCategory4LocaleReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdateCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateCategory = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/updateCategory4Locale")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateCategory],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateCategory])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service remove the specified category only if there no linked contents and subcategories.
	 * With cascade = true the service unlink all contents and remove recursively all subcategories
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>Can be invoked only by users with role  4ME_MANAGE_PUBLIC_CATEGORIES or
	 * CORE_MANAGE_PUBLIC_CATEGORIES</li>
	 * </ul>
	 * <ul>
	 * 	<li>MODIFY Acl is required  on the specific category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param catId : String
	 * Id or prettyId
	 * @param cascade : Boolean
	 * Used to force the remove also in the subcategories
	 * @return MResponseRemoveCategory
	*/
	def removeCategory(tokenId: String, 
			clientId: String, 
			catId: String, 
			cascade: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRemoveCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(catId).foreach(s => params.add("catId", s))
		Option(cascade).foreach(s => params.add("cascade", s))  
			val response : MResponseRemoveCategory = if(this.resourceEndpoint == ""){
			
				new MResponseRemoveCategory()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("category/removeCategory")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseRemoveCategory],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRemoveCategory])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * returns a flat list of categories that meet the search criteria. Each single category in the result
	 * set doesn't show the proper "linkedCategory" information.
	 * @param tokenId : String
	 * @param param : MCategoryfindByProperties2Req
	 * @return MResponseFindCategory2
	*/
	def findByProperties2(tokenId: String, 
			param: MCategoryfindByProperties2Req)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseFindCategory2 ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindCategory2 = if(this.resourceEndpoint == ""){
			
				new MResponseFindCategory2()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/findByProperties2")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindCategory2],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindCategory2])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The "update" field of this web service works in “patch" mode: it means that each and everyone of
	 * the "update" attributes you want to change must be included in the body of the request, those not
	 * included will not be updated.
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required  on the specific category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryupdateCategoryReq
	 * @return MResponseUpdateCategory
	*/
	def updateCategory(tokenId: String, 
			param: MCategoryupdateCategoryReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdateCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateCategory = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/updateCategory")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateCategory],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateCategory])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Return the category object with the specified categoryId; if cascade = true returns the tree of
	 * children categories.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * required.
	 * Can be used the Category Id or the Category PrettyId

	 * @param cascade : Boolean
	 * Optional. With cascade equals true, the service return the children sub tree of the given category
	 * @param locale : String
	 * Optional.If the client desires to have the category description for a specific locale. The desired
	 * locale is return as first element of the array (if exists).
	 * The field is used in conjunction with orderBy field to sort the contents by categoryName (for a
	 * specific locale)
	 * The service always return all available locales for each category.
	 * @return MResponseGetCategory
	*/
	def getCategory(tokenId: String, 
			clientId: String, 
			categoryId: String, 
			cascade: Boolean, 
			locale: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(categoryId).foreach(s => params.add("categoryId", s))
		Option(cascade).foreach(s => params.add("cascade", s))
		Option(locale).foreach(s => params.add("locale", s))
			val response : MResponseGetCategory = if(this.resourceEndpoint == ""){
			
				new MResponseGetCategory()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("category/getCategory")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetCategory])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetCategory])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * add the category prettyId for a specific locale.
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required  on the specific category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryaddCategoryPrettyIdReq
	 * @return MResponseCategoryPrettyId
	*/
	def addCategoryPrettyId(tokenId: String, 
			param: MCategoryaddCategoryPrettyIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCategoryPrettyId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseCategoryPrettyId = if(this.resourceEndpoint == ""){
			
				new MResponseCategoryPrettyId()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/addCategoryPrettyId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCategoryPrettyId],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCategoryPrettyId])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * update the category prettyId for a specific locale.
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required  on the specific category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryupdateCategoryPrettyIdReq
	 * @return MResponseCategoryPrettyId
	*/
	def updateCategoryPrettyId(tokenId: String, 
			param: MCategoryupdateCategoryPrettyIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCategoryPrettyId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseCategoryPrettyId = if(this.resourceEndpoint == ""){
			
				new MResponseCategoryPrettyId()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/updateCategoryPrettyId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCategoryPrettyId],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCategoryPrettyId])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * remove the category prettyId for a specific locale.
	 * 
	 * <b>ACL validation:</b>
	 * <ul>
	 * 	<li>MODIFY is required  on the specific category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MCategoryremoveCategoryPrettyIdReq
	 * @return MResponseCategoryPrettyId
	*/
	def removeCategoryPrettyId(tokenId: String, 
			param: MCategoryremoveCategoryPrettyIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCategoryPrettyId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseCategoryPrettyId = if(this.resourceEndpoint == ""){
			
				new MResponseCategoryPrettyId()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/removeCategoryPrettyId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCategoryPrettyId],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCategoryPrettyId])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Verify whether a category prettyId is valid for a specific locale or not, and eventually suggest an
	 * alternative.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MCategoryverifyCategoryPrettyIdReq
	 * @return MResponseCategoryVerifyPrettyId
	*/
	def verifyCategoryPrettyId(tokenId: String, 
			clientId: String, 
			param: MCategoryverifyCategoryPrettyIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCategoryVerifyPrettyId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseCategoryVerifyPrettyId = if(this.resourceEndpoint == ""){
			
				new MResponseCategoryVerifyPrettyId()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/verifyCategoryPrettyId")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCategoryVerifyPrettyId],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCategoryVerifyPrettyId])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}