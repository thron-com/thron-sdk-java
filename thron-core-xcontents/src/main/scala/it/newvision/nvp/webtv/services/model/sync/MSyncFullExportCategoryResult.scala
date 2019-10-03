package it.newvision.nvp.webtv.services.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MCategory
import it.newvision.nvp.xcontents.services.model.acl.MAclInverseRulesValue

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSyncFullExportCategoryResult") 
@XmlType(name="MSyncFullExportCategoryResult")
//#SWG#@ApiModel(description = """""")
class MSyncFullExportCategoryResult extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var category: MCategory =_
	def withcategory(p:MCategory):this.type ={ 	this.category = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var inverseAcls: List[MAclInverseRulesValue] = new ArrayList[MAclInverseRulesValue]
	def withinverseAcls(p:List[MAclInverseRulesValue]):this.type ={ 	this.inverseAcls = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var referenceId: String =_
	def withreferenceId(p:String):this.type ={ 	this.referenceId = p; 	this }

}