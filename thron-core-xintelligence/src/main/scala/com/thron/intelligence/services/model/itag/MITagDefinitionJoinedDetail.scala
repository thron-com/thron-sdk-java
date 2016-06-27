package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.tag.MEStatus
import com.thron.intelligence.services.model.tag.MITagDefinitionDetail

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * MetadataDefinition allows to assign a value of a certain type to a key; are
 * defined for entities like contents, users, apps etc.
 * MetadataDefinition can be linked to one or more ITagDefinition (in the same
 * Classification) and inherit the visibility constraints.
 */
@XmlRootElement(name="MITagDefinitionJoinedDetail") 
@XmlType(name="MITagDefinitionJoinedDetail")
//#SWG#@ApiModel(description = """""")
class MITagDefinitionJoinedDetail extends MITagDefinitionDetail with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var joinedStatus: MEStatus =_
	def withjoinedStatus(p:MEStatus):this.type ={ 	this.joinedStatus = p; 	this }

}