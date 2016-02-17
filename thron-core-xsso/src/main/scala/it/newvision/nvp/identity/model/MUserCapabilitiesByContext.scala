package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUserCapabilitiesByContext") 
@XmlType(name="MUserCapabilitiesByContext")
//#SWG#@ApiModel(description = """""")
class MUserCapabilitiesByContext extends Serializable {

	/**
	 * the groupId or "owned"
	 */
	//#SWG#@ApiModelProperty(value = """the groupId or "owned"""" ,required = true)
	@BeanProperty 
	var context: String  = "owned"
	def withcontext(p:String):this.type ={ 	this.context = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var capability: MUserCapability =_
	def withcapability(p:MUserCapability):this.type ={ 	this.capability = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var classificationIds: List[String] = new ArrayList[String]
	def withclassificationIds(p:List[String]):this.type ={ 	this.classificationIds = p; 	this }

}