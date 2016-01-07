package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.tag.MResponseITag

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseITagBulk") 
@XmlType(name="MResponseITagBulk")
//#SWG#@ApiModel(description = """""")
class MResponseITagBulk extends MResponseITag with Serializable  {

	/**
	 * list of itags not processed.
	 */
	//#SWG#@ApiModelProperty(value = """list of itags not processed.""")
	@BeanProperty 
	var itagsInIssue: List[String] = new ArrayList[String]
	def withitagsInIssue(p:List[String]):MResponseITagBulk ={ 	this.itagsInIssue = p; 	this }

}