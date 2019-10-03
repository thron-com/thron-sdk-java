package it.newvision.nvp.identity.model
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * Used to show in presentation (admin console) the channel description and the
 * information should be in multilanguage.
 */
@XmlRootElement(name="MChannelDescription") 
@XmlType(name="MChannelDescription")
//#SWG#@ApiModel(description = """Used to show in presentation (admin console) the channel description and the information should be in multilanguage.""")
class MChannelDescription extends Serializable {

	/**
	 * The channel description, used in the administration console. 
	 */
	//#SWG#@ApiModelProperty(value = """The channel description, used in the administration console. """ ,required = true)
	@BeanProperty 
	var channelDescription: String  = ""
	def withchannelDescription(p:String):this.type ={ 	this.channelDescription = p; 	this }

	/**
	 * The channel fancy name used in the administration console, to show as label
	 */
	//#SWG#@ApiModelProperty(value = """The channel fancy name used in the administration console, to show as label""" ,required = true)
	@BeanProperty 
	var channelShortName: String  = ""
	def withchannelShortName(p:String):this.type ={ 	this.channelShortName = p; 	this }

	/**
	 * en/it/ ....
	 */
	//#SWG#@ApiModelProperty(value = """en/it/ ....""" ,required = true)
	@BeanProperty 
	var locale: String =_
	def withlocale(p:String):this.type ={ 	this.locale = p; 	this }

}