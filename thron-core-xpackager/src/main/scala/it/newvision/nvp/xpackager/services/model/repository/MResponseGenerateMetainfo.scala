package it.newvision.nvp.xpackager.services.model.repository
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGenerateMetainfo") 
@XmlType(name="MResponseGenerateMetainfo")
//#SWG#@ApiModel(description = """""")
class MResponseGenerateMetainfo extends MResponseRepository with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var metainfo: List[MMetaInfo] = new ArrayList[MMetaInfo]
	def withmetainfo(p:List[MMetaInfo]):MResponseGenerateMetainfo ={ 	this.metainfo = p; 	this }

}