package com.thron.intelligence.services.model.engine
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MIEngineSummary") 
@XmlType(name="MIEngineSummary")
//#SWG#@ApiModel(description = """""")
class MIEngineSummary extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var semanticActive: Boolean =_
	def withsemanticActive(p:Boolean):this.type ={ 	this.semanticActive = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var behaviorActive: Boolean =_
	def withbehaviorActive(p:Boolean):this.type ={ 	this.behaviorActive = p; 	this }

}