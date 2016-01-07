package it.newvision.nvp.xcontents.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MELinkType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MLinkedContentRemoveCriteria") 
@XmlType(name="MLinkedContentRemoveCriteria")
//#SWG#@ApiModel(description = """""")
class MLinkedContentRemoveCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkedContentsId: List[String] = new ArrayList[String]
	def withlinkedContentsId(p:List[String]):MLinkedContentRemoveCriteria ={ 	this.linkedContentsId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var linkType: MELinkType =_
	def withlinkType(p:MELinkType):MLinkedContentRemoveCriteria ={ 	this.linkType = p; 	this }

}