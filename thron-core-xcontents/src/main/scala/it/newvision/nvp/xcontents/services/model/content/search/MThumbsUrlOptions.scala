package it.newvision.nvp.xcontents.services.model.content.search
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MMetadata

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MThumbsUrlOptions") 
@XmlType(name="MThumbsUrlOptions")
//#SWG#@ApiModel(description = """""")
class MThumbsUrlOptions extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var divArea: String =_
	def withdivArea(p:String):this.type ={ 	this.divArea = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	/**
	 * phrase, exact_match
	 */
	//#SWG#@ApiModelProperty(value = """phrase, exact_match""")
	@BeanProperty 
	var rtieParams: List[MMetadata] = new ArrayList[MMetadata]
	def withrtieParams(p:List[MMetadata]):this.type ={ 	this.rtieParams = p; 	this }

}