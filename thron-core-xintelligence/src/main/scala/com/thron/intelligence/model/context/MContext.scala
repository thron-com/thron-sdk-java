package com.thron.intelligence.model.context
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.MLocalization

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContext") 
@XmlType(name="MContext")
//#SWG#@ApiModel(description = """""")
class MContext extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var createdDate: Date =_
	def withcreatedDate(p:Date):this.type ={ 	this.createdDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * label and description values for the classification in multilocale
	 */
	//#SWG#@ApiModelProperty(value = """label and description values for the classification in multilocale""")
	@BeanProperty 
	var names: List[MLocalization] = new ArrayList[MLocalization]
	def withnames(p:List[MLocalization]):this.type ={ 	this.names = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var removed: Boolean  = false
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

}