package it.newvision.nvp.xadmin.services.model.eventmanager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MStopRecordingParam") 
@XmlType(name="MStopRecordingParam")
//#SWG#@ApiModel(description = """""")
class MStopRecordingParam extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var application: String =_
	def withapplication(p:String):this.type ={ 	this.application = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var appInstance: String  = "_definst_"
	def withappInstance(p:String):this.type ={ 	this.appInstance = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var id: String =_
	def withid(p:String):this.type ={ 	this.id = p; 	this }

}