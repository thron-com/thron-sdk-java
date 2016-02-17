package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentListResult") 
@XmlType(name="MResponseContentListResult")
//#SWG#@ApiModel(description = """""")
class MResponseContentListResult extends MResponseContentList with Serializable  {

	/**
	 * <b>Limits:</b>
	 * The service doesn't return itags and imetadata value for each content.
	 */
	//#SWG#@ApiModelProperty(value = """<b>Limits:</b>
	//#SWGNL#The service doesn't return itags and imetadata value for each content.""")
	@BeanProperty 
	var contents: List[MContentWall] = new ArrayList[MContentWall]
	def withcontents(p:List[MContentWall]):this.type ={ 	this.contents = p; 	this }

	/**
	 * total number of results
	 */
	//#SWG#@ApiModelProperty(value = """total number of results""" ,required = true)
	@BeanProperty 
	var totalResults: Integer  = 0
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}