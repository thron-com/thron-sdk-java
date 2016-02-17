package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MClient") 
@XmlType(name="MClient")
//#SWG#@ApiModel(description = """""")
class MClient extends Serializable {

	/**
	 * the clientId code
	 */
	//#SWG#@ApiModelProperty(value = """the clientId code""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String  = java.util.UUID.randomUUID.toString
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var ratingProperty: MRatingProperty  = new MRatingProperty
	def withratingProperty(p:MRatingProperty):this.type ={ 	this.ratingProperty = p; 	this }

	/**
	 * if true the each new comment need to be moderated before to be visible,
	 * otherwise each new comment is automatically published.
	 */
	//#SWG#@ApiModelProperty(value = """if true the each new comment need to be moderated before to be visible, otherwise each new comment is automatically published.""" ,required = true)
	@BeanProperty 
	var commentsModerationEnabled: Boolean  = false
	def withcommentsModerationEnabled(p:Boolean):this.type ={ 	this.commentsModerationEnabled = p; 	this }

	/**
	 * if true the each new ugc content need to be moderated before to be visible,
	 * otherwise each new ugc is automatically published.
	 */
	//#SWG#@ApiModelProperty(value = """if true the each new ugc content need to be moderated before to be visible, otherwise each new ugc is automatically published.""" ,required = true)
	@BeanProperty 
	var ugcModerationEnabled: Boolean  = true
	def withugcModerationEnabled(p:Boolean):this.type ={ 	this.ugcModerationEnabled = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var customMetadatas: List[MCustomMetadata] = new ArrayList[MCustomMetadata]
	def withcustomMetadatas(p:List[MCustomMetadata]):this.type ={ 	this.customMetadatas = p; 	this }

	/**
	 * The list of templates used to customize the Player layout
	 */
	//#SWG#@ApiModelProperty(value = """The list of templates used to customize the Player layout""")
	@BeanProperty 
	var embedTemplates: List[MPlayerEmbedTemplate] = new ArrayList[MPlayerEmbedTemplate]
	def withembedTemplates(p:List[MPlayerEmbedTemplate]):this.type ={ 	this.embedTemplates = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var publishingProfiles: MPublishingProfile  = new MPublishingProfile()
	def withpublishingProfiles(p:MPublishingProfile):this.type ={ 	this.publishingProfiles = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var trashProperties: MTrashProperties =_
	def withtrashProperties(p:MTrashProperties):this.type ={ 	this.trashProperties = p; 	this }

	/**
	 * list of custom metadata used by client to store additional information of
	 * clientProperties
	 */
	//#SWG#@ApiModelProperty(value = """list of custom metadata used by client to store additional information of clientProperties""")
	@BeanProperty 
	var customProperties: List[MMetadata] = new ArrayList[MMetadata]
	def withcustomProperties(p:List[MMetadata]):this.type ={ 	this.customProperties = p; 	this }

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
	var auditDurationDays: Integer  = 180
	def withauditDurationDays(p:Integer):this.type ={ 	this.auditDurationDays = p; 	this }

	/**
	 * if true secure connection is enforced
	 */
	//#SWG#@ApiModelProperty(value = """if true secure connection is enforced""" ,required = true)
	@BeanProperty 
	var secureConnectionEnabled: Boolean  = true
	def withsecureConnectionEnabled(p:Boolean):this.type ={ 	this.secureConnectionEnabled = p; 	this }

	@BeanProperty 
	var version: Long =_
	def withversion(p:Long):this.type ={ 	this.version = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		(clientId != null)
	}

}