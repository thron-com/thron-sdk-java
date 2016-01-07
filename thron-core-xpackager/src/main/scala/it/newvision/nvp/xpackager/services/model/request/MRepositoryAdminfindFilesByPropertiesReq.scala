package it.newvision.nvp.xpackager.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.repository.MSearchCriteriaExtended
import it.newvision.nvp.xpackager.services.model.msg.MEFileOrderBy

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JRepositoryAdmin.findFilesByProperties
 */
@XmlRootElement(name="MRepositoryAdminfindFilesByPropertiesReq")
@XmlType(name="MRepositoryAdminfindFilesByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JRepositoryAdmin.findFilesByProperties")
class MRepositoryAdminfindFilesByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MSearchCriteriaExtended =_
	def withcriteria(p:MSearchCriteriaExtended):MRepositoryAdminfindFilesByPropertiesReq ={ 	this.criteria = p; 	this }

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
	def withorderByField(p:MEFileOrderBy):MRepositoryAdminfindFilesByPropertiesReq ={ 	this.orderByField = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MRepositoryAdminfindFilesByPropertiesReq ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):MRepositoryAdminfindFilesByPropertiesReq ={ 	this.numberOfResult = p; 	this }

}