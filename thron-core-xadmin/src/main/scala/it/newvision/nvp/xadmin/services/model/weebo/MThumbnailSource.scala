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
//#SWG#@ApiModel(description = """""")
class MThumbnailSource extends Serializable {

	/**
	 * filename with extension (example myimage.jpg)
	 */
	//#SWG#@ApiModelProperty(value = """filename with extension (example myimage.jpg)""" ,required = true)
	@BeanProperty 
	var fileName: String =_
	def withfileName(p:String):this.type ={ 	this.fileName = p; 	this }

	/**
	 * Max size: 2 MB
	 */
	//#SWG#@ApiModelProperty(value = """Max size: 2 MB""")
	@BeanProperty 
	var source: Array[Byte]= new Array[Byte](0)
	def withsource(p:Array[Byte]):this.type ={ 	this.source = p; 	this }

}