package it.newvision.nvp.identity.model
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
 * Other custom Profile picture image. 
 */
@XmlRootElement(name="MImage") 
@XmlType(name="MImage")
//#SWG#@ApiModel(description = """Other custom Profile picture image. """)
class MImage extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var imageUrl: String =_
	def withimageUrl(p:String):MImage ={ 	this.imageUrl = p; 	this }

}