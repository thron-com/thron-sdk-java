package com.thron.intelligence.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MEEntityType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Define all possible constraints for a specific MetadataDefinition instance.
 */
@XmlRootElement(name="MMetadataDefinitionConstraints") 
@XmlType(name="MMetadataDefinitionConstraints")
//#SWG#@ApiModel(description = """Define all possible constraints for a specific MetadataDefinition instance.""")
class MMetadataDefinitionConstraints extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var alternativeMConstraint: MMetadataDefinitionGenericConstraint =_
	def withalternativeMConstraint(p:MMetadataDefinitionGenericConstraint):this.type ={ 	this.alternativeMConstraint = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var alternativeSConstraint: MMetadataDefinitionGenericConstraint =_
	def withalternativeSConstraint(p:MMetadataDefinitionGenericConstraint):this.type ={ 	this.alternativeSConstraint = p; 	this }

	/**
	 * This attribute is used to define where the metadata can be used (for which
	 * entity). The visibility of metadata is given by the association or not to a
	 * given tag and the applicableTo entities.
	 * Not be visible means that the user can not insert the metadata X to a user
	 * tagged business. 
	 */
	//#SWG#@ApiModelProperty(value = """This attribute is used to define where the metadata can be used (for which entity). The visibility of metadata is given by the association or not to a given tag and the applicableTo entities. 
	//#SWGNL#Not be visible means that the user can not insert the metadata X to a user tagged business. """)
	@BeanProperty 
	var applicableTo: List[MEEntityType] = new ArrayList[MEEntityType]
	def withapplicableTo(p:List[MEEntityType]):this.type ={ 	this.applicableTo = p; 	this }

	/**
	 * if empty means for all contentTypes (VIDEO/AUDIO/IMAGE/PLAYLIST/OTHER...)
	 */
	//#SWG#@ApiModelProperty(value = """if empty means for all contentTypes (VIDEO/AUDIO/IMAGE/PLAYLIST/OTHER...)""")
	@BeanProperty 
	var applicableToContentTypes: List[String] = new ArrayList[String]
	def withapplicableToContentTypes(p:List[String]):this.type ={ 	this.applicableToContentTypes = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var booleanConstraint: MMetadataDefinitionGenericConstraint =_
	def withbooleanConstraint(p:MMetadataDefinitionGenericConstraint):this.type ={ 	this.booleanConstraint = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var colorConstraint: MMetadataDefinitionGenericConstraint =_
	def withcolorConstraint(p:MMetadataDefinitionGenericConstraint):this.type ={ 	this.colorConstraint = p; 	this }

	/**
	 * Constraints:
	 * <ul>
	 * 	<li>No spaces</li>
	 * 	<li>no special chars</li>
	 * 	<li>max lenght <=100</li>
	 * 	<li>no localized values</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>No spaces</li>
	//#SWGNL#	<li>no special chars</li>
	//#SWGNL#	<li>max lenght <=100</li>
	//#SWGNL#	<li>no localized values</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var keyConstraint: MMetadataDefinitionStringConstraint =_
	def withkeyConstraint(p:MMetadataDefinitionStringConstraint):this.type ={ 	this.keyConstraint = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var numericDoubleConstraint: MMetadataDefinitionDoubleConstraint =_
	def withnumericDoubleConstraint(p:MMetadataDefinitionDoubleConstraint):this.type ={ 	this.numericDoubleConstraint = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var numericIntegerConstraint: MMetadataDefinitionIntegerConstraint =_
	def withnumericIntegerConstraint(p:MMetadataDefinitionIntegerConstraint):this.type ={ 	this.numericIntegerConstraint = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var stringConstraint: MMetadataDefinitionStringConstraint =_
	def withstringConstraint(p:MMetadataDefinitionStringConstraint):this.type ={ 	this.stringConstraint = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var temporalInstantConstraint: MMetadataDefinitionGenericConstraint =_
	def withtemporalInstantConstraint(p:MMetadataDefinitionGenericConstraint):this.type ={ 	this.temporalInstantConstraint = p; 	this }

	/**
	 * @param metadataType : MEMetadataDefinitionDataType
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid(metadataType: MEMetadataDefinitionDataType):Boolean ={
		metadataType match {
			case MEMetadataDefinitionDataType.NUMERIC_INTEGER => Option(numericIntegerConstraint).exists(_.isValid)
			case MEMetadataDefinitionDataType.NUMERIC_DOUBLE => Option(numericDoubleConstraint).exists(_.isValid)
			case MEMetadataDefinitionDataType.STRING => Option(stringConstraint).exists(_.isValid)
			case MEMetadataDefinitionDataType.TEMPORAL_INSTANT => Option(temporalInstantConstraint).exists(_.isValid)
			case MEMetadataDefinitionDataType.BOOLEAN => Option(booleanConstraint).exists(_.isValid)
			case MEMetadataDefinitionDataType.COLOR => Option(colorConstraint).exists(_.isValid)
			case MEMetadataDefinitionDataType.ALTERNATIVE_S => Option(alternativeSConstraint).exists(_.isValid)
			case MEMetadataDefinitionDataType.ALTERNATIVE_M => Option(alternativeMConstraint).exists(_.isValid)
			case MEMetadataDefinitionDataType.KEY => {
				Option(keyConstraint).exists(o => o.isValid && o.maxSize <= 100) &&
				applicableTo.size() == 1 && applicableTo.get(0) == MEEntityType.CONTENT
			}
		}
	}

}