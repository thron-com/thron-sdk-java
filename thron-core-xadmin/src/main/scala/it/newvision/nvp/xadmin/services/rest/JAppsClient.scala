package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppDetail
import it.newvision.nvp.xadmin.services.model.request.MAppsappDetailReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppList
import it.newvision.nvp.xadmin.services.model.request.MAppsfindByPropertiesReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppSummaryList
import it.newvision.nvp.xadmin.services.model.request.MAppsappsListReq
import it.newvision.nvp.xadmin.services.model.request.MAppssuReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JAppsClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is used to manage an App properties.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xadmin/resources/apps</li>
 * </ul>
 */
class JAppsClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Authenticates an app, returning its detail, rootCategoryId, and a session tokenId.
	 * 
	 * Authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * @param appId : String
	 * @param appKey : String
	 * Optional.
	 * The personal key used to authenticate the user. Some apps do not need secure authentication wih
	 * appkey
	 * @return MResponseAppDetail
	*/
	def loginApp(tokenId: String, 
			clientId: String, 
			appId: String, 
			appKey: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseAppDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(appId).foreach(s => params.add("appId", s))
		Option(appKey).foreach(s => params.add("appKey", s))  
			val response : MResponseAppDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppDetail()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("apps/loginApp")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseAppDetail],params)
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
	 * Returns the detail of an app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER or [APPID]_APP_EDITOR or CORE_MANAGE_APPS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsappDetailReq
	 * @return MResponseAppDetail
	*/
	def appDetail(tokenId: String, 
			param: MAppsappDetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseAppDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAppDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("apps/appDetail")
				
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
	 * Returns the list of apps matching provided criteria.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>disguiseData is returned only if user has any role for the app.</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_APPS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsfindByPropertiesReq
	 * @return MResponseAppList
	*/
	def findByProperties(tokenId: String, 
			param: MAppsfindByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseAppList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppList = if(this.resourceEndpoint == ""){
			
				new MResponseAppList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("apps/findByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns summary details for a list of apps matching provided criteria.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>Can be invoked by any platform users.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsappsListReq
	 * @return MResponseAppSummaryList
	*/
	def appsList(tokenId: String, 
			param: MAppsappsListReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseAppSummaryList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsClient.client.resource(this.resourceEndpoint)
			val response : MResponseAppSummaryList = if(this.resourceEndpoint == ""){
			
				new MResponseAppSummaryList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("apps/appsList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAppSummaryList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAppSummaryList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Impersonates a platform user (sudo function), returning an access token of the user.
	 * 
	 * Authentication token is not required (X-TOKENID).
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>disguiseData must allow app to impersonate the user</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>can be invoked only by apps with canDisguise attribute enabled.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppssuReq
	 * @return String
	*/
	def su(tokenId: String, 
			param: MAppssuReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAppsClient.client.resource(this.resourceEndpoint)
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("apps/su")
				
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[String],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[String])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}