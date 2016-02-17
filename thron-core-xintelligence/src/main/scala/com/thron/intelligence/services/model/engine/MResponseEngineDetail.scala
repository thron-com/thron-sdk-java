package com.thron.intelligence.services.model.engine
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.model.engine.MIEngine

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseEngineDetail") 
@XmlType(name="MResponseEngineDetail")
//#SWG#@ApiModel(description = """""")
class MResponseEngineDetail extends MResponseEngine with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var item: MIEngine =_
	def withitem(p:MIEngine):this.type ={ 	this.item = p; 	this }

}