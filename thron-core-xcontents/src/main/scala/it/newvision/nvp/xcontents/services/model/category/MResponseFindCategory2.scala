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
@XmlRootElement(name="MResponseFindCategory2") 
@XmlType(name="MResponseFindCategory2")
//#SWG#@ApiModel(description = """""")
class MResponseFindCategory2 extends MResponseCategory with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var categories: List[MCategoryResult] = new ArrayList[MCategoryResult]
	def withcategories(p:List[MCategoryResult]):MResponseFindCategory2 ={ 	this.categories = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):MResponseFindCategory2 ={ 	this.totalResults = p; 	this }

}