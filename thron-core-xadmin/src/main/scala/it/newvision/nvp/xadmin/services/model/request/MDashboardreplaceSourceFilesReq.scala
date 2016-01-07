package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.utils.MFiles

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JDashboard.replaceSourceFiles
 */
@XmlRootElement(name="MDashboardreplaceSourceFilesReq")
@XmlType(name="MDashboardreplaceSourceFilesReq")
//#SWG#@ApiModel(description = "Request message for service JDashboard.replaceSourceFiles")
class MDashboardreplaceSourceFilesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MDashboardreplaceSourceFilesReq ={ 	this.clientId = p; 	this }

	/**
	 * Deprecated by xcontentId
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated by xcontentId""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):MDashboardreplaceSourceFilesReq ={ 	this.mediaContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):MDashboardreplaceSourceFilesReq ={ 	this.xcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var sourceFiles: MFiles =_
	def withsourceFiles(p:MFiles):MDashboardreplaceSourceFilesReq ={ 	this.sourceFiles = p; 	this }

	/**
	 * if true, remove from repository the original file.
	 * if false, a link to le original source file is saved in MMEdiaContent.
	 * sourceFilesOldVersions
	 */
	//#SWG#@ApiModelProperty(value = """if true, remove from repository the original file.
	//#SWGNL#if false, a link to le original source file is saved in MMEdiaContent.sourceFilesOldVersions""", required = true)
	@BeanProperty
	var removeOriginalFiles: Boolean =_
	def withremoveOriginalFiles(p:Boolean):MDashboardreplaceSourceFilesReq ={ 	this.removeOriginalFiles = p; 	this }

}