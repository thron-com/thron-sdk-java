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
@XmlRootElement(name="MGroupPolicy") 
@XmlType(name="MGroupPolicy")
//#SWG#@ApiModel(description = """""")
class MGroupPolicy extends MPolicy with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var groupId: String =_
	def withgroupId(p:String):this.type ={ 	this.groupId = p; 	this }

}