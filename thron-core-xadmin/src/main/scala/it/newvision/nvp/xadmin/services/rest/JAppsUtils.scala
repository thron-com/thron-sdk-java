package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppDetail
import it.newvision.nvp.xadmin.services.model.request.MAppsUtilscloneReq
import it.newvision.nvp.xadmin.services.model.request.MAppsUtilsupdateReq
import it.newvision.nvp.xadmin.services.model.request.MAppsUtilsupdateSubscriptionDataReq
import it.newvision.nvp.xadmin.services.model.request.MAppsUtilswhoisReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service is used to manage the APP (4ME Apps) properties.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>WADL REST service: http://clientId-view.4me.
 * it/api/adxadmin/resources/application.wadl  </li>
 * </ul>
 * <ul>
 * 	<li>REST service: http://clientId-view.4me.
 * it/api/adxadmin/resources/appsutils/  </li>
 * </ul>
 */
@Path("/appsutils")
//#SWG#@Api(value = "/appsutils", description = """This service is used to manage the APP (4ME Apps) properties.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints</b>:
//#SWGNL#<ul>
//#SWGNL#	<li>WADL REST service: http://clientId-view.4me.it/api/adxadmin/resources/application.wadl  </li>
//#SWGNL#</ul>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.4me.it/api/adxadmin/resources/appsutils/  </li>
//#SWGNL#</ul>""")
trait JAppsUtils extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Used to authenticate an App throught the appId or prettyId and return all details.
	 * Can be called only by superUsers
	 * Provides:
	 * <ul>
	 * 	<li>all app detail (metadata) </li>
	 * 	<li>the tokenId for the application, to use in the inside service call of the snippet </li>
	 * 	<li>the rootCategory of the linked App. </li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param appId : String
	 * Optional
	 * @return MResponseAppDetail
	*/
	@GET
	@Path("/loginApp")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/loginApp", notes = """Used to authenticate an App throught the appId or prettyId and return all details.
	//#SWGNL#Can be called only by superUsers
	//#SWGNL#Provides:
	//#SWGNL#<ul>
	//#SWGNL#	<li>all app detail (metadata) </li>
	//#SWGNL#	<li>the tokenId for the application, to use in the inside service call of the snippet </li>
	//#SWGNL#	<li>the rootCategory of the linked App. </li>
	//#SWGNL#</ul>""", response = classOf[MResponseAppDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def loginApp(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("appId")
	appId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseAppDetail*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("loginApp") 
		try{	
			val resp = this.__loginApp(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,appId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_loginApp)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_loginApp)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __loginApp(tokenId: String, clientId: String, appId: String) :MResponseAppDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_loginApp: String

	/**
	 * Create a clone from an existing App.
	 * To be used for internal use only!
	 * Can be invoked only by SUPER USERS
	 * @param tokenId : String
	 * @param param : MAppsUtilscloneReq
	 * @return MResponseAppDetail
	*/
	@POST
	@Path("/clone")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/clone", notes = """Create a clone from an existing App.
	//#SWGNL#To be used for internal use only!
	//#SWGNL#Can be invoked only by SUPER USERS""", response = classOf[MResponseAppDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def clone(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsUtilscloneReq):Response /*returnType = MResponseAppDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__clone(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_clone)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_clone)
	    }
	} 

	@GET
	@Path("/clone")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def clone_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__clone(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsUtilscloneReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_clone)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_clone)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __clone(tokenId: String, param: MAppsUtilscloneReq) :MResponseAppDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_clone: String

	/**
	 * low level service to update an App.
	 * Can be invoked only by SUPER USERS
	 * @param tokenId : String
	 * @param param : MAppsUtilsupdateReq
	 * @return MResponseAppDetail
	*/
	@POST
	@Path("/update")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/update", notes = """low level service to update an App. 
	//#SWGNL#Can be invoked only by SUPER USERS""", response = classOf[MResponseAppDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def update(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsUtilsupdateReq):Response /*returnType = MResponseAppDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__update(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_update)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_update)
	    }
	} 

	@GET
	@Path("/update")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def update_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__update(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsUtilsupdateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_update)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_update)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __update(tokenId: String, param: MAppsUtilsupdateReq) :MResponseAppDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_update: String

	/**
	 * update the App subscription data.
	 * Can be invoked only by SUPER USERS
	 * @param tokenId : String
	 * @param param : MAppsUtilsupdateSubscriptionDataReq
	 * @return MResponseAppDetail
	*/
	@POST
	@Path("/updateSubscriptionData")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateSubscriptionData", notes = """update the App subscription data.
	//#SWGNL#Can be invoked only by SUPER USERS""", response = classOf[MResponseAppDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateSubscriptionData(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsUtilsupdateSubscriptionDataReq):Response /*returnType = MResponseAppDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateSubscriptionData(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateSubscriptionData)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateSubscriptionData)
	    }
	} 

	@GET
	@Path("/updateSubscriptionData")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateSubscriptionData_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updateSubscriptionData(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsUtilsupdateSubscriptionDataReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updateSubscriptionData)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateSubscriptionData)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateSubscriptionData(tokenId: String, param: MAppsUtilsupdateSubscriptionDataReq) :MResponseAppDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateSubscriptionData: String

	/**
	 * Returns the appId of a given token, if it is an app token
	 * @param tokenId : String
	 * @param param : MAppsUtilswhoisReq
	 * @return String
	*/
	@POST
	@Path("/whois")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/whois", notes = """Returns the appId of a given token, if it is an app token""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def whois(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsUtilswhoisReq):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__whois(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_whois)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_whois)
	    }
	} 

	@GET
	@Path("/whois")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	def whois_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__whois(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsUtilswhoisReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_whois)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_whois)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __whois(tokenId: String, param: MAppsUtilswhoisReq) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_whois: String

}