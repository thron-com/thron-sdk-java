package it.newvision.nvp.xpackager.services.model.repository
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MAwsCredentials") 
@XmlType(name="MAwsCredentials")
//#SWG#@ApiModel(description = """""")
class MAwsCredentials extends Serializable {

	/**
	 * You must include the security token in your request by adding the x-amz-
	 * security-token header
	 */
	//#SWG#@ApiModelProperty(value = """You must include the security token in your request by adding the x-amz-security-token header""")
	@BeanProperty 
	var sessionToken: String =_
	def withsessionToken(p:String):this.type ={ 	this.sessionToken = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var accessKeyId: String =_
	def withaccessKeyId(p:String):this.type ={ 	this.accessKeyId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var secretAccessKey: String =_
	def withsecretAccessKey(p:String):this.type ={ 	this.secretAccessKey = p; 	this }

}