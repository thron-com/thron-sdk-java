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
@XmlRootElement(name="MServerStreamInfo") 
@XmlType(name="MServerStreamInfo")
//#SWG#@ApiModel(description = """""")
class MServerStreamInfo extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var name: String =_
	def withname(p:String):MServerStreamInfo ={ 	this.name = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var isRecording: Boolean =_
	def withisRecording(p:Boolean):MServerStreamInfo ={ 	this.isRecording = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientStreamInMuxing: String =_
	def withclientStreamInMuxing(p:String):MServerStreamInfo ={ 	this.clientStreamInMuxing = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var beingPublished: Boolean =_
	def withbeingPublished(p:Boolean):MServerStreamInfo ={ 	this.beingPublished = p; 	this }

}