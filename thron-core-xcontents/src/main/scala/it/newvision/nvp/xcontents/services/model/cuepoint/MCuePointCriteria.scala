package it.newvision.nvp.xcontents.services.model.cuepoint
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MECuePointType
import it.newvision.nvp.xcontents.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * main class used to define the Cue Point search criteria.
 * Each attribute is a specific search criteria. If an attribute is not defined
 * (null) the search criteria is not applied. The combination of two or more
 * search criteria are with AND clause.
 * For example CuePointCriteria.cuepointType = "GENERIC" AND CuePointCriteria.
 * draft =false search all contents with cuepointtype like "GENERIC" and not draft.
 * The attributes with [0..*] cardinality use OR clause.
 * For example CuePointCriteria.cuepointType = ["GENERIC","SUBTITLE"] search all
 * cue points with cuepointType equals GENERIC OR SUBTITLE.
 */
@XmlRootElement(name="MCuePointCriteria") 
@XmlType(name="MCuePointCriteria")
//#SWG#@ApiModel(description = """main class used to define the Cue Point search criteria.
//#SWGNL#Each attribute is a specific search criteria. If an attribute is not defined (null) the search criteria is not applied. The combination of two or more search criteria are with AND clause. 
//#SWGNL#For example CuePointCriteria.cuepointType = "GENERIC" AND CuePointCriteria.draft =false search all contents with cuepointtype like "GENERIC" and not draft. The attributes with [0..*] cardinality use OR clause.
//#SWGNL#For example CuePointCriteria.cuepointType = ["GENERIC","SUBTITLE"] search all cue points with cuepointType equals GENERIC OR SUBTITLE.""")
class MCuePointCriteria extends Serializable {

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
	var actions: List[String] = new ArrayList[String]
	def withactions(p:List[String]):this.type ={ 	this.actions = p; 	this }

	/**
	 * used to group the cue point in different classes. Optional
	 */
	//#SWG#@ApiModelProperty(value = """used to group the cue point in different classes. Optional""")
	@BeanProperty 
	var cuePointGroup: String =_
	def withcuePointGroup(p:String):this.type ={ 	this.cuePointGroup = p; 	this }

	/**
	 * list of Cue Point Ids
	 */
	//#SWG#@ApiModelProperty(value = """list of Cue Point Ids""")
	@BeanProperty 
	var cuePointIds: List[String] = new ArrayList[String]
	def withcuePointIds(p:List[String]):this.type ={ 	this.cuePointIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var cuePointTypes: List[MECuePointType] = new ArrayList[MECuePointType]
	def withcuePointTypes(p:List[MECuePointType]):this.type ={ 	this.cuePointTypes = p; 	this }

	/**
	 * used to mark a cue point as draft. Draft cue point could not be used in
	 * frontend.
	 */
	//#SWG#@ApiModelProperty(value = """used to mark a cue point as draft. Draft cue point could not be used in frontend.""")
	@BeanProperty 
	var draft: Boolean =_
	def withdraft(p:Boolean):this.type ={ 	this.draft = p; 	this }

	/**
	 * time in milliseconds
	 */
	//#SWG#@ApiModelProperty(value = """time in milliseconds""")
	@BeanProperty 
	var endTime: Integer =_
	def withendTime(p:Integer):this.type ={ 	this.endTime = p; 	this }

	/**
	 * search cuepoints with specific custom metadatas.
	 * metadata.name: exact match (case sensitive)
	 * metadata.value: search text as Regex (case insensitive)
	 * <ul>
	 * 	<li>use \Q<text to search>\E for simple text search (quoted text)    </li>
	 * </ul>
	 * <ul>
	 * 	<li>use ^<quoted text>$ to exactly match the quoted text in the field.
	 * (example: ^\Qmyvalue\E$).</li>
	 * </ul>
	 * <ul>
	 * 	<li>metadata.locale: search as text match (case sensitive)</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """search cuepoints with specific custom metadatas.
	//#SWGNL#metadata.name: exact match (case sensitive)
	//#SWGNL#metadata.value: search text as Regex (case insensitive)
	//#SWGNL#<ul>
	//#SWGNL#	<li>use \Q<text to search>\E for simple text search (quoted text)    </li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>use ^<quoted text>$ to exactly match the quoted text in the field. (example: ^\Qmyvalue\E$).</li>
	//#SWGNL#</ul>
	//#SWGNL#<ul>
	//#SWGNL#	<li>metadata.locale: search as text match (case sensitive)</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var metadata: List[MMetadata] = new ArrayList[MMetadata]
	def withmetadata(p:List[MMetadata]):this.type ={ 	this.metadata = p; 	this }

	/**
	 * time in milliseconds.
	 */
	//#SWG#@ApiModelProperty(value = """time in milliseconds.""")
	@BeanProperty 
	var startTime: Integer =_
	def withstartTime(p:Integer):this.type ={ 	this.startTime = p; 	this }

	/**
	 * used to mark a Cue Point for a specific user
	 */
	//#SWG#@ApiModelProperty(value = """used to mark a Cue Point for a specific user""")
	@BeanProperty 
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

}