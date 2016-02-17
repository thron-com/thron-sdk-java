package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseUnpublishContent") 
@XmlType(name="MResponseUnpublishContent")
//#SWG#@ApiModel(description = """""")
class MResponseUnpublishContent extends MResponsePublisher with Serializable  {

	/**
	 * TRUE if the content is still published on other channels. FALSE if the content
	 * was completely unpublished from the CDN
	 */
	//#SWG#@ApiModelProperty(value = """TRUE if the content is still published on other channels. FALSE if the content was completely unpublished from the CDN""" ,required = true)
	@BeanProperty 
	var publishedInOtherChannels: Boolean =_
	def withpublishedInOtherChannels(p:Boolean):this.type ={ 	this.publishedInOtherChannels = p; 	this }

}