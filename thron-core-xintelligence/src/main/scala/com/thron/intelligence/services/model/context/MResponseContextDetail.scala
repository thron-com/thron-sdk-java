package com.thron.intelligence.services.model.context
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.context.MContext

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContextDetail") 
@XmlType(name="MResponseContextDetail")
//#SWG#@ApiModel(description = """""")
class MResponseContextDetail extends MResponseContext with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var item: MContext =_
	def withitem(p:MContext):MResponseContextDetail ={ 	this.item = p; 	this }

}