package it.newvision.nvp.xpublisher.services.model.liveEvents
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MLiveEvent
import it.newvision.nvp.xpublisher.services.model.response.MResponsePublisher

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseEventDetail") 
@XmlType(name="MResponseEventDetail")
//#SWG#@ApiModel(description = """""")
class MResponseEventDetail extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MLiveEvent =_
	def withcontent(p:MLiveEvent):MResponseEventDetail ={ 	this.content = p; 	this }

}