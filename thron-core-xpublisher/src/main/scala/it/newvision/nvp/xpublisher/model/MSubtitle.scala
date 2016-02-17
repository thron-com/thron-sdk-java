package it.newvision.nvp.xpublisher.model
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
 * The CuePoint class is used to add specific information to the published content,
 * and to provide all necessary information to the player where the specific srt
 * cue point files are stored, or what king of action to do during a video content.
 * All this things can be handled using the cuepoint files.
 */
@XmlRootElement(name="MSubtitle") 
@XmlType(name="MSubtitle")
//#SWG#@ApiModel(description = """""")
class MSubtitle extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * the http url where the cue point file is saved. This information is necessary
	 * for a player that should play the specific content.
	 */
	//#SWG#@ApiModelProperty(value = """the http url where the cue point file is saved. This information is necessary for a player that should play the specific content.""" ,required = true)
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

}