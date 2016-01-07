package it.newvision.nvp.xadmin.services.model.utils
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MQuotaCriteria") 
@XmlType(name="MQuotaCriteria")
//#SWG#@ApiModel(description = """""")
class MQuotaCriteria extends Serializable {

	/**
	 * userId search criteria.
	 * @constraints: userIds.size() <= 1000 (max size of the collection)
	 */
	//#SWG#@ApiModelProperty(value = """userId search criteria. 
	//#SWGNL#@constraints: userIds.size() <= 1000 (max size of the collection)""")
	@BeanProperty 
	var userIds: List[String] = new ArrayList[String]
	def withuserIds(p:List[String]):MQuotaCriteria ={ 	this.userIds = p; 	this }

}