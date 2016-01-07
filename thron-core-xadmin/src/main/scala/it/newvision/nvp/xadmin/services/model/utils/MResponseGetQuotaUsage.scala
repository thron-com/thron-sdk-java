package it.newvision.nvp.xadmin.services.model.utils
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
class MResponseGetQuotaUsage extends MResponseDashboard with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var users: List[MUserQuota] = new ArrayList[MUserQuota]
	def withusers(p:List[MUserQuota]):MResponseGetQuotaUsage ={ 	this.users = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseGetQuotaUsage ={ 	this.totalResults = p; 	this }

}