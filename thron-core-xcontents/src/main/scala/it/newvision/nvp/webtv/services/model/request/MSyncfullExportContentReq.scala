package it.newvision.nvp.webtv.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.webtv.services.model.sync.MSyncFullExportContentCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JSync.fullExportContent
 */
@XmlRootElement(name="MSyncfullExportContentReq")
@XmlType(name="MSyncfullExportContentReq")
//#SWG#@ApiModel(description = "Request message for service JSync.fullExportContent")
class MSyncfullExportContentReq extends Serializable {

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var criteria: MSyncFullExportContentCriteria =_
	def withcriteria(p:MSyncFullExportContentCriteria):this.type ={ 	this.criteria = p; 	this }

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