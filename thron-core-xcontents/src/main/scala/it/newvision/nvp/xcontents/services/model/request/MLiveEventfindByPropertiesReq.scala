package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.services.model.liveEvent.MLiveEventCriteria
import it.newvision.nvp.xcontents.services.model.msg.MELiveEventOrderBy

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JLiveEvent.findByProperties
 */
@XmlRootElement(name="MLiveEventfindByPropertiesReq")
@XmlType(name="MLiveEventfindByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JLiveEvent.findByProperties")
class MLiveEventfindByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var criteria: MLiveEventCriteria =_
	def withcriteria(p:MLiveEventCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional.If the client desires to have the content description for a specific
	 * locale. The desired locale is return as first element of the array (if exists).
	 * 
	 * The field is used in conjunction with orderBy field to sort the liveEvents by
	 * contentName (for a specific locale)
	 * The service always return all available locales for each liveEvent.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.If the client desires to have the content description for a specific locale. The desired locale is return as first element of the array (if exists).
	//#SWGNL#The field is used in conjunction with orderBy field to sort the liveEvents by contentName (for a specific locale)
	//#SWGNL#The service always return all available locales for each liveEvent.""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var orderBy: MELiveEventOrderBy =_
	def withorderBy(p:MELiveEventOrderBy):this.type ={ 	this.orderBy = p; 	this }

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