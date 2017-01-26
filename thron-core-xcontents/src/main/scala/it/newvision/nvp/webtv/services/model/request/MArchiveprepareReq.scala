package it.newvision.nvp.webtv.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.archive.MArchiveCriteria
import it.newvision.nvp.webtv.services.model.archive.MArchiveOptions

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JArchive.prepare
 */
@XmlRootElement(name="MArchiveprepareReq")
@XmlType(name="MArchiveprepareReq")
//#SWG#@ApiModel(description = "Request message for service JArchive.prepare")
class MArchiveprepareReq extends Serializable {

	/**
	 * json serialisation of MDownloadCriteria
	 */
	//#SWG#@ApiModelProperty(value = """json serialisation of MDownloadCriteria""", required = true)
	@BeanProperty
	var criteria: MArchiveCriteria =_
	def withcriteria(p:MArchiveCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * json serialisation of MDownloadOptions
	 */
	//#SWG#@ApiModelProperty(value = """json serialisation of MDownloadOptions""", required = true)
	@BeanProperty
	var options: MArchiveOptions =_
	def withoptions(p:MArchiveOptions):this.type ={ 	this.options = p; 	this }

}