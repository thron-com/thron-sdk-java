package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.metadata.MMetadataDefinition

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
@XmlRootElement(name="MMetadataDefinitionDetail") 
@XmlType(name="MMetadataDefinitionDetail")
//#SWG#@ApiModel(description = """MetadataDefinition allows to assign a value of a certain type to a key; are defined for entities like contents, users, apps etc.
//#SWGNL#MetadataDefinition can be linked to one or more ITagDefinition (in the same Classification) and inherit the visibility constraints.""")
class MMetadataDefinitionDetail extends MMetadataDefinition with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var inferred: Boolean  = false
	def withinferred(p:Boolean):this.type ={ 	this.inferred = p; 	this }

}