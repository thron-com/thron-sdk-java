package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.content.MUpdateVersionBody

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.updateVersionBody
 */
@XmlRootElement(name="MContentupdateVersionBodyReq")
@XmlType(name="MContentupdateVersionBodyReq")
//#SWG#@ApiModel(description = "Request message for service JContent.updateVersionBody")
class MContentupdateVersionBodyReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MUpdateVersionBody =_
	def withparam(p:MUpdateVersionBody):this.type ={ 	this.param = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var versionId: String =_
	def withversionId(p:String):this.type ={ 	this.versionId = p; 	this }

}