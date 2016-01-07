package it.newvision.nvp.identity.services.model.request
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
 * Request message for service JClient.findByProperties
 */
@XmlRootElement(name="MClientfindByPropertiesReq")
@XmlType(name="MClientfindByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JClient.findByProperties")
class MClientfindByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):MClientfindByPropertiesReq ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var fromDate: Date =_
	def withfromDate(p:Date):MClientfindByPropertiesReq ={ 	this.fromDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var toDate: Date =_
	def withtoDate(p:Date):MClientfindByPropertiesReq ={ 	this.toDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MClientfindByPropertiesReq ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):MClientfindByPropertiesReq ={ 	this.numberOfResult = p; 	this }

}