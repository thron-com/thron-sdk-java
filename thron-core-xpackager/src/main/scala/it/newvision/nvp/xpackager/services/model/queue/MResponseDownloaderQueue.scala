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
@XmlRootElement(name="MResponseDownloaderQueue") 
@XmlType(name="MResponseDownloaderQueue")
//#SWG#@ApiModel(description = """""")
class MResponseDownloaderQueue extends MResponsePackager with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tasks: List[MDownloaderTask] = new ArrayList[MDownloaderTask]
	def withtasks(p:List[MDownloaderTask]):this.type ={ 	this.tasks = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var totalResults: Integer =_
	def withtotalResults(p:Integer):this.type ={ 	this.totalResults = p; 	this }

}