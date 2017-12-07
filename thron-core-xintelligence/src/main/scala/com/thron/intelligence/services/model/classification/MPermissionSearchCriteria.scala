package com.thron.intelligence.services.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MEPermission
import com.thron.intelligence.model.MESubjectType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPermissionSearchCriteria") 
@XmlType(name="MPermissionSearchCriteria")
//#SWG#@ApiModel(description = """""")
class MPermissionSearchCriteria extends Serializable {

	/**
	 * list of MClassificationPermission.id
	 */
	//#SWG#@ApiModelProperty(value = """list of MClassificationPermission.id""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var permission: List[MEPermission] = new ArrayList[MEPermission]
	def withpermission(p:List[MEPermission]):this.type ={ 	this.permission = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var subjectTypes: List[MESubjectType] = new ArrayList[MESubjectType]
	def withsubjectTypes(p:List[MESubjectType]):this.type ={ 	this.subjectTypes = p; 	this }

}