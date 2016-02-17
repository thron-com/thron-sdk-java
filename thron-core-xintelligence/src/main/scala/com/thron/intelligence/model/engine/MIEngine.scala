package com.thron.intelligence.model.engine
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MIEngine") 
@XmlType(name="MIEngine")
//#SWG#@ApiModel(description = """""")
class MIEngine extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var behaviorConfiguration: MBehaviorEngineConfiguration =_
	def withbehaviorConfiguration(p:MBehaviorEngineConfiguration):this.type ={ 	this.behaviorConfiguration = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var semanticConfiguration: MSemanticEngineConfiguration =_
	def withsemanticConfiguration(p:MSemanticEngineConfiguration):this.type ={ 	this.semanticConfiguration = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(behaviorConfiguration).forall(_.isValid()) &&
			Option(semanticConfiguration).forall(_.isValid())
	}

}