package it.newvision.nvp.test.services.model.request
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
 * Request message for service JTestService.list
 */
@XmlRootElement(name="MTestServicelistReq")
@XmlType(name="MTestServicelistReq")
//#SWG#@ApiModel(description = "Request message for service JTestService.list")
class MTestServicelistReq extends Serializable {

	/**
	 * Optional. default value is 50
	 * Define the number of items returned by the service.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. default value is 50
	//#SWGNL#Define the number of items returned by the service.""", required = true)
	@BeanProperty
	var numberOfResults: Integer =_
	def withnumberOfResults(p:Integer):MTestServicelistReq ={ 	this.numberOfResults = p; 	this }

}