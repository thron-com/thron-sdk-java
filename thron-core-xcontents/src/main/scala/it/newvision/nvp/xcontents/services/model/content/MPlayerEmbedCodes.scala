package it.newvision.nvp.xcontents.services.model.content
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
@XmlRootElement(name="MPlayerEmbedCodes") 
@XmlType(name="MPlayerEmbedCodes")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedCodes extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var embedCodes: List[MPlayerEmbedCode] = new ArrayList[MPlayerEmbedCode]
	def withembedCodes(p:List[MPlayerEmbedCode]):this.type ={ 	this.embedCodes = p; 	this }

}