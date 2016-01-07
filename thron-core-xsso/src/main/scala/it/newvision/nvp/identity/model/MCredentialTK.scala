package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCredentialTK") 
@XmlType(name="MCredentialTK")
//#SWG#@ApiModel(description = """""")
class MCredentialTK extends MCredential with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var token: String =_
	def withtoken(p:String):MCredentialTK ={ 	this.token = p; 	this }

}