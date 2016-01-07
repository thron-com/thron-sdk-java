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
	def withcontentReadValue(p:MEContentReadValue):MContentUserSpecificParams ={ 	this.contentReadValue = p; 	this }

	/**
	 * used to mark if the content is starred or not for the user
	 */
	//#SWG#@ApiModelProperty(value = """used to mark if the content is starred or not for the user""" ,required = true)
	@BeanProperty 
	@Deprecated
	var contentStarred: Boolean  = false
	@Deprecated
	def withcontentStarred(p:Boolean):MContentUserSpecificParams ={ 	this.contentStarred = p; 	this }

}