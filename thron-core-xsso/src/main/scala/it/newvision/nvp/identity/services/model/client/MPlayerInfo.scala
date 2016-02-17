package it.newvision.nvp.identity.services.model.client
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.model.MPropertyPlayer

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MPlayerInfo") 
@XmlType(name="MPlayerInfo")
//#SWG#@ApiModel(description = """""")
class MPlayerInfo extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var clientId: String =_
	def withclientId(p:String):this.type ={ 	this.clientId = p; 	this }

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var playerProperties: MPropertyPlayer =_
	def withplayerProperties(p:MPropertyPlayer):this.type ={ 	this.playerProperties = p; 	this }

}