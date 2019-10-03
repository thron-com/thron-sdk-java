package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedTemplateDetail
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateaddRolesReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedTemplateVersionDetail
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplatecreateVersionReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateinsertReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedTemplateList
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplatelistReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbedTemplateListVersion
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplatelistVersionsReq
import it.newvision.nvp.xcontents.services.model.embed.MResponsePlayerEmbed
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateremoveReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateremoveRolesReq
import it.newvision.nvp.xcontents.services.model.request.MPlayerEmbedTemplateupdateReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPlayerEmbedTemplateClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to manage Player Embed Templates.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/playerembedtemplate</li>
 * </ul>
 */
class JPlayerEmbedTemplateClient(val resourceEndpoint:String) {

	/**
	 * Adds a role to a user or group for a Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * </ul>
	 * <ul>
	 * 	<li>can be invoked only by template managers</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplateaddRolesReq
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	def addRoles(tokenId: String, 
			clientId: String, 
			id: String, 
			param: MPlayerEmbedTemplateaddRolesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayerEmbedTemplateDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedTemplateClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedTemplateDetail = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedTemplateDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedtemplate/addRoles")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedTemplateDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedTemplateDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Creates a version of a Player Embed Template.
	 * The service increments the last version of the template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * 	<li>can be invoked only by template managers or editors</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplatecreateVersionReq
	 * @return MResponsePlayerEmbedTemplateVersionDetail
	*/
	def createVersion(tokenId: String, 
			clientId: String, 
			id: String, 
			param: MPlayerEmbedTemplatecreateVersionReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayerEmbedTemplateVersionDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedTemplateClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedTemplateVersionDetail = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedTemplateVersionDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedtemplate/createVersion")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedTemplateVersionDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedTemplateVersionDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the detail of a Player Embed Template.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_SHARE_CONTENTS_BY_EMAIL or 4ME_SHARE_CONTENTS_BY_EMBED or 4ME_SHARE_CONTENTS_BY_SOCIAL or
	 * 4ME_SHARE_CONTENTS_BY_LINK or 4ME_SHARE_CONTENTS_TO_USERS or 4ME_MANAGE_PLAYER_EMBED_VERSIONS or
	 * 4ME_MANAGE_PLAYER_EMBED_TEMPLATES role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param version : Integer
	 * Optional. If empty the service return the last version
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			id: String, 
			version: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayerEmbedTemplateDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedTemplateClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(version).foreach(s => params.add("version", s))
			val response : MResponsePlayerEmbedTemplateDetail = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedTemplateDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("playerembedtemplate/detail")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponsePlayerEmbedTemplateDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedTemplateDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Creates a custom Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedTemplateinsertReq
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MPlayerEmbedTemplateinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayerEmbedTemplateDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedTemplateClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedTemplateDetail = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedTemplateDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedtemplate/insert")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedTemplateDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedTemplateDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns a list of Player Embed Templates matching provided criteria.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_PLAYER_EMBED_VERSIONS or
	 * 4ME_SHARE_CONTENTS_BY_EMAIL or 4ME_SHARE_CONTENTS_BY_EMBED or 4ME_SHARE_CONTENTS_BY_SOCIAL or
	 * 4ME_SHARE_CONTENTS_BY_LINK or 4ME_SHARE_CONTENTS_TO_USERS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MPlayerEmbedTemplatelistReq
	 * @return MResponsePlayerEmbedTemplateList
	*/
	def list(tokenId: String, 
			clientId: String, 
			param: MPlayerEmbedTemplatelistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayerEmbedTemplateList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedTemplateClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedTemplateList = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedTemplateList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedtemplate/list")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedTemplateList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedTemplateList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the list of versions for a Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY  or
	 * 4ME_MANAGE_PLAYER_EMBED_VERSIONS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplatelistVersionsReq
	 * @return MResponsePlayerEmbedTemplateListVersion
	*/
	def listVersions(tokenId: String, 
			clientId: String, 
			id: String, 
			param: MPlayerEmbedTemplatelistVersionsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayerEmbedTemplateListVersion ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedTemplateClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedTemplateListVersion = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedTemplateListVersion()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedtemplate/listVersions")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedTemplateListVersion],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedTemplateListVersion])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes a custom Player Embed Template .
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * </ul>
	 * <ul>
	 * 	<li>Can be invoked only by template managers</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param templateId : String
	 * The Player Embed Template Id
	 * @param param : MPlayerEmbedTemplateremoveReq
	 * @return MResponsePlayerEmbed
	*/
	def remove(tokenId: String, 
			clientId: String, 
			templateId: String, 
			param: MPlayerEmbedTemplateremoveReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayerEmbed ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedTemplateClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbed = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbed()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedtemplate/remove")
					.path(clientId.toString)
		.path(templateId.toString)
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
	 * Removes a role from a user or group for a Player Embed  Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * </ul>
	 * <ul>
	 * 	<li>can be invoked only by template managers</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplateremoveRolesReq
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	def removeRoles(tokenId: String, 
			clientId: String, 
			id: String, 
			param: MPlayerEmbedTemplateremoveRolesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayerEmbedTemplateDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedTemplateClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedTemplateDetail = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedTemplateDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedtemplate/removeRoles")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedTemplateDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedTemplateDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates a Player Embed Template.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>4ME_MANAGE_PLAYER_EMBED_TEMPLATES or 4ME_MANAGE_CLIENT_ALL_STYLES_PROPERTY role</li>
	 * 	<li>can be invoked only by template managers or editors</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param id : String
	 * @param param : MPlayerEmbedTemplateupdateReq
	 * @return MResponsePlayerEmbedTemplateDetail
	*/
	def update(tokenId: String, 
			clientId: String, 
			id: String, 
			param: MPlayerEmbedTemplateupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayerEmbedTemplateDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlayerEmbedTemplateClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayerEmbedTemplateDetail = if(this.resourceEndpoint == ""){
			
				new MResponsePlayerEmbedTemplateDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playerembedtemplate/update")
					.path(clientId.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayerEmbedTemplateDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayerEmbedTemplateDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}