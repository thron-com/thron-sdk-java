package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.metadata.MMetadataDefinitionConstraints
import com.thron.intelligence.model.MLocalization
import com.thron.intelligence.model.metadata.MMetadataDefinitionOptions
import com.thron.intelligence.model.metadata.MEMetadataDefinitionDataType
import com.thron.intelligence.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Empty attributes are not updated in the platform.
 * You cannot update a single element of an array or a complex attribute, all of
 * its elements must be included, otherwise they will be overwritten. To remove a
 * specific attribute instead, you will have to include it within the "patch"
 * parameter, as illustrated in the model description.
 */
@XmlRootElement(name="MIMetadataDefinitionUpdate") 
@XmlType(name="MIMetadataDefinitionUpdate")
//#SWG#@ApiModel(description = """Empty attributes are not updated in the platform.
//#SWGNL#You cannot update a single element of an array or a complex attribute, all of its elements must be included, otherwise they will be overwritten. To remove a specific attribute instead, you will have to include it within the "patch" parameter, as illustrated in the model description.""")
class MIMetadataDefinitionUpdate extends MUpdater with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var constraints: MMetadataDefinitionConstraints =_
	def withconstraints(p:MMetadataDefinitionConstraints):this.type ={ 	this.constraints = p; 	this }

	/**
	 * the Key of the Metadata Definition.
	 * Constraints:
	 * -) max length = 150
	 * -) only chars and digits
	 */
	//#SWG#@ApiModelProperty(value = """the Key of the Metadata Definition. 
	//#SWGNL#Constraints:
	//#SWGNL#-) max length = 150
	//#SWGNL#-) only chars and digits""")
	@BeanProperty 
	var key: String =_
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var names: List[MLocalization] =_
	def withnames(p:List[MLocalization]):this.type ={ 	this.names = p; 	this }

	/**
	 * Optional description, used to define the goal of the Metadata definition
	 */
	//#SWG#@ApiModelProperty(value = """Optional description, used to define the goal of the Metadata definition""")
	@BeanProperty 
	var note: String =_
	def withnote(p:String):this.type ={ 	this.note = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var options: MMetadataDefinitionOptions =_
	def withoptions(p:MMetadataDefinitionOptions):this.type ={ 	this.options = p; 	this }

	/**
	 * Used to identify metadata can be displayed to users.
	 * Invisible Metadata are commonly used to store back-end data not editable by
	 * users.
	 */
	//#SWG#@ApiModelProperty(value = """Used to identify metadata can be displayed to users. 
	//#SWGNL#Invisible Metadata are commonly used to store back-end data not editable by users.""")
	@BeanProperty 
	var visible: Boolean =_
	def withvisible(p:Boolean):this.type ={ 	this.visible = p; 	this }

	/**
	 * @param metadataType : MEMetadataDefinitionDataType
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid(metadataType: MEMetadataDefinitionDataType):Boolean ={
		import java.util.regex._
		import scala.collection.JavaConversions._
		val p = Pattern.compile("^[a-zA-Z0-9-_]+$")
		Option(key).forall(s => s.length<=150 && p.matcher(s).matches) &&
		Option(names).forall(_.forall(_.isValid())) &&
		Option(constraints).forall(_.isValid(metadataType)) &&
		Option(options).forall(_.isValid(metadataType))
	}

}