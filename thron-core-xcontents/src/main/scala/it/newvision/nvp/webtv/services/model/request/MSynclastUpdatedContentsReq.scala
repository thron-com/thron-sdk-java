package it.newvision.nvp.webtv.services.model.request
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
 * Request message for service JSync.lastUpdatedContents
 */
@XmlRootElement(name="MSynclastUpdatedContentsReq")
@XmlType(name="MSynclastUpdatedContentsReq")
//#SWG#@ApiModel(description = "Request message for service JSync.lastUpdatedContents")
class MSynclastUpdatedContentsReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * Required
	 */
	//#SWG#@ApiModelProperty(value = """Required""", required = true)
	@BeanProperty
	var fromDate: Date =_
	def withfromDate(p:Date):this.type ={ 	this.fromDate = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var toDate: Date =_
	def withtoDate(p:Date):this.type ={ 	this.toDate = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	/**
	 * Default and maximum value is 50 items
	 */
	//#SWG#@ApiModelProperty(value = """Default and maximum value is 50 items""", required = true)
	@BeanProperty
	var numberOfResults: Integer =_
	def withnumberOfResults(p:Integer):this.type ={ 	this.numberOfResults = p; 	this }

}