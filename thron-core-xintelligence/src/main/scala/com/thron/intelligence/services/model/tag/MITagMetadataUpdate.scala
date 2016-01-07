package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * update class used to update the specific values defined in the link between
 * TagDefinition and MetadataDefinition.
 */
@XmlRootElement(name="MITagMetadataUpdate") 
@XmlType(name="MITagMetadataUpdate")
//#SWG#@ApiModel(description = """update class used to update the specific values defined in the link between TagDefinition and MetadataDefinition.""")
class MITagMetadataUpdate extends MUpdater with Serializable  {

	/**
	 * Desired metadata position among elements of a specific tree level.
	 */
	//#SWG#@ApiModelProperty(value = """Desired metadata position among elements of a specific tree level.""")
	@BeanProperty 
	var pos: Integer =_
	def withpos(p:Integer):MITagMetadataUpdate ={ 	this.pos = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		//to be defined
		true
	}

}