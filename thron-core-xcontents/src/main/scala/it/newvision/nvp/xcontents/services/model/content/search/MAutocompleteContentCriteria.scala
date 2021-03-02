package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MDateRange

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAutocompleteContentCriteria") 
@XmlType(name="MAutocompleteContentCriteria")
//#SWG#@ApiModel(description = """""")
class MAutocompleteContentCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lemma: MAutocompleteLemmaCriteria =_
	def withlemma(p:MAutocompleteLemmaCriteria):this.type ={ 	this.lemma = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var creationDate: MDateRange =_
	def withcreationDate(p:MDateRange):this.type ={ 	this.creationDate = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""")
	@BeanProperty 
	var lang: List[String] =_
	def withlang(p:List[String]):this.type ={ 	this.lang = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastUpdate: MDateRange =_
	def withlastUpdate(p:MDateRange):this.type ={ 	this.lastUpdate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contentType: List[MEContentSearchType] =_
	def withcontentType(p:List[MEContentSearchType]):this.type ={ 	this.contentType = p; 	this }

	/**
	 * It is used to filter content linked to specific categories
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content linked to specific categories""")
	@BeanProperty 
	var linkedCategories: MLinkedCategorySearchCriteria =_
	def withlinkedCategories(p:MLinkedCategorySearchCriteria):this.type ={ 	this.linkedCategories = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var author: MTextCriteria =_
	def withauthor(p:MTextCriteria):this.type ={ 	this.author = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var imetadata: MIMetadataContentSearchCriteria =_
	def withimetadata(p:MIMetadataContentSearchCriteria):this.type ={ 	this.imetadata = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var itag: MITagContentSearchCriteria =_
	def withitag(p:MITagContentSearchCriteria):this.type ={ 	this.itag = p; 	this }

	/**
	 * It is used to filter content by owner
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by owner""")
	@BeanProperty 
	var owner: MOwnerSearchCriteria =_
	def withowner(p:MOwnerSearchCriteria):this.type ={ 	this.owner = p; 	this }

	/**
	 * It is used to filter content by linked product properties.
	 */
	//#SWG#@ApiModelProperty(value = """It is used to filter content by linked product properties.""")
	@BeanProperty 
	var linkedProducts: MContentProductCriteria =_
	def withlinkedProducts(p:MContentProductCriteria):this.type ={ 	this.linkedProducts = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		true
	}

}