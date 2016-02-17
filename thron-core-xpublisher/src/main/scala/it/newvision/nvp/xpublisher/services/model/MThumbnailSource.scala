package it.newvision.nvp.xpublisher.services.model
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
 * Used to update the thumbnail for a published content. The thumbnail data has a
 * limit on the size of source byte array.
 */
@XmlRootElement(name="MThumbnailSource") 
@XmlType(name="MThumbnailSource")
//#SWG#@ApiModel(description = """Used to update the thumbnail for a published content. The thumbnail data has a limit on the size of source byte array.""")
class MThumbnailSource extends Serializable {

	/**
	 * byte[]
	 */
	//#SWG#@ApiModelProperty(value = """byte[]""")
	@BeanProperty 
	var source: Array[Byte]= new Array[Byte](0)
	def withsource(p:Array[Byte]):this.type ={ 	this.source = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

}