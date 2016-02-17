package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategory.removeCategory4Locale
 */
@XmlRootElement(name="MCategoryremoveCategory4LocaleReq")
@XmlType(name="MCategoryremoveCategory4LocaleReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.removeCategory4Locale")
class MCategoryremoveCategory4LocaleReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var catId: String =_
	def withcatId(p:String):this.type ={ 	this.catId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

}