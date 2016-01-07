package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetContent
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetContentDetail
import it.newvision.nvp.webtv.services.model.playlist.MResponsePlayListDescriptor
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetCuePoints
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetDownloadableContents
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetRecommendedContents
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetSimilarContents
import it.newvision.nvp.webtv.services.model.delivery.MResponseDeliveryGetPlaylistContents

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JDeliveryClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is optimized for the delivery, and provide a set of services to
 * get the content detail information necessary for Thron Player.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xcontents/resources/delivery/ </li>
 * </ul>
 */
class JDeliveryClient(val resourceEndpoint:String) {

	/**
	 * Deprecated by "getContentDetail" service.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional.If the user desires to have the content description for a specific locale.
	 * The desired locale is return as first element of the array (if exists).
	 * The service always return all available locales of the content.
	 * @param channelType : String
	 * Optional
	 * @param userAgent : String
	 * Possible values are: mobile/desktop/other. If channelType and userAgent are empty, the default
	 * userAgent is desktop
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @return MResponseDeliveryGetContent
	*/
	@Deprecated
	def getContent(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			xpublisherId: String, 
			locale: String, 
			channelType: String, 
			userAgent: String, 
			pkey: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeliveryGetContent ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(xcontentId).foreach(s => params.add("xcontentId", s))
		Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(channelType).foreach(s => params.add("channelType", s))
		Option(userAgent).foreach(s => params.add("userAgent", s))
		Option(pkey).foreach(s => params.add("pkey", s))
			val response : MResponseDeliveryGetContent = if(this.resourceEndpoint == ""){
			
				new MResponseDeliveryGetContent()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("delivery/getContent")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDeliveryGetContent])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeliveryGetContent])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * The service is used to return all content's metadata, aggregated with the specific channel details
	 * (like thumbnails url, descriptor urls).
	 * This service is used by THRON player to display name, content's description and to trace the events
	 * for statistics purpose. it supports jsonp callback using the callback queryparam.
	 * <b>
	 * </b><b>Limits:</b>
	 * <ul>
	 * 	<li>It does not return the list of comments associated with the content. </li>
	 * </ul>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getContentDetail</li>
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
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the descriptor of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return MResponseDeliveryGetContentDetail
	*/
	def getContentDetail(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			xpublisherId: String, 
			locale: String, 
			linkedChannelType: String, 
			linkedUserAgent: String, 
			divArea: String, 
			pkey: String, 
			lcid: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeliveryGetContentDetail ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(xcontentId).foreach(s => params.add("xcontentId", s))
		Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(linkedChannelType).foreach(s => params.add("linkedChannelType", s))
		Option(linkedUserAgent).foreach(s => params.add("linkedUserAgent", s))
		Option(divArea).foreach(s => params.add("divArea", s))
		Option(pkey).foreach(s => params.add("pkey", s))
		Option(lcid).foreach(s => params.add("lcid", s))
			val response : MResponseDeliveryGetContentDetail = if(this.resourceEndpoint == ""){
			
				new MResponseDeliveryGetContentDetail()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("delivery/getContentDetail")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDeliveryGetContentDetail])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeliveryGetContentDetail])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xpublisherId : String
	 * @param locale : String
	 * @param withItemMetadatas : Boolean
	 * @param offset : Integer
	 * @param numberOfResult : Integer
	 * @param channelType : String
	 * @param clientIPv4 : String
	 * @param clientIPv6 : String
	 * @param userAgent : String
	 * @param authServiceForCallback : String
	 * @return MResponsePlayListDescriptor
	*/
	def getPlayListDescriptor(tokenId: String, 
			clientId: String, 
			xpublisherId: String, 
			locale: String, 
			withItemMetadatas: Boolean, 
			offset: Integer, 
			numberOfResult: Integer, 
			channelType: String, 
			clientIPv4: String, 
			clientIPv6: String, 
			userAgent: String, 
			authServiceForCallback: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponsePlayListDescriptor ={
		try{
					val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
					val params = new com.sun.jersey.core.util.MultivaluedMapImpl
					Option(clientId).foreach(s => params.add("clientId", s))
					Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
					Option(locale).foreach(s => params.add("locale", s))
					Option(withItemMetadatas).foreach(s => params.add("withItemMetadatas", s))
					Option(offset).foreach(s => params.add("offset", s))
					Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
					Option(channelType).foreach(s => params.add("channelType", s))
					Option(channelType).foreach(s => params.add("channelType", s))
					Option(userAgent).foreach(s => params.add("USERAGENT", s))
					val response : MResponsePlayListDescriptor = webResource.queryParams(params)
						.path("delivery/getPlayListDescriptor")
						.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
						.header("X-TOKENID",tokenId)
						.header("X-CLIENTIPV4",clientIPv4)
						.header("X-CLIENTIPV6",clientIPv6)
						.header("X-AUTHSERVICEFORCALLBACK",authServiceForCallback)
						.get(classOf[MResponsePlayListDescriptor])
					response
				  }catch{
					case e : com.sun.jersey.api.client.UniformInterfaceException =>
						val response = e.getResponse
						if(response.getStatus >= 418) {
						  response.getEntity(classOf[MResponsePlayListDescriptor])
						}
						else {
						  throw e
						}
				  }
	}

	/**
	 * The service is used to return the thumbnail for a specific content fitting a given area (display
	 * area). Authentication token is not required (X-TOKENID).
	 * The service return HTTP status:
	 * * 400: in case of invalid arguments
	 * * 404: in case of content
	 * * 500: in case of generic errors
	 * * 307: redirect to the resource.
	 * 
	 * The service returns a default thumbnail for contents without specific thumbnails. 
	 * @param tokenId : String
	 * @param clientId : String
	 * @param divArea : String
	 * Define the area where the thumbnail should be displayed. The service will return the thumbnail
	 * whose size will be the closest to the div area, choosing it among those available within the
	 * platform, priority is set to the biggest thumbnail available. Nonetheless, there is a method to
	 * force the lower or the upper thumbnail closest to your <div> size, among those available: you just
	 * have to append "u" (upper) or "l" (lower) next to your divArea.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768
	 * DivArea format 0x0 means the thumbs in the smallest format.

	 * @param id : String
	 * The service accept the xpublisherId or xcontentId of the content. One of these parameters is
	 * required and shold end with ".jpg" label
	 * Example: .../219f61ee-72b6-476a-be17-5cd4f9fa94f1.jpg

	 * @return java.io.File
	*/
	def getThumbnail(tokenId: String, 
			clientId: String, 
			divArea: String, 
			id: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("delivery/getThumbnail")
					.path(clientId.toString)
		.path(divArea.toString)
		.path(id.toString)
					.accept(javax.ws.rs.core.MediaType.WILDCARD)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[java.io.File])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[java.io.File])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * The service is used to return the content cuepoints for a public content.
	 * The REST webservice is enabled for jsonp callback using the callback queryparam
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getCuePoints</li>
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
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the cuepoints of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return MResponseDeliveryGetCuePoints
	*/
	def getCuePoints(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			xpublisherId: String, 
			cuePointTypes: String, 
			actions: String, 
			startTime: Integer, 
			endTime: Integer, 
			draft: Boolean, 
			username: String, 
			cuePointGroup: String, 
			offset: Integer, 
			numberOfResult: Integer, 
			pkey: String, 
			lcid: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeliveryGetCuePoints ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(xcontentId).foreach(s => params.add("xcontentId", s))
		Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
		Option(cuePointTypes).foreach(s => params.add("cuePointTypes", s))
		Option(actions).foreach(s => params.add("actions", s))
		Option(startTime).foreach(s => params.add("startTime", s))
		Option(endTime).foreach(s => params.add("endTime", s))
		Option(draft).foreach(s => params.add("draft", s))
		Option(username).foreach(s => params.add("username", s))
		Option(cuePointGroup).foreach(s => params.add("cuePointGroup", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
		Option(pkey).foreach(s => params.add("pkey", s))
		Option(lcid).foreach(s => params.add("lcid", s))
			val response : MResponseDeliveryGetCuePoints = if(this.resourceEndpoint == ""){
			
				new MResponseDeliveryGetCuePoints()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("delivery/getCuePoints")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDeliveryGetCuePoints])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeliveryGetCuePoints])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * The service is used to return only the content subtitles in srt format for a public content and for
	 * a single locale.
	 * Subtitles are archived as cuepoints but this service is used to return the list in the standard srt
	 * format
	 * The REST webservice is enabled for jsonp callback using the callback queryparam
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.com/api/xcontents/resources/delivery/getSubTitles</li>
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
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the subtitles of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return String
	*/
	def getSubTitles(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			xpublisherId: String, 
			locale: String, 
			pkey: String, 
			lcid: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):String ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(xcontentId).foreach(s => params.add("xcontentId", s))
		Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(pkey).foreach(s => params.add("pkey", s))
		Option(lcid).foreach(s => params.add("lcid", s))
			val response : String = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("delivery/getSubTitles")
				
					.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[String])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[String])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * The service is used to return the list of "Downloadable Contents" linked to a specified content
	 * without "UNLINKABLE" in MContent.properties .
	 * The REST webservice is enabled for jsonp callback using the callback queryparam
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.
	 * com/api/xcontents/resources/delivery/getDownloadableContents</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred locale for the content results.
	 * Locale fallback logic used in MContentWallMinimal:
	 * 1) content has locale == locale (the parameter)
	 * 2) content has locale == EN
	 * 3) content has one locale
	 * 4) otherwise contents.name, contents.locale,contents.description are empty
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
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
	 * A1 -> has D1,D2 has downloadable contents
	 * 
	 * To show the list of downloadable contents of A1 (on the context fo A):
	 * xcontentId = A1
	 * lcid = A
	 * pkey = pkey/token of A
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @return MResponseDeliveryGetDownloadableContents
	*/
	def getDownloadableContents(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			xpublisherId: String, 
			locale: String, 
			pkey: String, 
			admin: Boolean, 
			lcid: String, 
			divArea: String, 
			offset: Integer, 
			numberOfResult: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeliveryGetDownloadableContents ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(xcontentId).foreach(s => params.add("xcontentId", s))
		Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(pkey).foreach(s => params.add("pkey", s))
		Option(admin).foreach(s => params.add("admin", s))
		Option(lcid).foreach(s => params.add("lcid", s))
		Option(divArea).foreach(s => params.add("divArea", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
			val response : MResponseDeliveryGetDownloadableContents = if(this.resourceEndpoint == ""){
			
				new MResponseDeliveryGetDownloadableContents()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("delivery/getDownloadableContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDeliveryGetDownloadableContents])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeliveryGetDownloadableContents])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * The service is used to return the list of "Recommended Contents" linked to a specified content. The
	 * REST webservice is enabled for jsonp callback using the callback queryparam
	 * <b>
	 * </b><b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * 
	 * <b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.
	 * com/api/xcontents/resources/delivery/getRecommendedContents</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred local for the content results.
	 * Locale fallback logic used in MContentWallMinimal:
	 * 1) content has locale == locale (the parameter)
	 * 2) content has locale == EN
	 * 3) content has one locale
	 * 4) otherwise contents.name, contents.locale,contents.description are empty
	 * @param linkedChannelType : String
	 * Used to filter the linekdcontents available on some channels.The list of values is represented as
	 * comma separated value, and the attribute is optional.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	 * @param linkedUserAgent : String
	 * Used to filter the linekdcontents available/compliant with a specific userAgent.The attribute is
	 * optional.
	 * Possible values are: mobile/desktop/other
	 * @param pkey : String
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
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Default and maximum value is 50 items
	 * @return MResponseDeliveryGetRecommendedContents
	*/
	def getRecommendedContents(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			xpublisherId: String, 
			locale: String, 
			linkedChannelType: String, 
			linkedUserAgent: String, 
			pkey: String, 
			admin: Boolean, 
			divArea: String, 
			offset: Integer, 
			numberOfResult: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeliveryGetRecommendedContents ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(xcontentId).foreach(s => params.add("xcontentId", s))
		Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(linkedChannelType).foreach(s => params.add("linkedChannelType", s))
		Option(linkedUserAgent).foreach(s => params.add("linkedUserAgent", s))
		Option(pkey).foreach(s => params.add("pkey", s))
		Option(admin).foreach(s => params.add("admin", s))
		Option(divArea).foreach(s => params.add("divArea", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
			val response : MResponseDeliveryGetRecommendedContents = if(this.resourceEndpoint == ""){
			
				new MResponseDeliveryGetRecommendedContents()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("delivery/getRecommendedContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDeliveryGetRecommendedContents])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeliveryGetRecommendedContents])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * DEPRECATED. Only for clients with 3.x release.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred local for the content results.
	 * Locale fallback logic used in MContentWallMinimal:
	 * 1) content has locale == locale (the parameter)
	 * 2) content has locale == EN
	 * @param linkedChannelType : String
	 * Optional. Used to filter the linekdcontents available on some channels.The list of values is
	 * represented as comma separated value, and the attribute is optional.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	 * @param linkedUserAgent : String
	 * Optional. Used to filter the linekdcontents available/compliant with a specific userAgent.The
	 * attribute is optional.
	 * Possible values are: mobile/desktop/other
	 * @param pkey : String
	 * Optional, the access key for the content. Can be the tokenId for a logged user or the access key
	 * for the content.
	 * It's not required for public contents
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @return MResponseDeliveryGetSimilarContents
	*/
	def getSimilarContents(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			xpublisherId: String, 
			locale: String, 
			linkedChannelType: String, 
			linkedUserAgent: String, 
			pkey: String, 
			divArea: String, 
			offset: Integer, 
			numberOfResult: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeliveryGetSimilarContents ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(xcontentId).foreach(s => params.add("xcontentId", s))
		Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(linkedChannelType).foreach(s => params.add("linkedChannelType", s))
		Option(linkedUserAgent).foreach(s => params.add("linkedUserAgent", s))
		Option(pkey).foreach(s => params.add("pkey", s))
		Option(divArea).foreach(s => params.add("divArea", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
			val response : MResponseDeliveryGetSimilarContents = if(this.resourceEndpoint == ""){
			
				new MResponseDeliveryGetSimilarContents()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("delivery/getSimilarContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDeliveryGetSimilarContents])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeliveryGetSimilarContents])
				}
				else {
					throw e
				}
			
		  }
	
	}

	/**
	 * The service is used to return the list of "Playlist items" linked to a specified Playlist. The REST
	 * webservice is enabled for jsonp callback using the callback queryparam
	 * 
	 * <b>Limits:</b>
	 * <ul>
	 * 	<li>For clientId working on 4.x mode, the pkey parameter is required because it's used to validate
	 * the user session or specific keys used to share the content (shareboard feature).if the pkey is not
	 * valid the service return an error response like CONTENT_NOT_FOUND</li>
	 * </ul>
	 * <b>
	 * </b><b>Web Service Endpoints</b>:
	 * <ul>
	 * 	<li>REST: http://clientId-view.thron.
	 * com/api/xcontents/resources/delivery/getPlaylistContents</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xcontentId : String
	 * Optional
	 * @param xpublisherId : String
	 * Optional
	 * @param locale : String
	 * Optional. Used as preferred local for the content results.
	 * Locale fallback logic used in MContentWallMinimal:
	 * 1) content has locale == locale (the parameter)
	 * 2) content has locale == EN
	 * 3) content has one locale
	 * 4) otherwise contents.name, contents.locale,contents.description are empty
	 * @param linkedChannelType : String
	 * Optional. Used to filter the linekdcontents available on some channels.The list of values is
	 * represented as comma separated value, and the attribute is optional.
	 * Example: linkedChannelTypes = WEB,STREAMHTTPFLASH,STREAMHTTPIOS
	 * @param linkedUserAgent : String
	 * Optional. Used to filter the linekdcontents available/compliant with a specific userAgent.The
	 * attribute is optional.
	 * Possible values are: mobile/desktop/other
	 * @param pkey : String
	 * Optional.
	 * @param admin : Boolean
	 * Optional. disable the intrinsic filtering of the service, and return all linked contents:
	 * * recommended
	 * * published or not in cdn2
	 * * with property NOT_LINKABLE or not
	 * 
	 * Enabling this parameter, the service can be used in the admin console to show all contents linked
	 * even those unmatching the filters.
	 * @param divArea : String
	 * Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail
	 * that best suits.
	 * Append u/l to get the thumbnail just above/below the limits specified.
	 * Format: <widht>x<height>[u/l] (u is the default value)
	 * Example: 1280x1024, 768x0 (zero means no coinstraints)
	 * @param offset : Integer
	 * Optional
	 * @param numberOfResult : Integer
	 * Optional. Default and maximum value is 50 items
	 * @return MResponseDeliveryGetPlaylistContents
	*/
	def getPlaylistContents(tokenId: String, 
			clientId: String, 
			xcontentId: String, 
			xpublisherId: String, 
			locale: String, 
			linkedChannelType: String, 
			linkedUserAgent: String, 
			pkey: String, 
			admin: Boolean, 
			divArea: String, 
			offset: Integer, 
			numberOfResult: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):MResponseDeliveryGetPlaylistContents ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JDeliveryClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(clientId).foreach(s => params.add("clientId", s))
		Option(xcontentId).foreach(s => params.add("xcontentId", s))
		Option(xpublisherId).foreach(s => params.add("xpublisherId", s))
		Option(locale).foreach(s => params.add("locale", s))
		Option(linkedChannelType).foreach(s => params.add("linkedChannelType", s))
		Option(linkedUserAgent).foreach(s => params.add("linkedUserAgent", s))
		Option(pkey).foreach(s => params.add("pkey", s))
		Option(admin).foreach(s => params.add("admin", s))
		Option(divArea).foreach(s => params.add("divArea", s))
		Option(offset).foreach(s => params.add("offset", s))
		Option(numberOfResult).foreach(s => params.add("numberOfResult", s))
			val response : MResponseDeliveryGetPlaylistContents = if(this.resourceEndpoint == ""){
			
				new MResponseDeliveryGetPlaylistContents()
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("delivery/getPlaylistContents")
				
					.accept(javax.ws.rs.core.MediaType.APPLICATION_XML)
					.header("X-TOKENID",tokenId)	
				Option(_fwdHeaders).foreach(_.foreach(_.foreach{x=> wbuilder= wbuilder.header(x._1,x._2)}))
				wbuilder.get(classOf[MResponseDeliveryGetPlaylistContents])
			}
			response
		  }catch{
			case e : com.sun.jersey.api.client.UniformInterfaceException =>
				val response = e.getResponse
				if(response.getStatus == 418) {
				  response.getEntity(classOf[MResponseDeliveryGetPlaylistContents])
				}
				else {
					throw e
				}
			
		  }
	
	}

}