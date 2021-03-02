package it.newvision.nvp.xadmin.services.model.request
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
 * Request message for service JContentAdmin.generateDownloadToken
 */
@XmlRootElement(name="MContentAdmingenerateDownloadTokenReq")
@XmlType(name="MContentAdmingenerateDownloadTokenReq")
//#SWG#@ApiModel(description = "Request message for service JContentAdmin.generateDownloadToken")
class MContentAdmingenerateDownloadTokenReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var destinationClientId: String =_
	def withdestinationClientId(p:String):this.type ={ 	this.destinationClientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var destinationUsername: String =_
	def withdestinationUsername(p:String):this.type ={ 	this.destinationUsername = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var versionId: String =_
	def withversionId(p:String):this.type ={ 	this.versionId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var xcontentId: String =_
	def withxcontentId(p:String):this.type ={ 	this.xcontentId = p; 	this }

}