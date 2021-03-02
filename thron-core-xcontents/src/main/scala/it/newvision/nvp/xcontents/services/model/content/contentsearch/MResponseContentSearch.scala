package it.newvision.nvp.xcontents.services.model.content.contentsearch
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentSearch") 
@XmlType(name="MResponseContentSearch")
//#SWG#@ApiModel(description = """""")
class MResponseContentSearch extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var resultCode: MEContentSearch =_
	def withresultCode(p:MEContentSearch):this.type ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):this.type ={ 	this.errorDescription = p; 	this }

}