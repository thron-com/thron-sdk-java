package com.thron.intelligence.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MLocalization

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * It 'used to indicate where the classification is applied (which entity). For
 * example a classification can be applied to content or users, and according to
 * the type of relationship (relationType) may have different meanings.
 * Example1:
 * <ul>
 * 	<li>applicableTo = CONTENT     </li>
 * 	<li>relationType = IS     </li>
 * </ul>
 * 
 * <ul>
 * 	<li>applicableTo = USER     </li>
 * 	<li>relationType = INTERESTED   </li>
 * </ul>
 * 
 * Tags and Metadata for this classification are used to classify contents, and
 * users interested in contents
 * 
 * Example2:
 * <ul>
 * 	<li>applicableTo = CONTENT     </li>
 * 	<li>relationType = INTERESTED    </li>
 * </ul>
 * 
 * <ul>
 * 	<li>applicableTo = USER     </li>
 * 	<li>relationType = IS     </li>
 * </ul>
 * 
 * Tags and Metadata for this classification are used to classify users, and
 * contents the users are interested for.
 */
@XmlRootElement(name="MClassificationEntity") 
@XmlType(name="MClassificationEntity")
//#SWG#@ApiModel(description = """It 'used to indicate where the classification is applied (which entity). For example a classification can be applied to content or users, and according to the type of relationship (relationType) may have different meanings.
//#SWGNL#Example1:
//#SWGNL#<ul>
//#SWGNL#	<li>applicableTo = CONTENT     </li>
//#SWGNL#	<li>relationType = IS     </li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#<ul>
//#SWGNL#	<li>applicableTo = USER     </li>
//#SWGNL#	<li>relationType = INTERESTED   </li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#Tags and Metadata for this classification are used to classify contents, and users interested in contents
//#SWGNL#
//#SWGNL#Example2:
//#SWGNL#<ul>
//#SWGNL#	<li>applicableTo = CONTENT     </li>
//#SWGNL#	<li>relationType = INTERESTED    </li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#<ul>
//#SWGNL#	<li>applicableTo = USER     </li>
//#SWGNL#	<li>relationType = IS     </li>
//#SWGNL#</ul>
//#SWGNL#
//#SWGNL#Tags and Metadata for this classification are used to classify users, and contents the users are interested for.""")
class MClassificationEntity extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = true
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var applicableTo: MEClassificationEntityType =_
	def withapplicableTo(p:MEClassificationEntityType):this.type ={ 	this.applicableTo = p; 	this }

	/**
	 * To better understand the goal of the classification, is possible to define a
	 * question
	 */
	//#SWG#@ApiModelProperty(value = """To better understand the goal of the classification, is possible to define a question""")
	@BeanProperty 
	var question: List[MLocalization] = new ArrayList[MLocalization]
	def withquestion(p:List[MLocalization]):this.type ={ 	this.question = p; 	this }

	/**
	 * used to specify the Entity -> Tag relation type.
	 */
	//#SWG#@ApiModelProperty(value = """used to specify the Entity -> Tag relation type.""" ,required = true)
	@BeanProperty 
	var relationType: MEEntityTagRelationType =_
	def withrelationType(p:MEEntityTagRelationType):this.type ={ 	this.relationType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import scala.collection.JavaConversions._
		  Option(applicableTo).isDefined &&
		  Option(question).exists(_.forall(_.isValid()))
	}

}