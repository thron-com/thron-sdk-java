package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MResponseContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAutocompleteSearchResult") 
@XmlType(name="MAutocompleteSearchResult")
//#SWG#@ApiModel(description = """""")
class MAutocompleteSearchResult extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var words: List[String] = new ArrayList[String]
	def withwords(p:List[String]):this.type ={ 	this.words = p; 	this }

}