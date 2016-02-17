package it.newvision.nvp.xreports.services.model.report
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCriteriaForReport") 
@XmlType(name="MCriteriaForReport")
//#SWG#@ApiModel(description = """""")
class MCriteriaForReport extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var reportIds: List[String] = new ArrayList[String]
	def withreportIds(p:List[String]):this.type ={ 	this.reportIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var templateType: String =_
	def withtemplateType(p:String):this.type ={ 	this.templateType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var fromDate: Date =_
	def withfromDate(p:Date):this.type ={ 	this.fromDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var toDate: Date =_
	def withtoDate(p:Date):this.type ={ 	this.toDate = p; 	this }

}