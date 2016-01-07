package it.newvision.nvp.xcontents.services.model.category
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCategoryIds") 
@XmlType(name="MCategoryIds")
//#SWG#@ApiModel(description = """""")
class MCategoryIds extends Serializable {

	/**
	 * list of category Ids
	 */
	//#SWG#@ApiModelProperty(value = """list of category Ids""")
	@BeanProperty 
	var categoryIds: List[String] = new ArrayList[String]
	def withcategoryIds(p:List[String]):MCategoryIds ={ 	this.categoryIds = p; 	this }

}