package it.newvision.nvp.xcontents.services.model.category
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MCategory

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetRootCategories") 
@XmlType(name="MResponseGetRootCategories")
//#SWG#@ApiModel(description = """""")
class MResponseGetRootCategories extends MResponseCategory with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var categories: List[MCategory] = new ArrayList[MCategory]
	def withcategories(p:List[MCategory]):this.type ={ 	this.categories = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}