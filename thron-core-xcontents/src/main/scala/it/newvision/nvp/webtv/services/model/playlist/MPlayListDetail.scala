package it.newvision.nvp.webtv.services.model.playlist
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayListDetail") 
@XmlType(name="MPlayListDetail")
//#SWG#@ApiModel(description = """""")
class MPlayListDetail extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):this.type ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var description: String =_
	def withdescription(p:String):this.type ={ 	this.description = p; 	this }

	/**
	 * DEPRECATED.
	 * summary of the content
	 */
	//#SWG#@ApiModelProperty(value = """DEPRECATED.
	//#SWGNL#summary of the content""" ,required = true)
	@BeanProperty 
	@Deprecated
	var excerpt: String =_
	@Deprecated
	def withexcerpt(p:String):this.type ={ 	this.excerpt = p; 	this }

}