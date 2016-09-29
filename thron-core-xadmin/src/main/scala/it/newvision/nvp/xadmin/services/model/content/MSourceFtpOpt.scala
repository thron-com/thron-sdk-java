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
@XmlRootElement(name="MSourceFtpOpt") 
@XmlType(name="MSourceFtpOpt")
//#SWG#@ApiModel(description = """""")
class MSourceFtpOpt extends Serializable {

	/**
	 * filename with extension of the file in ftp.
	 * It's not possible to get files from subfolders.
	 */
	//#SWG#@ApiModelProperty(value = """filename with extension of the file in ftp.
	//#SWGNL#It's not possible to get files from subfolders.""" ,required = true)
	@BeanProperty 
	var fileName: String =_
	def withfileName(p:String):this.type ={ 	this.fileName = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import org.apache.commons.lang.StringUtils
		if(StringUtils.isBlank(fileName)) throw new IllegalArgumentException("missing fileName attribute")
	}

}