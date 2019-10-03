package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentVersionResponseOptions") 
@XmlType(name="MContentVersionResponseOptions")
//#SWG#@ApiModel(description = """""")
class MContentVersionResponseOptions extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var returnBody: Boolean  = false
	def withreturnBody(p:Boolean):this.type ={ 	this.returnBody = p; 	this }

}