package it.newvision.nvp.identity.services.model.usersgroup
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MEGroupType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MGroupInitData") 
@XmlType(name="MGroupInitData")
//#SWG#@ApiModel(description = """""")
class MGroupInitData extends MGroupUpdateData with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var groupType: MEGroupType  = MEGroupType.PLATFORM
	def withgroupType(p:MEGroupType):MGroupInitData ={ 	this.groupType = p; 	this }

}