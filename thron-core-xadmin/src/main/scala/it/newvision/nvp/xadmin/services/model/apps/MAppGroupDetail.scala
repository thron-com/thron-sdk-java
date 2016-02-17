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
 * group information detail for the App
 */
@XmlRootElement(name="MAppGroupDetail") 
@XmlType(name="MAppGroupDetail")
//#SWG#@ApiModel(description = """group information detail for the App""")
class MAppGroupDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var groupId: String =_
	def withgroupId(p:String):this.type ={ 	this.groupId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var groupName: String =_
	def withgroupName(p:String):this.type ={ 	this.groupName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var groupCaps: MAppCapabilities =_
	def withgroupCaps(p:MAppCapabilities):this.type ={ 	this.groupCaps = p; 	this }

}