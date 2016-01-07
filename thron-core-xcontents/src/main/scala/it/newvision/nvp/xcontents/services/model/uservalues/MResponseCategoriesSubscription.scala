package it.newvision.nvp.xcontents.services.model.uservalues
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseCategoriesSubscription") 
@XmlType(name="MResponseCategoriesSubscription")
//#SWG#@ApiModel(description = """""")
class MResponseCategoriesSubscription extends MResponseSubscription with Serializable  {

	/**
	 * list of category ids in issue after the categoriesSubscription process.
	 */
	//#SWG#@ApiModelProperty(value = """list of category ids in issue after the categoriesSubscription process.""")
	@BeanProperty 
	var categoriesInIssue: List[String] = new ArrayList[String]
	def withcategoriesInIssue(p:List[String]):MResponseCategoriesSubscription ={ 	this.categoriesInIssue = p; 	this }

}