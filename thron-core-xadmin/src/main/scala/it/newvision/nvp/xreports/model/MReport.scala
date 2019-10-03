package it.newvision.nvp.xreports.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MReport") 
@XmlType(name="MReport")
//#SWG#@ApiModel(description = """""")
class MReport extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var creationDate: Date  = new Date()
	def withcreationDate(p:Date):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * report description, filled by the client as free description text
	 */
	//#SWG#@ApiModelProperty(value = """report description, filled by the client as free description text""" ,required = true)
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String  = java.util.UUID.randomUUID.toString
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * the owner of the report
	 */
	//#SWG#@ApiModelProperty(value = """the owner of the report""" ,required = true)
	@BeanProperty 
	var owner: String =_
	def withowner(p:String):this.type ={ 	this.owner = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var reportType: MEReportType =_
	def withreportType(p:MEReportType):this.type ={ 	this.reportType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var responseDate: Date =_
	def withresponseDate(p:Date):this.type ={ 	this.responseDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEReportStatus =_
	def withstatus(p:MEReportStatus):this.type ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var summary: MQuery =_
	def withsummary(p:MQuery):this.type ={ 	this.summary = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var templateName: String =_
	def withtemplateName(p:String):this.type ={ 	this.templateName = p; 	this }

	/**
	 * total amount in Bytes used to store the report in CDN
	 */
	//#SWG#@ApiModelProperty(value = """total amount in Bytes used to store the report in CDN""" ,required = true)
	@BeanProperty 
	var totalSize: Long =_
	def withtotalSize(p:Long):this.type ={ 	this.totalSize = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var xpublisherId: String =_
	def withxpublisherId(p:String):this.type ={ 	this.xpublisherId = p; 	this }

}