package it.newvision.nvp.xcontents.services.model.comment
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCommentsList") 
@XmlType(name="MCommentsList")
//#SWG#@ApiModel(description = """""")
class MCommentsList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var commentId: List[String] = new ArrayList[String]
	def withcommentId(p:List[String]):MCommentsList ={ 	this.commentId = p; 	this }

}