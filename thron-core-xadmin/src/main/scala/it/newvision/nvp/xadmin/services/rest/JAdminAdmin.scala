package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.mediacontent.MResponseMediaContent
import it.newvision.nvp.xadmin.services.model.request.MAdminAdminremoveClientInComponentsReq
import it.newvision.nvp.xadmin.services.model.request.MAdminAdmincheckAndFixContentsReq
import it.newvision.nvp.xadmin.services.model.request.MAdminAdminmigrateDomainReq
import it.newvision.nvp.xadmin.services.model.request.MAdminAdminsetupClientReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used by the platform administration consol to handle the client service
 * id in all different components (xcontent, xpackager, xadmin, xpublisher...)
 */
@Path("/adminadmin")
//#SWG#@Api(value = "/adminadmin", description = """Service used by the platform administration consol to handle the client service id in all different components (xcontent, xpackager, xadmin, xpublisher...)""")
trait JAdminAdmin extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * remove the client object in all different components (xcontent, xadmin, xpublisher ...)
	 * remove all data in database about the specified clientId!!!
	 * @param tokenId : String
	 * @param param : MAdminAdminremoveClientInComponentsReq
	 * @return MResponseMediaContent
	*/
	@POST
	@Path("/removeClientInComponents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeClientInComponents", notes = """remove the client object in all different components (xcontent, xadmin, xpublisher ...)
	//#SWGNL#remove all data in database about the specified clientId!!!""", response = classOf[MResponseMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeClientInComponents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAdminAdminremoveClientInComponentsReq):Response /*returnType = MResponseMediaContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeClientInComponents(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeClientInComponents)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeClientInComponents)
	    }
	} 

	@GET
	@Path("/removeClientInComponents")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeClientInComponents_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMediaContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__removeClientInComponents(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAdminAdminremoveClientInComponentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeClientInComponents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeClientInComponents)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeClientInComponents(tokenId: String, param: MAdminAdminremoveClientInComponentsReq) :MResponseMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeClientInComponents: String

	/**
	 * used to find the contents in issue (publishing in process for a long time or with an ingestion in
	 * queue because is waiting a download file that does not exists...).
	 * This service is called by the maintenance server, and is synchronous. Only one single call can work
	 * in a time.
	 * @param tokenId : String
	 * @param param : MAdminAdmincheckAndFixContentsReq
	 * @return MResponseMediaContent
	*/
	@POST
	@Path("/checkAndFixContents")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/checkAndFixContents", notes = """used to find the contents in issue (publishing in process for a long time or with an ingestion in queue because is waiting a download file that does not exists...).
	//#SWGNL#This service is called by the maintenance server, and is synchronous. Only one single call can work in a time.""", response = classOf[MResponseMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def checkAndFixContents(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAdminAdmincheckAndFixContentsReq):Response /*returnType = MResponseMediaContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__checkAndFixContents(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_checkAndFixContents)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_checkAndFixContents)
	    }
	} 

	@GET
	@Path("/checkAndFixContents")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def checkAndFixContents_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMediaContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__checkAndFixContents(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAdminAdmincheckAndFixContentsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_checkAndFixContents)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_checkAndFixContents)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __checkAndFixContents(tokenId: String, param: MAdminAdmincheckAndFixContentsReq) :MResponseMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_checkAndFixContents: String

	/**
	 * Migrates a client to THRON domain
	 * @param tokenId : String
	 * @param param : MAdminAdminmigrateDomainReq
	 * @return MResponseMediaContent
	*/
	@POST
	@Path("/migrateDomain")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/migrateDomain", notes = """Migrates a client to THRON domain""", response = classOf[MResponseMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def migrateDomain(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAdminAdminmigrateDomainReq):Response /*returnType = MResponseMediaContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__migrateDomain(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_migrateDomain)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_migrateDomain)
	    }
	} 

	@GET
	@Path("/migrateDomain")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def migrateDomain_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMediaContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__migrateDomain(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAdminAdminmigrateDomainReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_migrateDomain)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_migrateDomain)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __migrateDomain(tokenId: String, param: MAdminAdminmigrateDomainReq) :MResponseMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_migrateDomain: String

	/**
	 * used to initialise the environment for a new clientId:
	 * * ldap
	 * * cf distributions
	 * * dns
	 * * folders
	 * ...
	 * 
	 * The client should be in status DRAFT.
	 * @param tokenId : String
	 * @param param : MAdminAdminsetupClientReq
	 * @return MResponseMediaContent
	*/
	@POST
	@Path("/setupClient")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/setupClient", notes = """used to initialise the environment for a new clientId:
	//#SWGNL#* ldap
	//#SWGNL#* cf distributions
	//#SWGNL#* dns
	//#SWGNL#* folders
	//#SWGNL#...
	//#SWGNL#
	//#SWGNL#The client should be in status DRAFT.""", response = classOf[MResponseMediaContent])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def setupClient(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAdminAdminsetupClientReq):Response /*returnType = MResponseMediaContent*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__setupClient(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_setupClient)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_setupClient)
	    }
	} 

	@GET
	@Path("/setupClient")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def setupClient_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseMediaContent*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__setupClient(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAdminAdminsetupClientReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_setupClient)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_setupClient)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __setupClient(tokenId: String, param: MAdminAdminsetupClientReq) :MResponseMediaContent
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_setupClient: String

}