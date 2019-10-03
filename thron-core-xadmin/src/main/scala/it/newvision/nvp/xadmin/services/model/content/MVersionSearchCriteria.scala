package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MVersionSearchCriteria") 
@XmlType(name="MVersionSearchCriteria")
//#SWG#@ApiModel(description = """""")
class MVersionSearchCriteria extends Serializable {

	/**
	 * version Ids
	 */
	//#SWG#@ApiModelProperty(value = """version Ids""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

}