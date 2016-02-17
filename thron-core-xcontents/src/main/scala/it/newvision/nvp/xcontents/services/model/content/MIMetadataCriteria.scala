package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MIMetadataCriteria") 
@XmlType(name="MIMetadataCriteria")
//#SWG#@ApiModel(description = """""")
class MIMetadataCriteria extends Serializable {

	/**
	 * The classification Id
	 */
	//#SWG#@ApiModelProperty(value = """The classification Id""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):this.type ={ 	this.classificationId = p; 	this }

	/**
	 * The MetadataDefinition Key
	 */
	//#SWG#@ApiModelProperty(value = """The MetadataDefinition Key""" ,required = true)
	@BeanProperty 
	var key: String =_
	def withkey(p:String):this.type ={ 	this.key = p; 	this }

	/**
	 * The metadata value (exact match, case sensitive)
	 */
	//#SWG#@ApiModelProperty(value = """The metadata value (exact match, case sensitive)""" ,required = true)
	@BeanProperty 
	var value: String =_
	def withvalue(p:String):this.type ={ 	this.value = p; 	this }

}