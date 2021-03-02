package it.newvision.nvp.xcontents.services.model.export
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.acl.MAclInverseRulesValue
import it.newvision.nvp.xcontents.model.MContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MExportFullExportContentResult") 
@XmlType(name="MExportFullExportContentResult")
//#SWG#@ApiModel(description = """""")
class MExportFullExportContentResult extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var acls: List[MAclInverseRulesValue] = new ArrayList[MAclInverseRulesValue]
	def withacls(p:List[MAclInverseRulesValue]):this.type ={ 	this.acls = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MContent =_
	def withcontent(p:MContent):this.type ={ 	this.content = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedCategoryIds: List[String] = new ArrayList[String]
	def withlinkedCategoryIds(p:List[String]):this.type ={ 	this.linkedCategoryIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var referenceId: String =_
	def withreferenceId(p:String):this.type ={ 	this.referenceId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var source: MSourceDetail =_
	def withsource(p:MSourceDetail):this.type ={ 	this.source = p; 	this }

}