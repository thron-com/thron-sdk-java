package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishingProcess.unpublishContent
 */
@XmlRootElement(name="MPublishingProcessunpublishContentReq")
@XmlType(name="MPublishingProcessunpublishContentReq")
//#SWG#@ApiModel(description = "Request message for service JPublishingProcess.unpublishContent")
class MPublishingProcessunpublishContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * mediaContentId or xcontentId are required
	 */
	//#SWG#@ApiModelProperty(value = """mediaContentId or xcontentId are required""", required = true)
	@BeanProperty
	var mediaContentId: String =_
	def withmediaContentId(p:String):this.type ={ 	this.mediaContentId = p; 	this }

	/**
	 * mediaContentId or xcontentId are required
	 */
	//#SWG#@ApiModelProperty(value = """mediaContentId or xcontentId are required""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

	/**
	 * used to force the unpublishing process, and discard the warning messaging about
	 * content linked by other contents.
	 */
	//#SWG#@ApiModelProperty(value = """used to force the unpublishing process, and discard the warning messaging about content linked by other contents.""", required = true)
	@BeanProperty
	var force: Boolean =_
	def withforce(p:Boolean):this.type ={ 	this.force = p; 	this }

	/**
	 * Optional (default true).
	 * If true the service try to remove the source files (in repository) used to
	 * publish the content and all previous versions (list of files in MMediaContent.
	 * sourcefiles and MMediaContent.sourceFilesOldVersions)
	 */
	//#SWG#@ApiModelProperty(value = """Optional (default true).
	//#SWGNL#If true the service try to remove the source files (in repository) used to publish the content and all previous versions (list of files in MMediaContent.sourcefiles and MMediaContent.sourceFilesOldVersions)""", required = true)
	@BeanProperty
	var removeSourceFiles: Boolean =_
	def withremoveSourceFiles(p:Boolean):this.type ={ 	this.removeSourceFiles = p; 	this }

}