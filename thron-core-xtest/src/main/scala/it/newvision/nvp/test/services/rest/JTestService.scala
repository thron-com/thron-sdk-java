package it.newvision.nvp.test.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.test.services.model.response.MResponseTestList
import it.newvision.nvp.test.services.model.request.MTestServicelistReq
import it.newvision.nvp.test.services.model.response.MResponseTestP
import it.newvision.nvp.test.services.model.request.MTestServicepostReq
import it.newvision.nvp.test.services.model.response.MResponseTestF
import it.newvision.nvp.test.services.model.msg.METestEnum
import it.newvision.nvp.test.services.model.request.MTestServiceputReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This is a test webservice user to test the different type of request and
 * objects used in the platform.
 * 
 * With the fakeResponse parameter to false, the test service respond with the
 * same parameters provided in the call.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>WADL REST service (latest version): http://clientId-view.thron.
 * com/api/xtest/resources/application.wadl </li>
 * </ul>
 */
@Path("/testservice")
//#SWG#@Api(value = "/testservice", description = """This is a test webservice user to test the different type of request and objects used in the platform.
//#SWGNL#
//#SWGNL#With the fakeResponse parameter to false, the test service respond with the same parameters provided in the call.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>WADL REST service (latest version): http://clientId-view.thron.com/api/xtest/resources/application.wadl </li>
//#SWGNL#</ul>""")
trait JTestService extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * return a list of items
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MTestServicelistReq
	 * @return MResponseTestList
	*/
	@POST
	@Path("/list/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/list", notes = """return a list of items""", response = classOf[MResponseTestList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def list(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MTestServicelistReq):Response /*returnType = MResponseTestList*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__list(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_list)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_list)
	    }
	} 

	@GET
	@Path("/list/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def list_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseTestList*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__list(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MTestServicelistReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_list)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_list)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __list(tokenId: String, clientId: String, param: MTestServicelistReq) :MResponseTestList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_list: String

	/**
	 * return a list of items
	 * @param tokenId : String
	 * @param clientId : String
	 * @return MResponseTestList
	*/
	@GET
	@Path("/listGet/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/listGet", notes = """return a list of items""", response = classOf[MResponseTestList])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def listGet(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseTestList*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("listGet") 
		try{	
			val resp = this.__listGet(PRestHelper.getTokenId(tokenId_q, tokenId),clientId)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_listGet)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_listGet)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __listGet(tokenId: String, clientId: String) :MResponseTestList
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_listGet: String

	/**
	 * @param tokenId : String
	 * @param param : MTestServicepostReq
	 * @return MResponseTestP
	*/
	@POST
	@Path("/post")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/post", notes = """""", response = classOf[MResponseTestP])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def post(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MTestServicepostReq):Response /*returnType = MResponseTestP*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__post(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_post)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_post)
	    }
	} 

	@GET
	@Path("/post")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def post_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseTestP*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__post(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MTestServicepostReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_post)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_post)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __post(tokenId: String, param: MTestServicepostReq) :MResponseTestP
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_post: String

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param fakeResponse : Boolean
	 * Optional.
	 * @param pstring : String
	 * Optional.
	 * @param penum : METestEnum
	 * Optional
	 * @param pdate : Date
	 * Optional.
	 * @param pint : Integer
	 * Optional.
	 * @param pbool : Boolean
	 * Optional.
	 * @param plong : Long
	 * Optional.
	 * @param pdouble : Double
	 * Optional.
	 * @param pfloat : Float
	 * Optional.
	 * @return MResponseTestF
	*/
	@GET
	@Path("/get/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/get", notes = """""", response = classOf[MResponseTestF])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def get(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("fakeResponse")
	fakeResponse: Boolean, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("pstring")
	pstring: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("penum")
	penum: METestEnum, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("pdate")
	pdate: it.newvision.nvp.core.libraries.rs.DateType, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("pint")
	pint: Integer, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("pbool")
	pbool: Boolean, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("plong")
	plong: Long, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("pdouble")
	pdouble: Double, 
			//#SWG#@ApiParam(value = """Optional.""")
	@QueryParam("pfloat")
	pfloat: Float,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseTestF*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("get") 
		try{	
			val resp = this.__get(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,fakeResponse,pstring,penum,pdate,pint,pbool,plong,pdouble,pfloat)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_get)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_get)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __get(tokenId: String, clientId: String, fakeResponse: Boolean, pstring: String, penum: METestEnum, pdate: it.newvision.nvp.core.libraries.rs.DateType, pint: Integer, pbool: Boolean, plong: Long, pdouble: Double, pfloat: Float) :MResponseTestF
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_get: String

	/**
	 * @param tokenId : String
	 * @param clientId : String
	 * @param fakeResponse : Boolean
	 * Optional.
	 * @param pstring : String
	 * Optional.
	 * @param penum : METestEnum
	 * Optional.
	 * @param pdate : Date
	 * Optional.
	 * @param pint : Integer
	 * Optional.
	 * @param plong : Long
	 * Optional.
	 * @param pbool : Boolean
	 * Optional.
	 * @param pdouble : Double
	 * Optional.
	 * @param pfloat : Float
	 * Optional.
	 * @return MResponseTestF
	*/
	@POST
	@Path("/form/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/form", notes = """""", response = classOf[MResponseTestF])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def form(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("fakeResponse")
	fakeResponse: Boolean, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("pstring")
	pstring: String, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("penum")
	penum: METestEnum, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("pdate")
	pdate: it.newvision.nvp.core.libraries.rs.DateType, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("pint")
	pint: Integer, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("plong")
	plong: Long, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("pbool")
	pbool: Boolean, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("pdouble")
	pdouble: Double, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("pfloat")
	pfloat: Float):Response /*returnType = MResponseTestF*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__form(tokenId,clientId,fakeResponse,pstring,penum,pdate,pint,plong,pbool,pdouble,pfloat)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_form)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_form)
	    }
	} 

	@GET
	@Path("/form/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def form_2(@QueryParam("tokenId")tokenId_q: String, 
			@PathParam("clientId")clientId_q: String, 
			@QueryParam("fakeResponse")fakeResponse_q: Boolean, 
			@QueryParam("pstring")pstring_q: String, 
			@QueryParam("penum")penum_q: METestEnum, 
			@QueryParam("pdate")pdate_q: it.newvision.nvp.core.libraries.rs.DateType, 
			@QueryParam("pint")pint_q: Integer, 
			@QueryParam("plong")plong_q: Long, 
			@QueryParam("pbool")pbool_q: Boolean, 
			@QueryParam("pdouble")pdouble_q: Double, 
			@QueryParam("pfloat")pfloat_q: Float,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseTestF*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__form(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,fakeResponse_q,pstring_q,penum_q,pdate_q,pint_q,plong_q,pbool_q,pdouble_q,pfloat_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_form)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_form)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __form(tokenId: String, clientId: String, fakeResponse: Boolean, pstring: String, penum: METestEnum, pdate: it.newvision.nvp.core.libraries.rs.DateType, pint: Integer, plong: Long, pbool: Boolean, pdouble: Double, pfloat: Float) :MResponseTestF
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_form: String

	/**
	 * test delete service
	 * @param tokenId : String
	 * @param clientId : String
	 * @param pstring : String
	 * Optional.
	 * @return MResponseTestP
	*/
	@DELETE
	@Path("/remove/{clientId}/{pstring}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/remove", notes = """test delete service""", response = classOf[MResponseTestP])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def remove(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """Optional.""")
	@PathParam("pstring")
	pstring: String):Response /*returnType = MResponseTestP*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__remove(tokenId,clientId,pstring)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_remove)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_remove)
	    }
	}/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __remove(tokenId: String, clientId: String, pstring: String) :MResponseTestP
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_remove: String

	/**
	 * test put service
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MTestServiceputReq
	 * @return MResponseTestP
	*/
	@PUT
	@Path("/put/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/put", notes = """test put service""", response = classOf[MResponseTestP])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def put(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MTestServiceputReq):Response /*returnType = MResponseTestP*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__put(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_put)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_put)
	    }
	}/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __put(tokenId: String, clientId: String, param: MTestServiceputReq) :MResponseTestP
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_put: String

}