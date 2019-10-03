package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MOwnerDetail") 
@XmlType(name="MOwnerDetail")
//#SWG#@ApiModel(description = """""")
class MOwnerDetail extends Serializable {

	/**
	 * phrase, exact_match
	 */
	//#SWG#@ApiModelProperty(value = """phrase, exact_match""" ,required = true)
	@BeanProperty 
	var ownerFullName: String =_
	def withownerFullName(p:String):this.type ={ 	this.ownerFullName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

}