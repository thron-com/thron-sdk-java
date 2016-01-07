package it.newvision.nvp.xreports.services.model.loganalyzer
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xreports.services.model.msg.MELogAnalyzer

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseLogAnalyzer") 
@XmlType(name="MResponseLogAnalyzer")
//#SWG#@ApiModel(description = """""")
class MResponseLogAnalyzer extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MELogAnalyzer =_
	def withresultCode(p:MELogAnalyzer):MResponseLogAnalyzer ={ 	this.resultCode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var errorDescription: String  = ""
	def witherrorDescription(p:String):MResponseLogAnalyzer ={ 	this.errorDescription = p; 	this }

}