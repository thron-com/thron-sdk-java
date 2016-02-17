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
/**
 * The Semantic Engine works only on contents
 */
@XmlRootElement(name="MSemanticEngineConfiguration") 
@XmlType(name="MSemanticEngineConfiguration")
//#SWG#@ApiModel(description = """The Semantic Engine works only on contents""")
class MSemanticEngineConfiguration extends MIEngineConfiguration with Serializable  {

	/**
	 * position inside the tree level. Used to define a custom order
	 */
	//#SWG#@ApiModelProperty(value = """position inside the tree level. Used to define a custom order""")
	@BeanProperty 
	var thresholds: MSemanticThresholdConfiguration =_
	def withthresholds(p:MSemanticThresholdConfiguration):this.type ={ 	this.thresholds = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contentConfiguration: MContentConf =_
	def withcontentConfiguration(p:MContentConf):this.type ={ 	this.contentConfiguration = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(thresholds).forall(_.isValid()) &&
			Option(contentConfiguration).forall(_.isValid()) 
	}

}