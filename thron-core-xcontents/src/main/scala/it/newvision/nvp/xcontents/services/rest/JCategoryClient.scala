package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.category.MResponseNewCategory
import it.newvision.nvp.xcontents.services.model.request.MCategorycreateCategoryReq
import it.newvision.nvp.xcontents.services.model.request.MCategorycreateSystemCategoryReq
import it.newvision.nvp.xcontents.services.model.category.MResponseUpdateCategory
import it.newvision.nvp.xcontents.services.model.request.MCategoryaddCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryremoveCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategory4LocaleReq
import it.newvision.nvp.xcontents.services.model.category.MResponseRemoveCategory
import it.newvision.nvp.xcontents.services.model.category.MResponseFindCategory
import it.newvision.nvp.xcontents.services.model.request.MCategoryfindByPropertiesReq
import it.newvision.nvp.xcontents.services.model.category.MResponseFindCategory2
import it.newvision.nvp.xcontents.services.model.request.MCategoryfindByProperties2Req
import it.newvision.nvp.xcontents.services.model.category.MResponseCategorySetParentId
import it.newvision.nvp.xcontents.services.model.request.MCategoryupdateCategoryReq
import it.newvision.nvp.xcontents.services.model.category.MResponseGetCategory
import it.newvision.nvp.xcontents.services.model.category.MResponseGetRootCategories
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
 * Service used to handle categories, useful for organize the logical contents
 * present on the platform. The service allows you to manage the metadata
 * associated with categories in multilingual.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/category/    </li>
 * </ul>
 */
class JCategoryClient(val resourceEndpoint:String) {

	/**
	 * create a new category and link to the parent category in the tree hierarchy. The service allows to
	 * create two different types of category (PUBLIC and PRIVATE). Private categories are used to
	 * organize the private contents of a user and are visible only by the user that create the category.
	 * 
	 * Category trees with mixed categories (public and private) is not allowed.
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
	 * create a new System category and link to the parent category in the tree hierarchy. Only super
	 * users have the permission to use this service.
	 * @param tokenId : String
	 * @param param : MCategorycreateSystemCategoryReq
	 * @return MResponseNewCategory
	*/
	def createSystemCategory(tokenId: String, 
			param: MCategorycreateSystemCategoryReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseNewCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseNewCategory = if(this.resourceEndpoint == ""){
			
				new MResponseNewCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/createSystemCategory")
				
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
	 * With cascade = true the service unlink all linked contents and unlink the subcategories (the
	 * subcategories becomes root categories)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param catId : String
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
	 * Deprecated by findByProperties2.
	 * 
	 * Returns a flat list of categories that meet the search criteria. Each single category in the result
	 * set doesn't show the proper "linkedCategory" information.
	 * @param tokenId : String
	 * @param param : MCategoryfindByPropertiesReq
	 * @return MResponseFindCategory
	*/
	@Deprecated
	def findByProperties(tokenId: String, 
			param: MCategoryfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseFindCategory ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindCategory = if(this.resourceEndpoint == ""){
			
				new MResponseFindCategory()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("category/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindCategory],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindCategory])
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
	 * Used to move a category (and its sub tree) to a different node in the category forest.
	 * 
	 * Example:
	 * given two category tree we move the category C2 inside C4
	 * <ul>
	 * 	<li>C1->C2->C3</li>
	 * </ul>
	 * <ul>
	 * 	<li>C4->C5->C6</li>
	 * </ul>
	 * result:
	 * <ul>
	 * 	<li>C1</li>
	 * </ul>
	 * <ul>
	 * 	<li>C4->C5->C6</li>
	 * </ul>
	 * <ul>
	 * 	<li>     ->C2->C3</li>
	 * </ul>
	 * After the operation the category C2 (and subcategories) becomes subcategory of C4.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param categoryId : String
	 * @param categoryParentId : String
	 * @return MResponseCategorySetParentId
	*/
	def setParentId(tokenId: String, 
			clientId: String, 
			categoryId: String, 
			categoryParentId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCategorySetParentId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(categoryId).foreach(s => params.add("categoryId", s))
		Option(categoryParentId).foreach(s => params.add("categoryParentId", s))  
			val response : MResponseCategorySetParentId = if(this.resourceEndpoint == ""){
			
				new MResponseCategorySetParentId()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("category/setParentId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseCategorySetParentId],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCategorySetParentId])
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
	 * Return the category object with the specified CategoryID; if cascade = true returns the tree of
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
	 * Deprecated by findByProperties2
	 * 
	 * Return the list of top level categories (only root PUBLIC categories) without the children category
	 * detail. can be used to filter only the root categories of a specific solution (VIEW,PLAY,MOVE...)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param locale : String
	 * the give locale used for the output description. Optional parameter.
	 * @param solution : String
	 * @param offset : Integer
	 * @param numberOfResult : Integer
	 * default value= 50
	 * value -1, return all result not paginated
	 * @return MResponseGetRootCategories
	*/
	@Deprecated
	def getRootCategories(tokenId: String, 
			clientId: String, 
			locale: String, 
			solution: String, 
			offset: Integer, 
			numberOfResult: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetRootCategories ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCategoryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(solution).foreach(s => params.add("solution", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
			val response : MResponseGetRootCategories = if(this.resourceEndpoint == ""){
			
				new MResponseGetRootCategories()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("category/getRootCategories")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetRootCategories])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetRootCategories])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * add the category prettyId for a specific locale.
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