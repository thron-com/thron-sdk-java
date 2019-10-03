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
@XmlRootElement(name="MServerStreamCredential") 
@XmlType(name="MServerStreamCredential")
//#SWG#@ApiModel(description = """""")
class MServerStreamCredential extends Serializable {

	/**
	 * the ingestion URL used to know where connect the input stream
	 */
	//#SWG#@ApiModelProperty(value = """the ingestion URL used to know where connect the input stream""" ,required = true)
	@BeanProperty 
	var clientStreamUrl: String =_
	def withclientStreamUrl(p:String):this.type ={ 	this.clientStreamUrl = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var streamId: String =_
	def withstreamId(p:String):this.type ={ 	this.streamId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var streamPassword: String =_
	def withstreamPassword(p:String):this.type ={ 	this.streamPassword = p; 	this }

}