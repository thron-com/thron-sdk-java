package it.newvision.nvp.xcontents.services.model.request
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
 * Request message for service JCategory.move
 */
@XmlRootElement(name="MCategorymoveReq")
@XmlType(name="MCategorymoveReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.move")
class MCategorymoveReq extends Serializable {

	/**
	 * Optional.Target categoryId or prettyId
	 */
	//#SWG#@ApiModelProperty(value = """Optional.Target categoryId or prettyId""", required = true)
	@BeanProperty
	var targetId: String =_
	def withtargetId(p:String):this.type ={ 	this.targetId = p; 	this }

}