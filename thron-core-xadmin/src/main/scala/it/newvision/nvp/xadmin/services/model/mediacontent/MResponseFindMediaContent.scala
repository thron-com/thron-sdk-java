package it.newvision.nvp.xadmin.services.model.mediacontent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MMediaContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFindMediaContent") 
@XmlType(name="MResponseFindMediaContent")
//#SWG#@ApiModel(description = """""")
class MResponseFindMediaContent extends MResponseMediaContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var mediaContents: List[MMediaContent] = new ArrayList[MMediaContent]
	def withmediaContents(p:List[MMediaContent]):MResponseFindMediaContent ={ 	this.mediaContents = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponseFindMediaContent ={ 	this.totalResults = p; 	this }

}