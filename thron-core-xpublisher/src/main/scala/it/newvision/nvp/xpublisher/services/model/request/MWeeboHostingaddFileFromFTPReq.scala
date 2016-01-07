package it.newvision.nvp.xpublisher.services.model.request
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
 * Request message for service JWeeboHosting.addFileFromFTP
 */
@XmlRootElement(name="MWeeboHostingaddFileFromFTPReq")
@XmlType(name="MWeeboHostingaddFileFromFTPReq")
//#SWG#@ApiModel(description = "Request message for service JWeeboHosting.addFileFromFTP")
class MWeeboHostingaddFileFromFTPReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MWeeboHostingaddFileFromFTPReq ={ 	this.clientId = p; 	this }

	/**
	 * Limited to 64 characters
	 */
	//#SWG#@ApiModelProperty(value = """Limited to 64 characters""", required = true)
	@BeanProperty
	var filename: String =_
	def withfilename(p:String):MWeeboHostingaddFileFromFTPReq ={ 	this.filename = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var siteName: String =_
	def withsiteName(p:String):MWeeboHostingaddFileFromFTPReq ={ 	this.siteName = p; 	this }

	/**
	 * The complete relative path where the file should be saved. The
	 * destinationfolder path is limited to 64 characters
	 */
	//#SWG#@ApiModelProperty(value = """The complete relative path where the file should be saved. The destinationfolder path is limited to 64 characters""", required = true)
	@BeanProperty
	var destinationfolder: String =_
	def withdestinationfolder(p:String):MWeeboHostingaddFileFromFTPReq ={ 	this.destinationfolder = p; 	this }

}