package it.newvision.nvp.xpackager.services.model.queue
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.packager.MResponsePackager

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponsePackagerQueue") 
@XmlType(name="MResponsePackagerQueue")
//#SWG#@ApiModel(description = """""")
class MResponsePackagerQueue extends MResponsePackager with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tasks: List[MTask] = new ArrayList[MTask]
	def withtasks(p:List[MTask]):this.type ={ 	this.tasks = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}