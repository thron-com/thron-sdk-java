package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.repository.MRepositoryFileList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRepositoryAdmin.purgeFiles
 */
@XmlRootElement(name="MRepositoryAdminpurgeFilesReq")
@XmlType(name="MRepositoryAdminpurgeFilesReq")
//#SWG#@ApiModel(description = "Request message for service JRepositoryAdmin.purgeFiles")
class MRepositoryAdminpurgeFilesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var fileList: MRepositoryFileList =_
	def withfileList(p:MRepositoryFileList):this.type ={ 	this.fileList = p; 	this }

}