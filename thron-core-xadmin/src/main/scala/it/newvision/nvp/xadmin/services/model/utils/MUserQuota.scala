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
@XmlRootElement(name="MUserQuota") 
@XmlType(name="MUserQuota")
//#SWG#@ApiModel(description = """""")
class MUserQuota extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var userId: String =_
	def withuserId(p:String):MUserQuota ={ 	this.userId = p; 	this }

	/**
	 * Used in presentation. Can be the user full name
	 */
	//#SWG#@ApiModelProperty(value = """Used in presentation. Can be the user full name""")
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):MUserQuota ={ 	this.displayName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var usedRepositorySpace: Long =_
	def withusedRepositorySpace(p:Long):MUserQuota ={ 	this.usedRepositorySpace = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var usedCdnSpace: Long =_
	def withusedCdnSpace(p:Long):MUserQuota ={ 	this.usedCdnSpace = p; 	this }

	/**
	 * the total amount of quota reserved to the user (in MB). 
	 */
	//#SWG#@ApiModelProperty(value = """the total amount of quota reserved to the user (in MB). """ ,required = true)
	@BeanProperty 
	var userQuota: Long =_
	def withuserQuota(p:Long):MUserQuota ={ 	this.userQuota = p; 	this }

}