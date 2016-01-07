package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.metadata.MResponseInsertMetadata
import it.newvision.nvp.xcontents.services.model.request.MMetadatainsertMetadataReq
import it.newvision.nvp.xcontents.services.model.metadata.MResponseMetadata
import it.newvision.nvp.xcontents.services.model.request.MMetadataremoveMetadataReq
import it.newvision.nvp.xcontents.services.model.request.MMetadataupdateMetadataReq
import it.newvision.nvp.xcontents.services.model.request.MMetadataupdateSingleMetadataReq
import it.newvision.nvp.xcontents.services.model.metadata.MResponseFindContentByMetadata
import it.newvision.nvp.xcontents.services.model.request.MMetadatafindContentsByMetadataReq
import it.newvision.nvp.xcontents.services.model.metadata.MResponseRemoveAllMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JMetadataClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Used to handle custom metadata in contents.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/metadata       </li>
 * </ul>
 */
class JMetadataClient(val resourceEndpoint:String) {

	/**
	 * insert one single entry to list of metadata linked to the content
	 * @param tokenId : String
	 * @param param : MMetadatainsertMetadataReq
	 * @return MResponseInsertMetadata
	*/
	def insertMetadata(tokenId: String, 
			param: MMetadatainsertMetadataReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseInsertMetadata ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseInsertMetadata = if(this.resourceEndpoint == ""){
			
				new MResponseInsertMetadata()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadata/insertMetadata")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseInsertMetadata],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseInsertMetadata])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove one single metadata entry linked to a content
	 * @param tokenId : String
	 * @param param : MMetadataremoveMetadataReq
	 * @return MResponseMetadata
	*/
	def removeMetadata(tokenId: String, 
			param: MMetadataremoveMetadataReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseMetadata ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadata = if(this.resourceEndpoint == ""){
			
				new MResponseMetadata()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadata/removeMetadata")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadata],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadata])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Update all content metadata list with the new given list.
	 * @param tokenId : String
	 * @param param : MMetadataupdateMetadataReq
	 * @return MResponseMetadata
	*/
	def updateMetadata(tokenId: String, 
			param: MMetadataupdateMetadataReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseMetadata ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadata = if(this.resourceEndpoint == ""){
			
				new MResponseMetadata()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadata/updateMetadata")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadata],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadata])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Update one single content metadata in the list.
	 * @param tokenId : String
	 * @param param : MMetadataupdateSingleMetadataReq
	 * @return MResponseMetadata
	*/
	def updateSingleMetadata(tokenId: String, 
			param: MMetadataupdateSingleMetadataReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseMetadata ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseMetadata = if(this.resourceEndpoint == ""){
			
				new MResponseMetadata()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadata/updateSingleMetadata")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseMetadata],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseMetadata])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Deprecated by JContent.findByProperties
	 * @param tokenId : String
	 * @param param : MMetadatafindContentsByMetadataReq
	 * @return MResponseFindContentByMetadata
	*/
	@Deprecated
	def findContentsByMetadata(tokenId: String, 
			param: MMetadatafindContentsByMetadataReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseFindContentByMetadata ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindContentByMetadata = if(this.resourceEndpoint == ""){
			
				new MResponseFindContentByMetadata()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("metadata/findContentsByMetadata")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindContentByMetadata],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindContentByMetadata])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * remove all Metadata entries linked to the content
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseRemoveAllMetadata
	*/
	def removeAllMetadata(tokenId: String, 
			clientId: String, 
			contentId: String, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRemoveAllMetadata ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMetadataClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))  
			val response : MResponseRemoveAllMetadata = if(this.resourceEndpoint == ""){
			
				new MResponseRemoveAllMetadata()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED	
				var wbuilder = webResource
					.path("metadata/removeAllMetadata")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseRemoveAllMetadata],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRemoveAllMetadata])
				}
				else {
				  throw e
				}
		  }
	
	}

}