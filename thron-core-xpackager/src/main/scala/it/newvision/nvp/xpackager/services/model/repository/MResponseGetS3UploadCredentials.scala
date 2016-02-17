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
@XmlRootElement(name="MResponseGetS3UploadCredentials") 
@XmlType(name="MResponseGetS3UploadCredentials")
//#SWG#@ApiModel(description = """""")
class MResponseGetS3UploadCredentials extends MResponseRepository with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var credentials: MAwsCredentials =_
	def withcredentials(p:MAwsCredentials):this.type ={ 	this.credentials = p; 	this }

	/**
	 * S3 bucket name
	 */
	//#SWG#@ApiModelProperty(value = """S3 bucket name""" ,required = true)
	@BeanProperty 
	var bucketName: String =_
	def withbucketName(p:String):this.type ={ 	this.bucketName = p; 	this }

	/**
	 * S3 bucket path credentials are granted on
	 */
	//#SWG#@ApiModelProperty(value = """S3 bucket path credentials are granted on""" ,required = true)
	@BeanProperty 
	var path: String =_
	def withpath(p:String):this.type ={ 	this.path = p; 	this }

}