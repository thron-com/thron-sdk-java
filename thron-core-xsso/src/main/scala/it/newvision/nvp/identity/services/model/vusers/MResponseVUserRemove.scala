package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseVUserRemove") 
@XmlType(name="MResponseVUserRemove")
//#SWG#@ApiModel(description = """""")
class MResponseVUserRemove extends MResponseVUser with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalGuestUsersRemoved: Integer  = 0
	def withtotalGuestUsersRemoved(p:Integer):this.type ={ 	this.totalGuestUsersRemoved = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalPlatformUsersRemoved: Integer  = 0
	def withtotalPlatformUsersRemoved(p:Integer):this.type ={ 	this.totalPlatformUsersRemoved = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalUsersRemoved: Integer  = 0
	def withtotalUsersRemoved(p:Integer):this.type ={ 	this.totalUsersRemoved = p; 	this }

}