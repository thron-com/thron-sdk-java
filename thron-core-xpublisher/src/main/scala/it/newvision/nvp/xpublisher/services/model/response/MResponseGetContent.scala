package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.model.MPublishedContent
import it.newvision.nvp.xpublisher.model.MRestrictionProperties

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetContent") 
@XmlType(name="MResponseGetContent")
//#SWG#@ApiModel(description = """""")
class MResponseGetContent extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MPublishedContent =_
	def withcontent(p:MPublishedContent):MResponseGetContent ={ 	this.content = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var properties: MRestrictionProperties =_
	def withproperties(p:MRestrictionProperties):MResponseGetContent ={ 	this.properties = p; 	this }

	/**
	 * used to store the version of the published content. The version number change
	 * when the content is republished using a different source file. The version does
	 * not change if the content is published in a new channel or the user change the
	 * thumbnail.
	 */
	//#SWG#@ApiModelProperty(value = """used to store the version of the published content. The version number change when the content is republished using a different source file. The version does not change if the content is published in a new channel or the user change the thumbnail.""")
	@BeanProperty 
	var pcontentVersion: Integer  = 0
	def withpcontentVersion(p:Integer):MResponseGetContent ={ 	this.pcontentVersion = p; 	this }

}