package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPublicClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * This service is optimized for the delivery of public resources
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-cdn.thron.com/delivery/public</li>
 * </ul>
 */
class JPublicClient(val resourceEndpoint:String) {

	/**
	 * This service provides the image of a given IMAGE content with the desired resolution and quality:
	 * THRON will automatically process the highest available quality image to apply cropping and resize
	 * algorithms that match your request, as specified by URL parameters expressed after ContentID.
	 * For backward compatibility, if no additional query param is provided, the service will return the
	 * image of the exact width of the divArea while height will respect the aspect ratio.
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error ,</li>
	 * 	<li>307: redirects to resulting image,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId (no prettyId or externalId) of the content

	 * @param pkey : String
	 * The access key for the content
	 * @param prettyName : String
	 * a pretty short name of the content with the file extension (for seo optimisation).
	 * Like:
	 * * product-detail.html
	 * * post-review.html

	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the descriptor of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return java.io.File
	*/
	def pagelet(tokenId: String, 
			clientId: String, 
			id: String, 
			pkey: String, 
			prettyName: String, 
			lcid: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublicClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(lcid).foreach(s => params.add("lcid", s))
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("public/pagelet")
					.path(clientId.toString)
		.path(id.toString)
		.path(pkey.toString)
		.path(prettyName.toString)
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
	 * This service provides the document of a given OTHER content with the desired resolution and quality:
	 * THRON will automatically process the highest available quality image to apply cropping and resize
	 * algorithms that match your request, as specified by URL parameters expressed after ContentID.
	 * For backward compatibility, if no additional query param is provided, the service will return the
	 * image of the exact width of the divArea while height will respect the aspect ratio.
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error ,</li>
	 * 	<li>307: redirects to resulting image,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId (no prettyId or externalId) of the content

	 * @param pkey : String
	 * The access key for the content
	 * @param channelType : String
	 * The specific channel code (WEB,WEBHD...)
	 * @param prettyName : String
	 * a pretty short name of the content with the file extension (seo optimisation).
	 * Like:
	 * * mountain-collection.zip

	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the descriptor of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return java.io.File
	*/
	def document(tokenId: String, 
			clientId: String, 
			id: String, 
			pkey: String, 
			channelType: String, 
			prettyName: String, 
			lcid: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublicClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(lcid).foreach(s => params.add("lcid", s))
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("public/document")
					.path(clientId.toString)
		.path(id.toString)
		.path(pkey.toString)
		.path(channelType.toString)
		.path(prettyName.toString)
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
	 * This service provides the audio source of a given AUDIO content with the desired resolution and
	 * quality: THRON will automatically process the highest available quality image to apply cropping and
	 * resize algorithms that match your request, as specified by URL parameters expressed after ContentID.
	 * 
	 * For backward compatibility, if no additional query param is provided, the service will return the
	 * image of the exact width of the divArea while height will respect the aspect ratio.
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error ,</li>
	 * 	<li>307: redirects to resulting image,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId (no prettyId or externalId) of the content

	 * @param pkey : String
	 * The access key for the content
	 * @param channelType : String
	 * The specific channel code (WEB,WEBHD...)
	 * @param prettyName : String
	 * a pretty short name of the content with the file extension (seo optimisation).
	 * Like:
	 * * song.mp3

	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the descriptor of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return java.io.File
	*/
	def audio(tokenId: String, 
			clientId: String, 
			id: String, 
			pkey: String, 
			channelType: String, 
			prettyName: String, 
			lcid: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublicClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(lcid).foreach(s => params.add("lcid", s))
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("public/audio")
					.path(clientId.toString)
		.path(id.toString)
		.path(pkey.toString)
		.path(channelType.toString)
		.path(prettyName.toString)
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
	 * NOT DOCUMENTED IN DEVELOPER PORTAL.
	 * Protected by deliveryToken
	 * 
	 * This service provides the video source of a given VIDEO content with the desired resolution and
	 * quality: THRON will automatically process the highest available quality image to apply cropping and
	 * resize algorithms that match your request, as specified by URL parameters expressed after ContentID.
	 * 
	 * For backward compatibility, if no additional query param is provided, the service will return the
	 * image of the exact width of the divArea while height will respect the aspect ratio.
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error ,</li>
	 * 	<li>307: redirects to resulting image,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId (no prettyId or externalId) of the content

	 * @param pkey : String
	 * The access key for the content
	 * @param channelType : String
	 * The specific channel code (WEB,WEBHD...)
	 * @param prettyName : String
	 * a pretty short name of the content with the file extension (seo optimisation).
	 * Like:
	 * * video-wall.mp4

	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the descriptor of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @return java.io.File
	*/
	def video(tokenId: String, 
			clientId: String, 
			id: String, 
			pkey: String, 
			channelType: String, 
			prettyName: String, 
			lcid: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublicClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(lcid).foreach(s => params.add("lcid", s))
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("public/video")
					.path(clientId.toString)
		.path(id.toString)
		.path(pkey.toString)
		.path(channelType.toString)
		.path(prettyName.toString)
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
	 * This service provides the thumbnail of a given content with the desired resolution and quality:
	 * THRON will automatically process the highest available quality image to apply cropping and resize
	 * algorithms that match your request, as specified by URL parameters expressed after ContentID.
	 * For backward compatibility, if no additional query param is provided, the service will return the
	 * image of the exact width of the divArea while height will respect the aspect ratio.
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments, </li>
	 * 	<li>404: content not found, </li>
	 * 	<li>500: generic error , </li>
	 * 	<li>307: redirects to resulting image, </li>
	 * 	<li>200: ok. </li>
	 * </ul>
	 * 
	 * If no thumbnail is available, a default fallback image will be provided.
	 * This service is public: authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId (no prettyId or externalId) of the content

	 * @param pkey : String
	 * The access key for the content
	 * @param preset : String
	 * RTIE preset value. Default value is "std"
	 * @param divArea : String
	 * The desired WidthxHeight of the resulting image. If higher than the original thumbnail resolution,
	 * no processing will be performed
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints, keeping the aspet ration)
	 * @param prettyName : String
	 * a pretty short name of the content with the file extension (seo optimisation).
	 * Like:
	 * * mountain-landscape.jpg
	 * * sport-car.jpg
	 * * brown-bag.png

	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the descriptor of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @param scalemode : String
	 * Optional. RTIE parameter
	 * @param quality : Integer
	 * Optional. RTIE parameter
	 * @param cropmode : String
	 * Optional. RTIE parameter
	 * @param cropx : Double
	 * Optional. RTIE parameter
	 * @param cropy : Double
	 * Optional. RTIE parameter
	 * @param cropw : Double
	 * Optional. RTIE parameter
	 * @param croph : Double
	 * Optional. RTIE parameter
	 * @return java.io.File
	*/
	def image(tokenId: String, 
			clientId: String, 
			id: String, 
			pkey: String, 
			preset: String, 
			divArea: String, 
			prettyName: String, 
			lcid: String, 
			scalemode: String, 
			quality: Integer, 
			cropmode: String, 
			cropx: Double, 
			cropy: Double, 
			cropw: Double, 
			croph: Double)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublicClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(lcid).foreach(s => params.add("lcid", s))
		Option(scalemode).foreach(s => params.add("scalemode", s))
		Option(quality).foreach(s => params.add("quality", s))
		Option(cropmode).foreach(s => params.add("cropmode", s))
		Option(cropx).foreach(s => params.add("cropx", s))
		Option(cropy).foreach(s => params.add("cropy", s))
		Option(cropw).foreach(s => params.add("cropw", s))
		Option(croph).foreach(s => params.add("croph", s))
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("public/image")
					.path(clientId.toString)
		.path(id.toString)
		.path(pkey.toString)
		.path(preset.toString)
		.path(divArea.toString)
		.path(prettyName.toString)
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
	 * This service provides the thumbnail of a given content with the desired resolution and quality:
	 * THRON will automatically process the highest available quality image to apply cropping and resize
	 * algorithms that match your request, as specified by URL parameters expressed after ContentID.
	 * For backward compatibility, if no additional query param is provided, the service will return the
	 * image of the exact width of the divArea while height will respect the aspect ratio.
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments, </li>
	 * 	<li>404: content not found, </li>
	 * 	<li>500: generic error , </li>
	 * 	<li>307: redirects to resulting image, </li>
	 * 	<li>200: ok. </li>
	 * </ul>
	 * 
	 * If no thumbnail is available, a default fallback image will be provided.
	 * This service is public: authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId (no prettyId or externalId) of the content

	 * @param pkey : String
	 * The access key for the content
	 * @param preset : String
	 * RTIE preset value. Default value is "std"
	 * @param divArea : String
	 * The desired WidthxHeight of the resulting image. If higher than the original thumbnail resolution,
	 * no processing will be performed
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints, keeping the aspet ration)
	 * @param prettyName : String
	 * a pretty short name of the content with the file extension (seo optimisation).
	 * Like:
	 * * mountain-landscape.jpg
	 * * sport-car.jpg
	 * * brown-bag.png

	 * @param lcid : String
	 * Optional. the xcontentId of the main linked content
	 * This parameter is used to have the descriptor of a linked/recommended content. The ACL of a
	 * recommended content are validated on the context of the main content.
	 * @param scalemode : String
	 * Optional. RTIE parameter
	 * @param quality : Integer
	 * Optional. RTIE parameter
	 * @param cropmode : String
	 * Optional. RTIE parameter
	 * @param cropx : Double
	 * Optional. RTIE parameter
	 * @param cropy : Double
	 * Optional. RTIE parameter
	 * @param cropw : Double
	 * Optional. RTIE parameter
	 * @param croph : Double
	 * Optional. RTIE parameter
	 * @return java.io.File
	*/
	def thumbnail(tokenId: String, 
			clientId: String, 
			id: String, 
			pkey: String, 
			preset: String, 
			divArea: String, 
			prettyName: String, 
			lcid: String, 
			scalemode: String, 
			quality: Integer, 
			cropmode: String, 
			cropx: Double, 
			cropy: Double, 
			cropw: Double, 
			croph: Double)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
		  import scala.collection.JavaConversions._
		  try{
			val webResource = JPublicClient.client.resource(this.resourceEndpoint)
			val params = new com.sun.jersey.core.util.MultivaluedMapImpl
			Option(lcid).foreach(s => params.add("lcid", s))
		Option(scalemode).foreach(s => params.add("scalemode", s))
		Option(quality).foreach(s => params.add("quality", s))
		Option(cropmode).foreach(s => params.add("cropmode", s))
		Option(cropx).foreach(s => params.add("cropx", s))
		Option(cropy).foreach(s => params.add("cropy", s))
		Option(cropw).foreach(s => params.add("cropw", s))
		Option(croph).foreach(s => params.add("croph", s))
			val response : java.io.File = if(this.resourceEndpoint == ""){
			
				null
			
			}else{
				var wbuilder = webResource.queryParams(params)
					.path("public/thumbnail")
					.path(clientId.toString)
		.path(id.toString)
		.path(pkey.toString)
		.path(preset.toString)
		.path(divArea.toString)
		.path(prettyName.toString)
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

}