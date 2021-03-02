package it.newvision.nvp.xcontents.services.model.content.contentsearch
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentSearchListResult") 
@XmlType(name="MContentSearchListResult")
//#SWG#@ApiModel(description = """""")
class MContentSearchListResult extends MResponseContentSearch with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MContentSearch] = new ArrayList[MContentSearch]
	def withitems(p:List[MContentSearch]):this.type ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var paging: MPaging =_
	def withpaging(p:MPaging):this.type ={ 	this.paging = p; 	this }

}