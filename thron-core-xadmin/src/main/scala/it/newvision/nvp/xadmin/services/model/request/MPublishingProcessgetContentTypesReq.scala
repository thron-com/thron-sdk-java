package it.newvision.nvp.xadmin.services.model.request
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.services.model.weebo.MFileNameList

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Request message for service JPublishingProcess.getContentTypes
 */
@XmlRootElement(name="MPublishingProcessgetContentTypesReq")
@XmlType(name="MPublishingProcessgetContentTypesReq")
//#SWG#@ApiModel(description = "Request message for service JPublishingProcess.getContentTypes")
class MPublishingProcessgetContentTypesReq extends Serializable {

	//#SWG#@ApiModelProperty(value = """""", required = true)
	@BeanProperty
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	/**
	 * list of file names to extract the corresponding content type
	 */
	//#SWG#@ApiModelProperty(value = """list of file names to extract the corresponding content type
	//#SWGNL#""", required = true)
	@BeanProperty
	var files: MFileNameList =_
	def withfiles(p:MFileNameList):this.type ={ 	this.files = p; 	this }

}