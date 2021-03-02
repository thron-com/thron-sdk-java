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
@XmlRootElement(name="MSourceDetail") 
@XmlType(name="MSourceDetail")
//#SWG#@ApiModel(description = """""")
class MSourceDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var fileName: String =_
	def withfileName(p:String):this.type ={ 	this.fileName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var extension: String =_
	def withextension(p:String):this.type ={ 	this.extension = p; 	this }

}