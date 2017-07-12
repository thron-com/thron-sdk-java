package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.sync.MResponseContentLastUpdated
import it.newvision.nvp.webtv.services.model.request.MSynccontentsReq
import it.newvision.nvp.webtv.services.model.request.MSynclastUpdatedContentsReq
import it.newvision.nvp.webtv.services.model.sync.MResponseUpdatedContent
import it.newvision.nvp.webtv.services.model.request.MSyncupdatedContentReq
import it.newvision.nvp.webtv.services.model.sync.MResponseExport
import it.newvision.nvp.webtv.services.model.request.MSyncexportReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JSyncClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used for integration with external systems.
 * The purpose of the service is to provide a list of changes that have been
 * occurred in the platform in such a way to maintain synchronized an external
 * system.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/sync</li>
 * </ul>
 */
class JSyncClient(val resourceEndpoint:String) {

	/**
	 * Deprecated by JSync.updatedContents
	 * 
	 * The service returns the list of contents modified inside a specified date range.
	 * The response provides all metadata information and the list of ids (contents.removed) of the
	 * contents removed after that date. The service return also the deliveryInformation with the content
	 * urls and thumbnail.
	 * The service provide all contents without ACL restrictions.
	 * 
	 * Suggested parameters:
	 * <ul>
	 * 	<li>fromDate = now- 10minutes</li>
	 * 	<li>toDate = "now" -1 minute</li>
	 * </ul>
	 * Service call frequency: the service should be called every 2 minutes.
	 * @param tokenId : String
	 * @param param : MSynccontentsReq
	 * @return MResponseContentLastUpdated
	*/
	def contents(tokenId: String, 
			param: MSynccontentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentLastUpdated ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSyncClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentLastUpdated = if(this.resourceEndpoint == ""){
			
				new MResponseContentLastUpdated()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sync/contents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentLastUpdated],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentLastUpdated])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Deprecated by JSync.updatedContents
	 * 
	 * The service returns the list of contents modified inside a specified date range (only for IMAGE,
	 * OTHER, DOCUMENT, PLAYLIST, AUDIO, VIDEO content Type).
	 * The response provides all metadata information and the list of ids (contentsRemoved) of the
	 * contents removed after that date. The service return also the deliveryInformation with the content
	 * url and the list of thumbnails.
	 * The service does not return the list of comments linked to the content.
	 * @param tokenId : String
	 * @param param : MSynclastUpdatedContentsReq
	 * @return MResponseContentLastUpdated
	*/
	@Deprecated
	def lastUpdatedContents(tokenId: String, 
			param: MSynclastUpdatedContentsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentLastUpdated ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSyncClient.client.resource(this.resourceEndpoint)
			val response : MResponseContentLastUpdated = if(this.resourceEndpoint == ""){
			
				new MResponseContentLastUpdated()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sync/lastUpdatedContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContentLastUpdated],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentLastUpdated])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * The service returns the list of content modified inside the specified date range.
	 * The response provides all metadata information and the list of ids (contents.removed) of the
	 * contents removed within the date range.
	 * The service can return for each content the deliveryInfo (with the content urls and thumbnail), the
	 * linked categories and the itagDefinitions.
	 * The resultset is paginated (max page size is 200 elements), after the 1st call the service return a
	 * "nextPage" identifier to be used on the next call, to get the following elements. If  the
	 * "nextPage" value is missing it means that you are on the last page of the result set.
	 * 
	 * Service call frequency: the service should be called every 10 minutes.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_SYNC_CONTENTS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MSyncupdatedContentReq
	 * @return MResponseUpdatedContent
	*/
	def updatedContent(tokenId: String, 
			clientId: String, 
			param: MSyncupdatedContentReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdatedContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSyncClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdatedContent = if(this.resourceEndpoint == ""){
			
				new MResponseUpdatedContent()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sync/updatedContent")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdatedContent],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdatedContent])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to export all content matching the given exportCriteria.
	 * The service can return for each content the deliveryInfo (with the content urls and thumbnail), the
	 * linked categories and the itagDefinitions.
	 * The resultset is paginated (max page size is 200 elements), after the 1st call the service return a
	 * "nextPage" identifier to be used on the next call, to get the following elements. If  the
	 * "nextPage" value is empty it means that you are on the last page of the result set.
	 * The Service avoids ACL restrictions.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_SYNC_CONTENTS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MSyncexportReq
	 * @return MResponseExport
	*/
	def export(tokenId: String, 
			clientId: String, 
			param: MSyncexportReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseExport ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSyncClient.client.resource(this.resourceEndpoint)
			val response : MResponseExport = if(this.resourceEndpoint == ""){
			
				new MResponseExport()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sync/export")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseExport],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseExport])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}