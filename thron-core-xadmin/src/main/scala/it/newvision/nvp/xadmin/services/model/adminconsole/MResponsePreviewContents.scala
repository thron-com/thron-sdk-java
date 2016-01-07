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
@XmlRootElement(name="MResponsePreviewContents") 
@XmlType(name="MResponsePreviewContents")
//#SWG#@ApiModel(description = """""")
class MResponsePreviewContents extends MResponsePreview with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var detail: List[MContentByChannelPreview] = new ArrayList[MContentByChannelPreview]
	def withdetail(p:List[MContentByChannelPreview]):MResponsePreviewContents ={ 	this.detail = p; 	this }

}