package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JDashboard.migrateUserStuff
 */
@XmlRootElement(name="MDashboardmigrateUserStuffReq")
@XmlType(name="MDashboardmigrateUserStuffReq")
//#SWG#@ApiModel(description = "Request message for service JDashboard.migrateUserStuff")
class MDashboardmigrateUserStuffReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * the source userId
	 */
	//#SWG#@ApiModelProperty(value = """the source userId""", required = true)
	@BeanProperty
	var userId1: String =_
	def withuserId1(p:String):this.type ={ 	this.userId1 = p; 	this }

	/**
	 * the target userId. 
	 */
	//#SWG#@ApiModelProperty(value = """the target userId. """, required = true)
	@BeanProperty
	var userId2: String =_
	def withuserId2(p:String):this.type ={ 	this.userId2 = p; 	this }

	/**
	 * if true, the userId1 will be removed
	 */
	//#SWG#@ApiModelProperty(value = """if true, the userId1 will be removed""", required = true)
	@BeanProperty
	var removeUserId1: Boolean =_
	def withremoveUserId1(p:Boolean):this.type ={ 	this.removeUserId1 = p; 	this }

}