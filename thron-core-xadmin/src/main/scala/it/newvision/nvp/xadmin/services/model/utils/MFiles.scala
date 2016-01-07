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
@XmlRootElement(name="MFiles") 
@XmlType(name="MFiles")
//#SWG#@ApiModel(description = """""")
class MFiles extends Serializable {

	/**
	 * repository File ids 
	 */
	//#SWG#@ApiModelProperty(value = """repository File ids """)
	@BeanProperty 
	var repositoryFileIds: List[String] = new ArrayList[String]
	def withrepositoryFileIds(p:List[String]):MFiles ={ 	this.repositoryFileIds = p; 	this }

}