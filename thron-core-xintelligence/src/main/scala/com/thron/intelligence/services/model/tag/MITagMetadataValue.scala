package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagMetadataValue") 
@XmlType(name="MITagMetadataValue")
//#SWG#@ApiModel(description = """""")
class MITagMetadataValue extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var metadataId: String =_
	def withmetadataId(p:String):this.type ={ 	this.metadataId = p; 	this }

	/**
	 * position inside the tree level. Used to define a custom order
	 */
	//#SWG#@ApiModelProperty(value = """position inside the tree level. Used to define a custom order""")
	@BeanProperty 
	var pos: Integer =_
	def withpos(p:Integer):this.type ={ 	this.pos = p; 	this }

}