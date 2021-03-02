package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MELinkType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentLinked") 
@XmlType(name="MContentLinked")
//#SWG#@ApiModel(description = """""")
class MContentLinked extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var linkType: MELinkType =_
	def withlinkType(p:MELinkType):this.type ={ 	this.linkType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var position: Integer =_
	def withposition(p:Integer):this.type ={ 	this.position = p; 	this }

}