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
@XmlRootElement(name="MResponseUserFindByProperties") 
@XmlType(name="MResponseUserFindByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseUserFindByProperties extends MResponseUser with Serializable  {

	/**
	 * return the user credential without the password information, for securityreason.
	 */
	//#SWG#@ApiModelProperty(value = """return the user credential without the password information, for securityreason.""")
	@BeanProperty 
	var userDetails: List[MUserCredential] = new ArrayList[MUserCredential]
	def withuserDetails(p:List[MUserCredential]):this.type ={ 	this.userDetails = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}