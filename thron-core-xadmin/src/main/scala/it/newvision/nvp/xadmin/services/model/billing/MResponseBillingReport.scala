package it.newvision.nvp.xadmin.services.model.billing
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MBillingReport

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseBillingReport") 
@XmlType(name="MResponseBillingReport")
//#SWG#@ApiModel(description = """""")
class MResponseBillingReport extends MResponseBilling with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var report: List[MBillingReport] = new ArrayList[MBillingReport]
	def withreport(p:List[MBillingReport]):MResponseBillingReport ={ 	this.report = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseBillingReport ={ 	this.totalResults = p; 	this }

}