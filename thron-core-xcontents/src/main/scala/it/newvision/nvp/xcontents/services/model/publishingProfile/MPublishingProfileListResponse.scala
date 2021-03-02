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
@XmlRootElement(name="MPublishingProfileListResponse") 
@XmlType(name="MPublishingProfileListResponse")
//#SWG#@ApiModel(description = """""")
class MPublishingProfileListResponse extends MResponsePublishingProfile with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var profiles: List[MPublishingProfileDetail] = new ArrayList[MPublishingProfileDetail]
	def withprofiles(p:List[MPublishingProfileDetail]):this.type ={ 	this.profiles = p; 	this }

}