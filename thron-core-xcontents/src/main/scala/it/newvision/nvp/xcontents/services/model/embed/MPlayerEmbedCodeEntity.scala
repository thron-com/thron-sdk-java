package it.newvision.nvp.xcontents.services.model.embed
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
 * content or category id
 */
@XmlRootElement(name="MPlayerEmbedCodeEntity") 
@XmlType(name="MPlayerEmbedCodeEntity")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedCodeEntity extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var entityType: MEPlayerEmbedEntityType =_
	def withentityType(p:MEPlayerEmbedEntityType):this.type ={ 	this.entityType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

}