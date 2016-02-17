package com.thron.intelligence.services.model.metadata
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MLocalization
import com.thron.intelligence.model.metadata.MEMetadataDefinitionDataType
import com.thron.intelligence.model.metadata.MMetadataDefinitionConstraints
import com.thron.intelligence.model.metadata.MMetadataDefinitionOptions

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MIMetadataDefinitionValue") 
@XmlType(name="MIMetadataDefinitionValue")
//#SWG#@ApiModel(description = """""")
class MIMetadataDefinitionValue extends Serializable {

	/**
	 * key of the Metadata Schema
	 * Constraints:
	 * -) max length = 50
	 * -) only chars and digits
	 */
	//#SWG#@ApiModelProperty(value = """key of the Metadata Schema
	//#SWGNL#Constraints:
	//#SWGNL#-) max length = 50
	//#SWGNL#-) only chars and digits""" ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

	/**
	 * label and description values for the metadata definition in multi locale
	 */
	//#SWG#@ApiModelProperty(value = """label and description values for the metadata definition in multi locale""")
	@BeanProperty 
	var names: List[MLocalization] = new ArrayList[MLocalization]
	def withnames(p:List[MLocalization]):this.type ={ 	this.names = p; 	this }

	/**
	 * Used to identify metadata can be displayed to users.
	 * Metadata definition set to invisibles are commonly used to store back end data
	 * not editable by users.
	 */
	//#SWG#@ApiModelProperty(value = """Used to identify metadata can be displayed to users. 
	//#SWGNL#Metadata definition set to invisibles are commonly used to store back end data not editable by users.""" ,required = true)
	@BeanProperty 
	var visible: Boolean  = false
	def withvisible(p:Boolean):this.type ={ 	this.visible = p; 	this }

	/**
	 * Optional description, used to define the goal of the Metadata definition
	 */
	//#SWG#@ApiModelProperty(value = """Optional description, used to define the goal of the Metadata definition""")
	@BeanProperty 
	var note: String =_
	def withnote(p:String):this.type ={ 	this.note = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var metadataType: MEMetadataDefinitionDataType =_
	def withmetadataType(p:MEMetadataDefinitionDataType):this.type ={ 	this.metadataType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var constraints: MMetadataDefinitionConstraints  = new MMetadataDefinitionConstraints
	def withconstraints(p:MMetadataDefinitionConstraints):this.type ={ 	this.constraints = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var options: MMetadataDefinitionOptions  = new MMetadataDefinitionOptions
	def withoptions(p:MMetadataDefinitionOptions):this.type ={ 	this.options = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import org.apache.commons.lang.StringUtils
		import java.util.regex._
		import scala.collection.JavaConversions._
		val p = Pattern.compile("^[a-zA-Z0-9-_]+$")
		StringUtils.isNotBlank(key) &&
			Option(key).exists(s => s.length<=150 && p.matcher(s).matches) &&
			Option(metadataType).isDefined &&
			Option(constraints).exists(_.isValid(metadataType)) &&
			Option(options).exists(_.isValid(metadataType)) &&
			Option(names).exists(_.forall(_.isValid()))
	}

}