package it.newvision.nvp.identity.services.model.user
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseUserNumberOfUsers") 
@XmlType(name="MResponseUserNumberOfUsers")
//#SWG#@ApiModel(description = """""")
class MResponseUserNumberOfUsers extends MResponseUser with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var size: Integer =_
	def withsize(p:Integer):MResponseUserNumberOfUsers ={ 	this.size = p; 	this }

}