package it.newvision.nvp.xcontents.services.model.liveEvent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseLiveEventDetail") 
@XmlType(name="MResponseLiveEventDetail")
//#SWG#@ApiModel(description = """""")
class MResponseLiveEventDetail extends MResponseLiveEvent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var liveEvent: MLiveEventDetail =_
	def withliveEvent(p:MLiveEventDetail):this.type ={ 	this.liveEvent = p; 	this }

}