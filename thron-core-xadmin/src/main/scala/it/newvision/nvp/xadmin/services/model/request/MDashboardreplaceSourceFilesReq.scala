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
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Deprecated by xcontentId
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated by xcontentId""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var sourceFiles: MFiles =_
	def withsourceFiles(p:MFiles):this.type ={ 	this.sourceFiles = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

}