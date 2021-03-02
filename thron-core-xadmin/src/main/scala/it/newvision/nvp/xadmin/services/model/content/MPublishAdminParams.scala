package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MEContentType

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishAdminParams") 
@XmlType(name="MPublishAdminParams")
//#SWG#@ApiModel(description = """""")
class MPublishAdminParams extends MPublishGenericParams with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentOpt: MContentOpt =_
	def withcontentOpt(p:MContentOpt):this.type ={ 	this.contentOpt = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentType: MEContentType =_
	def withcontentType(p:MEContentType):this.type ={ 	this.contentType = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var playlistOpt: MPlaylistOpt =_
	def withplaylistOpt(p:MPlaylistOpt):this.type ={ 	this.playlistOpt = p; 	this }

}