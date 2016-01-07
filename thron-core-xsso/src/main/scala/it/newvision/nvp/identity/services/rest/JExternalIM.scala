package it.newvision.nvp.identity.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.identity.services.model.identity.MResponseExternalIM

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * External Identity Manager Login Service
 */
@Path("/externalim")
//#SWG#@Api(value = "/externalim", description = """External Identity Manager Login Service""")
trait JExternalIM extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param username : String
	 * @param password : String
	 * @return MResponseExternalIM
	*/
	@POST
	@Path("/login")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/login", notes = """""", response = classOf[MResponseExternalIM])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def login(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("username")
	username: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("password")
	password: String):Response /*returnType = MResponseExternalIM*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__login(tokenId,clientId,username,password)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_login)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_login)
	    }
	} 

	@GET
	@Path("/login")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def login_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("username")username_q: String, 
			@QueryParam("password")password_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseExternalIM*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__login(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,username_q,password_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_login)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_login)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __login(tokenId: String, clientId: String, username: String, password: String) :MResponseExternalIM
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_login: String

}