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
@XmlRootElement(name="MResponseCopyCategory") 
@XmlType(name="MResponseCopyCategory")
//#SWG#@ApiModel(description = """""")
class MResponseCopyCategory extends MResponseCategory with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var categoryId: String =_
	def withcategoryId(p:String):this.type ={ 	this.categoryId = p; 	this }

	/**
	 * Async job Id. Used to check the operation status.
	 */
	//#SWG#@ApiModelProperty(value = """Async job Id. Used to check the operation status.""" ,required = true)
	@BeanProperty 
	var jobId: String =_
	def withjobId(p:String):this.type ={ 	this.jobId = p; 	this }

}