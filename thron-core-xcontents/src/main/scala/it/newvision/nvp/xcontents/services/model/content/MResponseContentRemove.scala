package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentRemove") 
@XmlType(name="MResponseContentRemove")
//#SWG#@ApiModel(description = """""")
class MResponseContentRemove extends MResponseContent with Serializable  {

	/**
	 * the content removed
	 */
	//#SWG#@ApiModelProperty(value = """the content removed""")
	@BeanProperty 
	var content: MContent =_
	def withcontent(p:MContent):this.type ={ 	this.content = p; 	this }

}