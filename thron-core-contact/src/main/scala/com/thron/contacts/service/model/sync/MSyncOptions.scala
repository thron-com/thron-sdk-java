package com.thron.contacts.service.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSyncOptions") 
@XmlType(name="MSyncOptions")
//#SWG#@ApiModel(description = """""")
class MSyncOptions extends Serializable {

	/**
	 * return list of itags for each contact
	 */
	//#SWG#@ApiModelProperty(value = """return list of itags for each contact""" ,required = true)
	@BeanProperty 
	var itags: Boolean  = false
	def withitags(p:Boolean):this.type ={ 	this.itags = p; 	this }

	/**
	 * return the key information for each contact
	 */
	//#SWG#@ApiModelProperty(value = """return the key information for each contact""" ,required = true)
	@BeanProperty 
	var keys: Boolean  = false
	def withkeys(p:Boolean):this.type ={ 	this.keys = p; 	this }

}