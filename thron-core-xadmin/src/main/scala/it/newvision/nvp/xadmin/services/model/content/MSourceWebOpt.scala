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
 * Used to add a new resource to the Platform. The web resource can be downloaded
 * from http or ftp protocols.
 */
@XmlRootElement(name="MSourceWebOpt") 
@XmlType(name="MSourceWebOpt")
//#SWG#@ApiModel(description = """Used to add a new resource to the Platform. The web resource can be downloaded from http or ftp protocols.""")
class MSourceWebOpt extends Serializable {

	/**
	 * public url resource like:
	 * http//hostname/path/file.mp4
	 * ftp://username:password@hostname/path/file.mp4
	 */
	//#SWG#@ApiModelProperty(value = """public url resource like:
	//#SWGNL#http//hostname/path/file.mp4
	//#SWGNL#ftp://username:password@hostname/path/file.mp4""" ,required = true)
	@BeanProperty 
	var url: String =_
	def withurl(p:String):this.type ={ 	this.url = p; 	this }

	/**
	 * Optional.
	 * The desired filename (without extension) to assign to the resource (the file
	 * can be renamed if not unique inside the platform)
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#The desired filename (without extension) to assign to the resource (the file can be renamed if not unique inside the platform)""")
	@BeanProperty 
	var newFileName: String =_
	def withnewFileName(p:String):this.type ={ 	this.newFileName = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import org.apache.commons.lang.StringUtils
		if(StringUtils.isBlank(url)) throw new IllegalArgumentException("missing url attribute")
	}

}