package it.newvision.nvp.identity.services.model.common
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

	/**
	 * the optional crop Area
	 */
	//#SWG#@ApiModelProperty(value = """the optional crop Area""")
	@BeanProperty 
	var cropArea: MArea =_
	def withcropArea(p:MArea):this.type ={ 	this.cropArea = p; 	this }

	/**
	 * the mime type of the content
	 */
	//#SWG#@ApiModelProperty(value = """the mime type of the content""")
	@BeanProperty 
	var mimeType: String =_
	def withmimeType(p:String):this.type ={ 	this.mimeType = p; 	this }

}