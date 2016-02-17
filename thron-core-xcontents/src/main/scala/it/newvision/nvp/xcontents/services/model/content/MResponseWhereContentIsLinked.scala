package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseWhereContentIsLinked") 
@XmlType(name="MResponseWhereContentIsLinked")
//#SWG#@ApiModel(description = """""")
class MResponseWhereContentIsLinked extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contentIds: List[String] = new ArrayList[String]
	def withcontentIds(p:List[String]):this.type ={ 	this.contentIds = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}