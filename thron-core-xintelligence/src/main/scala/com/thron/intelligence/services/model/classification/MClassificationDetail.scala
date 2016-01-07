package com.thron.intelligence.services.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.engine.MIEngineSummary
import com.thron.intelligence.model.classification.MClassification

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MClassificationDetail") 
@XmlType(name="MClassificationDetail")
//#SWG#@ApiModel(description = """""")
class MClassificationDetail extends MClassification with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var engineSummary: MIEngineSummary =_
	def withengineSummary(p:MIEngineSummary):MClassificationDetail ={ 	this.engineSummary = p; 	this }

}