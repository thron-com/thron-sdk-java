package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedCodeDetail
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodeinsertReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbed
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCoderemoveReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedCodeList
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodelistReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodeupdateReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedCodeUpdateTemplate
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodeupdateTemplateReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedCodesyncReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPlayerEmbedCodeClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to manage Player Embed Codes.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/playerembedcode</li>
 * </ul>
 */
class JPlayerEmbedCodeClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * Adds a custom Player Embed Code for a content or category.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>SHARE ACL on the content or category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodeinsertReq
	 * @return MResponsePlayerEmbedCodeDetail
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MPlayerEmbedCodeinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePlayerEmbedCodeDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedCodeClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedCodeDetail = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedCodeDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedcode/insert")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedCodeDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedCodeDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes a custom Player Embed Code.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>SHARE ACL on the content or category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCoderemoveReq
	 * @return MResponsePlayerEmbed
	*/
	def remove(tokenId: String, 
			clientId: String, 
			param: MPlayerEmbedCoderemoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePlayerEmbed ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedCodeClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbed = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbed()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedcode/remove")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbed],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbed])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns a list of Player Embed Codes matching provided criteria, sorted by creation date.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>SHARE ACL on the content or category, if entity is defined</li>
	 * 	<li>4ME_USE_CONTENTS if entity is not defined or else 4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodelistReq
	 * @return MResponsePlayerEmbedCodeList
	*/
	def list(tokenId: String, 
			clientId: String, 
			param: MPlayerEmbedCodelistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePlayerEmbedCodeList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedCodeClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedCodeList = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedCodeList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedcode/list")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedCodeList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedCodeList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates a custom Player Embed Code for a content or category. These information are used by the
	 * Player for content presentation.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_USE_CONTENTS role</li>
	 * 	<li>SHARE ACL on the content or category</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodeupdateReq
	 * @return MResponsePlayerEmbedCodeDetail
	*/
	def update(tokenId: String, 
			clientId: String, 
			param: MPlayerEmbedCodeupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePlayerEmbedCodeDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedCodeClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedCodeDetail = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedCodeDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedcode/update")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedCodeDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedCodeDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates a custom Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodeupdateTemplateReq
	 * @return MResponsePlayerEmbedCodeUpdateTemplate
	*/
	def updateTemplate(tokenId: String, 
			clientId: String, 
			param: MPlayerEmbedCodeupdateTemplateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePlayerEmbedCodeUpdateTemplate ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedCodeClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedCodeUpdateTemplate = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedCodeUpdateTemplate()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedcode/updateTemplate")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedCodeUpdateTemplate],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedCodeUpdateTemplate])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates Player Embed Codes bumping template version to the latest value.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_VERSIONS role or (4ME_MANAGE_PLAYER_EMBED_TEMPLATES role and user is
	 * template's manager or editor)</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedCodesyncReq
	 * @return MResponsePlayerEmbed
	*/
	def sync(tokenId: String, 
			clientId: String, 
			param: MPlayerEmbedCodesyncReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponsePlayerEmbed ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedCodeClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbed = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbed()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedcode/sync")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbed],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbed])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}