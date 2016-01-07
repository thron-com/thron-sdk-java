package it.newvision.nvp.xreports.services.model.loganalyzer
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MWeeboResult") 
@XmlType(name="MWeeboResult")
//#SWG#@ApiModel(description = """""")
class MWeeboResult extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MWeeboResult ={ 	this.clientId = p; 	this }

	/**
	 * in Bytes
	 */
	//#SWG#@ApiModelProperty(value = """in Bytes""" ,required = true)
	@BeanProperty 
	var traffic: Long =_
	def withtraffic(p:Long):MWeeboResult ={ 	this.traffic = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var hits: Long =_
	def withhits(p:Long):MWeeboResult ={ 	this.hits = p; 	this }

}