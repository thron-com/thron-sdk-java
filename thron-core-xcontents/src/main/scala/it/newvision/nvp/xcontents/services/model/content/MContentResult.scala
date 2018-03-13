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
@XmlRootElement(name="MContentResult") 
@XmlType(name="MContentResult")
//#SWG#@ApiModel(description = """""")
class MContentResult extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
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
	 * Deprecated by dynThumbService
	 * The list of all available thumbnail URLs. 
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated by dynThumbService 
	//#SWGNL#The list of all available thumbnail URLs. """)
	@BeanProperty 
	@Deprecated
	var thumbUrls: List[String] = new ArrayList[String]
	@Deprecated
	def withthumbUrls(p:List[String]):this.type ={ 	this.thumbUrls = p; 	this }

	/**
	 * Deprecated by dynThumbService parameter.
	 * Defined if divArea parameter is specified on the request.
	 * Return the thumbnail that best suits to the given area (DivArea format:
	 * <widht>x<height>)
	 * bestThumbUrl provides the static url of the thumbnail in 4me CDN (Content
	 * Delivery Network); the url is volatile and may change with time. In order to
	 * obtain a dynamic link to the best thumbnail (for the given content and div
	 * area) use the "dynThumbService" attribute (see reference for details)
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated by dynThumbService parameter.
	//#SWGNL#Defined if divArea parameter is specified on the request.
	//#SWGNL#Return the thumbnail that best suits to the given area (DivArea format: <widht>x<height>)
	//#SWGNL#bestThumbUrl provides the static url of the thumbnail in 4me CDN (Content Delivery Network); the url is volatile and may change with time. In order to obtain a dynamic link to the best thumbnail (for the given content and div area) use the "dynThumbService" attribute (see reference for details)""")
	@BeanProperty 
	@Deprecated
	var bestThumbUrl: String =_
	@Deprecated
	def withbestThumbUrl(p:String):this.type ={ 	this.bestThumbUrl = p; 	this }

	/**
	 * Returns a persistent link to the thumbnail for the given content and DivArea
	 * provided by the service JDelivery.getThumbnail.
	 * Thumbnail resolution is the closes to fit the given DivArea (DivArea format:
	 * <widht>x<height>)
	 */
	//#SWG#@ApiModelProperty(value = """Returns a persistent link to the thumbnail for the given content and DivArea provided by the service JDelivery.getThumbnail.
	//#SWGNL#Thumbnail resolution is the closes to fit the given DivArea (DivArea format: <widht>x<height>)""" ,required = true)
	@BeanProperty 
	var dynThumbService: String =_
	def withdynThumbService(p:String):this.type ={ 	this.dynThumbService = p; 	this }

	/**
	 * the fullname of the content's owner (based on acl)
	 */
	//#SWG#@ApiModelProperty(value = """the fullname of the content's owner (based on acl)""")
	@BeanProperty 
	var ownerFullname: String =_
	def withownerFullname(p:String):this.type ={ 	this.ownerFullname = p; 	this }

	/**
	 * acl information for the content and user in session
	 */
	//#SWG#@ApiModelProperty(value = """acl information for the content and user in session""")
	@BeanProperty 
	var aclInfo: MContentAclInverseRules =_
	def withaclInfo(p:MContentAclInverseRules):this.type ={ 	this.aclInfo = p; 	this }

}