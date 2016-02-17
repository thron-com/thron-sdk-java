package it.newvision.nvp.xadmin.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAppUser") 
@XmlType(name="MAppUser")
//#SWG#@ApiModel(description = """""")
class MAppUser extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sysusername: String =_
	def withsysusername(p:String):this.type ={ 	this.sysusername = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var password: String =_
	def withpassword(p:String):this.type ={ 	this.password = p; 	this }

}