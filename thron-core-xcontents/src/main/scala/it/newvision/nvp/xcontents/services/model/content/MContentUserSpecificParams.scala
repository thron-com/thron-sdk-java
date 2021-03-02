package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.msg.MEContentReadValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentUserSpecificParams") 
@XmlType(name="MContentUserSpecificParams")
//#SWG#@ApiModel(description = """""")
class MContentUserSpecificParams extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentReadValue: MEContentReadValue  = MEContentReadValue.READ
	def withcontentReadValue(p:MEContentReadValue):this.type ={ 	this.contentReadValue = p; 	this }

	/**
	 * Used to mark if the content is starred or not for the user. Each user
	 * has the limit of 5000 contents starred.
	 */
	//#SWG#@ApiModelProperty(value = """Used to mark if the content is starred or not for the user. Each user has the limit of 5000 contents starred.""")
	@BeanProperty 
	var contentStarred: Boolean  =_
	def withcontentStarred(p:Boolean):this.type ={ 	this.contentStarred = p; 	this }

}