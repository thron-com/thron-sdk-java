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
@XmlRootElement(name="MPropertyView") 
@XmlType(name="MPropertyView")
//#SWG#@ApiModel(description = """""")
class MPropertyView extends Serializable {

	/**
	 * custom pages enabled in the admin console.
	 * 
	 * VIEW
	 * PLAY
	 * TALK
	 * MOVE
	 * VIEW_PLAYER
	 * COREWS
	 * SITEACCEL (servizio di site acceleration)
	 */
	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var customAdminPages: String  = ""
	def withcustomAdminPages(p:String):MPropertyView ={ 	this.customAdminPages = p; 	this }

	/**
	 * used to enable or disable the comunity services like comments and ratings.
	 */
	//#SWG#@ApiModelProperty(value = """used to enable or disable the comunity services like comments and ratings.""" ,required = true)
	@BeanProperty 
	var comunityServiceEnabled: Boolean  = false
	def withcomunityServiceEnabled(p:Boolean):MPropertyView ={ 	this.comunityServiceEnabled = p; 	this }

}