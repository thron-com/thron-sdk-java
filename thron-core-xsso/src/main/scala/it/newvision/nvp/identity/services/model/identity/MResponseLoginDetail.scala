package it.newvision.nvp.identity.services.model.identity
import _root_.java.util._ 
import _root_.java.lang.{Integer,Boolean,Long,Double,Float,Short}  
//#SWG#import com.wordnik.swagger.annotations._ 
import _root_.scala.beans.BeanProperty 
import javax.xml.bind.annotation._ 
import it.newvision.nvp.identity.services.model.vusers.MVUserExt
import it.newvision.nvp.identity.services.model.vusers.MResponseVUser

/* ************************
*  GENERATED CLASS
*  DO NOT APPLY ANY CHANGES
****************************/
@XmlRootElement(name="MResponseLoginDetail") 
@XmlType(name="MResponseLoginDetail")
//#SWG#@ApiModel(description = """""")
class MResponseLoginDetail extends MResponseVUser with Serializable  {

	//#SWG#@ApiModelProperty(value = """""")
	@BeanProperty 
	var tokenId: String =_
	def withtokenId(p:String):MResponseLoginDetail ={ 	this.tokenId = p; 	this }

	/**
	 * return the vuser detail without the password information, for security reason.
	 */
	//#SWG#@ApiModelProperty(value = """return the vuser detail without the password information, for security reason.""")
	@BeanProperty 
	var userDetail: MVUserExt =_
	def withuserDetail(p:MVUserExt):MResponseLoginDetail ={ 	this.userDetail = p; 	this }

}