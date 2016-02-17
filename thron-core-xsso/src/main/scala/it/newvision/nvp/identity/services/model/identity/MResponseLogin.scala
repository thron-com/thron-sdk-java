package it.newvision.nvp.identity.services.model.identity
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MVUser
import it.newvision.nvp.identity.model.MUsersGroup

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseLogin") 
@XmlType(name="MResponseLogin")
//#SWG#@ApiModel(description = """""")
class MResponseLogin extends MResponseIdentity with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tokenId: String =_
	def withtokenId(p:String):this.type ={ 	this.tokenId = p; 	this }

	/**
	 * return the vuser detail without the password information, for security reason.
	 */
	//#SWG#@ApiModelProperty(value = """return the vuser detail without the password information, for security reason.""")
	@BeanProperty 
	var user: MVUser =_
	def withuser(p:MVUser):this.type ={ 	this.user = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedGroups: List[MUsersGroup] = new ArrayList[MUsersGroup]
	def withlinkedGroups(p:List[MUsersGroup]):this.type ={ 	this.linkedGroups = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}