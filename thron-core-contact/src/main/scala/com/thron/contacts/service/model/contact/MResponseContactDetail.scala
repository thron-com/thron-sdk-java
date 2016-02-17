package com.thron.contacts.service.model.contact
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContactDetail") 
@XmlType(name="MResponseContactDetail")
//#SWG#@ApiModel(description = """""")
class MResponseContactDetail extends MResponseContact with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var item: MContactDetail =_
	def withitem(p:MContactDetail):this.type ={ 	this.item = p; 	this }

}