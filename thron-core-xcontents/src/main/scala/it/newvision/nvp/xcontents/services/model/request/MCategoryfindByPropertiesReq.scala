package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.services.model.category.MCategoryCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategory.findByProperties
 */
@XmlRootElement(name="MCategoryfindByPropertiesReq")
@XmlType(name="MCategoryfindByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JCategory.findByProperties")
class MCategoryfindByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	/**
	 * Optional.If the client desires to have the category description for a specific
	 * locale. If empty the service return all available locales for each categories.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.If the client desires to have the category description for a specific locale. If empty the service return all available locales for each categories.""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * Default is 50 items.
	 * value -1, return all result not paginated
	 */
	//#SWG#@ApiModelProperty(value = """Default is 50 items.
	//#SWGNL#value -1, return all result not paginated""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):this.type ={ 	this.numberOfResult = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var properties: MCategoryCriteria =_
	def withproperties(p:MCategoryCriteria):this.type ={ 	this.properties = p; 	this }

}