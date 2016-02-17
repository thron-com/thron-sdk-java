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
@XmlRootElement(name="MContentBody") 
@XmlType(name="MContentBody")
//#SWG#@ApiModel(description = """""")
class MContentBody extends Serializable {

	/**
	 * raw body source
	 */
	//#SWG#@ApiModelProperty(value = """raw body source""")
	@BeanProperty 
	var body: String =_
	def withbody(p:String):this.type ={ 	this.body = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var mimetype: String =_
	def withmimetype(p:String):this.type ={ 	this.mimetype = p; 	this }

}