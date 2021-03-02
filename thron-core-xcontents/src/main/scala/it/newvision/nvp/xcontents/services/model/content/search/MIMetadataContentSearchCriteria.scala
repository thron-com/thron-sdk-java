package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MIMetadataCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MIMetadataContentSearchCriteria") 
@XmlType(name="MIMetadataContentSearchCriteria")
//#SWG#@ApiModel(description = """""")
class MIMetadataContentSearchCriteria extends Serializable {

	/**
	 * Lists metadata criteria that must be all fulfilled for each content.
	 * Corresponds to an AND logic operator.
	 */
	//#SWG#@ApiModelProperty(value = """Lists metadata criteria that must be all fulfilled for each content. Corresponds to an AND logic operator.""")
	@BeanProperty 
	var haveAll: List[MIMetadataCriteria] =_
	def withhaveAll(p:List[MIMetadataCriteria]):this.type ={ 	this.haveAll = p; 	this }

	/**
	 * Lists metadata criteria for which at least one must be fulfilled. Corresponds
	 * to an OR logic operator.
	 */
	//#SWG#@ApiModelProperty(value = """Lists metadata criteria for which at least one must be fulfilled. Corresponds to an OR logic operator.""")
	@BeanProperty 
	var haveAtLeastOne: List[MIMetadataCriteria] =_
	def withhaveAtLeastOne(p:List[MIMetadataCriteria]):this.type ={ 	this.haveAtLeastOne = p; 	this }

	/**
	 * Lists metadata criteria that must not be fulfilled. Corresponds to a NOT logic
	 * operator.
	 */
	//#SWG#@ApiModelProperty(value = """Lists metadata criteria that must not be fulfilled. Corresponds to a NOT logic operator.""")
	@BeanProperty 
	var haveNot: List[MIMetadataCriteria] =_
	def withhaveNot(p:List[MIMetadataCriteria]):this.type ={ 	this.haveNot = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

}