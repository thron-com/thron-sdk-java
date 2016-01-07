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
@XmlRootElement(name="MChannelList") 
@XmlType(name="MChannelList")
//#SWG#@ApiModel(description = """""")
class MChannelList extends Serializable {

	/**
	 * The list of Channels where the thumbnails should be replaced.
	 */
	//#SWG#@ApiModelProperty(value = """The list of Channels where the thumbnails should be replaced.""")
	@BeanProperty 
	var channels: List[String] = new ArrayList[String]
	def withchannels(p:List[String]):MChannelList ={ 	this.channels = p; 	this }

}