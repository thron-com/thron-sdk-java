package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MFile

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishInWeebo") 
@XmlType(name="MPublishInWeebo")
//#SWG#@ApiModel(description = """""")
class MPublishInWeebo extends Serializable {

	/**
	 * the source File Descriptor. Multiple files is used depending on the publication
	 * type. PublishVideo/PublishAudio/PublishImage requires only one source file.
	 * This value should be empty for MPublishPageletParams
	 */
	//#SWG#@ApiModelProperty(value = """the source File Descriptor. Multiple files is used depending on the publication type. PublishVideo/PublishAudio/PublishImage requires only one source file.
	//#SWGNL#This value should be empty for MPublishPageletParams""")
	@BeanProperty 
	var file: List[MFile] = new ArrayList[MFile]
	def withfile(p:List[MFile]):MPublishInWeebo ={ 	this.file = p; 	this }

	/**
	 * If TRUE the source file is get from the FTP folder otherwise from the
	 * Repository Area. The file get from FTP is imported to the Repository Area and
	 * published in CDN.
	 * This value should be empty for MPublishPageletParams
	 */
	//#SWG#@ApiModelProperty(value = """If TRUE the source file is get from the FTP folder otherwise from the Repository Area. The file get from FTP is imported to the Repository Area and published in CDN.
	//#SWGNL#This value should be empty for MPublishPageletParams""" ,required = true)
	@BeanProperty 
	var fileFromFTP: Boolean  = true
	def withfileFromFTP(p:Boolean):MPublishInWeebo ={ 	this.fileFromFTP = p; 	this }

	/**
	 * Optional.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.""")
	@BeanProperty 
	var channel: String =_
	def withchannel(p:String):MPublishInWeebo ={ 	this.channel = p; 	this }

	/**
	 * Optional.
	 * The content metadata, like name and description in the specified locale. If the
	 * ContentDescription is empty, the platform create a content description for the
	 * default locale assigning as content title the source filename.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#The content metadata, like name and description in the specified locale. If the ContentDescription is empty, the platform create a content description for the default locale assigning as content title the source filename.""")
	@BeanProperty 
	var content: MContentDescription =_
	def withcontent(p:MContentDescription):MPublishInWeebo ={ 	this.content = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	@Deprecated
	var solution: String  = "VIEW"
	@Deprecated
	def withsolution(p:String):MPublishInWeebo ={ 	this.solution = p; 	this }

	/**
	 * Optional.
	 * Define if a content is User Generated. The UGC contents are not automatically
	 * published in CDN, but are converted (channel.staus == READY), and after the
	 * validation of a moderator, can be published.
	 * This value should be empty for MPublishPageletParams
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#Define if a content is User Generated. The UGC contents are not automatically published in CDN, but are converted (channel.staus == READY), and after the validation of a moderator, can be published.
	//#SWGNL#This value should be empty for MPublishPageletParams""")
	@BeanProperty 
	var contentUGC: Boolean =_
	def withcontentUGC(p:Boolean):MPublishInWeebo ={ 	this.contentUGC = p; 	this }

	/**
	 * Optional. The identifier for the publishing profile (used to derive the list of
	 * channels where the content should be published).
	 * If empty and channel not specified, will be used the default profile
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The identifier for the publishing profile (used to derive the list of channels where the content should be published).
	//#SWGNL#If empty and channel not specified, will be used the default profile""")
	@BeanProperty 
	var profileId: String =_
	def withprofileId(p:String):MPublishInWeebo ={ 	this.profileId = p; 	this }

	/**
	 * Optional.Used to specify if the publishing process should define a value for
	 * all available content locales.
	 * If false the service apply to the content only the locale specified in
	 * MPublishInWeebo.content
	 * If true the service apply the filename (as default value) for each single
	 * locale of the content (all available locale of the client)
	 */
	//#SWG#@ApiModelProperty(value = """Optional.Used to specify if the publishing process should define a value for all available content locales. 
	//#SWGNL#If false the service apply to the content only the locale specified in MPublishInWeebo.content 
	//#SWGNL#If true the service apply the filename (as default value) for each single locale of the content (all available locale of the client)""")
	@BeanProperty 
	var initAllLocales: Boolean  = true
	def withinitAllLocales(p:Boolean):MPublishInWeebo ={ 	this.initAllLocales = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		(file != null)
	}

}