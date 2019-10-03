package com.thron.contacts.service.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.contacts.service.model.contact.MResponseContactDetail
import com.thron.contacts.service.model.request.MContactaddKeyReq
import com.thron.contacts.service.model.contact.MResponseContactDeviceDetail
import com.thron.contacts.service.model.request.MContactinsertReq
import com.thron.contacts.service.model.contact.MResponseContactList
import com.thron.contacts.service.model.request.MContactlistReq
import com.thron.contacts.service.model.contact.MResponseContactListKey
import com.thron.contacts.service.model.request.MContactlistKeyReq
import com.thron.contacts.service.model.request.MContactremoveKeyReq
import com.thron.contacts.service.model.request.MContactupdateReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JContactClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * Service used to handle contacts.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-contact.thron.
 * com/api/xcontact/resources/contact</li>
 * </ul>
 */
class JContactClient(val resourceEndpoint:String) {

	/**
	 * Used to add the keys to a contact.
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>Only to IDENTIFIED contacts</li>
	 * 	<li>Max number of keys for contact = 50</li>
	 * </ul>
	 * 
	 * <b>ROLE validation:</b>
	 * THRON_EDIT_CONTACTS
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContactaddKeyReq
	 * @return MResponseContactDetail
	*/
	def addKey(tokenId: String, 
			clientId: String, 
			param: MContactaddKeyReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContactDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContactClient.client.resource(this.resourceEndpoint)
			val response : MResponseContactDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContactDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contact/addKey")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContactDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContactDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Show a specific contact.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>ROLE validation:</b>
	 * THRON_USE_CONTACTS
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contactId : String
	 * @return MResponseContactDeviceDetail
	*/
	def detail(tokenId: String, 
			clientId: String, 
			contactId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContactDeviceDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContactClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(contactId).foreach(s => params.add("contactId", s))
			val response : MResponseContactDeviceDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContactDeviceDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("contact/detail")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseContactDeviceDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContactDeviceDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Used to create new identified contact in platform.
	 * 
	 * <b>ROLE validation:</b>
	 * THRON_MANAGE_CONTACTS
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContactinsertReq
	 * @return MResponseContactDetail
	*/
	def insert(tokenId: String, 
			clientId: String, 
			param: MContactinsertReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContactDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContactClient.client.resource(this.resourceEndpoint)
			val response : MResponseContactDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContactDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contact/insert")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContactDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContactDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * List of Contacts ordered by accessedDate.
	 * 
	 * <b>ROLE validation:</b>
	 * THRON_USE_CONTACTS
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContactlistReq
	 * @return MResponseContactList
	*/
	def list(tokenId: String, 
			clientId: String, 
			param: MContactlistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContactList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContactClient.client.resource(this.resourceEndpoint)
			val response : MResponseContactList = if(this.resourceEndpoint == ""){
			
				new MResponseContactList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contact/list")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContactList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContactList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * List of Contacts ordered by accessedDate.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>ROLE validation:</b>
	 * THRON_USE_CONTACTS
	 * @param tokenId : String
	 * @param clientId : String
	 * @param offset : Integer
	 * Optional.
	 * @param limit : Integer
	 * Optional. Max and default value is 50
	 * @return MResponseContactList
	*/
	def listGet(tokenId: String, 
			clientId: String, 
			offset: Integer, 
			limit: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContactList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContactClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(offset).foreach(s => params.add("offset", s))
		Option(limit).foreach(s => params.add("limit", s))
			val response : MResponseContactList = if(this.resourceEndpoint == ""){
			
				new MResponseContactList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("contact/listGet")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseContactList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContactList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * List of distinct keys (IdentityKey.key) ordered by name
	 * 
	 * <b>ROLE validation:</b>
	 * THRON_USE_CONTACTS
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContactlistKeyReq
	 * @return MResponseContactListKey
	*/
	def listKey(tokenId: String, 
			clientId: String, 
			param: MContactlistKeyReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContactListKey ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContactClient.client.resource(this.resourceEndpoint)
			val response : MResponseContactListKey = if(this.resourceEndpoint == ""){
			
				new MResponseContactListKey()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contact/listKey")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContactListKey],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContactListKey])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to remove an identity key from the given contact.
	 * Constraints:
	 * <ul>
	 * 	<li>it's not possible to remove the "thronuser" key</li>
	 * </ul>
	 * 
	 * <b>ROLE validation:</b>
	 * THRON_EDIT_CONTACTS
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContactremoveKeyReq
	 * @return MResponseContactDetail
	*/
	def removeKey(tokenId: String, 
			clientId: String, 
			param: MContactremoveKeyReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContactDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContactClient.client.resource(this.resourceEndpoint)
			val response : MResponseContactDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContactDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contact/removeKey")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContactDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContactDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Used to update an identified contact
	 * 
	 * <b>ROLE validation:</b>
	 * THRON_EDIT_CONTACTS
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MContactupdateReq
	 * @return MResponseContactDetail
	*/
	def update(tokenId: String, 
			clientId: String, 
			param: MContactupdateReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContactDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContactClient.client.resource(this.resourceEndpoint)
			val response : MResponseContactDetail = if(this.resourceEndpoint == ""){
			
				new MResponseContactDetail()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("contact/update")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseContactDetail],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContactDetail])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}