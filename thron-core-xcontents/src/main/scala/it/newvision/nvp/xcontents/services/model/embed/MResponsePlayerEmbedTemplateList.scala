package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MPlayerEmbedTemplate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePlayerEmbedTemplateList") 
@XmlType(name="MResponsePlayerEmbedTemplateList")
//#SWG#@ApiModel(description = """""")
class MResponsePlayerEmbedTemplateList extends MResponsePlayerEmbed with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var items: List[MPlayerEmbedTemplate] = new ArrayList[MPlayerEmbedTemplate]
	def withitems(p:List[MPlayerEmbedTemplate]):this.type ={ 	this.items = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}