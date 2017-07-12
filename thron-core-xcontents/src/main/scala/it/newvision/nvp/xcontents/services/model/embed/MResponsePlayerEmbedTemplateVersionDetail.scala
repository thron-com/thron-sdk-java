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
@XmlRootElement(name="MResponsePlayerEmbedTemplateVersionDetail") 
@XmlType(name="MResponsePlayerEmbedTemplateVersionDetail")
//#SWG#@ApiModel(description = """""")
class MResponsePlayerEmbedTemplateVersionDetail extends MResponsePlayerEmbed with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var item: MPlayerEmbedTemplateVersionDetail =_
	def withitem(p:MPlayerEmbedTemplateVersionDetail):this.type ={ 	this.item = p; 	this }

}