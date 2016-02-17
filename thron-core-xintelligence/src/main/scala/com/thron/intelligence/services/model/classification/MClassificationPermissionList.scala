package com.thron.intelligence.services.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.classification.MClassificationPermission

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * The class defines the permission for a given user or app in the classification.
 */
@XmlRootElement(name="MClassificationPermissionList") 
@XmlType(name="MClassificationPermissionList")
//#SWG#@ApiModel(description = """The class defines the permission for a given user or app in the classification.""")
class MClassificationPermissionList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var permissions: List[MClassificationPermission] = new ArrayList[MClassificationPermission]
	def withpermissions(p:List[MClassificationPermission]):this.type ={ 	this.permissions = p; 	this }

	/**
	 * @return Boolean
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def isValid():Boolean ={
		import scala.collection.JavaConversions._
		Option(permissions).exists(_.forall(_.isValid()))
	}

}