package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * restriction properties of the published content: geo-blocking, authentication
 * services...
 */
@XmlRootElement(name="MPublishedContentProperties") 
@XmlType(name="MPublishedContentProperties")
//#SWG#@ApiModel(description = """restriction properties of the published content: geo-blocking, authentication services...""")
class MPublishedContentProperties extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var enableGeoBlocking: Boolean  = false
	def withenableGeoBlocking(p:Boolean):MPublishedContentProperties ={ 	this.enableGeoBlocking = p; 	this }

	/**
	 * if true, the delivery services verify the tokenId parameter, to restrict the
	 * access to only the players (client) have been authenticated in the platform. 
	 */
	//#SWG#@ApiModelProperty(value = """if true, the delivery services verify the tokenId parameter, to restrict the access to only the players (client) have been authenticated in the platform. """ ,required = true)
	@BeanProperty 
	var onlyCertifiedClients: Boolean  = false
	def withonlyCertifiedClients(p:Boolean):MPublishedContentProperties ={ 	this.onlyCertifiedClients = p; 	this }

	/**
	 * if true, the delivery services verifies the authentication using the callback
	 * service send as parameter.
	 */
	//#SWG#@ApiModelProperty(value = """if true, the delivery services verifies the authentication using the callback service send as parameter.""" ,required = true)
	@BeanProperty 
	var useAuthenticationWebService: Boolean  = false
	def withuseAuthenticationWebService(p:Boolean):MPublishedContentProperties ={ 	this.useAuthenticationWebService = p; 	this }

	/**
	 * the list of countries code for geo blocking
	 */
	//#SWG#@ApiModelProperty(value = """the list of countries code for geo blocking""")
	@BeanProperty 
	var countries: List[String] = new ArrayList[String]
	def withcountries(p:List[String]):MPublishedContentProperties ={ 	this.countries = p; 	this }

	/**
	 * if true the countries list is used as blacklist otherwise is used as white list.
	 */
	//#SWG#@ApiModelProperty(value = """if true the countries list is used as blacklist otherwise is used as white list.""" ,required = true)
	@BeanProperty 
	var asBlackList: Boolean  = true
	def withasBlackList(p:Boolean):MPublishedContentProperties ={ 	this.asBlackList = p; 	this }

}