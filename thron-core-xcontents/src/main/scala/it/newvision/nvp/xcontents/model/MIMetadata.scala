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
@XmlRootElement(name="MIMetadata") 
@XmlType(name="MIMetadata")
//#SWG#@ApiModel(description = """""")
class MIMetadata extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):MIMetadata ={ 	this.classificationId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):MIMetadata ={ 	this.key = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):MIMetadata ={ 	this.value = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var lang: String =_
	def withlang(p:String):MIMetadata ={ 	this.lang = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var metadataDefinitionId: String =_
	def withmetadataDefinitionId(p:String):MIMetadata ={ 	this.metadataDefinitionId = p; 	this }

}