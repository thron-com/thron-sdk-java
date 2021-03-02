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
@XmlRootElement(name="MTokenProtection") 
@XmlType(name="MTokenProtection")
//#SWG#@ApiModel(description = """""")
class MTokenProtection extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MTokenProtectionContentSettings =_
	def withcontent(p:MTokenProtectionContentSettings):this.type ={ 	this.content = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var cypherKey: MCypherKey =_
	def withcypherKey(p:MCypherKey):this.type ={ 	this.cypherKey = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var state: MTokenProtectionState =_
	def withstate(p:MTokenProtectionState):this.type ={ 	this.state = p; 	this }

}