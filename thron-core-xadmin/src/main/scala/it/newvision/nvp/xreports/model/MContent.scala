package it.newvision.nvp.xreports.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * select X from where staticUrls[1] ... or staticUrls[n] or services[1] or .....
 * services[n]
 */
@XmlRootElement(name="MContent") 
@XmlType(name="MContent")
//#SWG#@ApiModel(description = """select X from where staticUrls[1] ... or staticUrls[n] or services[1] or ..... services[n]""")
class MContent extends Serializable {

	/**
	 * xpublisher contentId
	 */
	//#SWG#@ApiModelProperty(value = """xpublisher contentId""" ,required = true)
	@BeanProperty 
	var pcontentId: String =_
	def withpcontentId(p:String):MContent ={ 	this.pcontentId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var contentName: String =_
	def withcontentName(p:String):MContent ={ 	this.contentName = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var staticUrls: List[String] = new ArrayList[String]
	def withstaticUrls(p:List[String]):MContent ={ 	this.staticUrls = p; 	this }

	@BeanProperty
	//#SWG#@ApiModelProperty(value = """""")
	var services: List[MServiceUrl] = new ArrayList[MServiceUrl]
	  def withservices(p:List[MServiceUrl]):MContent ={ 	this.services = p; 	this }

}