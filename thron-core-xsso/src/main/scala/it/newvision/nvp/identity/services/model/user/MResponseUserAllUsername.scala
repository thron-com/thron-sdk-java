package it.newvision.nvp.identity.services.model.user
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseUserAllUsername") 
@XmlType(name="MResponseUserAllUsername")
//#SWG#@ApiModel(description = """""")
class MResponseUserAllUsername extends MResponseUser with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var username: List[MUserSummary] = new ArrayList[MUserSummary]
	def withusername(p:List[MUserSummary]):this.type ={ 	this.username = p; 	this }

	/**
	 * Removed users summary
	 */
	//#SWG#@ApiModelProperty(value = """Removed users summary""")
	@BeanProperty 
	var removedUsername: List[MUserSummary] = new ArrayList[MUserSummary]
	def withremovedUsername(p:List[MUserSummary]):this.type ={ 	this.removedUsername = p; 	this }

}