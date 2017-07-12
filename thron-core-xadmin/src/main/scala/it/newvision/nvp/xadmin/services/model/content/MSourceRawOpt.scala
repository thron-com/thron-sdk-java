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
@XmlRootElement(name="MSourceRawOpt") 
@XmlType(name="MSourceRawOpt")
//#SWG#@ApiModel(description = """""")
class MSourceRawOpt extends Serializable {

	/**
	 * Base64 String encoded with UTF-8 charset.
	 * Max size: 2MB
	 */
	//#SWG#@ApiModelProperty(value = """Base64 String encoded with UTF-8 charset.
	//#SWGNL#Max size: 2MB""" ,required = true)
	@BeanProperty 
	var buffer: String =_
	def withbuffer(p:String):this.type ={ 	this.buffer = p; 	this }

	/**
	 * Used to specify the mime type of the buffer
	 */
	//#SWG#@ApiModelProperty(value = """Used to specify the mime type of the buffer""" ,required = true)
	@BeanProperty 
	var mimeType: String =_
	def withmimeType(p:String):this.type ={ 	this.mimeType = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import org.apache.commons.lang.StringUtils
		if(StringUtils.isBlank(mimeType)) throw new IllegalArgumentException("Missing mimeType attribute")
		if(Option(buffer).isEmpty) throw new IllegalArgumentException("Missing buffer attribute")
	}

}