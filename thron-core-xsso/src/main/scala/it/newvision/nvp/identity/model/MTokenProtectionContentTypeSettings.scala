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
@XmlRootElement(name="MTokenProtectionContentTypeSettings") 
@XmlType(name="MTokenProtectionContentTypeSettings")
//#SWG#@ApiModel(description = """""")
class MTokenProtectionContentTypeSettings extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var defaultDuration: Long =_
	def withdefaultDuration(p:Long):this.type ={ 	this.defaultDuration = p; 	this }

}