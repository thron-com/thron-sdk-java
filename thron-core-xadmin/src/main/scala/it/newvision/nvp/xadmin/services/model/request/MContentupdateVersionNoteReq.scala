package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.content.MUpdateVersionParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.updateVersionNote
 */
@XmlRootElement(name="MContentupdateVersionNoteReq")
@XmlType(name="MContentupdateVersionNoteReq")
//#SWG#@ApiModel(description = "Request message for service JContent.updateVersionNote")
class MContentupdateVersionNoteReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MUpdateVersionParams =_
	def withparam(p:MUpdateVersionParams):this.type ={ 	this.param = p; 	this }

}