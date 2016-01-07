package com.thron.intelligence.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.common.MTarget
import com.thron.intelligence.model.tag.MITagDefinition

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Map the association between an itag Definition and an Entity
 */
@XmlRootElement(name="MTargetITags") 
@XmlType(name="MTargetITags")
//#SWG#@ApiModel(description = """Map the association between an itag Definition and an Entity""")
class MTargetITags extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var target: MTarget =_
	def withtarget(p:MTarget):MTargetITags ={ 	this.target = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var itags: List[MITagDefinition] = new ArrayList[MITagDefinition]
	def withitags(p:List[MITagDefinition]):MTargetITags ={ 	this.itags = p; 	this }

}