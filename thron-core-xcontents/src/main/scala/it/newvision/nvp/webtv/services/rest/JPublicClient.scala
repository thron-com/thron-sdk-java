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
 * Optimized service for public resources delivery.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-cdn.thron.com/delivery/public</li>
 * </ul>
 */
class JPublicClient(val resourceEndpoint:String) {

	/**
	 * This service redirect to the content URL.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error,</li>
	 * 	<li>307: redirects to resulting content,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId,  prettyId or externalId of the content

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
	def url(tokenId: String, 
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
					.path("public/url")
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
	 * This service provides the HTML source of a PAGELET content.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error,</li>
	 * 	<li>307: redirects to resulting content,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId,  prettyId or externalId of the content

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
	 * This service provides the resource of a DOCUMENT content, based on the selected channel.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error,</li>
	 * 	<li>307: redirects to resulting content,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId,  prettyId or externalId of the content

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
	 * This service provides the resource of an AUDIO content.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error,</li>
	 * 	<li>307: redirects to resulting content,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId,  prettyId or externalId of the content

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
	 * This service provides the resource of a VIDEO content.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error,</li>
	 * 	<li>307: redirects to resulting content,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId, prettyId or externalId of the content

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
	 * This service provides the thumbnail of an IMAGE content with the desired resolution and quality:
	 * THRON will automatically process the highest available quality image to apply cropping and resize
	 * algorithms that match your request, as specified by URL parameters expressed after ContentId.
	 * For backward compatibility, if no additional query param is provided, the service will return the
	 * image of the exact width of the divArea while height will respect the aspect ratio.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error,</li>
	 * 	<li>307: redirects to resulting content,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * 
	 * If no thumbnail is available, a default fallback image will be provided.
	 * This service is public: authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId, prettyId or externalId of the content

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
	 * @param adjustcrop : String
	 * Optional. When the aspect ratio of the cut and the divArea are different, this parameter defines
	 * the rule to be adopted to handle the output. Available values are: - no (default): no changes are
	 * applied to the crop area, therefore the output image might have a different aspect ratio than the
	 * divArea; - extend: the crop area is potentially expanded (so it might return a slightly "larger"
	 * image) in order to guarantee that the output has an aspect ratio identical to the divArea; - reduce:
	 * the crop area is reduced (so it might return a "smaller" image) in order to guarantee that the
	 * output has an aspect ratio identical to the divArea. This parameter is mutually exclusive with
	 * fillcolor
	 * @param fill : String
	 * Optional. When the divArea is larger than the source image (or selected crop), this parameter
	 * forces the scaling of the output in order to fill the divArea (it ensures that at least one of the
	 * two dimensions is exactly as specified In the divArea). Available values are: - No (default): do
	 * not process the input; - Zoom: scale the image but do not fill it with colored bands in case of
	 * different aspect ratio. In order to ensure the complete respect of the aspect ratio and therefore
	 * the exact dimensions of the output, use the adjustcrop or fillcolor.
	 * @param fillcolor : String
	 * Optional. When the aspect ratio of the divArea is different than the source image, this parameter
	 * extends the output through a specific color. It ensures that the output size is exactly as large as
	 * the divArea. Available values are: - No (default): do not alter the size of the image; - rgba(r,g,
	 * b[,a]): with r,g,b,a from 0 to 255 indicating respectively the levels of red, yellow, blue and
	 * alpha. This parameter is mutually exclusive with adjustcrop. In case of PNG or GIF images with
	 * transparency, the fillcolor parameter indicates the color with which the transparent area will be
	 * replaced in JPG conversion.
	 * @param format : String
	 * Optional. The desired format for the resulting image. Available values are: Auto (default): if
	 * image have transparency keep original format, else convert to JPEG ; - JPEG;  - WEBP (currently
	 * supported by Chrome only). The format parameter can heavily influence the performance because it
	 * allows a lot of weight reduction. If you convert an image from PNG to JPEG you will have a
	 * considerable increase in performance because of the bandwidth used for downloading the image.
	 * @param enhance : String
	 * Optional. This parameter allows you to adjust the color, brightness, contrast and sharpness of the
	 * image, using the form enhance=brightness:100,contrast:100,sharpness:100,color:100. Each parameter
	 * must be provided with an integer between 0 and 200.
	 * @param dpr : Integer
	 * Optional. Device Pixel Ration, available values are [1..1000]
	 * 0-100: zoom out
	 * 100-1000: zoom in
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
			croph: Double, 
			adjustcrop: String, 
			fill: String, 
			fillcolor: String, 
			format: String, 
			enhance: String, 
			dpr: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
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
		Option(adjustcrop).foreach(s => params.add("adjustcrop", s))
		Option(fill).foreach(s => params.add("fill", s))
		Option(fillcolor).foreach(s => params.add("fillcolor", s))
		Option(format).foreach(s => params.add("format", s))
		Option(enhance).foreach(s => params.add("enhance", s))
		Option(dpr).foreach(s => params.add("dpr", s))
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
	 * This service provides the thumbnail of a content with the desired resolution and quality: THRON
	 * will automatically process the highest available quality image to apply cropping and resize
	 * algorithms that match your request, as specified by URL parameters expressed after ContentId.
	 * For backward compatibility, if no additional query param is provided, the service will return the
	 * image of the exact width of the divArea while height will respect the aspect ratio.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * 
	 * HTTP status codes:
	 * <ul>
	 * 	<li>400: invalid arguments,</li>
	 * 	<li>404: content not found,</li>
	 * 	<li>500: generic error,</li>
	 * 	<li>307: redirects to resulting content,</li>
	 * 	<li>200: ok.</li>
	 * </ul>
	 * 
	 * If no thumbnail is available, a default fallback image will be provided.
	 * This service is public: authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * Domain name used to access THRON
	 * @param id : String
	 * The xcontentId, prettyId or externalId of the content

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
	 * @param adjustcrop : String
	 * Optional. When the aspect ratio of the cut and the divArea are different, this parameter defines
	 * the rule to be adopted to handle the output. Available values are: - no (default): no changes are
	 * applied to the crop area, therefore the output image might have a different aspect ratio than the
	 * divArea; - extend: the crop area is potentially expanded (so it might return a slightly "larger"
	 * image) in order to guarantee that the output has an aspect ratio identical to the divArea; - reduce:
	 * the crop area is reduced (so it might return a "smaller" image) in order to guarantee that the
	 * output has an aspect ratio identical to the divArea. This parameter is mutually exclusive with
	 * fillcolor
	 * @param fill : String
	 * Optional. When the divArea is larger than the source image (or selected crop), this parameter
	 * forces the scaling of the output in order to fill the divArea (it ensures that at least one of the
	 * two dimensions is exactly as specified In the divArea). Available values are: - No (default): do
	 * not process the input; - Zoom: scale the image but do not fill it with colored bands in case of
	 * different aspect ratio. In order to ensure the complete respect of the aspect ratio and therefore
	 * the exact dimensions of the output, use the adjustcrop or fillcolor.
	 * @param fillcolor : String
	 * Optional. When the aspect ratio of the divArea is different than the source image, this parameter
	 * extends the output through a specific color. It ensures that the output size is exactly as large as
	 * the divArea. Available values are: - No (default): do not alter the size of the image; - rgba(r,g,
	 * b[,a]): with r,g,b,a from 0 to 255 indicating respectively the levels of red, yellow, blue and
	 * alpha. This parameter is mutually exclusive with adjustcrop. In case of PNG or GIF images with
	 * transparency, the fillcolor parameter indicates the color with which the transparent area will be
	 * replaced in JPG conversion.
	 * @param format : String
	 * Optional. The desired format for the resulting image. Available values are: Auto (default): if
	 * image have transparency keep original format, else convert to JPEG ; - JPEG;  - WEBP (currently
	 * supported by Chrome only). The format parameter can heavily influence the performance because it
	 * allows a lot of weight reduction. If you convert an image from PNG to JPEG you will have a
	 * considerable increase in performance because of the bandwidth used for downloading the image.
	 * @param enhance : String
	 * Optional. This parameter allows you to adjust the color, brightness, contrast and sharpness of the
	 * image, using the form enhance=brightness:100,contrast:100,sharpness:100,color:100. Each parameter
	 * must be provided with an integer between 0 and 200.
	 * @param dpr : Integer
	 * Optional. Device Pixel Ration, available values are [1..1000]
	 * 0-100: zoom out
	 * 100-1000: zoom in
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
			croph: Double, 
			adjustcrop: String, 
			fill: String, 
			fillcolor: String, 
			format: String, 
			enhance: String, 
			dpr: Integer)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):java.io.File ={
	
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
		Option(adjustcrop).foreach(s => params.add("adjustcrop", s))
		Option(fill).foreach(s => params.add("fill", s))
		Option(fillcolor).foreach(s => params.add("fillcolor", s))
		Option(format).foreach(s => params.add("format", s))
		Option(enhance).foreach(s => params.add("enhance", s))
		Option(dpr).foreach(s => params.add("dpr", s))
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