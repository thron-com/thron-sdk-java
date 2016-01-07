package it.newvision.nvp.identity.services.model.user
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MUserCredential

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseUserDetail") 
@XmlType(name="MResponseUserDetail")
//#SWG#@ApiModel(description = """""")
class MResponseUserDetail extends MResponseUser with Serializable  {

	/**
	 * return the user credential without the password information, for securityreason.
	 */
	//#SWG#@ApiModelProperty(value = """return the user credential without the password information, for securityreason.""")
	@BeanProperty 
	var userDetail: MUserCredential =_
	def withuserDetail(p:MUserCredential):MResponseUserDetail ={ 	this.userDetail = p; 	this }

}