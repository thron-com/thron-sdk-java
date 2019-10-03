package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.category.MCategoryCopyOption

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategory.copy
 */
@XmlRootElement(name="MCategorycopyReq")
@XmlType(name="MCategorycopyReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.copy")
class MCategorycopyReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var options: MCategoryCopyOption =_
	def withoptions(p:MCategoryCopyOption):this.type ={ 	this.options = p; 	this }

	/**
	 * Optional.Target categoryId
	 */
	//#SWG#@ApiModelProperty(value = """Optional.Target categoryId""", required = true)
	@BeanProperty
	var targetId: String =_
	def withtargetId(p:String):this.type ={ 	this.targetId = p; 	this }

}