package com.thron.intelligence.model.engine
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MIEngineConfiguration") 
@XmlType(name="MIEngineConfiguration")
//#SWG#@ApiModel(description = """""")
abstract class MIEngineConfiguration extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var active: Boolean  = false
	def withactive(p:Boolean):this.type ={ 	this.active = p; 	this }

	/**
	 * userId of the owner
	 */
	//#SWG#@ApiModelProperty(value = """userId of the owner""")
	@BeanProperty 
	var createdBy: String =_
	def withcreatedBy(p:String):this.type ={ 	this.createdBy = p; 	this }

	/**
	 * Optional. The creation date of the category
	 */
	//#SWG#@ApiModelProperty(value = """Optional. The creation date of the category""")
	@BeanProperty 
	var createdDate: Date  = new Date()
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var modifiedDate: Date =_
	def withmodifiedDate(p:Date):this.type ={ 	this.modifiedDate = p; 	this }

}