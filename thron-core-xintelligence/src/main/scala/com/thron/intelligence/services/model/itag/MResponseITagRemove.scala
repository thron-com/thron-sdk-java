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
@XmlRootElement(name="MResponseITagRemove") 
@XmlType(name="MResponseITagRemove")
//#SWG#@ApiModel(description = """""")
class MResponseITagRemove extends MResponseITag with Serializable  {

	/**
	 * List of id of removed itags
	 */
	//#SWG#@ApiModelProperty(value = """List of id of removed itags""")
	@BeanProperty 
	var items: List[String] = new ArrayList[String]
	def withitems(p:List[String]):MResponseITagRemove ={ 	this.items = p; 	this }

}