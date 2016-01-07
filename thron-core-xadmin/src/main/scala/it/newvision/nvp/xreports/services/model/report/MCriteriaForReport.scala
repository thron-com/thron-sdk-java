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
	def withreportIds(p:List[String]):MCriteriaForReport ={ 	this.reportIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var templateType: String =_
	def withtemplateType(p:String):MCriteriaForReport ={ 	this.templateType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):MCriteriaForReport ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var fromDate: Date =_
	def withfromDate(p:Date):MCriteriaForReport ={ 	this.fromDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var toDate: Date =_
	def withtoDate(p:Date):MCriteriaForReport ={ 	this.toDate = p; 	this }

}