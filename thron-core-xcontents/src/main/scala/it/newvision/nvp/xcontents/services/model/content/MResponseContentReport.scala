package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentReport") 
@XmlType(name="MResponseContentReport")
//#SWG#@ApiModel(description = """""")
class MResponseContentReport extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MContentReport] = new ArrayList[MContentReport]
	def withitems(p:List[MContentReport]):MResponseContentReport ={ 	this.items = p; 	this }

}