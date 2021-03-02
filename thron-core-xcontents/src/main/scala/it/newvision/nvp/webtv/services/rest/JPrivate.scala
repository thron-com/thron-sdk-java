package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@Path("/private")
//#SWG#@Api(value = "/private", description = """""")
trait JPrivate extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

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
	 * The xcontentId,  prettyId or externalId of the content
	 * @param dt : String
	 * Required. Delivery token
	 * @param divArea : String
	 * The desired WidthxHeight of the resulting image. If higher than the original thumbnail resolution,
	 * no processing will be performed
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints, keeping the aspet ration)
	 * @param scalemode : String
	 * Optional. RTIE parameter
	 * @param quality : Integer
	 * Optional. An integer value from 0 to 100. It sets the quality of returned images. Lower quality
	 * images has lower size and then better performance. Not available with PNG format.
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
	 * image have transparency keep original format, else convert to JPEG ; - JPEG; - WEBP (limited
	 * browser support). The format parameter can heavily influence the performance because it allows a
	 * lot of weight reduction. If you convert an image from PNG to JPEG you will have a considerable
	 * increase in performance because of the bandwidth used for downloading the image. - PNG: pay
	 * attention since this format doesn't support any quality adjustment and the returned image size
	 * could be very huge and could cause low performance.
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
	@GET
	@Path("/thumbnail/{clientId}/{id}")
	@Produces(Array(MediaType.WILDCARD,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/thumbnail", notes = """This service provides the thumbnail of a content with the desired resolution and quality: THRON will automatically process the highest available quality image to apply cropping and resize algorithms that match your request, as specified by URL parameters expressed after ContentId.
	//#SWGNL#For backward compatibility, if no additional query param is provided, the service will return the image of the exact width of the divArea while height will respect the aspect ratio.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.
	//#SWGNL#
	//#SWGNL#HTTP status codes: 
	//#SWGNL#<ul>
	//#SWGNL#	<li>400: invalid arguments,</li>
	//#SWGNL#	<li>404: content not found,</li>
	//#SWGNL#	<li>500: generic error,</li>
	//#SWGNL#	<li>307: redirects to resulting content,</li>
	//#SWGNL#	<li>200: ok.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#If no thumbnail is available, a default fallback image will be provided. 
	//#SWGNL#This service is public: authentication token is not required (X-TOKENID).""", response = classOf[java.io.File])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def thumbnail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """Domain name used to access THRON""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """The xcontentId,  prettyId or externalId of the content""")
	@PathParam("id")
	id: String, 
			//#SWG#@ApiParam(value = """Required. Delivery token""")
	@QueryParam("dt")
	dt: String, 
			//#SWG#@ApiParam(value = """The desired WidthxHeight of the resulting image. If higher than the original thumbnail resolution, no processing will be performed
	//#SWGNL#Format: <widht>x<height>
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints, keeping the aspet ration)""")
	@QueryParam("divArea")
	divArea: String, 
			//#SWG#@ApiParam(value = """Optional. RTIE parameter""")
	@QueryParam("scalemode")
	scalemode: String, 
			//#SWG#@ApiParam(value = """Optional. An integer value from 0 to 100. It sets the quality of returned images. Lower quality images has lower size and then better performance. Not available with PNG format.""")
	@QueryParam("quality")
	quality: Integer, 
			//#SWG#@ApiParam(value = """Optional. RTIE parameter""")
	@QueryParam("cropmode")
	cropmode: String, 
			//#SWG#@ApiParam(value = """Optional. RTIE parameter""")
	@QueryParam("cropx")
	cropx: Double, 
			//#SWG#@ApiParam(value = """Optional. RTIE parameter""")
	@QueryParam("cropy")
	cropy: Double, 
			//#SWG#@ApiParam(value = """Optional. RTIE parameter""")
	@QueryParam("cropw")
	cropw: Double, 
			//#SWG#@ApiParam(value = """Optional. RTIE parameter""")
	@QueryParam("croph")
	croph: Double, 
			//#SWG#@ApiParam(value = """Optional. When the aspect ratio of the cut and the divArea are different, this parameter defines the rule to be adopted to handle the output. Available values are: - no (default): no changes are applied to the crop area, therefore the output image might have a different aspect ratio than the divArea; - extend: the crop area is potentially expanded (so it might return a slightly "larger" image) in order to guarantee that the output has an aspect ratio identical to the divArea; - reduce: the crop area is reduced (so it might return a "smaller" image) in order to guarantee that the output has an aspect ratio identical to the divArea. This parameter is mutually exclusive with fillcolor""")
	@QueryParam("adjustcrop")
	adjustcrop: String, 
			//#SWG#@ApiParam(value = """Optional. When the divArea is larger than the source image (or selected crop), this parameter forces the scaling of the output in order to fill the divArea (it ensures that at least one of the two dimensions is exactly as specified In the divArea). Available values are: - No (default): do not process the input; - Zoom: scale the image but do not fill it with colored bands in case of different aspect ratio. In order to ensure the complete respect of the aspect ratio and therefore the exact dimensions of the output, use the adjustcrop or fillcolor.""")
	@QueryParam("fill")
	fill: String, 
			//#SWG#@ApiParam(value = """Optional. When the aspect ratio of the divArea is different than the source image, this parameter extends the output through a specific color. It ensures that the output size is exactly as large as the divArea. Available values are: - No (default): do not alter the size of the image; - rgba(r,g,b[,a]): with r,g,b,a from 0 to 255 indicating respectively the levels of red, yellow, blue and alpha. This parameter is mutually exclusive with adjustcrop. In case of PNG or GIF images with transparency, the fillcolor parameter indicates the color with which the transparent area will be replaced in JPG conversion.""")
	@QueryParam("fillcolor")
	fillcolor: String, 
			//#SWG#@ApiParam(value = """Optional. The desired format for the resulting image. Available values are: Auto (default): if image have transparency keep original format, else convert to JPEG ; - JPEG; - WEBP (limited browser support). The format parameter can heavily influence the performance because it allows a lot of weight reduction. If you convert an image from PNG to JPEG you will have a considerable increase in performance because of the bandwidth used for downloading the image. - PNG: pay attention since this format doesn't support any quality adjustment and the returned image size could be very huge and could cause low performance.""")
	@QueryParam("format")
	format: String, 
			//#SWG#@ApiParam(value = """Optional. This parameter allows you to adjust the color, brightness, contrast and sharpness of the image, using the form enhance=brightness:100,contrast:100,sharpness:100,color:100. Each parameter must be provided with an integer between 0 and 200.""")
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
		val cc = this.cachemap("thumbnail") 
		try{	
			val resp = this.__thumbnail(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,id,dt,divArea,scalemode,quality,cropmode,cropx,cropy,cropw,croph,adjustcrop,fill,fillcolor,format,enhance,dpr)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_thumbnail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_thumbnail)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __thumbnail(tokenId: String, clientId: String, id: String, dt: String, divArea: String, scalemode: String, quality: Integer, cropmode: String, cropx: Double, cropy: Double, cropw: Double, croph: Double, adjustcrop: String, fill: String, fillcolor: String, format: String, enhance: String, dpr: Integer) :java.io.File
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_thumbnail: String

}