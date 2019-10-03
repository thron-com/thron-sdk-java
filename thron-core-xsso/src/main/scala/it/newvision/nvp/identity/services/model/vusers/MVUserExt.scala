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
@XmlRootElement(name="MVUserExt") 
@XmlType(name="MVUserExt")
//#SWG#@ApiModel(description = """""")
class MVUserExt extends Serializable {

	/**
	 * total number of linked groups for the specific user.
	 */
	//#SWG#@ApiModelProperty(value = """total number of linked groups for the specific user.""" ,required = true)
	@BeanProperty 
	var totalLinkedGroups: Integer  = 0
	def withtotalLinkedGroups(p:Integer):this.type ={ 	this.totalLinkedGroups = p; 	this }

	/**
	 * return the vuser detail without the password information, for security reason.
	 */
	//#SWG#@ApiModelProperty(value = """return the vuser detail without the password information, for security reason.""" ,required = true)
	@BeanProperty 
	var userDetail: MVUser =_
	def withuserDetail(p:MVUser):this.type ={ 	this.userDetail = p; 	this }

}