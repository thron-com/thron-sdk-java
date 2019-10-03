package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.search.MAutocompleteContentCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.searchLemmaAutoComplete
 */
@XmlRootElement(name="MContentsearchLemmaAutoCompleteReq")
@XmlType(name="MContentsearchLemmaAutoCompleteReq")
//#SWG#@ApiModel(description = "Request message for service JContent.searchLemmaAutoComplete")
class MContentsearchLemmaAutoCompleteReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MAutocompleteContentCriteria =_
	def withcriteria(p:MAutocompleteContentCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var maxResults: Integer =_
	def withmaxResults(p:Integer):this.type ={ 	this.maxResults = p; 	this }

}