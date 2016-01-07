package it.newvision.nvp.identity.services.model.vusers
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseVUserResetPassword") 
@XmlType(name="MResponseVUserResetPassword")
//#SWG#@ApiModel(description = """""")
class MResponseVUserResetPassword extends MResponseVUser with Serializable  {

	/**
	 * temporary token that can be used with JVuserManager.login
	 */
	//#SWG#@ApiModelProperty(value = """temporary token that can be used with JVuserManager.login""")
	@BeanProperty 
	var tmpToken: String =_
	def withtmpToken(p:String):MResponseVUserResetPassword ={ 	this.tmpToken = p; 	this }

}