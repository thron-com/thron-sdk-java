package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.content.MUpdateAdminParams

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContentAdmin.updateSource
 */
@XmlRootElement(name="MContentAdminupdateSourceReq")
@XmlType(name="MContentAdminupdateSourceReq")
//#SWG#@ApiModel(description = "Request message for service JContentAdmin.updateSource")
class MContentAdminupdateSourceReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var param: MUpdateAdminParams =_
	def withparam(p:MUpdateAdminParams):this.type ={ 	this.param = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var silentMode: Boolean =_
	def withsilentMode(p:Boolean):this.type ={ 	this.silentMode = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

}