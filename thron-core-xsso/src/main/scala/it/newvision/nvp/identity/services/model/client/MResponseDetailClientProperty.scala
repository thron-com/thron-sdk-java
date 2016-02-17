package it.newvision.nvp.identity.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MProperty

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDetailClientProperty") 
@XmlType(name="MResponseDetailClientProperty")
//#SWG#@ApiModel(description = """""")
class MResponseDetailClientProperty extends MResponseClient with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var properties: MProperty =_
	def withproperties(p:MProperty):this.type ={ 	this.properties = p; 	this }

}