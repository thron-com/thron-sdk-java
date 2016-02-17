package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MThumbnailDetail") 
@XmlType(name="MThumbnailDetail")
//#SWG#@ApiModel(description = """""")
class MThumbnailDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var width: Integer =_
	def withwidth(p:Integer):this.type ={ 	this.width = p; 	this }

	/**
	 * value = 0 means that the height is proportional with the width size.
	 */
	//#SWG#@ApiModelProperty(value = """value = 0 means that the height is proportional with the width size.""" ,required = true)
	@BeanProperty 
	var height: Integer  = 0
	def withheight(p:Integer):this.type ={ 	this.height = p; 	this }

	/**
	 * L = Large,
	 * M= Medium,
	 * S= Small,
	 * O= Other
	 */
	//#SWG#@ApiModelProperty(value = """L = Large, 
	//#SWGNL#M= Medium, 
	//#SWGNL#S= Small, 
	//#SWGNL#O= Other""" ,required = true)
	@BeanProperty 
	var format: String =_
	def withformat(p:String):this.type ={ 	this.format = p; 	this }

}