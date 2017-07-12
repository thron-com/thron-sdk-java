package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerEmbedTemplateMinimal") 
@XmlType(name="MPlayerEmbedTemplateMinimal")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedTemplateMinimal extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var templateId: String =_
	def withtemplateId(p:String):this.type ={ 	this.templateId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var templateType: MEPlayerEmbedTemplateType =_
	def withtemplateType(p:MEPlayerEmbedTemplateType):this.type ={ 	this.templateType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var templateVersion: Integer =_
	def withtemplateVersion(p:Integer):this.type ={ 	this.templateVersion = p; 	this }

}