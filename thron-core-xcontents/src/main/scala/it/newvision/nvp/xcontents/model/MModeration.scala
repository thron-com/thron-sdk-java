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
 * The prettyId is used to provide a user-readable identification, and can be used
 * in the findByProperties service to retrieve the object in the system.
 * The prettyId is basically used for WebTv where the user need a readable url
 */
@XmlRootElement(name="MModeration") 
@XmlType(name="MModeration")
//#SWG#@ApiModel(description = """The prettyId is used to provide a user-readable identification, and can be used in the findByProperties service to retrieve the object in the system.
//#SWGNL#The prettyId is basically used for WebTv where the user need a readable url""")
class MModeration extends Serializable {

	/**
	 * Date of the last moderation update
	 */
	//#SWG#@ApiModelProperty(value = """Date of the last moderation update""")
	@BeanProperty 
	var lastUpdate: Date =_
	def withlastUpdate(p:Date):this.type ={ 	this.lastUpdate = p; 	this }

	/**
	 * The userId of the moderator
	 */
	//#SWG#@ApiModelProperty(value = """The userId of the moderator""")
	@BeanProperty 
	var moderatorId: String =_
	def withmoderatorId(p:String):this.type ={ 	this.moderatorId = p; 	this }

	/**
	 * Some notes reported by the moderator
	 */
	//#SWG#@ApiModelProperty(value = """Some notes reported by the moderator""" ,required = true)
	@BeanProperty 
	var moderatorNotes: String =_
	def withmoderatorNotes(p:String):this.type ={ 	this.moderatorNotes = p; 	this }

	/**
	 * the abuse report notified by a user.
	 */
	//#SWG#@ApiModelProperty(value = """the abuse report notified by a user.""")
	@BeanProperty 
	var reportAbuse: MAbuseReport =_
	def withreportAbuse(p:MAbuseReport):this.type ={ 	this.reportAbuse = p; 	this }

	/**
	 * Used to highlight a comment for the moderator
	 */
	//#SWG#@ApiModelProperty(value = """Used to highlight a comment for the moderator""" ,required = true)
	@BeanProperty 
	var starred: Boolean  = false
	def withstarred(p:Boolean):this.type ={ 	this.starred = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEModerationStatus  = MEModerationStatus.PENDING
	def withstatus(p:MEModerationStatus):this.type ={ 	this.status = p; 	this }

	/**
	 * @param status : MEModerationStatus
	 * @return 
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(status: MEModerationStatus){
		this()
		this.lastUpdate = new Date
	}

}