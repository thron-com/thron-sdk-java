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
 * Threshold examples:
 * values in percentage
 * {
 * minimumValue:100 (visits)
 * approval:70,
 * removal: 50
 * }
 */
@XmlRootElement(name="MBehaviorThresholdConfiguration") 
@XmlType(name="MBehaviorThresholdConfiguration")
//#SWG#@ApiModel(description = """Threshold examples:
//#SWGNL#values in percentage
//#SWGNL#{
//#SWGNL#minimumValue:100 (visits)
//#SWGNL#approval:70,
//#SWGNL#removal: 50
//#SWGNL#}""")
class MBehaviorThresholdConfiguration extends Serializable {

	/**
	 * Minimum value for suggestion, the absolute value.
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>> 0    </li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """Minimum value for suggestion, the absolute value.
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>> 0    </li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var minimumValue: Integer =_
	def withminimumValue(p:Integer):MBehaviorThresholdConfiguration ={ 	this.minimumValue = p; 	this }

	/**
	 * The minimum percentage value for approval.
	 * Example: approval = 40 means ]40..100] range with lower bound limit excluded
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>>= removal</li>
	 * 	<li><=100</li>
	 * 	<li>threshold.value excluded</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """The minimum percentage value for approval.
	//#SWGNL#Example: approval = 40 means ]40..100] range with lower bound limit excluded
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>>= removal</li>
	//#SWGNL#	<li><=100</li>
	//#SWGNL#	<li>threshold.value excluded</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var approval: MThresholdValue =_
	def withapproval(p:MThresholdValue):MBehaviorThresholdConfiguration ={ 	this.approval = p; 	this }

	/**
	 * The minimum percentage value for removal.
	 * Example: removal= 40 means [ 0..40 ]  range with upper bound limit included
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>>= 0 </li>
	 * 	<li><= approval</li>
	 * 	<li>threshold.value included</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """The minimum percentage value for removal.
	//#SWGNL#Example: removal= 40 means [ 0..40 ]  range with upper bound limit included
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>>= 0 </li>
	//#SWGNL#	<li><= approval</li>
	//#SWGNL#	<li>threshold.value included</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var removal: MThresholdValue =_
	def withremoval(p:MThresholdValue):MBehaviorThresholdConfiguration ={ 	this.removal = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(approval).exists(a=> a.value >= 0 && a.value <=100) &&
		Option(removal).exists(r=> r.value >= 0 && r.value <= approval.value) &&
		Option(minimumValue).exists(_ > 0)
	}

}