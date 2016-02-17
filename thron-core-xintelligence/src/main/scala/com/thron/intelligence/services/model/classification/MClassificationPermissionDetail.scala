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
@XmlRootElement(name="MClassificationPermissionDetail") 
@XmlType(name="MClassificationPermissionDetail")
//#SWG#@ApiModel(description = """""")
class MClassificationPermissionDetail extends MClassificationPermission with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var displayName: String =_
	def withdisplayName(p:String):this.type ={ 	this.displayName = p; 	this }

}