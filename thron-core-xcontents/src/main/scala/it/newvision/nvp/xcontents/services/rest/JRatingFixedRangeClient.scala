package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.rating.MResponseRating
import it.newvision.nvp.xcontents.services.model.request.MRatingFixedRangeinsertRatingReq
import it.newvision.nvp.xcontents.services.model.rating.MResponseGetContentScore
import it.newvision.nvp.xcontents.services.model.rating.MResponseGetRatingByProperties
import it.newvision.nvp.xcontents.services.model.request.MRatingFixedRangefindRatingByPropertiesReq
import it.newvision.nvp.xcontents.services.model.request.MRatingFixedRangeremoveRatingsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JRatingFixedRangeClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * The Rating service is used to vote the content. This service use a fixed score
 * range of [0..1]
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/ratingfixedrange</li>
 * </ul>
 */
class JRatingFixedRangeClient(val resourceEndpoint:String) {

	/**
	 * Inserts a vote for a content with range between 0 and 1.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>SEE ACL on the content</li>
	 * 	<li>RATINGALLOWED property on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MRatingFixedRangeinsertRatingReq
	 * @return MResponseRating
	*/
	def insertRating(tokenId: String, 
			param: MRatingFixedRangeinsertRatingReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRating ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRatingFixedRangeClient.client.resource(this.resourceEndpoint)
			val response : MResponseRating = if(this.resourceEndpoint == ""){
			
				new MResponseRating()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("ratingfixedrange/insertRating")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseRating],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRating])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Returns the score of a content.
	 * Content score is the votes average of a content for a defined time range.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param fromDate : Date
	 * Optional
	 * @param toDate : Date
	 * Optional
	 * @return MResponseGetContentScore
	*/
	def getContentScore(tokenId: String, 
			clientId: String, 
			contentId: String, 
			fromDate: it.newvision.nvp.core.libraries.rs.DateType, 
			toDate: it.newvision.nvp.core.libraries.rs.DateType)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetContentScore ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRatingFixedRangeClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(fromDate).foreach(s => params.add("fromDate", s))
		Option(toDate).foreach(s => params.add("toDate", s))
			val response : MResponseGetContentScore = if(this.resourceEndpoint == ""){
			
				new MResponseGetContentScore()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("ratingfixedrange/getContentScore")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseGetContentScore])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetContentScore])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * Returns the list of votes of a content matching provided criteria.
	 * @param tokenId : String
	 * @param param : MRatingFixedRangefindRatingByPropertiesReq
	 * @return MResponseGetRatingByProperties
	*/
	def findRatingByProperties(tokenId: String, 
			param: MRatingFixedRangefindRatingByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetRatingByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRatingFixedRangeClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetRatingByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseGetRatingByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("ratingfixedrange/findRatingByProperties")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseGetRatingByProperties],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseGetRatingByProperties])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

	/**
	 * Removes votes matching provided criteria from a content.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>SEE ACL on the content</li>
	 * </ul>
	 * <ul>
	 * 	<li>RATINGALLOWED property on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MRatingFixedRangeremoveRatingsReq
	 * @return MResponseRating
	*/
	def removeRatings(tokenId: String, 
			param: MRatingFixedRangeremoveRatingsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRating ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRatingFixedRangeClient.client.resource(this.resourceEndpoint)
			val response : MResponseRating = if(this.resourceEndpoint == ""){
			
				new MResponseRating()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("ratingfixedrange/removeRatings")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)		
					.`type`(mediaType)
					.header("X-TOKENID",tokenId)
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
			
				wbuilder.post(classOf[MResponseRating],param)
			
			
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseRating])
				}
				else {
				  throw e
				}
		  }
		  
	
	}

}