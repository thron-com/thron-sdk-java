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
@XmlRootElement(name="MPhoneAddress") 
@XmlType(name="MPhoneAddress")
//#SWG#@ApiModel(description = """""")
class MPhoneAddress extends Serializable {

	/**
	 * HOME/WORK/PRIVATE...
	 */
	//#SWG#@ApiModelProperty(value = """HOME/WORK/PRIVATE...""")
	@BeanProperty 
	var phoneCategory: String =_
	def withphoneCategory(p:String):this.type ={ 	this.phoneCategory = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var phoneNumber: String =_
	def withphoneNumber(p:String):this.type ={ 	this.phoneNumber = p; 	this }

}