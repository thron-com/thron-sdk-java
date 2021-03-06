package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.utils.MAclInverseList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JDashboard.propagateAclToSubCategories
 */
@XmlRootElement(name="MDashboardpropagateAclToSubCategoriesReq")
@XmlType(name="MDashboardpropagateAclToSubCategoriesReq")
//#SWG#@ApiModel(description = "Request message for service JDashboard.propagateAclToSubCategories")
class MDashboardpropagateAclToSubCategoriesReq extends Serializable {

	/**
	 * Optional list of acl rules to add/remove to the specific category
	 */
	//#SWG#@ApiModelProperty(value = """Optional list of acl rules to add/remove to the specific category""", required = true)
	@BeanProperty
	var acls: MAclInverseList =_
	def withacls(p:MAclInverseList):this.type ={ 	this.acls = p; 	this }

	/**
	 * if newUserId is empty the contents will be un trash to the original owner
	 */
	//#SWG#@ApiModelProperty(value = """if newUserId is empty the contents will be un trash to the original owner""", required = true)
	@BeanProperty
	var categoryId: String =_
	def withcategoryId(p:String):this.type ={ 	this.categoryId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Optional. Used to drive the service to apply the acls to subfolders and contents
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to drive the service to apply the acls to subfolders and contents""", required = true)
	@BeanProperty
	var force: Boolean =_
	def withforce(p:Boolean):this.type ={ 	this.force = p; 	this }

}