package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MPlayerEmbedTemplate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePlayerEmbedTemplateDetail") 
@XmlType(name="MResponsePlayerEmbedTemplateDetail")
//#SWG#@ApiModel(description = """""")
class MResponsePlayerEmbedTemplateDetail extends MResponsePlayerEmbed with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var item: MPlayerEmbedTemplate =_
	def withitem(p:MPlayerEmbedTemplate):this.type ={ 	this.item = p; 	this }

}