package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.model.MCategory4Locale

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategory.updateCategory4Locale
 */
@XmlRootElement(name="MCategoryupdateCategory4LocaleReq")
@XmlType(name="MCategoryupdateCategory4LocaleReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.updateCategory4Locale")
class MCategoryupdateCategory4LocaleReq extends Serializable {

	/**
	 * Id or prettyId
	 */
	//#SWG#@ApiModelProperty(value = """Id or prettyId""", required = true)
	@BeanProperty
	var catId: String =_
	def withcatId(p:String):this.type ={ 	this.catId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var property: MCategory4Locale =_
	def withproperty(p:MCategory4Locale):this.type ={ 	this.property = p; 	this }

}