package it.newvision.nvp.identity.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.usersgroup.MGroupFieldsOption

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JUsersGroupManager.detailGroup
 */
@XmlRootElement(name="MUsersGroupManagerdetailGroupReq")
@XmlType(name="MUsersGroupManagerdetailGroupReq")
//#SWG#@ApiModel(description = "Request message for service JUsersGroupManager.detailGroup")
class MUsersGroupManagerdetailGroupReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MUsersGroupManagerdetailGroupReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var groupId: String =_
	def withgroupId(p:String):MUsersGroupManagerdetailGroupReq ={ 	this.groupId = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var fieldsOption: MGroupFieldsOption =_
	def withfieldsOption(p:MGroupFieldsOption):MUsersGroupManagerdetailGroupReq ={ 	this.fieldsOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MUsersGroupManagerdetailGroupReq ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):MUsersGroupManagerdetailGroupReq ={ 	this.numberOfResult = p; 	this }

}