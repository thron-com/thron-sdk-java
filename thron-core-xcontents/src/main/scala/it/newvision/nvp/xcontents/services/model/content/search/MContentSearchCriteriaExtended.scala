package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentSearchCriteriaExtended") 
@XmlType(name="MContentSearchCriteriaExtended")
//#SWG#@ApiModel(description = """""")
class MContentSearchCriteriaExtended extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var author: MTextCriteria =_
	def withauthor(p:MTextCriteria):this.type ={ 	this.author = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contentType: List[MEContentSearchType] = new ArrayList[MEContentSearchType]
	def withcontentType(p:List[MEContentSearchType]):this.type ={ 	this.contentType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var imetadata: MIMetadataContentSearchCriteria =_
	def withimetadata(p:MIMetadataContentSearchCriteria):this.type ={ 	this.imetadata = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var itag: MITagContentSearchCriteria =_
	def withitag(p:MITagContentSearchCriteria):this.type ={ 	this.itag = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lang: List[String] = new ArrayList[String]
	def withlang(p:List[String]):this.type ={ 	this.lang = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lemma: MLemmaCriteria =_
	def withlemma(p:MLemmaCriteria):this.type ={ 	this.lemma = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedCategories: MLinkedCategorySearchCriteria =_
	def withlinkedCategories(p:MLinkedCategorySearchCriteria):this.type ={ 	this.linkedCategories = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedProducts: MContentProductCriteria =_
	def withlinkedProducts(p:MContentProductCriteria):this.type ={ 	this.linkedProducts = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var owner: MOwnerSearchCriteria =_
	def withowner(p:MOwnerSearchCriteria):this.type ={ 	this.owner = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var productAliases: List[String] = new ArrayList[String]
	def withproductAliases(p:List[String]):this.type ={ 	this.productAliases = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var sourceExtensions: List[String] = new ArrayList[String]
	def withsourceExtensions(p:List[String]):this.type ={ 	this.sourceExtensions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var title: MTextCriteria =_
	def withtitle(p:MTextCriteria):this.type ={ 	this.title = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var creationDate: MDateRangeExtended =_
	def withcreationDate(p:MDateRangeExtended):this.type ={ 	this.creationDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastUpdate: MDateRangeExtended =_
	def withlastUpdate(p:MDateRangeExtended):this.type ={ 	this.lastUpdate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty
	var onlyStarredContent: Boolean = false
	def withonlyStarredContent(p:Boolean):this.type ={ 	this.onlyStarredContent = p; 	this }

}