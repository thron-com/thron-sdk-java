package it.newvision.nvp.xcontents.services.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float}  
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import it.newvision.nvp.xcontents.services.model.provider.MResponseRemoveProvider
import it.newvision.nvp.xcontents.services.model.provider.MResponseAddProvider
import it.newvision.nvp.xcontents.services.model.request.MProvideraddProviderReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * This service are used to update the provider properties of a Content. A Content
 * can be published using different providers, so these functions allow the user
 * to specify the identifier of the content in Weebo CDN or in Other CDN.
 * <b>
 * </b><b>Web Service Endpoints</b>:
 * <ul>
 * 	<li>WADL REST service: http://<clientId>-view.4me.
 * it/api/xcontents/resources/application.wadl</li>
 * 	<li>REST service: http://<clientId>-view.4me.
 * it/api/xcontents/resources/provider/</li>
 * 	<li>WSDL:http://<clientId>-view.4me.
 * it/api/xcontents/services/FProvider?wsdl</li>
 * </ul>
 */
@Path("provider")
trait JProvider extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * remove Provider
	 * @param tokenId : String
	 * @param clientId : String
	 * @param contentId : String
	 * @param providerName : String
	 * @param categoryIdForAcl : String
	 * Optional. For Acl validation
	 * @return MResponseRemoveProvider
	*/
	@POST
	@Path("removeProvider")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_FORM_URLENCODED))
	def removeProvider(@HeaderParam("X-TOKENID") tokenId: String, 
			@FormParam("clientId") clientId: String, 
			@FormParam("contentId") contentId: String, 
			@FormParam("providerName") providerName: String, 
			@FormParam("categoryIdForAcl") categoryIdForAcl: String):Response /*returnType = MResponseRemoveProvider*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__removeProvider(tokenId,clientId,contentId,providerName,categoryIdForAcl)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_removeProvider)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_removeProvider)
	    }
	} 

	@GET
	@Path("removeProvider")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Consumes(Array(MediaType.APPLICATION_JSON))
	def removeProvider_2(@QueryParam("tokenId")tokenId_q: String, 
			@QueryParam("clientId")clientId_q: String, 
			@QueryParam("contentId")contentId_q: String, 
			@QueryParam("providerName")providerName_q: String, 
			@QueryParam("categoryIdForAcl")categoryIdForAcl_q: String,
			@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseRemoveProvider*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{	
			val resp = this.__removeProvider(PRestHelper.getTokenId(tokenId_q, tokenId_h),clientId_q,contentId_q,providerName_q,categoryIdForAcl_q)
		
			PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_removeProvider)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_removeProvider)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __removeProvider(tokenId: String, clientId: String, contentId: String, providerName: String, categoryIdForAcl: String) :MResponseRemoveProvider
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_removeProvider: String

	/**
	 * The function create a new Provider for a different CDN
	 * @param tokenId : String
	 * @param param : MProvideraddProviderReq
	 * @return MResponseAddProvider
	*/
	@POST
	@Path("addProvider")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	def addProvider(@HeaderParam("X-TOKENID") tokenId: String, 
			param: MProvideraddProviderReq):Response /*returnType = MResponseAddProvider*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__addProvider(tokenId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_addProvider)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_addProvider)
	    }
	} 

	@GET
	@Path("addProvider")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	@Consumes(Array(MediaType.APPLICATION_JSON))
	def addProvider_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseAddProvider*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__addProvider(
			PRestHelper.getTokenId(tokenId_q, tokenId_h),
			PRestHelper.bindRequest[MProvideraddProviderReq](param_q)
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_addProvider)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_addProvider)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __addProvider(tokenId: String, param: MProvideraddProviderReq) :MResponseAddProvider
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_addProvider: String

}