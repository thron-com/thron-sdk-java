package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.repository.MSearchCriteria
import it.newvision.nvp.xpackager.services.model.msg.MEFileOrderBy

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRepository.getUploadedFileList
 */
@XmlRootElement(name="MRepositorygetUploadedFileListReq")
@XmlType(name="MRepositorygetUploadedFileListReq")
//#SWG#@ApiModel(description = "Request message for service JRepository.getUploadedFileList")
class MRepositorygetUploadedFileListReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MRepositorygetUploadedFileListReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MSearchCriteria =_
	def withcriteria(p:MSearchCriteria):MRepositorygetUploadedFileListReq ={ 	this.criteria = p; 	this }

	/**
	 * The parameter follows a specific schema:
	 * [orderbyFileds]_[A|D]
	 * Available orderbyFileds are: fileName, siteName,totalSpace,modifiedDate,
	 * mimetype
	 * _A suffix means -> ascendant order
	 * _D suffix means -> descendant order
	 * 
	 * Example:
	 * fileName_A, totalSpace_D...
	 */
	//#SWG#@ApiModelProperty(value = """The parameter follows a specific schema:
	//#SWGNL#[orderbyFileds]_[A|D]
	//#SWGNL#Available orderbyFileds are: fileName, siteName,totalSpace,modifiedDate,mimetype
	//#SWGNL#_A suffix means -> ascendant order
	//#SWGNL#_D suffix means -> descendant order
	//#SWGNL#
	//#SWGNL#Example:
	//#SWGNL#fileName_A, totalSpace_D...""", required = true)
	@BeanProperty
	var orderByField: MEFileOrderBy =_
	def withorderByField(p:MEFileOrderBy):MRepositorygetUploadedFileListReq ={ 	this.orderByField = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MRepositorygetUploadedFileListReq ={ 	this.offset = p; 	this }

	/**
	 * Default and maximum value is 50 items
	 */
	//#SWG#@ApiModelProperty(value = """Default and maximum value is 50 items""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):MRepositorygetUploadedFileListReq ={ 	this.numberOfResult = p; 	this }

}