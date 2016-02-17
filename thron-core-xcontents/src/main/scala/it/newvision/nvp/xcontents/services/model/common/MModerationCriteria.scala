package it.newvision.nvp.xcontents.services.model.common
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
 * this class was used to pass the clientId information the services.
 */
@XmlRootElement(name="MModerationCriteria") 
@XmlType(name="MModerationCriteria")
//#SWG#@ApiModel(description = """this class was used to pass the clientId information the services.""")
class MModerationCriteria extends Serializable {

	/**
	 * comments approved or not
	 */
	//#SWG#@ApiModelProperty(value = """comments approved or not""")
	@BeanProperty 
	var moderationStatus: List[MEModerationStatus] = new ArrayList[MEModerationStatus]
	def withmoderationStatus(p:List[MEModerationStatus]):this.type ={ 	this.moderationStatus = p; 	this }

	/**
	 * filtered by moderatorId. Only the entries having the given moderatorId
	 */
	//#SWG#@ApiModelProperty(value = """filtered by moderatorId. Only the entries having the given moderatorId""")
	@BeanProperty 
	var moderatorId: String =_
	def withmoderatorId(p:String):this.type ={ 	this.moderatorId = p; 	this }

	/**
	 * comments marked by moderator as starred
	 */
	//#SWG#@ApiModelProperty(value = """comments marked by moderator as starred""")
	@BeanProperty 
	var starred: Boolean =_
	def withstarred(p:Boolean):this.type ={ 	this.starred = p; 	this }

}