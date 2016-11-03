package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MContent
import it.newvision.nvp.xcontents.model.MCategory
import it.newvision.nvp.xcontents.model.MContentUserSpecificProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentDetail") 
@XmlType(name="MResponseContentDetail")
//#SWG#@ApiModel(description = """""")
class MResponseContentDetail extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var content: MContent =_
	def withcontent(p:MContent):this.type ={ 	this.content = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedCategories: List[MCategory] = new ArrayList[MCategory]
	def withlinkedCategories(p:List[MCategory]):this.type ={ 	this.linkedCategories = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userSpecificValues: MContentUserSpecificProperties =_
	def withuserSpecificValues(p:MContentUserSpecificProperties):this.type ={ 	this.userSpecificValues = p; 	this }

	/**
	 * total number of "downloadable contents" (contents linked by the used as
	 * "downloadable"). In order to obtain the list of DownloadableContents should be
	 * used the service JDelivery.getDownloadableContents
	 */
	//#SWG#@ApiModelProperty(value = """total number of "downloadable contents" (contents linked by the used as "downloadable"). In order to obtain the list of DownloadableContents should be used the service JDelivery.getDownloadableContents""" ,required = true)
	@BeanProperty 
	var totalDownloadableContents: Integer =_
	def withtotalDownloadableContents(p:Integer):this.type ={ 	this.totalDownloadableContents = p; 	this }

	/**
	 * total number of "suggested contents" (contents linked by the user). In order to
	 * obtain the list of Recommended Contents should be used the service JDelivery.
	 * getRecommendedContents
	 */
	//#SWG#@ApiModelProperty(value = """total number of "suggested contents" (contents linked by the user). In order to obtain the list of Recommended Contents should be used the service JDelivery.getRecommendedContents""" ,required = true)
	@BeanProperty 
	var totalRecommendedContents: Integer =_
	def withtotalRecommendedContents(p:Integer):this.type ={ 	this.totalRecommendedContents = p; 	this }

	/**
	 * Optional. The list of all available thumbnail URLs
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The list of all available thumbnail URLs""")
	@BeanProperty 
	@Deprecated
	var thumbUrls: List[String] = new ArrayList[String]
	@Deprecated
	def withthumbUrls(p:List[String]):this.type ={ 	this.thumbUrls = p; 	this }

}