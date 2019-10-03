package it.newvision.nvp.xcontents.services.model.export
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFullExportContent") 
@XmlType(name="MResponseFullExportContent")
//#SWG#@ApiModel(description = """""")
class MResponseFullExportContent extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MExportFullExportContentResult] = new ArrayList[MExportFullExportContentResult]
	def withitems(p:List[MExportFullExportContentResult]):this.type ={ 	this.items = p; 	this }

	/**
	 * The resultset is paginated (max page size is 200 elements), after the first
	 * call the service return a "nextPage" identifier to be used on the next call, to
	 * get the following elements. If  the "nextPage" value is empty it means that you
	 * are on the last page of the result set.
	 */
	//#SWG#@ApiModelProperty(value = """The resultset is paginated (max page size is 200 elements), after the first call the service return a "nextPage" identifier to be used on the next call, to get the following elements. If  the "nextPage" value is empty it means that you are on the last page of the result set.""")
	@BeanProperty 
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

}