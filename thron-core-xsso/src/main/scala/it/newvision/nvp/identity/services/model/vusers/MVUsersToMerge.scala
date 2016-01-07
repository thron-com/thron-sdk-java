package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MVUser

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MVUsersToMerge") 
@XmlType(name="MVUsersToMerge")
//#SWG#@ApiModel(description = """""")
class MVUsersToMerge extends Serializable {

	/**
	 * return the vuser detail without the password information, for security reason.
	 */
	//#SWG#@ApiModelProperty(value = """return the vuser detail without the password information, for security reason.""")
	@BeanProperty 
	var userDetails: List[MVUser] = new ArrayList[MVUser]
	def withuserDetails(p:List[MVUser]):MVUsersToMerge ={ 	this.userDetails = p; 	this }

}