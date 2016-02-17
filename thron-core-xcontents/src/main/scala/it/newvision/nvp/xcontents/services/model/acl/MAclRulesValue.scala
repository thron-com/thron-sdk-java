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
@XmlRootElement(name="MAclRulesValue") 
@XmlType(name="MAclRulesValue")
//#SWG#@ApiModel(description = """""")
class MAclRulesValue extends Serializable {

	/**
	 * a list of rule items
	 */
	//#SWG#@ApiModelProperty(value = """a list of rule items""")
	@BeanProperty 
	var items: List[MAclInverseRulesValue] = new ArrayList[MAclInverseRulesValue]
	def withitems(p:List[MAclInverseRulesValue]):this.type ={ 	this.items = p; 	this }

}