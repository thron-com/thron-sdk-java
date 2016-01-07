package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.common.MTarget
import com.thron.intelligence.services.model.tag.MResponseITag

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseITagBulk2") 
@XmlType(name="MResponseITagBulk2")
//#SWG#@ApiModel(description = """""")
class MResponseITagBulk2 extends MResponseITag with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var targetsInIssue: List[MTarget] = new ArrayList[MTarget]
	def withtargetsInIssue(p:List[MTarget]):MResponseITagBulk2 ={ 	this.targetsInIssue = p; 	this }

}