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
/**
 * Geo localization properties. Define for which countries the content is
 * available or not.
 */
@XmlRootElement(name="MGeoLocation") 
@XmlType(name="MGeoLocation")
//#SWG#@ApiModel(description = """Geo localization properties. Define for which countries the content is available or not.""")
class MGeoLocation extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var enabled: Boolean  = false
	def withenabled(p:Boolean):MGeoLocation ={ 	this.enabled = p; 	this }

	/**
	 * the list of country codes
	 */
	//#SWG#@ApiModelProperty(value = """the list of country codes""")
	@BeanProperty 
	var countries: List[String] = new ArrayList[String]
	def withcountries(p:List[String]):MGeoLocation ={ 	this.countries = p; 	this }

	/**
	 * if true the countries list is used as blacklist otherwise it is used as white
	 * list.
	 */
	//#SWG#@ApiModelProperty(value = """if true the countries list is used as blacklist otherwise it is used as white list.""" ,required = true)
	@BeanProperty 
	var asBlackList: Boolean  = true
	def withasBlackList(p:Boolean):MGeoLocation ={ 	this.asBlackList = p; 	this }

}