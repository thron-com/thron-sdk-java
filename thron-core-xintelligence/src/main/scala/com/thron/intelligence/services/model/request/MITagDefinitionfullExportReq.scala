package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.itag.sync.MSyncFullExportITagDefinitionCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JITagDefinition.fullExport
 */
@XmlRootElement(name="MITagDefinitionfullExportReq")
@XmlType(name="MITagDefinitionfullExportReq")
//#SWG#@ApiModel(description = "Request message for service JITagDefinition.fullExport")
class MITagDefinitionfullExportReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MSyncFullExportITagDefinitionCriteria =_
	def withcriteria(p:MSyncFullExportITagDefinitionCriteria):this.type ={ 	this.criteria = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var pageSize: Integer =_
	def withpageSize(p:Integer):this.type ={ 	this.pageSize = p; 	this }

}