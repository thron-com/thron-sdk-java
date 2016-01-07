package it.newvision.nvp.xadmin.services.model.weebo
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentPlaylistParam") 
@XmlType(name="MContentPlaylistParam")
//#SWG#@ApiModel(description = """""")
class MContentPlaylistParam extends MContentParams with Serializable  {

	/**
	 * used to define the content template for the new Playlist. The content template
	 * is used to create audio or video playlist, or slideshow (image playlist).
	 */
	//#SWG#@ApiModelProperty(value = """used to define the content template for the new Playlist. The content template is used to create audio or video playlist, or slideshow (image playlist).""" ,required = true)
	@BeanProperty 
	var contentsTemplate: MEContentType =_
	def withcontentsTemplate(p:MEContentType):MContentPlaylistParam ={ 	this.contentsTemplate = p; 	this }

}