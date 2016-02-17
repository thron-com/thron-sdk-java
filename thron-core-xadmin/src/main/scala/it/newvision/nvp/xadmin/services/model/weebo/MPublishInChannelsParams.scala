package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishInChannelsParams") 
@XmlType(name="MPublishInChannelsParams")
//#SWG#@ApiModel(description = """""")
class MPublishInChannelsParams extends Serializable {

	/**
	 * the content Id.
	 */
	//#SWG#@ApiModelProperty(value = """the content Id.""" ,required = true)
	@BeanProperty 
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	/**
	 * Deprecated. use xcontentId parameter
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated. use xcontentId parameter""")
	@BeanProperty 
	@Deprecated
	var mediaContentId: String =_
	@Deprecated
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	/**
	 * List of Channels where the content should be published.
	 */
	//#SWG#@ApiModelProperty(value = """List of Channels where the content should be published.""")
	@BeanProperty 
	var channels: List[String] = new ArrayList[String]
	def withchannels(p:List[String]):this.type ={ 	this.channels = p; 	this }

	/**
	 * Optional. The identifier for the publishing profile (used to derive the list of
	 * channels where the content should be published).
	 * If empty and channels not specified, will be used the default profile
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The identifier for the publishing profile (used to derive the list of channels where the content should be published).
	//#SWGNL#If empty and channels not specified, will be used the default profile""")
	@BeanProperty 
	var profileId: String =_
	def withprofileId(p:String):this.type ={ 	this.profileId = p; 	this }

	/**
	 * Deprecated.
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated.""" ,required = true)
	@BeanProperty 
	@Deprecated
	var stopForPreview: Boolean  = false
	@Deprecated
	def withstopForPreview(p:Boolean):this.type ={ 	this.stopForPreview = p; 	this }

}