package com.thron.intelligence.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import com.thron.intelligence.services.model.classification.MPermissionSearchCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPermissions.list
 */
@XmlRootElement(name="MPermissionslistReq")
@XmlType(name="MPermissionslistReq")
//#SWG#@ApiModel(description = "Request message for service JPermissions.list")
class MPermissionslistReq extends Serializable {

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var criteria: MPermissionSearchCriteria =_
	def withcriteria(p:MPermissionSearchCriteria):MPermissionslistReq ={ 	this.criteria = p; 	this }

	/**
	 * Optional.
	 * Default value is 0
	 */
	//#SWG#@ApiModelProperty(value = """Optional.
	//#SWGNL#Default value is 0""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MPermissionslistReq ={ 	this.offset = p; 	this }

	/**
	 * Optional. Default value is 50
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Default value is 50""", required = true)
	@BeanProperty
	var limit: Integer =_
	def withlimit(p:Integer):MPermissionslistReq ={ 	this.limit = p; 	this }

}