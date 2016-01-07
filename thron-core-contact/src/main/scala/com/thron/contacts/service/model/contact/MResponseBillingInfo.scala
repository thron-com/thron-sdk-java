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
@XmlRootElement(name="MResponseBillingInfo") 
@XmlType(name="MResponseBillingInfo")
//#SWG#@ApiModel(description = """""")
class MResponseBillingInfo extends MResponseContact with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MBillingContactArchiveUnit] = new ArrayList[MBillingContactArchiveUnit]
	def withitems(p:List[MBillingContactArchiveUnit]):MResponseBillingInfo ={ 	this.items = p; 	this }

}