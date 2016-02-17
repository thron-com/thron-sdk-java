package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MITagDefinitionUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.approve
 */
@XmlRootElement(name="MITagDefinitionapproveReq")
@XmlType(name="MITagDefinitionapproveReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.approve")
class MITagDefinitionapproveReq extends Serializable {

	/**
	 * Optional. Update in "patch" mode the TagDefinition
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Update in "patch" mode the TagDefinition""", required = true)
	@BeanProperty
	var update: MITagDefinitionUpdate =_
	def withupdate(p:MITagDefinitionUpdate):this.type ={ 	this.update = p; 	this }

}