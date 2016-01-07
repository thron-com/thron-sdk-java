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
 * source s3 bucket and filepath. The bucket should be public, or have no read
 * restrictions.
 */
@XmlRootElement(name="MS3Resource") 
@XmlType(name="MS3Resource")
//#SWG#@ApiModel(description = """source s3 bucket and filepath. The bucket should be public, or have no read restrictions.""")
class MS3Resource extends Serializable {

	/**
	 * the s3 bucket Id
	 */
	//#SWG#@ApiModelProperty(value = """the s3 bucket Id""" ,required = true)
	@BeanProperty 
	var bucket: String =_
	def withbucket(p:String):MS3Resource ={ 	this.bucket = p; 	this }

	/**
	 * the absolute path of the file inside the s3 bucket
	 */
	//#SWG#@ApiModelProperty(value = """the absolute path of the file inside the s3 bucket""" ,required = true)
	@BeanProperty 
	var filePath: String =_
	def withfilePath(p:String):MS3Resource ={ 	this.filePath = p; 	this }

	/**
	 * the new filename to assign to the resource. The renameFileTo is used as
	 * suggestion because the file can be renamed if not unique inside the platform.
	 * The attribute is optional
	 */
	//#SWG#@ApiModelProperty(value = """the new filename to assign to the resource. The renameFileTo is used as suggestion because the file can be renamed if not unique inside the platform. The attribute is optional""")
	@BeanProperty 
	var renameFileTo: String =_
	def withrenameFileTo(p:String):MS3Resource ={ 	this.renameFileTo = p; 	this }

}