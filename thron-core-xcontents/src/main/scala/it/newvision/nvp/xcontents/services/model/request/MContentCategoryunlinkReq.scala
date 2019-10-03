package it.newvision.nvp.xcontents.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.services.model.contentCategory.MContentsList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JContentCategory.unlink
 */
@XmlRootElement(name="MContentCategoryunlinkReq")
@XmlType(name="MContentCategoryunlinkReq")
//#SWG#@ApiModel(description = "Request message for service JContentCategory.unlink")
class MContentCategoryunlinkReq extends Serializable {

	/**
	 * Id or prettyId
	 */
	//#SWG#@ApiModelProperty(value = """Id or prettyId""", required = true)
	@BeanProperty
	var categoryId: String =_
	def withcategoryId(p:String):this.type ={ 	this.categoryId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var items: MContentsList =_
	def withitems(p:MContentsList):this.type ={ 	this.items = p; 	this }

}