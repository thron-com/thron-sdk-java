package it.newvision.nvp.xcontents.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDetailClient") 
@XmlType(name="MResponseDetailClient")
//#SWG#@ApiModel(description = """""")
class MResponseDetailClient extends MResponseClient with Serializable  {

	/**
	 * Nome Client
	 */
	//#SWG#@ApiModelProperty(value = """Nome Client""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):MResponseDetailClient ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var properties: MClientProperties =_
	def withproperties(p:MClientProperties):MResponseDetailClient ={ 	this.properties = p; 	this }

}