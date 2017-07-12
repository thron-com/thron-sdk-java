package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEPlayerEmbedTemplateRole

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerEmbedTemplateRole") 
@XmlType(name="MPlayerEmbedTemplateRole")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedTemplateRole extends Serializable {

	/**
	 * username or grupId
	 */
	//#SWG#@ApiModelProperty(value = """username or grupId""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var subjectType: MESubjectType =_
	def withsubjectType(p:MESubjectType):this.type ={ 	this.subjectType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var role: MEPlayerEmbedTemplateRole =_
	def withrole(p:MEPlayerEmbedTemplateRole):this.type ={ 	this.role = p; 	this }

}