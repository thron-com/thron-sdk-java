package it.newvision.nvp.xpackager.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MFileSource") 
@XmlType(name="MFileSource")
//#SWG#@ApiModel(description = """""")
class MFileSource extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var originalFileName: String =_
	def withoriginalFileName(p:String):this.type ={ 	this.originalFileName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceType: MEFileSourceType =_
	def withsourceType(p:MEFileSourceType):this.type ={ 	this.sourceType = p; 	this }

}