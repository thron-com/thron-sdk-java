package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.content.MUpdateParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.updateSource
 */
@XmlRootElement(name="MContentupdateSourceReq")
@XmlType(name="MContentupdateSourceReq")
//#SWG#@ApiModel(description = "Request message for service JContent.updateSource")
class MContentupdateSourceReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MUpdateParams =_
	def withparam(p:MUpdateParams):this.type ={ 	this.param = p; 	this }

	/**
	 * Optional. Do not send any notification at the end of the publishing process.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Do not send any notification at the end of the publishing process.""", required = true)
	@BeanProperty
	var silentMode: Boolean =_
	def withsilentMode(p:Boolean):this.type ={ 	this.silentMode = p; 	this }

}