package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclUpdate
import it.newvision.nvp.xcontents.services.model.request.MAclInverseaddAclRulesReq
import it.newvision.nvp.xcontents.services.model.request.MAclInversedeleteAclRulesReq
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclDetailInverse
import it.newvision.nvp.xcontents.services.model.request.MAclInversegetAclDetailReq
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclVerify
import it.newvision.nvp.xcontents.services.model.request.MAclInverseverifyAclRuleReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JAclInverseClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Deprecated. Only for 4x version.
 * Service used to manage Content/Categories ACL
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/xcontents/resources/aclinverse/</li>
 * </ul>
 */
class JAclInverseClient(val resourceEndpoint:String) {

	/**
	 * used to add new acl rules (enabled or disabled).
	 * if the user add an existing rule, the service doesn't return an error, but simply override the
	 * existing one.
	 * To disable an existing acl simply add the rule to MAclRuleInverse.disabledRulesinverse list.
	 * This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target
	 * object.
	 * For example:
	 * * users with SHARED_BY acl on the content, can add other acls to the content
	 * * users with MODIFIED_BY acl on the category, can add other acls to the category
	 * @param tokenId : String
	 * @param param : MAclInverseaddAclRulesReq
	 * @return MResponseAclUpdate
	*/
	def addAclRules(tokenId: String, 
			param: MAclInverseaddAclRulesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclInverseClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseAclUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("aclinverse/addAclRules")
				
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
	 * Used to remove acl rules from the target object.
	 * This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target
	 * object.
	 * For example:
	 * * users with SHARED_BY acl on the content, can remove other acls to the content
	 * * users with MODIFIED_BY acl on the category, can remove other acls to the category
	 * @param tokenId : String
	 * @param param : MAclInversedeleteAclRulesReq
	 * @return MResponseAclUpdate
	*/
	def deleteAclRules(tokenId: String, 
			param: MAclInversedeleteAclRulesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclInverseClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseAclUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("aclinverse/deleteAclRules")
				
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
	 * return the acl information for a given target object and class.
	 * The service return a list of AclRuleInfo where is present the displayName of the target Object to
	 * avoid any lookup.
	 * 
	 * The service can be invoked by users with SHARED_BY/MODIFY_BY acl on the target object.
	 * @param tokenId : String
	 * @param param : MAclInversegetAclDetailReq
	 * @return MResponseAclDetailInverse
	*/
	def getAclDetail(tokenId: String, 
			param: MAclInversegetAclDetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclDetailInverse ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclInverseClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclDetailInverse = if(this.resourceEndpoint == ""){
			
				new MResponseAclDetailInverse()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("aclinverse/getAclDetail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAclDetailInverse],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAclDetailInverse])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to verify a specific acl rule in the target Object.
	 * The service can be invoked by users with SHARED_BY/MODIFY_BY acl on the target object.
	 * @param tokenId : String
	 * @param param : MAclInverseverifyAclRuleReq
	 * @return MResponseAclVerify
	*/
	def verifyAclRule(tokenId: String, 
			param: MAclInverseverifyAclRuleReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclVerify ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclInverseClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclVerify = if(this.resourceEndpoint == ""){
			
				new MResponseAclVerify()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("aclinverse/verifyAclRule")
				
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

}