package it.newvision.nvp.xcontents.services.model.tag
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseTags") 
@XmlType(name="MResponseTags")
//#SWG#@ApiModel(description = """""")
class MResponseTags extends MResponseTag with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tags: List[MTagDetail] = new ArrayList[MTagDetail]
	def withtags(p:List[MTagDetail]):MResponseTags ={ 	this.tags = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):MResponseTags ={ 	this.totalResults = p; 	this }

}