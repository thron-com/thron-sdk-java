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
@XmlRootElement(name="MBuffer") 
@XmlType(name="MBuffer")
//#SWG#@ApiModel(description = """""")
class MBuffer extends Serializable {

	/**
	 * Data must be encoded in UTF-8 charset
	 */
	//#SWG#@ApiModelProperty(value = """Data must be encoded in UTF-8 charset""")
	@BeanProperty 
	var buffer: Array[Byte]= new Array[Byte](0)
	def withbuffer(p:Array[Byte]):this.type ={ 	this.buffer = p; 	this }

}