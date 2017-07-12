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
@XmlRootElement(name="MPlayerEmbedCodeList") 
@XmlType(name="MPlayerEmbedCodeList")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedCodeList extends Serializable {

	/**
	 * list of player embed code Ids
	 */
	//#SWG#@ApiModelProperty(value = """list of player embed code Ids""")
	@BeanProperty 
	var ids: List[String] = new ArrayList[String]
	def withids(p:List[String]):this.type ={ 	this.ids = p; 	this }

}