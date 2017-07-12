package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePlayerEmbedCodeUpdateTemplate") 
@XmlType(name="MResponsePlayerEmbedCodeUpdateTemplate")
//#SWG#@ApiModel(description = """""")
class MResponsePlayerEmbedCodeUpdateTemplate extends MResponsePlayerEmbed with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var embedInIssues: List[String] = new ArrayList[String]
	def withembedInIssues(p:List[String]):this.type ={ 	this.embedInIssues = p; 	this }

}