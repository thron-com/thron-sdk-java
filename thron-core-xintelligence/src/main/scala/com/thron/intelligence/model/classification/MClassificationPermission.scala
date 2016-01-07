package com.thron.intelligence.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MESubjectType
import com.thron.intelligence.model.MEPermission

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The class defines the permission for a given user or app in the classification.
 */
@XmlRootElement(name="MClassificationPermission") 
@XmlType(name="MClassificationPermission")
//#SWG#@ApiModel(description = """The class defines the permission for a given user or app in the classification.""")
class MClassificationPermission extends Serializable {

	/**
	 * username, appId or groupId
	 */
	//#SWG#@ApiModelProperty(value = """username, appId or groupId""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):MClassificationPermission ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var subjectType: MESubjectType =_
	def withsubjectType(p:MESubjectType):MClassificationPermission ={ 	this.subjectType = p; 	this }

	/**
	 * the list of different permission
	 */
	//#SWG#@ApiModelProperty(value = """the list of different permission""" ,required = true)
	@BeanProperty 
	var permission: List[MEPermission] = new ArrayList[MEPermission]
	def withpermission(p:List[MEPermission]):MClassificationPermission ={ 	this.permission = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdDate: Date  = new Date()
	def withcreatedDate(p:Date):MClassificationPermission ={ 	this.createdDate = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		Option(id).isDefined &&
			Option(subjectType).isDefined &&
			Option(permission).exists(!_.isEmpty)
	}

}