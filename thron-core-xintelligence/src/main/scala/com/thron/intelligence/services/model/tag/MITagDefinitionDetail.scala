package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.metadata.MMetadataDefinition
import com.thron.intelligence.model.tag.MITagDefinition

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagDefinitionDetail") 
@XmlType(name="MITagDefinitionDetail")
//#SWG#@ApiModel(description = """""")
class MITagDefinitionDetail extends MITagDefinition with Serializable  {

	/**
	 * list of linked metadata definition ordered by position
	 */
	//#SWG#@ApiModelProperty(value = """list of linked metadata definition ordered by position""")
	@BeanProperty 
	var linkedMetadataDefinition: List[MMetadataDefinition] = new ArrayList[MMetadataDefinition]
	def withlinkedMetadataDefinition(p:List[MMetadataDefinition]):this.type ={ 	this.linkedMetadataDefinition = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEITagStatus =_
	def withstatus(p:MEITagStatus):this.type ={ 	this.status = p; 	this }

	/**
	 * number of sub ITagDefinitions (total number of nodes of the sub tree)
	 */
	//#SWG#@ApiModelProperty(value = """number of sub ITagDefinitions (total number of nodes of the sub tree)""")
	@BeanProperty 
	var subNodes: Integer  = 0
	def withsubNodes(p:Integer):this.type ={ 	this.subNodes = p; 	this }

	/**
	 * subNodes Ids of the ITagDefinition
	 */
	//#SWG#@ApiModelProperty(value = """subNodes Ids of the ITagDefinition""")
	@BeanProperty 
	var subNodeIds: List[String] = new ArrayList[String]
	def withsubNodeIds(p:List[String]):this.type ={ 	this.subNodeIds = p; 	this }

}