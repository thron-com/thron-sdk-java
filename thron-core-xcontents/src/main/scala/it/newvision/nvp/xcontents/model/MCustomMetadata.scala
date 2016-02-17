package it.newvision.nvp.xcontents.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MCustomMetadata") 
@XmlType(name="MCustomMetadata")
//#SWG#@ApiModel(description = """""")
class MCustomMetadata extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var keyLabels: List[MCustomMetadataKeyLabel] = new ArrayList[MCustomMetadataKeyLabel]
	def withkeyLabels(p:List[MCustomMetadataKeyLabel]):this.type ={ 	this.keyLabels = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var properties: MCustomMetadataProperties  = new MCustomMetadataProperties
	def withproperties(p:MCustomMetadataProperties):this.type ={ 	this.properties = p; 	this }

}