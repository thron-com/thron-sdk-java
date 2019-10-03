package it.newvision.nvp.webtv.services.model.sync
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
 * Class used to define witch details of Contents are required in the response
 * like:
 * <ul>
 * 	<li>the list of linkedCategories</li>
 * 	<li>the list of embedCodes</li>
 * 	<li>the content thumbnail</li>
 * 	<li>the list of itags (from intelligence)</li>
 * 	<li>the list of custom metadata (from intelligence)</li>
 * </ul>
 */
@XmlRootElement(name="MSyncOptions") 
@XmlType(name="MSyncOptions")
//#SWG#@ApiModel(description = """""")
class MSyncOptions extends Serializable {

	/**
	 * Default= false
	 * if true the service fill the deliveryIfo attribute.
	 */
	//#SWG#@ApiModelProperty(value = """Default= false
	//#SWGNL#if true the service fill the deliveryIfo attribute.""" ,required = true)
	@BeanProperty 
	var returnDeliveryInfo: Boolean  = false
	def withreturnDeliveryInfo(p:Boolean):this.type ={ 	this.returnDeliveryInfo = p; 	this }

	/**
	 * Default= false
	 * if true the service fill the content.imetadata attribute.
	 */
	//#SWG#@ApiModelProperty(value = """Default= false
	//#SWGNL#if true the service fill the content.imetadata attribute.""" ,required = true)
	@BeanProperty 
	var returnImetadata: Boolean  = false
	def withreturnImetadata(p:Boolean):this.type ={ 	this.returnImetadata = p; 	this }

	/**
	 * Default= false
	 * if true the service fill the itagDefinitions attribute.
	 */
	//#SWG#@ApiModelProperty(value = """Default= false
	//#SWGNL#if true the service fill the itagDefinitions attribute.""" ,required = true)
	@BeanProperty 
	var returnItags: Boolean  = false
	def withreturnItags(p:Boolean):this.type ={ 	this.returnItags = p; 	this }

	/**
	 * Default= false
	 * if true the service fill the linkedCategories attribute.
	 */
	//#SWG#@ApiModelProperty(value = """Default= false
	//#SWGNL#if true the service fill the linkedCategories attribute.""" ,required = true)
	@BeanProperty 
	var returnLinkedCategories: Boolean  = false
	def withreturnLinkedCategories(p:Boolean):this.type ={ 	this.returnLinkedCategories = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var returnVersionInfo: Boolean  = false
	def withreturnVersionInfo(p:Boolean):this.type ={ 	this.returnVersionInfo = p; 	this }

	/**
	 * Optional. Define the area where the thumbnail should be displayed. Used to
	 * return the thumbnail that best suits (thumbUrl attribute).
	 * Default value is "0x0" (max thumbnail size)
	 * Format: <widht>x<height>
	 * Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768
	 */
	//#SWG#@ApiModelProperty(value = """Optional. Define the area where the thumbnail should be displayed. Used to return the thumbnail that best suits (thumbUrl attribute). 
	//#SWGNL#Default value is "0x0" (max thumbnail size)
	//#SWGNL#Format: <widht>x<height>
	//#SWGNL#Example: 1280x1024, 768x0 (zero means no coinstraints), 1024x768""" ,required = true)
	@BeanProperty 
	var thumbDivArea: String  = "0x0"
	def withthumbDivArea(p:String):this.type ={ 	this.thumbDivArea = p; 	this }

}