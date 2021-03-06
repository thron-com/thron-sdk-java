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
@XmlRootElement(name="MResponseExport") 
@XmlType(name="MResponseExport")
//#SWG#@ApiModel(description = """""")
class MResponseExport extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MSyncExportResult] = new ArrayList[MSyncExportResult]
	def withitems(p:List[MSyncExportResult]):this.type ={ 	this.items = p; 	this }

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