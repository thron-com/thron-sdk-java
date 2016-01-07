package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.vusers.MVUserCriteria
import it.newvision.nvp.identity.services.model.msg.MEVuserOrderBy
import it.newvision.nvp.identity.services.model.vusers.MVUserFieldsOption

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JVUserManager.findByProperties
 */
@XmlRootElement(name="MVUserManagerfindByPropertiesReq")
@XmlType(name="MVUserManagerfindByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JVUserManager.findByProperties")
class MVUserManagerfindByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MVUserManagerfindByPropertiesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MVUserCriteria =_
	def withcriteria(p:MVUserCriteria):MVUserManagerfindByPropertiesReq ={ 	this.criteria = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var orderBy: MEVuserOrderBy =_
	def withorderBy(p:MEVuserOrderBy):MVUserManagerfindByPropertiesReq ={ 	this.orderBy = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var fieldOptions: MVUserFieldsOption =_
	def withfieldOptions(p:MVUserFieldsOption):MVUserManagerfindByPropertiesReq ={ 	this.fieldOptions = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MVUserManagerfindByPropertiesReq ={ 	this.offset = p; 	this }

	/**
	 * Default and maximum value is 50 items
	 */
	//#SWG#@ApiModelProperty(value = """Default and maximum value is 50 items""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):MVUserManagerfindByPropertiesReq ={ 	this.numberOfResult = p; 	this }

}