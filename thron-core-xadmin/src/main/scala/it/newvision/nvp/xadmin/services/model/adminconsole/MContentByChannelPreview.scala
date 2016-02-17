package it.newvision.nvp.xadmin.services.model.adminconsole
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentByChannelPreview") 
@XmlType(name="MContentByChannelPreview")
//#SWG#@ApiModel(description = """""")
class MContentByChannelPreview extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var channelType: String =_
	def withchannelType(p:String):this.type ={ 	this.channelType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var pakageId: String =_
	def withpakageId(p:String):this.type ={ 	this.pakageId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var contents: List[MContentPreview] = new ArrayList[MContentPreview]
	def withcontents(p:List[MContentPreview]):this.type ={ 	this.contents = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var thumbnails: List[MContentPreview] = new ArrayList[MContentPreview]
	def withthumbnails(p:List[MContentPreview]):this.type ={ 	this.thumbnails = p; 	this }

}