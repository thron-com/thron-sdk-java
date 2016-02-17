package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.services.model.category.MCategoryUpdate

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategory.updateCategory
 */
@XmlRootElement(name="MCategoryupdateCategoryReq")
@XmlType(name="MCategoryupdateCategoryReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.updateCategory")
class MCategoryupdateCategoryReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var categoryId: String =_
	def withcategoryId(p:String):this.type ={ 	this.categoryId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var update: MCategoryUpdate =_
	def withupdate(p:MCategoryUpdate):this.type ={ 	this.update = p; 	this }

}