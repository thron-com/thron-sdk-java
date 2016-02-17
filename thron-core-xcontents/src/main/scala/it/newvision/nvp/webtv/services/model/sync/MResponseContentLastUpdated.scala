package it.newvision.nvp.webtv.services.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.content.MResponseContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentLastUpdated") 
@XmlType(name="MResponseContentLastUpdated")
//#SWG#@ApiModel(description = """""")
class MResponseContentLastUpdated extends MResponseContent with Serializable  {

	/**
	 * the list of contents changed in the given time range.
	 */
	//#SWG#@ApiModelProperty(value = """the list of contents changed in the given time range.""")
	@BeanProperty 
	var contents: List[MChangedContent] = new ArrayList[MChangedContent]
	def withcontents(p:List[MChangedContent]):this.type ={ 	this.contents = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}