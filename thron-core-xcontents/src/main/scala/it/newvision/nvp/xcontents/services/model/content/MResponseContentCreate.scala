package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentCreate") 
@XmlType(name="MResponseContentCreate")
//#SWG#@ApiModel(description = """""")
class MResponseContentCreate extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentID: String =_
	def withcontentID(p:String):this.type ={ 	this.contentID = p; 	this }

}