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
@XmlRootElement(name="MResponseContentFindByProperties") 
@XmlType(name="MResponseContentFindByProperties")
//#SWG#@ApiModel(description = """""")
class MResponseContentFindByProperties extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contents: List[MContentResult] = new ArrayList[MContentResult]
	def withcontents(p:List[MContentResult]):this.type ={ 	this.contents = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}