package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.utils.MResponseDashboard
import it.newvision.nvp.xadmin.services.model.request.MDashboardchangeContentsOwnerReq
import it.newvision.nvp.xadmin.services.model.request.MDashboardmigrateUserStuffReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Utility service for the Platform Dashboard.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.
 * com/api/xadmin/resources/dashboard  </li>
 * </ul>
 */
@Path("/dashboard")
//#SWG#@Api(value = "/dashboard", description = """Utility service for the Platform Dashboard.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xadmin/resources/dashboard  </li>
//#SWGNL#</ul>""")
trait JDashboard extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * The service change the owner for a given list of contents.
	 * @param tokenId : String
	 * @param param : MDashboardchangeContentsOwnerReq
	 * @return MResponseDashboard
	*/
	@POST
	@Path("/changeContentsOwner")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/changeContentsOwner", notes = """The service change the owner for a given list of contents.""", response = classOf[MResponseDashboard])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def changeContentsOwner(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboardchangeContentsOwnerReq):Response /*returnType = MResponseDashboard*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__changeContentsOwner(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_changeContentsOwner)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_changeContentsOwner)
	    }
	} 

	@GET
	@Path("/changeContentsOwner")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def changeContentsOwner_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDashboard*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("changeContentsOwner",this._getCacheControl) 
		try{
			val resp = this.__changeContentsOwner(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboardchangeContentsOwnerReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_changeContentsOwner)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_changeContentsOwner)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __changeContentsOwner(tokenId: String, param: MDashboardchangeContentsOwnerReq) :MResponseDashboard
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_changeContentsOwner: String

	/**
	 * This service is used to migrate:
	 * <ul>
	 * 	<li>owned contents </li>
	 * 	<li>owned public categories</li>
	 * 	<li>owned repository files</li>
	 * </ul>
	 * Should be used when a user is removed and the contents should be assigned to another user.
	 * 
	 * The service also remove
	 * <ul>
	 * 	<li>all links to the userId1 private folders </li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MDashboardmigrateUserStuffReq
	 * @return MResponseDashboard
	*/
	@POST
	@Path("/migrateUserStuff")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/migrateUserStuff", notes = """This service is used to migrate:
	//#SWGNL#<ul>
	//#SWGNL#	<li>owned contents </li>
	//#SWGNL#	<li>owned public categories</li>
	//#SWGNL#	<li>owned repository files</li>
	//#SWGNL#</ul>
	//#SWGNL#Should be used when a user is removed and the contents should be assigned to another user. 
	//#SWGNL#
	//#SWGNL#The service also remove 
	//#SWGNL#<ul>
	//#SWGNL#	<li>all links to the userId1 private folders </li>
	//#SWGNL#</ul>""", response = classOf[MResponseDashboard])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def migrateUserStuff(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MDashboardmigrateUserStuffReq):Response /*returnType = MResponseDashboard*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__migrateUserStuff(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_migrateUserStuff)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_migrateUserStuff)
	    }
	} 

	@GET
	@Path("/migrateUserStuff")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def migrateUserStuff_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseDashboard*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("migrateUserStuff",this._getCacheControl) 
		try{
			val resp = this.__migrateUserStuff(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MDashboardmigrateUserStuffReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_migrateUserStuff)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_migrateUserStuff)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __migrateUserStuff(tokenId: String, param: MDashboardmigrateUserStuffReq) :MResponseDashboard
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_migrateUserStuff: String

}