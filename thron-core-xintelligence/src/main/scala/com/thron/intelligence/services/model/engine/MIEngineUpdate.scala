package com.thron.intelligence.services.model.engine
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.engine.MBehaviorEngineConfiguration
import com.thron.intelligence.model.engine.MSemanticEngineConfiguration
import com.thron.intelligence.services.model.common.MUpdater

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Empty attributes are not updated in the platform.
 * You cannot update a single element of an array or a complex attribute, all of
 * its elements must be included, otherwise they will be overwritten. To remove a
 * specific attribute instead, you will have to include it within the "patch"
 * parameter, as illustrated in the model description.
 */
@XmlRootElement(name="MIEngineUpdate") 
@XmlType(name="MIEngineUpdate")
//#SWG#@ApiModel(description = """Empty attributes are not updated in the platform.
//#SWGNL#You cannot update a single element of an array or a complex attribute, all of its elements must be included, otherwise they will be overwritten. To remove a specific attribute instead, you will have to include it within the "patch" parameter, as illustrated in the model description.""")
class MIEngineUpdate extends MUpdater with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var behaviorConfiguration: MBehaviorEngineConfiguration =_
	def withbehaviorConfiguration(p:MBehaviorEngineConfiguration):MIEngineUpdate ={ 	this.behaviorConfiguration = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var semanticConfiguration: MSemanticEngineConfiguration =_
	def withsemanticConfiguration(p:MSemanticEngineConfiguration):MIEngineUpdate ={ 	this.semanticConfiguration = p; 	this }

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