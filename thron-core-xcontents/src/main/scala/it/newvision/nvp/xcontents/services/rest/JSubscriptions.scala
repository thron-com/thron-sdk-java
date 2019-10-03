package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.uservalues.MResponseCategoriesSubscription
import it.newvision.nvp.xcontents.services.model.request.MSubscriptionscategoriesSubscriptionReq
import it.newvision.nvp.xcontents.services.model.uservalues.MResponseSubscription
import it.newvision.nvp.xcontents.services.model.request.MSubscriptionscategorySubscriptionReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Services used by subscribe a user to contents or categories changes.
 * 
 * <b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/api/xcontents/resources/subscriptions</li>
 * </ul>
 */
@Path("/subscriptions")
//#SWG#@Api(value = "/subscriptions", description = """Services used by subscribe a user to contents or categories changes.
//#SWGNL#
//#SWGNL#<b>Web Service Endpoints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/api/xcontents/resources/subscriptions</li>
//#SWGNL#</ul>""")
trait JSubscriptions extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * the user that invoke the service will subscribe or unsubscribe to categories notifications. It is
	 * also possible to subscribe or unsubscribe users you have the rights to modify
	 * @param tokenId : String
	 * @param param : MSubscriptionscategoriesSubscriptionReq
	 * @return MResponseCategoriesSubscription
	*/
	@POST
	@Path("/categoriesSubscription")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/categoriesSubscription", notes = """the user that invoke the service will subscribe or unsubscribe to categories notifications. It is also possible to subscribe or unsubscribe users you have the rights to modify""", response = classOf[MResponseCategoriesSubscription])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def categoriesSubscription(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MSubscriptionscategoriesSubscriptionReq):Response /*returnType = MResponseCategoriesSubscription*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__categoriesSubscription(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_categoriesSubscription)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_categoriesSubscription)
	    }
	} 

	@GET
	@Path("/categoriesSubscription")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def categoriesSubscription_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseCategoriesSubscription*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("categoriesSubscription",this._getCacheControl) 
		try{
			val resp = this.__categoriesSubscription(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MSubscriptionscategoriesSubscriptionReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_categoriesSubscription)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_categoriesSubscription)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __categoriesSubscription(tokenId: String, param: MSubscriptionscategoriesSubscriptionReq) :MResponseCategoriesSubscription
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_categoriesSubscription: String

	/**
	 * the user that invoke the service will subscribe or unsubscribe to category notifications
	 * @param tokenId : String
	 * @param param : MSubscriptionscategorySubscriptionReq
	 * @return MResponseSubscription
	*/
	@POST
	@Path("/categorySubscription")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/categorySubscription", notes = """the user that invoke the service will subscribe or unsubscribe to category notifications""", response = classOf[MResponseSubscription])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def categorySubscription(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			param: MSubscriptionscategorySubscriptionReq):Response /*returnType = MResponseSubscription*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__categorySubscription(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_categorySubscription)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_categorySubscription)
	    }
	} 

	@GET
	@Path("/categorySubscription")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def categorySubscription_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseSubscription*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		val cc = this.cachemap.getOrElse("categorySubscription",this._getCacheControl) 
		try{
			val resp = this.__categorySubscription(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,PRestHelper.bindRequest[MSubscriptionscategorySubscriptionReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, cc, callback_q,this.capability_categorySubscription)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_categorySubscription)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __categorySubscription(tokenId: String, param: MSubscriptionscategorySubscriptionReq) :MResponseSubscription
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_categorySubscription: String

}