package it.newvision.nvp.xcontents.services.model.acl
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAclInverseRulesItems") 
@XmlType(name="MAclInverseRulesItems")
//#SWG#@ApiModel(description = """""")
class MAclInverseRulesItems extends Serializable {

	/**
	 * Constraints:
	 * <ul>
	 * 	<li>maximum 50 items</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>maximum 50 items</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var items: List[MAclInverseRulesItem2] = new ArrayList[MAclInverseRulesItem2]
	def withitems(p:List[MAclInverseRulesItem2]):this.type ={ 	this.items = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import collection.JavaConversions._
		Option(items).exists(l => l.nonEmpty && l.length <= 50)
	}

}