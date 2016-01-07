package it.newvision.nvp.xcontents.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MRatingProperty
import it.newvision.nvp.xcontents.model.MCustomMetadata
import it.newvision.nvp.xcontents.model.MPlayerEmbedTemplate
import it.newvision.nvp.xcontents.model.MPublishingProfile
import it.newvision.nvp.xcontents.model.MTrashProperties
import it.newvision.nvp.xcontents.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MClientProperties") 
@XmlType(name="MClientProperties")
//#SWG#@ApiModel(description = """""")
class MClientProperties extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ratingProperty: MRatingProperty =_
	def withratingProperty(p:MRatingProperty):MClientProperties ={ 	this.ratingProperty = p; 	this }

	/**
	 * if true the each new comment need to be moderated before to be visible,
	 * otherwise each new comment is automatically published.
	 */
	//#SWG#@ApiModelProperty(value = """if true the each new comment need to be moderated before to be visible, otherwise each new comment is automatically published.""")
	@BeanProperty 
	var commentsModerationEnabled: Boolean =_
	def withcommentsModerationEnabled(p:Boolean):MClientProperties ={ 	this.commentsModerationEnabled = p; 	this }

	/**
	 * if true the each new ugc content need to be moderated before to be visible,
	 * otherwise each new ugc is automatically published.
	 */
	//#SWG#@ApiModelProperty(value = """if true the each new ugc content need to be moderated before to be visible, otherwise each new ugc is automatically published.""")
	@BeanProperty 
	var ugcModerationEnabled: Boolean =_
	def withugcModerationEnabled(p:Boolean):MClientProperties ={ 	this.ugcModerationEnabled = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var customMetadatas: List[MCustomMetadata] = new ArrayList[MCustomMetadata]
	def withcustomMetadatas(p:List[MCustomMetadata]):MClientProperties ={ 	this.customMetadatas = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var embedTemplates: List[MPlayerEmbedTemplate] = new ArrayList[MPlayerEmbedTemplate]
	def withembedTemplates(p:List[MPlayerEmbedTemplate]):MClientProperties ={ 	this.embedTemplates = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var publishingProfiles: MPublishingProfile =_
	def withpublishingProfiles(p:MPublishingProfile):MClientProperties ={ 	this.publishingProfiles = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var trashProperties: MTrashProperties =_
	def withtrashProperties(p:MTrashProperties):MClientProperties ={ 	this.trashProperties = p; 	this }

	/**
	 * list of custom metadata used by client to store additional information of
	 * clientProperties
	 */
	//#SWG#@ApiModelProperty(value = """list of custom metadata used by client to store additional information of clientProperties""")
	@BeanProperty 
	var customProperties: List[MMetadata] = new ArrayList[MMetadata]
	def withcustomProperties(p:List[MMetadata]):MClientProperties ={ 	this.customProperties = p; 	this }

	/**
	 * lifetime of the Functional Audit entries in the platform as number od days. The
	 * client can specify:
	 * <ul>
	 * 	<li>-1 : infinite. The functional Audit is always stored in the platform</li>
	 * 	<li>n: number of days after that the old entries have been automatically
	 * removed.</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """lifetime of the Functional Audit entries in the platform as number od days. The client can specify:
	//#SWGNL#<ul>
	//#SWGNL#	<li>-1 : infinite. The functional Audit is always stored in the platform</li>
	//#SWGNL#	<li>n: number of days after that the old entries have been automatically removed.</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var auditDurationDays: Integer =_
	def withauditDurationDays(p:Integer):MClientProperties ={ 	this.auditDurationDays = p; 	this }

	/**
	 * if true secure connection is enforced
	 */
	//#SWG#@ApiModelProperty(value = """if true secure connection is enforced""")
	@BeanProperty 
	var secureConnectionEnabled: Boolean =_
	def withsecureConnectionEnabled(p:Boolean):MClientProperties ={ 	this.secureConnectionEnabled = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def filterEmpty(){
		import collection.JavaConversions._
		customMetadatas = customMetadatas filterNot {_ == null}
		embedTemplates = embedTemplates filterNot {_ == null}
		customProperties = customProperties filterNot {_ == null}
	}

}