package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MFile

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JAdminConsole.updateFileInRepository
 */
@XmlRootElement(name="MAdminConsoleupdateFileInRepositoryReq")
@XmlType(name="MAdminConsoleupdateFileInRepositoryReq")
//#SWG#@ApiModel(description = "Request message for service JAdminConsole.updateFileInRepository")
class MAdminConsoleupdateFileInRepositoryReq extends Serializable {

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
	var fileOnSiteStatus: String =_
	def withfileOnSiteStatus(p:String):this.type ={ 	this.fileOnSiteStatus = p; 	this }

}