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
@XmlRootElement(name="MPublishParams") 
@XmlType(name="MPublishParams")
//#SWG#@ApiModel(description = """""")
class MPublishParams extends Serializable {

	/**
	 * VIDEO, AUDIO, IMAGE, DOCUMENT, PLAYLIST, PAGELET
	 */
	//#SWG#@ApiModelProperty(value = """VIDEO, AUDIO, IMAGE, DOCUMENT, PLAYLIST, PAGELET""" ,required = true)
	@BeanProperty 
	var contentType: MEContentType =_
	def withcontentType(p:MEContentType):this.type ={ 	this.contentType = p; 	this }

	/**
	 * Optional.
	 * The Id of the profile  to be used for publishing the content. If empty the
	 * default profile will be used
	 */
	//#SWG#@ApiModelProperty(value = """Optional. 
	//#SWGNL#The Id of the profile  to be used for publishing the content. If empty the default profile will be used""")
	@BeanProperty 
	var profileId: String =_
	def withprofileId(p:String):this.type ={ 	this.profileId = p; 	this }

	/**
	 * Content basic information such as name and description in a specific locale. If
	 * content name is not provided, the platform will automatically assign as content
	 * name the source file name, extension excluded.
	 */
	//#SWG#@ApiModelProperty(value = """Content basic information such as name and description in a specific locale. If content name is not provided, the platform will automatically assign as content name the source file name, extension excluded.""" ,required = true)
	@BeanProperty 
	var contentOpt: MContentOpt =_
	def withcontentOpt(p:MContentOpt):this.type ={ 	this.contentOpt = p; 	this }

	/**
	 * content source.
	 */
	//#SWG#@ApiModelProperty(value = """content source.""")
	@BeanProperty 
	var sources: List[MSourceOpt] = new ArrayList[MSourceOpt]
	def withsources(p:List[MSourceOpt]):this.type ={ 	this.sources = p; 	this }

	/**
	 * Optional.
	 * Used to drive the playlist ingestion
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#Used to drive the playlist ingestion""")
	@BeanProperty 
	var playlistOpt: MPlaylistOpt =_
	def withplaylistOpt(p:MPlaylistOpt):this.type ={ 	this.playlistOpt = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import scala.collection.JavaConversions._
		if(Option(contentType).isEmpty) throw new IllegalArgumentException("missing contentType parameter")
		if(Option(contentOpt).isEmpty) throw new IllegalArgumentException("missing contentOpt parameter")
		contentOpt.validate()
		if(!Seq(MEContentType.AUDIO,MEContentType.VIDEO,MEContentType.IMAGE,MEContentType.OTHER,
			MEContentType.PLAYLIST,MEContentType.PAGELET).contains(contentType)) throw new IllegalArgumentException(s"$contentType is not accepted")
		contentType match{
			case MEContentType.PLAYLIST =>
				if(Option(playlistOpt).isEmpty) throw new IllegalArgumentException("missing playlistOpt parameter")
				if(Option(sources).isDefined)	throw new IllegalArgumentException("sources must be empty if playlistOpt is defined")
				playlistOpt.validate()
			case _=> 
				if(!(Option(sources).isDefined && sources.size()==1 && Option(playlistOpt).isEmpty))
					throw new IllegalArgumentException("sources must be defined and have one element. playlistOpt must be empty.") 
				sources.head.validate()
		}
	}

}