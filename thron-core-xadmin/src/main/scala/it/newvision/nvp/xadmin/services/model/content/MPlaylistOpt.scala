package it.newvision.nvp.xadmin.services.model.content
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
@XmlRootElement(name="MPlaylistOpt") 
@XmlType(name="MPlaylistOpt")
//#SWG#@ApiModel(description = """""")
class MPlaylistOpt extends Serializable {

	/**
	 * used to define the content template for the new Playlist. The content template
	 * is used to create audio or video playlist, or slideshow (image playlist).
	 */
	//#SWG#@ApiModelProperty(value = """used to define the content template for the new Playlist. The content template is used to create audio or video playlist, or slideshow (image playlist).""" ,required = true)
	@BeanProperty 
	var template: MEContentType =_
	def withtemplate(p:MEContentType):this.type ={ 	this.template = p; 	this }

	/**
	 * list of xcontent ids of the playlist elements.
	 */
	//#SWG#@ApiModelProperty(value = """list of xcontent ids of the playlist elements.""")
	@BeanProperty 
	var xcontentIds: List[String] = new ArrayList[String]
	def withxcontentIds(p:List[String]):this.type ={ 	this.xcontentIds = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import scala.collection.JavaConversions._
		if(Option(template).isEmpty) throw new IllegalArgumentException("missing playlistOpt.template parameter")
		if(!Seq(MEContentType.IMAGE,MEContentType.AUDIO,MEContentType.VIDEO).contains(template)) throw new IllegalArgumentException("playlistOpt.template not allowed")
		Option(xcontentIds).foreach{xc=> 
		  if(xc.size()>500)throw new IllegalArgumentException("playlistOpt.xcontentIds has more than 500 elements") 
		}
	}

}