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
 * source s3 bucket and filepath. The bucket should be public, or have no read
 * restrictions.
 */
@XmlRootElement(name="MSourceS3Opt") 
@XmlType(name="MSourceS3Opt")
//#SWG#@ApiModel(description = """source s3 bucket and filepath. The bucket should be public, or have no read restrictions.""")
class MSourceS3Opt extends Serializable {

	/**
	 * the s3 bucket name.
	 */
	//#SWG#@ApiModelProperty(value = """the s3 bucket name.""" ,required = true)
	@BeanProperty 
	var bucket: String =_
	def withbucket(p:String):this.type ={ 	this.bucket = p; 	this }

	/**
	 * the absolute path of the file inside the s3 bucket
	 */
	//#SWG#@ApiModelProperty(value = """the absolute path of the file inside the s3 bucket""" ,required = true)
	@BeanProperty 
	var filePath: String =_
	def withfilePath(p:String):this.type ={ 	this.filePath = p; 	this }

	/**
	 * Optional.
	 * The desired filename (without extension) to assign to the resource (the file
	 * can be renamed if not unique inside the platform).
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#The desired filename (without extension) to assign to the resource (the file can be renamed if not unique inside the platform).""")
	@BeanProperty 
	var newFileName: String =_
	def withnewFileName(p:String):this.type ={ 	this.newFileName = p; 	this }

	/**
	 * remove the source file once imported in Platform (if possible).
	 * Default=false
	 */
	//#SWG#@ApiModelProperty(value = """remove the source file once imported in Platform (if possible). 
	//#SWGNL#Default=false""")
	@BeanProperty 
	var removeSourceFile: Boolean  = false
	def withremoveSourceFile(p:Boolean):this.type ={ 	this.removeSourceFile = p; 	this }

	/**
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def validate(){
		import org.apache.commons.lang.StringUtils
		if(StringUtils.isBlank(bucket) || StringUtils.isBlank(filePath)) throw new IllegalArgumentException("bucket and filePath must be defined") 
	}

}