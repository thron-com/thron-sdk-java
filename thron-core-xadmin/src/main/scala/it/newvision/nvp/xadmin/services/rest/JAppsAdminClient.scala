package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MResponseApp
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminaddGroupAppReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseSnippetDetail
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminaddSnippetReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminaddUserAppReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppDetail
import it.newvision.nvp.xadmin.services.model.request.MAppsAdmincreateReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminremoveReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminremoveGroupAppReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminremoveSnippetReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminupdateAppReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminremoveUserAppReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminupdateSnippetReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppNewKey
import it.newvision.nvp.xadmin.services.model.request.MAppsAdmingenerateKeyReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppKeyDetail
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminupdateKeyReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminremoveKeyReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminlistKeyReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JAppsAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is used to manage the APP (4ME Apps) properties.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xadmin/resources/appsadmin/  </li>
 * </ul>
 */
class JAppsAdminClient(val resourceEndpoint:String) {

	/**
	 * add the group to access the app.
	 * Can be invoked only by users with role  [APPID]_MANAGER 
	 * @param tokenId : String
	 * @param param : MAppsAdminaddGroupAppReq
	 * @return MResponseApp
	*/
	def addGroupApp(tokenId: String, 
			param: MAppsAdminaddGroupAppReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseApp ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseApp = if(this.resourceEndpoint == ""){
			
				new MResponseApp()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/addGroupApp")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseApp],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseApp])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * can be invoked only by user with role [APPID]_SNIPPET_MANAGER and for apps of type CUSTOM and
	 * subtype 4ME-WIDGET
	 * @param tokenId : String
	 * @param param : MAppsAdminaddSnippetReq
	 * @return MResponseSnippetDetail
	*/
	def addSnippet(tokenId: String, 
			param: MAppsAdminaddSnippetReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseSnippetDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseSnippetDetail = if(this.resourceEndpoint == ""){
			
				new MResponseSnippetDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/addSnippet")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseSnippetDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseSnippetDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * add the user to access the app.
	 * Can be invoked only by users with role [APPID]_MANAGER 
	 * @param tokenId : String
	 * @param param : MAppsAdminaddUserAppReq
	 * @return MResponseApp
	*/
	def addUserApp(tokenId: String, 
			param: MAppsAdminaddUserAppReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseApp ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseApp = if(this.resourceEndpoint == ""){
			
				new MResponseApp()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/addUserApp")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseApp],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseApp])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Create a new App.
	 * Can be invoked only by users with role CORE_MANAGE_APPS.
	 * The service add the roles:
	 * <ul>
	 * 	<li>[APPID]_MANAGER</li>
	 * </ul>
	 * <ul>
	 * 	<li>[APPID]_SNIPPET_MANAGER (Only for app custom)</li>
	 * </ul>
	 * to the app's owner
	 * @param tokenId : String
	 * @param param : MAppsAdmincreateReq
	 * @return MResponseAppDetail
	*/
	def create(tokenId: String, 
			param: MAppsAdmincreateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAppDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/create")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * remove the app, and clean up the setting in THRON.
	 * Can be invoked only by users with role [APPID]_MANAGER and by the owner
	 * @param tokenId : String
	 * @param param : MAppsAdminremoveReq
	 * @return MResponseApp
	*/
	def remove(tokenId: String, 
			param: MAppsAdminremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseApp ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseApp = if(this.resourceEndpoint == ""){
			
				new MResponseApp()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/remove")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseApp],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseApp])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * deny the group to access the app.
	 * Can be invoked only by users with role [APPID[_MANAGER
	 * @param tokenId : String
	 * @param param : MAppsAdminremoveGroupAppReq
	 * @return MResponseApp
	*/
	def removeGroupApp(tokenId: String, 
			param: MAppsAdminremoveGroupAppReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseApp ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseApp = if(this.resourceEndpoint == ""){
			
				new MResponseApp()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/removeGroupApp")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseApp],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseApp])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * remove a snippet linked to the app.
	 * <b>
	 * </b><b>Role valdation:</b>
	 * <ul>
	 * 	<li>Can be invoked only by users with role [APPID]_SNIPPET_MANAGER</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdminremoveSnippetReq
	 * @return MResponseApp
	*/
	def removeSnippet(tokenId: String, 
			param: MAppsAdminremoveSnippetReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseApp ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseApp = if(this.resourceEndpoint == ""){
			
				new MResponseApp()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/removeSnippet")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseApp],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseApp])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * update the App parameters
	 * 
	 * <b>Role valdation:</b>
	 * <ul>
	 * 	<li>Can be invoked only by users with roles [APPID]_MANAGER</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdminupdateAppReq
	 * @return MResponseAppDetail
	*/
	def updateApp(tokenId: String, 
			param: MAppsAdminupdateAppReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAppDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/updateApp")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * deny the user to access the app.
	 * <b>
	 * </b><b>Role valdation:</b>
	 * <ul>
	 * 	<li>Can be invoked only by users with roles [APPID]_MANAGER</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdminremoveUserAppReq
	 * @return MResponseApp
	*/
	def removeUserApp(tokenId: String, 
			param: MAppsAdminremoveUserAppReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseApp ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseApp = if(this.resourceEndpoint == ""){
			
				new MResponseApp()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/removeUserApp")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseApp],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseApp])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * update the snippet parameters.
	 * Can be invoked only by users with role [APPID]_SNIPPET_MANAGER
	 * @param tokenId : String
	 * @param param : MAppsAdminupdateSnippetReq
	 * @return MResponseSnippetDetail
	*/
	def updateSnippet(tokenId: String, 
			param: MAppsAdminupdateSnippetReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseSnippetDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseSnippetDetail = if(this.resourceEndpoint == ""){
			
				new MResponseSnippetDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/updateSnippet")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseSnippetDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseSnippetDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Generate a new appKey for the specified app.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>maximum 10 keys for each app.</li>
	 * </ul>
	 * 
	 * <b>Role valdation:</b>
	 * <ul>
	 * 	<li>Can be invoked only by users with role [APPID]_MANAGER</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAppsAdmingenerateKeyReq
	 * @return MResponseAppNewKey
	*/
	def generateKey(tokenId: String, 
			clientId: String, 
			param: MAppsAdmingenerateKeyReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAppNewKey ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppNewKey = if(this.resourceEndpoint == ""){
			
				new MResponseAppNewKey()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/generateKey")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppNewKey],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppNewKey])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Update the key for the specified app.
	 * 
	 * <b>Role valdation:</b>
	 * <ul>
	 * 	<li>Can be invoked only by users with role [APPID]_MANAGER</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAppsAdminupdateKeyReq
	 * @return MResponseAppKeyDetail
	*/
	def updateKey(tokenId: String, 
			clientId: String, 
			param: MAppsAdminupdateKeyReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAppKeyDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppKeyDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppKeyDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/updateKey")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppKeyDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppKeyDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove a specific appKey.
	 * 
	 * <b>Role valdation:</b>
	 * <ul>
	 * 	<li>Can be invoked only by users with role [APPID]_MANAGER</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAppsAdminremoveKeyReq
	 * @return MResponseApp
	*/
	def removeKey(tokenId: String, 
			clientId: String, 
			param: MAppsAdminremoveKeyReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseApp ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseApp = if(this.resourceEndpoint == ""){
			
				new MResponseApp()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/removeKey")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseApp],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseApp])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * List the available app Key for the given application.
	 * 
	 * <b>Role valdation:</b>
	 * <ul>
	 * 	<li>Can be invoked only by users with role [APPID]_MANAGER</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAppsAdminlistKeyReq
	 * @return MResponseAppKeyDetail
	*/
	def listKey(tokenId: String, 
			clientId: String, 
			param: MAppsAdminlistKeyReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAppKeyDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppKeyDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppKeyDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("appsadmin/listKey")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppKeyDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppKeyDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}