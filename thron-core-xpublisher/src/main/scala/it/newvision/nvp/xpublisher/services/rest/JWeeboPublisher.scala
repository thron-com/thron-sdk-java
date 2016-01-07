package it.newvision.nvp.xpublisher.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xpublisher.services.model.response.MResponseGetContent
import it.newvision.nvp.xpublisher.services.model.response.MResponseGetQuota
import it.newvision.nvp.xpublisher.services.model.response.MResponseGetQuotaUsage
import it.newvision.nvp.xpublisher.services.model.request.MWeeboPublishergetQuotaUsageByUserIdReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Weebo web service provide the functions to get the content descriptor and
 * public web urls. The contents published in Weebo can be delivered using
 * different channels (WEB, STREAM, IPHONE..)
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/xpublisher/resources/weebopublisher/ </li>
 * </ul>
 */
@Path("/weebopublisher")
//#SWG#@Api(value = "/weebopublisher", description = """The Weebo web service provide the functions to get the content descriptor and public web urls. The contents published in Weebo can be delivered using different channels (WEB, STREAM, IPHONE..)
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.4me.it/api/xpublisher/resources/weebopublisher/ </li>
//#SWGNL#</ul>""")
trait JWeeboPublisher extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * like getContent service but implemented as post http service. Use the optimised and cached
	 * getContent for better performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param channelType : String
	 * @param clientIPv4 : String
	 * ip address of the client, used for the geo blocking. Optional
	 * @param clientIPv6 : String
	 * @param userAgent : String
	 * @return MResponseGetContent
	*/
	@POST
	@Path("/contentDetail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/contentDetail", notes = """like getContent service but implemented as post http service. Use the optimised and cached getContent for better performance.""", response = classOf[MResponseGetContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def contentDetail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("channelType")
	channelType: String, 
			//#SWG#@ApiParam(value = """ip address of the client, used for the geo blocking. Optional""")
	@FormParam("clientIPv4")
	clientIPv4: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientIPv6")
	clientIPv6: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("userAgent")
	userAgent: String):Response /*returnType = MResponseGetContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__contentDetail(tokenId,clientId,contentId,channelType,clientIPv4,clientIPv6,userAgent)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_contentDetail)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_contentDetail)
	    }
	} 

	@GET
	@Path("/contentDetail")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def contentDetail_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("contentId")contentId_q: String, 
			@QueryParam("channelType")channelType_q: String, 
			@QueryParam("clientIPv4")clientIPv4_q: String, 
			@QueryParam("clientIPv6")clientIPv6_q: String, 
			@QueryParam("userAgent")userAgent_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__contentDetail(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,contentId_q,channelType_q,clientIPv4_q,clientIPv6_q,userAgent_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_contentDetail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_contentDetail)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __contentDetail(tokenId: String, clientId: String, contentId: String, channelType: String, clientIPv4: String, clientIPv6: String, userAgent: String) :MResponseGetContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_contentDetail: String

	/**
	 * return the content information for the selected channel type., like published url or smil/m3u8 urls
	 * or other descriptors for the selected channel type.
	 * If the channelType is not defined, the service return the right descriptor for the giver useragent.
	 * 
	 * useragent = mobile/desktop
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param channelType : String
	 * @param userAgent : String
	 * Possible values are:
	 * iphone
	 * ipad
	 * phone7
	 * android (for mobile device using flash)
	 * silverlight
	 * generic (for web devices using flash)
	 * @return MResponseGetContent
	*/
	@GET
	@Path("/getContent")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getContent", notes = """return the content information for the selected channel type., like published url or smil/m3u8 urls or other descriptors for the selected channel type.
	//#SWGNL#If the channelType is not defined, the service return the right descriptor for the giver useragent.
	//#SWGNL#useragent = mobile/desktop""", response = classOf[MResponseGetContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getContent(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("channelType")
	channelType: String, 
			//#SWG#@ApiParam(value = """Possible values are:
	//#SWGNL#iphone
	//#SWGNL#ipad
	//#SWGNL#phone7
	//#SWGNL#android (for mobile device using flash)
	//#SWGNL#silverlight 
	//#SWGNL#generic (for web devices using flash)""")
	@QueryParam("userAgent")
	userAgent: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetContent*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getContent") 
		try{	
			val resp = this.__getContent(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,contentId,channelType,userAgent)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContent)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContent)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContent(tokenId: String, clientId: String, contentId: String, channelType: String, userAgent: String) :MResponseGetContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContent: String

	/**
	 * Return the specific descriptor for the content. (only the content descriptor to use with a player).
	 * The webservice has two endpoint. The http://<clientId>-view.4me.
	 * it/api/xpublisher/resources/weebopublisher/getContentDescriptor.m3u8 endpoint is used for the
	 * mobile devices (iphone/android)
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: has two endpoint. http://<clientId>-view.4me.
	 * it/api/xpublisher/resources/weebopublisher/getContentDescriptor http://<clientId>-view.4me.
	 * it/api/xpublisher/resources/weebopublisher/getContentDescriptor.m3u8</li>
	 * 	<li>WSDL: not available</li>
	 * </ul>
	 * 
	 * Specify the channelType parameter only when the user desire the specific descriptor of a channel,
	 * otherwise the player use the descriptor compliant with the proper userAgent.
	 * 
	 * userAgent="mobile" looks for the given channel types:
	 * 1. STREAMHTTPIOSHD
	 * 2. STREAMHTTPIOS
	 * 3. WEBIPHONEHD
	 * 4. WEBIPHONE
	 * 
	 * userAgent="other" used for old mobile devices like Blackberry and Android, looks for the given
	 * channel types:
	 * 1. WEBIPHONEHD
	 * 2. WEBIPHONE
	 * 
	 * userAgent="desktop" used with desktop device with flash player, looks for the given channel types:
	 * 1. STREAMHTTPFLASHHD
	 * 2. STREAMHTTPFLASH
	 * 3. WEBHD
	 * 4. WEB
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param channelType : String
	 * Option not required
	 * @param userAgent : String
	 * Optional .Possible values are:
	 * iphone
	 * ipad
	 * phone7
	 * android (for mobile device using flash)
	 * silverlight
	 * generic (for web devices using flash)
	 * @return String
	*/
	@GET
	@Path("/getContentDescriptor")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getContentDescriptor", notes = """Return the specific descriptor for the content. (only the content descriptor to use with a player). The webservice has two endpoint. The http://<clientId>-view.4me.it/api/xpublisher/resources/weebopublisher/getContentDescriptor.m3u8 endpoint is used for the mobile devices (iphone/android)
	//#SWGNL#
	//#SWGNL#<b>Web Service Endpoints</b>:
	//#SWGNL#<ul>
	//#SWGNL#	<li>REST: has two endpoint. http://<clientId>-view.4me.it/api/xpublisher/resources/weebopublisher/getContentDescriptor http://<clientId>-view.4me.it/api/xpublisher/resources/weebopublisher/getContentDescriptor.m3u8</li>
	//#SWGNL#	<li>WSDL: not available</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Specify the channelType parameter only when the user desire the specific descriptor of a channel, otherwise the player use the descriptor compliant with the proper userAgent.
	//#SWGNL#
	//#SWGNL#userAgent="mobile" looks for the given channel types:
	//#SWGNL#1. STREAMHTTPIOSHD
	//#SWGNL#2. STREAMHTTPIOS
	//#SWGNL#3. WEBIPHONEHD
	//#SWGNL#4. WEBIPHONE
	//#SWGNL#
	//#SWGNL#userAgent="other" used for old mobile devices like Blackberry and Android, looks for the given channel types:
	//#SWGNL#1. WEBIPHONEHD
	//#SWGNL#2. WEBIPHONE
	//#SWGNL#
	//#SWGNL#userAgent="desktop" used with desktop device with flash player, looks for the given channel types:
	//#SWGNL#1. STREAMHTTPFLASHHD
	//#SWGNL#2. STREAMHTTPFLASH
	//#SWGNL#3. WEBHD
	//#SWGNL#4. WEB""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getContentDescriptor(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """Option not required""")
	@QueryParam("channelType")
	channelType: String, 
			//#SWG#@ApiParam(value = """Optional .Possible values are:
	//#SWGNL#iphone
	//#SWGNL#ipad
	//#SWGNL#phone7
	//#SWGNL#android (for mobile device using flash)
	//#SWGNL#silverlight 
	//#SWGNL#generic (for web devices using flash)""")
	@QueryParam("userAgent")
	userAgent: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = String*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getContentDescriptor") 
		try{	
			val resp = this.__getContentDescriptor(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,contentId,channelType,userAgent)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContentDescriptor)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentDescriptor)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentDescriptor(tokenId: String, clientId: String, contentId: String, channelType: String, userAgent: String) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentDescriptor: String

	/**
	 * returns the total space used in 4me CDN. Each client has a quota of storage for the published
	 * content in CDN.
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseGetQuota
	*/
	@GET
	@Path("/getQuotaUsage")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getQuotaUsage", notes = """returns the total space used in 4me CDN. Each client has a quota of storage for the published content in CDN.""", response = classOf[MResponseGetQuota])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getQuotaUsage(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetQuota*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getQuotaUsage") 
		try{	
			val resp = this.__getQuotaUsage(PRestHelper.getTokenId(tokenId_q, tokenId),clientId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getQuotaUsage)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getQuotaUsage)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getQuotaUsage(tokenId: String, clientId: String) :MResponseGetQuota
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getQuotaUsage: String

	/**
	 * returns the total space used in CDN by each userId (the owner of the published content)
	 * @param tokenId : String
	 * @param param : MWeeboPublishergetQuotaUsageByUserIdReq
	 * @return MResponseGetQuotaUsage
	*/
	@POST
	@Path("/getQuotaUsageByUserId")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/getQuotaUsageByUserId", notes = """returns the total space used in CDN by each userId (the owner of the published content)""", response = classOf[MResponseGetQuotaUsage])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def getQuotaUsageByUserId(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MWeeboPublishergetQuotaUsageByUserIdReq):Response /*returnType = MResponseGetQuotaUsage*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__getQuotaUsageByUserId(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_getQuotaUsageByUserId)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_getQuotaUsageByUserId)
	    }
	} 

	@GET
	@Path("/getQuotaUsageByUserId")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def getQuotaUsageByUserId_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetQuotaUsage*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__getQuotaUsageByUserId(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MWeeboPublishergetQuotaUsageByUserIdReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_getQuotaUsageByUserId)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getQuotaUsageByUserId)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getQuotaUsageByUserId(tokenId: String, param: MWeeboPublishergetQuotaUsageByUserIdReq) :MResponseGetQuotaUsage
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getQuotaUsageByUserId: String

}