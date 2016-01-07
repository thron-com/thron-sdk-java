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
@XmlRootElement(name="MPublishedContentExt") 
@XmlType(name="MPublishedContentExt")
//#SWG#@ApiModel(description = """""")
class MPublishedContentExt extends MPublishedContent with Serializable  {

	/**
	 * used to store the version of the published content. The version number change
	 * when the content is republished using a different source file. The version doe
	 * not change id the content is published in a new channel or the user change the
	 * thumbnail.
	 */
	//#SWG#@ApiModelProperty(value = """used to store the version of the published content. The version number change when the content is republished using a different source file. The version doe not change id the content is published in a new channel or the user change the thumbnail.""")
	@BeanProperty 
	var pcontentVersion: Integer  = 0
	def withpcontentVersion(p:Integer):MPublishedContentExt ={ 	this.pcontentVersion = p; 	this }

}