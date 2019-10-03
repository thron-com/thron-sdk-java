package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MLinkedCategoryOp") 
@XmlType(name="MLinkedCategoryOp")
//#SWG#@ApiModel(description = """""")
class MLinkedCategoryOp extends Serializable {

	/**
	 * phrase, exact_match
	 */
	//#SWG#@ApiModelProperty(value = """phrase, exact_match""")
	@BeanProperty 
	var cascade: Boolean  = false
	def withcascade(p:Boolean):this.type ={ 	this.cascade = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

}