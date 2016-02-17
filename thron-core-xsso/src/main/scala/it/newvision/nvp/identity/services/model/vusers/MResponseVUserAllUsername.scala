package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.user.MUserSummary

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseVUserAllUsername") 
@XmlType(name="MResponseVUserAllUsername")
//#SWG#@ApiModel(description = """""")
class MResponseVUserAllUsername extends MResponseVUser with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var username: List[MUserSummary] = new ArrayList[MUserSummary]
	def withusername(p:List[MUserSummary]):this.type ={ 	this.username = p; 	this }

}