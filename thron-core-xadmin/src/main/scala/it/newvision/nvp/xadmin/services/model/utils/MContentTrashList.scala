package it.newvision.nvp.xadmin.services.model.utils
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentTrashList") 
@XmlType(name="MContentTrashList")
//#SWG#@ApiModel(description = """""")
class MContentTrashList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contentsToTrash: List[MContentToTrash] = new ArrayList[MContentToTrash]
	def withcontentsToTrash(p:List[MContentToTrash]):MContentTrashList ={ 	this.contentsToTrash = p; 	this }

}