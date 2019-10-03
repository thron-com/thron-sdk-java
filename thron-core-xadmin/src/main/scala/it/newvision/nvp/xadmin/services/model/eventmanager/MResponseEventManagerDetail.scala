package it.newvision.nvp.xadmin.services.model.eventmanager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MEContentStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseEventManagerDetail") 
@XmlType(name="MResponseEventManagerDetail")
//#SWG#@ApiModel(description = """""")
class MResponseEventManagerDetail extends MResponseEventManager with Serializable  {

	/**
	 * used to show if the live event resources are published or not. When the the
	 * live event has status PUBLISHED the event can be ON AIR
	 */
	//#SWG#@ApiModelProperty(value = """used to show if the live event resources are published or not. When the the live event has status PUBLISHED the event can be ON AIR""" ,required = true)
	@BeanProperty 
	var contentStatus: MEContentStatus =_
	def withcontentStatus(p:MEContentStatus):this.type ={ 	this.contentStatus = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var detail: MServerLiveEventDetail =_
	def withdetail(p:MServerLiveEventDetail):this.type ={ 	this.detail = p; 	this }

}