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
@XmlRootElement(name="MTokenProtectionContentSettings") 
@XmlType(name="MTokenProtectionContentSettings")
//#SWG#@ApiModel(description = """""")
class MTokenProtectionContentSettings extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var document: MTokenProtectionContentTypeSettings =_
	def withdocument(p:MTokenProtectionContentTypeSettings):this.type ={ 	this.document = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var image: MTokenProtectionContentTypeSettings =_
	def withimage(p:MTokenProtectionContentTypeSettings):this.type ={ 	this.image = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var video: MTokenProtectionContentTypeSettings =_
	def withvideo(p:MTokenProtectionContentTypeSettings):this.type ={ 	this.video = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var pagelet: MTokenProtectionContentTypeSettings =_
	def withpagelet(p:MTokenProtectionContentTypeSettings):this.type ={ 	this.pagelet = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var audio: MTokenProtectionContentTypeSettings =_
	def withaudio(p:MTokenProtectionContentTypeSettings):this.type ={ 	this.audio = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbnail: MTokenProtectionContentTypeSettings =_
	def withthumbnail(p:MTokenProtectionContentTypeSettings):this.type ={ 	this.thumbnail = p; 	this }

}