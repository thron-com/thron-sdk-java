package it.newvision.nvp.webtv.services.model.delivery
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MDeliverySize") 
@XmlType(name="MDeliverySize")
//#SWG#@ApiModel(description = """""")
class MDeliverySize extends Serializable {

	/**
	 * Aspect ratio of content in delivery.
	 */
	//#SWG#@ApiModelProperty(value = """Aspect rateo of content in delivery.""")
	@BeanProperty 
	var aspectRatio: String =_
	def withaspectRatio(p:String):this.type ={ 	this.aspectRatio = p; 	this }

	/**
	 * Max width in pixel. This field is present only for contents of type IMAGE.
	 */
	//#SWG#@ApiModelProperty(value = """Max width in pixel. This field is present only for contents of type IMAGE.""")
	@BeanProperty 
	var maxWidth: Integer =_
	def withmaxWidth(p:Integer):this.type ={ 	this.maxWidth = p; 	this }

	/**
	 * Max height in pixel. This field is present only for contents of type IMAGE.
	 */
	//#SWG#@ApiModelProperty(value = """Max height in pixel. This field is present only for contents of type IMAGE.""")
	@BeanProperty 
	var maxHeight: Integer =_
	def withmaxHeight(p:Integer):this.type ={ 	this.maxHeight = p; 	this }

	/**
	 * Max size in byte for content in delivery.
	 */
	//#SWG#@ApiModelProperty(value = """Max size in byte for content in delivery.""")
	@BeanProperty
	var maxSize: Long =_
	def withmaxSize(p:Long):this.type ={ 	this.maxSize = p; 	this }

}