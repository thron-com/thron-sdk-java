package it.newvision.nvp.xcontents.services.model.client.authsettings
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSecuritySettings") 
@XmlType(name="MSecuritySettings")
//#SWG#@ApiModel(description = """""")
class MSecuritySettings extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):this.type ={ 	this.lastUpdate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var passwordAge: MPasswordAge =_
	def withpasswordAge(p:MPasswordAge):this.type ={ 	this.passwordAge = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var passwordComplexity: MPasswordComplexity =_
	def withpasswordComplexity(p:MPasswordComplexity):this.type ={ 	this.passwordComplexity = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var sessionAge: MSessionAge =_
	def withsessionAge(p:MSessionAge):this.type ={ 	this.sessionAge = p; 	this }

}