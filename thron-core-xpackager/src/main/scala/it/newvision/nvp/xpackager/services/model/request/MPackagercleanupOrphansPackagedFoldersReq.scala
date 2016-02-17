package it.newvision.nvp.xpackager.services.model.request
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
 * Request message for service JPackager.cleanupOrphansPackagedFolders
 */
@XmlRootElement(name="MPackagercleanupOrphansPackagedFoldersReq")
@XmlType(name="MPackagercleanupOrphansPackagedFoldersReq")
//#SWG#@ApiModel(description = "Request message for service JPackager.cleanupOrphansPackagedFolders")
class MPackagercleanupOrphansPackagedFoldersReq extends Serializable {

	/**
	 * optional. if empty, the srvice run for all clientId
	 */
	//#SWG#@ApiModelProperty(value = """optional. if empty, the srvice run for all clientId""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * optional. if empty, the srvice run for all sites
	 */
	//#SWG#@ApiModelProperty(value = """optional. if empty, the srvice run for all sites""", required = true)
	@BeanProperty
	var siteName: String =_
	def withsiteName(p:String):this.type ={ 	this.siteName = p; 	this }

	/**
	 * if false, the service does not delete the folders but only verify the status
	 */
	//#SWG#@ApiModelProperty(value = """if false, the service does not delete the folders but only verify the status""", required = true)
	@BeanProperty
	var remove: Boolean =_
	def withremove(p:Boolean):this.type ={ 	this.remove = p; 	this }

}