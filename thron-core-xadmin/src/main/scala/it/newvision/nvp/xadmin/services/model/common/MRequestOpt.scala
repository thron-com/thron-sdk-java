package it.newvision.nvp.xadmin.services.model.common
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MRequestOpt") 
@XmlType(name="MRequestOpt")
//#SWG#@ApiModel(description = """""")
class MRequestOpt extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var runAsync: Boolean =_
	def withrunAsync(p:Boolean):this.type ={ 	this.runAsync = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var silentMode: Boolean =_
	def withsilentMode(p:Boolean):this.type ={ 	this.silentMode = p; 	this }

}