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
@XmlRootElement(name="MITagContentSearchCriteria") 
@XmlType(name="MITagContentSearchCriteria")
//#SWG#@ApiModel(description = """""")
class MITagContentSearchCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var haveAll: List[MITagContentCriteria] =_
	def withhaveAll(p:List[MITagContentCriteria]):this.type ={ 	this.haveAll = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var haveAtLeastOne: List[MITagContentCriteria] =_
	def withhaveAtLeastOne(p:List[MITagContentCriteria]):this.type ={ 	this.haveAtLeastOne = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var haveNot: List[MITagContentCriteria] =_
	def withhaveNot(p:List[MITagContentCriteria]):this.type ={ 	this.haveNot = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(haveAll).forall(x=> x.size <=50) ||
		Option(haveAtLeastOne).forall(x=> x.size <=50) ||
		Option(haveNot).forall(x=> x.size <=50)
	}

}