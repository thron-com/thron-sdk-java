package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.services.model.content.MContentCriteria
import it.newvision.nvp.xcontents.services.model.msg.MEContentOrderBy
import it.newvision.nvp.xcontents.services.model.content.MContentFieldsOption

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContent.findByProperties
 */
@XmlRootElement(name="MContentfindByPropertiesReq")
@XmlType(name="MContentfindByPropertiesReq")
//#SWG#@ApiModel(description = "Request message for service JContent.findByProperties")
class MContentfindByPropertiesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	/**
	 * Optional
	 */
	//#SWG#@ApiModelProperty(value = """Optional""", required = true)
	@BeanProperty
	var criteria: MContentCriteria =_
	def withcriteria(p:MContentCriteria):this.type ={ 	this.criteria = p; 	this }

	/**
	 * Optional.If the client desires to have the content description for a specific
	 * locale. The desired locale is return as first element of the array (if exists).
	 * 
	 * The field is used in conjunction with orderBy field to sort the contents by
	 * contentName (for a specific locale)
	 * The service always return all available locales for each contents.
	 * Locale code (ISO639-1)
	 */
	//#SWG#@ApiModelProperty(value = """Optional.If the client desires to have the content description for a specific locale. The desired locale is return as first element of the array (if exists).
	//#SWGNL#The field is used in conjunction with orderBy field to sort the contents by contentName (for a specific locale)
	//#SWGNL#The service always return all available locales for each contents.
	//#SWGNL#Locale code (ISO639-1)""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

	/**
	 * Optional. Used to order the result set for a specific field
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to order the result set for a specific field""", required = true)
	@BeanProperty
	var orderBy: MEContentOrderBy =_
	def withorderBy(p:MEContentOrderBy):this.type ={ 	this.orderBy = p; 	this }

	/**
	 * Optional. Used to specify if the service should return or not some additional
	 * information about the content
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Used to specify if the service should return or not some additional information about the content""", required = true)
	@BeanProperty
	var contentFieldOption: MContentFieldsOption =_
	def withcontentFieldOption(p:MContentFieldsOption):this.type ={ 	this.contentFieldOption = p; 	this }

	/**
	 * Optional. Define the area where the thumbnail should be displayed. Used to
	 * return the thumbnail that best suits.
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits.
	//#SWGNL#Format: <widht>x<height>
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768""", required = true)
	@BeanProperty
	var divArea: String =_
	def withdivArea(p:String):this.type ={ 	this.divArea = p; 	this }

	/**
	 * Optional. default 0
	 */
	//#SWG#@ApiModelProperty(value = """Optional. default 0""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):this.type ={ 	this.offset = p; 	this }

	/**
	 * Default and maximum value is 50 items
	 */
	//#SWG#@ApiModelProperty(value = """Default and maximum value is 50 items""", required = true)
	@BeanProperty
	var numberOfresults: Integer =_
	def withnumberOfresults(p:Integer):this.type ={ 	this.numberOfresults = p; 	this }

}