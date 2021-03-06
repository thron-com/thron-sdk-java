package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * user information detail for the App
 */
@XmlRootElement(name="MAppUserDetail") 
@XmlType(name="MAppUserDetail")
//#SWG#@ApiModel(description = """user information detail for the App""")
class MAppUserDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var fullName: String =_
	def withfullName(p:String):this.type ={ 	this.fullName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userCaps: MAppCapabilities =_
	def withuserCaps(p:MAppCapabilities):this.type ={ 	this.userCaps = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

}