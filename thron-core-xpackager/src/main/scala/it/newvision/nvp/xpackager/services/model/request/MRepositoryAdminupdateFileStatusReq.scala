package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.model.MFile
import it.newvision.nvp.xpackager.model.MEFileStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRepositoryAdmin.updateFileStatus
 */
@XmlRootElement(name="MRepositoryAdminupdateFileStatusReq")
@XmlType(name="MRepositoryAdminupdateFileStatusReq")
//#SWG#@ApiModel(description = "Request message for service JRepositoryAdmin.updateFileStatus")
class MRepositoryAdminupdateFileStatusReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var file: MFile =_
	def withfile(p:MFile):this.type ={ 	this.file = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var siteName: String =_
	def withsiteName(p:String):this.type ={ 	this.siteName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var status: MEFileStatus =_
	def withstatus(p:MEFileStatus):this.type ={ 	this.status = p; 	this }

}