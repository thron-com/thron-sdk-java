package it.newvision.nvp.xadmin.services.model.utils
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseChangeContentsOwner") 
@XmlType(name="MResponseChangeContentsOwner")
//#SWG#@ApiModel(description = """""")
class MResponseChangeContentsOwner extends MResponseDashboard with Serializable  {

	/**
	 * list of xcontentIds in issue during the changeContentOwner process.
	 */
	//#SWG#@ApiModelProperty(value = """list of xcontentIds in issue during the changeContentOwner process.""")
	@BeanProperty 
	var contentsInIssue: List[String] = new ArrayList[String]
	def withcontentsInIssue(p:List[String]):this.type ={ 	this.contentsInIssue = p; 	this }

}