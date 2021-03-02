package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseCreateMediaContent
import it.newvision.nvp.xadmin.services.model.request.MMediaContentAdmincreateMediaContentReq
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseFindMediaContent
import it.newvision.nvp.xadmin.services.model.request.MMediaContentAdminfindMediaContentByPropertiesReq
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseUpdateMediaContent
import it.newvision.nvp.xadmin.services.model.request.MMediaContentAdminupdateMediaContentReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JMediaContentAdminClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * DEPRECATED
 */
class JMediaContentAdminClient(val resourceEndpoint:String, defaultHeader:Option[scala.collection.Map[String,String]]=None) {

	/**
	 * @param tokenId : String
	 * @param param : MMediaContentAdmincreateMediaContentReq
	 * @return MResponseCreateMediaContent
	*/
	def createMediaContent(tokenId: String, 
			param: MMediaContentAdmincreateMediaContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseCreateMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMediaContentAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseCreateMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseCreateMediaContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("mediacontentadmin/createMediaContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCreateMediaContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCreateMediaContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * return the list of media contents: the list of published contents, or the contents are being
	 * ingested or packaged in the system.
	 * Attention!! the service is not filtered by ACL
	 * @param tokenId : String
	 * @param param : MMediaContentAdminfindMediaContentByPropertiesReq
	 * @return MResponseFindMediaContent
	*/
	def findMediaContentByProperties(tokenId: String, 
			param: MMediaContentAdminfindMediaContentByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseFindMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMediaContentAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseFindMediaContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("mediacontentadmin/findMediaContentByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindMediaContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindMediaContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * service used to update a mediaContent object. The service performa a punctual update only on
	 * MMediaContent.creationDate, MMediaContent.sourceFiles, MMediaContent.author
	 * @param tokenId : String
	 * @param param : MMediaContentAdminupdateMediaContentReq
	 * @return MResponseUpdateMediaContent
	*/
	def updateMediaContent(tokenId: String, 
			param: MMediaContentAdminupdateMediaContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=defaultHeader):MResponseUpdateMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMediaContentAdminClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdateMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseUpdateMediaContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("mediacontentadmin/updateMediaContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdateMediaContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdateMediaContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}