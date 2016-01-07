package it.newvision.nvp.identity.services.model.request
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
 * Request message for service JSysUserManager.detail
 */
@XmlRootElement(name="MSysUserManagerdetailReq")
@XmlType(name="MSysUserManagerdetailReq")
//#SWG#@ApiModel(description = "Request message for service JSysUserManager.detail")
class MSysUserManagerdetailReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MSysUserManagerdetailReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MSysUserManagerdetailReq ={ 	this.username = p; 	this }

	/**
	 * used to filer the user capabilities by solution (PLAY,VIEW,TALK,MOVE)
	 */
	//#SWG#@ApiModelProperty(value = """used to filer the user capabilities by solution (PLAY,VIEW,TALK,MOVE)""", required = true)
	@BeanProperty
	var solutionId: String =_
	def withsolutionId(p:String):MSysUserManagerdetailReq ={ 	this.solutionId = p; 	this }

}