package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.msg.MEPublishAction

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePublishContents") 
@XmlType(name="MResponsePublishContents")
//#SWG#@ApiModel(description = """""")
class MResponsePublishContents extends MResponsePublish with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var actionsInError: List[MEPublishAction] = new ArrayList[MEPublishAction]
	def withactionsInError(p:List[MEPublishAction]):this.type ={ 	this.actionsInError = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

}