package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.cuepoint.MResponseGetCuePoints
import it.newvision.nvp.xcontents.services.model.request.MCuePointgetCuePointsReq
import it.newvision.nvp.xcontents.services.model.cuepoint.MResponseAddCuePoints
import it.newvision.nvp.xcontents.services.model.request.MCuePointaddCuePointsReq
import it.newvision.nvp.xcontents.services.model.cuepoint.MResponseCuePoint
import it.newvision.nvp.xcontents.services.model.request.MCuePointupdateCuePointReq
import it.newvision.nvp.xcontents.services.model.request.MCuePointremoveCuePointsReq
import it.newvision.nvp.xcontents.services.model.request.MCuePointuploadSrtFileReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JCuePointClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * <b>Using </b>
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.it/api/xcontents/resources/cuepoint
 *   </li>
 * </ul>
 */
class JCuePointClient(val resourceEndpoint:String) {

	/**
	 * Return all cue points for the given contents
	 * @param tokenId : String
	 * @param param : MCuePointgetCuePointsReq
	 * @return MResponseGetCuePoints
	*/
	def getCuePoints(tokenId: String, 
			param: MCuePointgetCuePointsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetCuePoints ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCuePointClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetCuePoints = if(this.resourceEndpoint == ""){
			
				new MResponseGetCuePoints()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("cuepoint/getCuePoints")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetCuePoints],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetCuePoints])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * the service add the given list of cue points to the content
	 * @param tokenId : String
	 * @param param : MCuePointaddCuePointsReq
	 * @return MResponseAddCuePoints
	*/
	def addCuePoints(tokenId: String, 
			param: MCuePointaddCuePointsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseAddCuePoints ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCuePointClient.client.resource(this.resourceEndpoint)
			val response : MResponseAddCuePoints = if(this.resourceEndpoint == ""){
			
				new MResponseAddCuePoints()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("cuepoint/addCuePoints")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseAddCuePoints],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseAddCuePoints])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Update a single Cue Point in the list.
	 * @param tokenId : String
	 * @param param : MCuePointupdateCuePointReq
	 * @return MResponseCuePoint
	*/
	def updateCuePoint(tokenId: String, 
			param: MCuePointupdateCuePointReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCuePoint ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCuePointClient.client.resource(this.resourceEndpoint)
			val response : MResponseCuePoint = if(this.resourceEndpoint == ""){
			
				new MResponseCuePoint()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("cuepoint/updateCuePoint")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCuePoint],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCuePoint])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Remove All cue points from the content
	 * @param tokenId : String
	 * @param param : MCuePointremoveCuePointsReq
	 * @return MResponseCuePoint
	*/
	def removeCuePoints(tokenId: String, 
			param: MCuePointremoveCuePointsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCuePoint ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCuePointClient.client.resource(this.resourceEndpoint)
			val response : MResponseCuePoint = if(this.resourceEndpoint == ""){
			
				new MResponseCuePoint()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("cuepoint/removeCuePoints")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCuePoint],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCuePoint])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Upload a new SRT File to use as subtitles for a specific locale.
	 * The srt files is converted in the specific list of subtitles cue points and the existing subtitles
	 * will be replaced.
	 * @param tokenId : String
	 * @param param : MCuePointuploadSrtFileReq
	 * @return MResponseCuePoint
	*/
	def uploadSrtFile(tokenId: String, 
			param: MCuePointuploadSrtFileReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseCuePoint ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JCuePointClient.client.resource(this.resourceEndpoint)
			val response : MResponseCuePoint = if(this.resourceEndpoint == ""){
			
				new MResponseCuePoint()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("cuepoint/uploadSrtFile")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseCuePoint],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseCuePoint])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}