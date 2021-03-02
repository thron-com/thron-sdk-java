package it.newvision.nvp.xcontents.services.model.content.contentsearch
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.search.MContentSearchCriteriaExtended
import it.newvision.nvp.xcontents.services.model.content.search.MContentSearchResponseOptions

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentSearch") 
@XmlType(name="MContentSearch")
//#SWG#@ApiModel(description = """""")
class MContentSearch extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var criteria: MContentSearchCriteriaExtended =_
	def withcriteria(p:MContentSearchCriteriaExtended):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var responseOptions: MContentSearchResponseOptions =_
	def withresponseOptions(p:MContentSearchResponseOptions):this.type ={ 	this.responseOptions = p; 	this }

}