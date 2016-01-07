package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MContentPlaylistParam

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishingProcess.newPlayListContent
 */
@XmlRootElement(name="MPublishingProcessnewPlayListContentReq")
@XmlType(name="MPublishingProcessnewPlayListContentReq")
//#SWG#@ApiModel(description = "Request message for service JPublishingProcess.newPlayListContent")
class MPublishingProcessnewPlayListContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MPublishingProcessnewPlayListContentReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MContentPlaylistParam =_
	def withparam(p:MContentPlaylistParam):MPublishingProcessnewPlayListContentReq ={ 	this.param = p; 	this }

}