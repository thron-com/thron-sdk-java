package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGetQuotaUsage") 
@XmlType(name="MResponseGetQuotaUsage")
//#SWG#@ApiModel(description = """""")
class MResponseGetQuotaUsage extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userQuota: List[MUserQuota] = new ArrayList[MUserQuota]
	def withuserQuota(p:List[MUserQuota]):MResponseGetQuotaUsage ={ 	this.userQuota = p; 	this }

}