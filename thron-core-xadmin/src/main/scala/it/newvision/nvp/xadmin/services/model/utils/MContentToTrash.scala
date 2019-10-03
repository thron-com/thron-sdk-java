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
@XmlRootElement(name="MContentToTrash") 
@XmlType(name="MContentToTrash")
//#SWG#@ApiModel(description = """""")
class MContentToTrash extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var removeOptions: MMoveToTrashOptions =_
	def withremoveOptions(p:MMoveToTrashOptions):this.type ={ 	this.removeOptions = p; 	this }

	/**
	 * Required. The xcontent Id to remove
	 */
	//#SWG#@ApiModelProperty(value = """Required. The xcontent Id to remove""" ,required = true)
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

}