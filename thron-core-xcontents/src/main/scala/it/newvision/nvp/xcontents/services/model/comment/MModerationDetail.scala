package it.newvision.nvp.xcontents.services.model.comment
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MModeration

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MModerationDetail") 
@XmlType(name="MModerationDetail")
//#SWG#@ApiModel(description = """""")
class MModerationDetail extends MModeration with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var commentId: String =_
	def withcommentId(p:String):this.type ={ 	this.commentId = p; 	this }

}