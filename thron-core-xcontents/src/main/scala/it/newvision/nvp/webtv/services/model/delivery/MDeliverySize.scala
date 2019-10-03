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

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var aspectRatio: String =_
	def withaspectRatio(p:String):this.type ={ 	this.aspectRatio = p; 	this }

	/**
	 * Used only for IMAGE contents
	 */
	//#SWG#@ApiModelProperty(value = """Used only for IMAGE contents""")
	@BeanProperty 
	var maxHeight: Integer =_
	def withmaxHeight(p:Integer):this.type ={ 	this.maxHeight = p; 	this }

	/**
	 * Used only for IMAGE contents
	 */
	//#SWG#@ApiModelProperty(value = """Used only for IMAGE contents""")
	@BeanProperty 
	var maxWidth: Integer =_
	def withmaxWidth(p:Integer):this.type ={ 	this.maxWidth = p; 	this }

}