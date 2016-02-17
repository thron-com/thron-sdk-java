package it.newvision.nvp.identity.services.model.user
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MUserSummary") 
@XmlType(name="MUserSummary")
//#SWG#@ApiModel(description = """""")
class MUserSummary extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var username: String =_
	def withusername(p:String):this.type ={ 	this.username = p; 	this }

	/**
	 * user firstname and surname. Used in presentation
	 */
	//#SWG#@ApiModelProperty(value = """user firstname and surname. Used in presentation""" ,required = true)
	@BeanProperty 
	var fullname: String =_
	def withfullname(p:String):this.type ={ 	this.fullname = p; 	this }

}