package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.search.MContentSearchResponseOptions
import it.newvision.nvp.xcontents.services.model.content.search.MContentSearchCriteriaExtended

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContentSearch.insert
 */
@XmlRootElement(name="MContentSearchinsertReq")
@XmlType(name="MContentSearchinsertReq")
//#SWG#@ApiModel(description = "Request message for service JContentSearch.insert")
class MContentSearchinsertReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var responseOptions: MContentSearchResponseOptions =_
	def withresponseOptions(p:MContentSearchResponseOptions):this.type ={ 	this.responseOptions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MContentSearchCriteriaExtended =_
	def withcriteria(p:MContentSearchCriteriaExtended):this.type ={ 	this.criteria = p; 	this }

}