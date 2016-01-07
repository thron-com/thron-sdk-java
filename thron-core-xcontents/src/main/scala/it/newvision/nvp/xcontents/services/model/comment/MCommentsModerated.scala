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
@XmlRootElement(name="MCommentsModerated") 
@XmlType(name="MCommentsModerated")
//#SWG#@ApiModel(description = """""")
class MCommentsModerated extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var values: List[MModerationDetail] = new ArrayList[MModerationDetail]
	def withvalues(p:List[MModerationDetail]):MCommentsModerated ={ 	this.values = p; 	this }

}