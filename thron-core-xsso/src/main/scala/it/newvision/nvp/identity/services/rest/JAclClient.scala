package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.acl.MResponseAclDetail
import it.newvision.nvp.identity.services.model.request.MAclgetAclDetailReq
import it.newvision.nvp.identity.services.model.acl.MResponseAclUpdate
import it.newvision.nvp.identity.services.model.request.MAcladdAclRulesReq
import it.newvision.nvp.identity.services.model.acl.MResponseAclVerify
import it.newvision.nvp.identity.services.model.request.MAclverifyAclRuleReq
import it.newvision.nvp.identity.services.model.request.MAcldeleteAclRulesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JAclClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to manage Users and Groups Access Control List.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.com/api/xsso/resources/acl</li>
 * </ul>
 */
class JAclClient(val resourceEndpoint:String) {

	/**
	 * return the acl information for a given target object and class.
	 * The service return a list of AclRuleInfo where is present the displayName of the target Object
	 * (user fullname or goup name) to avoid any lookup.
	 * The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS
	 * @param tokenId : String
	 * @param param : MAclgetAclDetailReq
	 * @return MResponseAclDetail
	*/
	def getAclDetail(tokenId: String, 
			param: MAclgetAclDetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclDetail = if(this.resourceEndpoint == ""){
			
				new MResponseAclDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("acl/getAclDetail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAclDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAclDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS
	 * 
	 * <b>Constraints: </b>
	 * <ul>
	 * 	<li>A user can have Acl rules for a maximum of 100 distinct target</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAcladdAclRulesReq
	 * @return MResponseAclUpdate
	*/
	def addAclRules(tokenId: String, 
			param: MAcladdAclRulesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseAclUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("acl/addAclRules")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAclUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAclUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS
	 * @param tokenId : String
	 * @param param : MAclverifyAclRuleReq
	 * @return MResponseAclVerify
	*/
	def verifyAclRule(tokenId: String, 
			param: MAclverifyAclRuleReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclVerify ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclVerify = if(this.resourceEndpoint == ""){
			
				new MResponseAclVerify()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("acl/verifyAclRule")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAclVerify],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAclVerify])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service can be invoked only by users with roles CORE_MANAGE_USERS, CORE_MANAGE_OWN_USER_GUESTS
	 * @param tokenId : String
	 * @param param : MAcldeleteAclRulesReq
	 * @return MResponseAclUpdate
	*/
	def deleteAclRules(tokenId: String, 
			param: MAcldeleteAclRulesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseAclUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("acl/deleteAclRules")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAclUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAclUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}