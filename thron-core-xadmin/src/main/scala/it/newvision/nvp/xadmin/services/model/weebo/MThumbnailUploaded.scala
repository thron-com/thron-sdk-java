package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MFile

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MThumbnailUploaded") 
@XmlType(name="MThumbnailUploaded")
//#SWG#@ApiModel(description = """""")
class MThumbnailUploaded extends Serializable {

	/**
	 * the source File Descriptor.
	 */
	//#SWG#@ApiModelProperty(value = """the source File Descriptor.""")
	@BeanProperty 
	var file: MFile =_
	def withfile(p:MFile):this.type ={ 	this.file = p; 	this }

}