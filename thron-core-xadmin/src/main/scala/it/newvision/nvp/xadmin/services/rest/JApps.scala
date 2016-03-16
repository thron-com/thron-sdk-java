package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppDetail
import it.newvision.nvp.xadmin.services.model.request.MAppsappDetailReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppList
import it.newvision.nvp.xadmin.services.model.request.MAppsfindByPropertiesReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppSummaryList
import it.newvision.nvp.xadmin.services.model.request.MAppsappsListReq
import it.newvision.nvp.xadmin.services.model.request.MAppssuReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service is used to manage the APP properties.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: http://clientId-view.thron.com/api/xadmin/resources/apps/
 * </li>
 * </ul>
 */
@Path("/apps")
//#SWG#@Api(value = "/apps", description = """This service is used to manage the APP properties.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: http://clientId-view.thron.com/api/xadmin/resources/apps/   </li>
//#SWGNL#</ul>""")
trait JApps extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Used to authenticate an App through the appId and appKey (optional) and return
	 * 
	 * 
	 * Provides:
	 * <ul>
	 * 	<li>all app detail (metadata)</li>
	 * 	<li>the tokenId for the application, to use in the inside service call of the snippet</li>
	 * 	<li>the rootCategory of the linked App.</li>
	 * </ul>
	 * 
	 * Authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * @param appId : String
	 * @param appKey : String
	 * Optional.
	 * The personal key used to authenticate the user. Some apps do not need secure authentication wih
	 * appkey
	 * @return MResponseAppDetail
	*/
	@POST
	@Path("/loginApp/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/loginApp", notes = """Used to authenticate an App through the appId and appKey (optional) and return 
	//#SWGNL#
	//#SWGNL#
	//#SWGNL#Provides:
	//#SWGNL#<ul>
	//#SWGNL#	<li>all app detail (metadata)</li>
	//#SWGNL#	<li>the tokenId for the application, to use in the inside service call of the snippet</li>
	//#SWGNL#	<li>the rootCategory of the linked App.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Authentication token is not required (X-TOKENID).""", response = classOf[MResponseAppDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def loginApp(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("appId")
	appId: String, 
			//#SWG#@ApiParam(value = """Optional. 
	//#SWGNL#The personal key used to authenticate the user. Some apps do not need secure authentication wih appkey""")
	@FormParam("appKey")
	appKey: String,
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
			val resp = this.__loginApp(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,appId,appKey)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_loginApp)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_loginApp)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __loginApp(tokenId: String, clientId: String, appId: String, appKey: String) :MResponseAppDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_loginApp: String

	/**
	 * Used to authenticate an App through the appId and return all details.
	 * Provides:
	 * <ul>
	 * 	<li>all app detail (metadata)</li>
	 * 	<li>the rootCategory of the linked App.</li>
	 * </ul>
	 * 
	 * Can be invoked only by user with role [APPID]_MANAGER or [APPID]_APP_EDITOR or CORE_MANAGE_APPS
	 * @param tokenId : String
	 * @param param : MAppsappDetailReq
	 * @return MResponseAppDetail
	*/
	@POST
	@Path("/appDetail")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/appDetail", notes = """Used to authenticate an App through the appId and return all details.
	//#SWGNL#Provides:
	//#SWGNL#<ul>
	//#SWGNL#	<li>all app detail (metadata)</li>
	//#SWGNL#	<li>the rootCategory of the linked App.</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#Can be invoked only by user with role [APPID]_MANAGER or [APPID]_APP_EDITOR or CORE_MANAGE_APPS""", response = classOf[MResponseAppDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def appDetail(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsappDetailReq):Response /*returnType = MResponseAppDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__appDetail(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_appDetail)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_appDetail)
	    }
	} 

	@GET
	@Path("/appDetail")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def appDetail_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__appDetail(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsappDetailReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_appDetail)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_appDetail)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __appDetail(tokenId: String, param: MAppsappDetailReq) :MResponseAppDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_appDetail: String

	/**
	 * returns a list of apps  matching the search criteria.
	 * Can be invoked only by user with role CORE_MANAGE_APPS.
	 * apps.disguiseData is returned only if the user has some role for the app.
	 * @param tokenId : String
	 * @param param : MAppsfindByPropertiesReq
	 * @return MResponseAppList
	*/
	@POST
	@Path("/findByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findByProperties", notes = """returns a list of apps  matching the search criteria.
	//#SWGNL#Can be invoked only by user with role CORE_MANAGE_APPS.
	//#SWGNL#apps.disguiseData is returned only if the user has some role for the app.""", response = classOf[MResponseAppList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsfindByPropertiesReq):Response /*returnType = MResponseAppList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findByProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findByProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findByProperties)
	    }
	} 

	@GET
	@Path("/findByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def findByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__findByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsfindByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_findByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findByProperties(tokenId: String, param: MAppsfindByPropertiesReq) :MResponseAppList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findByProperties: String

	/**
	 * the service return a list with summary information related to the apps.
	 * Can be invoked by any platform users.
	 * @param tokenId : String
	 * @param param : MAppsappsListReq
	 * @return MResponseAppSummaryList
	*/
	@POST
	@Path("/appsList")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/appsList", notes = """the service return a list with summary information related to the apps.
	//#SWGNL#Can be invoked by any platform users.""", response = classOf[MResponseAppSummaryList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def appsList(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsappsListReq):Response /*returnType = MResponseAppSummaryList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__appsList(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_appsList)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_appsList)
	    }
	} 

	@GET
	@Path("/appsList")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def appsList_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppSummaryList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__appsList(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsappsListReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_appsList)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_appsList)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __appsList(tokenId: String, param: MAppsappsListReq) :MResponseAppSummaryList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_appsList: String

	/**
	 * used to impersonate another user (sudo function)
	 * The service can be invoked only by Apps with canDisguise attribute enabled.
	 * The service return a valid token for the specified user if exists and if the app allows to
	 * impersonate the user (based on the MApp.disguiseData values).
	 * Authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param param : MAppssuReq
	 * @return String
	*/
	@POST
	@Path("/su")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/su", notes = """used to impersonate another user (sudo function)
	//#SWGNL#The service can be invoked only by Apps with canDisguise attribute enabled. 
	//#SWGNL#The service return a valid token for the specified user if exists and if the app allows to impersonate the user (based on the MApp.disguiseData values).
	//#SWGNL#Authentication token is not required (X-TOKENID).""", response = classOf[String])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def su(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppssuReq):Response /*returnType = String*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__su(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_su)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_su)
	    }
	} 

	@GET
	@Path("/su")
	@Produces(Array(MediaType.TEXT_PLAIN,MediaType.WILDCARD,"application/x-javascript"))
	def su_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = String*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__su(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppssuReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_su)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_su)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __su(tokenId: String, param: MAppssuReq) :String
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_su: String

}