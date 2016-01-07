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
@XmlRootElement(name="MWowzaStreamCredential") 
@XmlType(name="MWowzaStreamCredential")
//#SWG#@ApiModel(description = """""")
class MWowzaStreamCredential extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var streamId: String =_
	def withstreamId(p:String):MWowzaStreamCredential ={ 	this.streamId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var streamPassword: String =_
	def withstreamPassword(p:String):MWowzaStreamCredential ={ 	this.streamPassword = p; 	this }

	/**
	 * @param streamId : String
	 * @param streamPassword : String
	 * @return void
	*/
	//#SWG#@ApiModelProperty(hidden = true)
	@org.codehaus.jackson.annotate.JsonIgnore
	def this(streamId: String, 
			streamPassword: String){
		this()
		this.streamId = streamId
		this.streamPassword = streamPassword
	}

}