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
@XmlRootElement(name="MInternetCall") 
@XmlType(name="MInternetCall")
//#SWG#@ApiModel(description = """""")
class MInternetCall extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var inumber: String =_
	def withinumber(p:String):this.type ={ 	this.inumber = p; 	this }

	/**
	 * HOME/WORK/...
	 */
	//#SWG#@ApiModelProperty(value = """HOME/WORK/...""")
	@BeanProperty 
	var inumberCategory: String =_
	def withinumberCategory(p:String):this.type ={ 	this.inumberCategory = p; 	this }

}