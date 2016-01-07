package it.newvision.nvp.xpublisher.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MSubtitleFile") 
@XmlType(name="MSubtitleFile")
//#SWG#@ApiModel(description = """""")
class MSubtitleFile extends MSubtitle with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var localPath: String =_
	def withlocalPath(p:String):MSubtitleFile ={ 	this.localPath = p; 	this }

}