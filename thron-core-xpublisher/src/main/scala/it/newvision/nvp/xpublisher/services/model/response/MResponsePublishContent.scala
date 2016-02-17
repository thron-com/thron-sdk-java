package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MPublishedContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePublishContent") 
@XmlType(name="MResponsePublishContent")
//#SWG#@ApiModel(description = """""")
class MResponsePublishContent extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MPublishedContent =_
	def withcontent(p:MPublishedContent):this.type ={ 	this.content = p; 	this }

	/**
	 * used to store the version of the published content. The version number change
	 * when the content is republished using a different source file or when the
	 * thumbnail change. The version doe not change id the content is published in a
	 * new channel.
	 */
	//#SWG#@ApiModelProperty(value = """used to store the version of the published content. The version number change when the content is republished using a different source file or when the thumbnail change. The version doe not change id the content is published in a new channel.""")
	@BeanProperty 
	var pcontentVersion: Integer  = 0
	def withpcontentVersion(p:Integer):this.type ={ 	this.pcontentVersion = p; 	this }

}