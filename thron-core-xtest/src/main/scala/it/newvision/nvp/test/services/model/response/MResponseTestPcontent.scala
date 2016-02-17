package it.newvision.nvp.test.services.model.response
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseTestPcontent") 
@XmlType(name="MResponseTestPcontent")
//#SWG#@ApiModel(description = """""")
class MResponseTestPcontent extends MResponseTest with Serializable  {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var pcontentId: String =_
	def withpcontentId(p:String):this.type ={ 	this.pcontentId = p; 	this }

}