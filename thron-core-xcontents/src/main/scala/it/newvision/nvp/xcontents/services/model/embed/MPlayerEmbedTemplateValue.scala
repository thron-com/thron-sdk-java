package it.newvision.nvp.xcontents.services.model.embed
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
 * A template used to customize the Player layout
 */
@XmlRootElement(name="MPlayerEmbedTemplateValue") 
@XmlType(name="MPlayerEmbedTemplateValue")
//#SWG#@ApiModel(description = """A template used to customize the Player layout""")
class MPlayerEmbedTemplateValue extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * link to the platform template Id (CE1,CE2...) used to set the playerVersion
	 */
	//#SWG#@ApiModelProperty(value = """link to the platform template Id (CE1,CE2...) used to set the playerVersion""" ,required = true)
	@BeanProperty 
	var platformTemplateId: String =_
	def withplatformTemplateId(p:String):this.type ={ 	this.platformTemplateId = p; 	this }

}