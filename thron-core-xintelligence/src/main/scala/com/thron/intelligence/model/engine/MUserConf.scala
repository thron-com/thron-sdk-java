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
@XmlRootElement(name="MUserConf") 
@XmlType(name="MUserConf")
//#SWG#@ApiModel(description = """""")
class MUserConf extends Serializable {

	/**
	 * at most 100 groups
	 */
	//#SWG#@ApiModelProperty(value = """at most 100 groups""")
	@BeanProperty 
	var onlyForGroupIds: List[String] = new ArrayList[String]
	def withonlyForGroupIds(p:List[String]):MUserConf ={ 	this.onlyForGroupIds = p; 	this }

	/**
	 * at most 100 users
	 */
	//#SWG#@ApiModelProperty(value = """at most 100 users""")
	@BeanProperty 
	var onlyForUsernames: List[String] = new ArrayList[String]
	def withonlyForUsernames(p:List[String]):MUserConf ={ 	this.onlyForUsernames = p; 	this }

	/**
	 * possible values are:
	 * <ul>
	 * 	<li>USER ( a platform user)</li>
	 * 	<li>GUEST (a platform user guest)</li>
	 * 	<li>CONTACT (a contact)</li>
	 * </ul>
	 */
	//#SWG#@ApiModelProperty(value = """possible values are:
	//#SWGNL#<ul>
	//#SWGNL#	<li>USER ( a platform user)</li>
	//#SWGNL#	<li>GUEST (a platform user guest)</li>
	//#SWGNL#	<li>CONTACT (a contact)</li>
	//#SWGNL#</ul>""")
	@BeanProperty 
	var onlyForUserType: String =_
	def withonlyForUserType(p:String):MUserConf ={ 	this.onlyForUserType = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(onlyForUserType).forall(t=>t=="USER" || t=="GUEST" || t=="CONTACT") &&
		Option(onlyForGroupIds).forall(_.size()<=100) &&
		Option(onlyForUsernames).forall(_.size()<=100)
	}

}