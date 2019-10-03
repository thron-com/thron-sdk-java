package it.newvision.nvp.xcontents.model
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
 * Cue Points are used to add extra information to the Content Class and are
 * usually used by a player to show extra information during the show, like
 * chapters, subtitles, or custom action that the player can execute.
 */
@XmlRootElement(name="MCuePoint") 
@XmlType(name="MCuePoint")
//#SWG#@ApiModel(description = """Cue Points are used to add extra information to the Content Class and are usually used by a player to show extra information during the show, like chapters, subtitles, or custom action that the player can execute.""")
class MCuePoint extends Serializable {

	/**
	 * the cue point action key.
	 * Available action keys used with GENERIC Cue Points are:
	 * <ul>
	 * 	<li>VIDEOSTART</li>
	 * 	<li>VIDEOSTOP</li>
	 * 	<li>VIDEOSEEK</li>
	 * 	<li>NEWOBJECT</li>
	 * 	<li>DELOBJECT</li>
	 * 	<li>TWEENOBJECT</li>
	 * 	<li>BROWSE</li>
	 * 	<li>SHOWTEXT</li>
	 * 	<li>JSCRIPT</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """the cue point action key.
	//#SWGNL#Available action keys used with GENERIC Cue Points are:
	//#SWGNL#<ul>
	//#SWGNL#	<li>VIDEOSTART</li>
	//#SWGNL#	<li>VIDEOSTOP</li>
	//#SWGNL#	<li>VIDEOSEEK</li>
	//#SWGNL#	<li>NEWOBJECT</li>
	//#SWGNL#	<li>DELOBJECT</li>
	//#SWGNL#	<li>TWEENOBJECT</li>
	//#SWGNL#	<li>BROWSE</li>
	//#SWGNL#	<li>SHOWTEXT</li>
	//#SWGNL#	<li>JSCRIPT</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var action: String =_
	def withaction(p:String):this.type ={ 	this.action = p; 	this }

	/**
	 * used to group the cue point in different classes. Optional
	 */
	//#SWG#@ApiModelProperty(value = """used to group the cue point in different classes. Optional""")
	@BeanProperty 
	var cuePointGroup: String =_
	def withcuePointGroup(p:String):this.type ={ 	this.cuePointGroup = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var cuePointType: MECuePointType =_
	def withcuePointType(p:MECuePointType):this.type ={ 	this.cuePointType = p; 	this }

	/**
	 * custom extra data parameter. schema less.
	 */
	//#SWG#@ApiModelProperty(value = """custom extra data parameter. schema less.""")
	@BeanProperty 
	var customData: String =_
	def withcustomData(p:String):this.type ={ 	this.customData = p; 	this }

	/**
	 * used to mark a cue point as draft. Draft cue point could not be used in
	 * frontend.
	 */
	//#SWG#@ApiModelProperty(value = """used to mark a cue point as draft. Draft cue point could not be used in frontend.""")
	@BeanProperty 
	var draft: Boolean  = false
	def withdraft(p:Boolean):this.type ={ 	this.draft = p; 	this }

	/**
	 * time in milliseconds from the start of the content (video/audio)
	 */
	//#SWG#@ApiModelProperty(value = """time in milliseconds from the start of the content (video/audio)""")
	@BeanProperty 
	var endTime: Long =_
	def withendTime(p:Long):this.type ={ 	this.endTime = p; 	this }

	/**
	 * primary key, automatically generated by the platform
	 */
	//#SWG#@ApiModelProperty(value = """primary key, automatically generated by the platform""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * List of custom metadata linked to the cuepoint.
	 */
	//#SWG#@ApiModelProperty(value = """List of custom metadata linked to the cuepoint.""")
	@BeanProperty 
	var metadatas: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadatas(p:List[MMetadata]):this.type ={ 	this.metadatas = p; 	this }

	/**
	 * time in milliseconds from the start of the content (video/audio)
	 */
	//#SWG#@ApiModelProperty(value = """time in milliseconds from the start of the content (video/audio)""")
	@BeanProperty 
	var startTime: Long =_
	def withstartTime(p:Long):this.type ={ 	this.startTime = p; 	this }

	/**
	 * used to mark a CuePoint for a specific user
	 */
	//#SWG#@ApiModelProperty(value = """used to mark a CuePoint for a specific user""")
	@BeanProperty 
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

}