package com.thron.intelligence.services.model.itag.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.tag.MITagDefinition

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSyncFullExportITagDefinitionResult") 
@XmlType(name="MSyncFullExportITagDefinitionResult")
//#SWG#@ApiModel(description = """""")
class MSyncFullExportITagDefinitionResult extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var classificationId: String =_
	def withclassificationId(p:String):this.type ={ 	this.classificationId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var itagDefinition: MITagDefinition =_
	def withitagDefinition(p:MITagDefinition):this.type ={ 	this.itagDefinition = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var referenceId: String =_
	def withreferenceId(p:String):this.type ={ 	this.referenceId = p; 	this }

}