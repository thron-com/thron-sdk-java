package it.newvision.nvp.webtv.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.webtv.services.model.visits.MResponseVisits
import it.newvision.nvp.webtv.services.model.request.MVisitsresetVisitCounterReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service is used to push a new visit for a content.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/visits</li>
 * </ul>
 */
@Path("/visits")
//#SWG#@Api(value = "/visits", description = """This service is used to push a new visit for a content.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/visits</li>
//#SWGNL#</ul>""")
trait JVisits extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * This function increment the Content View counter, and is used to register the number of visits for
	 * of a content.
	 * Authentication token is not required (X-TOKENID).
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @param pkey : String
	 * Optional.
	 * @return MResponseVisits
	*/
	@POST
	@Path("/incrementVisits")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	//#SWG#@ApiOperation(value = "/incrementVisits", notes = """This function increment the Content View counter, and is used to register the number of visits for of a content.
	//#SWGNL#Authentication token is not required (X-TOKENID).""", response = classOf[MResponseVisits])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def incrementVisits(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@FormParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """Optional. For Acl validation""")
	@FormParam("categoryIdForAcl")
	categoryIdForAcl: String, 
			//#SWG#@ApiParam(value = """Optional.""")
	@FormParam("pkey")
	pkey: String):Response /*returnType = MResponseVisits*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__incrementVisits(tokenId,clientId,contentId,categoryIdForAcl,pkey)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_incrementVisits)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_incrementVisits)
	    }
	} 

	@GET
	@Path("/incrementVisits")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def incrementVisits_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("contentId")contentId_q: String, 
			@QueryParam("categoryIdForAcl")categoryIdForAcl_q: String, 
			@QueryParam("pkey")pkey_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVisits*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("incrementVisits",this._getCacheControl) 
		try{	
			val resp = this.__incrementVisits(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,contentId_q,categoryIdForAcl_q,pkey_q)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_incrementVisits)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_incrementVisits)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __incrementVisits(tokenId: String, clientId: String, contentId: String, categoryIdForAcl: String, pkey: String) :MResponseVisits
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_incrementVisits: String

	/**
	 * reset the visit counter for a specific content
	 * @param tokenId : String
	 * @param param : MVisitsresetVisitCounterReq
	 * @return MResponseVisits
	*/
	@POST
	@Path("/resetVisitCounter")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/resetVisitCounter", notes = """reset the visit counter for a specific content""", response = classOf[MResponseVisits])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def resetVisitCounter(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MVisitsresetVisitCounterReq):Response /*returnType = MResponseVisits*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__resetVisitCounter(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_resetVisitCounter)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_resetVisitCounter)
	    }
	} 

	@GET
	@Path("/resetVisitCounter")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def resetVisitCounter_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseVisits*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("resetVisitCounter",this._getCacheControl) 
		try{
			val resp = this.__resetVisitCounter(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MVisitsresetVisitCounterReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_resetVisitCounter)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_resetVisitCounter)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __resetVisitCounter(tokenId: String, param: MVisitsresetVisitCounterReq) :MResponseVisits
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_resetVisitCounter: String

}