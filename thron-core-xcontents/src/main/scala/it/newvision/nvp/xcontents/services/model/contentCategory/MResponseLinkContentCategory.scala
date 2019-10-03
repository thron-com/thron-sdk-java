package it.newvision.nvp.xcontents.services.model.contentCategory
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseLinkContentCategory") 
@XmlType(name="MResponseLinkContentCategory")
//#SWG#@ApiModel(description = """""")
class MResponseLinkContentCategory extends MResponseContentCategory with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var itemsInIssue: List[String] = new ArrayList[String]
	def withitemsInIssue(p:List[String]):this.type ={ 	this.itemsInIssue = p; 	this }

}