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
 * Request message for service JAdminAdmin.migrateDomain
 */
@XmlRootElement(name="MAdminAdminmigrateDomainReq")
@XmlType(name="MAdminAdminmigrateDomainReq")
//#SWG#@ApiModel(description = "Request message for service JAdminAdmin.migrateDomain")
class MAdminAdminmigrateDomainReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Available values:
	 * "thron.com"
	 */
	//#SWG#@ApiModelProperty(value = """Available values:
	//#SWGNL#"thron.com"""", required = true)
	@BeanProperty
	var domain: String =_
	def withdomain(p:String):this.type ={ 	this.domain = p; 	this }

}