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
@XmlRootElement(name="MResponseClassificationPermissionRemove") 
@XmlType(name="MResponseClassificationPermissionRemove")
//#SWG#@ApiModel(description = """""")
class MResponseClassificationPermissionRemove extends MResponseClassification with Serializable  {

	/**
	 * permission in issues
	 */
	//#SWG#@ApiModelProperty(value = """permission in issues""")
	@BeanProperty 
	var issues: List[MClassificationPermission] = new ArrayList[MClassificationPermission]
	def withissues(p:List[MClassificationPermission]):this.type ={ 	this.issues = p; 	this }

}