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
@XmlRootElement(name="MPublishingProfileDetail") 
@XmlType(name="MPublishingProfileDetail")
//#SWG#@ApiModel(description = """""")
class MPublishingProfileDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var audioChannels: List[MPublishingProfileChannel] = new ArrayList[MPublishingProfileChannel]
	def withaudioChannels(p:List[MPublishingProfileChannel]):this.type ={ 	this.audioChannels = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var streamChannels: List[MPublishingProfileChannel] = new ArrayList[MPublishingProfileChannel]
	def withstreamChannels(p:List[MPublishingProfileChannel]):this.type ={ 	this.streamChannels = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var imageChannels: List[MPublishingProfileChannel] = new ArrayList[MPublishingProfileChannel]
	def withimageChannels(p:List[MPublishingProfileChannel]):this.type ={ 	this.imageChannels = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var pageletChannels: List[MPublishingProfileChannel] = new ArrayList[MPublishingProfileChannel]
	def withpageletChannels(p:List[MPublishingProfileChannel]):this.type ={ 	this.pageletChannels = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var status: MEPublishingProfileStatus =_
	def withstatus(p:MEPublishingProfileStatus):this.type ={ 	this.status = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var urlChannels: List[MPublishingProfileChannel] = new ArrayList[MPublishingProfileChannel]
	def withurlChannels(p:List[MPublishingProfileChannel]):this.type ={ 	this.urlChannels = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var genericDocumentChannels: List[MPublishingProfileChannel] = new ArrayList[MPublishingProfileChannel]
	def withgenericDocumentChannels(p:List[MPublishingProfileChannel]):this.type ={ 	this.genericDocumentChannels = p; 	this }

}