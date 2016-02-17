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
@XmlRootElement(name="MQuery") 
@XmlType(name="MQuery")
//#SWG#@ApiModel(description = """""")
class MQuery extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var fromDate: Date =_
	def withfromDate(p:Date):this.type ={ 	this.fromDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var toDate: Date =_
	def withtoDate(p:Date):this.type ={ 	this.toDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var timeUnit: METimeUnit =_
	def withtimeUnit(p:METimeUnit):this.type ={ 	this.timeUnit = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var groupByCountryCode: Boolean  = false
	def withgroupByCountryCode(p:Boolean):this.type ={ 	this.groupByCountryCode = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(fromDate).isDefined && Option( toDate ).isDefined && ( Option( timeUnit ).isDefined || Option( groupByCountryCode ).exists( _.booleanValue ) )
	}

}