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
 * Request message for service JAdminAdmin.removeClientInComponents
 */
@XmlRootElement(name="MAdminAdminremoveClientInComponentsReq")
@XmlType(name="MAdminAdminremoveClientInComponentsReq")
//#SWG#@ApiModel(description = "Request message for service JAdminAdmin.removeClientInComponents")
class MAdminAdminremoveClientInComponentsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * if true it set to removed the data in the repository but it's possible to
	 * restore the content.
	 * if false, all data are removed from the storage and it's not possible to
	 * restore the data in the platform.
	 */
	//#SWG#@ApiModelProperty(value = """if true it set to removed the data in the repository but it's possible to restore the content.
	//#SWGNL#if false, all data are removed from the storage and it's not possible to restore the data in the platform.""", required = true)
	@BeanProperty
	var safe: Boolean =_
	def withsafe(p:Boolean):this.type ={ 	this.safe = p; 	this }

}