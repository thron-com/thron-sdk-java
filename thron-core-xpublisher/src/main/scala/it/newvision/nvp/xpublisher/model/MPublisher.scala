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
@XmlRootElement(name="MPublisher") 
@XmlType(name="MPublisher")
//#SWG#@ApiModel(description = """""")
class MPublisher extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):MPublisher ={ 	this.clientId = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var contents: List[MContent] = new ArrayList[MContent]
	  def withcontents(p:List[MContent]):MPublisher ={ 	this.contents = p; 	this }

}