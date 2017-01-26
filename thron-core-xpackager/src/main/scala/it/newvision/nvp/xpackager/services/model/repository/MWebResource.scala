package it.newvision.nvp.xpackager.services.model.repository
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
@XmlRootElement(name="MWebResource") 
@XmlType(name="MWebResource")
//#SWG#@ApiModel(description = """Used to add a new resource to the Platform. The web resource can be downloaded from http or ftp protocols.""")
class MWebResource extends Serializable {

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
	 * the new filename (with right extension) to assign to the resource. The
	 * renameFileTo is used as suggestion because the file can be renamed if not
	 * unique inside the platform.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#the new filename (with right extension) to assign to the resource. The renameFileTo is used as suggestion because the file can be renamed if not unique inside the platform.""")
	@BeanProperty 
	var renameFileTo: String =_
	def withrenameFileTo(p:String):this.type ={ 	this.renameFileTo = p; 	this }

}