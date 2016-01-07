package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MBusinnessDetail") 
@XmlType(name="MBusinnessDetail")
//#SWG#@ApiModel(description = """""")
class MBusinnessDetail extends Serializable {

	/**
	 * HOME/WORK/...
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var companyName: String =_
	def withcompanyName(p:String):MBusinnessDetail ={ 	this.companyName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var city: String =_
	def withcity(p:String):MBusinnessDetail ={ 	this.city = p; 	this }

	/**
	 * country / region
	 */
	//#SWG#@ApiModelProperty(value = """country / region""")
	@BeanProperty 
	var country: String =_
	def withcountry(p:String):MBusinnessDetail ={ 	this.country = p; 	this }

}