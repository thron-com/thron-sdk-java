package com.thron.intelligence.services.model.common
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * List of target Entities
 */
@XmlRootElement(name="MTargetList") 
@XmlType(name="MTargetList")
//#SWG#@ApiModel(description = """List of target Entities""")
class MTargetList extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var targets: List[MTarget] = new ArrayList[MTarget]
	def withtargets(p:List[MTarget]):MTargetList ={ 	this.targets = p; 	this }

}