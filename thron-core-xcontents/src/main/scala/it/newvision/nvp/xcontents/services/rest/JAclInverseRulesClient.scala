package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclInverseList
import it.newvision.nvp.xcontents.services.model.request.MAclInverseRuleslistReq
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclInverseUpdate
import it.newvision.nvp.xcontents.services.model.request.MAclInverseRulesinsertReq
import it.newvision.nvp.xcontents.services.model.request.MAclInverseRulesremoveReq
import it.newvision.nvp.xcontents.services.model.acl.MResponseAclInverseVerify
import it.newvision.nvp.xcontents.services.model.request.MAclInverseRulesverifyReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JAclInverseRulesClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to manage Content/Category Acl.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/xcontents/resources/aclinverserules/</li>
 * </ul>
 */
class JAclInverseRulesClient(val resourceEndpoint:String) {

	/**
	 * return the acl information for a given target object and class.
	 * The service return a list of AclRuleInfo where is present the displayName of the target Object to
	 * avoid any lookup.
	 * 
	 * The service can be invoked by users with SHARED_BY/MODIFIED_BY acl on the target object.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param targetObjId : String
	 * @param param : MAclInverseRuleslistReq
	 * @return MResponseAclInverseList
	*/
	def list(tokenId: String, 
			clientId: String, 
			targetObjId: String, 
			param: MAclInverseRuleslistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclInverseList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclInverseRulesClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclInverseList = if(this.resourceEndpoint == ""){
			
				new MResponseAclInverseList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("aclinverserules/list")
					.path(clientId.toString)
		.path(targetObjId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAclInverseList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAclInverseList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to add new acl rules (enabled or disabled).
	 * If the user add an existing rule, the service doesn't return an error, but simply override the
	 * existing one.
	 * To disable an existing acl simply add the rule to MAclRuleInverse.disabledRulesinverse list.
	 * This service can be invoked only by users with SHARED_BY/MODIFIED_BY inverse acl on the target
	 * object.
	 * For example:
	 * * users with SHARED_BY acl on the content, can add other acls to the content
	 * * users with MODIFIED_BY acl on the category, can add other acls to the category
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAclInverseRulesinsertReq
	 * @return MResponseAclInverseUpdate
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MAclInverseRulesinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclInverseUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclInverseRulesClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclInverseUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseAclInverseUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("aclinverserules/insert")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAclInverseUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAclInverseUpdate])
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
	 * @param clientId : String
	 * @param param : MAclInverseRulesremoveReq
	 * @return MResponseAclInverseUpdate
	*/
	def remove(tokenId: String, 
			clientId: String, 
			param: MAclInverseRulesremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclInverseUpdate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclInverseRulesClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclInverseUpdate = if(this.resourceEndpoint == ""){
			
				new MResponseAclInverseUpdate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("aclinverserules/remove")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAclInverseUpdate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAclInverseUpdate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to verify a specific acl rule in the target Object.
	 * The service can be invoked by users with SHARED_BY/MODIFIED_BY acl on the target object.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAclInverseRulesverifyReq
	 * @return MResponseAclInverseVerify
	*/
	def verify(tokenId: String, 
			clientId: String, 
			param: MAclInverseRulesverifyReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAclInverseVerify ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JAclInverseRulesClient.client.resource(this.resourceEndpoint)
			val response : MResponseAclInverseVerify = if(this.resourceEndpoint == ""){
			
				new MResponseAclInverseVerify()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("aclinverserules/verify")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAclInverseVerify],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAclInverseVerify])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}