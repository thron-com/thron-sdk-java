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
@XmlRootElement(name="MContentSearchDeleteResult") 
@XmlType(name="MContentSearchDeleteResult")
//#SWG#@ApiModel(description = """""")
class MContentSearchDeleteResult extends MResponseContentSearch with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var item: MContentSearch =_
	def withitem(p:MContentSearch):this.type ={ 	this.item = p; 	this }

}