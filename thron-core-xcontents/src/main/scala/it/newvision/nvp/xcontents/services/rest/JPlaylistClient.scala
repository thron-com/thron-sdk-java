package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.playlist.MResponsePlayListDetail
import it.newvision.nvp.xcontents.services.model.request.MPlaylistdetailReq
import it.newvision.nvp.xcontents.services.model.playlist.MResponsePlayList
import it.newvision.nvp.xcontents.services.model.request.MPlaylistupdateReq
import it.newvision.nvp.xcontents.services.model.request.MPlaylistaddContentsInQueueReq
import it.newvision.nvp.xcontents.services.model.request.MPlaylistaddContentsReq
import it.newvision.nvp.xcontents.services.model.request.MPlaylistmoveContentInListReq
import it.newvision.nvp.xcontents.services.model.request.MPlaylistremoveContentFromListReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPlaylistClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service provides a set of functions to handle the list of contents used inside
 * a playlist or slideshow. These service are optimised to handle a high number of
 * elements linked to a playlist. The linked contents list return only the
 * xcontentId information, and to get the other content metadata like name and
 * description is necessary to query the Content.findbyproperties function.
 * For performance reason the linkedcontents list is not verified so, if the
 * client create a playlist content with a list invalid xcontentsId, the platform
 * do not verify and the detail function return exactly the same list.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/playlist</li>
 * </ul>
 */
class JPlaylistClient(val resourceEndpoint:String) {

	/**
	 * Returns a playlist content detail, complete with the list of linkedContents.
	 * @param tokenId : String
	 * @param param : MPlaylistdetailReq
	 * @return MResponsePlayListDetail
	*/
	def detail(tokenId: String, 
			param: MPlaylistdetailReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayListDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlaylistClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayListDetail = if(this.resourceEndpoint == ""){
			
				new MResponsePlayListDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playlist/detail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayListDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayListDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Updates the linkedContents value of a playlist content.
	 * @param tokenId : String
	 * @param param : MPlaylistupdateReq
	 * @return MResponsePlayList
	*/
	def update(tokenId: String, 
			param: MPlaylistupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlaylistClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayList = if(this.resourceEndpoint == ""){
			
				new MResponsePlayList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playlist/update")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Adds a content to the linkedContents of a playlist content.
	 * @param tokenId : String
	 * @param param : MPlaylistaddContentsInQueueReq
	 * @return MResponsePlayList
	*/
	def addContentsInQueue(tokenId: String, 
			param: MPlaylistaddContentsInQueueReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlaylistClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayList = if(this.resourceEndpoint == ""){
			
				new MResponsePlayList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playlist/addContentsInQueue")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Adds a list of content to the linkedContents of a playlist content.
	 * @param tokenId : String
	 * @param param : MPlaylistaddContentsReq
	 * @return MResponsePlayList
	*/
	def addContents(tokenId: String, 
			param: MPlaylistaddContentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlaylistClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayList = if(this.resourceEndpoint == ""){
			
				new MResponsePlayList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playlist/addContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Moves a content among the linkedContents of a playlist content.
	 * @param tokenId : String
	 * @param param : MPlaylistmoveContentInListReq
	 * @return MResponsePlayList
	*/
	def moveContentInList(tokenId: String, 
			param: MPlaylistmoveContentInListReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlaylistClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayList = if(this.resourceEndpoint == ""){
			
				new MResponsePlayList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playlist/moveContentInList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes a content from the linkedContents of a playlist content.
	 * @param tokenId : String
	 * @param param : MPlaylistremoveContentFromListReq
	 * @return MResponsePlayList
	*/
	def removeContentFromList(tokenId: String, 
			param: MPlaylistremoveContentFromListReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPlaylistClient.client.resource(this.resourceEndpoint)
			val response : MResponsePlayList = if(this.resourceEndpoint == ""){
			
				new MResponsePlayList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("playlist/removeContentFromList")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponsePlayList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponsePlayList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}