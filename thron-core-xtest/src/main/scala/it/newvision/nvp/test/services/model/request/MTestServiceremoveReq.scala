package it.newvision.nvp.test.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JTestService.remove
 */
@XmlRootElement(name="MTestServiceremoveReq")
@XmlType(name="MTestServiceremoveReq")
//#SWG#@ApiModel(description = "Request message for service JTestService.remove")
class MTestServiceremoveReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var pstring: String =_
	def withpstring(p:String):MTestServiceremoveReq ={ 	this.pstring = p; 	this }

}