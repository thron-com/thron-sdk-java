package it.newvision.nvp.xadmin.services.model.apps
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MSnippet

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseSnippetDetail") 
@XmlType(name="MResponseSnippetDetail")
//#SWG#@ApiModel(description = """""")
class MResponseSnippetDetail extends MResponseApp with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var snippet: MSnippet =_
	def withsnippet(p:MSnippet):this.type ={ 	this.snippet = p; 	this }

}