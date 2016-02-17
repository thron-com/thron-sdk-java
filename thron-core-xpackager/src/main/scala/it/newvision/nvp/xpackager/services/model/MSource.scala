package it.newvision.nvp.xpackager.services.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSource") 
@XmlType(name="MSource")
//#SWG#@ApiModel(description = """""")
class MSource extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var buffer: Array[Byte]= new Array[Byte](0)
	def withbuffer(p:Array[Byte]):this.type ={ 	this.buffer = p; 	this }

}