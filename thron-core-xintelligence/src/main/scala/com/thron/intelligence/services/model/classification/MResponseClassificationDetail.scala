package com.thron.intelligence.services.model.classification
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseClassificationDetail") 
@XmlType(name="MResponseClassificationDetail")
//#SWG#@ApiModel(description = """""")
class MResponseClassificationDetail extends MResponseClassification with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var item: MClassificationDetail =_
	def withitem(p:MClassificationDetail):this.type ={ 	this.item = p; 	this }

}