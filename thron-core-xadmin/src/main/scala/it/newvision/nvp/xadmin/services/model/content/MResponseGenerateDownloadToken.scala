package it.newvision.nvp.xadmin.services.model.content
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseGenerateDownloadToken") 
@XmlType(name="MResponseGenerateDownloadToken")
//#SWG#@ApiModel(description = """""")
class MResponseGenerateDownloadToken extends MResponsePublish with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var downloadToken: String =_
	def withdownloadToken(p:String):this.type ={ 	this.downloadToken = p; 	this }

}