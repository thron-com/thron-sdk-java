package it.newvision.nvp.xcontents.services.model.playlist
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * is the playlist content with the linked contents filled.
 * The linked contents have the full description for the specified locale.
 */
@XmlRootElement(name="MResponsePlayListDetail") 
@XmlType(name="MResponsePlayListDetail")
//#SWG#@ApiModel(description = """is the playlist content with the linked contents filled. 
//#SWGNL#The linked contents have the full description for the specified locale.""")
class MResponsePlayListDetail extends MResponsePlayList with Serializable  {

	/**
	 * specifies that the following playlist is based on a specific content type (all
	 * elements of the playlist have the same content type). match the EContentType in
	 * xcontents
	 */
	//#SWG#@ApiModelProperty(value = """specifies that the following playlist is based on a specific content type (all elements of the playlist have the same content type). match the EContentType in xcontents""")
	@BeanProperty 
	var playlistTemplate: String =_
	def withplaylistTemplate(p:String):this.type ={ 	this.playlistTemplate = p; 	this }

	/**
	 * The playlist content information, with locale description, metadata and
	 * linkedcontents (playlist elements).
	 */
	//#SWG#@ApiModelProperty(value = """The playlist content information, with locale description, metadata and linkedcontents (playlist elements).""" ,required = true)
	@BeanProperty 
	var content: MContent =_
	def withcontent(p:MContent):this.type ={ 	this.content = p; 	this }

}