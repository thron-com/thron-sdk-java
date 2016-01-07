package it.newvision.nvp.xpublisher.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MRestrictionProperties") 
@XmlType(name="MRestrictionProperties")
//#SWG#@ApiModel(description = """""")
class MRestrictionProperties extends Serializable {

	/**
	 * if true, the delivery services verify the tokenId parameter, to restrict the
	 * access to only to the players (clients) that have been authenticated in the
	 * platform. 
	 */
	//#SWG#@ApiModelProperty(value = """if true, the delivery services verify the tokenId parameter, to restrict the access to only to the players (clients) that have been authenticated in the platform. """ ,required = true)
	@BeanProperty 
	var onlyCertifiedClients: Boolean  = false
	def withonlyCertifiedClients(p:Boolean):MRestrictionProperties ={ 	this.onlyCertifiedClients = p; 	this }

	/**
	 * if true, the delivery services verifies the authentication using the callback
	 * service sent as parameter.
	 */
	//#SWG#@ApiModelProperty(value = """if true, the delivery services verifies the authentication using the callback service sent as parameter.""" ,required = true)
	@BeanProperty 
	var useAuthenticationWebService: Boolean  = false
	def withuseAuthenticationWebService(p:Boolean):MRestrictionProperties ={ 	this.useAuthenticationWebService = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var geoBlocking: MGeoLocation =_
	  def withgeoBlocking(p:MGeoLocation):MRestrictionProperties ={ 	this.geoBlocking = p; 	this }

	/**
	 * return if the content is public or not. The system enables the cache procedure.
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isPublicContent():Boolean ={
		this.onlyCertifiedClients == false && this.useAuthenticationWebService== false && Option(this.geoBlocking).isEmpty
	}

}