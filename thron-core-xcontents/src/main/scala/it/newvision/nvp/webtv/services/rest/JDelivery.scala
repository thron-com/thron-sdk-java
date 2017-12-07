package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetContentDetail
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetCuePoints
import it.newvision.nvp.webtv.services.model.playlist.MResponsePlayListDescriptor
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetDownloadableContents
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetRecommendedContents
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetPlaylistContents

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service is optimized for the delivery, and provide a set of services to
 * get the content detail information necessary for THRON Player.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/delivery</li>
 * </ul>
 */
@Path("/delivery")
//#SWG#@Api(value = "/delivery", description = """This service is optimized for the delivery, and provide a set of services to get the content detail information necessary for THRON Player. 
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/delivery</li>
//#SWGNL#</ul>""")
trait JDelivery extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Returns content detail.
	 * This service is used by THRON player to display content name, description and to track stats.
	 * JSONP is supported via the callback queryparam.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * <b>
	 * </b><b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional.The service accept the xcontentId or xpublisherId as identifier of the content. One of
	 * these parameters is required
	 * @param xpublisherId : String
	 * Optional. The service accept the xcontentId or xpublisherId as identifier of the content. One of
	 * these parameters is required
	 * @param locale : String
	 * Optional.If the user desires to have the content description for a specific locale.
	 * The desired locale is return as first element of the array (if exists).
	 * The service always return all available locales of the content.
	 * @param linkedChannelType : String
	 * Optional. Used to know the number of linekdcontents available on some channels.The list of values
	 * is represented as comma separated value, and the attribute is optional. If the parameter is empty
	 * the service return the number of all linkedcontents.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS

	 * @param linkedUserAgent : String
	 * Optional. Used to know the number linkedcontents available/compliant with a specific userAgent.
	 * 
	 * linkedUserAgent="mobile" falls back in channelypes:
	 * 1. STREAMHTTPIOSHD
	 * 2. STREAMHTTPIOS
	 * 3. WEBIPHONEHD
	 * 4. WEBIPHONE
	 * 
	 * linkedUserAgent="other" used with old mobile devices like Blackberry and Android.It falls back in
	 * channelTypes:
	 * 1. WEBIPHONEHD
	 * 2. WEBIPHONE
	 * 
	 * linkedUserAgent="web" used with desktop device with flash player and it falls back in channelTypes:
	 * 
	 * 1. STREAMHTTPFLASHHD
	 * 2. STREAMHTTPFLASH
	 * 3. WEBHD
	 * 4. WEB

	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768
	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the descriptor of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @param pkey : String
	 * Optional, the access key for the content. It's not required when session token is provided.
	 * @param embedCodeId : String
	 * Optional. define the playerEmbedCode to use for the content rendering.
	 * @return MResponseDeliveryGetContentDetail
	*/
	@GET
	@Path("/getContentDetail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getContentDetail", notes = """Returns content detail.
	//#SWGNL#This service is used by THRON player to display content name, description and to track stats.
	//#SWGNL#JSONP is supported via the callback queryparam.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetContentDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getContentDetail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional.The service accept the xcontentId or xpublisherId as identifier of the content. One of these parameters is required""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional. The service accept the xcontentId or xpublisherId as identifier of the content. One of these parameters is required""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional.If the user desires to have the content description for a specific locale. 
	//#SWGNL#The desired locale is return as first element of the array (if exists).
	//#SWGNL#The service always return all available locales of the content.""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional. Used to know the number of linekdcontents available on some channels.The list of values is represented as comma separated value, and the attribute is optional. If the parameter is empty the service return the number of all linkedcontents.
	//#SWGNL#Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	//#SWGNL#""")
	@QueryParam("linkedChannelType")
	linkedChannelType: String, 
			//#SWG#@ApiParam(value = """Optional. Used to know the number linkedcontents available/compliant with a specific userAgent.
	//#SWGNL#
	//#SWGNL#linkedUserAgent="mobile" falls back in channelypes:
	//#SWGNL#1. STREAMHTTPIOSHD
	//#SWGNL#2. STREAMHTTPIOS
	//#SWGNL#3. WEBIPHONEHD
	//#SWGNL#4. WEBIPHONE
	//#SWGNL#
	//#SWGNL#linkedUserAgent="other" used with old mobile devices like Blackberry and Android.It falls back in channelTypes:
	//#SWGNL#1. WEBIPHONEHD
	//#SWGNL#2. WEBIPHONE
	//#SWGNL#
	//#SWGNL#linkedUserAgent="web" used with desktop device with flash player and it falls back in channelTypes:
	//#SWGNL#1. STREAMHTTPFLASHHD
	//#SWGNL#2. STREAMHTTPFLASH
	//#SWGNL#3. WEBHD
	//#SWGNL#4. WEB
	//#SWGNL#""")
	@QueryParam("linkedUserAgent")
	linkedUserAgent: String, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Format: <widht>x<height>
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional. the xcontentId of the main linked content
	//#SWGNL#This parameter is used to have the descriptor of a linked/recommended content. The ACL of a recommended content are validated on the context of the main content.""")
	@QueryParam("lcid")
	lcid: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. It's not required when session token is provided.""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. define the playerEmbedCode to use for the content rendering.""")
	@QueryParam("embedCodeId")
	embedCodeId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetContentDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getContentDetail") 
		try{	
			val resp = this.__getContentDetail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,linkedChannelType,linkedUserAgent,divArea,lcid,pkey,embedCodeId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContentDetail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentDetail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentDetail(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, linkedChannelType: String, linkedUserAgent: String, divArea: String, lcid: String, pkey: String, embedCodeId: String) :MResponseDeliveryGetContentDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentDetail: String

	/**
	 * This service provides the thumbnail of a content with the desired resolution and quality: THRON
	 * will automatically process the highest available quality image to apply cropping and resize
	 * algorithms that match your request.
	 * For backward compatibility, if no additional queryparam is provided, the service will return the
	 * image of the exact width of the divArea while height will respect the aspect ratio.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error ,</li>
	 * 	<li>307: redirects to resulting image,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * 
	 * If no thumbnail is available, a default fallback image will be provided.
	 * This service is public: authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param divArea : String
	 * The desired WidthxHeight of the resulting image. If higher than the original thumbnail resolution,
	 * no processing will be performed
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints, keeping the aspet ration)
	 * 0x0 return the maximum size of the image

	 * @param id : String
	 * The xcontentId of the content. File extension is optional.
	 * Example:
	 * 219f61ee-72b6-476a-be17-5cd4f9fa94f1.jpg
	 * 219f61ee-72b6-476a-be17-5cd4f9fa94f1
	 * 

	 * @param scalemode : String
	 * Optional. It represents the method used by the service to crop and resize the image. Available
	 * values are:
	 * * manual (default value): is used to specify crop parameters, if no cropmode is provided image will
	 * be scaled to divArea;
	 * * centered scales the image to fit the divArea cropping borders if desired aspect ratio is
	 * different from source image;
	 * * auto (available only if Real Time Image Editor application is active) smart cropping of image by
	 * preserving  the image's main subject.
	 * @param cropmode : String
	 * Optional. Define if cropping will be performed with absolute coordinates or relative ones.
	 * Available values are: pixel; percent (default).
	 * Percent values always refer to the original size of the image.
	 * @param cropx : Double
	 * Optional. Starting point (distance from left border)  of the cropping function. Default value is 0
	 * (top left corner of the image).
	 * @param cropy : Double
	 * Optional. Starting point (distance from left border)  of the cropping function. Default value is 0
	 * (top left corner of the image).
	 * @param cropw : Double
	 * Optional. The width of the resulting cropped image before resize. The default value is the width of
	 * the image minus cropx. If this value is higher than the Width of the divArea, no resize will be
	 * performed.
	 * @param croph : Double
	 * Optional. The height of the resulting cropped image before resize. The default value is the height
	 * of the image minus cropy. If this value is higher than the Height of the divArea, no resize will be
	 * performed.
	 * @param quality : Integer
	 * Optional. The quality of the resulting image. Available values are: [0-100]. Default value is 90
	 * @param adjustcrop : String
	 * @param fill : String
	 * @param fillcolor : String
	 * @param format : String
	 * @param enhance : String
	 * @param dpr : Integer
	 * Optional. Device Pixel Ration, available values are [1..1000]
	 * 0-100: zoom out
	 * 100-1000: zoom in
	 * @return java.io.File
	*/
	@GET
	@Path("/getThumbnail/{clientId}/{divArea}/{id}")
	@Produces(Array(MediaType.WILDCARD,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getThumbnail", notes = """This service provides the thumbnail of a content with the desired resolution and quality: THRON will automatically process the highest available quality image to apply cropping and resize algorithms that match your request. 
	//#SWGNL#For backward compatibility, if no additional queryparam is provided, the service will return the image of the exact width of the divArea while height will respect the aspect ratio.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#
	//#SWGNL#HTTP status codes: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>400: invalid arguments,</li>
	//#SWGNL#	<li>404: content not found,</li>
	//#SWGNL#	<li>500: generic error ,</li>
	//#SWGNL#	<li>307: redirects to resulting image,</li>
	//#SWGNL#	<li>200: ok.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#If no thumbnail is available, a default fallback image will be provided. 
	//#SWGNL#This service is public: authentication token is not required (X-TOKENID).""", response = classOf[java.io.File])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getThumbnail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """Domain name used to access THRON""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """The desired WidthxHeight of the resulting image. If higher than the original thumbnail resolution, no processing will be performed
	//#SWGNL#Format: <widht>x<height> 
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints, keeping the aspet ration)
	//#SWGNL#0x0 return the maximum size of the image
	//#SWGNL#""")
	@PathParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """The xcontentId of the content. File extension is optional.
	//#SWGNL#Example: 
	//#SWGNL# 219f61ee-72b6-476a-be17-5cd4f9fa94f1.jpg 
	//#SWGNL# 219f61ee-72b6-476a-be17-5cd4f9fa94f1
	//#SWGNL#
	//#SWGNL#""")
	@PathParam("id")
	id: String, 
			//#SWG#@ApiParam(value = """Optional. It represents the method used by the service to crop and resize the image. Available values are: 
	//#SWGNL#* manual (default value): is used to specify crop parameters, if no cropmode is provided image will be scaled to divArea; 
	//#SWGNL#* centered scales the image to fit the divArea cropping borders if desired aspect ratio is different from source image;
	//#SWGNL#* auto (available only if Real Time Image Editor application is active) smart cropping of image by preserving  the image's main subject.""")
	@QueryParam("scalemode")
	scalemode: String, 
			//#SWG#@ApiParam(value = """Optional. Define if cropping will be performed with absolute coordinates or relative ones. 
	//#SWGNL#Available values are: pixel; percent (default). 
	//#SWGNL#Percent values always refer to the original size of the image.""")
	@QueryParam("cropmode")
	cropmode: String, 
			//#SWG#@ApiParam(value = """Optional. Starting point (distance from left border)  of the cropping function. Default value is 0 (top left corner of the image).""")
	@QueryParam("cropx")
	cropx: Double, 
			//#SWG#@ApiParam(value = """Optional. Starting point (distance from left border)  of the cropping function. Default value is 0 (top left corner of the image).""")
	@QueryParam("cropy")
	cropy: Double, 
			//#SWG#@ApiParam(value = """Optional. The width of the resulting cropped image before resize. The default value is the width of the image minus cropx. If this value is higher than the Width of the divArea, no resize will be performed.""")
	@QueryParam("cropw")
	cropw: Double, 
			//#SWG#@ApiParam(value = """Optional. The height of the resulting cropped image before resize. The default value is the height of the image minus cropy. If this value is higher than the Height of the divArea, no resize will be performed.""")
	@QueryParam("croph")
	croph: Double, 
			//#SWG#@ApiParam(value = """Optional. The quality of the resulting image. Available values are: [0-100]. Default value is 90""")
	@QueryParam("quality")
	quality: Integer, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("adjustcrop")
	adjustcrop: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("fill")
	fill: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("fillcolor")
	fillcolor: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("format")
	format: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("enhance")
	enhance: String, 
			//#SWG#@ApiParam(value = """Optional. Device Pixel Ration, available values are [1..1000]
	//#SWGNL#0-100: zoom out
	//#SWGNL#100-1000: zoom in""")
	@QueryParam("dpr")
	dpr: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = java.io.File*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getThumbnail") 
		try{	
			val resp = this.__getThumbnail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,divArea,id,scalemode,cropmode,cropx,cropy,cropw,croph,quality,adjustcrop,fill,fillcolor,format,enhance,dpr)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getThumbnail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getThumbnail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getThumbnail(tokenId: String, clientId: String, divArea: String, id: String, scalemode: String, cropmode: String, cropx: Double, cropy: Double, cropw: Double, croph: Double, quality: Integer, adjustcrop: String, fill: String, fillcolor: String, format: String, enhance: String, dpr: Integer) :java.io.File
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getThumbnail: String

	/**
	 * Returns cuepoints of a public content.
	 * JSONP is supported via the callback queryparam.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param cuePointTypes : String
	 * Optional. List of comma separated values
	 * @param actions : String
	 * Optional. List of commaseparated values
	 * @param startTime : Integer
	 * Optional
	 * @param endTime : Integer
	 * Optional
	 * @param draft : Boolean
	 * Optional
	 * @param username : String
	 * Optional
	 * @param cuePointGroup : String
	 * Optional
	 * @param offset : Integer
	 * Optional.
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @param pkey : String
	 * Optional, the access key for the content. It's not required when session token is provided.
	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the cuepoints of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return MResponseDeliveryGetCuePoints
	*/
	@GET
	@Path("/getCuePoints")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getCuePoints", notes = """Returns cuepoints of a public content.
	//#SWGNL#JSONP is supported via the callback queryparam.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#
	//#SWGNL#<b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetCuePoints])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getCuePoints(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. List of comma separated values""")
	@QueryParam("cuePointTypes")
	cuePointTypes: String, 
			//#SWG#@ApiParam(value = """Optional. List of commaseparated values""")
	@QueryParam("actions")
	actions: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("startTime")
	startTime: Integer, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("endTime")
	endTime: Integer, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("draft")
	draft: Boolean, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("username")
	username: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("cuePointGroup")
	cuePointGroup: String, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. It's not required when session token is provided.""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. the xcontentId of the main linked content
	//#SWGNL#This parameter is used to have the cuepoints of a linked/recommended content. The ACL of a recommended content are validated on the context of the main content.""")
	@QueryParam("lcid")
	lcid: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetCuePoints*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getCuePoints") 
		try{	
			val resp = this.__getCuePoints(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,cuePointTypes,actions,startTime,endTime,draft,username,cuePointGroup,offset,numberOfResult,pkey,lcid)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getCuePoints)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getCuePoints)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getCuePoints(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, cuePointTypes: String, actions: String, startTime: Integer, endTime: Integer, draft: Boolean, username: String, cuePointGroup: String, offset: Integer, numberOfResult: Integer, pkey: String, lcid: String) :MResponseDeliveryGetCuePoints
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getCuePoints: String

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xpublisherId : String
	 * @param xcontentId : String
	 * @param locale : String
	 * @param withItemMetadatas : Boolean
	 * Optional. Default = false
	 * Used to decide to get the ItemDetail.metadata information or not.
	 * @param categoryIdForAcl : String
	 * @param offset : Integer
	 * @param numberOfResult : Integer
	 * @param channelType : String
	 * @param clientIPv4 : String
	 * @param clientIPv6 : String
	 * @param userAgent : String
	 * @param authServiceForCallback : String
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @return MResponsePlayListDescriptor
	*/
	@GET
	@Path("getPlayListDescriptor")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	def getPlayListDescriptor(@HeaderParam("X-TOKENID")
	tokenId: String, 
			@QueryParam("clientId")
	clientId: String, 
			@QueryParam("xpublisherId")
	xpublisherId: String, 
			@QueryParam("xcontentId")
	xcontentId: String, 
			@QueryParam("locale")
	locale: String, 
			@QueryParam("withItemMetadatas")
	withItemMetadatas: Boolean, 
			@QueryParam("categoryIdForAcl")
	categoryIdForAcl: String, 
			@QueryParam("offset")
	offset: Integer, 
			@QueryParam("numberOfResult")
	numberOfResult: Integer, 
			@QueryParam("channelType")
	channelType: String, 
			@HeaderParam("X-CLIENTIPV4")
	clientIPv4: String, 
			@HeaderParam("X-CLIENTIPV6")
	clientIPv6: String, 
			@QueryParam("userAgent")
	userAgent: String, 
			@HeaderParam("X-AUTHSERVICEFORCALLBACK")
	authServiceForCallback: String, 
			@QueryParam("divArea")
	divArea: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponsePlayListDescriptor*/ = { throw new it.newvision.core.dictionary.exceptions.WebApplicationException("service not implemented") }

	 


	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 

	protected def capability_getPlayListDescriptor: String

	/**
	 * Returns localized subtitles for a public content.
	 * JSONP is supported via the callback queryparam.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. the subtitles locale
	 * @param pkey : String
	 * Optional, the access key for the content. It's not required when session token is provided.
	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the subtitles of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return String
	*/
	@GET
	@Path("/getSubTitles")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getSubTitles", notes = """Returns localized subtitles for a public content.
	//#SWGNL#JSONP is supported via the callback queryparam.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#
	//#SWGNL#<b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND</li>
	//#SWGNL#</ul>""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getSubTitles(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. the subtitles locale""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. It's not required when session token is provided.""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. the xcontentId of the main linked content
	//#SWGNL#This parameter is used to have the subtitles of a linked/recommended content. The ACL of a recommended content are validated on the context of the main content.""")
	@QueryParam("lcid")
	lcid: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = String*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getSubTitles") 
		try{	
			val resp = this.__getSubTitles(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,pkey,lcid)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getSubTitles)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getSubTitles)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getSubTitles(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, pkey: String, lcid: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getSubTitles: String

	/**
	 * Returns the list of downloadable content of a content without "UNLINKABLE" property.
	 * JSONP is supported via the callback queryparam.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred locale for the content results. 
	 * @param pkey : String
	 * Optional, the access key for the content. It's not required when session token is provided.
	 * @param admin : Boolean
	 * Optional. disable the intrinsic filtering of the service, and return all linked contents:
	 * * downloadable
	 * * published or not in cdn2
	 * * with property NOT_LINKABLE or not
	 * 
	 * Enabling this parameter, the service can be used in the admin console to show all contents linked
	 * even those unmatching the filters.
	 * @param lcid : String
	 * Optional. the xcontentId of the parent linked content
	 * This parameter is used to have the list of downloadable contents. The ACL of a downloadable
	 * contents are validated on the context of the parent content.
	 * example:
	 * A -> has A1, A2 as recommended contents
	 * A1 -> has D1,D2 as downloadable contents
	 * 
	 * To show the list of downloadable contents of A1 (on the context fo A):
	 * xcontentId = A1
	 * lcid = A
	 * pkey = pkey/token of A
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @return MResponseDeliveryGetDownloadableContents
	*/
	@GET
	@Path("/getDownloadableContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getDownloadableContents", notes = """Returns the list of downloadable content of a content without "UNLINKABLE" property.
	//#SWGNL#JSONP is supported via the callback queryparam.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#
	//#SWGNL#<b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND.</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetDownloadableContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getDownloadableContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. Used as preferred locale for the content results. """)
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. It's not required when session token is provided.""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. disable the intrinsic filtering of the service, and return all linked contents:
	//#SWGNL#* downloadable
	//#SWGNL#* published or not in cdn2
	//#SWGNL#* with property NOT_LINKABLE or not
	//#SWGNL#
	//#SWGNL#Enabling this parameter, the service can be used in the admin console to show all contents linked even those unmatching the filters.""")
	@QueryParam("admin")
	admin: Boolean, 
			//#SWG#@ApiParam(value = """Optional. the xcontentId of the parent linked content
	//#SWGNL#This parameter is used to have the list of downloadable contents. The ACL of a downloadable contents are validated on the context of the parent content.
	//#SWGNL#example:
	//#SWGNL#A -> has A1, A2 as recommended contents
	//#SWGNL#A1 -> has D1,D2 as downloadable contents
	//#SWGNL#
	//#SWGNL#To show the list of downloadable contents of A1 (on the context fo A):
	//#SWGNL#xcontentId = A1
	//#SWGNL#lcid = A
	//#SWGNL#pkey = pkey/token of A""")
	@QueryParam("lcid")
	lcid: String, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Format: <widht>x<height>
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints)""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetDownloadableContents*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getDownloadableContents") 
		try{	
			val resp = this.__getDownloadableContents(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,pkey,admin,lcid,divArea,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getDownloadableContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getDownloadableContents)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getDownloadableContents(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, pkey: String, admin: Boolean, lcid: String, divArea: String, offset: Integer, numberOfResult: Integer) :MResponseDeliveryGetDownloadableContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getDownloadableContents: String

	/**
	 * Returns the list of recommended content of a content.
	 * JSONP is supported via the callback queryparam.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * <b>
	 * </b><b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred local for the content results.

	 * @param linkedChannelType : String
	 * Used to filter the linekdcontents available on some channels.The list of values is represented as
	 * comma separated value, and the attribute is optional.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	 * @param linkedUserAgent : String
	 * Used to filter the linekdcontents available/compliant with a specific userAgent.The attribute is
	 * optional.
	 * Possible values are: mobile/desktop/other
	 * @param pkey : String
	 * Optional, the access key for the content. It's not required when session token is provided.
	 * @param admin : Boolean
	 * disable the intrinsic filtering of the service, and return all linked contents:
	 * * recommended
	 * * published or not in cdn2
	 * * with property NOT_LINKABLE or not
	 * 
	 * Enabling this parameter, the service can be used in the admin console to show all contents linked
	 * even those unmatching the filters.
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Default and maximum value is 50 items
	 * @return MResponseDeliveryGetRecommendedContents
	*/
	@GET
	@Path("/getRecommendedContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getRecommendedContents", notes = """Returns the list of recommended content of a content.
	//#SWGNL#JSONP is supported via the callback queryparam.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND.</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetRecommendedContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getRecommendedContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. Used as preferred local for the content results. 
	//#SWGNL#""")
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Used to filter the linekdcontents available on some channels.The list of values is represented as comma separated value, and the attribute is optional.
	//#SWGNL#Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS""")
	@QueryParam("linkedChannelType")
	linkedChannelType: String, 
			//#SWG#@ApiParam(value = """Used to filter the linekdcontents available/compliant with a specific userAgent.The attribute is optional.
	//#SWGNL#Possible values are: mobile/desktop/other""")
	@QueryParam("linkedUserAgent")
	linkedUserAgent: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. It's not required when session token is provided.""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """disable the intrinsic filtering of the service, and return all linked contents:
	//#SWGNL#* recommended
	//#SWGNL#* published or not in cdn2
	//#SWGNL#* with property NOT_LINKABLE or not
	//#SWGNL#
	//#SWGNL#Enabling this parameter, the service can be used in the admin console to show all contents linked even those unmatching the filters.""")
	@QueryParam("admin")
	admin: Boolean, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Format: <widht>x<height>
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints)""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetRecommendedContents*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getRecommendedContents") 
		try{	
			val resp = this.__getRecommendedContents(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,linkedChannelType,linkedUserAgent,pkey,admin,divArea,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getRecommendedContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getRecommendedContents)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getRecommendedContents(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, linkedChannelType: String, linkedUserAgent: String, pkey: String, admin: Boolean, divArea: String, offset: Integer, numberOfResult: Integer) :MResponseDeliveryGetRecommendedContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getRecommendedContents: String

	/**
	 * Returns the list of content linked to a playlist content.
	 * JSONP is supported via the callback queryparam.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred local for the content results. 
	 * @param linkedChannelType : String
	 * Optional. Used to filter the linekdcontents available on some channels.The list of values is
	 * represented as comma separated value, and the attribute is optional.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	 * @param linkedUserAgent : String
	 * Optional. Used to filter the linekdcontents available/compliant with a specific userAgent.The
	 * attribute is optional.
	 * Possible values are: mobile/desktop/other
	 * @param pkey : String
	 * Optional, the access key for the content. It's not required when session token is provided.
	 * @param admin : Boolean
	 * Optional. disable the intrinsic filtering of the service, and return all linked contents:
	 * * recommended
	 * * published or not in cdn2
	 * * with property NOT_LINKABLE or not
	 * 
	 * Enabling this parameter, the service can be used in the admin console to show all contents linked
	 * even those unmatching the filters.
	 * @param lcid : String
	 * Optional. the xcontentId of the parent linked content
	 * This parameter is used to have the list of playlist contents. The ACL of a playlist content are
	 * validated on the context of the parent content.
	 * example:
	 * A -> has A1, A2 as recommended contents
	 * A1 -> has C1,C2 as playlist contents
	 * 
	 * To show the list of playlist contents of A1 (on the context fo A):
	 * xcontentId = A1
	 * lcid = A
	 * pkey = pkey/token of A
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @return MResponseDeliveryGetPlaylistContents
	*/
	@GET
	@Path("/getPlaylistContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getPlaylistContents", notes = """Returns the list of content linked to a playlist content.
	//#SWGNL#JSONP is supported via the callback queryparam.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#
	//#SWGNL#<b>Limits:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate the user session or specific keys used to share the content (shareboard feature).if the pkey is not valid the service return an error response like CONTENT_NOT_FOUND.</li>
	//#SWGNL#</ul>""", response = classOf[MResponseDeliveryGetPlaylistContents])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getPlaylistContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xcontentId")
	xcontentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("xpublisherId")
	xpublisherId: String, 
			//#SWG#@ApiParam(value = """Optional. Used as preferred local for the content results. """)
	@QueryParam("locale")
	locale: String, 
			//#SWG#@ApiParam(value = """Optional. Used to filter the linekdcontents available on some channels.The list of values is represented as comma separated value, and the attribute is optional.
	//#SWGNL#Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS""")
	@QueryParam("linkedChannelType")
	linkedChannelType: String, 
			//#SWG#@ApiParam(value = """Optional. Used to filter the linekdcontents available/compliant with a specific userAgent.The attribute is optional.
	//#SWGNL#Possible values are: mobile/desktop/other""")
	@QueryParam("linkedUserAgent")
	linkedUserAgent: String, 
			//#SWG#@ApiParam(value = """Optional, the access key for the content. It's not required when session token is provided.""")
	@QueryParam("pkey")
	pkey: String, 
			//#SWG#@ApiParam(value = """Optional. disable the intrinsic filtering of the service, and return all linked contents:
	//#SWGNL#* recommended
	//#SWGNL#* published or not in cdn2
	//#SWGNL#* with property NOT_LINKABLE or not
	//#SWGNL#
	//#SWGNL#Enabling this parameter, the service can be used in the admin console to show all contents linked even those unmatching the filters.""")
	@QueryParam("admin")
	admin: Boolean, 
			//#SWG#@ApiParam(value = """Optional. the xcontentId of the parent linked content
	//#SWGNL#This parameter is used to have the list of playlist contents. The ACL of a playlist content are validated on the context of the parent content.
	//#SWGNL#example:
	//#SWGNL#A -> has A1, A2 as recommended contents
	//#SWGNL#A1 -> has C1,C2 as playlist contents
	//#SWGNL#
	//#SWGNL#To show the list of playlist contents of A1 (on the context fo A):
	//#SWGNL#xcontentId = A1
	//#SWGNL#lcid = A
	//#SWGNL#pkey = pkey/token of A""")
	@QueryParam("lcid")
	lcid: String, 
			//#SWG#@ApiParam(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Format: <widht>x<height>
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints)""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("offset")
	offset: Integer, 
			//#SWG#@ApiParam(value = """Optional. Default and maximum value is 50 items""")
	@QueryParam("numberOfResult")
	numberOfResult: Integer,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseDeliveryGetPlaylistContents*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getPlaylistContents") 
		try{	
			val resp = this.__getPlaylistContents(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xcontentId,xpublisherId,locale,linkedChannelType,linkedUserAgent,pkey,admin,lcid,divArea,offset,numberOfResult)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getPlaylistContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getPlaylistContents)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getPlaylistContents(tokenId: String, clientId: String, xcontentId: String, xpublisherId: String, locale: String, linkedChannelType: String, linkedUserAgent: String, pkey: String, admin: Boolean, lcid: String, divArea: String, offset: Integer, numberOfResult: Integer) :MResponseDeliveryGetPlaylistContents
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getPlaylistContents: String

}