package it.newvision.nvp.xcontents.services.model.common
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPaging") 
@XmlType(name="MPaging")
//#SWG#@ApiModel(description = """""")
class MPaging extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var nextPageToken: String =_
	def withnextPageToken(p:String):this.type ={ 	this.nextPageToken = p; 	this }

}