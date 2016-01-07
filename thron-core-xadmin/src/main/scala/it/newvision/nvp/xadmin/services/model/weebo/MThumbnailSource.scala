package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used for future requirements. 
 */
@XmlRootElement(name="MThumbnailSource") 
@XmlType(name="MThumbnailSource")
//#SWG#@ApiModel(description = """Used for future requirements. """)
class MThumbnailSource extends Serializable {

	/**
	 * filename with extension (example myimage.jpg)
	 */
	//#SWG#@ApiModelProperty(value = """filename with extension (example myimage.jpg)""" ,required = true)
	@BeanProperty 
	var fileName: String =_
	def withfileName(p:String):MThumbnailSource ={ 	this.fileName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var source: Array[Byte]= new Array[Byte](0)
	def withsource(p:Array[Byte]):MThumbnailSource ={ 	this.source = p; 	this }

}