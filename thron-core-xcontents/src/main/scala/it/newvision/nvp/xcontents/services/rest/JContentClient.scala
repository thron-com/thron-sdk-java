package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MResponseContentAddLocale
import it.newvision.nvp.xcontents.services.model.request.MContentaddContent4LocaleReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentDetail
import it.newvision.nvp.xcontents.services.model.content.MResponseContentFindByProperties
import it.newvision.nvp.xcontents.services.model.request.MContentfindByPropertiesReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentRemoveLocale
import it.newvision.nvp.xcontents.services.model.content.MResponseContentUpdate
import it.newvision.nvp.xcontents.services.model.request.MContentupdateAvailableSolutionsReq
import it.newvision.nvp.xcontents.services.model.request.MContentupdateContentReq
import it.newvision.nvp.xcontents.services.model.request.MContentaddPlayerEmbedCodeReq
import it.newvision.nvp.xcontents.services.model.request.MContentremovePlayerEmbedCodeReq
import it.newvision.nvp.xcontents.services.model.request.MContentupdatePlayerEmbedCodeReq
import it.newvision.nvp.xcontents.services.model.request.MContentupdatePlayerEmbedCodesReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentUpdateLocale
import it.newvision.nvp.xcontents.services.model.request.MContentupdateContent4LocaleReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentPrettyId
import it.newvision.nvp.xcontents.services.model.request.MContentupdateContentPrettyIdReq
import it.newvision.nvp.xcontents.services.model.request.MContentremoveContentPrettyIdReq
import it.newvision.nvp.xcontents.services.model.request.MContentaddContentPrettyIdReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContentVerifyPrettyId
import it.newvision.nvp.xcontents.services.model.request.MContentverifyContentPrettyIdReq
import it.newvision.nvp.xcontents.services.model.content.MResponseContent
import it.newvision.nvp.xcontents.services.model.request.MContentaddLinkedContentReq
import it.newvision.nvp.xcontents.services.model.request.MContentaddLinkedContentsReq
import it.newvision.nvp.xcontents.services.model.request.MContentmoveLinkedContentReq
import it.newvision.nvp.xcontents.services.model.request.MContentremoveLinkedContentsReq
import it.newvision.nvp.xcontents.services.model.request.MContentupdateUserSpecificValuesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JContentClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to manage a Content. A Content is a generic object within the
 * platform, may contain multiple descriptions in different languages, be linked
 * to one or more categories, have tags and  be linked to other contents. A
 * content can be created only throw the specific publishing process service in
 * xadmin component.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/content/   </li>
 * </ul>
 */
class JContentClient(val resourceEndpoint:String) {

	/**
	 * Used to add the content's name,except and description in a specific locale (lang)
	 * @param tokenId : String
	 * @param param : MContentaddContent4LocaleReq
	 * @return MResponseContentAddLocale
	*/
	def addContent4Locale(tokenId: String, 
			param: MContentaddContent4LocaleReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentAddLocale ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentAddLocale = if(this.resourceEndpoint == ""){
			
				new MResponseContentAddLocale()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/addContent4Locale")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentAddLocale],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentAddLocale])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * return all content information:
	 * <ul>
	 * 	<li>all metadata </li>
	 * 	<li>the specified content4Locale </li>
	 * 	<li>the linkedcontent collection </li>
	 * 	<li>the list of tags </li>
	 * </ul>
	 * 
	 * if the value of locale is empty, the service returns the value for all locales added to the content.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param locale : String
	 * Optional.If the client desires to have the content description only for a specific locale. If empty
	 * the service return all available locales of the contents.
	 * @param returnLinkedContents : Boolean
	 * Optional. used to specify if the service should return the list of linked contents
	 * (MResponseContentDetail.content.linkedContents)
	 * @param returnLinkedCategories : Boolean
	 * Optional. used to specify if the service should return the list of linked Categories.
	 * (MResponseContentDetail.linkedCategories)
	 * @param returnThumbUrl : Boolean
	 * Optional. used to specify if the service should return the thumbnail Url of the content
	 * @param returnItags : Boolean
	 * Optional. For Acl validation
	 * @param returnImetadata : Boolean
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @return MResponseContentDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			contentId: String, 
			locale: String, 
			returnLinkedContents: Boolean, 
			returnLinkedCategories: Boolean, 
			returnThumbUrl: Boolean, 
			returnItags: Boolean, 
			returnImetadata: Boolean, 
			pkey: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(returnLinkedContents).foreach(s => params.add("returnLinkedContents", s))
		Option(returnLinkedCategories).foreach(s => params.add("returnLinkedCategories", s))
		Option(returnThumbUrl).foreach(s => params.add("returnThumbUrl", s))
		Option(returnItags).foreach(s => params.add("returnItags", s))
		Option(returnImetadata).foreach(s => params.add("returnImetadata", s))
		Option(pkey).foreach(s => params.add("pkey", s))
			val response : MResponseContentDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContentDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("content/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseContentDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * The content find by properties return a list of Contents, all information about Contents, only one
	 * Channel, and with the detail in one single locale.
	 * @param tokenId : String
	 * @param param : MContentfindByPropertiesReq
	 * @return MResponseContentFindByProperties
	*/
	def findByProperties(tokenId: String, 
			param: MContentfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentFindByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentFindByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseContentFindByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentFindByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentFindByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to remove the content's name,except and description for a specific locale (lang)
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param locale : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseContentRemoveLocale
	*/
	def removeContent4Locale(tokenId: String, 
			clientId: String, 
			contentId: String, 
			locale: String, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentRemoveLocale ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))  
			val response : MResponseContentRemoveLocale = if(this.resourceEndpoint == ""){
			
				new MResponseContentRemoveLocale()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("content/removeContent4Locale")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseContentRemoveLocale],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentRemoveLocale])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * Deprecated.
	 * @param tokenId : String
	 * @param param : MContentupdateAvailableSolutionsReq
	 * @return MResponseContentUpdate
	*/
	def updateAvailableSolutions(tokenId: String, 
			param: MContentupdateAvailableSolutionsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseContentUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updateAvailableSolutions")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Update content parameters.
	 * The " "contentValues" field of this web service works in “patch" mode: it means that each and
	 * everyone of the "contentValues" attributes you want to change must be included in the body of the
	 * request, those not included will not be updated.
	 * @param tokenId : String
	 * @param param : MContentupdateContentReq
	 * @return MResponseContentUpdate
	*/
	def updateContent(tokenId: String, 
			param: MContentupdateContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseContentUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updateContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to add a custom Player Embed Code for a specific content.
	 * @param tokenId : String
	 * @param param : MContentaddPlayerEmbedCodeReq
	 * @return MResponseContentUpdate
	*/
	def addPlayerEmbedCode(tokenId: String, 
			param: MContentaddPlayerEmbedCodeReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseContentUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/addPlayerEmbedCode")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to remove the custom Player Embed Code for a specific content.
	 * @param tokenId : String
	 * @param param : MContentremovePlayerEmbedCodeReq
	 * @return MResponseContentUpdate
	*/
	def removePlayerEmbedCode(tokenId: String, 
			param: MContentremovePlayerEmbedCodeReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseContentUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/removePlayerEmbedCode")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to update the custom Player Embed Code for a specific content. These information are used by
	 * the 4me Player for the content presentation.
	 * @param tokenId : String
	 * @param param : MContentupdatePlayerEmbedCodeReq
	 * @return MResponseContentUpdate
	*/
	def updatePlayerEmbedCode(tokenId: String, 
			param: MContentupdatePlayerEmbedCodeReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseContentUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updatePlayerEmbedCode")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * DEPRECATED
	 * @param tokenId : String
	 * @param param : MContentupdatePlayerEmbedCodesReq
	 * @return MResponseContentUpdate
	*/
	def updatePlayerEmbedCodes(tokenId: String, 
			param: MContentupdatePlayerEmbedCodesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseContentUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updatePlayerEmbedCodes")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to update the content's name,except and description for a specific locale (lang)
	 * @param tokenId : String
	 * @param param : MContentupdateContent4LocaleReq
	 * @return MResponseContentUpdateLocale
	*/
	def updateContent4Locale(tokenId: String, 
			param: MContentupdateContent4LocaleReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentUpdateLocale ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentUpdateLocale = if(this.resourceEndpoint == ""){
			
				new MResponseContentUpdateLocale()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updateContent4Locale")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentUpdateLocale],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentUpdateLocale])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MContentupdateContentPrettyIdReq
	 * @return MResponseContentPrettyId
	*/
	def updateContentPrettyId(tokenId: String, 
			param: MContentupdateContentPrettyIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentPrettyId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentPrettyId = if(this.resourceEndpoint == ""){
			
				new MResponseContentPrettyId()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updateContentPrettyId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentPrettyId],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentPrettyId])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * remove the prettyId for the given locale
	 * @param tokenId : String
	 * @param param : MContentremoveContentPrettyIdReq
	 * @return MResponseContentPrettyId
	*/
	def removeContentPrettyId(tokenId: String, 
			param: MContentremoveContentPrettyIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentPrettyId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentPrettyId = if(this.resourceEndpoint == ""){
			
				new MResponseContentPrettyId()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/removeContentPrettyId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentPrettyId],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentPrettyId])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * add a new prettyId to the content for the given locale.
	 * @param tokenId : String
	 * @param param : MContentaddContentPrettyIdReq
	 * @return MResponseContentPrettyId
	*/
	def addContentPrettyId(tokenId: String, 
			param: MContentaddContentPrettyIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentPrettyId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentPrettyId = if(this.resourceEndpoint == ""){
			
				new MResponseContentPrettyId()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/addContentPrettyId")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentPrettyId],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentPrettyId])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Verify whether a content prettyId is valid for a specific locale or not, and eventually suggest an
	 * alternative.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContentverifyContentPrettyIdReq
	 * @return MResponseContentVerifyPrettyId
	*/
	def verifyContentPrettyId(tokenId: String, 
			clientId: String, 
			param: MContentverifyContentPrettyIdReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentVerifyPrettyId ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentVerifyPrettyId = if(this.resourceEndpoint == ""){
			
				new MResponseContentVerifyPrettyId()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/verifyContentPrettyId")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentVerifyPrettyId],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentVerifyPrettyId])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Add a new element to the list of linkedContents.
	 * The linkedContens list is used to store the full list of links between contents (like playlist
	 * items, recommended contents or downloadable contents). For this reason it is necessary to specify
	 * the relation linkType.
	 * Constraints on linkType and ContentType.
	 * 
	 * * RECOMMENDED link is available only for VIDEO/AUDIO/IMAGE/OTHER/PLAYLIST contents
	 * * DOWNLOADABLE link is available only for VIDEO/AUDIO/IMAGE/OTHER contents
	 * * Only linkable contents can be added to another content (contens without property UNLINKABLE)
	 * 
	 * 
	 * 
	 * 
	 * @param tokenId : String
	 * @param param : MContentaddLinkedContentReq
	 * @return MResponseContent
	*/
	def addLinkedContent(tokenId: String, 
			param: MContentaddLinkedContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContent = if(this.resourceEndpoint == ""){
			
				new MResponseContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/addLinkedContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Add a list of new element to the list of linkedContents.
	 * The linkedContens list is used to store the full list of links between contents (like playlist
	 * items, recommended contents or downloadable contents). For this reason it is necessary to specify
	 * the relation linkType.
	 * Only linkable contents can be added to another content (contens without property UNLINKABLE)
	 * @param tokenId : String
	 * @param param : MContentaddLinkedContentsReq
	 * @return MResponseContent
	*/
	def addLinkedContents(tokenId: String, 
			param: MContentaddLinkedContentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContent = if(this.resourceEndpoint == ""){
			
				new MResponseContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/addLinkedContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * this service move a content in the linkedContents list from position "oldPosition" to "newPosition".
	 * @param tokenId : String
	 * @param param : MContentmoveLinkedContentReq
	 * @return MResponseContent
	*/
	def moveLinkedContent(tokenId: String, 
			param: MContentmoveLinkedContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContent = if(this.resourceEndpoint == ""){
			
				new MResponseContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/moveLinkedContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * the function removes from the list of linked Contents the elements matching the criteria
	 * @param tokenId : String
	 * @param param : MContentremoveLinkedContentsReq
	 * @return MResponseContent
	*/
	def removeLinkedContents(tokenId: String, 
			param: MContentremoveLinkedContentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContent = if(this.resourceEndpoint == ""){
			
				new MResponseContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/removeLinkedContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * used to mark if a content has been read or not by a user (the user who call the service)
	 * @param tokenId : String
	 * @param param : MContentupdateUserSpecificValuesReq
	 * @return MResponseContent
	*/
	def updateUserSpecificValues(tokenId: String, 
			param: MContentupdateUserSpecificValuesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseContent = if(this.resourceEndpoint == ""){
			
				new MResponseContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("content/updateUserSpecificValues")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}