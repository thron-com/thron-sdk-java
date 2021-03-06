package it.newvision.nvp.xcontents.services.model.common
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used to patch an update operation.
 * Example:
 * op = "remove" , field = "attribute1"
 * 
 * The update service will remove the value from the field "attribute1"
 */
@XmlRootElement(name="MPatch") 
@XmlType(name="MPatch")
//#SWG#@ApiModel(description = """Used to patch an update operation.
//#SWGNL#Example:
//#SWGNL#op = "remove" , field = "attribute1"
//#SWGNL#
//#SWGNL#The update service will remove the value from the field "attribute1"""")
class MPatch extends Serializable {

	/**
	 * field path
	 * example: "attribute1"
	 */
	//#SWG#@ApiModelProperty(value = """field path
	//#SWGNL#example: "attribute1"""")
	@BeanProperty 
	var field: String =_
	def withfield(p:String):this.type ={ 	this.field = p; 	this }

	/**
	 * operation type. Possible values is remove
	 */
	//#SWG#@ApiModelProperty(value = """operation type. Possible values is remove""")
	@BeanProperty 
	var op: String =_
	def withop(p:String):this.type ={ 	this.op = p; 	this }

}