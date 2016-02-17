package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Class used to provide all necessary information to fill the relation between
 * two contents. To link a content to an other the user must specify also the
 * linkType relation
 */
@XmlRootElement(name="MLinkedContents") 
@XmlType(name="MLinkedContents")
//#SWG#@ApiModel(description = """Class used to provide all necessary information to fill the relation between two contents. To link a content to an other the user must specify also the linkType relation""")
class MLinkedContents extends Serializable {

	/**
	 * the list of linked contents to add
	 */
	//#SWG#@ApiModelProperty(value = """the list of linked contents to add""")
	@BeanProperty 
	var contents: List[MLinkedContent] = new ArrayList[MLinkedContent]
	def withcontents(p:List[MLinkedContent]):this.type ={ 	this.contents = p; 	this }

}