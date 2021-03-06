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

	/**
	 * itags and imetadata are now returned in the response if the token used to
	 * perform the request is related to a user with the proper permission to see the
	 * classifications.
	 */
	//#SWG#@ApiModelProperty(value = """itags and imetadata are now returned in the response if the token used to perform the request is related to a user with the proper permission to see the classifications.""")
	@BeanProperty 
	var content: MContentWall =_
	def withcontent(p:MContentWall):this.type ={ 	this.content = p; 	this }

	/**
	 * This information is used by the player to track in the reporting system where
	 * the content has been viewed. For this reason the attribute return the list of
	 * categoryIds hierarchy like "category1/subcategory1/subcategory2/....
	 * /subcategoryn"
	 */
	//#SWG#@ApiModelProperty(value = """This information is used by the player to track in the reporting system where the content has been viewed. For this reason the attribute return the list of categoryIds hierarchy like "category1/subcategory1/subcategory2/..../subcategoryn"""")
	@BeanProperty 
	var contentCategoryFullPath: List[String] = new ArrayList[String]
	def withcontentCategoryFullPath(p:List[String]):this.type ={ 	this.contentCategoryFullPath = p; 	this }

	/**
	 * The template used to customize Player layout for the content
	 */
	//#SWG#@ApiModelProperty(value = """The template used to customize Player layout for the content""")
	@BeanProperty 
	var embedTemplate: MPlayerEmbedTemplateDetail =_
	def withembedTemplate(p:MPlayerEmbedTemplateDetail):this.type ={ 	this.embedTemplate = p; 	this }

	/**
	 * total number of "downloadable contents" (contents linked by the used as
	 * "downloadable"). In order to obtain the list of DownloadableContents should be
	 * used the service JDelivery.getDownloadableContents
	 */
	//#SWG#@ApiModelProperty(value = """total number of "downloadable contents" (contents linked by the used as "downloadable"). In order to obtain the list of DownloadableContents should be used the service JDelivery.getDownloadableContents""")
	@BeanProperty 
	var totalDownloadableContents: Integer =_
	def withtotalDownloadableContents(p:Integer):this.type ={ 	this.totalDownloadableContents = p; 	this }

	/**
	 * total number of "suggested contents" (contents linked by the user). In order to
	 * obtain the list of Recommended Contents should be used the service JDelivery.
	 * getRecommendedContents
	 */
	//#SWG#@ApiModelProperty(value = """total number of "suggested contents" (contents linked by the user). In order to obtain the list of Recommended Contents should be used the service JDelivery.getRecommendedContents""")
	@BeanProperty 
	var totalRecommendedContents: Integer =_
	def withtotalRecommendedContents(p:Integer):this.type ={ 	this.totalRecommendedContents = p; 	this }

	/**
	 * Used by traker: Can be USER/GUEST/APP or empty value for generic contacs/shares
	 */
	//#SWG#@ApiModelProperty(value = """Used by traker: Can be USER/GUEST/APP or empty value for generic contacs/shares""")
	@BeanProperty 
	var userType: String =_
	def withuserType(p:String):this.type ={ 	this.userType = p; 	this }

}