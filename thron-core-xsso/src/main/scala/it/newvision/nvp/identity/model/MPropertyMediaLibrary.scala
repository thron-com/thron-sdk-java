package it.newvision.nvp.identity.model
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
 * used to constraint the maximum number of images(thumbnails) that the client can
 * upload in the system (database) and the image size constraints.
 */
@XmlRootElement(name="MPropertyMediaLibrary") 
@XmlType(name="MPropertyMediaLibrary")
//#SWG#@ApiModel(description = """used to constraint the maximum number of images(thumbnails) that the client can upload in the system (database) and the image size constraints.""")
class MPropertyMediaLibrary extends Serializable {

	/**
	 * max number of images that the client can store in the Admin media Library
	 */
	//#SWG#@ApiModelProperty(value = """max number of images that the client can store in the Admin media Library""" ,required = true)
	@BeanProperty 
	var librarySize: Integer  = 100
	def withlibrarySize(p:Integer):MPropertyMediaLibrary ={ 	this.librarySize = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var maxWidth: Integer  = 1024
	def withmaxWidth(p:Integer):MPropertyMediaLibrary ={ 	this.maxWidth = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var maxHeight: Integer  = 768
	def withmaxHeight(p:Integer):MPropertyMediaLibrary ={ 	this.maxHeight = p; 	this }

	/**
	 * allowed mime types: comma separated
	 */
	//#SWG#@ApiModelProperty(value = """allowed mime types: comma separated""" ,required = true)
	@BeanProperty 
	var allowedMimetypes: String  = "image/bmp,image/jpeg,image/gif,image/png"
	def withallowedMimetypes(p:String):MPropertyMediaLibrary ={ 	this.allowedMimetypes = p; 	this }

	/**
	 * Maximum byte size of each single image (2 MB).
	 * the value is expressed in Kilobytes
	 */
	//#SWG#@ApiModelProperty(value = """Maximum byte size of each single image (2 MB).
	//#SWGNL#the value is expressed in Kilobytes""" ,required = true)
	@BeanProperty 
	var maxImageSize: Integer  = 1000
	def withmaxImageSize(p:Integer):MPropertyMediaLibrary ={ 	this.maxImageSize = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def init(){

	}

}