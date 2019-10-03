package it.newvision.nvp.xadmin.services.model.content
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
 * Used to update the content information of the published content.
 */
@XmlRootElement(name="MContentBasicInfo") 
@XmlType(name="MContentBasicInfo")
//#SWG#@ApiModel(description = """""")
class MContentBasicInfo extends Serializable {

	/**
	 * Follows the MContent4Locale.description constraints (length < 10000)
	 */
	//#SWG#@ApiModelProperty(value = """Follows the MContent4Locale.description constraints (length < 10000)""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * Locale code (ISO639-1)
	 */
	//#SWG#@ApiModelProperty(value = """Locale code (ISO639-1)""" ,required = true)
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * Follows the MContent4Locale.description constraints (length < 150)
	 */
	//#SWG#@ApiModelProperty(value = """Follows the MContent4Locale.description constraints (length < 150)""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * desired prettyId for the content and locale. See reference xcontent.MPrettyId
	 */
	//#SWG#@ApiModelProperty(value = """desired prettyId for the content and locale. See reference xcontent.MPrettyId""")
	@BeanProperty 
	var prettyId: String =_
	def withprettyId(p:String):this.type ={ 	this.prettyId = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import org.apache.commons.lang.StringUtils
		if(StringUtils.isBlank(locale)||StringUtils.isBlank(name)){
			throw new IllegalArgumentException("locale and name are required")
		}
	}

}