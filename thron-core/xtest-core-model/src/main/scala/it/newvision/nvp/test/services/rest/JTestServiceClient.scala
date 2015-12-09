package it.newvision.nvp.test.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.test.services.model.response.MResponseTestList
import it.newvision.nvp.test.services.model.request.MTestServicelistReq
import it.newvision.nvp.test.services.model.response.MResponseTestP
import it.newvision.nvp.test.services.model.request.MTestServicepostReq
import it.newvision.nvp.test.services.model.response.MResponseTestF
import it.newvision.nvp.test.services.model.msg.METestEnum
import it.newvision.nvp.test.services.model.request.MTestServiceputReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JTestServiceClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This is a test webservice user to test the different type of request and
 * objects used in the platform.
 * 
 * With the fakeResponse parameter to false, the test service respond with the
 * same parameters provided in the call.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>WADL REST service (latest version): http://clientId-view.4me.
 * it/api/xtest/resources/application.wadl  </li>
 * </ul>
 */
class JTestServiceClient(val resourceEndpoint:String) {

	/**
	 * return a list of items
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MTestServicelistReq
	 * @return MResponseTestList
	*/
	def list(tokenId: String, 
			clientId: String, 
			param: MTestServicelistReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTestList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTestServiceClient.client.resource(this.resourceEndpoint)
			val response : MResponseTestList = if(this.resourceEndpoint == ""){
			
				new MResponseTestList()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("testservice/list")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseTestList],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTestList])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * return a list of items
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseTestList
	*/
	def listGet(tokenId: String, 
			clientId: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTestList ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTestServiceClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		
			val response : MResponseTestList = if(this.resourceEndpoint == ""){
			
				new MResponseTestList()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("testservice/listGet")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseTestList])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTestList])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * @param tokenId : String
	 * @param param : MTestServicepostReq
	 * @return MResponseTestP
	*/
	def post(tokenId: String, 
			param: MTestServicepostReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTestP ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTestServiceClient.client.resource(this.resourceEndpoint)
			val response : MResponseTestP = if(this.resourceEndpoint == ""){
			
				new MResponseTestP()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("testservice/post")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseTestP],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTestP])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param fakeResponse : Boolean
	 * Optional.
	 * @param pstring : String
	 * Optional.
	 * @param penum : METestEnum
	 * Optional
	 * @param pdate : Date
	 * Optional.
	 * @param pint : Integer
	 * Optional.
	 * @param pbool : Boolean
	 * Optional.
	 * @param plong : Long
	 * Optional.
	 * @param pdouble : Double
	 * Optional.
	 * @param pfloat : Float
	 * Optional.
	 * @return MResponseTestF
	*/
	def get(tokenId: String, 
			clientId: String, 
			fakeResponse: Boolean, 
			pstring: String, 
			penum: METestEnum, 
			pdate: it.newvision.nvp.core.libraries.rs.DateType, 
			pint: Integer, 
			pbool: Boolean, 
			plong: Long, 
			pdouble: Double, 
			pfloat: Float)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTestF ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTestServiceClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(fakeResponse).foreach(s => params.add("fakeResponse", s))
		Option(pstring).foreach(s => params.add("pstring", s))
		Option(penum).foreach(s => params.add("penum", s))
		Option(pdate).foreach(s => params.add("pdate", s))
		Option(pint).foreach(s => params.add("pint", s))
		Option(pbool).foreach(s => params.add("pbool", s))
		Option(plong).foreach(s => params.add("plong", s))
		Option(pdouble).foreach(s => params.add("pdouble", s))
		Option(pfloat).foreach(s => params.add("pfloat", s))
			val response : MResponseTestF = if(this.resourceEndpoint == ""){
			
				new MResponseTestF()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("testservice/get")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseTestF])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTestF])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param fakeResponse : Boolean
	 * Optional.
	 * @param pstring : String
	 * Optional.
	 * @param penum : METestEnum
	 * Optional.
	 * @param pdate : Date
	 * Optional.
	 * @param pint : Integer
	 * Optional.
	 * @param plong : Long
	 * Optional.
	 * @param pbool : Boolean
	 * Optional.
	 * @param pdouble : Double
	 * Optional.
	 * @param pfloat : Float
	 * Optional.
	 * @return MResponseTestF
	*/
	def form(tokenId: String, 
			clientId: String, 
			fakeResponse: Boolean, 
			pstring: String, 
			penum: METestEnum, 
			pdate: it.newvision.nvp.core.libraries.rs.DateType, 
			pint: Integer, 
			plong: Long, 
			pbool: Boolean, 
			pdouble: Double, 
			pfloat: Float)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTestF ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTestServiceClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(fakeResponse).foreach(s => params.add("fakeResponse", s))
		Option(pstring).foreach(s => params.add("pstring", s))
		Option(penum).foreach(s => params.add("penum", s))
		Option(pdate).foreach(s => params.add("pdate", s))
		Option(pint).foreach(s => params.add("pint", s))
		Option(plong).foreach(s => params.add("plong", s))
		Option(pbool).foreach(s => params.add("pbool", s))
		Option(pdouble).foreach(s => params.add("pdouble", s))
		Option(pfloat).foreach(s => params.add("pfloat", s))  
			val response : MResponseTestF = if(this.resourceEndpoint == ""){
			
				new MResponseTestF()
			
			}else{
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("testservice/form")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.post(classOf[MResponseTestF],params)
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTestF])
				}
				else {
				  throw e
				}
		  }
	
	}

	/**
	 * test delete service
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pstring : String
	 * Optional.
	 * @return MResponseTestP
	*/
	def remove(tokenId: String, 
			clientId: String, 
			pstring: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTestP ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTestServiceClient.client.resource(this.resourceEndpoint)
			val response : MResponseTestP = if(this.resourceEndpoint == ""){
			
				new MResponseTestP()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("testservice/remove")
					.path(clientId.toString)
		.path(pstring.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.delete(classOf[MResponseTestP])
					
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTestP])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * test put service
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MTestServiceputReq
	 * @return MResponseTestP
	*/
	def put(tokenId: String, 
			clientId: String, 
			param: MTestServiceputReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseTestP ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JTestServiceClient.client.resource(this.resourceEndpoint)
			val response : MResponseTestP = if(this.resourceEndpoint == ""){
			
				new MResponseTestP()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("testservice/put")
					.path(clientId.toString)
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.put(classOf[MResponseTestP],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseTestP])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}