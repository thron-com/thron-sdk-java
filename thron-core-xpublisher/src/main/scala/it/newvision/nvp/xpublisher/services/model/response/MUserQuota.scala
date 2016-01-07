package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUserQuota") 
@XmlType(name="MUserQuota")
//#SWG#@ApiModel(description = """""")
class MUserQuota extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):MUserQuota ={ 	this.userId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var usedSpace: Long =_
	def withusedSpace(p:Long):MUserQuota ={ 	this.usedSpace = p; 	this }

}