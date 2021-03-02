package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MContentAclInverseRules
import it.newvision.nvp.xcontents.model.MExternalId
import it.newvision.nvp.xcontents.model.MIMetadata
import it.newvision.nvp.xcontents.model.MITag
import it.newvision.nvp.xcontents.model.MContent4Locale
import it.newvision.nvp.xcontents.model.MMetadata
import it.newvision.nvp.xcontents.model.MPrettyId
import it.newvision.nvp.xcontents.model.MContentUserSpecificProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentExtendedDetails") 
@XmlType(name="MContentExtendedDetails")
//#SWG#@ApiModel(description = """""")
class MContentExtendedDetails extends Serializable {

	/**
	 * acl information for the content and user in session
	 */
	//#SWG#@ApiModelProperty(value = """acl information for the content and user in session""")
	@BeanProperty 
	var aclInfo: MContentAclInverseRules =_
	def withaclInfo(p:MContentAclInverseRules):this.type ={ 	this.aclInfo = p; 	this }

	/**
	 * The display name of the Author.
	 * Free text used to show the full name of the author.
	 * Constraints: max length = 50
	 */
	//#SWG#@ApiModelProperty(value = """The display name of the Author.
	//#SWGNL#Free text used to show the full name of the author.
	//#SWGNL#Constraints: max length = 50""")
	@BeanProperty 
	var author: String =_
	def withauthor(p:String):this.type ={ 	this.author = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var availableChannels: List[String] =_
	def withavailableChannels(p:List[String]):this.type ={ 	this.availableChannels = p; 	this }

	/**
	 * the list of externalIds
	 */
	//#SWG#@ApiModelProperty(value = """the list of externalIds""")
	@BeanProperty 
	var externalIds: List[MExternalId] =_
	def withexternalIds(p:List[MExternalId]):this.type ={ 	this.externalIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var highlights: List[MHighlight] =_
	def withhighlights(p:List[MHighlight]):this.type ={ 	this.highlights = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var imetadata: List[MIMetadata] =_
	def withimetadata(p:List[MIMetadata]):this.type ={ 	this.imetadata = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var itags: List[MITag] =_
	def withitags(p:List[MITag]):this.type ={ 	this.itags = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):this.type ={ 	this.lastUpdate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedCategoryIds: List[String] =_
	def withlinkedCategoryIds(p:List[String]):this.type ={ 	this.linkedCategoryIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedContent: List[MContentLinked] =_
	def withlinkedContent(p:List[MContentLinked]):this.type ={ 	this.linkedContent = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var locales: List[MContent4Locale] =_
	def withlocales(p:List[MContent4Locale]):this.type ={ 	this.locales = p; 	this }

	/**
	 * the userId of the 
	 */
	//#SWG#@ApiModelProperty(value = """the userId of the """)
	@BeanProperty 
	var owner: MOwnerDetail =_
	def withowner(p:MOwnerDetail):this.type ={ 	this.owner = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var playlistDetails: List[MMetadata] =_
	def withplaylistDetails(p:List[MMetadata]):this.type ={ 	this.playlistDetails = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var prettyIds: List[MPrettyId] =_
	def withprettyIds(p:List[MPrettyId]):this.type ={ 	this.prettyIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var properties: List[MEContentProperty] =_
	def withproperties(p:List[MEContentProperty]):this.type ={ 	this.properties = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var publishingStatus: String =_
	def withpublishingStatus(p:String):this.type ={ 	this.publishingStatus = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var source: MSourceDetail =_
	def withsource(p:MSourceDetail):this.type ={ 	this.source = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userSpecificValues: MContentUserSpecificProperties =_
	def withuserSpecificValues(p:MContentUserSpecificProperties):this.type ={ 	this.userSpecificValues = p; 	this }

}