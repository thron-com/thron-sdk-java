package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseDetailMediaContent
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseFindContents
import it.newvision.nvp.xadmin.services.model.request.MMediaContentfindContentsByPropertiesReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JMediaContentClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * DEPRECATED by xcontents JContent
 */
class JMediaContentClient(val resourceEndpoint:String) {

	/**
	 * Deprecated by <b>[xcontents] JContent.detail</b>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param mediaContentId : String
	 * Optional. Is required one of mediaContenId,xcontentId or xpublisherId
	 * @param xcontentId : String
	 * Optional. Is required one of mediaContenId,xcontentId or xpublisherId
	 * @param xpublisherId : String
	 * Optional. Is required one of mediaContenId,xcontentId or xpublisherId
	 * @return MResponseDetailMediaContent
	*/
	def detailMediaContent(tokenId: String, 
			clientId: String, 
			mediaContentId: String, 
			xcontentId: String, 
			xpublisherId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDetailMediaContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMediaContentClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(mediaContentId).foreach(s => params.add("mediaContentId", s))
		Option(xcontentId).foreach(s => params.add("xcontentId", s))
		Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
			val response : MResponseDetailMediaContent = if(this.resourceEndpoint == ""){
			
				new MResponseDetailMediaContent()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("mediacontent/detailMediaContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDetailMediaContent])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDetailMediaContent])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Deprecated by <b>[xcontents] JContent.findByProperties</b>
	 * @param tokenId : String
	 * @param param : MMediaContentfindContentsByPropertiesReq
	 * @return MResponseFindContents
	*/
	def findContentsByProperties(tokenId: String, 
			param: MMediaContentfindContentsByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseFindContents ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JMediaContentClient.client.resource(this.resourceEndpoint)
			val response : MResponseFindContents = if(this.resourceEndpoint == ""){
			
				new MResponseFindContents()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("mediacontent/findContentsByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseFindContents],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseFindContents])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}