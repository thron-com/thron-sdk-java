package it.newvision.nvp.webtv.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.sync.MSyncExportCriteria
import it.newvision.nvp.webtv.services.model.sync.MSyncOptions

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JSync.export
 */
@XmlRootElement(name="MSyncexportReq")
@XmlType(name="MSyncexportReq")
//#SWG#@ApiModel(description = "Request message for service JSync.export")
class MSyncexportReq extends Serializable {

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var criteria: MSyncExportCriteria =_
	def withcriteria(p:MSyncExportCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional. Used to specify if the service should return or not some additional
	 * information about the content
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to specify if the service should return or not some additional information about the content""", required = true)
	@BeanProperty
	var options: MSyncOptions =_
	def withoptions(p:MSyncOptions):this.type ={ 	this.options = p; 	this }

	/**
	 * Optional.
	 * The resultset is paginated (max page size is 200 elements), after the 1st call
	 * the service return a "nextPage" identifier to be used on the next call, to get
	 * the following elements.
	 * If the value is empty, the service will return the 1st page of the resultset.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. 
	//#SWGNL#The resultset is paginated (max page size is 200 elements), after the 1st call the service return a "nextPage" identifier to be used on the next call, to get the following elements. 
	//#SWGNL#If the value is empty, the service will return the 1st page of the resultset.
	//#SWGNL#""", required = true)
	@BeanProperty
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

	/**
	 * Optional. Default and maximum value is  200
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default and maximum value is  200""", required = true)
	@BeanProperty
	var pageSize: Integer =_
	def withpageSize(p:Integer):this.type ={ 	this.pageSize = p; 	this }

}