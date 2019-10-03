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
 * approval:70,
 * suggest: 30
 * }
 */
@XmlRootElement(name="MSemanticThresholdConfiguration") 
@XmlType(name="MSemanticThresholdConfiguration")
//#SWG#@ApiModel(description = """Threshold examples:
//#SWGNL#values in percentage
//#SWGNL#{
//#SWGNL#approval:70,
//#SWGNL#suggest: 30
//#SWGNL#}""")
class MSemanticThresholdConfiguration extends Serializable {

	/**
	 * The minimum percentage value for approval.
	 * Example: approval = 40 means ]40..100] range with lower bound limit excluded
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>>= suggest</li>
	 * 	<li><=100</li>
	 * 	<li>threshold.value excluded</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """The minimum percentage value for approval.
	//#SWGNL#Example: approval = 40 means ]40..100] range with lower bound limit excluded
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>>= suggest</li>
	//#SWGNL#	<li><=100</li>
	//#SWGNL#	<li>threshold.value excluded</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var approval: MThresholdValue =_
	def withapproval(p:MThresholdValue):this.type ={ 	this.approval = p; 	this }

	/**
	 * The minimum percentage value for suggestion.
	 * Example: suggest= 40 means [ 40..approval ]  range with upper bound limit
	 * included
	 * 
	 * Constraints:
	 * <ul>
	 * 	<li>>= 0  </li>
	 * 	<li><= approval</li>
	 * 	<li>threshold.value included</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """The minimum percentage value for suggestion.
	//#SWGNL#Example: suggest= 40 means [ 40..approval ]  range with upper bound limit included
	//#SWGNL#
	//#SWGNL#Constraints:
	//#SWGNL#<ul>
	//#SWGNL#	<li>>= 0  </li>
	//#SWGNL#	<li><= approval</li>
	//#SWGNL#	<li>threshold.value included</li>
	//#SWGNL#</ul>""" ,required = true)
	@BeanProperty 
	var suggest: MThresholdValue =_
	def withsuggest(p:MThresholdValue):this.type ={ 	this.suggest = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(suggest).exists(_.value >= 0) &&
		Option(approval).exists(a=> a.value >= 0 && a.value >= suggest.value && a.value <=100)
	}

}