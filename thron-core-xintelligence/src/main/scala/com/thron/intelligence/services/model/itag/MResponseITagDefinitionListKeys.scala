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
@XmlRootElement(name="MResponseITagDefinitionListKeys") 
@XmlType(name="MResponseITagDefinitionListKeys")
//#SWG#@ApiModel(description = """""")
class MResponseITagDefinitionListKeys extends MResponseITag with Serializable  {

	/**
	 * list of keys
	 */
	//#SWG#@ApiModelProperty(value = """list of keys""")
	@BeanProperty 
	var items: List[String] = new ArrayList[String]
	def withitems(p:List[String]):this.type ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}