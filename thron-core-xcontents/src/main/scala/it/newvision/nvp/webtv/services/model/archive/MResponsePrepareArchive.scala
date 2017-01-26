package it.newvision.nvp.webtv.services.model.archive
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePrepareArchive") 
@XmlType(name="MResponsePrepareArchive")
//#SWG#@ApiModel(description = """""")
class MResponsePrepareArchive extends MResponseArchive with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var downloadId: String =_
	def withdownloadId(p:String):this.type ={ 	this.downloadId = p; 	this }

}