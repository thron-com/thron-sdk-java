package com.thron.intelligence.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MLocalization
import com.thron.intelligence.model.MSourceIdentifier

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * MetadataDefinition allows to assign a value of a certain type to a key; are
 * defined for entities like contents, users, apps etc.
 * MetadataDefinition can be linked to one or more ITagDefinition (in the same
 * Classification) and inherit the visibility constraints.
 * for example the itagdefinition product is linked to the metadatadefinition with
 * key productkey on the TARGET classification. This means that the metadata
 * productKey is visible only for contents tagged with the tag "product".
 * 
 * <b>Constraints:</b>
 * <ul>
 * 	<li>may belongs to a single classification or be generic. </li>
 * 	<li>can not be moved from a classification to generic </li>
 * 	<li>the IMetadataDefinition.key is a primarykey. It's not possible to define a
 * metadatadefinition using the key of a metadata removed or used in different
 * classifications. </li>
 * 	<li>A IMetadatadefinition of type KEY can be linked to a single
 * ITagDefinition</li>
 * 	<li>A IMetadatadefinition can be linked to categorized ITagDefinition </li>
 * </ul>
 */
@XmlRootElement(name="MMetadataDefinition") 
@XmlType(name="MMetadataDefinition")
//#SWG#@ApiModel(description = """MetadataDefinition allows to assign a value of a certain type to a key; are defined for entities like contents, users, apps etc.
//#SWGNL#MetadataDefinition can be linked to one or more ITagDefinition (in the same Classification) and inherit the visibility constraints.
//#SWGNL#for example the itagdefinition product is linked to the metadatadefinition with key productkey on the TARGET classification. This means that the metadata productKey is visible only for contents tagged with the tag "product".
//#SWGNL#
//#SWGNL#<b>Constraints:</b>
//#SWGNL#<ul>
//#SWGNL#	<li>may belongs to a single classification or be generic. </li>
//#SWGNL#	<li>can not be moved from a classification to generic </li>
//#SWGNL#	<li>the IMetadataDefinition.key is a primarykey. It's not possible to define a metadatadefinition using the key of a metadata removed or used in different classifications. </li>
//#SWGNL#	<li>A IMetadatadefinition of type KEY can be linked to a single ITagDefinition</li>
//#SWGNL#	<li>A IMetadatadefinition can be linked to categorized ITagDefinition </li>
//#SWGNL#</ul>""")
class MMetadataDefinition extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var removed: Boolean  = false
	def withremoved(p:Boolean):MMetadataDefinition ={ 	this.removed = p; 	this }

	/**
	 * the identifier 
	 */
	//#SWG#@ApiModelProperty(value = """the identifier """ ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):MMetadataDefinition ={ 	this.id = p; 	this }

	/**
	 * A key identifier for the MetadataDefinition (user defined).
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>150: max length</li>
	 * </ul>
	 * <ul>
	 * 	<li>only chars and digits</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """A key identifier for the MetadataDefinition (user defined).
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>150: max length</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>only chars and digits</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):MMetadataDefinition ={ 	this.key = p; 	this }

	/**
	 * label values for the metadata definition in multi locale
	 */
	//#SWG#@ApiModelProperty(value = """label values for the metadata definition in multi locale""")
	@BeanProperty 
	var names: List[MLocalization] = new ArrayList[MLocalization]
	def withnames(p:List[MLocalization]):MMetadataDefinition ={ 	this.names = p; 	this }

	/**
	 * Optional short description, used to define the goal of the Metadata definition.
	 * 
	 * Constraint:
	 * <ul>
	 * 	<li>max length: 500 chars</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Optional short description, used to define the goal of the Metadata definition.
	//#SWGNL#Constraint:
	//#SWGNL#<ul>
	//#SWGNL#	<li>max length: 500 chars</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var note: String =_
	def withnote(p:String):MMetadataDefinition ={ 	this.note = p; 	this }

	/**
	 * userId of the owner or engineId
	 */
	//#SWG#@ApiModelProperty(value = """userId of the owner or engineId""" ,required = true)
	@BeanProperty 
	var createdBy: MSourceIdentifier =_
	def withcreatedBy(p:MSourceIdentifier):MMetadataDefinition ={ 	this.createdBy = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var metadataType: MEMetadataDefinitionDataType =_
	def withmetadataType(p:MEMetadataDefinitionDataType):MMetadataDefinition ={ 	this.metadataType = p; 	this }

	/**
	 * Optional. The creation date of the category
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The creation date of the category""")
	@BeanProperty 
	var createdDate: Date  = new Date()
	def withcreatedDate(p:Date):MMetadataDefinition ={ 	this.createdDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var modifiedDate: Date =_
	def withmodifiedDate(p:Date):MMetadataDefinition ={ 	this.modifiedDate = p; 	this }

	/**
	 * Used to identify metadata can be displayed to users.
	 * Metadata definition set to invisibles are commonly used to store back end data
	 * not editable by users.
	 */
	//#SWG#@ApiModelProperty(value = """Used to identify metadata can be displayed to users. 
	//#SWGNL#Metadata definition set to invisibles are commonly used to store back end data not editable by users.""" ,required = true)
	@BeanProperty 
	var visible: Boolean  = true
	def withvisible(p:Boolean):MMetadataDefinition ={ 	this.visible = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var constraints: MMetadataDefinitionConstraints  = new MMetadataDefinitionConstraints
	def withconstraints(p:MMetadataDefinitionConstraints):MMetadataDefinition ={ 	this.constraints = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var options: MMetadataDefinitionOptions  = new MMetadataDefinitionOptions
	def withoptions(p:MMetadataDefinitionOptions):MMetadataDefinition ={ 	this.options = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

	/**
	 * @return MMetadataDefinitionGenericConstraint
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getActiveConstraint():MMetadataDefinitionGenericConstraint ={
		try {
			metadataType match {
				case MEMetadataDefinitionDataType.NUMERIC_INTEGER => constraints.numericIntegerConstraint
				case MEMetadataDefinitionDataType.NUMERIC_DOUBLE => constraints.numericDoubleConstraint
				case MEMetadataDefinitionDataType.TEMPORAL_INSTANT => constraints.temporalInstantConstraint
				case MEMetadataDefinitionDataType.BOOLEAN => constraints.booleanConstraint
				case MEMetadataDefinitionDataType.COLOR => constraints.colorConstraint
				case MEMetadataDefinitionDataType.KEY => constraints.keyConstraint
				case MEMetadataDefinitionDataType.ALTERNATIVE_S => constraints.alternativeSConstraint
				case MEMetadataDefinitionDataType.ALTERNATIVE_M => constraints.alternativeMConstraint
				case MEMetadataDefinitionDataType.STRING => constraints.stringConstraint
			}
		} catch {
			case e: Exception => null
		}
	}

	/**
	 * @return MMetadataDefinitionOptionClass
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def getActiveOption():MMetadataDefinitionOptionClass ={
		try {
			metadataType match {
				case MEMetadataDefinitionDataType.NUMERIC_INTEGER => options.numericIntegerOption
				case MEMetadataDefinitionDataType.NUMERIC_DOUBLE => options.numericDoubleOption
				case MEMetadataDefinitionDataType.TEMPORAL_INSTANT => options.temporalInstantOption
				case MEMetadataDefinitionDataType.BOOLEAN => options.booleanOption
				case MEMetadataDefinitionDataType.COLOR => options.colorOption
				case MEMetadataDefinitionDataType.KEY => new MMetadataDefinitionOptionClass{}
				case MEMetadataDefinitionDataType.ALTERNATIVE_S => options.alternativeSOption
				case MEMetadataDefinitionDataType.ALTERNATIVE_M => options.alternativeMOption
				case MEMetadataDefinitionDataType.STRING => options.stringOption
			}
		} catch {
			case e: Exception => null
		}
	}

}