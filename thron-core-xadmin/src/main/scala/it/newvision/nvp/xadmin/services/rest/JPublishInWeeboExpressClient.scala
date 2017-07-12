package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MResponsePublishContent
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishAudioReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishImageReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishPlayListReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishLiveEventReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishVideoReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishDocumentReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishPageletReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishProgramReq
import it.newvision.nvp.xadmin.services.model.request.MPublishInWeeboExpresspublishContentInChannelsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPublishInWeeboExpressClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service provides a set of function to publish a content in one single step
 * on the platform. All methods are asynchronous and specialized over the content
 * type (video, audio, image...). The service offers the ability to publish
 * content to the platform, passing in a single step the metadata, the source file
 * and the published channel. The source file must be added to the platform using
 * the JRepository services (xpackager).
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xadmin/resources/publishinweeboexpress</li>
 * </ul>
 */
class JPublishInWeeboExpressClient(val resourceEndpoint:String) {

	/**
	 * Create a new audio content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishAudioReq
	 * @return MResponsePublishContent
	*/
	def publishAudio(tokenId: String, 
			param: MPublishInWeeboExpresspublishAudioReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishInWeeboExpressClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishinweeboexpress/publishAudio")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Create a new image content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishImageReq
	 * @return MResponsePublishContent
	*/
	def publishImage(tokenId: String, 
			param: MPublishInWeeboExpresspublishImageReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishInWeeboExpressClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishinweeboexpress/publishImage")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Create a new playlist content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishPlayListReq
	 * @return MResponsePublishContent
	*/
	def publishPlayList(tokenId: String, 
			param: MPublishInWeeboExpresspublishPlayListReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishInWeeboExpressClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishinweeboexpress/publishPlayList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishLiveEventReq
	 * @return MResponsePublishContent
	*/
	def publishLiveEvent(tokenId: String, 
			param: MPublishInWeeboExpresspublishLiveEventReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishInWeeboExpressClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishinweeboexpress/publishLiveEvent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Create a new video content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishVideoReq
	 * @return MResponsePublishContent
	*/
	def publishVideo(tokenId: String, 
			param: MPublishInWeeboExpresspublishVideoReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishInWeeboExpressClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishinweeboexpress/publishVideo")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Create a new generic content (zip,docs,txt... files)
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishDocumentReq
	 * @return MResponsePublishContent
	*/
	def publishDocument(tokenId: String, 
			param: MPublishInWeeboExpresspublishDocumentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishInWeeboExpressClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishinweeboexpress/publishDocument")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Create a new pagelet content
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishPageletReq
	 * @return MResponsePublishContent
	*/
	def publishPagelet(tokenId: String, 
			param: MPublishInWeeboExpresspublishPageletReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishInWeeboExpressClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishinweeboexpress/publishPagelet")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Deprecated
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishProgramReq
	 * @return MResponsePublishContent
	*/
	def publishProgram(tokenId: String, 
			param: MPublishInWeeboExpresspublishProgramReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishInWeeboExpressClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishinweeboexpress/publishProgram")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * This service is used to publish a content in different channels or using a specific profile (The
	 * profile define a collection of channes for a given content type).
	 * The service return an error if the specified channels are not available for the selected content,
	 * but  can be used to adjust a content to a specific profile, publishing the content on the missing
	 * channels
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>the service can be invoked only by platform users</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MPublishInWeeboExpresspublishContentInChannelsReq
	 * @return MResponsePublishContent
	*/
	def publishContentInChannels(tokenId: String, 
			param: MPublishInWeeboExpresspublishContentInChannelsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePublishContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublishInWeeboExpressClient.client.resource(this.resourceEndpoint)
			val response : MResponsePublishContent = if(this.resourceEndpoint == ""){
			
				new MResponsePublishContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("publishinweeboexpress/publishContentInChannels")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePublishContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePublishContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}