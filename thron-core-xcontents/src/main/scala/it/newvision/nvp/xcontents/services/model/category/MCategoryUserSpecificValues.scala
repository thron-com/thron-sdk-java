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
@XmlRootElement(name="MCategoryUserSpecificValues") 
@XmlType(name="MCategoryUserSpecificValues")
//#SWG#@ApiModel(description = """""")
class MCategoryUserSpecificValues extends Serializable {

	/**
	 * Used to mark if the category is starred or not for the user. Each user
	 * has the limit of 100 categories starred.
	 */
	//#SWG#@ApiModelProperty(value = """Used to mark if the category is starred or not for the user. Each user has the limit of 100 categories starred.""")
	@BeanProperty 
	var categoryStarred: Boolean =_
	def withcategoryStarred(p:Boolean):this.type ={ 	this.categoryStarred = p; 	this }

}