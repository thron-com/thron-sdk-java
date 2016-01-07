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
	def withbuffer(p:Array[Byte]):MSource ={ 	this.buffer = p; 	this }

	/**
	 * the optional crop Area
	 */
	//#SWG#@ApiModelProperty(value = """the optional crop Area""")
	@BeanProperty 
	var cropArea: MArea =_
	def withcropArea(p:MArea):MSource ={ 	this.cropArea = p; 	this }

	/**
	 * the mime type of the content
	 */
	//#SWG#@ApiModelProperty(value = """the mime type of the content""")
	@BeanProperty 
	var mimeType: String =_
	def withmimeType(p:String):MSource ={ 	this.mimeType = p; 	this }

}