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
/**
 * the original uploaded file used during the publishing process.
 */
@XmlRootElement(name="MSourceRepoOpt") 
@XmlType(name="MSourceRepoOpt")
//#SWG#@ApiModel(description = """""")
class MSourceRepoOpt extends Serializable {

	/**
	 * the Repository File id
	 */
	//#SWG#@ApiModelProperty(value = """the Repository File id""" ,required = true)
	@BeanProperty 
	var repositoryFileId: String =_
	def withrepositoryFileId(p:String):this.type ={ 	this.repositoryFileId = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import org.apache.commons.lang.StringUtils
		if(StringUtils.isBlank(repositoryFileId)) throw new IllegalArgumentException("missing repositoryFileId attribute")
	}

}