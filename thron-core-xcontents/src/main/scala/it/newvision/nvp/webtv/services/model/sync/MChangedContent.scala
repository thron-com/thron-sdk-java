package it.newvision.nvp.webtv.services.model.sync
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xcontents.model.MContent
import it.newvision.nvp.xcontents.model.MCategory
import it.newvision.nvp.webtv.services.model.delivery.MDeliveryInfo

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MChangedContent") 
@XmlType(name="MChangedContent")
//#SWG#@ApiModel(description = """""")
class MChangedContent extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var content: MContent =_
	def withcontent(p:MContent):this.type ={ 	this.content = p; 	this }

	/**
	 * the list of categories where the content is linked
	 */
	//#SWG#@ApiModelProperty(value = """the list of categories where the content is linked""")
	@BeanProperty 
	var linkedCategories: List[MCategory] = new ArrayList[MCategory]
	def withlinkedCategories(p:List[MCategory]):this.type ={ 	this.linkedCategories = p; 	this }

	/**
	 * used to show whether the content has been removed
	 */
	//#SWG#@ApiModelProperty(value = """used to show whether the content has been removed""")
	@BeanProperty 
	var removed: Boolean =_
	def withremoved(p:Boolean):this.type ={ 	this.removed = p; 	this }

	/**
	 * The delivery information of the content, with the detail where the content is
	 * published.
	 */
	//#SWG#@ApiModelProperty(value = """The delivery information of the content, with the detail where the content is published.""")
	@BeanProperty 
	var deliveryInfo: List[MDeliveryInfo] = new ArrayList[MDeliveryInfo]
	def withdeliveryInfo(p:List[MDeliveryInfo]):this.type ={ 	this.deliveryInfo = p; 	this }

}