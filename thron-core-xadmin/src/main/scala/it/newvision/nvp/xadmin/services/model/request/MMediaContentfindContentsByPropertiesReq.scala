package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.mediacontent.MMediaContentCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JMediaContent.findContentsByProperties
 */
@XmlRootElement(name="MMediaContentfindContentsByPropertiesReq")
@XmlType(name="MMediaContentfindContentsByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JMediaContent.findContentsByProperties")
class MMediaContentfindContentsByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MMediaContentCriteria =_
	def withcriteria(p:MMediaContentCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * If the client desires to have the content description in a specific locale.
	 */
	//#SWG#@ApiModelProperty(value = """If the client desires to have the content description in a specific locale.""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):this.type ={ 	this.numberOfResult = p; 	this }

}