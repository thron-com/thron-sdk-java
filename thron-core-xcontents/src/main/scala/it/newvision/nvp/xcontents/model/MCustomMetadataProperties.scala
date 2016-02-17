package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCustomMetadataProperties") 
@XmlType(name="MCustomMetadataProperties")
//#SWG#@ApiModel(description = """""")
class MCustomMetadataProperties extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var dataType: MECustomMetadataDataType =_
	def withdataType(p:MECustomMetadataDataType):this.type ={ 	this.dataType = p; 	this }

	/**
	 * used to specify if it is possible to define different values for different
	 * locale.
	 */
	//#SWG#@ApiModelProperty(value = """used to specify if it is possible to define different values for different locale.""" ,required = true)
	@BeanProperty 
	var multilocale: Boolean  = false
	def withmultilocale(p:Boolean):this.type ={ 	this.multilocale = p; 	this }

	/**
	 * if empty the user can insert free text (string Values)
	 */
	//#SWG#@ApiModelProperty(value = """if empty the user can insert free text (string Values)""")
	@BeanProperty 
	var possibileValues: List[MCustomMetadataValueLabel] = new ArrayList[MCustomMetadataValueLabel]
	def withpossibileValues(p:List[MCustomMetadataValueLabel]):this.type ={ 	this.possibileValues = p; 	this }

	/**
	 * if empty means for all contentTypes
	 */
	//#SWG#@ApiModelProperty(value = """if empty means for all contentTypes""")
	@BeanProperty 
	var onlyForContentTypes: List[MEContentType] = new ArrayList[MEContentType]
	def withonlyForContentTypes(p:List[MEContentType]):this.type ={ 	this.onlyForContentTypes = p; 	this }

	/**
	 * The metadata is available only in the specified solutions (VIEW.PLAY.MOVE,TALK).
	 * If empty the metadata is available in each single solution
	 */
	//#SWG#@ApiModelProperty(value = """The metadata is available only in the specified solutions (VIEW.PLAY.MOVE,TALK). If empty the metadata is available in each single solution""")
	@BeanProperty 
	var onlyForSolutions: List[String] = new ArrayList[String]
	def withonlyForSolutions(p:List[String]):this.type ={ 	this.onlyForSolutions = p; 	this }

	/**
	 * used to specify that the metadata is required or not, and can not be empty
	 */
	//#SWG#@ApiModelProperty(value = """used to specify that the metadata is required or not, and can not be empty""" ,required = true)
	@BeanProperty 
	var required: Boolean  = false
	def withrequired(p:Boolean):this.type ={ 	this.required = p; 	this }

	/**
	 * Only active custom metadata are used in the publication process.
	 */
	//#SWG#@ApiModelProperty(value = """Only active custom metadata are used in the publication process.""" ,required = true)
	@BeanProperty 
	var active: Boolean  = false
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

}