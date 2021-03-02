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
@XmlRootElement(name="MCypherKey") 
@XmlType(name="MCypherKey")
//#SWG#@ApiModel(description = """""")
class MCypherKey extends Serializable {

	/**
	 * Primary encryption key. During rolling process is the key that must be changed.
	 */
	//#SWG#@ApiModelProperty(value = """Primary encryption key. During rolling process is the key that must be changed.""" ,required = true)
	@BeanProperty 
	var encryption: String =_
	def withencryption(p:String):this.type ={ 	this.encryption = p; 	this }

	/**
	 * Optional. This key is the 'transition' key during rolling process. At the end
	 * of process, this key can be removed.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. This key is the 'transition' key during rolling process. At the end of process, this key can be removed.""")
	@BeanProperty 
	var transition: String =_
	def withtransition(p:String):this.type ={ 	this.transition = p; 	this }

}