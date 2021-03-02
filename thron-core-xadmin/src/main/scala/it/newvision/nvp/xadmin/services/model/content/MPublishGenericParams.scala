package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.version.MVersionNote

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPublishGenericParams") 
@XmlType(name="MPublishGenericParams")
//#SWG#@ApiModel(description = """""")
class MPublishGenericParams extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var additionalChannels: List[String] = new ArrayList[String]
	def withadditionalChannels(p:List[String]):this.type ={ 	this.additionalChannels = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var note: MVersionNote =_
	def withnote(p:MVersionNote):this.type ={ 	this.note = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var profileId: String =_
	def withprofileId(p:String):this.type ={ 	this.profileId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var sources: MContentAdminSourceOpt =_
	def withsources(p:MContentAdminSourceOpt):this.type ={ 	this.sources = p; 	this }

}