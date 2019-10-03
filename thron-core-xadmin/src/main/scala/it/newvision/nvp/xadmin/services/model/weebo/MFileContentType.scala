package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Represent a mapping for a given fileName with the corresponding list of
 * available contentTypes.
 */
@XmlRootElement(name="MFileContentType") 
@XmlType(name="MFileContentType")
//#SWG#@ApiModel(description = """Represent a mapping for a given fileName with the corresponding list of available contentTypes.""")
class MFileContentType extends Serializable {

	/**
	 * The list of possible contentType the specific fileName can be published in
	 * platform. 
	 */
	//#SWG#@ApiModelProperty(value = """The list of possible contentType the specific fileName can be published in platform. """)
	@BeanProperty 
	var contentType: List[MEContentType] = new ArrayList[MEContentType]
	def withcontentType(p:List[MEContentType]):this.type ={ 	this.contentType = p; 	this }

	/**
	 * filename with extension (example myimage.jpg)
	 */
	//#SWG#@ApiModelProperty(value = """filename with extension (example myimage.jpg)""" ,required = true)
	@BeanProperty 
	var fileName: String =_
	def withfileName(p:String):this.type ={ 	this.fileName = p; 	this }

}