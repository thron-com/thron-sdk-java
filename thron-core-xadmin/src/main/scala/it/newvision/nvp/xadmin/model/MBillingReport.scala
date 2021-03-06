package it.newvision.nvp.xadmin.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MBillingReport") 
@XmlType(name="MBillingReport")
//#SWG#@ApiModel(description = """""")
class MBillingReport extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var creationDate: Date =_
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MBillingItem] = new ArrayList[MBillingItem]
	def withitems(p:List[MBillingItem]):this.type ={ 	this.items = p; 	this }

	/**
	 * Additional information that can be added to the report
	 */
	//#SWG#@ApiModelProperty(value = """Additional information that can be added to the report""")
	@BeanProperty 
	var note: String =_
	def withnote(p:String):this.type ={ 	this.note = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var reportFromDate: Date =_
	def withreportFromDate(p:Date):this.type ={ 	this.reportFromDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var reportId: String =_
	def withreportId(p:String):this.type ={ 	this.reportId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var reportToDate: Date =_
	def withreportToDate(p:Date):this.type ={ 	this.reportToDate = p; 	this }

}