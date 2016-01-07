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
@XmlRootElement(name="MResponseNewCategory") 
@XmlType(name="MResponseNewCategory")
//#SWG#@ApiModel(description = """""")
class MResponseNewCategory extends MResponseCategory with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var categoryID: String =_
	def withcategoryID(p:String):MResponseNewCategory ={ 	this.categoryID = p; 	this }

}