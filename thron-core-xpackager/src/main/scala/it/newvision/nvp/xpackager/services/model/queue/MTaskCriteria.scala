package it.newvision.nvp.xpackager.services.model.queue
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MTaskCriteria") 
@XmlType(name="MTaskCriteria")
//#SWG#@ApiModel(description = """""")
class MTaskCriteria extends Serializable {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var clientId: List[String] = new ArrayList[String]
	def withclientId(p:List[String]):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var id: List[String] = new ArrayList[String]
	def withid(p:List[String]):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var siteName: String =_
	def withsiteName(p:String):this.type ={ 	this.siteName = p; 	this }

}