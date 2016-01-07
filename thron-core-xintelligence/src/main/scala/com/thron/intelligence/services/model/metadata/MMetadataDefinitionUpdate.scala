package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MMetadataDefinitionUpdate") 
@XmlType(name="MMetadataDefinitionUpdate")
//#SWG#@ApiModel(description = """""")
class MMetadataDefinitionUpdate extends MIMetadataDefinitionUpdate with Serializable  {

	/**
	 * the position of metadata inside the list.
	 */
	//#SWG#@ApiModelProperty(value = """the position of metadata inside the list.""")
	@BeanProperty 
	var pos: Integer =_
	def withpos(p:Integer):MMetadataDefinitionUpdate ={ 	this.pos = p; 	this }

}