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
@XmlRootElement(name="MResponseFullExportCategory") 
@XmlType(name="MResponseFullExportCategory")
//#SWG#@ApiModel(description = """""")
class MResponseFullExportCategory extends MResponseContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MExportFullExportCategoryResult] = new ArrayList[MExportFullExportCategoryResult]
	def withitems(p:List[MExportFullExportCategoryResult]):this.type ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var nextPage: String =_
	def withnextPage(p:String):this.type ={ 	this.nextPage = p; 	this }

}