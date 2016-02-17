package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishExpressVideoParams") 
@XmlType(name="MPublishExpressVideoParams")
//#SWG#@ApiModel(description = """""")
class MPublishExpressVideoParams extends MPublishInWeebo with Serializable  {

	/**
	 * Optional. Used to publish a new video from the recorded video file of a live
	 * Event. It's necessary to know the liveEvent xcontentId.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to publish a new video from the recorded video file of a live Event. It's necessary to know the liveEvent xcontentId.""")
	@BeanProperty 
	var liveEventRec: MLiveEventRecParams =_
	def withliveEventRec(p:MLiveEventRecParams):this.type ={ 	this.liveEventRec = p; 	this }

}