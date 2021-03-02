package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MDateRangeExtended") 
@XmlType(name="MDateRangeExtended")
//#SWG#@ApiModel(description = """""")
class MDateRangeExtended extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var from: String =_
	def withfrom(p:String):this.type ={ 	this.from = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var to: String =_
	def withto(p:String):this.type ={ 	this.to = p; 	this }

}