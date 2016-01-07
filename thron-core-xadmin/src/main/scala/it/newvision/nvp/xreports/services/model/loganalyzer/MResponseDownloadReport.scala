package it.newvision.nvp.xreports.services.model.loganalyzer
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDownloadReport") 
@XmlType(name="MResponseDownloadReport")
//#SWG#@ApiModel(description = """""")
class MResponseDownloadReport extends MResponseLogAnalyzer with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var filePath: String =_
	def withfilePath(p:String):MResponseDownloadReport ={ 	this.filePath = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var mimeType: String =_
	def withmimeType(p:String):MResponseDownloadReport ={ 	this.mimeType = p; 	this }

}