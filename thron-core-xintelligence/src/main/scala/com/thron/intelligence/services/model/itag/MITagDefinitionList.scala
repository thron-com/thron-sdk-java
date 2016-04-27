package com.thron.intelligence.services.model.itag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MITagDefinitionList") 
@XmlType(name="MITagDefinitionList")
//#SWG#@ApiModel(description = """""")
class MITagDefinitionList extends Serializable {

	/**
	 * ITagDefinition Ids
	 */
	//#SWG#@ApiModelProperty(value = """ITagDefinition Ids""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

}