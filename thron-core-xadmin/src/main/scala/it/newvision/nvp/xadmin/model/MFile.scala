package it.newvision.nvp.xadmin.model
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
@XmlRootElement(name="MFile") 
@XmlType(name="MFile")
//#SWG#@ApiModel(description = """the original uploaded file used during the publishing process.""")
class MFile extends Serializable {

	/**
	 * Optional.
	 * the Repository File id, used as reference Id.
	 * MFile.id (xpackager component)
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#the Repository File id, used as reference Id.
	//#SWGNL#MFile.id (xpackager component)""")
	@BeanProperty 
	var repositoryFileId: String =_
	def withrepositoryFileId(p:String):this.type ={ 	this.repositoryFileId = p; 	this }

	/**
	 * Optional.
	 * limited to 64 characters.
	 * filename with extension (example myimage.jpg)
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#limited to 64 characters. 
	//#SWGNL#filename with extension (example myimage.jpg)""")
	@BeanProperty 
	var fileName: String =_
	def withfileName(p:String):this.type ={ 	this.fileName = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	var path: String =_
	def withpath(p:String):this.type ={ 	this.path = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""")
	@BeanProperty 
	var host: String =_
	def withhost(p:String):this.type ={ 	this.host = p; 	this }

	/**
	 * Deprecated
	 */
	//#SWG#@ApiModelProperty(value = """Deprecated""" ,required = true)
	@BeanProperty 
	var siteName: String =_
	def withsiteName(p:String):this.type ={ 	this.siteName = p; 	this }

	/**
	 * Optional. Epoc format.
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Epoc format.""")
	@BeanProperty 
	var modifiedDate: Long =_
	def withmodifiedDate(p:Long):this.type ={ 	this.modifiedDate = p; 	this }

	/**
	 * Optional. In bytes
	 */
	//#SWG#@ApiModelProperty(value = """Optional. In bytes""")
	@BeanProperty 
	var totalSpace: Long =_
	def withtotalSpace(p:Long):this.type ={ 	this.totalSpace = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""")
	@BeanProperty 
	var mimeType: String =_
	def withmimeType(p:String):this.type ={ 	this.mimeType = p; 	this }

	/**
	 * Optional.
	 * It is used to indicate that the original source file has been removed from the
	 * working area, and for this reason it is not possible anymore to use the file
	 * for a new publishing process.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#It is used to indicate that the original source file has been removed from the working area, and for this reason it is not possible anymore to use the file for a new publishing process.""")
	@BeanProperty 
	var removed: Boolean  = false
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

}