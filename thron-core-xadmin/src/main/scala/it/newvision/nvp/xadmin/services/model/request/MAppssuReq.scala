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
 * Request message for service JApps.su
 */
@XmlRootElement(name="MAppssuReq")
@XmlType(name="MAppssuReq")
//#SWG#@ApiModel(description = "Request message for service JApps.su")
class MAppssuReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MAppssuReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var appId: String =_
	def withappId(p:String):MAppssuReq ={ 	this.appId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var username: String =_
	def withusername(p:String):MAppssuReq ={ 	this.username = p; 	this }

	/**
	 * Optional. 
	 */
	//#SWG#@ApiModelProperty(value = """Optional. """, required = true)
	@BeanProperty
	var appKey: String =_
	def withappKey(p:String):MAppssuReq ={ 	this.appKey = p; 	this }

}