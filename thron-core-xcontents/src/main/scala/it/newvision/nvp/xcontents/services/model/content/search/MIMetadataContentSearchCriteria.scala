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

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var haveAll: List[MIMetadataCriteria] =_
	def withhaveAll(p:List[MIMetadataCriteria]):this.type ={ 	this.haveAll = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var haveAtLeastOne: List[MIMetadataCriteria] =_
	def withhaveAtLeastOne(p:List[MIMetadataCriteria]):this.type ={ 	this.haveAtLeastOne = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
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