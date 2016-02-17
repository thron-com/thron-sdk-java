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
@XmlRootElement(name="MPolicy") 
@XmlType(name="MPolicy")
//#SWG#@ApiModel(description = """""")
class MPolicy extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var access: MEAccess =_
	def withaccess(p:MEAccess):this.type ={ 	this.access = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var canChangePolicy: Boolean  = false
	def withcanChangePolicy(p:Boolean):this.type ={ 	this.canChangePolicy = p; 	this }

}