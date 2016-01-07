package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MPlayerEmbedTemplate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDeliveryGetContent") 
@XmlType(name="MResponseDeliveryGetContent")
//#SWG#@ApiModel(description = """""")
class MResponseDeliveryGetContent extends MResponseDelivery with Serializable  {

	/**
	 * <b>Limits:</b>
	 * The service doesn't return itags and imetadata value for each content.
	 */
	//#SWG#@ApiModelProperty(value = """<b>Limits:</b>
	//#SWGNL#The service doesn't return itags and imetadata value for each content.""")
	@BeanProperty 
	var content: MContentWall =_
	def withcontent(p:MContentWall):MResponseDeliveryGetContent ={ 	this.content = p; 	this }

	/**
	 * This information is used by the player to track in the reporting system where
	 * the content has been viewed. For this reason the attribute return the list of
	 * categoryIds hierarchy like "category1/subcategory1/subcategory2/....
	 * /subcategoryn"
	 */
	//#SWG#@ApiModelProperty(value = """This information is used by the player to track in the reporting system where the content has been viewed. For this reason the attribute return the list of categoryIds hierarchy like "category1/subcategory1/subcategory2/..../subcategoryn"""")
	@BeanProperty 
	var contentCategoryFullPath: List[String] = new ArrayList[String]
	def withcontentCategoryFullPath(p:List[String]):MResponseDeliveryGetContent ={ 	this.contentCategoryFullPath = p; 	this }

	/**
	 * The list of templates used to customize the Player layout for the current
	 * content.
	 */
	//#SWG#@ApiModelProperty(value = """The list of templates used to customize the Player layout for the current content.""")
	@BeanProperty 
	var embedTemplate: MPlayerEmbedTemplate =_
	def withembedTemplate(p:MPlayerEmbedTemplate):MResponseDeliveryGetContent ={ 	this.embedTemplate = p; 	this }

}