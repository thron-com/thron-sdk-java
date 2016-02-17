package it.newvision.nvp.xpublisher.services.model.hosting
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseHostingFile") 
@XmlType(name="MResponseHostingFile")
//#SWG#@ApiModel(description = """""")
class MResponseHostingFile extends MResponseHosting with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var file: MResourceFile =_
	def withfile(p:MResourceFile):this.type ={ 	this.file = p; 	this }

}