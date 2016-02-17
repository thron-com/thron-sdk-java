package it.newvision.nvp.xcontents.services.model.comment
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MComment

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDetailComment") 
@XmlType(name="MResponseDetailComment")
//#SWG#@ApiModel(description = """""")
class MResponseDetailComment extends MResponseComment with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var comment: MComment =_
	def withcomment(p:MComment):this.type ={ 	this.comment = p; 	this }

}