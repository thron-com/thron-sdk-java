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
@XmlRootElement(name="MPlayerEmbedTemplateRoleList") 
@XmlType(name="MPlayerEmbedTemplateRoleList")
//#SWG#@ApiModel(description = """""")
class MPlayerEmbedTemplateRoleList extends Serializable {

	/**
	 * username or grupId
	 */
	//#SWG#@ApiModelProperty(value = """username or grupId""")
	@BeanProperty 
	var items: List[MPlayerEmbedTemplateRole] = new ArrayList[MPlayerEmbedTemplateRole]
	def withitems(p:List[MPlayerEmbedTemplateRole]):this.type ={ 	this.items = p; 	this }

}