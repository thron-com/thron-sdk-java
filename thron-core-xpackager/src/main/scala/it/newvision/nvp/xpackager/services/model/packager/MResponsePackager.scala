package it.newvision.nvp.xpackager.services.model.packager
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.xpackager.services.model.msg.MEPackager
import it.newvision.nvp.xpackager.services.model.msg.MESSO

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
/**
 * generic response for xpackager services
 */
@XmlRootElement(name="MResponsePackager") 
@XmlType(name="MResponsePackager")
//#SWG#@ApiModel(description = """generic response for xpackager services""")
class MResponsePackager extends Serializable {

	//#SWG#@ApiModelProperty(value = """""" ,required = true)
	@BeanProperty 
	var resultCode: MEPackager =_
	def withresultCode(p:MEPackager):MResponsePackager ={ 	this.resultCode = p; 	this }

	/**
	 * single singn on response code.
	 */
	//#SWG#@ApiModelProperty(value = """single singn on response code.""" ,required = true)
	@BeanProperty 
	var ssoCode: MESSO =_
	def withssoCode(p:MESSO):MResponsePackager ={ 	this.ssoCode = p; 	this }

	/**
	 * error description detail when the resultCode is equals to ERROR
	 */
	//#SWG#@ApiModelProperty(value = """error description detail when the resultCode is equals to ERROR""" ,required = true)
	@BeanProperty 
	var errorDescription: String =_
	def witherrorDescription(p:String):MResponsePackager ={ 	this.errorDescription = p; 	this }

}