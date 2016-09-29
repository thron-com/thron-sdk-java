package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseContentsTrash") 
@XmlType(name="MResponseContentsTrash")
//#SWG#@ApiModel(description = """""")
class MResponseContentsTrash extends MResponsePublish with Serializable  {

	/**
	 * the list of xcontentIds in issue during the operation.
	 */
	//#SWG#@ApiModelProperty(value = """the list of xcontentIds in issue during the operation.""")
	@BeanProperty 
	var contentsInIssue: List[String] = new ArrayList[String]
	def withcontentsInIssue(p:List[String]):this.type ={ 	this.contentsInIssue = p; 	this }

}