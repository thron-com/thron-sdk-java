package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.webtv.services.model.delivery.MResponseContentListResult
import it.newvision.nvp.xcontents.services.model.msg.MEContentOrderBy
import it.newvision.nvp.xcontents.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
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
@Path("/contentlist")
//#SWG#@Api(value = "/contentlist", description = """This service is optimized for lists of contents sorted by number of visits, rating or creation date.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/contentlist</li>
//#SWGNL#</ul>""")
trait JContentList extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

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
	@GET
	@Path("/showContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/showContents", notes = """Returns content matching provided criteria.
	//#SWGNL#The orderBy parameter follows a specific pattern: <b>[orderByKey]_[A|D]</b>
	//#SWGNL#All possible values are defined in MEContentOrderBy enumeration.
	//#SWGNL#Use the locale parameter to filter content having a specific locale.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#
	//#SWGNL#<b>Limits:</b>
	//#SWGNL#The service doesn't return itags and imetadata value on content.
	//#SWGNL#
	//#SWGNL#<b>Examples: </b>
	//#SWGNL#http://demo-view.thron.com/api/xcontents/resources/contentlist/showContents?clientId=demo&locale=IT&orderBy=lastUpdate_A
	//#SWGNL#http://demo-view.thron.com/api/xcontents/resources/contentlist/showContents?clientId=demo&locale=EN&orderBy=creationDate_D
	//#SWGNL#http://demo-view.thron.com/api/xcontents/resources/contentlist/showContents?clientId=demo&locale=EN&orderBy=contentName_A""", response = classOf[MResponseContentListResult])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def showContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional.Used as optional search criteria. The service return only the contents with the specified locale, and only the content metadata in the specified locale. If locale is null the service return the content with the metadata for all available locales.
	//#SWGNL#The parameter is required if the "searchKey" parameter is specified""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional.Used as optional search criteria. Return only the contents linked to the specified category.
	//#SWGNL#Category id or prettyId are supported.""")
	@QueryParam("categoryId")
	categoryId: String, 
			//#SWG#@ApiParam(value = """Optional. If true and categoryId is defined, the service earch all contents in the cateogry subtree.""")
	@QueryParam("searchOnSubCategories")
	searchOnSubCategories: Boolean, 
			//#SWG#@ApiParam(value = """Optional. List of xcontentIds as comma separeted value.""")
	@QueryParam("xcontentIds")
	xcontentIds: String, 
			//#SWG#@ApiParam(value = """Optional. Used as optional search criteria.The service return only the contents with the give contentType. The content type is like VIDEO,AUDO,IMAGE,PLAYLIST...""")
	@QueryParam("contentType")
	contentType: MEContentType, 
			//#SWG#@ApiParam(value = """Optional. Used as optional search criteria to show only the contents published in the given channel list.The parameter is Optional and can accept a list of comma separated values like "WEB,STREAMHTTP,STREAMHTTPIOS"
	//#SWGNL#The service return all contents published in one channel having channelType that start with the given values.""")
	@QueryParam("channelType")
	channelType: String, 
			//#SWG#@ApiParam(value = """Optional. Used as text search on Content metadata and details and works over the fields:
	//#SWGNL#* name,
	//#SWGNL#* description
	//#SWGNL#* excerpt
	//#SWGNL#* tags.
	//#SWGNL#The parameter works in combination with the locale parameter.
	//#SWGNL#The parameter is Optional
	//#SWGNL#""")
	@QueryParam("searchKey")
	searchKey: String, 
			//#SWG#@ApiParam(value = """Optional. Used as order By criteria and follow the [orderByKey]_[A|D] pattern. """)
	@QueryParam("orderBy")
	orderBy: MEContentOrderBy, 
			//#SWG#@ApiParam(value = """Optional. Used as optional search criteria to filter the contents with the given tags (list of tags as comma separated value).""")
	@QueryParam("tags")
	tags: String, 
			//#SWG#@ApiParam(value = """Optional. Deprecated""")
	@QueryParam("metadata")
	metadata: String, 
			//#SWG#@ApiParam(value = """Optional. Deprecated""")
	@QueryParam("availableInSolution")
	availableInSolution: String, 
			//#SWG#@ApiParam(value = """Optional. Deprecated""")
	@QueryParam("ugc")
	ugc: Boolean, 
			//#SWG#@ApiParam(value = """Optional.Deprecated""")
	@QueryParam("userAgent")
	userAgent: String, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Append u/l to get the thumbnail just above/below the limits specified.
	//#SWGNL#Format: <widht>x<height>[u/l] (u is the default value)
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768u""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional. Used for pagination""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Used for pagination.
	//#SWGNL#Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default value true
	//#SWGNL#if false, totalResults will not be calculated and the service performs better.
	//#SWGNL#""")
	@QueryParam("returnTotalResults")
	returnTotalResults: Boolean,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseContentListResult*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("showContents") 
		try{	
			val resp = this.__showContents(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,locale,categoryId,searchOnSubCategories,xcontentIds,contentType,channelType,searchKey,orderBy,tags,metadata,availableInSolution,ugc,userAgent,divArea,offset,numberOfResult,returnTotalResults)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_showContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_showContents)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __showContents(tokenId: String, clientId: String, locale: String, categoryId: String, searchOnSubCategories: Boolean, xcontentIds: String, contentType: MEContentType, channelType: String, searchKey: String, orderBy: MEContentOrderBy, tags: String, metadata: String, availableInSolution: String, ugc: Boolean, userAgent: String, divArea: String, offset: Integer, numberOfResult: Integer, returnTotalResults: Boolean) :MResponseContentListResult
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_showContents: String

}