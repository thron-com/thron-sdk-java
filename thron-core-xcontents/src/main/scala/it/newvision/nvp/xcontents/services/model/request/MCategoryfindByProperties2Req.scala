package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.services.model.category.MCategoryCriteria
import it.newvision.nvp.xcontents.services.model.msg.MECategoryOrderBy
import it.newvision.nvp.xcontents.services.model.category.MCategoryFieldsOption

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JCategory.findByProperties2
 */
@XmlRootElement(name="MCategoryfindByProperties2Req")
@XmlType(name="MCategoryfindByProperties2Req")
//#SWG#@ApiModel(description = "Request message for service JCategory.findByProperties2")
class MCategoryfindByProperties2Req extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):MCategoryfindByProperties2Req ={ 	this.client = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var properties: MCategoryCriteria =_
	def withproperties(p:MCategoryCriteria):MCategoryfindByProperties2Req ={ 	this.properties = p; 	this }

	/**
	 * Optional.If the client desires to have the category description for a specific
	 * locale. The desired locale is return as first element of the array (if exists).
	 * 
	 * The field is used in conjunction with orderBy field to sort the contents by
	 * categoryName (for a specific locale)
	 * The service always return all available locales for each category.
	 */
	//#SWG#@ApiModelProperty(value = """Optional.If the client desires to have the category description for a specific locale. The desired locale is return as first element of the array (if exists).
	//#SWGNL#The field is used in conjunction with orderBy field to sort the contents by categoryName (for a specific locale)
	//#SWGNL#The service always return all available locales for each category.""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):MCategoryfindByProperties2Req ={ 	this.locale = p; 	this }

	/**
	 * Optional. Used to order the result set for a specific field
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to order the result set for a specific field""", required = true)
	@BeanProperty
	var orderBy: MECategoryOrderBy =_
	def withorderBy(p:MECategoryOrderBy):MCategoryfindByProperties2Req ={ 	this.orderBy = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var categoryFieldOption: MCategoryFieldsOption =_
	def withcategoryFieldOption(p:MCategoryFieldsOption):MCategoryfindByProperties2Req ={ 	this.categoryFieldOption = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MCategoryfindByProperties2Req ={ 	this.offset = p; 	this }

	/**
	 * default value= 50
	 * value -1, return all result not paginated
	 */
	//#SWG#@ApiModelProperty(value = """default value= 50
	//#SWGNL#value -1, return all result not paginated""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):MCategoryfindByProperties2Req ={ 	this.numberOfResult = p; 	this }

}