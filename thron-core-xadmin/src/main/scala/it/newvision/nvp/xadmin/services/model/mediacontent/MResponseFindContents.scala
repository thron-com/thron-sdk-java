package it.newvision.nvp.xadmin.services.model.mediacontent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseFindContents") 
@XmlType(name="MResponseFindContents")
//#SWG#@ApiModel(description = """""")
class MResponseFindContents extends MResponseMediaContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contents: List[MContentSummary] = new ArrayList[MContentSummary]
	def withcontents(p:List[MContentSummary]):this.type ={ 	this.contents = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}