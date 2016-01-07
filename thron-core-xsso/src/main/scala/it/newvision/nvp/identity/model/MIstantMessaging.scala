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
@XmlRootElement(name="MIstantMessaging") 
@XmlType(name="MIstantMessaging")
//#SWG#@ApiModel(description = """""")
class MIstantMessaging extends Serializable {

	/**
	 * istant messaging id
	 */
	//#SWG#@ApiModelProperty(value = """istant messaging id""" ,required = true)
	@BeanProperty 
	var imId: String =_
	def withimId(p:String):MIstantMessaging ={ 	this.imId = p; 	this }

	/**
	 * possible values:
	 * GTALK
	 * AIM
	 * YAHOO
	 * SKYPE
	 * MSN
	 * ICQ
	 * JABBER
	 * ... custum value
	 */
	//#SWG#@ApiModelProperty(value = """possible values:
	//#SWGNL#GTALK
	//#SWGNL#AIM
	//#SWGNL#YAHOO
	//#SWGNL#SKYPE
	//#SWGNL#MSN
	//#SWGNL#ICQ
	//#SWGNL#JABBER
	//#SWGNL#... custum value""")
	@BeanProperty 
	var imType: String =_
	def withimType(p:String):MIstantMessaging ={ 	this.imType = p; 	this }

}