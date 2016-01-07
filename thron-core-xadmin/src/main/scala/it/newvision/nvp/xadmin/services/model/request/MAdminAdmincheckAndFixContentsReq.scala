package it.newvision.nvp.xadmin.services.model.request
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
 * Request message for service JAdminAdmin.checkAndFixContents
 */
@XmlRootElement(name="MAdminAdmincheckAndFixContentsReq")
@XmlType(name="MAdminAdmincheckAndFixContentsReq")
//#SWG#@ApiModel(description = "Request message for service JAdminAdmin.checkAndFixContents")
class MAdminAdmincheckAndFixContentsReq extends Serializable {

	/**
	 * if true the service execute without side effects.
	 */
	//#SWG#@ApiModelProperty(value = """if true the service execute without side effects.""", required = true)
	@BeanProperty
	var whatif: Boolean =_
	def withwhatif(p:Boolean):MAdminAdmincheckAndFixContentsReq ={ 	this.whatif = p; 	this }

}