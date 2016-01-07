package it.newvision.nvp.xpublisher.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MLiveEvent") 
@XmlType(name="MLiveEvent")
//#SWG#@ApiModel(description = """""")
class MLiveEvent extends MContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var event: MWowzaEvent =_
	def withevent(p:MWowzaEvent):MLiveEvent ={ 	this.event = p; 	this }

}