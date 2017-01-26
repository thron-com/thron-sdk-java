package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Preview service allows the user to view/download the files from the working
 * area.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST: https://clientId-view.thron.
 * com/api/xpackager/resources/preview</li>
 * </ul>
 */
@Path("/preview")
//#SWG#@Api(value = "/preview", description = """The Preview service allows the user to view/download the files from the working area.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>REST: https://clientId-view.thron.com/api/xpackager/resources/preview</li>
//#SWGNL#</ul>""")
trait JPreview extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Return the file source. This service works over the Repository Area , and return the source file if
	 * the file is present in the repository area.
	 * @param tokenId_q : String
	 * @param tokenId_h : String
	 * @param clientId : String
	 * @param fileName : String
	 * @param folderPath : String
	 * @param siteName : String
	 * @param fromFtp : Boolean
	 * @param xcontentId : String
	 * Optional. Only for audit
	 * @param cd : String
	 * Optional.A query string parameter that allows content-disposition to be overridden
	 * @return javax.ws.rs.core.Response
	*/
	@GET
	                @Path("previewFromRepository/{fileName}")
	                @Produces(Array("*/*"))
	def previewFromRepository(@QueryParam("tokenId")
	tokenId_q: String, 
			@HeaderParam("X-TOKENID")
	tokenId_h: String, 
			@QueryParam("clientId")
	clientId: String, 
			@PathParam("fileName")
	fileName: String, 
			@QueryParam("folderPath")
	folderPath: String, 
			@QueryParam("siteName")
	siteName: String, 
			@QueryParam("fromFtp")
	fromFtp: Boolean, 
			@QueryParam("xcontentId")
	xcontentId: String, 
			@QueryParam("response-content-disposition")
	cd: String):javax.ws.rs.core.Response 

	 


	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 

	protected def capability_previewFromRepository: String

	/**
	 * Return the file source. This service works over the Packaging Area, and return the source file if
	 * the file is present in the package folder
	 * @param tokenId : String
	 * @param clientId : String
	 * @param packageId : String
	 * @param fileName : String
	 * @param folderPath : String
	 * @param siteName : String
	 * @return javax.ws.rs.core.Response
	*/
	@GET
	                @Path("previewFromPackage/{fileName}")
	                @Produces(Array("*/*"))
	def previewFromPackage(@QueryParam("tokenId")
	tokenId: String, 
			@QueryParam("clientId")
	clientId: String, 
			@QueryParam("packageId")
	packageId: String, 
			@PathParam("fileName")
	fileName: String, 
			@QueryParam("folderPath")
	folderPath: String, 
			@QueryParam("siteName")
	siteName: String):javax.ws.rs.core.Response 

	 


	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 

	protected def capability_previewFromPackage: String

}