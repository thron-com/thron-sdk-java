package it.newvision.nvp.xplaylist.services.model.playlist
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MContentDetail") 
@XmlType(name="MContentDetail")
//#SWG#@ApiModel(description = """""")
class MContentDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):MContentDetail ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):MContentDetail ={ 	this.description = p; 	this }

	/**
	 * summary of the content
	 */
	//#SWG#@ApiModelProperty(value = """summary of the content""" ,required = true)
	@BeanProperty 
	var excerpt: String =_
	def withexcerpt(p:String):MContentDetail ={ 	this.excerpt = p; 	this }

}