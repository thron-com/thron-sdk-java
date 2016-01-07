package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.usersgroup.MUsersGroupCriteria
import it.newvision.nvp.identity.services.model.msg.MEUsersGroupOrderBy
import it.newvision.nvp.identity.services.model.usersgroup.MGroupFieldsOption

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JUsersGroupManager.findGroupsByProperties
 */
@XmlRootElement(name="MUsersGroupManagerfindGroupsByPropertiesReq")
@XmlType(name="MUsersGroupManagerfindGroupsByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JUsersGroupManager.findGroupsByProperties")
class MUsersGroupManagerfindGroupsByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MUsersGroupManagerfindGroupsByPropertiesReq ={ 	this.clientId = p; 	this }

	/**
	 * search criteria. Optional
	 */
	//#SWG#@ApiModelProperty(value = """search criteria. Optional""", required = true)
	@BeanProperty
	var criteria: MUsersGroupCriteria =_
	def withcriteria(p:MUsersGroupCriteria):MUsersGroupManagerfindGroupsByPropertiesReq ={ 	this.criteria = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var orderBy: MEUsersGroupOrderBy =_
	def withorderBy(p:MEUsersGroupOrderBy):MUsersGroupManagerfindGroupsByPropertiesReq ={ 	this.orderBy = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var fieldsOption: MGroupFieldsOption =_
	def withfieldsOption(p:MGroupFieldsOption):MUsersGroupManagerfindGroupsByPropertiesReq ={ 	this.fieldsOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MUsersGroupManagerfindGroupsByPropertiesReq ={ 	this.offset = p; 	this }

	/**
	 * Default and maximum value is 50 items
	 */
	//#SWG#@ApiModelProperty(value = """Default and maximum value is 50 items""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):MUsersGroupManagerfindGroupsByPropertiesReq ={ 	this.numberOfResult = p; 	this }

}