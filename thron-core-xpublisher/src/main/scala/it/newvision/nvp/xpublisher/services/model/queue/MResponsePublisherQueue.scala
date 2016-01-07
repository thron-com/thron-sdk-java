package it.newvision.nvp.xpublisher.services.model.queue
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpublisher.services.model.response.MResponsePublisher

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePublisherQueue") 
@XmlType(name="MResponsePublisherQueue")
//#SWG#@ApiModel(description = """""")
class MResponsePublisherQueue extends MResponsePublisher with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tasks: List[MTask] = new ArrayList[MTask]
	def withtasks(p:List[MTask]):MResponsePublisherQueue ={ 	this.tasks = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):MResponsePublisherQueue ={ 	this.totalResults = p; 	this }

}