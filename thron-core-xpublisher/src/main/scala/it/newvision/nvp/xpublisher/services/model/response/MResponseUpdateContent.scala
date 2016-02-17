package it.newvision.nvp.xpublisher.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseUpdateContent") 
@XmlType(name="MResponseUpdateContent")
//#SWG#@ApiModel(description = """""")
class MResponseUpdateContent extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty @org.codehaus.jackson.annotate.JsonProperty("PContentId") 
	var pContentId: String =_
	def withpContentId(p:String):this.type ={ 	this.pContentId = p; 	this }

}