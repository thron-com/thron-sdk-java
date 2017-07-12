package it.newvision.nvp.xcontents.services.model.category
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseCopyCategoryStatus") 
@XmlType(name="MResponseCopyCategoryStatus")
//#SWG#@ApiModel(description = """""")
class MResponseCopyCategoryStatus extends MResponseCategory with Serializable  {

	/**
	 * COMPLETE,RUNNING,ERROR
	 */
	//#SWG#@ApiModelProperty(value = """COMPLETE,RUNNING,ERROR""" ,required = true)
	@BeanProperty 
	var status: String =_
	def withstatus(p:String):this.type ={ 	this.status = p; 	this }

}