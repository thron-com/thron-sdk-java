package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.rating.MResponseGetRatingByProperties
import it.newvision.nvp.xcontents.services.model.request.MRatingfindRatingByPropertiesReq
import it.newvision.nvp.xcontents.services.model.rating.MResponseGetContentScore
import it.newvision.nvp.xcontents.services.model.rating.MResponseRating
import it.newvision.nvp.xcontents.services.model.request.MRatinginsertRatingReq
import it.newvision.nvp.xcontents.services.model.request.MRatingremoveRatingsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * <b>Deprecated</b>
 * <b>
 * </b>Use the new service JRatingFixedRange
 */
@Path("/rating")
//#SWG#@Api(value = "/rating", description = """<b>Deprecated</b>
//#SWGNL#<b>
//#SWGNL#</b>Use the new service JRatingFixedRange""")
trait JRating extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * @param tokenId : String
	 * @param param : MRatingfindRatingByPropertiesReq
	 * @return MResponseGetRatingByProperties
	*/
	@POST
	@Path("/findRatingByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findRatingByProperties", notes = """""", response = classOf[MResponseGetRatingByProperties])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findRatingByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRatingfindRatingByPropertiesReq):Response /*returnType = MResponseGetRatingByProperties*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__findRatingByProperties(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_findRatingByProperties)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_findRatingByProperties)
	    }
	} 

	@GET
	@Path("/findRatingByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def findRatingByProperties_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseGetRatingByProperties*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("findRatingByProperties",this._getCacheControl) 
		try{
			val resp = this.__findRatingByProperties(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRatingfindRatingByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findRatingByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findRatingByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findRatingByProperties(tokenId: String, param: MRatingfindRatingByPropertiesReq) :MResponseGetRatingByProperties
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findRatingByProperties: String

	/**
	 * Return the "score" of a specific content. The content score is the average of the total sum of
	 * score of a content in a specific time range.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param fromDate : Date
	 * Optional
	 * @param toDate : Date
	 * Optional
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseGetContentScore
	*/
	@GET
	@Path("/getContentScore")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getContentScore", notes = """Return the "score" of a specific content. The content score is the average of the total sum of score of a content in a specific time range.""", response = classOf[MResponseGetContentScore])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	@Deprecated
	def getContentScore(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("clientId")
	clientId: String, 
			//#SWG#@ApiParam(value = """""")
	@QueryParam("contentId")
	contentId: String, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("fromDate")
	fromDate: it.newvision.nvp.core.libraries.rs.DateType, 
			//#SWG#@ApiParam(value = """Optional""")
	@QueryParam("toDate")
	toDate: it.newvision.nvp.core.libraries.rs.DateType, 
			//#SWG#@ApiParam(value = """Optional. For Acl validation""")
	@QueryParam("categoryIdForAcl")
	categoryIdForAcl: String,
			//#SWG#@ApiParam(value = "Optional",required=false,access="internal")
			@QueryParam("callback") callback_q: String
			,
			//#SWG#@ApiParam(value = "Deprecated. If required, use the X-TOKENID header parameter.",required=false,access="internal")
			@QueryParam("tokenId") tokenId_q: String):Response /*returnType = MResponseGetContentScore*/= { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		//get the cache control specific for this service
		val cc = this.cachemap("getContentScore") 
		try{	
			val resp = this.__getContentScore(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,contentId,fromDate,toDate,categoryIdForAcl)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContentScore)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentScore)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentScore(tokenId: String, clientId: String, contentId: String, fromDate: it.newvision.nvp.core.libraries.rs.DateType, toDate: it.newvision.nvp.core.libraries.rs.DateType, categoryIdForAcl: String) :MResponseGetContentScore
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentScore: String

	/**
	 * Deprecated
	 * @param tokenId : String
	 * @param param : MRatinginsertRatingReq
	 * @return MResponseRating
	*/
	@POST
	@Path("/insertRating")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insertRating", notes = """Deprecated""", response = classOf[MResponseRating])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insertRating(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRatinginsertRatingReq):Response /*returnType = MResponseRating*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__insertRating(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_insertRating)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_insertRating)
	    }
	} 

	@GET
	@Path("/insertRating")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def insertRating_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRating*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("insertRating",this._getCacheControl) 
		try{
			val resp = this.__insertRating(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRatinginsertRatingReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insertRating)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insertRating)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insertRating(tokenId: String, param: MRatinginsertRatingReq) :MResponseRating
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insertRating: String

	/**
	 * Remote all ratings for a given contentId using the specified search criteria. It's possible to
	 * remove all ratings added by a specific userId or in a specific time range.
	 * @param tokenId : String
	 * @param param : MRatingremoveRatingsReq
	 * @return MResponseRating
	*/
	@POST
	@Path("/removeRatings")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeRatings", notes = """Remote all ratings for a given contentId using the specified search criteria. It's possible to remove all ratings added by a specific userId or in a specific time range.""", response = classOf[MResponseRating])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeRatings(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRatingremoveRatingsReq):Response /*returnType = MResponseRating*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeRatings(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeRatings)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeRatings)
	    }
	} 

	@GET
	@Path("/removeRatings")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def removeRatings_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRating*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("removeRatings",this._getCacheControl) 
		try{
			val resp = this.__removeRatings(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MRatingremoveRatingsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeRatings)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeRatings)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeRatings(tokenId: String, param: MRatingremoveRatingsReq) :MResponseRating
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeRatings: String

}