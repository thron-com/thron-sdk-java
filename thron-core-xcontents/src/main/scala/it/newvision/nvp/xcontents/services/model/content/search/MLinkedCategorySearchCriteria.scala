package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MLinkedCategorySearchCriteria") 
@XmlType(name="MLinkedCategorySearchCriteria")
//#SWG#@ApiModel(description = """""")
class MLinkedCategorySearchCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var haveAtLeastOne: List[MLinkedCategoryOp] =_
	def withhaveAtLeastOne(p:List[MLinkedCategoryOp]):this.type ={ 	this.haveAtLeastOne = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var haveNot: List[MLinkedCategoryOp] =_
	def withhaveNot(p:List[MLinkedCategoryOp]):this.type ={ 	this.haveNot = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

}