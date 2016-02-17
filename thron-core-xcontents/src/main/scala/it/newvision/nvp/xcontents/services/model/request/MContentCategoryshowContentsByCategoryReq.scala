package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.common.MCredential
import it.newvision.nvp.xcontents.services.model.content.MContentCriteria

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContentCategory.showContentsByCategory
 */
@XmlRootElement(name="MContentCategoryshowContentsByCategoryReq")
@XmlType(name="MContentCategoryshowContentsByCategoryReq")
//#SWG#@ApiModel(description = "Request message for service JContentCategory.showContentsByCategory")
class MContentCategoryshowContentsByCategoryReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):this.type ={ 	this.client = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var categoryId: String =_
	def withcategoryId(p:String):this.type ={ 	this.categoryId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentsCriteria: MContentCriteria =_
	def withcontentsCriteria(p:MContentCriteria):this.type ={ 	this.contentsCriteria = p; 	this }

	/**
	 * Specifies the locale to use on the function result. The contents will be
	 * returned with the specified locale.
	 */
	//#SWG#@ApiModelProperty(value = """Specifies the locale to use on the function result. The contents will be returned with the specified locale.""", required = true)
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