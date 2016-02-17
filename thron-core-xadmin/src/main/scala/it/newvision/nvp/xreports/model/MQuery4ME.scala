package it.newvision.nvp.xreports.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MQuery4ME") 
@XmlType(name="MQuery4ME")
//#SWG#@ApiModel(description = """""")
class MQuery4ME extends MQuery with Serializable  {

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var contents: List[MContent] = new ArrayList[MContent]
	  def withcontents(p:List[MContent]):this.type ={ 	this.contents = p; 	this }

}