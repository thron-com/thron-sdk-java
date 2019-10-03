package it.newvision.nvp.xcontents.services.model.export
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MVersionDetail") 
@XmlType(name="MVersionDetail")
//#SWG#@ApiModel(description = """""")
class MVersionDetail extends Serializable {

	/**
	 * Optional. External reference Id (repository file)
	 */
	//#SWG#@ApiModelProperty(value = """Optional. External reference Id (repository file)""")
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var mimetype: String =_
	def withmimetype(p:String):this.type ={ 	this.mimetype = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var text: String =_
	def withtext(p:String):this.type ={ 	this.text = p; 	this }

}