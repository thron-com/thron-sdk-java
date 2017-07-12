package it.newvision.nvp.xadmin.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xadmin.services.model.apps.MResponseApp
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminaddGroupAppReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminaddUserAppReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppDetail
import it.newvision.nvp.xadmin.services.model.request.MAppsAdmincreateReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminremoveReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminremoveGroupAppReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminupdateAppReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminremoveUserAppReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppNewKey
import it.newvision.nvp.xadmin.services.model.request.MAppsAdmingenerateKeyReq
import it.newvision.nvp.xadmin.services.model.apps.MResponseAppKeyDetail
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminupdateKeyReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminremoveKeyReq
import it.newvision.nvp.xadmin.services.model.request.MAppsAdminlistKeyReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service is used to manage an App properties.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xadmin/resources/appsadmin</li>
 * </ul>
 */
@Path("/appsadmin")
//#SWG#@Api(value = "/appsadmin", description = """This service is used to manage an App properties.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xadmin/resources/appsadmin</li>
//#SWGNL#</ul>""")
trait JAppsAdmin extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Adds a group to the access list of an app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdminaddGroupAppReq
	 * @return MResponseApp
	*/
	@POST
	@Path("/addGroupApp")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addGroupApp", notes = """Adds a group to the access list of an app.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseApp])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addGroupApp(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsAdminaddGroupAppReq):Response /*returnType = MResponseApp*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addGroupApp(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addGroupApp)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addGroupApp)
	    }
	} 

	@GET
	@Path("/addGroupApp")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addGroupApp_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseApp*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addGroupApp",this._getCacheControl) 
		try{
			val resp = this.__addGroupApp(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsAdminaddGroupAppReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addGroupApp)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addGroupApp)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addGroupApp(tokenId: String, param: MAppsAdminaddGroupAppReq) :MResponseApp
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addGroupApp: String

	/**
	 * Adds a user to the access list of an app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdminaddUserAppReq
	 * @return MResponseApp
	*/
	@POST
	@Path("/addUserApp")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/addUserApp", notes = """Adds a user to the access list of an app.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseApp])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def addUserApp(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsAdminaddUserAppReq):Response /*returnType = MResponseApp*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addUserApp(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addUserApp)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addUserApp)
	    }
	} 

	@GET
	@Path("/addUserApp")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def addUserApp_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseApp*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("addUserApp",this._getCacheControl) 
		try{
			val resp = this.__addUserApp(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsAdminaddUserAppReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_addUserApp)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addUserApp)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addUserApp(tokenId: String, param: MAppsAdminaddUserAppReq) :MResponseApp
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addUserApp: String

	/**
	 * Creates an app.
	 * App owner gets the following roles:
	 * <ul>
	 * 	<li>[APPID]_MANAGER</li>
	 * </ul>
	 * <ul>
	 * 	<li>[APPID]_SNIPPET_MANAGER (custom apps only)</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>CORE_MANAGE_APPS role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdmincreateReq
	 * @return MResponseAppDetail
	*/
	@POST
	@Path("/create")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/create", notes = """Creates an app.
	//#SWGNL#App owner gets the following roles:
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_SNIPPET_MANAGER (custom apps only)</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_MANAGE_APPS role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseAppDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def create(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsAdmincreateReq):Response /*returnType = MResponseAppDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__create(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_create)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_create)
	    }
	} 

	@GET
	@Path("/create")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def create_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("create",this._getCacheControl) 
		try{
			val resp = this.__create(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsAdmincreateReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_create)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_create)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __create(tokenId: String, param: MAppsAdmincreateReq) :MResponseAppDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_create: String

	/**
	 * Removes an app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role or app owner</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdminremoveReq
	 * @return MResponseApp
	*/
	@POST
	@Path("/remove")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """Removes an app.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role or app owner</li>
	//#SWGNL#</ul>""", response = classOf[MResponseApp])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def remove(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsAdminremoveReq):Response /*returnType = MResponseApp*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__remove(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_remove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_remove)
	    }
	} 

	@GET
	@Path("/remove")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def remove_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseApp*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("remove",this._getCacheControl) 
		try{
			val resp = this.__remove(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsAdminremoveReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_remove)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_remove)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, param: MAppsAdminremoveReq) :MResponseApp
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

	/**
	 * Removes a group from the access list of an app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdminremoveGroupAppReq
	 * @return MResponseApp
	*/
	@POST
	@Path("/removeGroupApp")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeGroupApp", notes = """Removes a group from the access list of an app.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseApp])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeGroupApp(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsAdminremoveGroupAppReq):Response /*returnType = MResponseApp*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeGroupApp(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeGroupApp)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeGroupApp)
	    }
	} 

	@GET
	@Path("/removeGroupApp")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeGroupApp_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseApp*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeGroupApp",this._getCacheControl) 
		try{
			val resp = this.__removeGroupApp(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsAdminremoveGroupAppReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeGroupApp)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeGroupApp)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeGroupApp(tokenId: String, param: MAppsAdminremoveGroupAppReq) :MResponseApp
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeGroupApp: String

	/**
	 * Updates an app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdminupdateAppReq
	 * @return MResponseAppDetail
	*/
	@POST
	@Path("/updateApp")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateApp", notes = """Updates an app.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseAppDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateApp(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsAdminupdateAppReq):Response /*returnType = MResponseAppDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateApp(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateApp)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateApp)
	    }
	} 

	@GET
	@Path("/updateApp")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateApp_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateApp",this._getCacheControl) 
		try{
			val resp = this.__updateApp(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsAdminupdateAppReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateApp)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateApp)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateApp(tokenId: String, param: MAppsAdminupdateAppReq) :MResponseAppDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateApp: String

	/**
	 * Removes a user from the access list of an app.
	 * <b>
	 * </b><b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MAppsAdminremoveUserAppReq
	 * @return MResponseApp
	*/
	@POST
	@Path("/removeUserApp")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeUserApp", notes = """Removes a user from the access list of an app.
	//#SWGNL#<b>
	//#SWGNL#</b><b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseApp])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeUserApp(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MAppsAdminremoveUserAppReq):Response /*returnType = MResponseApp*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeUserApp(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeUserApp)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeUserApp)
	    }
	} 

	@GET
	@Path("/removeUserApp")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeUserApp_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseApp*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeUserApp",this._getCacheControl) 
		try{
			val resp = this.__removeUserApp(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MAppsAdminremoveUserAppReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeUserApp)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeUserApp)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeUserApp(tokenId: String, param: MAppsAdminremoveUserAppReq) :MResponseApp
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeUserApp: String

	/**
	 * Generates an access key for an app.
	 * 
	 * <b>Constraints:</b>
	 * <ul>
	 * 	<li>max number of keys per app: 10</li>
	 * </ul>
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAppsAdmingenerateKeyReq
	 * @return MResponseAppNewKey
	*/
	@POST
	@Path("/generateKey/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/generateKey", notes = """Generates an access key for an app.
	//#SWGNL#
	//#SWGNL#<b>Constraints:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>max number of keys per app: 10</li>
	//#SWGNL#</ul>
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseAppNewKey])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def generateKey(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MAppsAdmingenerateKeyReq):Response /*returnType = MResponseAppNewKey*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__generateKey(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_generateKey)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_generateKey)
	    }
	} 

	@GET
	@Path("/generateKey/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def generateKey_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppNewKey*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("generateKey",this._getCacheControl) 
		try{
			val resp = this.__generateKey(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MAppsAdmingenerateKeyReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_generateKey)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_generateKey)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __generateKey(tokenId: String, clientId: String, param: MAppsAdmingenerateKeyReq) :MResponseAppNewKey
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_generateKey: String

	/**
	 * Updates an access key for an app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAppsAdminupdateKeyReq
	 * @return MResponseAppKeyDetail
	*/
	@POST
	@Path("/updateKey/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updateKey", notes = """Updates an access key for an app.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseAppKeyDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updateKey(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MAppsAdminupdateKeyReq):Response /*returnType = MResponseAppKeyDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updateKey(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updateKey)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updateKey)
	    }
	} 

	@GET
	@Path("/updateKey/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updateKey_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppKeyDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("updateKey",this._getCacheControl) 
		try{
			val resp = this.__updateKey(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MAppsAdminupdateKeyReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_updateKey)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updateKey)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updateKey(tokenId: String, clientId: String, param: MAppsAdminupdateKeyReq) :MResponseAppKeyDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updateKey: String

	/**
	 * Removes an access key from an app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAppsAdminremoveKeyReq
	 * @return MResponseApp
	*/
	@POST
	@Path("/removeKey/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeKey", notes = """Removes an access key from an app.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseApp])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeKey(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MAppsAdminremoveKeyReq):Response /*returnType = MResponseApp*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeKey(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeKey)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeKey)
	    }
	} 

	@GET
	@Path("/removeKey/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeKey_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseApp*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeKey",this._getCacheControl) 
		try{
			val resp = this.__removeKey(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MAppsAdminremoveKeyReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeKey)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeKey)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeKey(tokenId: String, clientId: String, param: MAppsAdminremoveKeyReq) :MResponseApp
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeKey: String

	/**
	 * Returns the list of access keys of an app.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>[APPID]_MANAGER role</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MAppsAdminlistKeyReq
	 * @return MResponseAppKeyDetail
	*/
	@POST
	@Path("/listKey/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/listKey", notes = """Returns the list of access keys of an app.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>[APPID]_MANAGER role</li>
	//#SWGNL#</ul>""", response = classOf[MResponseAppKeyDetail])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listKey(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MAppsAdminlistKeyReq):Response /*returnType = MResponseAppKeyDetail*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__listKey(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_listKey)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_listKey)
	    }
	} 

	@GET
	@Path("/listKey/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def listKey_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAppKeyDetail*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("listKey",this._getCacheControl) 
		try{
			val resp = this.__listKey(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MAppsAdminlistKeyReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listKey)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listKey)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listKey(tokenId: String, clientId: String, param: MAppsAdminlistKeyReq) :MResponseAppKeyDetail
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listKey: String

}