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
@XmlRootElement(name="MQueryWeebo") 
@XmlType(name="MQueryWeebo")
//#SWG#@ApiModel(description = """""")
class MQueryWeebo extends MQuery with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var queryType: MEQueryType =_
	def withqueryType(p:MEQueryType):this.type ={ 	this.queryType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	override def isValid():Boolean ={
		Option( fromDate ).isDefined && Option( toDate ).isDefined && ( Option( queryType ).isDefined || Option( timeUnit ).isDefined || Option( groupByCountryCode ).exists( _.booleanValue ) )
	}

}