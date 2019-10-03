package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.export.MExportFullExportCategoryCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JExport.fullExportCategory
 */
@XmlRootElement(name="MExportfullExportCategoryReq")
@XmlType(name="MExportfullExportCategoryReq")
//#SWG#@ApiModel(description = "Request message for service JExport.fullExportCategory")
class MExportfullExportCategoryReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MExportFullExportCategoryCriteria =_
	def withcriteria(p:MExportFullExportCategoryCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var pageSize: Integer =_
	def withpageSize(p:Integer):this.type ={ 	this.pageSize = p; 	this }

}