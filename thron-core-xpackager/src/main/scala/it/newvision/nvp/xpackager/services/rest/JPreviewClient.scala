package it.newvision.nvp.xpackager.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
object JPreviewClient {
	import it.newvision.nvp.core.libraries.restclient.ClientJersey
	protected val client= ClientJersey.getClient
	
	def setConnectionTimeOut( n : Integer) { 
		client.setConnectTimeout(n)
	}
	
}
/**
 * The Preview service allows the user to view/download the files from the working
 * area.
 * 
 * <b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>REST: http://clientId-view.thron.com/api/xpackager/resources/application.
 * wadl </li>
 * </ul>
 */
class JPreviewClient(val resourceEndpoint:String) {

	/**
	 * Return the file source. This service works over the Repository Area, and return the source file if
	 * the file is present in the repository area.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param fileName : String
	 * @param folderPath : String
	 * @param siteName : String
	 * @param fromFtp : Boolean
	 * @return javax.ws.rs.core.Response
	*/
	def previewFromRepository(tokenId: String, 
			clientId: String, 
			fileName: String, 
			folderPath: String, 
			siteName: String, 
			fromFtp: Boolean)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):javax.ws.rs.core.Response ={
	
		                  import javax.ws.rs.core.Response
		                	val webResource = JPreviewClient.client.resource(this.resourceEndpoint)
							//val _folderPath = java.net.URLEncoder.encode(folderPath, "UTF-8") 
		                	val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		                		params.add("clientId", clientId)
								params.add("tokenId", tokenId)
							    params.add("folderPath", folderPath)
								params.add("siteName", siteName)
								params.add("fromFtp", fromFtp)
								//params.add("fileName", fileName)
		                	val response : Response = webResource.queryParams(params)
		                		.path("preview/previewFromRepository/"+fileName)
		                		.accept("*/*")
		                		.get(classOf[Response])
		                	response
		                
	}

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
	def previewFromPackage(tokenId: String, 
			clientId: String, 
			packageId: String, 
			fileName: String, 
			folderPath: String, 
			siteName: String)(implicit _fwdHeaders:Option[scala.collection.Map[String,String]]=None):javax.ws.rs.core.Response ={
		     import javax.ws.rs.core.Response
		                	val webResource = JPreviewClient.client.resource(this.resourceEndpoint)
		                	//val _folderPath = java.net.URLEncoder.encode(folderPath, "UTF-8")
							 val params = new com.sun.jersey.core.util.MultivaluedMapImpl
		                	params.add("clientId", clientId)
		                	//params.add("fileName", fileName)
							params.add("packageId", packageId)
							params.add("tokenId", tokenId)
							params.add("folderPath", folderPath)
							params.add("siteName", siteName)
		                	val response : Response = webResource.queryParams(params)
		                		.path("preview/previewFromPackage/"+fileName)
		                		.accept("*/*")
		                		.get(classOf[Response])
		                	response
	}

}