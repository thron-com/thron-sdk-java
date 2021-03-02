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
@XmlRootElement(name="MCustomDomain") 
@XmlType(name="MCustomDomain")
//#SWG#@ApiModel(description = """""")
class MCustomDomain extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var cdnDomain: String =_
	def withcdnDomain(p:String):this.type ={ 	this.cdnDomain = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var clientFacingDomain: String =_
	def withclientFacingDomain(p:String):this.type ={ 	this.clientFacingDomain = p; 	this }

}