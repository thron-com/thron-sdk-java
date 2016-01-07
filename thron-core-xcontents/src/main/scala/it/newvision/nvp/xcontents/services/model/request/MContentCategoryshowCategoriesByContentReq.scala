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
 * Request message for service JContentCategory.showCategoriesByContent
 */
@XmlRootElement(name="MContentCategoryshowCategoriesByContentReq")
@XmlType(name="MContentCategoryshowCategoriesByContentReq")
//#SWG#@ApiModel(description = "Request message for service JContentCategory.showCategoriesByContent")
class MContentCategoryshowCategoriesByContentReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var client: MCredential =_
	def withclient(p:MCredential):MContentCategoryshowCategoriesByContentReq ={ 	this.client = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var contentId: String =_
	def withcontentId(p:String):MContentCategoryshowCategoriesByContentReq ={ 	this.contentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var locale: String =_
	def withlocale(p:String):MContentCategoryshowCategoriesByContentReq ={ 	this.locale = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var offset: Integer =_
	def withoffset(p:Integer):MContentCategoryshowCategoriesByContentReq ={ 	this.offset = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var numberOfResult: Integer =_
	def withnumberOfResult(p:Integer):MContentCategoryshowCategoriesByContentReq ={ 	this.numberOfResult = p; 	this }

}