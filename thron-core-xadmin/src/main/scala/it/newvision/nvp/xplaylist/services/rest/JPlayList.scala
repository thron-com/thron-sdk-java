package it.newvision.nvp.xplaylist.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xplaylist.services.model.playlist.MResponsePlayListDescriptor

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Playlist service is used to deliver the content descriptor to a client
 * enabled to play the contents returned by the service. This service has no SOAP
 * web service interface, and the content result is cached.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/xadmin/resources/playlist/</li>
 * </ul>
 * <ul>
 * 	<li>WADL REST service: http://clientId-view.4me.
 * it/api/xadmin/resources/application.wadl</li>
 * </ul>
 */
@Path("/playlist")
//#SWG#@Api(value = "/playlist", description = """The Playlist service is used to deliver the content descriptor to a client enabled to play the contents returned by the service. This service has no SOAP web service interface, and the content result is cached.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.4me.it/api/xadmin/resources/playlist/</li>
//#SWGNL#</ul>
//#SWGNL#<ul>
//#SWGNL#	<li>WADL REST service: http://clientId-view.4me.it/api/xadmin/resources/application.wadl</li>
//#SWGNL#</ul>""")
trait JPlayList extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param xpublisherId : String
	 * @param locale : String
	 * @param offset : Integer
	 * @param numberOfResult : Integer
	 * @param channelType : String
	 * @param clientIPv4 : String
	 * @param clientIPv6 : String
	 * @param userAgent : String
	 * @param authServiceForCallback : String
	 * @return MResponsePlayListDescriptor
	*/
	@GET
	@Path("getContentDescriptor")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	def getContentDescriptor(@HeaderParam("X-TOKENID")
	tokenId: String, 
			@QueryParam("clientId")
	clientId: String, 
			@QueryParam("xpublisherId")
	xpublisherId: String, 
			@QueryParam("locale")
	locale: String, 
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
			@QueryParam("USERAGENT")
	userAgent: String, 
			@HeaderParam("X-AUTHSERVICEFORCALLBACK")
	authServiceForCallback: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponsePlayListDescriptor*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getContentDescriptor") 
		try{	
			val resp = this.__getContentDescriptor(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,xpublisherId,locale,offset,numberOfResult,channelType,clientIPv4,clientIPv6,userAgent,authServiceForCallback)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContentDescriptor)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentDescriptor)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentDescriptor(tokenId: String, clientId: String, xpublisherId: String, locale: String, offset: Integer, numberOfResult: Integer, channelType: String, clientIPv4: String, clientIPv6: String, userAgent: String, authServiceForCallback: String) :MResponsePlayListDescriptor
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentDescriptor: String

}