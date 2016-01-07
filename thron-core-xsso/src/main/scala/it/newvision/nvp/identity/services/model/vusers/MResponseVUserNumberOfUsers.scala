package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseVUserNumberOfUsers") 
@XmlType(name="MResponseVUserNumberOfUsers")
//#SWG#@ApiModel(description = """""")
class MResponseVUserNumberOfUsers extends MResponseVUser with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var size: Integer =_
	def withsize(p:Integer):MResponseVUserNumberOfUsers ={ 	this.size = p; 	this }

}