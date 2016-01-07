package it.newvision.nvp.xadmin.services.model.common
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
 * op = "remove" , field = "/attribute1"
 * 
 * The update service will remove the value from the field "attribute1"
 */
@XmlRootElement(name="MPatch") 
@XmlType(name="MPatch")
//#SWG#@ApiModel(description = """Used to patch an update operation.
//#SWGNL#Example:
//#SWGNL#op = "remove" , field = "/attribute1"
//#SWGNL#
//#SWGNL#The update service will remove the value from the field "attribute1"""")
class MPatch extends Serializable {

	/**
	 * operation type. Possible values are:
	 * remove
	 */
	//#SWG#@ApiModelProperty(value = """operation type. Possible values are: 
	//#SWGNL#remove""")
	@BeanProperty 
	var op: String =_
	def withop(p:String):MPatch ={ 	this.op = p; 	this }

	/**
	 * field path
	 * example: "attribute1"
	 */
	//#SWG#@ApiModelProperty(value = """field path
	//#SWGNL#example: "attribute1"""")
	@BeanProperty 
	var field: String =_
	def withfield(p:String):MPatch ={ 	this.field = p; 	this }

}