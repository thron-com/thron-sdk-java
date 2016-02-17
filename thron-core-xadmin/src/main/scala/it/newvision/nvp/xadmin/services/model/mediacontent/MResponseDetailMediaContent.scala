package it.newvision.nvp.xadmin.services.model.mediacontent
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xadmin.model.MMediaContent

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseDetailMediaContent") 
@XmlType(name="MResponseDetailMediaContent")
//#SWG#@ApiModel(description = """""")
class MResponseDetailMediaContent extends MResponseMediaContent with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var mediaContent: MMediaContent =_
	def withmediaContent(p:MMediaContent):this.type ={ 	this.mediaContent = p; 	this }

	/**
	 * total amount of space used by the content in CDN and in Repository (in Bytes)
	 */
	//#SWG#@ApiModelProperty(value = """total amount of space used by the content in CDN and in Repository (in Bytes)""")
	@BeanProperty 
	var mediaContentTotalSpace: Long  = 0L
	def withmediaContentTotalSpace(p:Long):this.type ={ 	this.mediaContentTotalSpace = p; 	this }

}