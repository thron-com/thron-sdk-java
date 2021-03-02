package it.newvision.nvp.xcontents.services.model.category
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MCategory
import it.newvision.nvp.xcontents.model.MCategoryUserSpecificProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetCategory") 
@XmlType(name="MResponseGetCategory")
//#SWG#@ApiModel(description = """""")
class MResponseGetCategory extends MResponseCategory with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var category: MCategory =_
	def withcategory(p:MCategory):this.type ={ 	this.category = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userSpecificValues: MCategoryUserSpecificProperties =_
	def withuserSpecificValues(p:MCategoryUserSpecificProperties):this.type ={ 	this.userSpecificValues = p; 	this }

}