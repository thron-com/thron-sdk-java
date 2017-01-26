package it.newvision.nvp.xadmin.services.model.request
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
 * Request message for service JContent.listVersions
 */
@XmlRootElement(name="MContentlistVersionsReq")
@XmlType(name="MContentlistVersionsReq")
//#SWG#@ApiModel(description = "Request message for service JContent.listVersions")
class MContentlistVersionsReq extends Serializable {

	/**
	 * Optional. Do not send any notification at the end of the publishing process.
	 */
	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResults: Integer =_
	def withnumberOfResults(p:Integer):this.type ={ 	this.numberOfResults = p; 	this }

}