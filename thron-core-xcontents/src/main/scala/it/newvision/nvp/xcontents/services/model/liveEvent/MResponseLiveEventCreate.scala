package it.newvision.nvp.xcontents.services.model.liveEvent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MLiveEvent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseLiveEventCreate") 
@XmlType(name="MResponseLiveEventCreate")
//#SWG#@ApiModel(description = """""")
class MResponseLiveEventCreate extends MResponseLiveEvent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var liveEvent: MLiveEvent =_
	def withliveEvent(p:MLiveEvent):this.type ={ 	this.liveEvent = p; 	this }

}