package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDeliveryGetContentDetail") 
@XmlType(name="MResponseDeliveryGetContentDetail")
//#SWG#@ApiModel(description = """""")
class MResponseDeliveryGetContentDetail extends MResponseDelivery with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MContentWall =_
	def withcontent(p:MContentWall):MResponseDeliveryGetContentDetail ={ 	this.content = p; 	this }

	/**
	 * This information is used by the player to track in the reporting system where
	 * the content has been viewed. For this reason the attribute return the list of
	 * categoryIds hierarchy like "category1/subcategory1/subcategory2/....
	 * /subcategoryn"
	 */
	//#SWG#@ApiModelProperty(value = """This information is used by the player to track in the reporting system where the content has been viewed. For this reason the attribute return the list of categoryIds hierarchy like "category1/subcategory1/subcategory2/..../subcategoryn"""")
	@BeanProperty 
	var contentCategoryFullPath: List[String] = new ArrayList[String]
	def withcontentCategoryFullPath(p:List[String]):MResponseDeliveryGetContentDetail ={ 	this.contentCategoryFullPath = p; 	this }

	/**
	 * total number of "downloadable contents" (contents linked by the used as
	 * "downloadable"). In order to obtain the list of DownloadableContents should be
	 * used the service JDelivery.getDownloadableContents
	 */
	//#SWG#@ApiModelProperty(value = """total number of "downloadable contents" (contents linked by the used as "downloadable"). In order to obtain the list of DownloadableContents should be used the service JDelivery.getDownloadableContents""")
	@BeanProperty 
	var totalDownloadableContents: Integer =_
	def withtotalDownloadableContents(p:Integer):MResponseDeliveryGetContentDetail ={ 	this.totalDownloadableContents = p; 	this }

	/**
	 * total number of "suggested contents" (contents linked by the user). In order to
	 * obtain the list of Recommended Contents should be used the service JDelivery.
	 * getRecommendedContents
	 */
	//#SWG#@ApiModelProperty(value = """total number of "suggested contents" (contents linked by the user). In order to obtain the list of Recommended Contents should be used the service JDelivery.getRecommendedContents""")
	@BeanProperty 
	var totalRecommendedContents: Integer =_
	def withtotalRecommendedContents(p:Integer):MResponseDeliveryGetContentDetail ={ 	this.totalRecommendedContents = p; 	this }

	/**
	 * Deprecated.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.""")
	@BeanProperty 
	@Deprecated
	var totalSimilarContents: Integer =_
	@Deprecated
	def withtotalSimilarContents(p:Integer):MResponseDeliveryGetContentDetail ={ 	this.totalSimilarContents = p; 	this }

	/**
	 * The list of templates used to customize the Player layout for the current
	 * content.
	 */
	//#SWG#@ApiModelProperty(value = """The list of templates used to customize the Player layout for the current content.""")
	@BeanProperty 
	var embedTemplate: MPlayerEmbedTemplateDetail =_
	def withembedTemplate(p:MPlayerEmbedTemplateDetail):MResponseDeliveryGetContentDetail ={ 	this.embedTemplate = p; 	this }

	/**
	 * Used by traker: Can be USER/GUEST/APP or empty value for generic contacs/shares
	 */
	//#SWG#@ApiModelProperty(value = """Used by traker: Can be USER/GUEST/APP or empty value for generic contacs/shares""")
	@BeanProperty 
	var userType: String =_
	def withuserType(p:String):MResponseDeliveryGetContentDetail ={ 	this.userType = p; 	this }

}