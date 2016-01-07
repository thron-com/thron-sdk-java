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
 * Request message for service JRepositoryAdmin.cleanupFilesOnSite
 */
@XmlRootElement(name="MRepositoryAdmincleanupFilesOnSiteReq")
@XmlType(name="MRepositoryAdmincleanupFilesOnSiteReq")
//#SWG#@ApiModel(description = "Request message for service JRepositoryAdmin.cleanupFilesOnSite")
class MRepositoryAdmincleanupFilesOnSiteReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var fileList: MRepositoryFileList =_
	def withfileList(p:MRepositoryFileList):MRepositoryAdmincleanupFilesOnSiteReq ={ 	this.fileList = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var siteName: String =_
	def withsiteName(p:String):MRepositoryAdmincleanupFilesOnSiteReq ={ 	this.siteName = p; 	this }

}