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
@XmlRootElement(name="MClassificationEntityMinimal") 
@XmlType(name="MClassificationEntityMinimal")
//#SWG#@ApiModel(description = """""")
class MClassificationEntityMinimal extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var applicableTo: String =_
	def withapplicableTo(p:String):this.type ={ 	this.applicableTo = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean =_
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

}