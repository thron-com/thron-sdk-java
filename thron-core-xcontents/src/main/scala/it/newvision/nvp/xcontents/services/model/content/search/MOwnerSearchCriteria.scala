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
@XmlRootElement(name="MOwnerSearchCriteria") 
@XmlType(name="MOwnerSearchCriteria")
//#SWG#@ApiModel(description = """""")
class MOwnerSearchCriteria extends Serializable {

	/**
	 * A list of usernames to filter on (in OR)
	 */
	//#SWG#@ApiModelProperty(value = """A list of usernames to filter on (in OR)""")
	@BeanProperty 
	var haveAtLeastOne: List[String] = new ArrayList[String]
	def withhaveAtLeastOne(p:List[String]):this.type ={ 	this.haveAtLeastOne = p; 	this }

	/**
	 * A list of usernames that must not match the owner of the contents returned.
	 */
	//#SWG#@ApiModelProperty(value = """A list of usernames that must not match the owner of the contents returned.""")
	@BeanProperty 
	var haveNot: List[String] = new ArrayList[String]
	def withhaveNot(p:List[String]):this.type ={ 	this.haveNot = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(haveAtLeastOne).forall(x=> x.size <=50) ||
		Option(haveNot).forall(x=> x.size <=50)
	}

}