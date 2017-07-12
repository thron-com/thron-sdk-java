package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * A template used to customize the Player layout
 */
@XmlRootElement(name="MPlayerEmbedTemplateUpdate") 
@XmlType(name="MPlayerEmbedTemplateUpdate")
//#SWG#@ApiModel(description = """A template used to customize the Player layout""")
class MPlayerEmbedTemplateUpdate extends MUpdater with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

}