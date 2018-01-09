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

	/**
	 * The sensitivity of the engine to the passing of time
	 */
	//#SWG#@ApiModelProperty(value = """The sensitivity of the engine to the passing of time""" ,required = true)
	@BeanProperty 
	var timeDecaySensitivity: Double  = 3.0
	def withtimeDecaySensitivity(p:Double):this.type ={ 	this.timeDecaySensitivity = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(timeDecaySensitivity).isDefined
	}

}