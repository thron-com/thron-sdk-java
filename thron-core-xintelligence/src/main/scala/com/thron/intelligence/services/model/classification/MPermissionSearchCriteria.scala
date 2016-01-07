package com.thron.intelligence.services.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MEPermission

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
	def withids(p:List[String]):MPermissionSearchCriteria ={ 	this.ids = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var permission: List[MEPermission] = new ArrayList[MEPermission]
	def withpermission(p:List[MEPermission]):MPermissionSearchCriteria ={ 	this.permission = p; 	this }

}