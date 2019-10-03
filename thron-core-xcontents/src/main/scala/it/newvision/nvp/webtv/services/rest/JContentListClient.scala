package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.delivery.MResponseContentListResult
import it.newvision.nvp.xcontents.services.model.msg.MEContentOrderBy
import it.newvision.nvp.xcontents.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JContentListClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is optimized for lists of contents sorted by number of visits,
 * rating or creation date.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/contentlist</li>
 * </ul>
 */
class JContentListClient(val resourceEndpoint:String) {

	/**
	 * Returns content matching provided criteria.
	 * The orderBy parameter follows a specific pattern: <b>[orderByKey]_[A|D]</b>
	 * All possible values are defined in MEContentOrderBy enumeration.
	 * Use the locale parameter to filter content having a specific locale.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>Limits:</b>
	 * The service doesn't return itags and imetadata value on content.
	 * 
	 * <b>Examples: </b>
	 * http://demo-view.thron.
	 * com/api/xcontents/resources/contentlist/showContents?clientId=demo&locale=IT&orderBy=lastUpdate_A
	 * http://demo-view.thron.
	 * com/api/xcontents/resources/contentlist/showContents?clientId=demo&locale=EN&orderBy=creationDate_D
	 * 
	 * http://demo-view.thron.
	 * com/api/xcontents/resources/contentlist/showContents?clientId=demo&locale=EN&orderBy=contentName_A
	 * @param tokenId : String
	 * @param clientId : String
	 * @param locale : String
	 * Optional.Used as optional search criteria. The service return only the contents with the specified
	 * locale, and only the content metadata in the specified locale. If locale is null the service return
	 * the content with the metadata for all available locales.
	 * The parameter is required if the "searchKey" parameter is specified
	 * @param categoryId : String
	 * Optional.Used as optional search criteria. Return only the contents linked to the specified
	 * category.
	 * Category id or prettyId are supported.
	 * @param searchOnSubCategories : Boolean
	 * Optional. If true and categoryId is defined, the service earch all contents in the cateogry subtree.
	 * @param xcontentIds : String
	 * Optional. List of xcontentIds as comma separeted value.
	 * @param contentType : MEContentType
	 * Optional. Used as optional search criteria.The service return only the contents with the give
	 * contentType. The content type is like VIDEO,AUDO,IMAGE,PLAYLIST...
	 * @param channelType : String
	 * Optional. Used as optional search criteria to show only the contents published in the given channel
	 * list.The parameter is Optional and can accept a list of comma separated values like "WEB,STREAMHTTP,
	 * STREAMHTTPIOS"
	 * The service return all contents published in one channel having channelType that start with the
	 * given values.
	 * @param searchKey : String
	 * Optional. Used as text search on Content metadata and details and works over the fields:
	 * * name,
	 * * description
	 * * excerpt
	 * * tags.
	 * The parameter works in combination with the locale parameter.
	 * The parameter is Optional

	 * @param orderBy : MEContentOrderBy
	 * Optional. Used as order By criteria and follow the [orderByKey]_[A|D] pattern. 
	 * @param tags : String
	 * Optional. Used as optional search criteria to filter the contents with the given tags (list of tags
	 * as comma separated value).
	 * @param metadata : String
	 * Optional. Deprecated
	 * @param availableInSolution : String
	 * Optional. Deprecated
	 * @param ugc : Boolean
	 * Optional. Deprecated
	 * @param userAgent : String
	 * Optional.Deprecated
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768u
	 * @param offset : Integer
	 * Optional. Used for pagination
	 * @param numberOfResult : Integer
	 * Optional. Used for pagination.
	 * Default and maximum value is 50 items
	 * @param returnTotalResults : Boolean
	 * Optional. Default value true
	 * if false, totalResults will not be calculated and the service performs better.

	 * @return MResponseContentListResult
	*/
	def showContents(tokenId: String, 
			clientId: String, 
			locale: String, 
			categoryId: String, 
			searchOnSubCategories: Boolean, 
			xcontentIds: String, 
			contentType: MEContentType, 
			channelType: String, 
			searchKey: String, 
			orderBy: MEContentOrderBy, 
			tags: String, 
			metadata: String, 
			availableInSolution: String, 
			ugc: Boolean, 
			userAgent: String, 
			divArea: String, 
			offset: Integer, 
			numberOfResult: Integer, 
			returnTotalResults: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseContentListResult ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JContentListClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(categoryId).foreach(s => params.add("categoryId", s))
		Option(searchOnSubCategories).foreach(s => params.add("searchOnSubCategories", s))
		Option(xcontentIds).foreach(s => params.add("xcontentIds", s))
		Option(contentType).foreach(s => params.add("contentType", s))
		Option(channelType).foreach(s => params.add("channelType", s))
		Option(searchKey).foreach(s => params.add("searchKey", s))
		Option(orderBy).foreach(s => params.add("orderBy", s))
		Option(tags).foreach(s => params.add("tags", s))
		Option(metadata).foreach(s => params.add("metadata", s))
		Option(availableInSolution).foreach(s => params.add("availableInSolution", s))
		Option(ugc).foreach(s => params.add("ugc", s))
		Option(userAgent).foreach(s => params.add("userAgent", s))
		Option(divArea).foreach(s => params.add("divArea", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
		Option(returnTotalResults).foreach(s => params.add("returnTotalResults", s))
			val response : MResponseContentListResult = if(this.resourceEndpoint == ""){
			
				new MResponseContentListResult()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("contentlist/showContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseContentListResult])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseContentListResult])
				}
				else {
					throw e
				}
			
		  }
	
	}

}