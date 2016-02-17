package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MPrettyId

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategory.updateCategoryPrettyId
 */
@XmlRootElement(name="MCategoryupdateCategoryPrettyIdReq")
@XmlType(name="MCategoryupdateCategoryPrettyIdReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.updateCategoryPrettyId")
class MCategoryupdateCategoryPrettyIdReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var categoryId: String =_
	def withcategoryId(p:String):this.type ={ 	this.categoryId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var prettyId: MPrettyId =_
	def withprettyId(p:MPrettyId):this.type ={ 	this.prettyId = p; 	this }

}