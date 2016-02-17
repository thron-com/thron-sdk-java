package com.thron.contacts.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MDevice") 
@XmlType(name="MDevice")
//#SWG#@ApiModel(description = """""")
class MDevice extends Serializable {

	/**
	 * generated Id for a device.
	 */
	//#SWG#@ApiModelProperty(value = """generated Id for a device.""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * created Date
	 */
	//#SWG#@ApiModelProperty(value = """created Date""")
	@BeanProperty 
	var createdDate: Date  = new Date
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	/**
	 * The last accessed Date for the device
	 */
	//#SWG#@ApiModelProperty(value = """The last accessed Date for the device""")
	@BeanProperty 
	var accessedDate: Date  = new Date
	def withaccessedDate(p:Date):this.type ={ 	this.accessedDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var ip: String =_
	def withip(p:String):this.type ={ 	this.ip = p; 	this }

	/**
	 * user Agent
	 */
	//#SWG#@ApiModelProperty(value = """user Agent""")
	@BeanProperty 
	var ua: String =_
	def withua(p:String):this.type ={ 	this.ua = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var fp: String =_
	def withfp(p:String):this.type ={ 	this.fp = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var c1: String =_
	def withc1(p:String):this.type ={ 	this.c1 = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var c3: String =_
	def withc3(p:String):this.type ={ 	this.c3 = p; 	this }

}