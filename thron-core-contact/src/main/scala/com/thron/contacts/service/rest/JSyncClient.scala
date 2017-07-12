package com.thron.contacts.service.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.sync.MResponseUpdatedContacts
import com.thron.contacts.service.model.request.MSyncupdatedContactsReq
import com.thron.contacts.service.model.sync.MResponseExport
import com.thron.contacts.service.model.request.MSyncexportReq

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
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/contactunit/xcontact/resources/sync</li>
 * </ul>
 */
class JSyncClient(val resourceEndpoint:String) {

	/**
	 * The service returns the list of contacts modified inside the specified date range.
	 * The response provides all metadata information and the list of ids (contacts.removed) of the
	 * contacts removed within the date range.
	 * The service can return for each contacts the itagDefinitions.
	 * The resultset is paginated (max page size is 200 elements), after the 1st call the service return
	 * a
	 * "nextPage" identifier to be used on the next call, to get the following elements. If  the
	 * "nextPage" value is empty it means that you are on the last page of the result set.
	 * 
	 * Service call frequency: the service should be called every 10 minutes.
	 * 
	 * <b>ROLE validation:</b>
	 * <ul>
	 * 	<li>CORE_SYNC_CONTACTS</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MSyncupdatedContactsReq
	 * @return MResponseUpdatedContacts
	*/
	def updatedContacts(tokenId: String, 
			clientId: String, 
			param: MSyncupdatedContactsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseUpdatedContacts ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JSyncClient.client.resource(this.resourceEndpoint)
			val response : MResponseUpdatedContacts = if(this.resourceEndpoint == ""){
			
				new MResponseUpdatedContacts()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("sync/updatedContacts")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseUpdatedContacts],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseUpdatedContacts])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to export all contacts matching the given criteria.
	 * The service can return for each contacts the itagDefinitions.
	 * The resultset is paginated (max page size is 200 elements), after the 1st call the service return
	 * a
	 * "nextPage" identifier to be used on the next call, to get the following elements. If  the
	 * "nextPage" value is empty it means that you are on the last page of the result set.
	 * 
	 * <b>ROLE validation:</b>
	 * <ul>
	 * 	<li>CORE_SYNC_CONTACTS</li>
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