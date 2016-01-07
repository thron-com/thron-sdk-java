package it.newvision.nvp.webtv.services.model.playlist
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

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbnailUrl: String =_
	def withthumbnailUrl(p:String):MThumbnailDetail ={ 	this.thumbnailUrl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbnailWidth: Integer =_
	def withthumbnailWidth(p:Integer):MThumbnailDetail ={ 	this.thumbnailWidth = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbnailHeight: Integer =_
	def withthumbnailHeight(p:Integer):MThumbnailDetail ={ 	this.thumbnailHeight = p; 	this }

}