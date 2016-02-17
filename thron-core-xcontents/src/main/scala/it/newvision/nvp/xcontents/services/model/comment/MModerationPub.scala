package it.newvision.nvp.xcontents.services.model.comment
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MEModerationStatus

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The prettyId is used to provide a user-readable identification, and can be used
 * in the findByProperties service to retrieve the object in the system.
 * The prettyId is basically used for WebTv where the user need a readable url
 */
@XmlRootElement(name="MModerationPub") 
@XmlType(name="MModerationPub")
//#SWG#@ApiModel(description = """The prettyId is used to provide a user-readable identification, and can be used in the findByProperties service to retrieve the object in the system.
//#SWGNL#The prettyId is basically used for WebTv where the user need a readable url""")
class MModerationPub extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var status: MEModerationStatus =_
	def withstatus(p:MEModerationStatus):this.type ={ 	this.status = p; 	this }

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
	var acceptReportAbuse: Boolean =_
	def withacceptReportAbuse(p:Boolean):this.type ={ 	this.acceptReportAbuse = p; 	this }

}