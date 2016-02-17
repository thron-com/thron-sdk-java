package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseVUserFindByProperties") 
@XmlType(name="MResponseVUserFindByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseVUserFindByProperties extends MResponseVUser with Serializable  {

	/**
	 * return the vuser detail without the password information, for security reason.
	 */
	//#SWG#@ApiModelProperty(value = """return the vuser detail without the password information, for security reason.""")
	@BeanProperty 
	var users: List[MVUserExt] = new ArrayList[MVUserExt]
	def withusers(p:List[MVUserExt]):this.type ={ 	this.users = p; 	this }

	/**
	 * total number of users.
	 */
	//#SWG#@ApiModelProperty(value = """total number of users.""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}