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
 * possible sourceType -> targetType combinations:
 * USERS -> CONTENTS
 * CONTENTS -> USERS
 */
@XmlRootElement(name="MBehaviorEngineConfiguration") 
@XmlType(name="MBehaviorEngineConfiguration")
//#SWG#@ApiModel(description = """possible sourceType -> targetType combinations:
//#SWGNL#USERS -> CONTENTS
//#SWGNL#CONTENTS -> USERS""")
class MBehaviorEngineConfiguration extends MIEngineConfiguration with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sourceType: MEEngineEntityType =_
	def withsourceType(p:MEEngineEntityType):this.type ={ 	this.sourceType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var targetType: MEEngineEntityType =_
	def withtargetType(p:MEEngineEntityType):this.type ={ 	this.targetType = p; 	this }

	/**
	 * position inside the tree level. Used to define a custom order
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thresholds: MBehaviorThresholdConfiguration =_
	def withthresholds(p:MBehaviorThresholdConfiguration):this.type ={ 	this.thresholds = p; 	this }

	/**
	 * Available only for contentTypes:
	 * OTHER,AUDIO,VIDEO,PAGELET
	 */
	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contentConfiguration: MContentConf =_
	def withcontentConfiguration(p:MContentConf):this.type ={ 	this.contentConfiguration = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var userConfiguration: MUserConf =_
	def withuserConfiguration(p:MUserConf):this.type ={ 	this.userConfiguration = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var workingRange: MWorkingRange =_
	def withworkingRange(p:MWorkingRange):this.type ={ 	this.workingRange = p; 	this }

	/**
	 * works only on the given root itagIds.
	 */
	//#SWG#@ApiModelProperty(value = """works only on the given root itagIds.""")
	@BeanProperty 
	var itagsOnly: List[String] = new ArrayList[String]
	def withitagsOnly(p:List[String]):this.type ={ 	this.itagsOnly = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(thresholds).forall(_.isValid()) &&
			Option(contentConfiguration).forall(_.isValid()) &&
			Option(userConfiguration).forall(_.isValid()) &&
			Option(workingRange).forall(_.isValid()) 
	}

}