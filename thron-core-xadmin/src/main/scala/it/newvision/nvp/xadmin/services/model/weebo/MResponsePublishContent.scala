package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MMediaContent
import it.newvision.nvp.xadmin.services.model.msg.MEPublishWeeboAction

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePublishContent") 
@XmlType(name="MResponsePublishContent")
//#SWG#@ApiModel(description = """""")
class MResponsePublishContent extends MResponsePublishWeebo with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MMediaContent =_
	def withcontent(p:MMediaContent):MResponsePublishContent ={ 	this.content = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var actionsInError: List[MEPublishWeeboAction] = new ArrayList[MEPublishWeeboAction]
	def withactionsInError(p:List[MEPublishWeeboAction]):MResponsePublishContent ={ 	this.actionsInError = p; 	this }

}