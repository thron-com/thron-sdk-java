package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.rating.MResponseRating
import it.newvision.nvp.xcontents.services.model.request.MRatinginsertRatingReq
import it.newvision.nvp.xcontents.services.model.rating.MResponseGetContentScore
import it.newvision.nvp.xcontents.services.model.rating.MResponseGetRatingByProperties
import it.newvision.nvp.xcontents.services.model.request.MRatingfindRatingByPropertiesReq
import it.newvision.nvp.xcontents.services.model.request.MRatingremoveRatingsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JRatingClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * <b>Deprecated</b>
 * <b>
 * </b>Use the new service JRatingFixedRange
 */
class JRatingClient(val resourceEndpoint:String) {

	/**
	 * Deprecated
	 * @param tokenId : String
	 * @param param : MRatinginsertRatingReq
	 * @return MResponseRating
	*/
	def insertRating(tokenId: String, 
			param: MRatinginsertRatingReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRating ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRatingClient.client.resource(this.resourceEndpoint)
			val response : MResponseRating = if(this.resourceEndpoint == ""){
			
				new MResponseRating()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("rating/insertRating")
				
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
	 * Return the "score" of a specific content. The content score is the average of the total sum of
	 * score of a content in a specific time range.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param fromDate : Date
	 * Optional
	 * @param toDate : Date
	 * Optional
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseGetContentScore
	*/
	@Deprecated
	def getContentScore(tokenId: String, 
			clientId: String, 
			contentId: String, 
			fromDate: it.newvision.nvp.core.libraries.rs.DateType, 
			toDate: it.newvision.nvp.core.libraries.rs.DateType, 
			categoryIdForAcl: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetContentScore ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRatingClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(contentId).foreach(s => params.add("contentId", s))
		Option(fromDate).foreach(s => params.add("fromDate", s))
		Option(toDate).foreach(s => params.add("toDate", s))
		Option(categoryIdForAcl).foreach(s => params.add("categoryIdForAcl", s))
			val response : MResponseGetContentScore = if(this.resourceEndpoint == ""){
			
				new MResponseGetContentScore()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("rating/getContentScore")
				
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
	 * @param tokenId : String
	 * @param param : MRatingfindRatingByPropertiesReq
	 * @return MResponseGetRatingByProperties
	*/
	def findRatingByProperties(tokenId: String, 
			param: MRatingfindRatingByPropertiesReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseGetRatingByProperties ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRatingClient.client.resource(this.resourceEndpoint)
			val response : MResponseGetRatingByProperties = if(this.resourceEndpoint == ""){
			
				new MResponseGetRatingByProperties()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("rating/findRatingByProperties")
				
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
	 * Remote all ratings for a given contentId using the specified search criteria. It's possible to
	 * remove all ratings added by a specific userId or in a specific time range.
	 * @param tokenId : String
	 * @param param : MRatingremoveRatingsReq
	 * @return MResponseRating
	*/
	def removeRatings(tokenId: String, 
			param: MRatingremoveRatingsReq)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseRating ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JRatingClient.client.resource(this.resourceEndpoint)
			val response : MResponseRating = if(this.resourceEndpoint == ""){
			
				new MResponseRating()
			
			}else{	
				val mediaType = javax.ws.rs.core.MediaType.APPLICATION_XML	
				var wbuilder = webResource
					.path("rating/removeRatings")
				
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