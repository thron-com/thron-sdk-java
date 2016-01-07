package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MTrashProperties") 
@XmlType(name="MTrashProperties")
//#SWG#@ApiModel(description = """""")
class MTrashProperties extends Serializable {

	/**
	 * Remove automatically the contents in trash older than x days (number of days).
	 * 0 or null means no scheduled service.
	 */
	//#SWG#@ApiModelProperty(value = """Remove automatically the contents in trash older than x days (number of days).
	//#SWGNL#0 or null means no scheduled service.""" ,required = true)
	@BeanProperty 
	var removeContentsOlderThan: Integer  = 0
	def withremoveContentsOlderThan(p:Integer):MTrashProperties ={ 	this.removeContentsOlderThan = p; 	this }

}