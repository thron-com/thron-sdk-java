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
 * Request message for service JCategory.verifyCategoryPrettyId
 */
@XmlRootElement(name="MCategoryverifyCategoryPrettyIdReq")
@XmlType(name="MCategoryverifyCategoryPrettyIdReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.verifyCategoryPrettyId")
class MCategoryverifyCategoryPrettyIdReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var prettyId: MPrettyId =_
	def withprettyId(p:MPrettyId):MCategoryverifyCategoryPrettyIdReq ={ 	this.prettyId = p; 	this }

}