package it.newvision.nvp.identity.services.model.identity
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSessionCriteria") 
@XmlType(name="MSessionCriteria")
//#SWG#@ApiModel(description = """""")
class MSessionCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var clientIds: List[String] = new ArrayList[String]
	def withclientIds(p:List[String]):MSessionCriteria ={ 	this.clientIds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var onlySuperSessions: Boolean  = false
	def withonlySuperSessions(p:Boolean):MSessionCriteria ={ 	this.onlySuperSessions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tokenIds: List[String] = new ArrayList[String]
	def withtokenIds(p:List[String]):MSessionCriteria ={ 	this.tokenIds = p; 	this }

}