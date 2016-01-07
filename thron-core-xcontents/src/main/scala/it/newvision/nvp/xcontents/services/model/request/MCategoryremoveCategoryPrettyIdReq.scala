package it.newvision.nvp.xcontents.services.model.request
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
 * Request message for service JCategory.removeCategoryPrettyId
 */
@XmlRootElement(name="MCategoryremoveCategoryPrettyIdReq")
@XmlType(name="MCategoryremoveCategoryPrettyIdReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.removeCategoryPrettyId")
class MCategoryremoveCategoryPrettyIdReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MCategoryremoveCategoryPrettyIdReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var categoryId: String =_
	def withcategoryId(p:String):MCategoryremoveCategoryPrettyIdReq ={ 	this.categoryId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):MCategoryremoveCategoryPrettyIdReq ={ 	this.locale = p; 	this }

}