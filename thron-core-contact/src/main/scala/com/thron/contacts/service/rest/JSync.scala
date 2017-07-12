package com.thron.contacts.service.rest
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import javax.ws.rs._ 
import javax.ws.rs.core._ 
import com.thron.contacts.service.model.sync.MResponseUpdatedContacts
import com.thron.contacts.service.model.request.MSyncupdatedContactsReq
import com.thron.contacts.service.model.sync.MResponseExport
import com.thron.contacts.service.model.request.MSyncexportReq

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Service used for integration with external systems.
 * <b>
 * </b><b>Web Service Endpoints:</b>
 * <ul>
 * 	<li>REST service: https://clientId-view.thron.
 * com/contactunit/xcontact/resources/sync</li>
 * </ul>
 */
@Path("/sync")
//#SWG#@Api(value = "/sync", description = """Service used for integration with external systems.
//#SWGNL#<b>
//#SWGNL#</b><b>Web Service Endpoints:</b> 
//#SWGNL#<ul>
//#SWGNL#	<li>REST service: https://clientId-view.thron.com/contactunit/xcontact/resources/sync</li>
//#SWGNL#</ul>""")
trait JSync extends it.newvision.nvp.core.libraries.restserver.BaseResource {

	

	//define the cachemap used to customise the specific cachecontrol value for each single service.

	import scala.collection.immutable.Map

	protected val cachemap:Map[String,CacheControl] //TO OVERRIDE IN Resource class

	/**
	 * The service returns the list of contacts modified inside the specified date range.
	 * The response provides all metadata information and the list of ids (contacts.removed) of the
	 * contacts removed within the date range.
	 * The service can return for each contacts the itagDefinitions.
	 * The resultset is paginated (max page size is 200 elements), after the 1st call the service return
	 * a
	 * "nextPage" identifier to be used on the next call, to get the following elements. If  the
	 * "nextPage" value is empty it means that you are on the last page of the result set.
	 * 
	 * Service call frequency: the service should be called every 10 minutes.
	 * 
	 * <b>ROLE validation:</b>
	 * <ul>
	 * 	<li>CORE_SYNC_CONTACTS</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MSyncupdatedContactsReq
	 * @return MResponseUpdatedContacts
	*/
	@POST
	@Path("/updatedContacts/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/updatedContacts", notes = """The service returns the list of contacts modified inside the specified date range.
	//#SWGNL#The response provides all metadata information and the list of ids (contacts.removed) of the
	//#SWGNL#contacts removed within the date range.
	//#SWGNL#The service can return for each contacts the itagDefinitions.
	//#SWGNL#The resultset is paginated (max page size is 200 elements), after the 1st call the service return a
	//#SWGNL#"nextPage" identifier to be used on the next call, to get the following elements. If  the
	//#SWGNL#"nextPage" value is empty it means that you are on the last page of the result set.
	//#SWGNL#
	//#SWGNL#Service call frequency: the service should be called every 10 minutes.
	//#SWGNL#
	//#SWGNL#<b>ROLE validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_SYNC_CONTACTS</li>
	//#SWGNL#</ul>""", response = classOf[MResponseUpdatedContacts])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def updatedContacts(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MSyncupdatedContactsReq):Response /*returnType = MResponseUpdatedContacts*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__updatedContacts(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_updatedContacts)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_updatedContacts)
	    }
	} 

	@GET
	@Path("/updatedContacts/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def updatedContacts_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseUpdatedContacts*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__updatedContacts(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MSyncupdatedContactsReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_updatedContacts)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_updatedContacts)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __updatedContacts(tokenId: String, clientId: String, param: MSyncupdatedContactsReq) :MResponseUpdatedContacts
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_updatedContacts: String

	/**
	 * Used to export all contacts matching the given criteria.
	 * The service can return for each contacts the itagDefinitions.
	 * The resultset is paginated (max page size is 200 elements), after the 1st call the service return
	 * a
	 * "nextPage" identifier to be used on the next call, to get the following elements. If  the
	 * "nextPage" value is empty it means that you are on the last page of the result set.
	 * 
	 * <b>ROLE validation:</b>
	 * <ul>
	 * 	<li>CORE_SYNC_CONTACTS</li>
	 * </ul>
	 * @param tokenId : String
	 * @param clientId : String
	 * @param param : MSyncexportReq
	 * @return MResponseExport
	*/
	@POST
	@Path("/export/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	@Consumes(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
	//#SWG#@ApiOperation(value = "/export", notes = """Used to export all contacts matching the given criteria.
	//#SWGNL#The service can return for each contacts the itagDefinitions.
	//#SWGNL#The resultset is paginated (max page size is 200 elements), after the 1st call the service return a
	//#SWGNL#"nextPage" identifier to be used on the next call, to get the following elements. If  the
	//#SWGNL#"nextPage" value is empty it means that you are on the last page of the result set.
	//#SWGNL#
	//#SWGNL#<b>ROLE validation:</b>
	//#SWGNL#<ul>
	//#SWGNL#	<li>CORE_SYNC_CONTACTS</li>
	//#SWGNL#</ul>""", response = classOf[MResponseExport])
			//#SWG#@ApiResponses(value=Array(new ApiResponse(code=200, message="OK"),new ApiResponse(code=400, message="Invalid Arguments"),new ApiResponse(code=418, message="Exception"),new ApiResponse(code=403, message="Access Denied/Session Expired"), new ApiResponse(code=404, message="Not Found"), new ApiResponse(code=307, message="Temporary redirect")))
	def export(//#SWG#@ApiParam(name = "X-TOKENID", value = "session token", required=false)
	@HeaderParam("X-TOKENID")
	tokenId: String, 
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String, 
			param: MSyncexportReq):Response /*returnType = MResponseExport*/ = {
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		try{
			val resp = this.__export(tokenId,clientId,param)
			PRestHelper.responseForPOST(resp, this._postCacheControl,this.capability_export)    
		}catch{
	      case e:WebApplicationException =>
	        throw new WebApplicationException(e,this.capability_export)
	    }
	} 

	@GET
	@Path("/export/{clientId}")
	@Produces(Array(MediaType.APPLICATION_JSON,"application/x-javascript"))
	def export_2(@HeaderParam("X-TOKENID") tokenId_h: String,
			@QueryParam("tokenId") tokenId_q: String,
			//#SWG#@ApiParam(value = """""")
	@PathParam("clientId")
	clientId: String,
			@QueryParam("param") param_q: String,
			@QueryParam("callback") callback_q: String):Response /*returnType = MResponseExport*/ = { 
		import it.newvision.nvp.core.libraries.restserver.PRestHelper
		import it.newvision.core.dictionary.exceptions.WebApplicationException
		import org.apache.commons.lang.StringUtils
		try{
			val resp = this.__export(
			PRestHelper.getTokenId(tokenId_q, tokenId_h)
			,clientId,PRestHelper.bindRequest[MSyncexportReq](param_q)	
		    )
	      PRestHelper.responseForGET(resp, this._getCacheControl, callback_q,this.capability_export)
	    }catch{
	      case e:WebApplicationException=>
	        if(StringUtils.isBlank(callback_q)) throw e
	        PRestHelper.responseAsException(e.getResponse, this._getCacheControl, callback_q,this.capability_export)
	    }
	}

	/** ABSTRACT METHOD TO IMPLEMENT */ 
	 protected def __export(tokenId: String, clientId: String, param: MSyncexportReq) :MResponseExport
	/** ABSTRACT METHOD. IMPLEMENT USING THE RIGHT CAPABILITY NAME */ 
	protected def capability_export: String

}