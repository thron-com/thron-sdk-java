package it.newvision.nvp.xcontents.services.model.embed
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MPlayerEmbedCode

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerEmbedCodeDetail") 
@XmlType(name="MPlayerEmbedCodeDetail")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedCodeDetail extends MPlayerEmbedCode with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var pkey: String =_
	def withpkey(p:String):this.type ={ 	this.pkey = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var source: MPlayerEmbedCodeEntityDetail =_
	def withsource(p:MPlayerEmbedCodeEntityDetail):this.type ={ 	this.source = p; 	this }

}