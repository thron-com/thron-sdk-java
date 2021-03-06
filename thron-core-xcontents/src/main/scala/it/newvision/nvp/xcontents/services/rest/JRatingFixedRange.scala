package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.rating.MResponseGetRatingByProperties
import it.newvision.nvp.xcontents.services.model.request.MRatingFixedRangefindRatingByPropertiesReq
import it.newvision.nvp.xcontents.services.model.rating.MResponseGetContentScore
import it.newvision.nvp.xcontents.services.model.rating.MResponseRating
import it.newvision.nvp.xcontents.services.model.request.MRatingFixedRangeinsertRatingReq
import it.newvision.nvp.xcontents.services.model.request.MRatingFixedRangeremoveRatingsReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The Rating service is used to vote the content. This service use a fixed score
 * range of [0..1]
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/ratingfixedrange</li>
 * </ul>
 */
@Path("/ratingfixedrange")
//#SWG#@Api(value = "/ratingfixedrange", description = """The Rating service is used to vote the content. This service use a fixed score range of [0..1]
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/ratingfixedrange</li>
//#SWGNL#</ul>""")
trait JRatingFixedRange extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * Returns the list of votes of a content matching provided criteria.
	 * @param tokenId : String
	 * @param param : MRatingFixedRangefindRatingByPropertiesReq
	 * @return MResponseGetRatingByProperties
	*/
	@POST
	@Path("/findRatingByProperties")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/findRatingByProperties", notes = """Returns the list of votes of a content matching provided criteria.""", response = classOf[MResponseGetRatingByProperties])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def findRatingByProperties(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRatingFixedRangefindRatingByPropertiesReq):Response /*returnType = MResponseGetRatingByProperties*/ = {
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
			,PRestHelper.bindRequest[MRatingFixedRangefindRatingByPropertiesReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_findRatingByProperties)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_findRatingByProperties)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __findRatingByProperties(tokenId: String, param: MRatingFixedRangefindRatingByPropertiesReq) :MResponseGetRatingByProperties
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_findRatingByProperties: String

	/**
	 * Returns the score of a content.
	 * Content score is the votes average of a content for a defined time range.
	 * 
	 * Attention: this service makes use of cache control to ensure best performance.
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param fromDate : Date
	 * Optional
	 * @param toDate : Date
	 * Optional
	 * @return MResponseGetContentScore
	*/
	@GET
	@Path("/getContentScore")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-javascript"))
	//#SWG#@ApiOperation(value = "/getContentScore", notes = """Returns the score of a content.
	//#SWGNL#Content score is the votes average of a content for a defined time range.
	//#SWGNL#
	//#SWGNL#Attention: this service makes use of cache control to ensure best performance.""", response = classOf[MResponseGetContentScore])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
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
			val resp = this.__getContentScore(PRestHelper.getTokenId(tokenId_q, tokenId),clientId,contentId,fromDate,toDate)
		
			PRestHelper.responseForGET(resp, cc, callback_q,this.capability_getContentScore)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_getContentScore)
	    }
	}

	 

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __getContentScore(tokenId: String, clientId: String, contentId: String, fromDate: it.newvision.nvp.core.libraries.rs.DateType, toDate: it.newvision.nvp.core.libraries.rs.DateType) :MResponseGetContentScore
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_getContentScore: String

	/**
	 * Inserts a vote for a content with range between 0 and 1.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>SEE ACL on the content</li>
	 * 	<li>RATINGALLOWED property on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MRatingFixedRangeinsertRatingReq
	 * @return MResponseRating
	*/
	@POST
	@Path("/insertRating")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/insertRating", notes = """Inserts a vote for a content with range between 0 and 1.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>SEE ACL on the content</li>
	//#SWGNL#	<li>RATINGALLOWED property on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseRating])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def insertRating(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRatingFixedRangeinsertRatingReq):Response /*returnType = MResponseRating*/ = {
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
			,PRestHelper.bindRequest[MRatingFixedRangeinsertRatingReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_insertRating)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_insertRating)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __insertRating(tokenId: String, param: MRatingFixedRangeinsertRatingReq) :MResponseRating
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_insertRating: String

	/**
	 * Removes votes matching provided criteria from a content.
	 * 
	 * <b>Validation:</b>
	 * <ul>
	 * 	<li>SEE ACL on the content</li>
	 * </ul>
	 * <ul>
	 * 	<li>RATINGALLOWED property on the content</li>
	 * </ul>
	 * @param tokenId : String
	 * @param param : MRatingFixedRangeremoveRatingsReq
	 * @return MResponseRating
	*/
	@POST
	@Path("/removeRatings")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/removeRatings", notes = """Removes votes matching provided criteria from a content.
	//#SWGNL#
	//#SWGNL#<b>Validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>SEE ACL on the content</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>RATINGALLOWED property on the content</li>
	//#SWGNL#</ul>""", response = classOf[MResponseRating])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def removeRatings(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MRatingFixedRangeremoveRatingsReq):Response /*returnType = MResponseRating*/ = {
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
			,PRestHelper.bindRequest[MRatingFixedRangeremoveRatingsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_removeRatings)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeRatings)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeRatings(tokenId: String, param: MRatingFixedRangeremoveRatingsReq) :MResponseRating
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeRatings: String

}