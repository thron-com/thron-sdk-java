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
@XmlRootElement(name="MResponseClassificationPermission") 
@XmlType(name="MResponseClassificationPermission")
//#SWG#@ApiModel(description = """""")
class MResponseClassificationPermission extends MResponseClassification with Serializable  {

	/**
	 * permission inserted or updated correctly
	 */
	//#SWG#@ApiModelProperty(value = """permission inserted or updated correctly""")
	@BeanProperty 
	var items: List[MClassificationPermissionDetail] = new ArrayList[MClassificationPermissionDetail]
	def withitems(p:List[MClassificationPermissionDetail]):this.type ={ 	this.items = p; 	this }

	/**
	 * permission in issues
	 */
	//#SWG#@ApiModelProperty(value = """permission in issues""")
	@BeanProperty 
	var issues: List[MClassificationPermission] = new ArrayList[MClassificationPermission]
	def withissues(p:List[MClassificationPermission]):this.type ={ 	this.issues = p; 	this }

}