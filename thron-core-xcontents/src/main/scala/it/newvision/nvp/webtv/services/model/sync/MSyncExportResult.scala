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
@XmlRootElement(name="MSyncExportResult") 
@XmlType(name="MSyncExportResult")
//#SWG#@ApiModel(description = """""")
class MSyncExportResult extends Serializable {

	/**
	 * Content metadata, descriptions and attributes.
	 */
	//#SWG#@ApiModelProperty(value = """Content metadata, descriptions and attributes.""")
	@BeanProperty 
	var content: MContent =_
	def withcontent(p:MContent):this.type ={ 	this.content = p; 	this }

	/**
	 * the list of categories linked to the content.
	 */
	//#SWG#@ApiModelProperty(value = """the list of categories linked to the content.""")
	@BeanProperty 
	var linkedCategories: List[MCategory] = new ArrayList[MCategory]
	def withlinkedCategories(p:List[MCategory]):this.type ={ 	this.linkedCategories = p; 	this }

	/**
	 * the list of itags linked to the content.
	 */
	//#SWG#@ApiModelProperty(value = """the list of itags linked to the content.""")
	@BeanProperty 
	var itagDefinitions: List[MITagDefSummary] = new ArrayList[MITagDefSummary]
	def withitagDefinitions(p:List[MITagDefSummary]):this.type ={ 	this.itagDefinitions = p; 	this }

	/**
	 * The delivery information of the content, with the detail where the content is
	 * published.
	 */
	//#SWG#@ApiModelProperty(value = """The delivery information of the content, with the detail where the content is published.""")
	@BeanProperty 
	var deliveryInfo: List[MDeliveryInfo] = new ArrayList[MDeliveryInfo]
	def withdeliveryInfo(p:List[MDeliveryInfo]):this.type ={ 	this.deliveryInfo = p; 	this }

	/**
	 * The summary of last version of the content
	 */
	//#SWG#@ApiModelProperty(value = """The summary of last version of the content""")
	@BeanProperty 
	var versionInfo: MVersionSummary =_
	def withversionInfo(p:MVersionSummary):this.type ={ 	this.versionInfo = p; 	this }

	/**
	 * Returns a dynamic link to the best thumbnail for the given content. (based on
	 * the thumbDivArea parameter).
	 */
	//#SWG#@ApiModelProperty(value = """Returns a dynamic link to the best thumbnail for the given content. (based on the thumbDivArea parameter).""" ,required = true)
	@BeanProperty 
	var thumbUrl: String =_
	def withthumbUrl(p:String):this.type ={ 	this.thumbUrl = p; 	this }

}