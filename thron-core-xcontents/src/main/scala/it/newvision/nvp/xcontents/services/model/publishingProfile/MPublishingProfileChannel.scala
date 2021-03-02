package it.newvision.nvp.xcontents.services.model.publishingProfile
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishingProfileChannel") 
@XmlType(name="MPublishingProfileChannel")
//#SWG#@ApiModel(description = """""")
class MPublishingProfileChannel extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var downloadAvailable: Boolean =_
	def withdownloadAvailable(p:Boolean):this.type ={ 	this.downloadAvailable = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var locales: List[MPublishingProfileChannelLocale] = new ArrayList[MPublishingProfileChannelLocale]
	def withlocales(p:List[MPublishingProfileChannelLocale]):this.type ={ 	this.locales = p; 	this }

}