package it.newvision.nvp.xcontents.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MTagCriteria") 
@XmlType(name="MTagCriteria")
//#SWG#@ApiModel(description = """""")
class MTagCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tags: List[String] = new ArrayList[String]
	def withtags(p:List[String]):this.type ={ 	this.tags = p; 	this }

}